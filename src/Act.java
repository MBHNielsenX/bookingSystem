public class Act {
    private String contract;
    private double bookingPrice;
    private String actName;

    @Override
    public String toString() {
        return "Act{" +
                "contract='" + contract + '\'' +
                ", bookingPrice=" + bookingPrice +
                ", actName='" + actName + '\'' +
                '}';
    }

    public Act(String contract, double bookingPrice, String actName) {
        this.contract = contract;
        this.bookingPrice = bookingPrice;
        this.actName = actName;
    }

}

