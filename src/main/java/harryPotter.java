import java.util.LinkedHashMap;
import java.util.Map;

public class harryPotter {

    private static final int EACH_BOOK_PRICE = 8;
    private static final double DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS = 7.60;
    private static double finalDiscountedPrice = 0.000;
    private static Integer myBookCopies = 0;

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

    public static double calculateBestPrice(Integer... books){

        Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

        mapMyBooksWithNumberOfCopies(myMap, books);

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet())
        {
            myBookCopies = entry.getValue();

            if (myMap.size() == 1)
            {
                finalDiscountedPrice = (myBookCopies > 1) ? EACH_BOOK_PRICE * myBookCopies : EACH_BOOK_PRICE;
            }

            if (myMap.size() == 2)
            {
                finalDiscountedPrice = DISCOUNTED_PRICE_FOR_TWO_DIFFERENT_BOOKS * myMap.size();
            }
        }

        return finalDiscountedPrice;

    }
}