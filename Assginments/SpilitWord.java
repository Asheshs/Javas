public class SpilitWord { 
    public static void main(String args[]) 
    { 
        String str = "myname is ashesh iam learningjjava"; 
        String[] arrOfStr = str.split("[, ?.@]+"); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
    } 
} 
