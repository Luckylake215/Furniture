package Furniture;

public class FurnitureCupboard extends Furniture{

    private int height;

    public FurnitureCupboard(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public FurnitureCupboard(String manufacturer, int price, String material, int height) {
        super(manufacturer, price, material);
        this.height = height;
    }

    public FurnitureCupboard(int price, String material, int height) {
        super(material, price, material);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
