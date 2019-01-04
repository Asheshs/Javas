class HelloPer{
    public String Percentage(int Per)
    {
    
        if( Per >= 80)
        {
            return "Distinction";
        }
        else if( Per >=60 && Per < 80)
        {
            return"First divison";
        }
        else if( Per >=50 && Per < 60)
        {
        return "Second divison";
        }  
        else{
            return "fail";
        }
    }

 public static void main(String...args)
 {
      HelloPer hw =new HelloPer();
       String per = hw.Percentage(78);
        System.out.println(per);
    }

     
 
 }