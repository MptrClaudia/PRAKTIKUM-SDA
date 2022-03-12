import java.util.ArrayList;

public class Tugas4 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("O");

        System.out.println("Huruf A pada nama A,N,D,O berada di index " + nama.indexOf("A"));
        System.out.println("Huruf C pada nama A,N,D,O berada di index " + nama.indexOf("C"));
        System.out.println("Huruf Q pada nama A,N,D,O berada di index " + nama.indexOf("Q"));
    }

}