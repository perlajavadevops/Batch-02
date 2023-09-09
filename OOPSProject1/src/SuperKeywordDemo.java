class Shape{

    Shape(){

        System.out.println("Shape Constructor");
    }
    public int value = 80;
    public void drawShape(){
        System.out.println("Shape");
    }

    public void m(){
        System.out.println("Shape m method");
    }
}

class Circle extends Shape{

    public int value = 90;

    Circle(){
        this(10);
       // super();
        System.out.println("Circle Constructor");
    }

    Circle(int a){
        super();
        System.out.println("Circle Constructor");
    }

    @Override
    public void drawShape() {
        super.m();
        System.out.println("Circle " + super.value);
    }
}

class OffCircle extends Circle{

    //public int value = 90;

    OffCircle(){
        System.out.println("OffCircle Constructor");
    }
    @Override
    public void drawShape() {
        System.out.println("Circle " + super.value);
    }
}
public class SuperKeywordDemo {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.drawShape();
        Circle shape2 = new Circle();
       // shape1.drawShape();
    }
}
