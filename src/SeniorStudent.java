public class SeniorStudent extends Student{

    private String favouriteSubject;
    private int numberofriends;
    private int ORTresult;

    public SeniorStudent(String name, int age, String hobby, String gender, String teacher, String favouriteSubject, int numberofriends, int ORTresult) {
        super(name, age, hobby, gender, teacher);
        this.favouriteSubject = favouriteSubject;
        this.numberofriends = numberofriends;
        this.ORTresult = ORTresult;
    }
}
