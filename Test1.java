public class Test1 {
    int a = 10;
    int b = 20;
    public static void main(String[]args){
        Test1 t1 = new Test1();
        Integer a = 10;
        //System.out.println(t1.toString());
        String s = "hello world";
        System.out.println(a.toString());
        System.out.println(t1); //t1.toString();
        System.out.println(s.hashCode());
        System.out.println(t1.hashCode());
        
    }
    @Override
    public String toString(){
        return "a =" + a + "b ="+ b;
    }
}