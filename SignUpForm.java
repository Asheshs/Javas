import java.io.Serializable;
public class SignUpForm implements Serializable
{
     public static long serialVersionUID=234l;
     private String userName;
     private int passWord;
     SignUpForm(){}
     SignUpForm(String userName, int passWord)
     {
         this.userName = userName;
         this.passWord = passWord;

     }
     public String getUserName()
     {
         return userName;
     }
     public int getPassWord()
     {
         return passWord;
     }
     public void setUserName(String userName)
     {
         this.userName = userName;

     }
     public void setPassWord()
     {
         this.passWord = passWord;
     }
     @Override
     public String toString(){
         return this.userName + " " +this.passWord;
     }
}
