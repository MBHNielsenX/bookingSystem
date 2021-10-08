import java.util.Date;
public class Act {
    private String contract;
    private double bookingPrice;
    private String actName;
    private Date date;

    @Override
    public String toString() {
        return "Act{" +
                "contract='" + contract + '\'' +
                ", bookingPrice=" + bookingPrice +
                ", actName='" + actName + '\'' +
                ", date=" + date + "\n" +
                '}';
    }

    public Act(String contract, double bookingPrice, String actName, Date date) {
        this.contract = contract;
        this.bookingPrice = bookingPrice;
        this.actName = actName;
        this.date = date;
    }
}

