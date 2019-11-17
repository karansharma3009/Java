
package wynk.wynk.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Format {

    @SerializedName("lsTy")
    @Expose
    private String lsTy;
    @SerializedName("showAll")
    @Expose
    private Boolean showAll;
    @SerializedName("ty")
    @Expose
    private String ty;
    @SerializedName("action")
    @Expose
    private Action action;
    @SerializedName("contentAction")
    @Expose
    private ContentAction contentAction;
    @SerializedName("t")
    @Expose
    private String t;
    @SerializedName("tc")
    @Expose
    private Integer tc;
    @SerializedName("lds")
    @Expose
    private List<Object> lds = null;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("hIcon")
    @Expose
    private String hIcon;
    @SerializedName("adId")
    @Expose
    private String adId;
    @SerializedName("tId")
    @Expose
    private List<String> tId = null;
    @SerializedName("packageId")
    @Expose
    private String packageId;
    @SerializedName("row")
    @Expose
    private Integer row;
    @SerializedName("col")
    @Expose
    private Integer col;
    @SerializedName("bgImgUrl")
    @Expose
    private String bgImgUrl;
    @SerializedName("scheduleUrl")
    @Expose
    private String scheduleUrl;
    @SerializedName("lt")
    @Expose
    private String lt;

    public String getLsTy() {
        return lsTy;
    }

    public void setLsTy(String lsTy) {
        this.lsTy = lsTy;
    }

    public Boolean getShowAll() {
        return showAll;
    }

    public void setShowAll(Boolean showAll) {
        this.showAll = showAll;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public ContentAction getContentAction() {
        return contentAction;
    }

    public void setContentAction(ContentAction contentAction) {
        this.contentAction = contentAction;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public Integer getTc() {
        return tc;
    }

    public void setTc(Integer tc) {
        this.tc = tc;
    }

    public List<Object> getLds() {
        return lds;
    }

    public void setLds(List<Object> lds) {
        this.lds = lds;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getHIcon() {
        return hIcon;
    }

    public void setHIcon(String hIcon) {
        this.hIcon = hIcon;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public List<String> getTId() {
        return tId;
    }

    public void setTId(List<String> tId) {
        this.tId = tId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl = bgImgUrl;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

}
