import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Test2 {
    int a = 10;
    int b = 20;
    public static void main(String[]args){
        Test2 t2 = new Test2(); // object creation
        Class c = t2.getClass(); //using object class getclass() method
        

        
        System.out.println(c.getName());
        
    }
    public void sum(int a , int b){

    }
    @Override
    public String toString(){
        return "test";
    }
}