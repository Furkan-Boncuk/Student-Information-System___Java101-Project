public class Student {
    String name;
    String studentNumber;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name,String studentNumber,String classes,Course course1,Course course2,Course course3){
        this.name=name;
        this.studentNumber=studentNumber;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0;
        this.isPass=false;
    }

    void addExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            this.course1.note=note1;
        }else{
            System.out.println("Entered Invalid Note Information");
        }

        if(note2>=0 && note2<=100){
            this.course2.note=note2;
        }else{
            System.out.println("Entered Invalid Note Information");
        }

        if(note3>=0 && note3<=100){
            this.course3.note=note3;
        }else{
            System.out.println("Entered Invalid Note Information");
        }
    }

    void addPerformanceNote(int performance1,int performance2,int performance3){
        if(performance1>=0 && performance1<=100){
            this.course1.performanceNote=performance1;
        }else{
            System.out.println("Entered Invalid Note Information");
        }

        if(performance2>=0 && performance2<=100){
            this.course2.performanceNote=performance2;
        }else{
            System.out.println("Entered Invalid Note Information");
        }

        if(performance3>=0 && performance3<=100){
            this.course3.performanceNote=performance3;
        }else{
            System.out.println("Entered Invalid Note Information");
        }
    }

    void averageCalculator(){
        if(course1.note==0 || course2.note==0 || course3.note==0 || course1.performanceNote==0 || course2.performanceNote==0 || course3.performanceNote==0){
            System.out.println("All Grade Information Has not been Entered Yet!");
            System.out.println("==================");
        }else{
            course1.average= (course1.note*course1.factor)+(course1.performanceNote*(1-course1.factor));
            course2.average= (course2.note*course2.factor)+(course2.performanceNote*(1-course2.factor));
            course3.average= (course3.note*course3.factor)+(course3.performanceNote*(1-course3.factor));
            average=(course1.average+course2.average+course3.average)/3.0;
        }
    }

    void isPass(){
            averageCalculator();
            if(this.average>55){
                this.isPass=true;
            }

            printNote();

            if(this.isPass){
                System.out.println("You Passed!");
                System.out.println("==================");
            }else{
                System.out.println("You Failed!");
                System.out.println("==================");
            }
    }

    void printNote(){
        System.out.println(this.course1.name+" Exam Grade: "+course1.note);
        System.out.println(this.course2.name+" Exam Grade: "+course2.note);
        System.out.println(this.course3.name+" Exam Grade: "+course3.note);
        System.out.println(this.course1.name+" Performance Grade: "+course1.performanceNote);
        System.out.println(this.course2.name+" Performance Grade: "+course2.performanceNote);
        System.out.println(this.course3.name+" Performance Grade: "+course3.performanceNote);
        System.out.println("-----");
        System.out.println("**"+course1.name+"'s Average: "+course1.average);
        System.out.println("**"+course2.name+"'s Average: "+course2.average);
        System.out.println("**"+course3.name+"'s Average: "+course3.average);
        System.out.println("-----");
        System.out.println("**Total Average: "+this.average);
    }
}
