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

        for (int i = 0; i < intArr.length; i++) {
            int num = (int) intArr[i];
            if (num < 0)
                throw new Exception();
            if (num > 1000)
                intArr[i] = 0;
        }

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }
}