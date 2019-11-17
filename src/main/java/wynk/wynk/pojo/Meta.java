
package wynk.wynk.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("serviceId")
    @Expose
    private String serviceId;
    @SerializedName("actionType")
    @Expose
    private String actionType;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("cpId")
    @Expose
    private String cpId;
    @SerializedName("isFeedbackURL")
    @Expose
    private String isFeedbackURL;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("cardCategory")
    @Expose
    private String cardCategory;
    @SerializedName("actionButtonTitle")
    @Expose
    private String actionButtonTitle;
    @SerializedName("dismissButtonTitle")
    @Expose
    private String dismissButtonTitle;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getIsFeedbackURL() {
        return isFeedbackURL;
    }

    public void setIsFeedbackURL(String isFeedbackURL) {
        this.isFeedbackURL = isFeedbackURL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public void setCardCategory(String cardCategory) {
        this.cardCategory = cardCategory;
    }

    public String getActionButtonTitle() {
        return actionButtonTitle;
    }

    public void setActionButtonTitle(String actionButtonTitle) {
        this.actionButtonTitle = actionButtonTitle;
    }

    public String getDismissButtonTitle() {
        return dismissButtonTitle;
    }

    public void setDismissButtonTitle(String dismissButtonTitle) {
        this.dismissButtonTitle = dismissButtonTitle;
    }

}
