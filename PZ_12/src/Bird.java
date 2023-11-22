class Bird extends Animal {
    String aria;
    boolean  winterFly;

    public Bird(String type, String name, int age, double weight, boolean isFly,
         boolean isWalk, boolean isSwim, String aria, boolean winterFly){
        super(type,name,age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = true;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        this.aria = aria;
        this.winterFly = winterFly;
    }

    {
        this.name = "Имя по умолчанию";
        this.type = "Тип по умолчанию";
    }
    public void Bird(){
    this.isFly = true;
    this.type = "Птица";
    }
    public void chirick_chirick(){
        System.out.println("chirick_chirick");
    }
    public void setAria(String aria){
        this.aria = aria;
    }
    public void setWinterFly(boolean winterFly){
        this.winterFly = winterFly;
    }
    public String getAria(){
        return aria;
    }
    public boolean isWinterFly(){
        return winterFly;
    }
}
