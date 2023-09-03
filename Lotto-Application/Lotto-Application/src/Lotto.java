public class Main {
    public static void main(String[] args) {
 int lotto = (int)(Math.random() * 1000.0);
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter your lotto number. Three numbers only");
        int guess = numbers.nextInt();
        int num1 = lotto % 100;
        int num2 = lotto % 100 / 10;
        int num3 = lotto / 100;
        int guessNum1 = guess % 100;
        int guessNum2 = guess % 100 / 10;
        int guessNum3 = guess / 100;
        System.out.println("The lottery numbers are: " + lotto);
        if (guess == lotto) {
            System.out.println("Exact Match!!! 10,000$ Prize!!!");
        } else if (guessNum2 == num1 && guessNum1 == num2 && guessNum3 == num3) {
            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
        } else if (guessNum1 != num1 && guessNum1 != num2 && guessNum1 != num3 && guessNum2 != num1 && guessNum2 != num2 && guessNum2 != num3 && guessNum3 != num1 && guessNum3 != num2 && guessNum3 != num3) {
            System.out.println("No Match, Better Luck Next Time!");
        } else {
            System.out.println("Matched one number!!! 1,000$ Prize!!!");
    }
}
