package poly.diamond;

public class diamondMain {

    public static void main(String[] args) {

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();


    }
}
