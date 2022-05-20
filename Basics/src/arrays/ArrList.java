package arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<> (20);

        for(int i = 0; i<5;i++){
            List.add(sc.nextInt());
        }

/*
        for(int i = 0; i<5; i++){
            System.out.println(List.get(i));
        }
*/

        System.out.println(List);
    }
}
