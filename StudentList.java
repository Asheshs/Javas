import java.util.*;
public class StudentList{
   
        private ArrayList<Student> al;
        StudentList(){

         al = new ArrayList<Student>();
        al.add(new Student("ram",20));
        al.add(new Student("shyam",42));
        al.add(new Student("hari",50));
        }
         public static void main(String []args){

             Scanner sc = new Scanner (System.in);
             System.out.println("Enter the name you want to search");
             String name = sc.nextLine();

             StudentList sl = new StudentList();//blank constructor called
             try{
             sl.searchNameStudent(name);
             }catch (Throwable n){
                 System.out.println(n);
             }
    }
    public void searchNameStudent(String name) {
        int flag = 0;
        for(Student x:al){
            if(x.getStudentName().contains(name)){
                flag=1;
                System.out.println("Relevant search result :");
                System.out.println(x);

            }
           
        }
         if (flag==0){
               System.out.println("Please improve your search with name that is in our list :");
            }
    }

}