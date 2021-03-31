package com.trendyol;

import org.testng.annotations.Test;

public class TrendyolTest extends BasePage {
    @Test
    public void trendyolTest() throws InterruptedException {

        TrendyolLoginPage homePage = new TrendyolLoginPage();
        ProductSelectPage productPage = new ProductSelectPage();
        String prod_name="Beyaz Airpods I12 Şarj Üniteli Bluetooth 5.0 Kulaklık";
        homePage.goToPage();
        homePage.closePopup();
        //homePage.addNewUser("fsa28762@eoopy.com","1234qwe");
        homePage.login("fsa28762@eoopy.com","1234qwe");
        productPage.hoverItemList("ELEKTRONİK");
        productPage.goToProduct();
        productPage.addToChart(prod_name);



    }


}
