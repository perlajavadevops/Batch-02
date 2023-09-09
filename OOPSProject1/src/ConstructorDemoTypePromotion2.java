public class ConstructorDemoTypePromotion2 {

    ConstructorDemoTypePromotion2(){

    }

    ConstructorDemoTypePromotion2(int a){
        System.out.println("1- Param (int) constroctor");
    }

    ConstructorDemoTypePromotion2(long l){
        System.out.println("1- Param (long) constroctor");
    }

    ConstructorDemoTypePromotion2(short s){
        System.out.println("1- Param (short) constroctor");
    }

    public static void main(String[] args) {
        ConstructorDemoTypePromotion2 demo1 =  new ConstructorDemoTypePromotion2(10);
        ConstructorDemoTypePromotion2 demo2 =  new ConstructorDemoTypePromotion2((short)10);
        ConstructorDemoTypePromotion2 demo3 =  new ConstructorDemoTypePromotion2(10L);
    }
}
