import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        long x, n, y, z = 0;
        x = scanner.nextLong();
        n = scanner.nextLong();

        y = n % 4;

        if (y == 1) {
            z = -n;
        } else if (y == 2) {
            z = 1;
        } else if (y == 3) {
            z = n + 1;
        }

        if ((x & 1) == 1) {
            System.out.println(x - z);
        } else {
            System.out.println(x + z);
        }
    }
}