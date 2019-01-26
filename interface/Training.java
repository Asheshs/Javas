interface JavaTraining{
    void syllabus(); // only if only method is declared inside an interface, functional interface
}
public class Training{
    public static void main (String[]args){
        JavaTraining jt = new JavaTraining(){
            @Override
            public void syllabus(){
                System.out.println("hello i am syllabus");
            }
        };
        jt.syllabus();
        
    }
}