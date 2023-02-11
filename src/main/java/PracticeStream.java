import java.io.* ;
public class PracticeStream {
    private static int size() throws IOException {
        int counter = 0 ;
        BufferedReader br = new BufferedReader(new FileReader("churn.csv"));
        while (br.readLine() != null) {
            counter++;
        }
        br.close();
        return counter ;
    }
    
    /**
    * اگر برای بایند کردن اطلاعات از استریم استفاده میکردی نیاز به کانتر و کد های اضافی نبود 
    */
    public static Customers[] convert() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("churn.csv"));
        Customers[] customers = new Customers[size()-1] ;
        String line ;
        int j = 0 ;
        int counter = 0 ;
        while ((line = br.readLine())!=null){
            if(counter >0) {
                String[] values = line.split(",");
                customers[j] = new Customers(Integer.parseInt(values[0].equals("") ? "0" :values[0]), Long.parseLong(values[1].equals("")?"0":values[1]),
                        values[2], Integer.parseInt(values[3].equals("")?"0":values[3]), values[4], values[5], Integer.parseInt(values[6].equals("")?"0":values[6]),
                        Integer.parseInt(values[7].equals("")? "0":values[7]),Double.parseDouble(values[9].equals("")?"0.0":values[9]),
                        Integer.parseInt(values[10].equals("")? "0":values[10]), Boolean.parseBoolean(values[11].equals("")?"0":values[11]),
                        Boolean.parseBoolean(values[12].equals("")? "0":values[12]), Double.parseDouble(values[13].equals("")? "0.0":values[13]),
                        Boolean.parseBoolean(values[14].equals("")?"0":values[14]), values.length == 16 ? Long.parseLong(values[15]) : 0);
                j++;
            }
            counter++ ;

        }

        br.close();
        return customers ;
    }

}
