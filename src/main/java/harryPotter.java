import java.util.LinkedHashMap;
import java.util.Map;

public class harryPotter {

    public static final int EACH_BOOK_PRICE = 8;
    public static double finalDiscountedPrice = 0.000;
    public static Integer myBookCopies = 0;

    public static double calculateBestPrice(Integer... books){

        Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book)+1);
            else
                myMap.put(book, 1);
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet())
        {
            myBookCopies = entry.getValue();
            finalDiscountedPrice = (myBookCopies > 1) ? EACH_BOOK_PRICE * myBookCopies : EACH_BOOK_PRICE;
        }

        return finalDiscountedPrice;

    }
}