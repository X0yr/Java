public class Main {
    public static void main(String[] args) {
        Pen p = new Pen("Ручка", "Красный", 145, 15.6, false,
                0, true);
        p.display();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.display();
        p.writeMyName();

        Ruler r = new Ruler("линейка", "жёлтая", 145, 15.6, true,
                15.6, false);
        r.display();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.display();
        r.measure();

        Divider d = new Divider("циркуль", "синий", 145, 15.6,
                false, "без карандаша", false);
        d.display();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.display();
        d.draw_circle();
        WritingMaterials u = new WritingMaterials("Имя", 16);

   }
}