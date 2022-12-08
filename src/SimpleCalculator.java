import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers) throws Exception{

        String delimiters = ",\n";
        if (numbers.charAt(0) == '/') {
            delimiters += numbers.charAt(2);
            numbers = numbers.substring(4);
        }

        String[] strArr = numbers.split("[" + delimiters +"]");
        Object[] intArr = Arrays.stream(strArr).map(Integer::parseInt).toArray();

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }
}
