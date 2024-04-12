public class Integers {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        Integer e = -128;
        Integer f = -128;
        System.out.println(e == f);

        Integer g = -129;
        Integer h = -129;
        System.out.println(g == h);

        Integer i = Integer.valueOf(127);
        Integer j = new Integer(127);
        System.out.println(a == i);
        System.out.println(a == j);
    }
}

