
package wynk.wynk.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("packageId")
    @Expose
    private String packageId;
    @SerializedName("listingType")
    @Expose
    private String listingType;
    @SerializedName("t")
    @Expose
    private String t;
    @SerializedName("st")
    @Expose
    private String st;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("contentId")
    @Expose
    private String contentId;
    @SerializedName("seriesId")
    @Expose
    private String seriesId;
    @SerializedName("pageId")
    @Expose
    private String pageId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("sTy")
    @Expose
    private String sTy;
    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("ty")
    @Expose
    private String ty;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSTy() {
        return sTy;
    }

    public void setSTy(String sTy) {
        this.sTy = sTy;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

}
