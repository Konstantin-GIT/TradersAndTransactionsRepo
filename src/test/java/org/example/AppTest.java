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

    //TODO Write correct unit test for task2
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
    public void testForTas3() {
        Assertions.assertEquals(true, false);
    }
    //TODO Write correct unit test for task4
    @Test
    public void testForTask4() {
        Assertions.assertEquals(true, false);
    }
    //TODO Write correct unit test for task5
    @Test
    public void testForTask5() {
        Assertions.assertEquals(true, false);
    }
    //TODO Write correct unit test for task6
    @Test
    public void testForTask6() {
        Assertions.assertEquals(true, false);
    }
    //TODO Write correct unit test for task7
    @Test
    public void testForTask7() {
        Assertions.assertEquals(true, false);
    }
    //TODO Write correct unit test for task8
    @Test
    public void testForTask8() {
        Assertions.assertEquals(true, false);
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
