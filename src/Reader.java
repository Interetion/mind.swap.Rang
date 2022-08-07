import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reader {




     public Response askValues(){

         Integer start = read("start");
         Integer end =  read("end");
          System.out.println("end :" + end + " start :" + start );

         return  new Response(start, end);
     }
    public Integer read(String message){

        Scanner t = new Scanner(System.in);
        Integer aswer1 =0;
        System.out.println(message);
        try {
             aswer1 =t.nextInt();
        }catch(Exception e){
            System.out.println("Nan");
           return read(message);

        }
        return aswer1;




    }

}
