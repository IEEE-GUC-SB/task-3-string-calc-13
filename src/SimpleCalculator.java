import java.util.Arrays;

public class SimpleCalculator {

    int add(String numbers) throws Exception{

        String delimiters = ",|\n";
        if (numbers.charAt(0) == '/')
            if (numbers.contains("[")) {
                delimiters += "|" + numbers.substring(3, numbers.indexOf("]"));
                numbers = numbers.substring(numbers.indexOf("]") + 2);
            }
            else {
                delimiters += numbers.charAt(2);
                numbers = numbers.substring(4);
            }

        String[] strArr = numbers.split("[" + delimiters + "]");
        Object[] intArr = Arrays.stream(strArr).map(SimpleCalculator::parseString).toArray();
        for (Object num : intArr)
            if ((int) num < 0)
                throw new Exception();

        int res = (int) Arrays.stream(intArr).reduce(0, (x, y) -> (int) x + (int) y);
        return res;
    }

    static int parseString(Object x){
        if (x == "")
            return 0;

        int y = Integer.parseInt((String) x);
        if (y > 1000)
            return 0;

        return y;
    }
}
