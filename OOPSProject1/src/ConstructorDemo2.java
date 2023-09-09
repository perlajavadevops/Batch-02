class A{

    A(){
        System.out.println("using this keyword in current class "+this);
        B bb = new B(this);
        bb.m(this);
    }



}

class B{

    A aa;

    B(A aa){
        this.aa = aa;
        System.out.println("in B class con "+aa);
    }

    public void m(A aa){

    }
}

public class ConstructorDemo2 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("in main method "+a);

    }
}
