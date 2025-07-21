package Models;

public class Audio {
    private String title;
    private double duration;
    private int totalPlays;
    private int totalLikes;

    public Audio(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public double getDuration() { return duration; }
    public int getTotalPlays() { return totalPlays; }
    public int getTotalLikes() { return totalLikes; }

    public void play() { this.totalPlays++; }
    public void like() { this.totalLikes++; }

    public String getClassification() {
        if (totalPlays >= 1000 || totalLikes >= 500) return "Popular";
        if (totalPlays >= 100 || totalLikes >= 50) return "Emergente";
        return "Novo";
    }
}
