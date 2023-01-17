public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut","+90123","history");
        Teacher teacher2 = new Teacher("Ali","+90234","math");
        Teacher teacher3 = new Teacher("Fatma","+90345","phy");
        //teachers
        Course history = new Course("History","101","history",0.20);
        Course mathematics = new Course("Mathematics","202","math",0.70);
        Course physics = new Course("Physics","303","phy",0.50);
        //courses
            history.addTeacher(teacher1);
            mathematics.addTeacher(teacher3); // output: Missmatched teacher and course information
            physics.addTeacher(teacher3);
        //teacher assignment
        Student student1 = new Student("Furkan","235730","class1",history,mathematics,physics);
        student1.addExamNote(10,20,98);
        student1.addPerformanceNote(100,80,30);
        student1.isPass();

        Student student2 = new Student("Helin","235789","class1",history,mathematics,physics);
        student2.addExamNote(80,100,56);
        student2.addPerformanceNote(90,60,50);
        student2.isPass();

        Student student3 = new Student("Suna","235680","class2",history,mathematics,physics);
        student3.addExamNote(100,70,35);
        student3.addPerformanceNote(70,90,80);
        student3.isPass();
    }
}
