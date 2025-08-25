import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Soma Simples
        System.out.println("--- Soma Simples ---");
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        
        // 2. Média de Notas
        System.out.println("\n--- Média de Notas ---");
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média das notas é: %.2f\n", media);
        
        // 3. Conversor de Moeda
        System.out.println("\n--- Conversor de Moeda ---");
        double taxaCambio = 5.25; // Exemplo de taxa fixa
        System.out.print("Digite o valor em Reais (R$): ");
        double reais = scanner.nextDouble();
        double dolares = reais / taxaCambio;
        System.out.printf("R$ %.2f equivalem a US$ %.2f\n", reais, dolares);
        
        // 4. Par ou Ímpar
        System.out.println("\n--- Par ou Ímpar ---");
        System.out.print("Digite um número inteiro: ");
        int numeroParImpar = scanner.nextInt();
        if (numeroParImpar % 2 == 0) {
            System.out.println("O número " + numeroParImpar + " é PAR.");
        } else {
            System.out.println("O número " + numeroParImpar + " é ÍMPAR.");
        }
        
        // 5. Aprovação do Aluno
        System.out.println("\n--- Aprovação do Aluno ---");
        System.out.print("Digite a primeira nota: ");
        double notaAprovacao1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double notaAprovacao2 = scanner.nextDouble();
        double mediaAprovacao = (notaAprovacao1 + notaAprovacao2) / 2;
        System.out.printf("Média: %.2f\n", mediaAprovacao);
        if (mediaAprovacao >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        
        // 6. Maior de Dois Números
        System.out.println("\n--- Maior de Dois Números ---");
        System.out.print("Digite o primeiro número: ");
        double maiorNum1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double maiorNum2 = scanner.nextDouble();
        if (maiorNum1 > maiorNum2) {
            System.out.println("O maior número é: " + maiorNum1);
        } else if (maiorNum2 > maiorNum1) {
            System.out.println("O maior número é: " + maiorNum2);
        } else {
            System.out.println("Os números são iguais.");
        }
        
        // 7. Positivo, Negativo ou Zero
        System.out.println("\n--- Positivo, Negativo ou Zero ---");
        System.out.print("Digite um número: ");
        double numSinal = scanner.nextDouble();
        if (numSinal > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numSinal < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }
        
        // 8. Cálculo de IMC
        System.out.println("\n--- Cálculo de IMC ---");
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc < 18.5) {
            System.out.println("Categoria: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Categoria: Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidade");
        }
        
        // 9. Ano Bissexto
        System.out.println("\n--- Ano Bissexto ---");
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        
        // 10. Login Simples
        System.out.println("\n--- Login Simples ---");
        String usuarioCorreto = "admin";
        String senhaCorreta = "senha123";
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido! Bem-vindo(a), admin.");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
        
        scanner.close();
    }
}