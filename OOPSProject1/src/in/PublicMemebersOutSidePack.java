package in;

import in.pgr.PublicMemebersDemo;

public class PublicMemebersOutSidePack {

    public static void main(String[] args) {
        PublicMemebersDemo publicMemebersDemo = new PublicMemebersDemo();
        publicMemebersDemo.m();
        System.out.println(publicMemebersDemo.no);
    }
}
