import java.util.*;
public class SignUpList
{
    private ArrayList<SignUpForm> al;
    
        SignUpList(){
            al = new ArrayList<SignUpForm>();
           
            al.add(new SignUpForm("ram" , 20));
            al.add(new SignUpForm("asd" ,3034));
            
        }
        public static void main (String [] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter email addrss");
            String name = sc.nextLine();
            Scanner scan = new Scanner(System.in);
            String Password = scan.nextLine();
            SignUpList sul = new SignUpList();
            try{
            sul.searchUserId(name);
            } catch(Throwable n){
                System.out.println(n);
            }
        }
        public void searchUserId(String name)
        {
            int flag = 0;
            for (SignUpForm x:al)
            {
                if(x.getUserName().contains(name))
                {
                    flag=1;
                System.out.println("Show UserID , Password");
                System.out.println(x);

                }
            }
             if (flag==0){
               System.out.println("Please improve your search with name that is in our list :");
            }

        }

}