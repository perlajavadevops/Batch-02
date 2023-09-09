public class CompileTimePolyDemo {

    /* public static void addition(int a, int b){
        System.out.println("Addition of 2 (int, int) no is "+(a+b));
    }*/

    public static void addition(long a, int b){
        System.out.println("Addition of 2 (long, int) no is "+(a+b));
    }

    public static void addition(int a, long b){
        addition(10.90, 20.90);//31.79 31.799999999
        System.out.println("Addition of 2 (int, long) no is "+(a+b));
    }

    public static void addition(double a, double b){//35.89+45.90 =
        System.out.println("Addition of 2 (double, double) no is "+(a+b));
    }

    public static void addition(double a, double b, double c){//35.89+45.90+50. =
        System.out.println("Addition of 3 (double, double, double) no is "+(a+b+c));
    }

    public static void main(String[] args) {
        addition(10L,109);
        //addition(10.90, 20.90);//31.79 31.799999999
        //addition(20.90, 30.90, 40.90);//
    }
}
