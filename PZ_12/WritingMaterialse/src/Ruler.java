final class Ruler extends WritingMaterials{
    double rulerLenght;
    boolean wood;
    public Ruler(String name, String color, int price, double length, boolean draw,double rulerLenght, boolean wood){
        super(name, color, price, length, draw);
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = false;
        this.rulerLenght = rulerLenght;
        this.wood = wood;
    }
    static{
        name = "Имя по умолчанию";
        color = "Цвет по умолчанию";
    }
    public void measure(){
        System.out.println("Сейчас померяем длину");
    }
    public void display(){
        System.out.println("This is Ruler.");
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw+", "+
                "Длинна линейки:"+rulerLenght+", "+"Она из дерева:"+wood);
    }
    public void setWood(boolean newWood){
        this.wood = newWood;
    }
    public boolean isWood(){
        return wood;
    }
    public void setRulerLenght(double newRulerLenght){this.rulerLenght = newRulerLenght;}
    public double getRulerLenght(){return rulerLenght;}
}
