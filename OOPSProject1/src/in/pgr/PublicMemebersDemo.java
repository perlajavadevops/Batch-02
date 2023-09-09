package in.pgr;

public class PublicMemebersDemo {

    public int no;

    public PublicMemebersDemo(){

    }

    public void m(){
        System.out.println("ProtectedMem protected method....");
    }

    public static void main(String[] args) {
        PublicMemebersDemo publicMemebersDemo = new PublicMemebersDemo();
        publicMemebersDemo.m();
        System.out.println(publicMemebersDemo.no);
    }
}
