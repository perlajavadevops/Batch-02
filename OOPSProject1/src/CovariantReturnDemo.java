class GrandParent{

    public Number getNum(){
        Number nu = new Integer(10);
        return nu;
    }

}

class Parent extends GrandParent{

    @Override
    public Integer getNum() {
        return 10;
    }
}

class Child extends Parent{

}
public class CovariantReturnDemo {

}
