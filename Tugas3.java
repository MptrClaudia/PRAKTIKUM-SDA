import java.util.ArrayList;
import java.util.List;

public class Tugas3 {

    public static void main(String[] args) {
          
        ArrayList<String> namasaya = new ArrayList<String>(4);

        //get(0),(2),(6),(-3)

        namasaya.add("A");
        namasaya.add("N");
        namasaya.add("D");
        namasaya.add("O");

        System.out.println(namasaya.get(0));
        System.out.println(namasaya.get(2));
        System.out.println(namasaya.get(6));
        System.out.println(namasaya.get(-3));
    }
}