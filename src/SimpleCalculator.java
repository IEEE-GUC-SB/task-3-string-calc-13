import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers){
        String delimiters = fetchDelimiters(numbers);
        String numbersExpression = fetchNumbersExpression(numbers);

        String[] strArr = numbersExpression.split("[" + delimiters + "]");
        Object[] intArr = Arrays.stream(strArr).map(this::parseInt).toArray();

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }

    String fetchDelimiters (String numbers) {
        String delimiters = ",|\n";
        if (numbers.charAt(0) == '/')
            if (numbers.contains("["))
                delimiters += numbers.substring(numbers.indexOf("[") + 1, numbers.indexOf("]"));
            else
                delimiters += numbers.charAt(2);

        return delimiters;
    }

    String fetchNumbersExpression (String numbers) {
        if (numbers.charAt(0) == '/')
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
        return numbers;
    }

    int parseInt (Object x) throws RuntimeException {
        if (x == "")
            return 0;

        int y = Integer.parseInt((String) x);
        if (y > 1000)
            return 0;
        if (y < 0 )
            throw new RuntimeException();
        return y;
    }
}
