public class Course {
    //properties
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    double factor;
    int performanceNote;
    double average;

    Course(String name,String code,String prefix,double factor){
        this.name= name;
        this.code= code;
        this.prefix= prefix;
        int note=0;
        this.factor=factor;
    }

    void printCourseInfo(){
        System.out.println("Course's name: "+this.name);
        System.out.println("Course's code: "+this.code);
        System.out.println("Course's note: "+this.note);
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            System.out.println("--Teacher Added to Class Successfully!");
            printTeacherInfo();
        }else{
            System.out.println("Mismatched Teacher and Course Information!");
        }
    }

    void printTeacherInfo(){
        if(teacher!=null){
            System.out.println("***Teacher of "+this.name+" course***");
            System.out.println("Teacher's name: "+this.teacher.name);
            System.out.println("Teacher's phone number: "+this.teacher.phoneNumber);
            System.out.println("Teacher's branch: "+this.teacher.branch);
        }else{
            System.out.println("No Teacher Assigned to the "+this.name+" course!");
        }
    }
}
