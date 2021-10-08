public class Venue {
    private String venueName;
    private String location;

    @Override
    public String toString() {
        return "Venue{" +
                "venueName='" + venueName + '\'' +
                ", location='" + location + '\'' + "\n" +
                '}';
    }

    public Venue(String venueName, String location) {
        this.venueName = venueName;
        this.location = location;
    }
}
