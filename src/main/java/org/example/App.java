package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        return transactions.stream()
                .filter( transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    //TODO 2)Найти список неповторяющихся городов, в которых работают трейдеры
    public List<String> task2(List<Transaction> transactions) {
        return transactions.stream().
                map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    //TODO 3)Найти всех трейдеров из Кембриджа и отсортировать их по имени
    public List<Trader> task3(List<Transaction> transactions, String city) {

        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    //TODO 4)Вернуть строку со всеми именами трейдеров, отсортированных в алфавитном порядке
    public String task4(List<Transaction> transactions) {
        String sep = ", ";
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .collect(Collectors.joining(sep));
    }

    //TODO 5)Выяснить, существует ли хоть один трейдер из Милана
    public Boolean task5(List<Transaction> transactions, String city) {

        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));

    }

    //TODO 6)Найти сумму всех транзакций трейдеров из Кембриджа
    public int task6(List<Transaction> transactions, String city) {

        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(Transaction::getValue).mapToInt(a -> a).sum();
    }

    //TODO 7)Вывести максимальную сумму среди всех транзакций
    public int task7(List<Transaction> transactions) {

        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .max(Comparator.naturalOrder())
                .get();
    }

    //TODO 8)Найти транзакцию с минимальной суммой
    public Transaction task8(List<Transaction> transactions) {

        return transactions.stream()
                .sorted(Comparator.comparingInt(x -> x.getValue()))
                .findFirst().get();
    }

}
