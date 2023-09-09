public class StaticBindingDemo {

    private static void m(){
        System.out.println("private method...");
    }

    public static void main(String[] args) {
        StaticBindingDemo demo = new StaticBindingDemo();
        demo.m();
    }
}

class OtherStaticBinding{
    public static void main(String[] args) {
        StaticBindingDemo demo = new StaticBindingDemo();
        //demo.m();
    }
}
