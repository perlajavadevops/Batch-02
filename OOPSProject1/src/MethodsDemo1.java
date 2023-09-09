public class MethodsDemo1 {

    static int b = 80;
    int c = 70;
    public static void n(){
        b = 90;
       // c = 80;
        //m1();
        System.out.println("static method");
    }

    public void m(){
        System.out.println("instance method");
    }

    public void m1(){

        System.out.println("instance method");
    }


    public static void main(String[] args) {
        MethodsDemo1.n();//calling static usig class name.
        MethodsDemo1 demo1 = new MethodsDemo1();
        demo1.m();
        demo1.m1();


    }

}
