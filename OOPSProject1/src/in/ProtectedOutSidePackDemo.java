package in;

import in.pgr.ProtectedMem;

public class ProtectedOutSidePackDemo extends ProtectedMem {

    protected ProtectedOutSidePackDemo(){

    }
    public static void main(String[] args) {
       /* ProtectedMem protectedMem = new ProtectedMem();
        protectedMem.m();
        System.out.println(protectedMem.no);*/

        /*ProtectedMem protectedMem = new ProtectedOutSidePackDemo();
        protectedMem.m();
        System.out.println(protectedMem.no);*/

        ProtectedOutSidePackDemo protectedMem = new ProtectedOutSidePackDemo();
        protectedMem.m();
        System.out.println(protectedMem.no);
    }
}
