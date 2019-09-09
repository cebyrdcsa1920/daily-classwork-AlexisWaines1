public class Student
{
    private double gpa;
    private String studentID;
    private String name;
    private int age;

    public Student(String name, String studentID, int age)
    {
        this.gpa = 0.0;
        this.name =name;
        this.studentID = studentId;
        this.age = age;

    }
    public static void main(String[] args)
    {
        Student alexis = new Student("Alexis", "660041",17);
        System.out.println(alexis);
    }
}

