import com.sun.jdi.connect.Transport;

import java.util.*;
import java.util.Queue;
import java.util.Random;


public class Main {


    public static void main(String[] args) {
        //ДЗ 1, 2-1
        Mechanic<Car> ann = new Mechanic<Car>("Анна", "NewUnited", "Легковые_авто");
        Mechanic<CargoCar> vano = new Mechanic<>("Vano", "NewUnited", "Грузовые_авто");
        Mechanic<Bus> robert = new Mechanic<>("robert", "NewUnited", "Автобусы_авто");

        Sponsor gazprom = new Sponsor("ГазПром", 3_000_000);
        Sponsor tinkoff = new Sponsor("Тинькофф", 6_000_000);

        Car lada = new Car("lada","Granta",1.7);
        lada.addDriver(new DriverB("Вася",2, lada));
        DriverB driverB = new DriverB("Вася",2, lada);
        dataCar(lada, driverB, ann, gazprom);
        lada.addDriver(driverB);
        lada.addMechanic(ann);
        lada.addSponsor(gazprom, tinkoff);

        Car kia = new Car("kia","Sportage", 2.4);
        DriverB driverB2 = new DriverB("Коля",3, kia);
        dataCar2(kia, driverB2, ann, gazprom);
        kia.addDriver(new DriverB("Коля",3, kia));
        kia.addMechanic(ann);
        kia.addSponsor(gazprom, tinkoff);


        Bus ferrari = new Bus("ferrari", "F-500", 3.4);
        DriverD driverD = new DriverD("Маша",5, ferrari);
        dataCar3(ferrari, driverD, robert, gazprom);
        ferrari.addDriver(new DriverD("Маша",10, ferrari));
        ferrari.addMechanic(robert);
        ferrari.addSponsor(gazprom, tinkoff);

        CargoCar mercedes = new CargoCar("mercedes", "SCLK", 4.1);
        DriverC driverC = new DriverC("Даша",10, mercedes);
        dataCar4(mercedes, driverC, vano, tinkoff);
        mercedes.addDriver(new DriverC("Даша",10, mercedes));
        mercedes.addMechanic(vano);
        mercedes.addSponsor(gazprom, tinkoff);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addCargoCar(mercedes);
        serviceStation.service();
        serviceStation.service();

        //ДЗ 2-2

        System.out.println("\n");
        Supermarket supermarket = new Supermarket(Supermarket.getNAMES());
        System.out.println(supermarket.getNAMES());
        System.out.println(supermarket.getFirstRegistry());
        System.out.println(supermarket.getSecondRegistry());

        //ДЗ 2-3 in Bilist class

    }

    private static void dataCar(Car lada, DriverB driverB, Mechanic ann, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverB);
        System.out.println(lada);
        System.out.println(ann);
        System.out.println(gazprom);
    }

    public  static void dataCar2(Car kia, DriverB driverB2, Mechanic ann, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverB2);
        System.out.println(kia);
        System.out.println(ann);
        System.out.println(gazprom);
    }

    private static void dataCar3(Bus ferrari, DriverD driverD, Mechanic robert, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverD);
        System.out.println(ferrari);
        System.out.println(robert);
        System.out.println(gazprom);
    }

    private static void dataCar4(CargoCar mercedes, DriverC driverC, Mechanic vano, Sponsor tinkoff) {
        System.out.print("\n");
        System.out.println(driverC);
        System.out.println(mercedes);
        System.out.println(vano);
        System.out.println(tinkoff);
    }
    private static void Date(Transport transport) {

    }


}