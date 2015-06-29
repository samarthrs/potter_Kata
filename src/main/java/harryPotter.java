public class harryPotter {

    public static final int EACH_BOOK_PRICE = 8;
    public static final double DISCOUNT_FOR_TWO = 0.95;

    public static double calculateBestPrice (int firstBookCopies, int secondBookCopies)
    {
        double totalPrice = 0;

        int bookCopies[] = {firstBookCopies, secondBookCopies};

        if (bookCopies[0] != 0 && bookCopies[1] == 0){
            totalPrice = EACH_BOOK_PRICE * bookCopies[0];
        }

        else if (bookCopies[1] != 0 && bookCopies[0] == 0){
            totalPrice = EACH_BOOK_PRICE * bookCopies[1];
        }

        else{
            totalPrice = (EACH_BOOK_PRICE * DISCOUNT_FOR_TWO * (bookCopies[0] + bookCopies[1]));
        }

        return totalPrice;
    }
}