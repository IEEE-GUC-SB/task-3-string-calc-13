public class SimpleCalculator {

    int add(String numbers){
        String[] intArr = numbers.split(",");
        int fNumber = Character.getNumericValue(numbers.charAt(0));
        int sNumber = Character.getNumericValue(numbers.charAt(2));
        int res = fNumber + sNumber;
        return res;
    }
}
