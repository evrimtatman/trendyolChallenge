package com.trendyol;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    BasePage(){
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
     String URL="www.trendyol.com";
    }

    SelenideElement findByCss(String css){ return $(By.cssSelector(css)); }
    SelenideElement findByID(String id){ return $(By.id(id)); }
    ElementsCollection allByCss(String css){
        return $$(By.cssSelector(css));
    }
    SelenideElement findByText(String text){return $(By.partialLinkText(text));}

}