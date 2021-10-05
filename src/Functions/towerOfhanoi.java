package Functions;

public class towerOfhanoi {

    public static void towersOfHanoi(int n,
                                     String from,
                                     String to,
                                     String temp) {
        if (n == 1) {
            System.out.printf("Moving disc 1 from %s to %s\n", from, to);
            return;
        }
        towersOfHanoi(n - 1, from, temp, to);
        System.out.printf("Moving disc %d from %s to %s\n", n, from, to);
        towersOfHanoi(n - 1, temp, to, from);
    }
    public static void main(String[] args) {
        towersOfHanoi(5, "A", "C", "B");
    }

}
