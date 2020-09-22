package Furniture;

public abstract class Furniture {

    private String manufacturer;
    private int price;
    private String material;

    public Furniture(String manufacturer, int price, String material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String... args){
        Furniture FurnitureTable = new FurnitureTable("Galereya mebeli", 23000, "dub");
        {
            System.out.println("Proisvoditel: " + FurnitureTable.getManufacturer());
            System.out.println("Stoimost: " + FurnitureTable.getPrice());
            System.out.println("Material: " + FurnitureTable.getMaterial());
        }
        Furniture FurnitureCupboard = new FurnitureCupboard("Exspress Ofis", 73000, "dub");
        {
            System.out.println("Proisvoditel: " + FurnitureCupboard.getManufacturer());
            System.out.println("Stoimost: " + FurnitureCupboard.getPrice());
            System.out.println("Material: " + FurnitureCupboard.getMaterial());
        }
    }
}
