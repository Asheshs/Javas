public class Test6{
    public static void main(String[]args){
        FilmHall fm = new FilmHall();
        fm.setMovieName("KGF");
        fm.setSeatCount(400);
        Test6 t6 = new Test6();
        t6.printFilmHallDetails(fm);

    }
     public void printFilmHallDetails(FilmHall t6){
        System.out.println(t6.getMovieName());
        System.out.println(t6.getSeatCount());
     }
}