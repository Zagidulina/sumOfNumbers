public class sumOfNumbers {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;

        while (c < 100) {
            c++;

            if ((c % 3) == 0)
                continue;
            sum += c;

        }

        System.out.println(sum);

    }
}


