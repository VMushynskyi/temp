package patterns.TempalteMethod;

public abstract class Shop {
    public final void choosing(String sectionName, String productName){
        selectSection(sectionName);
        selectProduct(productName);
    }

    public abstract void selectProduct(String productName);
    public abstract void selectSection(String sectionName);
}
