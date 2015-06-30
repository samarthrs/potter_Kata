import org.junit.Test;

import static org.junit.Assert.*;

public class harryPotterTests {

    public static final int EACH_BOOK_PRICE = 8;
    public static final double DELTA = 0.001;

    @Test
    public void whenFirstBookCopyIsOneAndRestAreNone()
    {
        double expectedPrice = EACH_BOOK_PRICE;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1), DELTA);

    }

    @Test
    public void whenFirstBookCopiesAreTwoAndRestAreNone()
    {
        double expectedPrice = EACH_BOOK_PRICE * 2;
        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 1), DELTA);
    }


//    @Test
//    public void whenFirstBookCopiesAreThreeAndRestAreNone()
//    {
//        double expectedPrice = EACH_BOOK_PRICE * 3;
//        assertEquals(expectedPrice, harryPotter.calculateBestPrice(3, 0), DELTA);
//    }
//
//    @Test
//    public void whenFirstAndSecondBookCopiesAreOneAndRestAreNone()
//    {
//        double expectedPrice = EACH_BOOK_PRICE * 2 * 0.95;
//        assertEquals(expectedPrice, harryPotter.calculateBestPrice(1, 1), DELTA);
//    }
//
//    @Test
//    public void whenFirstAndSecondBookCopiesAreTwoAndRestAreNone()
//    {
//        double expectedPrice = EACH_BOOK_PRICE * 4 * 0.95;
//        assertEquals(expectedPrice, harryPotter.calculateBestPrice(2, 2), DELTA);
//    }

//    @Test
//    public void whenFirstIsThreeAndSecondIsTwoAndRestAreNone()
//    {
//        double expectedPrice = EACH_BOOK_PRICE * 4 * 0.95 + EACH_BOOK_PRICE * 1;
//        assertEquals(expectedPrice, harryPotter.calculateBestPrice(3, 2), DELTA);
//    }


}