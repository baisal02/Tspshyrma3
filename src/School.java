public class School {
    private String city;
    private int buildyear;
    private String directorname;
    private int numberofteachers;
    private Student[] studentter=new Student[70];
    private int i=0;

    public School(String city, int buildyear, String directorname, int numberofteachers) {
        this.city = city;
        this.buildyear = buildyear;
        this.directorname = directorname;
        this.numberofteachers = numberofteachers;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setStudentter(Student st) {
        studentter[i]=st;
        i++;
    }

    public Student[] getStudentter() {
        return studentter;
    }
}
