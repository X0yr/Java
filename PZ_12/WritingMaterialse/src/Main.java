public class Main {
    public static void main(String[] args) {
//        WritingMaterials pen = new WritingMaterials();
//        pen.name = "ручка";
//        pen.color = "Красный";
//        pen.length = 15.6;
//        pen.price = 145;
//        pen.draw = true;
//        pen.display();
//        pen.draw();
//        pen.priceDown(10);
//        pen.display();
//        pen.replace_rod("Синий");
//        pen.draw();
//
//        WritingMaterials ruler = new WritingMaterials();
//        ruler.name = "Линейка";
//        ruler.length = 30.0;
//        ruler.price = 25;
//        ruler.draw = false;
//        ruler.display();
//        ruler.draw();
//        ruler.priceUp(13);
//        ruler.display();

        WritingMaterials pen = new WritingMaterials("Ручка", "Красный", 145, 15.6, true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen. draw();

        WritingMaterials ruler = new WritingMaterials("Линейка", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.draw = true;
        wm2.display();
        wm2.draw();
    }
}