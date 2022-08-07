public class Testes {
    public static void main(String[] args) {
        testIfIteratorAcceptsDoubleNumbersAsInput();

    }


    public static void testIfIteratorAcceptsDoubleNumbersAsInput() {
        //given
        Reader d = new Reader();
        Response minMax = d.askValues();
        RangeIterator rangeIterator = new RangeIterator(minMax.start, minMax.end);

        //when
        //then

        if (minMax instanceof Response) {

            if (minMax.start instanceof Integer) {

            }
            throw new RuntimeException("that is not a int");
        }


    }
}

