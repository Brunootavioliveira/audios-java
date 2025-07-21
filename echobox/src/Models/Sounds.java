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
        System.out.println("Título: " + getTitle());
        System.out.println("Cantor: " + singer);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genre);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração: " + getDuration() + " minutos");
        System.out.println("Curtidas: " + getTotalLikes());
        System.out.println("Reproduções: " + getTotalPlays());
        System.out.println("Classificação: " + getClassification());
    }

}
