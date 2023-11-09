import javax.xml.namespace.QName;

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public void display(){
        System.out.println("Тип:"+type+","+"Имя:"+name+","+"Возраст:"+age+","+"Вес:"+weight+
                ","+"Умеет летать:"+isFly+","+"Умеет ходить:"+isWalk+","+"Умеет плавать:"+isSwim);
    }

    public void rename(String name){
        this.name = name;
    }
    public void holiday(int holiday_time){
        this.weight = weight+0.1*holiday_time;

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
}
