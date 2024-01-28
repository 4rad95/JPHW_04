package de.telran.task1;

public class Util {

    public double avg(int num, int num1) {
        return (double) (num+num1)/2;
    }
    public double avg(double num, double num1) {
        return (double) (num+num1)/2;
    }
    public double avg(int num, double num1) {
        return (double) (num+num1)/2;
    }
    public double avg(double[] num) {
        double summa = 0;
        for (int i = 0; i < num.length; i++) {
            summa = summa+num[i];
        }
        return (double) (summa)/ num.length;
    }
    public int min(int num, int num1) {
        if (num>num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double min(double num, double num1) {
        if (num>num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double min(int num, double num1) {
        if (num>num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double min(double[] num) {
        double min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min >num[i]) {
                min = num[i];
            }
        }
        return min;
    }
    public int max (int num, int num1) {
        if (num < num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double max (double num, double num1) {
        if (num < num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double max(int num, double num1) {
        if (num < num1) {
            return num1;
        }
        else {
            return num;
        }
    }
    public double max(double[] num) {
        double max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }
}

