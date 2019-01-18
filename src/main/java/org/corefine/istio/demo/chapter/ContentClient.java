package org.corefine.istio.demo.chapter;

import org.corefine.common.feign.FeignClient;

import java.util.List;

import feign.Param;
import feign.RequestLine;

@FeignClient("content")
public interface ContentClient {
    @RequestLine("GET /content/{id}")
    ContentVo get(@Param("id") Long id);

    @RequestLine("GET /content/list/{type}")
    List<ContentVo> list(@Param("type") String type);
}
