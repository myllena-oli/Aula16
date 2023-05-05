import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DebugExemplo {

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");

        calcularSomaAreas();

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero(retornarListaNumeros());

        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        List<String> listaNomesComQuantidade = mostrarMensagemComQuantidade(retornarListaNumeros());
        System.out.println("=========================================================");
        System.out.println("Exemplo de array = "+listaNomesComQuantidade);

    }

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: " + somaAreas);
    }

    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        return calcularAreaRetangulo(base, altura);
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;
        System.out.println("O valor da área do retangulo é "+areaRetangulo+".");
        return areaRetangulo;
    }


    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static List<Integer> retornarListaNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt();
        List<Integer> listaNumero = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número: ");
            listaNumero.add(scanner.nextInt());
        }
        return listaNumero;
    }

    public static List<String> mostrarMensagemComQuantidade(List<Integer> quantidade) {
        List<String> nomes = retornarListaNomes(quantidade.size());
        List<String> nomesExibir = new ArrayList<>();
        for (int i = 0; i < quantidade.size(); i++) {
            nomesExibir.add(quantidade.get(i) + nomes.get(i));
        }
        return nomesExibir;
    }

    public static List<String> retornarListaNomes(int capacidade) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(" "+scanner.nextLine());
        }
        return listaNomes;
    }

}