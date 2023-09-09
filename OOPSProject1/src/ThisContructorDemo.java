public class ThisContructorDemo {

    ThisContructorDemo(){
        this(10);//this con call must be first statement
        System.out.println("0- arg constructor");

    }

    ThisContructorDemo(int a){
        this('A');
        System.out.println("1- arg constructor (int) ");
    }

    ThisContructorDemo(char ch){
        System.out.println("1- arg constructor (char) ");
    }

    public static void main(String[] args) {
        ThisContructorDemo demo =  new ThisContructorDemo();
    }
}
