public final class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    public Fish(String type, String name, int age, double weight, boolean isFly,
                boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim){
        super(type,name,age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isSwim = true;
        this.isWalk = isWalk;
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    {
        this.name = "Имя по умолчанию";
        this.type = "Тип по умолчанию";
    }
    public void bul_bul(){
        System.out.println("bul_bul");
    }
    public void Fish(){
        this.isSwim = true;
        this.type = "Рыба";
    }
    public void setSquama(String squama){
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean upStreamSwim){
        this.upStreamSwim = upStreamSwim;
    }
    public String getSquama(){
        return squama;
    }
    public boolean isUpStreamSwim(){
        return upStreamSwim;
    }
}
