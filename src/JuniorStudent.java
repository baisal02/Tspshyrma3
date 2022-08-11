public class JuniorStudent extends Student {

    private String level;
    private String ch;

    public JuniorStudent(String name, int age, String hobby, String gender, String teacher, String level, String ch) {
        super(name, age, hobby, gender, teacher);
        this.level = level;
        this.ch = ch;
    }

    public String getLevel() {
        return level;
    }

    public String getCh() {
        return ch;
    }

}
