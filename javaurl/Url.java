import java.net.*;
public class Url 
{
    public static void main(String [] args)
    {
        try{
        String website = "https://google.com"; // string represented as website.
        URL url = new URL (website); //coverting string to url object
        URLConnection connection = url.openConnection();// opening the connection
        connection.connect(); // connecting to the website
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}