package patterns.TempalteMethod;

import patterns.pageObjects.pages.ManPage;

public class MansShop extends Shop {

    private ManPage manPage;

    public MansShop(){
        manPage = new ManPage();
    }

    @Override
    public void selectProduct(String product) {

    }

    @Override
    public void selectSection(String section) {
        manPage.getDesiredSectionItem(section).click();
    }
}
