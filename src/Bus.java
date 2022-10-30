public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuelType) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelType);
    }
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ". Год выпуска - " + getProductionYear() + ". Страна производства - "
                + getProductionCountry() + ". Цвет - " + getColor() + ". Скорость передвижения - " + getMaxSpeed() + " км/ч. Тип топлива - "
                + getFuelType() + ".";
    }

    @Override
    public void refill() {
        if (getFuelType() == "бензин") {
            System.out.println("Автобус нужно заправлять бензином.");
        }
        if (getFuelType() == "дизельное топливо") {
            System.out.println("Автобус нужно заправлять дизельным топливом.");
        }
    }
}
