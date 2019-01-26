class Car{
    int gear = 4;
    int wheel = 4;
    public void speed(){
        System.out.println("200km/h");
    }

}
public class Ford extends Car{
    @Override
    public void speed(){
        System.out.println("300km/h");
    }
     int gear = 6;
    public static void main(String[]args){
       Car c = new Car();
       System.out.println(c.gear);
       c.speed();
       Car c1 = new Ford();
       System.out.println(c1.gear);
       c1.speed();
    }
}