package Chapter02;

public class DynInit {
    public static void main(String[] args) {
        double radius = 4;
        double height = 5;

        //dynamically initialize volume
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume is " + volume);

    }
}
