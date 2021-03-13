import java.util.Scanner;
import java.util.ArrayList;

public class Admin implements Event{

    ArrayList<Computer> products = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    Scanner scStr = new Scanner(System.in);

    @Override
    public void addNewPhone() {
        System.out.println("id");
        int id = scInt.nextInt();
        System.out.println("brand");
        String brand = scStr.next();
        System.out.println("price");
        int price = scInt.nextInt();
        System.out.println("screenSize");
        int screen = scInt.nextInt();
        System.out.println("cameraResolution");
        int camera = scInt.nextInt();
        Computer objectToAdd = new Phone(id,brand,price,screen,camera);
        products.add(objectToAdd);
    }

    @Override
    public void addNewPC() {
        System.out.println("id");
        int id = scInt.nextInt();
        System.out.println("brand");
        String brand = scStr.next();
        System.out.println("price");
        int price = scInt.nextInt();
        System.out.println("screenSize");
        int screen = scInt.nextInt();
        System.out.println("cameraResolution");
        int Gpu = scInt.nextInt();
        PC objectToAdd = new PC(id,price,brand,screen,Gpu);
        products.add(objectToAdd);
    }

    @Override
    public void remove() {
        int foundId;
        foundId=sc.nextInt();
        try{
            products.remove(foundId);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }

    @Override
    public void sell() {
        int foundId;
        foundId=sc.nextInt();
        try{
            products.remove(foundId);
        }catch(Exception exception){
            System.out.println(exception);
       }
    }

    @Override
    public void show(){
        for(var x: products){
            System.out.println(x.toString());
        }
    }
}
