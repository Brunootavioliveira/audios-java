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
        System.out.println("Apresentador: " + getPresenter());
        System.out.println("Descrisão: " + getDescription());
        System.out.println("Duração: " + getDuration() + " minutos");
    }
}
