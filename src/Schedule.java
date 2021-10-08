import java.util.Arrays;
import java.util.Date;

public class Schedule {
    private Venue scheduledVenue;
    private Act[] scheduledAct;

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduledVenue=" + scheduledVenue +
                ", scheduledAct=" + Arrays.toString(scheduledAct) + "\n" +
                '}';
    }



    public Schedule(Venue scheduledVenue, Act[] scheduledAct) {
        this.scheduledVenue = scheduledVenue;
        this.scheduledAct = scheduledAct;
    }
}
