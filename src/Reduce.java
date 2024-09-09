public class Reduce {

    public static void main(String[] args) {

        int n = 0;
        int i = 100;
        while (i > 0) {

            // Find out whether i is odd or even.
            boolean even = i % 2 == 0;

            // Complete a step based on whether i is odd or even.
            if (even) {

                i = i / 2;

            } else {

                i = i - 1;

            }

            // Add a step to the step counter.
            n++;
        }

        System.out.println(n);
    }
}
