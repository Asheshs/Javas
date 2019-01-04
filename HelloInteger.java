class HelloInteger{
     
  
    public String oddEven(int a){
        String s=a%2==0?"Even":"Odd";
        return s;
    }

    
    public static void main(String...args){
        HelloInteger hw =new HelloInteger();
       String oddEven = hw.oddEven(14);
       System.out.println(oddEven);
    }
}