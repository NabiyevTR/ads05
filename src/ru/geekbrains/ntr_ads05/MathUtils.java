package ru.geekbrains.ntr_ads05;

import java.text.DecimalFormat;

public class MathUtils {
    public static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * pow(base, exponent - 1);
        } else {
            return (1 / base) * pow(base, exponent + 1);
        }
    }

    public static void powAndDisplay(double base, int exponent) {
        double result  = pow(base, exponent);
        DecimalFormat df = new DecimalFormat("0.######");
        System.out.printf("%s в степени %s = %s\n",
                df.format(base), df.format(exponent), df.format(result));
    }
}
