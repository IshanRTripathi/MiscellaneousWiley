package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer= new StringBuffer();

        String input="";
        while(!input.equals("stop"))
        {
            input= br.readLine();
            stringBuffer.append(input).append("\n");
        }
        System.out.println(stringBuffer);
    }
}
