public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;


    public Insect(String type, String name, int age, double weight, boolean isFly,
                boolean isWalk, boolean isSwim, int wingCount, boolean likeJesus){
        super(type,name,age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isSwim = isSwim;
        this.isWalk = true;
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }

    public void gggg(){
        System.out.println("Gggggggggggggggggggggggggggggggggggggggggggggggggggggg");
    }
    public void Insect(){
        this.isWalk = true;
        this.type = "Насекомое";
    }
    public void setWingCount(int wingCount){
        this.wingCount = wingCount;
    }
    public void setLikeJesus(boolean likeJesus){
        this.likeJesus = likeJesus;
    }
    public int getWingCount(){
        return wingCount;
    }
    public boolean isLikeJesus(){
        return likeJesus;
    }
}
