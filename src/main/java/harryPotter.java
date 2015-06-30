import java.util.LinkedHashMap;
import java.util.Map;

public class harryPotter {

    public static final int EACH_BOOK_PRICE = 8;
    public static double finalDiscountedPrice = 0.000;

    public static double calculateBestPrice(Integer... books){

        Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book)+1);

            else
                myMap.put(book, 1);
        }

        System.out.print("Values in the Map are : " + myMap.values() + "\n");
        System.out.println("Size of the Map is : " + myMap.size());

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet())
        {
            Integer myBookCopies = entry.getValue();

            if (myBookCopies > 1)
                finalDiscountedPrice = EACH_BOOK_PRICE * myBookCopies;

            else
                finalDiscountedPrice = EACH_BOOK_PRICE;

        }

        return finalDiscountedPrice;

    }
}