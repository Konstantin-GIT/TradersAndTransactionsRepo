package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit tests for class {@link App}.
 */
public class AppTest {

    App underTest = new App();

    private static Trader RAOUL = new Trader("Raoul", "Cambridge");
    private static Trader MARIO = new Trader("Mario", "Milan");
    private static Trader ALAN = new Trader("Alan", "Cambridge");
    private static Trader BRIAN = new Trader("Brian", "Cambridge");

    @Test
    public void testForTask1() {
        List<Transaction> transactions = getTransactions();
        List<Transaction> result = underTest
                .task1(transactions, 2012);

        Assertions.assertAll(
                () -> Assertions.assertEquals(result.size(), 4),
                () -> Assertions.assertEquals(result.get(0),
                        new Transaction(MARIO, 2012, 700)),
                () -> Assertions.assertEquals(result.get(1),
                        new Transaction(MARIO, 2012, 710)),
                () -> Assertions.assertEquals(result.get(2),
                        new Transaction(ALAN, 2012, 950)),
                () -> Assertions.assertEquals(result.get(3),
                        new Transaction(RAOUL, 2012, 1000))
        );
    }

    @Test
    public void testForTask2() {
        List<Transaction> transactions = getTransactions();
        List<String> result = underTest.task2(transactions);
        Assertions.assertAll(
                () -> Assertions.assertEquals(result.size(), 2),
                () -> Assertions.assertEquals(result.get(0), "Cambridge"),
                () -> Assertions.assertEquals(result.get(1), "Milan")
        );
    }
    //TODO Write correct unit test for task3
    @Test
    public void testForTask3() {
        List<Transaction> transactions = getTransactions();
        List<Trader> result = underTest.task3(transactions, "Cambridge");
        Assertions.assertAll(
                () -> Assertions.assertEquals(result.size(),4),
                () -> Assertions.assertEquals(result.get(0).getName(),"Alan"),
                () -> Assertions.assertEquals(result.get(1).getName(),"Brian"),
                () -> Assertions.assertEquals(result.get(2).getName(),"Raoul")
        );
    }
    //TODO Write correct unit test for task4
    @Test
    public void testForTask4() {
        List<Transaction> transactions = getTransactions();
        String result = underTest.task4(transactions);

        Assertions.assertEquals(result, "Alan, Brian, Mario, Mario, Raoul, Raoul");
    }
    //TODO Write correct unit test for task5
    @Test
    public void testForTask5() {
        List<Transaction> transactions = getTransactions();
        Boolean result = underTest.task5(transactions, "Milan");
        Assertions.assertEquals(result, true);
    }
    //TODO Write correct unit test for task6
    @Test
    public void testForTask6() {
        List<Transaction> transactions = getTransactions();
        int result = underTest.task6(transactions, "Cambridge");

        Assertions.assertEquals(result, 2650);
    }
    //TODO Write correct unit test for task7
    @Test
    public void testForTask7() {
        List<Transaction> transactions = getTransactions();
        int result = underTest.task7(transactions);
        Assertions.assertEquals(result, 1000);
    }
    //TODO Write correct unit test for task8
    @Test
    public void testForTask8() {
        Transaction actual = new Transaction(BRIAN, 2011, 300);
        List<Transaction> transactions = getTransactions();
        Transaction result = underTest.task8(transactions);
        Assertions.assertEquals(result, actual);
    }

    public List<Transaction> getTransactions() {
        return Arrays.asList(
                new Transaction(BRIAN, 2011, 300),
                new Transaction(RAOUL, 2012, 1000),
                new Transaction(RAOUL, 2011, 400),
                new Transaction(MARIO, 2012, 710),
                new Transaction(MARIO, 2012, 700),
                new Transaction(ALAN, 2012, 950)
        );
    }
}
