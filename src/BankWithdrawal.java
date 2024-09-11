public class BankWithdrawal {

    public static int daysToWithdraw(int n) {
        int days = 0;

        while (n > 0) {
            int maxDivisor = 1;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    maxDivisor = i;
                }
            }

            n -= maxDivisor;
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        int n = 21;
        int result = daysToWithdraw(n);
        System.out.println("Число дней, необходимых для снятия всех денег: " + result);
    }
}
