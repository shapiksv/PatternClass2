import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(read.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(read.readLine()));

        String symbol = "";

        while (reader.ready()){
            symbol +=reader.readLine();
        }

        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(symbol);
        String newSymbol = matcher.replaceAll("!");
//        System.out.println(newSymbol);
        writer.write(newSymbol);


        read.close();
        reader.close();
        writer.close();
    }
}
