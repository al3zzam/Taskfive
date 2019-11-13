import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(j>=(n/2)-t&&j<=(n/2)+t)
                    bufferedWriter.write("*");

                else
                    bufferedWriter.write(" ");

            }

            bufferedWriter.newLine();
            if(i<n/2)
                t++;
            else
                t--;
        }




        bufferedWriter.close();
        bufferedReader.close();
    }
}
