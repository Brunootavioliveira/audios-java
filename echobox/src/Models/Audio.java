package Models;

public class Audio {
    private String title;
    private double duration;
    private int totalPlays;
    private int totalLikes;
    private String classification;

    public Audio(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public String getClassification() {
        return classification;
    }

    public void plays() {
        this.totalPlays++;
    }

    public void like() {
        this.totalLikes++;
    }
}
