package in.pgr;


public class ProtectedMem {

    protected int no;

    protected ProtectedMem(){

    }

    protected void m(){
        System.out.println("ProtectedMem protected method....");
    }

    public static void main(String[] args) {
        ProtectedMem protectedMem = new ProtectedMem();
        protectedMem.m();
        System.out.println(protectedMem.no);
    }
}
