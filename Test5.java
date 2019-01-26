public class Test5{
    public static void main(String[]args){
        School s = new School();
        s.setSchoolName("something");
        s.setClassCount(200);
        Test5 t = new Test5();
        t.printSchoolDetails(s);// s is an object of scool which is pass to printSchoolDetails

    }
    public void printSchoolDetails(School t){ //t is the reciver end of data sent from the main method
        System.out.println(t.getSchoolName());
        System.out.println(t.getClassCount());
    }
}