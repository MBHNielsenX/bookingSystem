import java.util.Arrays;
import java.util.Date;

public class Schedule {
    private Date[] startActTimes;
    private Venue scheduledVenue;
    private Act[] scheduledAct;

    @Override
    public String toString() {
        return "Schedule{" +
                "startActTimes=" + Arrays.toString(startActTimes) +
                ", scheduledVenue=" + scheduledVenue +
                ", scheduledAct=" + Arrays.toString(scheduledAct) +
                '}';
    }

    public Schedule(Date[] startActTimes, Venue scheduledVenue, Act[] scheduledAct) {
        this.startActTimes = startActTimes;
        this.scheduledVenue = scheduledVenue;
        this.scheduledAct = scheduledAct;
    }
}
