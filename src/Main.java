import java.util.Map;

public class Main {


        public static void main(String[] args) {

            Reader d= new Reader();
           Response minMax = d.askValues();



        RangeIterator rangeIterator = new RangeIterator(minMax.start, minMax.end);
       //rangeIterator.valuesGenerator().forEach(System.out::println);


         /*// print all the integer numbers between 23 and 12 (inclusive)
        for (Integer num : rangeIterator) {
            System.out.println(num);


        }*/
            for (Integer i: rangeIterator) {
                System.out.println(i);

            }
            System.out.println(rangeIterator.toString());

        }
    }

