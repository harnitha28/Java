import java.util.Scanner;
class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int order = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, order);
            temp = temp / 10;
        }
            System.out.println("The Armstrong number"+num);
    }
}