import org.junit.Test;

import static org.junit.Assert.*;

public class harryPotterTests {

    public static final int EACH_BOOK_PRICE = 8;
    private static final double DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS = 7.60;
    public static final double DELTA = 0.001;

    @Test
    public void whenFirstBookCopyIsOneAndRestAreNoneThenNoDiscountIsApplied()
    {
        double expectedPrice = EACH_BOOK_PRICE;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1), DELTA);

    }

    @Test
    public void whenFirstBookCopiesAreTwoAndRestAreNoneThenNoDiscountIsApplied()
    {
        double expectedPrice = EACH_BOOK_PRICE * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 1), DELTA);
    }


    @Test
    public void whenFirstBookCopiesAreThreeAndRestAreNoneThenNoDiscountIsApplied()
    {
        double expectedPrice = EACH_BOOK_PRICE * 3;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 1, 1), DELTA);
    }

    @Test
    public void whenFirstAndSecondBookCopiesAreOneAndRestAreNoneThenFivePercentDiscountForBoth()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1), DELTA);
    }

    @Test
    public void whenSecondAndThirdBookCopiesAreOneAndRestAreNoneThenFivePercentDiscountForBoth()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 2), DELTA);
    }

    @Test
    public void whenThirdAndFourthBookCopiesAreOneAndRestAreNoneThenFivePercentDiscountForBoth()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(2, 3), DELTA);
    }

    @Test
    public void whenFourthAndFifthBookCopiesAreOneAndRestAreNoneThenFivePercentDiscountForBoth()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(3, 4), DELTA);
    }

    @Test
    public void whenFifthAndFirstBookCopiesAreOneAndRestAreNoneThenFivePercentDiscountForBoth()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(4, 1), DELTA);
    }



}