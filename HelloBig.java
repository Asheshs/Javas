class HelloBig{
     
  
    public  int largeNumber (int a, int b){
        return a>b?a:b;
        
    }

    
    public static void main(String...args){
        HelloBig hw =new HelloBig();
       int num = hw.largeNumber(14,12);
       System.out.println(num);
    }
}