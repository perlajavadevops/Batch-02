class RBI_Bank{

    public double getPersonalLoanInterset(){
        return 10.20;
    }

    public double getHomeLoanInterset(double homeLoanAmount){
        return 10.20;
    }

}

class ICICI_Bank extends RBI_Bank{

    @Override
    public double getPersonalLoanInterset() {
        return 10.00;
    }

    @Override
    public double getHomeLoanInterset(double homeLoanAmount1) {
        return 10.10;
    }
}
public class MethodOverridingDemo {
}
