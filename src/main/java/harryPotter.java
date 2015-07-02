import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class harryPotter {

    private static final int EACH_BOOK_PRICE = 8;
    private static final double DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS = 7.60;
    private static final double DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS = 7.20;
    public static final double DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS = 6.40;
    public static final double DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS = 6.00;
    private static double finalDiscountedPrice = 0.000;
    private static Integer myBookCopies = 0;

    public static double calculateBestPrice(Integer... books){

        Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

        mapMyBooksWithNumberOfCopies(myMap, books);

        if (myMap.size() == 1)
        {
            finalDiscountedPrice = whenSizeIsOne(myMap);
        }

        if (myMap.size() == 2)
        {
            finalDiscountedPrice = whenSizeIsTwo(myMap);
        }

        if (myMap.size() == 3)
        {
            finalDiscountedPrice = whenSizeIsThree(myMap);
        }

        if (myMap.size() == 4)
        {
            finalDiscountedPrice = whenSizeIsFour(myMap);
        }

        if (myMap.size() == 5)
        {
            finalDiscountedPrice = whenSizeIsFive(myMap);
        }

        return finalDiscountedPrice;

    }

    private static void mapMyBooksWithNumberOfCopies(Map<Integer, Integer> myMap, Integer books[])
    {
        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book)+1);
            else
                myMap.put(book, 1);
        }
    }


    private static double whenSizeIsOne(Map<Integer, Integer> size1Map)
    {
        myBookCopies = Collections.min(size1Map.values());
        return (myBookCopies > 1) ? EACH_BOOK_PRICE * myBookCopies : EACH_BOOK_PRICE;
    }

    private static double whenSizeIsTwo(Map<Integer, Integer> size2Map)
    {
        myBookCopies = Collections.min(size2Map.values());
        return (myBookCopies > 1) ? DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * myBookCopies * size2Map.size():
                                    DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * size2Map.size();
    }

    private static double whenSizeIsThree(Map<Integer, Integer> size3Map)
    {
        myBookCopies = Collections.min(size3Map.values());
        return (myBookCopies > 1) ? DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * myBookCopies * size3Map.size():
                DISCOUNTED_PRICE_FOR_THREE_DIFFERENT_BOOKS * size3Map.size();
    }

    private static double whenSizeIsFour(Map<Integer, Integer> size4Map)
    {
        myBookCopies = Collections.min(size4Map.values());
        return (myBookCopies > 1) ? DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS * myBookCopies * size4Map.size():
                DISCOUNTED_PRICE_FOR_FOUR_DIFFERENT_BOOKS * size4Map.size();
    }

    private static double whenSizeIsFive(Map<Integer, Integer> size5Map)
    {
        myBookCopies = Collections.min(size5Map.values());
        return (myBookCopies > 1) ? DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS * myBookCopies * size5Map.size():
                DISCOUNTED_PRICE_FOR_FIVE_DIFFERENT_BOOKS * size5Map.size();
    }



}