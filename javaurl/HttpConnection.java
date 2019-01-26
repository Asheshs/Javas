import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
public class HttpConnection
{
    public static void main(String [] args)
    {
       
        String website = "https://facebook.com";
        final String HTML_SUFFIX=".html";
         try{
        URL url = new URL(website);

        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        //System.out.println(connection.getResponseCode());
        //System.out.println(connection.getResponseMessage());
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
        {
        //System.out.println("Succseesfully connected to sever of website" + website);
        //System.out.println("Downloading");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        FileWriter fw = new FileWriter(url.getHost() + HTML_SUFFIX);
        while ((line = br.readLine())!= null )
        {
            //System.out.println(line);
            fw.write(line);
            
        }
        fw.close();
        System.out.println("file created for host");
        }
        else{
            System.out.println("couldn't connect to the website" + website);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}