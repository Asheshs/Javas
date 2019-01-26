import java.io.Serializable;
public class FilmHall implements Serializable{
    public static long serialVersionUID=234l;
    private String movieName;
    private int seatCount;
    FilmHall(){}
    public String getMovieName(){
        return movieName;
    }
    public int getSeatCount(){
        return seatCount;
    }

     public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public void  setSeatCount(int seatCount){
        this.seatCount = seatCount;

     }
   
}
