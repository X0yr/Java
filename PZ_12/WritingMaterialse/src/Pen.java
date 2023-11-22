class Pen extends WritingMaterials{
    int countColor;
    boolean auto;
    public Pen(String name, String color, int price, double length, boolean draw, int countColor, boolean auto){
        super(name, color, price, length, draw);
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = true;
        this.countColor = countColor;
        this.auto = auto;
    }
    static{
        name = "Имя по умолчанию";
        color = "Цвет по умолчанию";
    }
    public void writeMyName(){
        System.out.println("Никита");
    }
    public void display(){
        System.out.println("This is Pen.");
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw+
        ", "+"Количество цветов в ручке:"+countColor+", "+"Она атоматическая:"+auto);
    }
    public void setCountColor(int newCountColor){
        this.countColor = newCountColor;
    }
    public int getCountColor(){
        return countColor;
    }
    public void setAuto(boolean newAuto){
        this.auto = newAuto;
    }
    public boolean isAuto(){
        return auto;
    }
}
