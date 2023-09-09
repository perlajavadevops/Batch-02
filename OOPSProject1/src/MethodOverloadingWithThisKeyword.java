public class MethodOverloadingWithThisKeyword {

     /* public static void addition(int a, int b){
        System.out.println("Addition of 2 (int, int) no is "+(a+b));
    }*/

    public void addition(long a, int b){
        System.out.println("Addition of 2 (int, int) no is "+(a+b));
    }

    public void addition(int a, long b){
        System.out.println("Addition of 2 (int, long) no is "+(a+b));
    }

    public void addition(double a, double b){//35.89+45.90 =
        addition(10, 10L);
        System.out.println("Addition of 2 (double, double) no is "+(a+b));
    }

    public void addition(double a, double b, double c){//35.89+45.90+50. =
        this.addition(a, b);
        System.out.println("Addition of 3 (double, double, double) no is "+(a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloadingWithThisKeyword k =  new MethodOverloadingWithThisKeyword();
        k.addition(10,30,40);
    }
}
