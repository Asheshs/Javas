import java.io.Serializable;
public class Student implements Serializable{
    public static long serialVersionUID=234l;
    private String studentName;
    private int studentCount;
    Student(){}
    Student(String studentName, int studentCount){
        this.studentName = studentName;
        this.studentCount=studentCount;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentCount(){
        return studentCount;
    }

     public void  setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void  setStudentCount(int studentCount){
        this.studentCount=studentCount;
    }
    @Override
    public String toString(){
        return this.studentName+ " " +this.studentCount;
    }

}
   

