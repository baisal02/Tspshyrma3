import java.util.Random;

public class Student {
    Random random = new Random();
    private String name;
    private int age;
    private String hobby;
    private String gender;
    private String teacher;
    private int avgrade;
            private int c=random.nextInt(10,100);

    public Student(String name,int age, String hobby, String gender, String teacher){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
        this.gender=gender;
        this.teacher=teacher;
       this.avgrade=random.nextInt(10,100);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getGender() {
        return gender;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getAvgrade() {
        return avgrade;
    }
}
