

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Mainclass {

    @Override
    public String toString() {
        return "Mainclass{}";
    }

    public static void main(String[] args) throws IOException {
        List<Custom> customs = new ArrayList<>();

        FileReader fileReader0 = new FileReader("h.txt");

      //  FileReader fileReader = new FileReader("E:\\H1\\Education\\Java\\quiz\\h.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader0);
        String i;
        while ((i=bufferedReader.readLine())!=null) {
           String[] line =  i.split("'");
           Custom custom1 = new Custom(Integer.parseInt(line[0].equals("")  ? "0" : line[0]),Integer.parseInt(line[1]),line[2],Integer.parseInt(line[3]),line[4],line[5],Integer.parseInt(line[6]),
                    line[7],Double.parseDouble(line[8]),Double.parseDouble(line[9]),Integer.parseInt(line[10]),line[11],line[12],
                   Double.parseDouble(line[13]),line[14],Double.parseDouble(line[15]) );


        }
        fileReader0.close();

    }
}

