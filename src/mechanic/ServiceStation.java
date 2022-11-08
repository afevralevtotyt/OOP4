package mechanic;

import sponsor.Sponsor;
import transport.Car;
import transport.PassengerCar;
import transport.Truck;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;

public class ServiceStation {

    public ServiceStation(String name) {
        this.name = name;
    }

    private String name;

     private Queue<Car> queue = new LinkedList();

     public void addCarToList(PassengerCar car){
         queue.offer(car);
     }
    public void addCarToList(Truck car){
        queue.offer(car);
    }


     public void serviceCar(){
         Car car = queue.poll();
         if (car!=null){
         System.out.println("Автомобиль " + car.getModel() + " прошел техобслуживание. Механик " + car.getMechanic());
         serviceCar();
     } else {
             System.out.println("Очередь пуста");
         }


}}
