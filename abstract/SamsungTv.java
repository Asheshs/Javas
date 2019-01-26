abstract class Tv{
    public void screenSize(){
        System.out.println("15"); // 15"
    }
    public abstract void cost();
}
public class SamsungTv extends Tv{
    @Override
    public void cost(){
        System.out.println("40k");
    }
    public static void main(String[]args){
        SamsungTv st = new SamsungTv();
        st.cost();
        st.screenSize();
    }
}