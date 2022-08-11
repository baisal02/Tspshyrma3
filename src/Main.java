public class Main {
    public static void main(String[] args) {
        JuniorStudent baisal = new JuniorStudent("baisal",19,"listentomusic","male","muhamed","middle","intro");
        JuniorStudent a= new JuniorStudent("fda",19,"listentomusic","male","muhamed","middle","intro");
        JuniorStudent b = new JuniorStudent("baisfdasal",19,"listentomusic","male","muhamed","middle","intro");
        SeniorStudent c= new SeniorStudent("afdfd",21,"play tennis", "male","fdsaf","fdsafd",12,142);
        SeniorStudent d = new SeniorStudent("afsfdfgd",21,"play tennis", "male","fdsaf","fdsafd",12,209);

        School school = new School("bishkek",1997,"esen",10);
        school.setStudentter(baisal);
        school.setStudentter(a);
        school.setStudentter(b);
        school.setStudentter(c);
        school.setStudentter(d);
        Student[] studentter = school.getStudentter();
        for (int i = 0, studentterLength = school.getI(); i < studentterLength; i++) {
            Student g = studentter[i];
            if( g.getAvgrade()>20){
            System.out.println(g.getAvgrade());
            }
            else {
                System.out.println(g.getAvgrade()+"---");
            }
        }

        System.out.println("==");
        System.out.println("==");
        System.out.println("==");
        System.out.println("==");
        System.out.println("==");
        System.out.println("==");
    }
}