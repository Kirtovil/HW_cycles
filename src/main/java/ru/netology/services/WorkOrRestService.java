package ru.netology.services;

public class WorkOrRestService {

    public int calcCash(int income, int expense, int threshold) {
        int cash = 0;
        int vacationManth = 12;
        for (int month = 1; month <= 12; month++) {
            if (cash < threshold) {
                vacationManth--;
                System.out.println("Месяц " + month + ". денег " + cash + ". Придётся работать. Заработал +" + income + ", потратил -" + expense);
                cash = cash + income - expense;
            } else {
                int vacationExpense = (cash - expense) - ((cash - expense) / 3);
                System.out.println("Месяц " + month + ". Денег " + cash + ". Буду отдыхать. Потратил -" + expense + ", затем ещё -" + vacationExpense);
                cash = cash - expense - vacationExpense;
            }
        }
        return vacationManth;
    }
}
