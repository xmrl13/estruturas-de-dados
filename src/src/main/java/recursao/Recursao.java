package recursao;

public class Recursao {
    public static void main(String[] args) {
        recursao(3);
        System.out.println(sequencia(3));
        System.out.println(fatorial(5));
        int n = 10;
        int[] memo = new int[n + 1]; // Array como memoria para a funcao
        System.out.println(fibonacci(n, memo));
        System.out.println(potencia(3, 3));
    }

    public static void recursao(int recursao) {
        if (recursao > 0) {
            recursao(recursao - 1);
            System.out.println(recursao);
        }
    }

/* Chamadas em cascata, ocorrem 3 chamadas a funcao recursao
antes das chamadas aos prints.
Se inverter as linhas 10 e 11 o codigo printa em ordem decrescente
Esse comportamento esta relacionado a pilha de chamadas
Da forma como está tudo é executado após o processamento das chamadas
Do contrário o print é pré recursao, desse modo, pós recursao.
*/

    public static int sequencia(int somar) {
        if (somar > 0) {
            int resultado = 0;
            resultado = somar + sequencia(somar - 1);
            return resultado;
        }
        return 0;
    }

    public static int fatorial(int fator) {
        if (fator > 0) {
            int resultado;
            resultado = fator * fatorial(fator - 1);
            return resultado;
        }
        return 1;
    }

    public static int fibonacci(int n, int[] memo) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        return memo[n];
    }

    public static int potencia(int n, int expoente) {
        if (expoente > 0) {
            return n * potencia(n, expoente - 1);
        }
        return 1;
    }

}
/*
Definicao de fatorial diz que 0! = 1, por isso o return fora do if no fatorial deve ser 1.
Isso faz com que os fatoriais comecem a ser construidos com base nesse numero.
Se 0! = 0 toda a multiplicacao resultaria em 0.
Isso nao acontece na soma, que parte do 0.
 */

// se a recursao é a primeira coisa a acontecer se chama head recursion
// se a recursao é a ultima coisa a acontecer se chama tail recursion
// Head recursion = recursao em tempo de retorno
// tail recursion = recursao em tempo de chamada
