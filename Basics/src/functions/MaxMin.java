package functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max1(a,b,c));
        System.out.println(min1(a,b,c));
    }
/*    static int max(int a, int b, int c)
    {
        int max = 0;

        if (a>b)
        {
            if(a>c)
            {
                max = a;
            }
            else
            {
                max = c;
            }
        }
        else
        {
            if (b>c)
            {
               max = b;
            }
            else
                max = c;
        }

        return max;
        }


    static int min(int a, int b, int c)
    {   int  min = 0;

        if (a<b)
        {
            if(a<c)
            {
                min = a;
            }
            else
            {
                min = c;
            }
        }
        else
        {
            if (b<c)
            {
                min = b;
            }
            else min = c;
        }
        return min;
    }

*//*
    static int optimizedMax(int a, int b, int c){
        return a>b?a>c?
    }
*/

    public static int max1(int a, int b, int c) {

        int temp =  a>b?a:b;
        return temp>c?temp:c;
    }

    public static int min1(int a, int b, int c){
        int temp = a<b?a:b;
        return temp<c?temp:c;
    }

}
