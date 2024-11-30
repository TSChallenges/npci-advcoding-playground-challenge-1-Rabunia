class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO 
        if (quantity <= 0 || buyingPrice <= 0) {
            throw new IllegalArgumentException("Quantity and buying price must be positive.");
        }
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.currentPrice = buyingPrice;
        this.highestPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        if (newPrice <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        this.currentPrice = newPrice;
        if (newPrice > highestPrice) {
            highestPrice = newPrice;
        }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
        return (currentPrice - buyingPrice) * quantity;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        return currentPrice * quantity;
    }
    //public void displayStockDetails() {
       // System.out.println("Stock Symbol: " + symbol);
       // System.out.println("Quantity: " + quantity);
        //System.out.println("Buying Price: " + buyingPrice);
        //System.out.println("Current Price: " + currentPrice);
        //System.out.println("Highest Price: " + highestPrice);
        //System.out.println("Current Value: " + getCurrentValue());
        //System.out.println("Profit/Loss: " + calculateProfit());
}
