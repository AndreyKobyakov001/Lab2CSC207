import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long s = 0L;
        //Fixed thusly: making the original integer s a long-type. Otherwise, the maximum is 500000500000 (mod 2^32) =
        // 1784293664, which is quite obviously incorrect. QED.
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
