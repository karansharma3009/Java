package wynk;

public interface HomePageConstants {

    String search = "(//a[@class=\"nav-link\"])[2]/i";
    String secondSearch = "//input[@type='search']";
    String searchButton = "//button[@class='button button-theme btn-search  btn-search--active']";
    String resultsFirst = "(//i[@class='icon40 icon-player-play'])[1]";
    String playOnSecondPage = "//i[@class='center-control-icon-size icon-player-play']";
    String enterMobile ="//input[@type=\"number\"]";
    String continueButton = "//div[@class=\"form-button\"]/button";
    String enterOTP1 = "(//input[@type=\"number\"])[1]";
    String enterOTP2 = "(//input[@type=\"number\"])[2]";
    String enterOTP3 = "(//input[@type=\"number\"])[3]";
    String enterOTP4 = "(//input[@type=\"number\"])[4]";
    String verify= "//button[contains(text(),'VERIFY')]";
    String popUpClose = "//i[@class='icon24 icon-close']";
    String HomePage = "//i[@class='icon30 icon-home']";

}
