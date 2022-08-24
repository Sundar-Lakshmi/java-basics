package functions;

public class SwappingIntegers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);


        String name = "Sundar";
        changeName(name);
        System.out.println(name);
    }

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static String changeName(String name){
        name = "Premi";
        return name;
    }
}
