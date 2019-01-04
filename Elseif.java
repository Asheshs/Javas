class Elseif
{
    public static void main(String[]args)
    {
        double salary = Double.parseDouble(args[0]);
        int age =Integer.parseInt(args[1]);
        if(age<25)
        {
        salary = salary-0.10*salary;
        

        }
        else if(age>25 && age<=30)
        {
            salary = salary- 0.15*salary;
        }
        else
        {
          salary = salary-0.25*salary;
         
        }
          System.out.println("salary is" + salary);
    }
}