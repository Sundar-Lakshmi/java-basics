public class Datatypes {
    public static void main(String[] args)
    {
        byte b = 45;
        //1 byte
        short s = 4544;
        //2 byte
        int i = 2000111111;
        //4 byte
        long l = 3234121113446484987L;
        //8 byte

        float f = 23.34f;
        //4 byte
        double d = 45.433333433;
        //8 byte

        boolean bool = false;

        char c = 83;

        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + bool + " " + c);

        System.out.println("The result of 10>9 is " + (10>9));
    }

    public Boolean isTrue() {
        return 1<2;
    }
}

