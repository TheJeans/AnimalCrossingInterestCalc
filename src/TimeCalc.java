public class TimeCalc {
    public static void print(int startBalance, int endBalance) {
        /**
         * calculates how many years and months it takes to get to endBalance
         * & prints the results
         */
        int time = calcTime(startBalance,endBalance);
        System.out.println("It would take "+years(time)+" years and "+months(time)+" months.");
    }

    private static int calcTime(int startBalance, int endBalance){
        /*
          calculates total number of months
         */
        int month = 0;
        while (startBalance<endBalance){
            month++;
            startBalance+=startBalance*0.05;
        }
        return month;
    }

    private static int years(int time) {
        /*
           takes the total time (in months) and turns it into the equivalent in years
         */
        return time/12;
    }

    private static int months(int time) {
        /*
           takes the leftover months after turning into years
         */
        return time-(years(time)*12);
    }

}