package ru.netology.TheReasonToRest.services;
public class ShouldRestService {
    public int calculate (int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int balance = 0;

        for (int month = 0; month < 12; month++) {
            if (balance < threshold) {
                balance = balance + income - expenses;
            } else {
                balance = (balance - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}
