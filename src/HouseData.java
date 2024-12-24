import java.text.DecimalFormat;

public class HouseData {

    // Instance variables for the arrays.
    private String[] cityNames = {"Fairview", "Springfield", "Arlington", "Madison"};

    private double[][] prices = {
            {545.5, 785.2, 824.4, 599.9},
            {499.5, 324.5, 1458.9},
            {800.0, 759.9, 725.0, 750.7, 825.9},
            {435.0, 459.4}
    };

    public static void main(String[] args) {
        HouseData houseData = new HouseData();

        //Uncomment when cityWithMostSales is finished.
        String cityWithMostSales = houseData.cityWithMostSales();
        System.out.println("The city with the most sales was: " + cityWithMostSales);
        System.out.println();

        //Uncomment when getCityIndex is finished.
        int cityIndexSpringfield = houseData.getCityIndex("Springfield");
        System.out.println("Springfield's index is " + cityIndexSpringfield);
        int cityIndexMadison = houseData.getCityIndex("Madison");
        System.out.println("Madison's index is " + cityIndexMadison);
        int cityIndexRiverside = houseData.getCityIndex("Riverside");
        System.out.println("Riverside's index is " + cityIndexRiverside);
        System.out.println();

        //Uncomment when averagePriceInCity is finished.
        double averagePriceInArlington = roundToOneDecimal(houseData.averagePriceInCity("Arlington"));
        System.out.println("Arlington's average housing price was: " + averagePriceInArlington + "k");
        double averagePriceInAshland = roundToOneDecimal(houseData.averagePriceInCity("Ashland"));
        System.out.println("Ashland's average housing price was: " + averagePriceInAshland + "k");
        System.out.println();

        //Uncomment when averageOfAllHouses is finished.
        double averagePrice = roundToOneDecimal(houseData.averageOfAllHouses());
        System.out.println("Average housing price was: " + averagePrice + "k");
        System.out.println();

        //Uncomment when getMostExpensiveHouse is finished.
        double mostExpensivePrice = houseData.getMostExpensiveHouse();
        System.out.println("The most expensive house was: " + mostExpensivePrice + "k");
        System.out.println();

        //Uncomment when getMostExpensiveHouse is finished.
        System.out.println("All Houses Sold");
        houseData.printAllPrices();
        System.out.println();

        //Uncomment when loanBalance is finished.
        double[] balances = houseData.loanBalance(340.5, 3.2);
        System.out.printf("%5s %-7s%n", "Month", "Balance");
        for (int i = 0; i < balances.length; i++) {
            System.out.printf("%-5d %7.1f%n", i + 1, balances[i]);
        }

    }

    /**
     * Retrieves the name of the city which had the most sales.
     * If more than one city ties, retrieves any one of those tied cities names.
     * @return the name of the city with the most houses sold
     */
    public String cityWithMostSales() {
        int mostSoldIndex = 0;

        for (int i = 1; i < cityNames.length; i++) {
            if (prices[i].length > prices[mostSoldIndex].length) {
                mostSoldIndex = i;
            }
        }

        return cityNames[mostSoldIndex];
    }

    /**
     * Retrieves the index of the city with the given cityName.
     * @param cityName the name of the city to search for
     * @return the index the city is in, or -1 if it is not present
     */
    public int getCityIndex(String cityName) {
        // Since I need indices, use regular for loop
        // Loop through all cityNames
            // If current city name matches the cityName incoming parameter...
                //Return that index
        for (int i = 0; i < cityNames.length; i++) {
            if (cityNames[i].equals(cityName)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Calculates the average prices of houses sold in a given city.
     * @param cityName the name of the city
     * @return the average price of all houses sold in the given city, or 0.0 if the city is not found
     */
    public double averagePriceInCity(String cityName) {
        // convert the cityName given into the correct index
        //set sum to 0
        // loop through prices array at the index
            // add the current price to sum
        // answer will be the sum divided by number of sales in that index
        int cityIndex = getCityIndex(cityName);

        if (cityIndex < 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double p : prices[cityIndex]) {
            sum += p;
        }

        return sum / prices[cityIndex].length;
    }

    /**
     * Calculates the average price from all houses sold.
     * @return the average price of all houses
     */
    public double averageOfAllHouses() {
        double sum = 0.0;
        int numHouses = 0;

        // loop through each row
            //loop through each column of that row
                // add the price at the row/column to sum
                // add 1 to numHouses
        // answer will be the sum / number of houses sold
        // Since we are not changing the elements, and we don't need the indices, use for each loop

        for (double[] row : prices) { // for each loops never go out of bounds
            for (double p : row) {
                sum += p;
                numHouses++;
            }
        }

        // using for loop
        /*for (int r = 0; r < prices.length; r++) {
            for (int c = 0; c < prices[r].length; c++) {
                sum += prices[r][c];
                numHouses++;
            }
        }
        */

        return sum / numHouses;
    }

    /**
     * Calculates the single most expensive house from all houses
     * @return the price of the most expensive house
     */
    public double getMostExpensiveHouse() {
        double result = 0.0;
        // assume the most expensive is 0
        // loop through all data
            // ask if a price is more expensive than current
                // if so, update
        for (double[] row : prices) {
            for (double p : row) {
                if (p > result) {
                    result = p;
                // or result = Math.max(p, result);
                }
            }
        }

        return result;
    }

    /**
     * Prints all the housing data.
     * Each row will begin with the name of the city,
     * followed by a "[", then followed by the prices
     * of each house separated by ", " and will end
     * with a "]".
     */
    public void printAllPrices() {
        for (int row = 0; row < cityNames.length; row++) {
            System.out.print(cityNames[row] + " [" + prices[row][0]);
            // need to loop through all prices in this city, print those
            for (int col = 1; col < prices[row].length; col++) {
                System.out.print(", " + prices[row][col]);
            }
            System.out.println("]");
        }
        // Another way - Arrays.toString provides brackets
        /*
        for (int row = 0; row < cityNames.length; row++) {
            System.out.println(cityNames[row] + " " + Arrays.toString(prices[row]));
        }
         */
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
        // Balance will be the loanAmount - monthlyPayment
        // Balance will be the balance - monthlyPayment
        // Balance will be the balance - monthlyPayment
        double balance = loanAmount;
        int numPaymentsNeeded = (int) Math.ceil(loanAmount / monthlyPayment);
        double[] result = new double[numPaymentsNeeded];

        for (int i = 0; i < numPaymentsNeeded; i++) {
            balance -= monthlyPayment;
            result[i] = balance;
        }

        result[result.length - 1] = 0.0;

        return result;
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
