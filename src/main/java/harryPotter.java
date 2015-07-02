import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class harryPotter {

    private static double finalDiscountedPrice = 0.000;
    private static Integer minValueInBookCopies = 0;

    private static Map<Integer,Double> mapMyPricesForDiscounts = new HashMap<>();
    static{
        mapMyPricesForDiscounts.put(0, 0.00);
        mapMyPricesForDiscounts.put(1, 8.00);
        mapMyPricesForDiscounts.put(2, 7.60);
        mapMyPricesForDiscounts.put(3, 7.20);
        mapMyPricesForDiscounts.put(4, 6.40);
        mapMyPricesForDiscounts.put(5, 6.00);
    }

    public static double calculateBestPrice(Integer... books)
    {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        mapMyBooksWithNumberOfCopies(myMap, books);
        finalDiscountedPrice = genericPriceCalculatorBasedOnMapSize(myMap);
        return finalDiscountedPrice;
    }

    private static void mapMyBooksWithNumberOfCopies(Map<Integer, Integer> myMap, Integer books[])
    {
        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book) + 1);
            else
                myMap.put(book, 1);
        }
    }

    private static double genericPriceCalculatorBasedOnMapSize(Map<Integer, Integer> nSizeMap)
    {
        double tempDiscountedPrice = 0.000;

        if (nSizeMap.size() != 0)
        {
            tempDiscountedPrice = calculateDiscountedPriceForBooksPurchased(nSizeMap);
            return tempDiscountedPrice;
        }

        else
            return tempDiscountedPrice;
    }

    private static double calculateDiscountedPriceForBooksPurchased(Map<Integer, Integer> sizedMap)
    {
        double sizedDiscountedPrice = 0.000;

        while (sizedMap.size() != 0) {
            minValueInBookCopies = Collections.min(sizedMap.values());

            sizedDiscountedPrice += (minValueInBookCopies > 1) ? mapMyPricesForDiscounts.get(sizedMap.size()) * minValueInBookCopies * sizedMap.size() :
                    mapMyPricesForDiscounts.get(sizedMap.size()) * sizedMap.size();

            sizedMap = sizedMap.entrySet().stream().filter(entry -> entry.getValue() - minValueInBookCopies > 0)
                    .collect(Collectors.toMap(entry2 -> entry2.getKey(), entry2 -> entry2.getValue() - minValueInBookCopies));
        }

        return sizedDiscountedPrice;
    }

}