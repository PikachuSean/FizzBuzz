public class Multiples {

    public static void main(String[] args) {

        int n = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out whether i is divisible by 3 or 5.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Check if i is divisible by at least one of 3 or 5
            if (divisibleBy3 || divisibleBy5) {

                n++;

            }
        }

        System.out.println(n);
    }
}
