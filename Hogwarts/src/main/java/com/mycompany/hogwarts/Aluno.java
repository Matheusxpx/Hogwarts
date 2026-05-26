
import java.util.Scanner;

public class Aluno {


    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private String casa;

   
    public Aluno(String nome, int idade, int coragem,
                  int inteligencia, int ambicao, int lealdade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCasa() {
        return casa;
    }

  
    public void calcularCasa() {

        int grifinoria = (2 * coragem) + lealdade;

        int sonserina = (2 * ambicao);

        int corvinal = (2 * inteligencia);

        int lufalufa = ((2 * lealdade) + coragem) / 3;

        int maior = grifinoria;

        casa = "Grifinoria";

        if (sonserina > maior) {

            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {

            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {

            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {

        System.out.println("\n===== RESULTADO =====");

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Casa: " + casa);
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = sc.nextInt();

            System.out.println("Digite coragem:");
            int coragem = sc.nextInt();

            System.out.println("Digite inteligencia:");
            int inteligencia = sc.nextInt();

            System.out.println("Digite ambicao:");
            int ambicao = sc.nextInt();

            System.out.println("Digite lealdade:");
            int lealdade = sc.nextInt();

            sc.nextLine();

         
            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade
            );

            aluno.calcularCasa();

         
            aluno.exibirInformacoes();

            System.out.println("\nDeseja continuar? (s/n)");
            continuar = sc.nextLine();
        }

        sc.close();
    }
}