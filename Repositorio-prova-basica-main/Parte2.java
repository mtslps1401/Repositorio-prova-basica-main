import java.util.Scanner;
import java.util.Random;

public class Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Contagem até 10
        System.out.println("--- Contagem até 10 ---");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        // 2. Soma com while
        System.out.println("\n--- Soma com while ---");
        int soma = 0;
        int numeroSoma;
        do {
            System.out.print("Digite um número para somar (0 para sair): ");
            numeroSoma = scanner.nextInt();
            soma += numeroSoma;
        } while (numeroSoma != 0);
        System.out.println("A soma total é: " + soma);
        
        // 3. Tabuada
        System.out.println("\n--- Tabuada ---");
        System.out.print("Digite um número para ver a tabuada: ");
        int numeroTabuada = scanner.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(numeroTabuada + " x " + j + " = " + (numeroTabuada * j));
        }
        
        // 4. Fatorial
        System.out.println("\n--- Fatorial ---");
        System.out.print("Digite um número não-negativo: ");
        int numeroFatorial = scanner.nextInt();
        if (numeroFatorial < 0) {
            System.out.println("Número inválido.");
        } else {
            long resultado = 1;
            for (int k = 1; k <= numeroFatorial; k++) {
                resultado *= k;
            }
            System.out.println("O fatorial de " + numeroFatorial + " é " + resultado);
        }
        
        // 5. Verificador de Senha
        System.out.println("\n--- Verificador de Senha ---");
        String senhaCorreta = "java17";
        String senhaDigitada;
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.next();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));
        System.out.println("Senha correta! Acesso concedido.");
        
        // 6. Números Primos
        System.out.println("\n--- Números Primos ---");
        System.out.print("Digite um número: ");
        int numeroPrimo = scanner.nextInt();
        boolean ehPrimo = true;
        if (numeroPrimo <= 1) {
            ehPrimo = false;
        } else {
            for (int k = 2; k <= Math.sqrt(numeroPrimo); k++) {
                if (numeroPrimo % k == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo) {
            System.out.println("O número " + numeroPrimo + " é primo.");
        } else {
            System.out.println("O número " + numeroPrimo + " não é primo.");
        }
        
        // 7. Sequência de Fibonacci
        System.out.println("\n--- Sequência de Fibonacci ---");
        System.out.print("Quantos termos da sequência de Fibonacci você quer? ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        if (n <= 0) {
            System.out.println("Número de termos inválido.");
        } else if (n == 1) {
            System.out.println(a);
        } else {
            System.out.print(a + ", " + b);
            for (int k = 2; k < n; k++) {
                int proximo = a + b;
                System.out.print(", " + proximo);
                a = b;
                b = proximo;
            }
            System.out.println();
        }
        
        // 8. Contagem de Pares e Ímpares
        System.out.println("\n--- Contagem de Pares e Ímpares ---");
        int pares = 0;
        int impares = 0;
        for (int k = 1; k <= 10; k++) {
            System.out.print("Digite o " + k + "º número: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\nTotal de pares: " + pares);
        System.out.println("Total de ímpares: " + impares);
        
        // 9. Maior e Menor
        System.out.println("\n--- Maior e Menor ---");
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double numero;
        boolean primeiroNumero = true;
        
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextDouble();
            if (numero == 0) {
                break;
            }
            if (primeiroNumero) {
                maior = numero;
                menor = numero;
                primeiroNumero = false;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        if (primeiroNumero) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("\nO maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
        }
        
        // 10. Adivinhe o Número
        System.out.println("\n--- Adivinhe o Número ---");
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        
        do {
            tentativas++;
            System.out.print("Adivinhe o número (entre 1 e 100): ");
            palpite = scanner.nextInt();
            if (palpite < numeroSecreto) {
                System.out.println("É maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("É menor!");
            }
        } while (palpite != numeroSecreto);
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        scanner.close();
    }
}