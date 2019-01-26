public class Book{
    private int id;

    public void setId(int id){
        System.out.println("printing id" + id);
        System.out.println("printing this.id" + this.id);
    } 
    public static void main(String[]args){
        Book b = new Book();
        b.id=10;//assigning to the class variable
        b.setId(24); //setting value to method
    }


}