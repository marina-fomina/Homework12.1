import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private final String remoteEngineStart;
        private final String accessWithoutKey;

        public Key(String remoteEngineStart, String accessWithoutKey) {
            this.remoteEngineStart = ValidationUtils.validOrDefault(remoteEngineStart, DEFAULT_VALUE);
            this.accessWithoutKey = ValidationUtils.validOrDefault(accessWithoutKey, DEFAULT_VALUE);
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final int price;
        private final String number;

        public Insurance(LocalDate validUntil, int price, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.price = Math.max(price, 1_000);
            this.number = ValidationUtils.validOrDefault(number, DEFAULT_VALUE);
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }
    }

    private double engineVolume;

    private static final String DEFAULT_VALUE = "default";
    private final String bodyType;

    private final int seatsNumber;

    private String transmission;

    private String registrationNumber;

    private boolean winterTyres;

    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String bodyType, int seatsNumber, String transmission, String registrationNumber, boolean winterTyres, int maxSpeed,
               String fuelType, Key key, Insurance insurance) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelType);
        setEngineVolume(engineVolume);
        this.bodyType = ValidationUtils.validOrDefault(bodyType, DEFAULT_VALUE);
        this.seatsNumber = seatsNumber > 0 ? seatsNumber : 4;
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setWinterTyres(winterTyres);
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + " " + getProductionYear() + " года выпуска. Страна сборки - " + getProductionCountry() +
                ". Цвет кузова - " + getColor() + ". Объем двигателя - " + engineVolume + " литра. Тип кузова - " + bodyType +
                ". Количество мест - " + seatsNumber + ". Коробка передач - " + transmission + ". Регистрационный номер - " +
                registrationNumber + ". Установлена зимняя резина - " + winterTyres + ". Максимальная скорость - " + getMaxSpeed() +
                ". Тип топлива - " + getFuelType() + ".";
    }

    @Override
    public void refill() {
        if (getFuelType() == "бензин") {
            System.out.println("Автомобиль нужно заправлять бензином.");
        }
        if (getFuelType() == "дизельное топливо") {
            System.out.println("Автомобиль нужно заправлять дизельным топливом.");
        }
        if (getFuelType() == "электрокар") {
            System.out.println("Автомобиль нужно заряжать на специальных электропарковках.");
        }
    }

    public void setSeasonTyres() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth <= 3 || currentMonth >= 11 != this.winterTyres) {
            System.out.println("Нужно поменять резину.");
        } else {
            System.out.println("Сезонные шины установлены.");
        }

    }

    public boolean checkRegistrationNumber() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char [] registrationNumberChars = this.registrationNumber.toCharArray();
        return  isNumberLetter(registrationNumberChars[0]) && isNumber(registrationNumberChars[1])
                && isNumber(registrationNumberChars[2]) && isNumber(registrationNumberChars[3])
                && isNumberLetter(registrationNumberChars[4]) && isNumberLetter(registrationNumberChars[5])
                && isNumber(registrationNumberChars[6]) && isNumber(registrationNumberChars[7])
                && isNumber(registrationNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.validOrDefault(transmission, DEFAULT_VALUE);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = ValidationUtils.validOrDefault(registrationNumber, DEFAULT_VALUE);
    }

    public boolean getWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
