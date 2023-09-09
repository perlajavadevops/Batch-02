package in.pgr;

class PrivateMem{

    private int sno=90;

    private PrivateMem(){

    }

    private void m(){
        System.out.println("PrivateMem private method....");
    }

    public static void main(String[] args) {
        PrivateMem privateMem = new PrivateMem();
        privateMem.m();
        System.out.println(privateMem.sno);
    }
}
public class PrivateMemDemo {

    public static void main(String[] args) {
       // PrivateMem privateMem = new PrivateMem();
       // privateMem.m();
      //  System.out.println(privateMem.sno);
    }
}
