public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    public void display(){
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw);
    }
    public void replace_rod(String color){
        this.color = color;
    }
    public void priceUp(int newPrice){
        this.price = price+newPrice;
    }
    public void priceDown(int newPrice){
        this.price = price-newPrice;
    }
    public void draw(){
        if(draw == true){
            System.out.println(name+" провёл линию. Её цвет "+color);
        }
        else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }
    public WritingMaterials(String name, int price){
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }
    public WritingMaterials(int price, double length, boolean draw){
        this.name = "No Name";
        this.price = price;
        this.color = "No Color";
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
}

