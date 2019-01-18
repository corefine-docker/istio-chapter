package org.corefine.istio.demo.chapter;

import java.util.Date;

public class ContentVo {
    private Long id;
    private String content;
    private String type;
    private String version;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public ContentVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ContentVo setContent(String content) {
        this.content = content;
        return this;
    }

    public String getType() {
        return type;
    }

    public ContentVo setType(String type) {
        this.type = type;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ContentVo setVersion(String version) {
        this.version = version;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ContentVo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}