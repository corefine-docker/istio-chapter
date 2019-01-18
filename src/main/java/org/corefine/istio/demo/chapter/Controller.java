package org.corefine.istio.demo.chapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("chapter")
public class Controller {
    @Autowired
    private ContentClient contentClient;
    @Value("${chapter.version}")
    private String version;

    @GetMapping("{id}")
    public Object get(@PathVariable Long id) {
        return getChapter(id, null);
    }

    @GetMapping("list/{type}")
    public Object list(@PathVariable String type) {
        List<ChapterVo> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(getChapter(null, type));
        }
        return list;
    }

    private ChapterVo getChapter(Long id, String type) {
        List<ContentVo> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            if (type == null) {
                list.add(contentClient.get((long) i));
            } else {
                list.addAll(contentClient.list(type));
            }
        }
        return new ChapterVo().setContents(list).setId(id).setName("chapter " + id).setVersion(version);
    }
}
