
package wynk.wynk.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ {

    @SerializedName("playableContentId")
    @Expose
    private String playableContentId;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("cpId")
    @Expose
    private String cpId;
    @SerializedName("sourceName")
    @Expose
    private String sourceName;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("cardTitle")
    @Expose
    private String cardTitle;
    @SerializedName("playingContentId")
    @Expose
    private String playingContentId;

    public String getPlayableContentId() {
        return playableContentId;
    }

    public void setPlayableContentId(String playableContentId) {
        this.playableContentId = playableContentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getPlayingContentId() {
        return playingContentId;
    }

    public void setPlayingContentId(String playingContentId) {
        this.playingContentId = playingContentId;
    }

}
