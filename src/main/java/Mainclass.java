import java.io.* ;
import java.util.Arrays;

public class Mainclass {
    public static void main(String[] args) throws IOException {
        //System.out.println(PracticeStream.convert()[0]);
        Arrays.stream(PracticeStream.convert()).sorted((a,b)-> b.getCreditScore() - a.getCreditScore())
                .findFirst().ifPresent(System.out::println);
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).sorted((a,b)-> b.getCreditScore() - a.getCreditScore())
                .filter(c -> c.isExited()   ).findFirst().ifPresent(System.out::println) ;
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).filter(c -> (c.getSurName().isEmpty()||c.getCustomerId()==0)).forEach(System.out::println);//print all of this
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).filter(c -> c.getGender().equals("Male")&& c.getGeography().equals("France")&& c.getEstimatedSalary() <6000)
                .forEach(System.out::println);
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).filter(
                c-> c.getCustomerId()==15717426 || c.getCustomerId()==15585768
                || c.getCustomerId()==15619360 || c.getCustomerId()==15738148
                || c.getCustomerId()==15687946
        ).forEach(System.out::println);
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).sorted((a,b) ->a.getCreditScore() -b.getCreditScore() ) ; //ino pirint nakradam chon kheyli mishod
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).sorted((a,b)-> (int) (a.getEstimatedSalary() - b.getEstimatedSalary())).limit(10).forEach(System.out::println);
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).filter(c -> c.getGeography().equals("Spain")).mapToDouble(Customers::getEstimatedSalary).average().ifPresent(System.out::println);
        System.out.println("------------------------------");
        System.out.println(Arrays.stream(PracticeStream.convert()).filter(c-> c.getGeography().equals("Spain")).mapToLong(Customers::getCurrentLoanAmount).sum());
        System.out.println("------------------------------");
        Arrays.stream(PracticeStream.convert()).map(Customers::getGeography).distinct().forEach(System.out::println);
    }

}
