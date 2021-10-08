public class Event {
    private Schedule eventSchedule;

    @Override
    public String toString() {
        return "Event{" +
                "eventSchedule=" + eventSchedule + "\n" +
                '}';
    }

    public Event(Schedule eventSchedule) {
        this.eventSchedule = eventSchedule;
    }
}
