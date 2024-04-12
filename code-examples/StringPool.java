public class StringPool {

    public static void main(String[] args) {
        String s1 = "Мы любим java.";
        String s2 = "Мы любим " + "java.";
        String s3 = new String("Мы любим java.");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3.intern());
        System.out.println(s1==s3);
    }
}
