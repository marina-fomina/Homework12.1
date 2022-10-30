public class Train extends Transport {
    private int price;
    private String tripTime;
    private String departureStation;
    private String arrivalStation;
    private int carriageNumber;

    private static final String DEFAULT_VALUE = "default";

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 String departureStation, String arrivalStation, int price, int carriageNumber, String tripTime, String fuelType) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelType);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setPrice(price);
        setCarriageNumber(carriageNumber);
        setTripTime(tripTime);
    }

    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ". Год выпуска - " + getProductionYear() + ". Страна производства - "
                + getProductionCountry() + ". Скорость передвижения - " + getMaxSpeed() + " км/ч. Станция отправления - " + departureStation
                + ". Станция прибытия - " + arrivalStation + ". Цена поездки - " + price + " рублей. В поезде " + carriageNumber + " вагонов. " +
                "Время в пути - " + tripTime + ". Тип топлива - " + getFuelType() + ".";
    }

    @Override
    public void refill() {
        System.out.println("Поезд нужно заправлять дизельным топливом.");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price > 0 ? price : 2100;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = ValidationUtils.validOrDefault(tripTime, DEFAULT_VALUE);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, DEFAULT_VALUE);
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = ValidationUtils.validOrDefault(arrivalStation, DEFAULT_VALUE);
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber > 0 ? carriageNumber : 10;
    }
}
