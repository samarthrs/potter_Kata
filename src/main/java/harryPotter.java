import java.util.HashMap;

public class harryPotter {

    public static final int EACH_BOOK_PRICE = 8;

    public static double calculateBestPrice(Integer... books){

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book)+1);

            else
                myMap.put(book, 1);
        }

        System.out.print("Values in the Map are : " + myMap.values() + "\n");
        System.out.println("Size of the Map is : " + myMap.size());

        Integer myBookCopies = myMap.get(books[0]);
        System.out.println(myBookCopies);

        if (myBookCopies > 1)
            return EACH_BOOK_PRICE * myBookCopies;

        else
            return EACH_BOOK_PRICE;

    }
}