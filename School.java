import java.io.Serializable;
public class School implements Serializable{
    public static long serialVersionUID=234l;
    private String schoolName;
    private int classCount;
    School(){}
    public String getSchoolName(){
        return schoolName;
    }
    public int getClassCount(){
        return classCount;
    }

     public  setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void  setClassCount(int classCount){
        this.classCount=classCount;

     }
   
}
