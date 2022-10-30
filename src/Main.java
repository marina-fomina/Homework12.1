import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Класс "Автомобиль"
        System.out.println("Класс Автомобиль");

        Car lada = new Car("Lada", "Granta", 0,"жёлтый", 0, "Россия",
                "универсал", 5, "механическая", "А521ВХ963", false, 180,
                "бензин", new Car.Key("нет удалённого запуска двигателя", "нет бесключевого доступа"),
                new Car.Insurance(LocalDate.now().plusMonths(4), 1_000, "125367854"));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020,
                null, "седан", 5, "автоматическая", "У633АХ458",
                true, 250, "бензин", new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1_500, "569852310"));
        Car bmw = new Car("BMW", "Z8", 3.0, " ", 2021, "Германия",
                "родстер", 2, "автоматическая", "Е313МТ785", false, 260,
                "бензин", new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(2), 2_000, "854632107"));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "внедорожник", 5, "механическая", "Т846УУ124",
                true, 200, "дизельное топливо", new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(1), 1_500, "741258963"));
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "седан", 5, "автоматическая", "М664АА741",
                true, 210, "дизельное топливо", new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(6), 2_000, "652300487"));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        lada.refill();

        // Класс "Поезд"
        System.out.println(" ");
        System.out.println("Класс Поезд");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null,
                301, "Белорусский вокзал", "Минск-Пассажирский", 3500, 11,
                "6 часов и 50 минут", "дизельное топливо");
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null,
                270, "Ленинградский вокзал", "Ленинград-Пассажирский", 1700, 8,
                "8 часов и 20 минут", "дизельное топливо");
        System.out.println(lastochka);
        System.out.println(leningrad);
        lastochka.refill();

        // Класс "Автобус"
        System.out.println(" ");
        System.out.println("Класс Автобус");
        Bus scania = new Bus("Scania", "Higer A80", 2018, "Швеция", "белый",
                100, "бензин");
        Bus maz = new Bus("МАЗ", "251", 2015, "Беларусь", "синий",
                120, "дизельное топливо");
        System.out.println(scania);
        System.out.println(maz);
        scania.refill();
    }
}