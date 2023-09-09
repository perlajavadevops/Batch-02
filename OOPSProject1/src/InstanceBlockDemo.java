public class InstanceBlockDemo {

    int speedLimit  = 200;

    {

        System.out.println("instance block");
    }

    InstanceBlockDemo(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        InstanceBlockDemo demo = new InstanceBlockDemo();
    }
}
