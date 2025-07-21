import Models.Podcast;
import Models.Sounds;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sounds sounds1 = new Sounds("Fly Me To The Moon", "Frank Sinatra", "It Might as Well Be Swing",
                "Jazz", 1963, 2.45);
        Sounds sounds2 = new Sounds("Bohemian Rhapsody", "Queen", "A Night at the Opera",
                "Rock", 1975, 5.92);
        Sounds sounds3 = new Sounds("I Wish You Love", "Nancy Wilson", "Something Wonderful",
                "Jazz", 1960, 1.83);

        Podcast podcast1 = new Podcast("Hipsters Ponto Tech", "Paulo Silveira",
                "Entrevistas com desenvolvedores, CTOs, engenheiros e especialistas", 60);
        Podcast podcast2 = new Podcast("The Java Pub Gouse", "Freddy Guime",
                "Funcionamento do garbage collector no Java", 45);
        Podcast podcast3 = new Podcast("The Stack Overflow Podcast", "Ben Pooper",
                "Cultura dev, produtividade, boas práticas e entrevistas", 60);

        for (int i = 0; i < 10000; i++) {
            sounds1.plays();
        }

        for (int i = 0; i < 10000; i++) {
            sounds1.like();
        }
        boolean opcao1 = true;
        while (opcao1) {
            System.out.println("""
                    Digite 1: Coleção de músicas
                    Digite 2: Coleção de podcasts
                    """);
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Músicas:");
                System.out.println("1: " + sounds1.getTitle());
                System.out.println("2: " + sounds2.getTitle());
                System.out.println("3: " + sounds3.getTitle());
                System.out.println("Quer reprozir qual ? (Digite o número) ");
                int opcaoMusica = scanner.nextInt();
                if (opcaoMusica == 1){
                    System.out.println("Reproduzindo " + sounds1.getTitle());
                } else if (opcaoMusica == 2){
                    System.out.println("Reproduzindo " + sounds2.getTitle());
                } else if (opcaoMusica == 3){
                    System.out.println("Reproduzindo " + sounds3.getTitle());
                } else {
                    System.out.println("Opção invalida");
                }
            } else if (opcao == 2) {
                System.out.println(("Podcasts"));
                System.out.println("1: " + podcast1.getTitle());
                System.out.println("2: " + podcast2.getTitle());
                System.out.println("3: " + podcast3.getTitle());
                System.out.println("Quer reprozir qual ? (Digite o número) ");
                int opcaoPodcast = scanner.nextInt();
                if (opcaoPodcast == 1){
                    System.out.println("Reproduzindo " + podcast1.getTitle());
                } else if (opcaoPodcast == 2){
                    System.out.println("Reproduzindo " + podcast2.getTitle());
                } else if (opcaoPodcast == 3){
                    System.out.println("Reproduzindo " + podcast3.getTitle());
                } else {
                    System.out.println("Opção invalida");
                }
            } else {
                System.out.println("Opção invalidade");
            }
            System.out.println("""
                                Você deseja:
                                1: Voltar
                                2: Saber informação sobre músicas ou podcasts
                                3: Encerrar 
                                """);
            int opcaoFinal = scanner.nextInt();
            switch (opcaoFinal) {
                case 2:
                    System.out.println("""
                                        Informações sobre:
                                        1: Música
                                        2: Podcast
                                        """);
                    int opcaoFinal1 = scanner.nextInt();
                    if (opcaoFinal1 == 1) {
                        System.out.println("Qual música ?");
                        System.out.println("1: " + sounds1.getTitle());
                        System.out.println("2: " + sounds2.getTitle());
                        System.out.println("3: " + sounds3.getTitle());
                        int opcaoFinal2 = scanner.nextInt();
                        switch (opcaoFinal2) {
                            case 1:
                                sounds1.informacoes();
                                break;
                            case 2:
                                sounds2.informacoes();
                                break;
                            case 3:
                                sounds3.informacoes();
                                break;
                        }
                    break;
                    }
                    if (opcaoFinal1 == 2) {
                        System.out.println("Qual Podcast ?");
                        System.out.println("1: " + podcast1.getTitle());
                        System.out.println("2: " + podcast2.getTitle());
                        System.out.println("3: " + podcast3.getTitle());
                        int opcaoFinal2 = scanner.nextInt();
                        switch (opcaoFinal2) {
                            case 1:
                                podcast1.informacoes();
                                break;
                            case 2:
                                podcast2.informacoes();
                                break;
                            case 3:
                                podcast3.informacoes();
                                break;
                        }
                    }
                    break;
                case 3:
                    opcao1 = false;
            }
        }
    }
}