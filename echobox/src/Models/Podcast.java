package Models;

public class Podcast extends Audio implements Informacoes{
    private String presenter;
    private String description;

    public Podcast(String title, String presenter, String description, double duration) {
        super(title, duration);
        this.presenter = presenter;
        this.description = description;
    }

    public String getPresenter() {
        return presenter;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void informacoes() {
        System.out.println("Título: " + getTitle());
        System.out.println("Apresentador: " + presenter);
        System.out.println("Descrição: " + description);
        System.out.println("Duração: " + getDuration() + " minutos");
        System.out.println("Curtidas: " + getTotalLikes());
        System.out.println("Reproduções: " + getTotalPlays());
        System.out.println("Classificação: " + getClassification());
    }

}
