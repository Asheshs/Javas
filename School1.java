public class School1 implements java.io.Serializable{
    private static long serialVersionUID=1L;
    private int id;
    private String school1Name;
    private String school1Address;

    School1(){}
    School1(int id, String school1Name, String school1Address){
        this.id = id;
        this.school1Name=school1Name;
        this.school1Address=school1Address;
    }
    public int getId(){return id;}
    public String getSchool1Name(){
        return schoo1lName;
    }
    public String getSchool1Address(){
        return schoolAddress;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSchool1Name(String school1Name){
        this.school1Name=schoo1lName;
    }
    public void setSchool1Address(String school1Address){
        this.school1Address=school1Address;


    }


}  