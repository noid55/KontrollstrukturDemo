public class Student {
    private String name;
    private int age;
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        this.name = name;
        if(age < 0) {
            this.age = 0;
        } else if (age > 150) {
            this.age = 111;
        } else{
            this.age = age;
        }
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        } else if (age > 150) {
            this.age = 111;
        } else{
            this.age = age;
        }
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Eirik", 1500, 123456789);
        System.out.println(student1.age);

        for (int i = 0; i < 10; i++) {
            Student student+i =
        }
    }
}
