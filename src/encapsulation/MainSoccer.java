package encapsulation;

public class MainSoccer {
    public static void main(String[] args) {
        Soccer soccerPlayer = new Soccer();
        soccerPlayer.setName("James");
        soccerPlayer.setGols(6);
        soccerPlayer.setShirtNumber(10);
        System.out.println(soccerPlayer.getName());
    }
}
