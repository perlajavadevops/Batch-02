public class FinalVariablesDemo {

   // final int price = 100;
    final int price1;

    //static final int price = 80;
    static final int price;

    public static final double PI_VALUE = 3.14;

    static{
        price = 70;
    }

    {
        price1 = 50;
    }

   /* public FinalVariablesDemo(int price) {
        this.price = price;
    }*/

    public static void main(String[] args) {
       // FinalVariablesDemo fineVarDemo = new FinalVariablesDemo(200);
        //fineVarDemo.price = 90;
        //FinalVariablesDemo.price = 300;

        FinalVariablesDemo demo = new FinalVariablesDemo();
        System.out.println(demo.price1);

        FinalVariablesDemo demo1 = new FinalVariablesDemo();
        System.out.println(demo.price1);

        System.out.println(FinalVariablesDemo.price);
        System.out.println(FinalVariablesDemo.price);
    }
}
