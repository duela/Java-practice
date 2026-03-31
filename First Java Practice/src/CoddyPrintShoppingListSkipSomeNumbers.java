public class CoddyPrintShoppingListSkipSomeNumbers {
    public static void main(String[] args){
        // Write your loop here
        for (int i = 1; i <= 20 ; i++) {
            if (i == 4 || i == 13 || i == 17) {
                System.out.printf("Skipping unlucky number: %d%n", i);
                continue;
            }
            System.out.printf("Item #%d: Get this item!%n", i);
        }
    }
}
