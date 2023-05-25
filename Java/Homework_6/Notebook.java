package Homework_6;

public class Notebook {
    private String brand;
    private int RAM;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int RAM, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.RAM = RAM;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
