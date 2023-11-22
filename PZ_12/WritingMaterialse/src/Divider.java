class Divider extends WritingMaterials{
    String dividerType;
    boolean metal;
    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal){
        super(name, color, price, length, draw);
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = true;
        this.dividerType = dividerType;
        this.metal = metal;
    }

    static{
        name = "Имя по умолчанию";
        color = "Цвет по умолчанию";
    }
    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }
    public void display(){
        System.out.println("This is Divider");
        System.out.println("Название:"+name+", "+"Длина:"+length+", "+"Цена:"+price+", "+"Умеет рисовать:"+draw+", "+
                "Тип циркуля:"+dividerType+", "+"Он из металла:"+metal);
    }
    public void setDividerType(String newDividerType){
        this.dividerType = newDividerType;
    }
    public String getDividerType(){
        return dividerType;
    }
    public void setMetal(boolean newMetal){
        this.metal = newMetal;
    }
    public boolean isMetal(){
        return metal;
    }
}
