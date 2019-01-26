//import java.io.*;
//public class ProgressBar{
    //public static void main(String[]args)
    //{
        //System.out.print("index at: X");
        //int lastSize = 1;
        //for (int i = 0; i < 100; i++) {
        //for (int j = 0; j < lastSize; j++) 
        //{
        //System.out.print("\b");
        //}
        
        //String is = String.toString();
        //System.out.print(is);
        //lastSize = is.length();
        //}
    //} 
//}
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class ProgressBar {

    public static void main(String[] args) {

        final JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setMaximum(100000);
        JFrame frame = new JFrame();
        frame.setContentPane(jProgressBar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 70);
        frame.setVisible(true);

        Runnable updatethread = new Runnable() {
            public void run() {
                try {

                    URL url = new URL("http://downloads.sourceforge.net/project/bitcoin/Bitcoin/blockchain/bitcoin_blockchain_170000.zip");
                    HttpURLConnection httpConnection = (HttpURLConnection) (url.openConnection());
                    long completeFileSize = httpConnection.getContentLength();

                    java.io.BufferedInputStream in = new java.io.BufferedInputStream(httpConnection.getInputStream());
                    java.io.FileOutputStream fos = new java.io.FileOutputStream(
                            "package.zip");
                    java.io.BufferedOutputStream bout = new BufferedOutputStream(
                            fos, 1024);
                    byte[] data = new byte[1024];
                    long downloadedFileSize = 0;
                    int x = 0;
                    while ((x = in.read(data, 0, 1024)) >= 0) {
                        downloadedFileSize += x;

                        // calculate progress
                        final int currentProgress = (int) ((((double)downloadedFileSize) / ((double)completeFileSize)) * 100000d);

                        // update progress bar
                        SwingUtilities.invokeLater(new Runnable() {

                            @Override
                            public void run() {
                                jProgressBar.setValue(currentProgress);
                            }
                        });

                        bout.write(data, 0, x);
                    }
                    bout.close();
                    in.close();
                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                }
            }
        };
        new Thread(updatethread).

        start();
    }

}