
package wynk.wynk.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetLayoutAPIResponse{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("contents")
    @Expose
    private List<Content> contents = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contentState")
    @Expose
    private String contentState;
    @SerializedName("format")
    @Expose
    private Format format;
    @SerializedName("railRefType")
    @Expose
    private String railRefType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentState() {
        return contentState;
    }

    public void setContentState(String contentState) {
        this.contentState = contentState;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getRailRefType() {
        return railRefType;
    }

    public void setRailRefType(String railRefType) {
        this.railRefType = railRefType;
    }

}
