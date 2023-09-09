class Student{
    int studentId;
    String name;
    String course;

    Student(int studentId, String name, String course){
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    Student(Student st){
       System.out.println(st.course);
    }
}
public class WithoutThisKeyDemo {
    public static void main(String[] args) {
        Student st1 =  new Student(101, "Dhatrika", "Java");
        System.out.println(st1.studentId);
        System.out.println(st1.name);
        System.out.println(st1.course);

        Student st2 = new Student(st1);
    }
}
