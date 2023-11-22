import javax.xml.namespace.QName;
import java.util.Scanner;
public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    private int id;
    private static int counter = 1;
    private final static String StringDescription = "Описание класса";


    public void display(){
        System.out.println("Тип:"+type+","+"Имя:"+name+","+"Возраст:"+age+","+"Вес:"+weight+
                ","+"Умеет летать:"+isFly+","+"Умеет ходить:"+isWalk+","+"Умеет плавать:"+isSwim);
    }
    public void tooString(){
        System.out.println("Тип:"+type+","+"Имя:"+name+","+"Возраст:"+age+","+"Вес:"+weight+
                ","+"Умеет летать:"+isFly+","+"Умеет ходить:"+isWalk+","+"Умеет плавать:"+isSwim+" "+"ID:"+id);
    }


    {
        this.name = "Имя по умолчанию";
        this.type = "Тип по умолчанию";
    }
    public static void makeSound(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Что за звук?");
        String sound = sc.nextLine();
        System.out.println(sound);
    }


    public static void displayStringDescription(){
        System.out.println(StringDescription);
    }
    Animal(){
        id = counter++;
    }

    public final void rename(String name){
        this.name = name;
    }
    public void holiday(){
        this.weight = weight+0.1;
    }
    public  void holiday(double newWeight){
        this.weight = weight+newWeight;
    }
    public void holiday(double newWeight, int day){
        this.weight = weight+(newWeight*day);
    }
    public Animal(String type, String name){
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age){
        this.type = type;
        this.age = age;
    }
    public Animal(String type, String name, int age, double weight, boolean isFly,
                  boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public boolean getFly(){
        return isFly;
    }
    public boolean getSwim(){
        return isSwim;
    }
    public boolean getWalk(){
        return isWalk;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAge(int Age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFly(boolean isFly){
        this.isFly = isFly;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public void setSwim(boolean isSwim){
        this.isSwim = isSwim;
    }
    public static void displayCounter(){
        System.out.println("Counter: "+counter);
    }
    public void displayId(){
        System.out.println("ID: "+id);
    }

}
