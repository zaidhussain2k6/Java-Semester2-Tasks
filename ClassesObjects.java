class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Pen is Writing!");
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Pointer";

        pen1.write();
    }
}
