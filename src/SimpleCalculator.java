import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers){
        String[] strArr = numbers.split(",");
        Object[] intArr = Arrays.stream(strArr).map((x) -> Integer.parseInt(x)).toArray();

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }
}
