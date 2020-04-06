public class Main {
    public static void main(String[] args) {
        IntroText.print();
        int startBalance = Console.intro("Enter the starting account balance: ",0,5_000_000);
        int endBalance = Console.intro("Enter the desired account balance: ",startBalance,100_000_000);
        TimeCalc.print(startBalance,endBalance);
    }
}
