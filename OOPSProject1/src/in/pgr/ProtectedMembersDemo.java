package in.pgr;


public class ProtectedMembersDemo {

    public static void main(String[] args) {
        ProtectedMem protectedMem = new ProtectedMem();
        protectedMem.m();
        System.out.println(protectedMem.no);
    }
}
