import java.util.ArrayList;

public class Tugas5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("O");

        nama.remove(3);
        nama.remove(2);
        nama.remove(0);
        System.out.println("Ketika Index 0, 2 dan 3 dihapus, nama berubah menjadi " + nama);
    }

}