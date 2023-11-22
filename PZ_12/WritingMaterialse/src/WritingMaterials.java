public class WritingMaterials {
    static String name;
    static String color;
    int price;
    double length;
    boolean draw;
    private int id;
    private static int counter = 1;
    static String StringDescription = "Описание класса";

    public void display(){
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw);
    }
    public void tooString(){
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw+
                ", "+"ID:"+id);
    }
    static{
        name = "Имя по умолчанию";
        color = "Цвет по умолчанию";
    }
    WritingMaterials(){
        id = counter++;
    }

    public final static void displayStringDescription(){
        System.out.println(StringDescription);
    }
    public static void rename(String newName){
        name = newName;
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
    public void draw(int lineLength){
        if(draw == true){
            System.out.println(name+" провёл линий:"+lineLength+" Её цвет "+color);
        }
        else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public void draw(String newColor){
        if(draw == true){
            System.out.println(name+" провёл линий:1 Её цвет "+newColor);
        }
        else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public void draw(String newColor, int lineLength){
        if(draw == true){
            System.out.println(name+" провёл линий:"+lineLength+"Её цвет "+newColor);
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

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    public double getLength(){
        return length;
    }
    public boolean isDraw(){
        return draw;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }
    public void setLength(double newLength){
        this.length = newLength;
    }
    public void setDraw(boolean newDraw){
        this.draw = newDraw;
    }
}

