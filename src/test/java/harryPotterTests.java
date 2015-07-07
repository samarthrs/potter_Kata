import org.junit.Test;

import static org.junit.Assert.*;

public class harryPotterTests {

    private static final int EACH_BOOK_PRICE = 8;
    private static final double DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS = 7.60;
    private static final double DELTA = 0.001;
    private static final double DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS = 7.20;
    private static final double DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS = 6.40;
    private static final double DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS = 6.00;

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
    public void whenFirstAndSecondBookCopiesIsOneAndRestAreNoneThenFivePercentDiscountIsAppliedS()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1), DELTA);
    }

    @Test
    public void whenFirstAndSecondBookCopiesAreTwoAndRestAreNoneThenFivePercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2 * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 0, 1), DELTA);
    }

    @Test
    public void whenFourthAndFifthBookCopiesAreThreeAndRestAreNoneThenFivePercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 3 * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(3, 4, 3, 3, 4, 4), DELTA);
    }

    @Test
    public void whenFirstSecondThirdBooksAreOneAndRestAreNoneThenTenPercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * 3;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 2), DELTA);
    }

    @Test
    public void whenFourthAndFifthAndSecondBooksAreTwoAndRestAreNoneThenTenPercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * 3 * 3;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 2, 3, 1, 3, 2, 3, 2, 1), DELTA);
    }

    @Test
    public void whenFirstSecondThirdFourthBooksAreOneAndRestAreNoneThenTwentyPercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS * 4;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 2, 3), DELTA);
    }

    @Test
    public void whenFirstSecondThirdFourthBooksAreTwoAndRestAreNoneThenTwentyPercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS * 4 * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 0, 1, 1, 2, 2, 3, 3), DELTA);
    }

    @Test
    public void whenAllFiveBooksArePurchasedThenTwentyFivePercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS * 5;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 2, 3, 4), DELTA);
    }

    @Test
    public void whenAllFiveBooksArePurchasedThriceThenTwentyFivePercentDiscountIsApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS * 5 * 3;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 0, 1, 2, 3, 4), DELTA);
    }

    @Test
    public void whenAllFiveBooksAreAreNoneThenZeroPercentDiscountIsAppliedAndPriceShouldBeZero()
    {
        double expectedPrice = 0;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(), DELTA);
    }

    @Test
    public void whenFirstBookisOneSecondBooksAreTwoThenFivePercentDiscountOnTwoAndZeroOnOneShouldBeApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2 + EACH_BOOK_PRICE;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 1), DELTA);
    }

    @Test
    public void whenFirstBookisOneSecondBooksIsTwoThirdBookIsThreeThenTenPercentDiscountOnThreeAndFivePercentOnTwoAndZeroOnOneShouldBeApplied()
    {
        double expectedPrice = DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * 3 + DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2 + EACH_BOOK_PRICE;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 1, 1, 2, 2, 2), DELTA);
    }

    @Test
    public void when1BookHas4CopiesAnother3Another2And1BookHas1CopyTheDiscountShouldBeAppliedAccordingly() {
        double expectedPrice = DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS * 4
                + DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * 3
                + DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * 2
                + EACH_BOOK_PRICE;

        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 2, 3, 4, 3, 2, 1, 2, 1, 1), DELTA);
    }

//    @Test
//    public void lastCase() {
//        double expectedPrice = DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS * 5 * 4
//                + DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * 3;
//
//        double expectedPrice = 141.2;
//        assertEquals(expectedPrice, harryPotter.calculateBestPrice(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4), DELTA);
//    }



    }