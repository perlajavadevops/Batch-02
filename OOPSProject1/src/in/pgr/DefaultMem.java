package in.pgr;

public class DefaultMem {

    int sno;

    DefaultMem(){

    }

    void m(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        DefaultMem defaultMem = new DefaultMem();
        System.out.println(defaultMem.sno);
        defaultMem.m();
    }
}
