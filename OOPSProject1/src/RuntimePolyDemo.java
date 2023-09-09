public class RuntimePolyDemo {
    public static void main(String[] args) {
        Bike bike1 = new Honda();
        bike1.run();


        //Hero honda = (Hero)bike1;//it will give runtime excepiton
        //honda.run();
        //honda.uniqueFeatures();
        Bike bike2 = new Hero();
        bike2.run();

        Honda honda = new Honda();

        Bike bike3 = honda;
        //Hero hero = (Hero)bike3;
        bike3.run();
    }
}
