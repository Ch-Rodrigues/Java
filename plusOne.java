import java.util.Arrays;

public class plusOne {

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{2, 4, 9}))); 
        System.out.println(Arrays.toString(plusOne(new int[]{1, 8, 9})));  
        System.out.println(Arrays.toString(plusOne(new int[]{8, 8})));    
}
}
