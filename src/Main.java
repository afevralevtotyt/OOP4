import driver.BusDriver;
import driver.PassangerCarDriver;
import driver.TruckDriver;
import transport.Bus;
import transport.PassangerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        PassangerCar lexusGX300 = new PassangerCar("Lexus", "GX300", 3.0);
        PassangerCar toyotaCorolla = new PassangerCar("Toyota", "Corolla", 1.8);
        PassangerCar nissanJuke = new PassangerCar("Nissan", "Juke", 2.0);
        PassangerCar hondaCivic = new PassangerCar("Honda", "Civic", 1.8);
        Truck kamaz = new Truck("КАМАЗ", "03-10", 5.7);
        Truck volvo = new Truck("Volvo", "M10", 6.8);
        Truck mercedes = new Truck("Mercedes", "GOGG", 8.0);
        Truck bmw = new Truck("BMW", "X1000", 10.0);
        Bus paz = new Bus("ПАЗ","ТТКК", 5.0);
        Bus zaz = new Bus("ЗАЗ", "РКК0", 5.2);
        Bus mercedesViano = new Bus("Mercedes","Viano", 3.0);
        Bus kia = new Bus("KIA", "transport.Bus", 5.0);

        System.out.println(lexusGX300);
        System.out.println(toyotaCorolla);
        System.out.println(nissanJuke);
        System.out.println(hondaCivic);
        System.out.println(kamaz);
        System.out.println(volvo);
        System.out.println(mercedes);
        System.out.println(bmw);
        System.out.println(paz);
        System.out.println(zaz);
        System.out.println(mercedesViano);
        System.out.println(kia);

        BusDriver<Bus> fedor=new BusDriver<>("Иванов Федор Никитич", true, 10, zaz);
        fedor.refuel(zaz);
        PassangerCarDriver<PassangerCar> dmitry =new PassangerCarDriver<>("Петров Дмитрий Анатольевич", true, 22, lexusGX300);
        dmitry.refuel(lexusGX300);
        TruckDriver<Truck> mike = new TruckDriver<>("Михаил Иванович Ломоносов", true, 19, volvo);
        System.out.println(mike);
    }}