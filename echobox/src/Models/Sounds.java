package Models;

public class Sounds extends Audio implements Informacoes{
    private String singer;
    private String album;
    private String genre;
    private int yearOfRelease;

    public Sounds(String title, String singer, String album, String genre, int yearOfRelease, double duration) {
        super(title, duration);
        this.singer = singer;
        this.album = album;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public void informacoes() {
        System.out.println("Cantor: " + getSinger());
        System.out.println("Album: " + getAlbum());
        System.out.println("Gênero: " + getGenre());
        System.out.println("Ano de lançamento: " + getYearOfRelease());
        System.out.println("Duração: " + getDuration() + " minutos");
    }
}
