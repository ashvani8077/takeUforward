package Arrays;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int profit[] = {25, 24, 15};
        int weight[] = {18, 15, 10};
        int capacity = 20;

        double ratio[] = new double[profit.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = (double) profit[i] / weight[i];
        }

        for (int i = 0; i < ratio.length - 1; i++) {
            for (int j = 0; j < ratio.length - 1 - i; j++) {
                if (ratio[j] < ratio[j + 1]) {
                    double tempRatio = ratio[j];
                    ratio[j] = ratio[j + 1];
                    ratio[j + 1] = tempRatio;

                    int tempProfit = profit[j];
                    profit[j] = profit[j + 1];
                    profit[j + 1] = tempProfit;

                    int tempWeight = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = tempWeight;
                }
            }
        }

        double totalProfit = 0;
        for (int i = 0; i < ratio.length; i++) {
            if (capacity == 0) break;

            if (weight[i] <= capacity) {
                capacity -= weight[i];
                totalProfit += profit[i];
            } else {
                totalProfit += profit[i] * ((double) capacity / weight[i]);
                capacity = 0;
            }
        }

        System.out.println("Maximum profit: " + totalProfit);
    }
}
