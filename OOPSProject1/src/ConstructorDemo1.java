class Employee{
    int empId;
    String name;
    String company;

    Employee(){//0-param constructor

    }

    Employee(int id){//0-param constructor
        empId = id;
        System.out.println("1- Param (int) constroctor");
    }

    Employee(long id){//0-param constructor
        System.out.println("1- Param (long) constroctor");
    }

    Employee(double id){//0-param constructor
        System.out.println("1- Param (double) constroctor");
    }

    Employee(int id, String n){//0-param constructor
        empId = id;
        name = n;
    }

    Employee(int id, String n, String c){//0-param constructor
        empId = id;
        name = n;
        company = c;
    }
}
public class ConstructorDemo1 {

    public static void main(String[] args) {

        Employee empInt = new Employee(10);
        Employee empDouble = new Employee(10.10);
        Employee empLong = new Employee(10L);

     /*   Employee emp1 = new Employee(101, "Harish", "TCS");

        System.out.println(emp1.empId);
        System.out.println(emp1.name);
        System.out.println(emp1.company);*/
    }
}
