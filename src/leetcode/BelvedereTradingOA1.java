package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BelvedereTradingOA1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = in.readLine();
//        while ((line = in.readLine()) != null){
//            System.out.println(line);
//        }
        in.close();
        reader.close();

        System.out.println("*******");
        String[] split = line.split(";");

    }
}
