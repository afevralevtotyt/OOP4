import driver.BusDriver;
import driver.Driver;
import driver.PassengerCarDriver;
import driver.TruckDriver;
import mechanic.Mechanic;
import mechanic.ServiceStation;
import sponsor.Sponsor;
import transport.*;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static void example() {
        List <List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) if((j+i)%2==0){
                biDemArrList.get(i).add(j, "◯");
            }else {biDemArrList.get(i).add(j, "●");
        }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void refillQueue(Queue queue){
      int randomNum = ThreadLocalRandom.current().nextInt( 0, 6);
      for (int i=0; i<=randomNum; i++) {
          queue.offer("Ivan");
      }
    }

    public static void removeElement(Queue queue1, Queue queue2){
        int randomNum = ThreadLocalRandom.current().nextInt( 0, 101);
        if (randomNum<=50){
            queue1.poll();
        }else{
            queue2.poll();
        }
    }
    public static Queue addToQueue(String name, Queue queue1, Queue queue2){
        if (queue1.size()<5&&queue1.size()<=queue2.size()){
            queue1.offer(name);
            return queue1;
        }else if (queue2.size()<5&&queue2.size()<=queue1.size()){
            queue2.offer(name);
            return queue2;
        }else{
             Queue<String> queue3 = new ArrayDeque<>(5);
             queue3.offer(name);
             return queue3;
        }
    }

    public static void getCarInfo(Car car) {
        if (car.getModel() != null && car.getDriver() !=null && car.getMechanic() != null) {
            System.out.println("За авто " + car.getModel() + " закреплен водитель: " + car.getDriver().getFullName()+ " механики: " + car.getMechanic().toString() + ". Ее спонсоры: " + car.getSponsorList());
        } else {
            System.out.println("Недостаточно данных об автомобиле");
        }
    }
    public static void main(String[] args) {

        PassengerCar lexusGX300 = new PassengerCar("Lexus", "GX300", 0.0, BodyType.SEDAN);
        PassengerCar toyotaCorolla = new PassengerCar("Toyota", "Corolla", 1.8, BodyType.SEDAN);
        PassengerCar nissanJuke = new PassengerCar("Nissan", "Juke", 2.0, BodyType.CROSSOVER);
        PassengerCar hondaCivic = new PassengerCar("Honda", "Civic", 1.8, BodyType.SEDAN);
        Truck kamaz = new Truck("КАМАЗ", "03-10", 5.7, LoadCapacity.N1);
        Truck volvo = new Truck("Volvo", "M10", 6.8, LoadCapacity.N3);
        Truck mercedes = new Truck("Mercedes", "GOGG", 8.0, LoadCapacity.N3);
        Truck bmw = new Truck("BMW", "X1000", 10.0);
        Bus paz = new Bus("ПАЗ","ТТКК", 5.0, CapacityType.BIG);
        Bus zaz = new Bus("ЗАЗ", "РКК0", 5.2, CapacityType.BIG);
        Bus mercedesViano = new Bus("Mercedes","Viano", 3.0, CapacityType.SMALL);
        Bus kia = new Bus("KIA", "transport.Bus", 5.0, null);

//        System.out.println(nissanJuke.getBodyType());
//
//        System.out.println(lexusGX300);
//        System.out.println(toyotaCorolla);
//        System.out.println(nissanJuke);
//        System.out.println(hondaCivic);
//        System.out.println(kamaz);
//        System.out.println(volvo);
//        System.out.println(mercedes);
//        System.out.println(bmw);
//        System.out.println(paz);
//        System.out.println(zaz);
//        System.out.println(mercedesViano);
//        System.out.println(kia);

        BusDriver fedor=new BusDriver("Иванов Федор Никитич", true, 10, zaz, "D");
        BusDriver ivan = new BusDriver("Иван Михайлович Михайлов", true, 2, paz, "D");
        BusDriver alex = new BusDriver("Алексей Иванович Шолохов", true, 5, mercedesViano, "D");
        BusDriver inna = new BusDriver("Инна Васильевна Федорова", true, 6, kia, "D");
        TruckDriver mike = new TruckDriver("Михаил Иванович Ломоносов", true, 19, volvo, "C");
        TruckDriver nick = new TruckDriver("Николай Карлович Носов", true, 29, kamaz, "C");
        TruckDriver semen = new TruckDriver("Семен Семенович Семенов", true, 27, mercedes, "C");
        TruckDriver igor = new TruckDriver("Игорь Дмитриевич Дмиттриев", true, 28, bmw, "C");
        PassengerCarDriver efim =new PassengerCarDriver("Ефим Дмитриевич Анатольев", true, 14, hondaCivic, "B");
        PassengerCarDriver dmitry =new PassengerCarDriver("Петров Дмитрий Анатольевич", true, 22, lexusGX300, "B");
        PassengerCarDriver gosha = new PassengerCarDriver("Георгий Петрович Петров", true, 20, toyotaCorolla, "B");
        PassengerCarDriver sergey = new PassengerCarDriver("Сергей Михайлович Семенов", true, 21, nissanJuke, "B");
        Car [] carArray = {lexusGX300, toyotaCorolla, nissanJuke, hondaCivic, kamaz, volvo, mercedes, bmw, paz,zaz, mercedesViano, kia};
        for (Car car: carArray) {
            System.out.println(car.getDiagnosed());
        }

        Set<Car> set = new HashSet<>(List.of(carArray));
        set.add(new PassengerCar("Lexus", "GX300", 0.0, BodyType.SEDAN));
        System.out.println(set.toString());
        Sponsor ivanSponsor = new Sponsor("Иван Гончаров", 1000000);
        Sponsor dmitrySponsor = new Sponsor("Дмитрий Курилов", 200000);
        ivanSponsor.sponsorLap(set);
        ivanSponsor.sponsoredCars.add(lexusGX300);
        dmitrySponsor.addSponsoredCar(toyotaCorolla);

        Set <Sponsor> sponsorsList = new HashSet<>();
        sponsorsList.add(ivanSponsor);
        sponsorsList.add(dmitrySponsor);
        sponsorsList.add(dmitrySponsor);

        System.out.println();
        System.out.println(sponsorsList);
        System.out.println();

        ivanSponsor.addSponsoredCar(toyotaCorolla);
        Mechanic aleksey = new Mechanic("Алексей", "Гайки для шушлайки", "BCD");
        Mechanic triton = new Mechanic("Тритон", "Север", "BD");
        aleksey.addCar(toyotaCorolla);
        triton.addCar(toyotaCorolla);

        Set <Driver> driverArrayList = new HashSet<>();
        driverArrayList.add(sergey);
        driverArrayList.add(gosha);
        driverArrayList.add(dmitry);
        driverArrayList.add(efim);
        driverArrayList.add(igor);
        driverArrayList.add(semen);
        driverArrayList.add(nick);
        driverArrayList.add(mike);
        driverArrayList.add(inna);
        driverArrayList.add(alex);
        driverArrayList.add(ivan);
        driverArrayList.add(fedor);


        Set <Mechanic> mechanicList = new HashSet<>();
        mechanicList.add(aleksey);
        mechanicList.add(triton);
        System.out.println();
        System.out.println(mechanicList);
        System.out.println();
        System.out.println(driverArrayList);
        getCarInfo(toyotaCorolla);
        triton.repair(toyotaCorolla);


        ServiceStation serviceStation = new ServiceStation("СТО №1");
        serviceStation.addCarToList(lexusGX300);
        serviceStation.addCarToList(toyotaCorolla);
        serviceStation.serviceCar();



        //Задание 2
        Queue<String> queue = new ArrayDeque(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        System.out.println(queue);
        refillQueue(queue);
        refillQueue(queue2);
        System.out.println(addToQueue("Fedor", queue, queue2));
        System.out.println(queue2);
        System.out.println(queue);
        removeElement(queue, queue2);
        System.out.println(queue2);
        System.out.println(queue);
        serviceStation.addCarToList(lexusGX300);
        serviceStation.serviceCar();

        example();

    }}