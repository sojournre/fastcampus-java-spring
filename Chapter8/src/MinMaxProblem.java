public class MinMaxProblem {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minPos = i;
            }

            if (max < numbers[i]) {
                max = numbers[i];
                maxPos = i;
            }
        }

        System.out.println("가장 큰 값은 " + max + "이고 maxPos = " + maxPos);
        System.out.println("가장 작은 값은 " + min + "이고 maxPos = " + minPos);
        System.out.println(5/2);
    }
}
