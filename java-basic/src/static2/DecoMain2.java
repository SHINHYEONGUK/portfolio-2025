package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";

        System.out.println("before: " + s);
        System.out.println("after: "+ DecoUtil2.deco(s));
    }
}
