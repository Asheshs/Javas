interface Car{
    int gear = 4;
    int wheel = 4;
    void speed();
}
public class Toyota implements Car{
    @Override
    public void speed(){
        System.out.println("300km/h");
    }

    public static void main(String[]args){
        Toyota t = new Toyota();
        t.speed();
        System.out.println(t.gear);
        System.out.println(t.wheel);

    }
}