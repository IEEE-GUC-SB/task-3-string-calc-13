import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers){
        String[] strArr = numbers.split(",");
//        Object[] intArr = Arrays.stream(strArr).map((x) -> Integer.parseInt(x)).toArray();
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
            intArr[i] = Integer.parseInt(strArr[i]);

        int res = Arrays.stream(intArr).reduce(0, (x, y) -> x + y);
        return res;
    }
}
