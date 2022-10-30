public abstract class Transport {

    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    private String fuelType;

    private static final String DEFAULT_VALUE = "default";

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuelType) {
        this.brand = ValidationUtils.validOrDefault(brand, DEFAULT_VALUE);
        this.model = ValidationUtils.validOrDefault(model, DEFAULT_VALUE);
        this.productionYear = productionYear > 0 ? productionYear : 2010;
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, DEFAULT_VALUE);
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelType(fuelType);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, DEFAULT_VALUE);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 200;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = ValidationUtils.validOrDefault(fuelType, DEFAULT_VALUE);
    }
}
