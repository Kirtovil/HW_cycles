package ru.netology.services;

public class WorkOrRestService {

    public int calcCash(int income, int expense, int threshold) {
        int cash = 0;
        int vacationManth = 12;
        for (int month = 1; month <= 12; month++) {
            if (cash < threshold) {
                vacationManth--;
                cash = cash + income - expense;
            } else {
                int vacationExpense = (cash - expense) - ((cash - expense) / 3);
                cash = cash - expense - vacationExpense;
            }
        }
        return vacationManth;
    }
}
