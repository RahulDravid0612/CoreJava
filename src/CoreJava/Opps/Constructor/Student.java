package CoreJava.Opps.Constructor;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String course;
    public int year;
    public String university;

public Student(String studname,int studage,char studgender,String studcourse,int studyear){
    this();
    name=studname;
    age=studage;
    gender=studgender;
    course=studcourse;
    year=studyear;

}

public Student(){
    university="stanford University";
    }

}
