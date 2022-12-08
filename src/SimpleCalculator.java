public class SimpleCalculator {

    int add(String numbers){
        int res = Character.getNumericValue(numbers.charAt(0)) + Character.getNumericValue(numbers.charAt(2));
        return res;
    }
}
