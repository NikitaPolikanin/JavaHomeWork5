package ru.netology.services;

public class FreelancerRestService {

    public int calculate(int income, int expenses, int threshold) {
        int cash = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (cash >= threshold) {
                cash = cash - expenses;
                cash = cash / 3;
                counter = counter + 1;
            } else {
                cash = cash + income;
                cash = cash - expenses;
            }

        }
        return counter;
    }
}
