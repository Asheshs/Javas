import java.awt.Desktop;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.net.URL;
import java.net.HttpURLConnection;

public class SimpleFileDownload
{
    public static void main(String[] args)
    {
        try{
        SimpleFileDownload sfd = new SimpleFileDownload();
        sfd.method3();
      
        }catch(Exception e){
            System.out.println(e);
        }


    } 
    public void method3()
    {
        try{
        String downloadLink ="https://download.cdn.viber.com/desktop/windows/ViberSetup.exe";
        URL url = new URL(downloadLink);
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        System.out.println(connection.getContentLength()/(1024*1024));
        System.out.println(connection.getHeaderField("Content-Disposition"));
        System.out.println(downloadLink.substring(downloadLink.lastIndexOf("/")+1));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void method2() throws Exception{
    {
        FileWriter fw = new FileWriter("properties.txt");
        Properties p = System.getProperties();
        for (Map.Entry s:p.entrySet())
        {
           fw.write(s.getKey()+"="+s.getValue()+System.getProperty("line.separator"));
        }
        fw.close();
        System.out.println("Properties file written to file");
    }
    }
    public void method1()
    {
        //String javaHome = System.getenv("path");
        //System.out.println(javaHome);
        String separator = System.getProperty("file.separator");
        System.out.println(separator);
        String userHome=System.getProperty("user.home");
        System.out.println(userHome);

        String downloadLocation = userHome+separator+"Downloads";
        System.out.println(downloadLocation);
    }
}