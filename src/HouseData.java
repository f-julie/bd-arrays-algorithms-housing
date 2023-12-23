import java.text.DecimalFormat;

public class HouseData {

    // Instance variables for the arrays.


    public static void main(String[] args) {
        HouseData houseData = new HouseData();

        /* Uncomment when cityWithMostSales is finished.
        String cityWithMostSales = houseData.cityWithMostSales();
        System.out.println("The city with the most sales was: " + cityWithMostSales);
        System.out.println();
        */

        /* Uncomment when getCityIndex is finished.
        int cityIndexSpringfield = houseData.getCityIndex("Springfield");
        System.out.println("Springfield's index is " + cityIndexSpringfield);
        int cityIndexMadison = houseData.getCityIndex("Madison");
        System.out.println("Madison's index is " + cityIndexMadison);
        int cityIndexRiverside = houseData.getCityIndex("Riverside");
        System.out.println("Riverside's index is " + cityIndexRiverside);
        System.out.println();
        */

        /* Uncomment when averagePriceInCity is finished.
        double averagePriceInArlington = roundToOneDecimal(houseData.averagePriceInCity("Arlington"));
        System.out.println("Arlington's average housing price was: " + averagePriceInArlington + "k");
        double averagePriceInAshland = roundToOneDecimal(houseData.averagePriceInCity("Ashland"));
        System.out.println("Ashland's average housing price was: " + averagePriceInAshland + "k");
        System.out.println();
        */

        /* Uncomment when averageOfAllHouses is finished.
        double averagePrice = roundToOneDecimal(houseData.averageOfAllHouses());
        System.out.println("Average housing price was: " + averagePrice + "k");
        System.out.println();
        */

        /* Uncomment when getMostExpensiveHouse is finished.
        double mostExpensivePrice = houseData.getMostExpensiveHouse();
        System.out.println("The most expensive house was: " + mostExpensivePrice + "k");
        System.out.println();
        */

        /* Uncomment when getMostExpensiveHouse is finished.
        System.out.println("All Houses Sold");
        houseData.printAllPrices();
        System.out.println();
        */

        /* Uncomment when loanBalance is finished.
        double[] balances = houseData.loanBalance(340.5, 3.2);
        System.out.printf("%5s %-7s%n", "Month", "Balance");
        for (int i = 0; i < balances.length; i++) {
            System.out.printf("%-5d %7.1f%n", i + 1, balances[i]);
        }
        */
    }


    /**
     * Retrieves the name of the city which had the most sales.
     * If more than one city ties, retrieves any one of those tied cities names.
     * @return the name of the city with the most houses sold
     */
    public String cityWithMostSales() {
        return null;
    }

    /**
     * Retrieves the index of the city with the given cityName.
     * @param cityName the name of the city to search for
     * @return the index the city is in, or -1 if it is not present
     */
    public int getCityIndex(String cityName) {
        return 0;
    }

    /**
     * Calculates the average prices of houses sold in a given city.
     * @param cityName the name of the city
     * @return the average price of all houses sold in the given city, or 0.0 if the city is not found
     */
    public double averagePriceInCity(String cityName) {
        return 0;
    }

    /**
     * Calculates the average price from all houses sold.
     * @return the average price of all houses
     */
    public double averageOfAllHouses() {
        return 0;
    }

    /**
     * Calculates the single most expensive house from all houses
     * @return the price of the most expensive house
     */
    public double getMostExpensiveHouse() {
        return 0;
    }

    /**
     * Prints all the housing data.
     * Each row will begin with the name of the city,
     * followed by a "[", then followed by the prices
     * of each house separated by ", " and will end
     * with a "]".
     */
    public void printAllPrices() {

    }

    /**
     * Generates an array showing the loan balance.
     * Each index of the array represents the remaining
     * balance after paying the monthly payment.
     * @param loanAmount the original value of the loan
     * @param monthlyPayment how much is paid each month
     * @return an array of the remaining loan balance, index 0 represents amount of loan left after 1 payment
     */
    public double[] loanBalance(double loanAmount, double monthlyPayment) {
        return null;
    }









    // This helper method has been written to allow the printing of results to be nicer.

    /**
     * Rounds a given value to a single decimal place.
     * @param value the value to round
     * @return the rounded value
     */
    public static double roundToOneDecimal(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        return Double.valueOf(decimalFormat.format(value));
    }
}
