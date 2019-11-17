
package wynk.wynk.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentAction {

    @SerializedName("meta")
    @Expose
    private Meta_ meta;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("pageId")
    @Expose
    private String pageId;
    @SerializedName("t")
    @Expose
    private String t;
    @SerializedName("st")
    @Expose
    private String st;
    @SerializedName("sTy")
    @Expose
    private String sTy;
    @SerializedName("packageId")
    @Expose
    private String packageId;
    @SerializedName("listingType")
    @Expose
    private String listingType;
    @SerializedName("url")
    @Expose
    private String url;

    public Meta_ getMeta() {
        return meta;
    }

    public void setMeta(Meta_ meta) {
        this.meta = meta;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getSTy() {
        return sTy;
    }

    public void setSTy(String sTy) {
        this.sTy = sTy;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getListingType() {
        return listingType;
    }

    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
