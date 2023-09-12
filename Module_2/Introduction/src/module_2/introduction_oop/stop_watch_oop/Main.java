package module_2.introduction_oop.stop_watch_oop;

public class Main {
    public static void main(String[] args) {
        double[] arrNumber = new double[100000];
        for (int i = 0; i < arrNumber.length; i++){
            arrNumber[i] = Math.random();
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int n = arrNumber.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arrNumber[j] < arrNumber[min_idx])
                    min_idx = j;
            }
            double temp = arrNumber[min_idx];
            arrNumber[min_idx] = arrNumber[i];
            arrNumber[i] = temp;
        }
        stopWatch.stop();
        System.out.println("The algorithm need " + stopWatch.getElapsedTime() + " milliseconds to finish");
    }
}
