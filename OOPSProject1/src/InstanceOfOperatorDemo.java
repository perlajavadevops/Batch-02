public class InstanceOfOperatorDemo {

    public static void main(String[] args) {
        Bike bike1 = new Honda();
        bike1.run();

        System.out.println(bike1 instanceof Bike);//true
        System.out.println(bike1 instanceof Hero);//false
        System.out.println(bike1 instanceof Honda);//true

        if(bike1 instanceof Hero){
            Hero hero2 = (Hero)bike1;//it will give runtime excepiton (ClassCastException)
        }
        //Hero hero1 = (Hero)bike1;//it will give runtime excepiton (ClassCastException)
        //honda.run();
        //honda.uniqueFeatures();
        Bike bike2 = new Hero();
        bike2.run();

        Honda honda = new Honda();

        System.out.println("====================");
        System.out.println(honda instanceof Bike);//true
       // System.out.println(honda instanceof Hero);//false
        System.out.println(honda instanceof Honda);//true

        System.out.println("********************");
        Bike bike3 = honda;
        System.out.println(bike3 instanceof Bike);//true
        System.out.println(bike3 instanceof Hero);//false
        System.out.println(bike3 instanceof Honda);//true

        //Hero hero = (Hero)bike3;
        bike3.run();
    }
}
