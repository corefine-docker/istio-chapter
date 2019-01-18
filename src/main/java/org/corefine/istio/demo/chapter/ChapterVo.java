package org.corefine.istio.demo.chapter;

import java.util.List;

public class ChapterVo {
    private Long id;
    private String name;
    private String version;
    private List<ContentVo> contents;

    public Long getId() {
        return id;
    }

    public ChapterVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ChapterVo setName(String name) {
        this.name = name;
        return this;
    }

    public List<ContentVo> getContents() {
        return contents;
    }

    public ChapterVo setContents(List<ContentVo> contents) {
        this.contents = contents;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ChapterVo setVersion(String version) {
        this.version = version;
        return this;
    }
}