package itog;

import java.util.Objects;

public class Laptop {
    private String firm;
    private String CPU;
    private String videoCard;
    private String color;
    private String countryOfManufacture;
    private String operatingSystem;
    private int RAM;
    private int hardDrive;
    private double screenDiagonal;
    private double battery;
    private int yearOfManufacture;
    private int price;
    private String model;

    public Laptop(String firm, String CPU, String videoCard, String color, String countryOfManufacture, String model, int RAM, int hardDrive, double screenDiagonal, double battery, int yearOfManufacture, int price, String operatingSystem) {
        this.firm = firm;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.color = color;
        this.countryOfManufacture = countryOfManufacture;
        this.RAM = RAM;
        this.model = model;
        this.hardDrive = hardDrive;
        this.screenDiagonal = screenDiagonal;
        this.battery = battery;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.operatingSystem = operatingSystem;
    }

    public Laptop(String firm, String CPU, String videoCard, String color, String countryOfManufacture, String model, int RAM, int hardDrive, double screenDiagonal, double battery, int yearOfManufacture, int price) {
        this.firm = firm;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.color = color;
        this.countryOfManufacture = countryOfManufacture;
        this.RAM = RAM;
        this.model = model;
        this.hardDrive = hardDrive;
        this.screenDiagonal = screenDiagonal;
        this.battery = battery;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.operatingSystem = "Не установлена";
    }

    public String getFirm() {
        return firm;
    }

    public String getCPU() {
        return CPU;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getColor() {
        return color;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public double getBattery() {
        return battery;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Ноутбук - " + model + "\n"
                + "Фирма - " + firm + "\n"
                + "Процессор - " + CPU + "\n"
                + "Видеокарта - " + videoCard + "\n"
                + "Цвет - " + color + "\n"
                + "Страна изготовления - " + countryOfManufacture + "\n"
                + "Оперативная память - " + RAM + " гб.\n"
                + "Объем жесткого диска - " + hardDrive + " гб.\n"
                + "Диагональ экрана - " + screenDiagonal + " д.\n"
                + "Батарея - " + battery + " Вт*ч\n"
                + "Год изготовления - " + yearOfManufacture + " г.\n"
                + "Операционная система - " + operatingSystem + "\n"
                + "Цена - " + price + "р.";
    }

    @Override
    public boolean equals(Object l) {
        if (this == l) {
            return true;
        }
        if (l == null || getClass() != l.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) l;
        return firm.equals(laptop.firm) &&
                CPU.equals(laptop.CPU) &&
                videoCard.equals(laptop.videoCard) &&
                color.equals(laptop.color) &&
                countryOfManufacture.equals(laptop.countryOfManufacture) &&
                RAM == laptop.RAM &&
                hardDrive == laptop.hardDrive &&
                screenDiagonal == laptop.screenDiagonal &&
                battery == laptop.battery &&
                yearOfManufacture == laptop.yearOfManufacture &&
                price == laptop.price &&
                operatingSystem.equals(laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firm, CPU, videoCard, color, countryOfManufacture, RAM, hardDrive, screenDiagonal, battery,
                yearOfManufacture, price, operatingSystem);
    }
}