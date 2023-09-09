public class StaticBlockDemo {

    int speedLimit  = 200;

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Intance block");
    }

    StaticBlockDemo(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        StaticBlockDemo demo = new StaticBlockDemo();
        System.out.println("Method main");
    }
}
