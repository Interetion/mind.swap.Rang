import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RangeIterator implements Iterable<Integer> {

    private Integer MAX_VALUE;
    private Integer MIN_VALUE;
    private List <Integer> numb= new ArrayList<>();


    public RangeIterator(int MIN_VALUE, int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE ;
        this.MIN_VALUE = MIN_VALUE;
    }


    public List<Integer> valuesGenerator(){;
        for (int i= MIN_VALUE; i<=MAX_VALUE;i++) {
             numb.add(i);
    }
        return numb;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            private int current = MIN_VALUE -1;

            @Override
            public boolean hasNext() {

                return current < MAX_VALUE;
            }

            @Override
            public Integer next() {
                current++;
                return current;
            }


        };


    }

    @Override
    public String toString() {
        return "RangeIterator{" +
                "MAX_VALUE=" + MAX_VALUE +
                ", MIN_VALUE=" + MIN_VALUE +
                ", numb=" + numb +
                '}';
    }


}
