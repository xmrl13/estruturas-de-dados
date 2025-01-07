package busca;

public class BuscaBinaria {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int alvo = 5;

        int resultado = buscaBinaria(array, alvo);
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }

        int resultado2 = buscaBinariaRecursiva(array, 0, array.length - 1, alvo, 0);
        if (resultado2 != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;
        int controle = 0;

        while (inicio <= fim) {
            controle++;
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == alvo) {
                System.out.println("Número de iterações: " + controle);
                return meio;
            }

            if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Número de iterações: " + controle);
        return -1;
    }

    public static int buscaBinariaRecursiva(int[] array, int inicio, int fim, int alvo, int controle) {
        if (inicio > fim) {
            System.out.println("Número de iterações: " + controle);
            return -1;
        }
        controle++;
        int meio = inicio + (fim - inicio) / 2;

        if (array[meio] == alvo) {
            System.out.println("Número de iterações: " + controle);
            return meio;
        }
        if (array[meio] < alvo) {
            return buscaBinariaRecursiva(array, meio + 1, fim, alvo, controle);
        }
        return buscaBinariaRecursiva(array, inicio, meio - 1, alvo, controle);
    }
}
