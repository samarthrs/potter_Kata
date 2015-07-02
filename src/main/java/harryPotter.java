import java.util.Collections;
import java.util.HashMap;
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

    private static Map<Integer,Double> mapMyPricesForDiscounts = new HashMap<>();
    static{
        mapMyPricesForDiscounts.put(1, 8.00);
        mapMyPricesForDiscounts.put(2, 7.60);
        mapMyPricesForDiscounts.put(3, 7.20);
        mapMyPricesForDiscounts.put(4, 6.40);
        mapMyPricesForDiscounts.put(5, 6.00);
    }

    public static double calculateBestPrice(Integer... books){

        Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

        mapMyBooksWithNumberOfCopies(myMap, books);

        finalDiscountedPrice = genericPriceCalculatorBasedOnMapSize(myMap);

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

    private static double genericPriceCalculatorBasedOnMapSize(Map<Integer, Integer> nSizeMap)
    {
        myBookCopies = Collections.min(nSizeMap.values());

        return (myBookCopies > 1) ? mapMyPricesForDiscounts.get(nSizeMap.size()) * myBookCopies * nSizeMap.size():
                                    mapMyPricesForDiscounts.get(nSizeMap.size()) * nSizeMap.size();

    }

}