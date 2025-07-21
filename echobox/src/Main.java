import Models.Podcast;
import Models.Sounds;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Sounds> musicas = Arrays.asList(
                new Sounds("Fly Me To The Moon", "Frank Sinatra", "It Might as Well Be Swing", "Jazz", 1963, 2.45),
                new Sounds("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", 1975, 5.92),
                new Sounds("I Wish You Love", "Nancy Wilson", "Something Wonderful", "Jazz", 1960, 1.83)
        );

        List<Podcast> podcasts = Arrays.asList(
                new Podcast("Hipsters Ponto Tech", "Paulo Silveira", "Entrevistas com desenvolvedores, CTOs, engenheiros e especialistas", 60),
                new Podcast("The Java Pub House", "Freddy Guime", "Funcionamento do garbage collector no Java", 45),
                new Podcast("The Stack Overflow Podcast", "Ben Popper", "Cultura dev, produtividade, boas práticas e entrevistas", 60)
        );

        // Simula popularidade de uma música
        for (int i = 0; i < 10000; i++) {
            musicas.get(0).play();
            musicas.get(0).like();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("""
                    Digite 1: Coleção de músicas
                    Digite 2: Coleção de podcasts
                    """);
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                reproduzirAudio(musicas, scanner);
            } else if (opcao == 2) {
                reproduzirAudio(podcasts, scanner);
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println("""
                    Você deseja:
                    1: Voltar
                    2: Saber informação sobre músicas ou podcasts
                    3: Encerrar 
                    """);
            int opcaoFinal = scanner.nextInt();

            switch (opcaoFinal) {
                case 2 -> mostrarInformacoes(musicas, podcasts, scanner);
                case 3 -> continuar = false;
            }
        }
    }

    private static <T extends Models.Audio & Models.Informacoes> void reproduzirAudio(List<T> lista, Scanner scanner) {
        System.out.println("Escolha o número para reproduzir:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ": " + lista.get(i).getTitle());
        }

        int escolha = scanner.nextInt();
        if (escolha >= 1 && escolha <= lista.size()) {
            T selecionado = lista.get(escolha - 1);
            selecionado.play();
            System.out.println("Reproduzindo: " + selecionado.getTitle());
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void mostrarInformacoes(List<Sounds> musicas, List<Podcast> podcasts, Scanner scanner) {
        System.out.println("""
                Informações sobre:
                1: Música
                2: Podcast
                """);
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.println("Qual música?");
            for (int i = 0; i < musicas.size(); i++) {
                System.out.println((i + 1) + ": " + musicas.get(i).getTitle());
            }
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= musicas.size()) {
                musicas.get(escolha - 1).informacoes();
            } else {
                System.out.println("Opção inválida.");
            }

        } else if (tipo == 2) {
            System.out.println("Qual podcast?");
            for (int i = 0; i < podcasts.size(); i++) {
                System.out.println((i + 1) + ": " + podcasts.get(i).getTitle());
            }
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= podcasts.size()) {
                podcasts.get(escolha - 1).informacoes();
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
