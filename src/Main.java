public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean isSum1Greater = sum1 > sum2;
        System.out.println("Is sum1 greater than sum2? " + isSum1Greater);

        sum1 += 1;
        sum2 -= 2;

        isSum1Greater = sum1 > sum2;
        System.out.println("Is sum1 greater than sum2 after modification? " + isSum1Greater);

        boolean isAtLeastOneSumEven = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Is at least one sum even? " + isAtLeastOneSumEven);
    }
}