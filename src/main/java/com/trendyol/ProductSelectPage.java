package com.trendyol;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

public class ProductSelectPage extends BasePage {
    public static String ITEM_LIST = "#main-nav";
    public static String HOVER_ITEM = "li:nth-of-type(9) > .category-header";
    public static String ADDED_ITEM ="[href='\\/kulaklik-x-c92']";
    public static String BASKET = "//div[@class='add-to-bs-tx']";
    public static String PRODUCT_BOTUQUE = "img[alt='Beyaz Eşya Fırsatları']";



    public void clickItemList(SelenideElement term) {
        SelenideElement elem = findByCss(ITEM_LIST);

    }

    public void hoverItemList(String TabName) throws InterruptedException {
        sleep(3000);
        $(HOVER_ITEM).hover();

    }


    public void goToProduct() {
        findByCss(ADDED_ITEM).click();


    }

    public void addToChart(String prodName) {

        SelenideElement elem = $(By.cssSelector("[title^='"+prodName+"']"));
        elem.click();
    }

}
