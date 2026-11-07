package Practice;

class Student {
    String name;
    int age;
    String branch;
    Student(String n,int a,String b){
        name = n;
        age = a;
        branch = b;
    }
    void introduce(){
        System.out.println("----------------------");
        System.out.print("Name: " + name + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Branch: " + branch + "\n");
    }
}

public class StudentData {
    public static void main(String[] args){
        System.out.print("Student Record \n");
        Student s1 = new Student("ABC",23,"Computer Science");
        Student s2 = new Student("STQ",23,"Information Technology");
        Student s3 = new Student("RST",23,"Information Technology");
        s1.introduce();
        s2.introduce();
    }
}
