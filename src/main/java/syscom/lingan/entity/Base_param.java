package syscom.lingan.entity;

import java.io.Serializable;

public class Base_param implements Serializable {
    private String tag;
    private String content_zh_tw;

    public Base_param() {
    }

    public Base_param(String tag, String content_zh_Tw) {
        this.tag = tag;
        this.content_zh_tw = content_zh_Tw;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent_zh_Tw() {
        return content_zh_tw;
    }

    public void setContent_zh_Tw(String content_zh_Tw) {
        this.content_zh_tw = content_zh_Tw;
    }

    @Override
    public String toString() {
        return "Base_param{" +
                "tag='" + tag + '\'' +
                ", content_zh_Tw='" + content_zh_tw + '\'' +
                '}';
    }
}
