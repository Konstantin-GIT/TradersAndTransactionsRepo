package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Main class for this test Application!
 */
public class App {
    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    //TODO 1)Найти все транзакции за 2012-й год и отсортировать их по сумме(от меньшей к большей)
    public List<Transaction> task1(
            List<Transaction> transactions, int year) {
        return null;
    }

    //TODO 2)Найти список неповторяющихся городов, в которых работают трейдеры
    public List<String> task2(List<Transaction> transactions) {
        return null;
    }

    //TODO 3)Найти всех трейдеров из Кембриджа и отсортировать их по имени
    public List<Trader> task3(List<Transaction> transactions, String city) {
        return null;
    }

    //TODO 4)Вернуть строку со всеми именами трейдеров, отсортированных в алфавитном порядке
    public String task4(List<Transaction> transactions) {
        return null;
    }

    //TODO 5)Выяснить, существует ли хоть один трейдер из Милана
    public Boolean task5(List<Transaction> transactions, String city) {
        return null;
    }

    //TODO 6)Найти сумму всех транзакций трейдеров из Кембриджа
    public int task6(List<Transaction> transactions, String city) {

        return 0;
    }

    //TODO 7)Вывести максимальную сумму среди всех транзакций
    public int task7(List<Transaction> transactions) {

        return 0;
    }

    //TODO 8)Найти транзакцию с минимальной суммой
    public Transaction task8(List<Transaction> transactions) {

        return null;
    }

}
