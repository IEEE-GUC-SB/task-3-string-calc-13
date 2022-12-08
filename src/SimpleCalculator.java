import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers){
        char delimiter = ',';
        if (numbers.charAt(0) == '/') {
            delimiter = numbers.charAt(2);
            numbers = numbers.substring(4);
        }

        String[] strArr = numbers.split("[,\n]|[" + delimiter +"]");
        System.out.println(Arrays.toString(strArr));
        Object[] intArr = Arrays.stream(strArr).map((x) -> Integer.parseInt(x)).toArray();

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }
}
