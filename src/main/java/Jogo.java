/*
 * CENTRO UNIVERSITÁRIO SENAC
 * GRUPO 3 - TURMA A, NOTURNA
 * BRUNO LEONARDO SILVA
 * JOÃO VICTOR CAVALCANTI DE SOUZA
 * MARIANA VIDAL VAZ
 */

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    // Função principal onde é o Menu e onde vai chamar as outras funções que o jogo possue.
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        clearConsole();
        System.out.println("Olá, seja bem-vindo(a) ao Mathmancer!\n");
        System.out.println(
                "Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.\n");

        do {
            System.out.println("1 - JOGAR");
            System.out.println("2 - INSTRUÇÕES");
            System.out.println("3 - CRÉDITOS");
            System.out.println("4 - SAIR\n");

            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                // se escolher jogo
                case 1:
                    clearConsole();
                    System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
                    Thread.sleep(1000);
                    criarPersonagem();
                    opcaoMenu = 4;
                    break;
                // se escolher instrução
                case 2:
                    instrucoes();
                    break;
                // se escolher créditos
                case 3:
                    printCreditos();
                    break;
                // se escolher sair
                case 4:
                    System.out.println("\nSaindo do Jogo. Volte Logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        } while (opcaoMenu != 4);

        System.out.println("\n\nAcabou! Jogo em desenvolvimento");

    }

    // INÍCIO DAS QUESTÕES DE ADIÇÃO!!
    // Função para o exercício de adição 1
    public static int exercicioAdicao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tentativas = 3;
        int danoTomado = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para somar polinômios, basta somar os termos semelhantes. Termos semelhantes são aqueles que têm a mesma parte literal (as variáveis) elevada à mesma potência.\n");
            System.out.println("PASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n"
                    + //
                    "(3x² + 5x + 4) + (2x² - 3x + 1) \r\n"
                    + //
                    "= (3x² + 2x²) + (5x - 3x) + (4 + 1)\r\n"
                    + //
                    "");
            System.out.println("PASSO 2:");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n"
                    + //
                    "3x² + 2x² = 5x²\r\n"
                    + //
                    "5x - 3x = 2x\r\n"
                    + //
                    "4 + 1 = 5\r\n"
                    + //
                    "");

              System.out.println(
                "Problema: Qual é o resultado da adição dos polinômios (3x² + 5x + 4) e (2x² - 3x + 1)?\n");
            // Lista de opções de resposta
            String[] opcoesResposta = new String[]{
                    "5x² - x + 3",
                    "5x² - x + 5",
                    "5x² + 2x + 5",
                    "5x² + 2x + 3"
            };

            // Embaralha as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);

                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }

            // Exibe as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }

            System.out.print("\nResposta: ");
            String resposta = "";
            try {
                resposta = sc.next();
            } catch (java.util.NoSuchElementException e) {
                // Se não houver entrada disponível, continue o loop
                continue;
            }

            // Obtém a posição da resposta correta (c)
            int posicaoRespostaCorreta = opcoesResposta[2].equals("5x² + 2x + 5") ? 2 :
                    opcoesResposta[1].equals("5x² + 2x + 5") ? 1 :
                            opcoesResposta[0].equals("5x² + 2x + 5") ? 0 : 3;

            // Converte a resposta do usuário para o índice (0, 1, 2, 3)
            int respostaUsuario = resposta.toLowerCase().charAt(0) - 'a';

            if (respostaUsuario == posicaoRespostaCorreta) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas + "\n");
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: c) 5x² + 2x + 5\n");
                danoTomado = 10;
            }
        }
        
        return danoTomado;
    }

    // Função para o exercício de adição 2
    public static int exercicioAdicao02() {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 2");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para somar polinômios, agrupamos os termos semelhantes. Lembre-se de que os termos semelhantes têm a mesma parte literal (as variáveis) com o mesmo expoente.\n");
            System.out.println("PASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n" + //
                    "(4x³ + 2x² + 7) + (3x³ - 5x² + 1) \r\n" + //
                    "= (4x³ + 3x³) + (2x² - 5x²) + (7 + 1)\r\n" + //
                    "");
            System.out.println("PASSO 2: ");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n" + //
                    "4x³ + 3x³ = 7x³\r\n" + //
                    "2x² - 5x² = -3x²\r\n" + //
                    "7 + 1 = 8\r\n" + //
                    "");
            System.out.println("Problema: Calcule a soma dos polinômios (4x³ + 2x² + 7) e (3x³ - 5x² + 1).");
            System.out.println("Qual é o resultado da operação?");
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = new String[]{
                "7x³ - 3x² + 8",
                "7x³ - 3x² + 6",
                "7x³ - 5x² + 8",
                "7x³ - 5x² + 6"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rdm.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = "";
            try {
                resposta = sc.next();
            } catch (java.util.NoSuchElementException e) {
                // Se não houver entrada disponível, continue o loop
                continue;
            }
    
            // Obtém a posição da resposta correta (c)
            int posicaoRespostaCorreta = opcoesResposta[0].equals("7x³ - 3x² + 8") ? 0 :
                opcoesResposta[1].equals("7x³ - 3x² + 8") ? 1 :
                opcoesResposta[2].equals("7x³ - 3x² + 8") ? 2 : 3;
    
            // Converte a resposta do usuário para o índice (0, 1, 2, 3)
            int respostaUsuario = resposta.toLowerCase().charAt(0) - 'a';
    
            if (respostaUsuario == posicaoRespostaCorreta) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas + "\n");
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: a) 7x³ - 3x² + 8\n");
                dano = 10;
            }
        }
        
        return dano;
    }

    // Função para o exercício de adição 3
    public static int exercicioAdicao03() {
        Scanner sc = new Scanner(System.in);
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 3");
            System.out.println("========================================================");
            System.out.println("TUTORIAL: ");
            System.out.println(
                    "\nPara somar polinômios, agrupamos os termos semelhantes. Lembre-se de que os termos semelhantes têm a mesma parte literal (as variáveis) com o mesmo expoente.\n");
            System.out.println("\nPASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n" +
                    "(6x^4 - 3x³ + 2x²) + (x^4 + 5x³ - x² + 1) \r\n" +
                    "= (6x^4 + x^4) + (-3x³ + 5x³) + (2x² - x²) + (0 + 1)\r\n" + 
                    "");
            System.out.println("\nPASSO 2: ");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n" + 
                    "6x^4 + x^4 = 7x^4\r\n" +
                    "-3x³ + 5x³ = 2x³\r\n" +
                    "2x² - x² = x²\r\n" + 
                    "0 + 1 = 1\r\n" +
                    "");
            System.out.println("Problema: Qual é o resultado da operação (6x^4 - 3x³ + 2x²) + (x^4 + 5x³ - x² + 1)?\n");
            System.out.println("Qual é o resultado da operação?");
            
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "7x^4 + 2x³ + x² + 1",
                "7x^4 - 3x³ + x² + 1",
                "7x^4 + 2x³ + x² - 1",
                "7x^4 - 3x³ + x² - 1"
            };
    
            // Embaralhando as opções de resposta
            Random rand = new Random();
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("7x^4 + 2x³ + x² + 1")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println(
                        "Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 7x^4 + 2x³ + x² + 1\n");
                return dano = 10;
            }
        }
        return dano;
    }
    // FIM DAS QUESTÕES DE ADIÇÃO!

    // ----------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DE SUBTRAÇÃO!!
    // Função para a questão de subtração 1
    public static int exercicioSubtracao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 4");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para subtrair polinômios, é semelhante à adição, mas desta vez subtraímos os termos semelhantes.");
            System.out.println("Então, subtraímos os termos semelhantes de cada polinômio:\n" + //
                    "(5x² + 3x + 8) - (2x² - 4x + 1) \n" + //
                    "= (5x² - 2x²) + (3x + 4x) + (8 - 1)\n");
    
            System.out.println("Agora, subtraímos cada grupo de termos semelhantes:\n" + //
                    "5x² - 2x² = 3x²\n" + //
                    "3x + 4x = 7x\n" + //
                    "8 - 1 = 7\n");
    
            System.out.println("Problema: Subtraia os polinômios (5x² + 3x + 8) e (2x² - 4x + 1).");
    
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "3x² - 7x - 7",
                "3x² - 7x + 7",
                "3x² + 7x - 7",
                "3x² + 7x + 7"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("3x² + 7x + 7")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 3x² + 7x + 7");
                return dano = 10;
            }
        }
        return dano;
    }

    // Função para a questão de subtração 2
    public static int exercicioSubtracao02() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 5");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println("Para subtrair polinômios, agrupamos os termos semelhantes e, em seguida, subtraímos.");
            System.out.println("Então, subtraímos os termos semelhantes de cada polinômio:\n" + //
                    "(4x³ + 2x² + 7) - (3x³ - 5x² + 1) \n" + //
                    "= (4x³ - 3x³) + (2x² + 5x²) + (7 - 1)\n");
    
            System.out.println("Agora, subtraímos cada grupo de termos semelhantes:\n" + //
                    "4x³ - 3x³ = x³\n" + //
                    "2x² + 5x² = 7x²\n" + //
                    "7 - 1 = 6\n");
    
            System.out.println("Problema: Calcule a diferença entre os polinômios (4x³ + 2x² + 7) e (3x³ - 5x² + 1).");
    
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "x³ + 7x² + 6",
                "x³ + 7x² - 6",
                "x³ - 7x² + 6",
                "x³ - 7x² - 6"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("x³ + 7x² + 6")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") x³ + 7x² + 6");
                return dano = 10;
            }
        }
        return dano;
    }
    // FIM DAS QUESTÕES DE SUBTRAÇÃO

    // -----------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DE MULTIPLICAÇÃO!!
    // Função para a questão de multiplicação 1
    public static int exercicioMultiplicacao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 6");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println("\nPara multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(2x + 3) * (x² - 4x + 5) ");
            System.out.println("= 2x * (x² - 4x + 5) + 3 * (x² - 4x + 5)");
    
            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 2x * x² - 2x * 4x + 2x * 5 + 3 * x² - 3 * 4x + 3 * 5");
            System.out.println("= 2x³ - 8x² + 10x + 3x² - 12x + 15");
    
            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 2x³ + 3x² - 8x² - 8x + 10x + 15");
            System.out.println("= 2x³ - 5x² + 2x + 15");
    
            System.out.println("\nProblema: Multiplique o polinômio (2x + 3) pelo polinômio (x² - 4x + 5).");
    
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "2x³ + 5x² + 2x + 15",
                "2x³ - 5x² + 2x + 15",
                "2x³ + 5x² - 2x - 15",
                "2x³ - 5x² - 2x - 15"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("2x³ - 5x² + 2x + 15")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 2x³ - 5x² + 2x + 15");
                return dano = 10;
            }
        }
        return dano;
    }
    // Função para a questão de multiplicação 2
    public static int exercicioMultiplicacao02() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 7");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:\n");
            System.out.println("Para multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(3x² + 2x - 1) * (4x - 3) ");
            System.out.println("= 3x² * (4x - 3) + 2x * (4x - 3) - 1 * (4x - 3)");
    
            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 12x³ - 9x² + 8x² - 6x - 4x + 3");
    
            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 12x³ - x² + 2x + 3");
            System.out.println("\nProblema: Multiplique o polinômio (3x² + 2x - 1) pelo polinômio (4x - 3).");
    
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "12x³ + x² + 2x + 3",
                "12x³ - x² + 2x + 3",
                "12x³ - x² - 2x + 3",
                "12x³ - x² - 2x - 3"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("12x³ - x² + 2x + 3")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 12x³ - x² + 2x + 3");
                return dano = 10;
            }
        }
        return dano;
    }
    // FIM DAS QUESTÕES DE MULTIPLICAÇÃO!!

    // ------------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DO BOSS!!
    // Função para a questão BOSS 1
    public static int exercicioBoss01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO FINAL 1");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:\n");
            System.out.println("Para dividir polinômios, usamos a divisão polinomial.");
            System.out.println("1. Organize o polinômio de acordo com as potências decrescentes de x.");
            System.out.println("2. Divida o termo de maior grau do dividendo pelo termo de maior grau do divisor.");
            System.out.println("3. Multiplique o divisor pelo quociente encontrado e subtraia do dividendo.");
            System.out.println("4. Repita o processo até que o grau do resto seja menor que o grau do divisor.");
    
            // Insira a equação aqui
            System.out.println("(6x³ + 5x² - 4x + 8) ÷ (2x - 1)");
            // Fim da inserção da equação
    
            // Insira os passos da solução aqui
            System.out.println("\nPasso 1:");
            System.out.println("Grau do dividendo: 3");
            System.out.println("Grau do divisor: 1");
            // Fim da inserção dos passos
    
            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                "3x² - 5/2x + 5/4",
                "3x² + 5/2x + 5/4",
                "3x² + 5/2x - 5/4",
                "3x² - 5/2x - 5/4"
            };
    
            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
    
                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }
    
            // Exibindo as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("3x² - 5/2x - 5/4")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }
    
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 3x² - 5/2x - 5/4");
                return dano = 10;
            }
        }
        return dano;
    }

    // Função para a questão BOSS 2
    public static int exercicioBoss02() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
        int dano = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO FINAL 2");
            System.out.println("========================================================");

            System.out.println("TUTORIAL:");
            System.out.println("Para multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(x² + 3x - 2) * (2x² - 5x + 1) ");
            System.out.println("= x² * (2x² - 5x + 1) + 3x * (2x² - 5x + 1) - 2 * (2x² - 5x + 1)");

            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 2x^4 - 5x³ + x² + 6x³ - 15x² + 3x - 4x² + 10x - 2");

            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 2x^4 + (6x³ - 5x³) + (-15x² - 4x²) + (3x + 10x) - 2");
            System.out.println("= 2x^4 + x³ - 19x² + 13x - 2");
            System.out.println("\nProblema: Multiplique o polinômio (x² + 3x - 2) por (2x² - 5x + 1).");

            // Definindo as opções de resposta em um vetor
            String[] opcoesResposta = {
                    "2x^4 - x³ + 19x² - 13x + 2",
                    "2x^4 + x³ - 19x² + 13x - 2",
                    "2x^4 + x³ - 19x² - 13x - 2",
                    "2x^4 + x³ - 19x² + 13x - 2"
            };

            // Embaralhando as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);

                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }

            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }

            System.out.print("\nResposta: ");
            String resposta = sc.next();
            // Obtendo a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + 0); // Letra 'a' é a resposta correta por padrão
            for (int i = 0; i < opcoesResposta.length; i++) {
                if (opcoesResposta[i].equals("2x^4 - x³ + 19x² - 13x + 2")) {
                    letraRespostaCorreta = (char) ('a' + i);
                    break;
                }
            }

            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println(
                        "Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 2x^4 - x³ + 19x² - 13x + 2");
                return dano = 10;
            }
        }
        return dano;
    }

    // Função para a questão BOSS 3
    public static int exercicioBoss03() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tentativas = 3;
        int danoTomado = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO FINAL 3");
            System.out.println("========================================================");
            System.out.println("\nTUTORIAL:");
            System.out.println(
                    "Para somar polinômios, basta somar os termos semelhantes. Termos semelhantes são aqueles que têm a mesma parte literal (as variáveis) elevada à mesma potência.\n");
            System.out.println("PASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n"
                    + //
                    "(3x² + 5x + 4) + (2x² - 3x + 1) \r\n"
                    + //
                    "= (3x² + 2x²) + (5x - 3x) + (4 + 1)\r\n"
                    + //
                    "");
            System.out.println("PASSO 2:");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n"
                    + //
                    "3x² + 2x² = 5x²\r\n"
                    + //
                    "5x - 3x = 2x\r\n"
                    + //
                    "4 + 1 = 5\r\n"
                    + //
                    "");

            System.out.println(
                    "Problema: Qual é o resultado da adição dos polinômios (3x² + 5x + 4) e (2x² - 3x + 1)?\n");
            // Lista de opções de resposta
            String[] opcoesResposta = new String[]{
                    "5x² - x + 3",
                    "5x² - x + 5",
                    "5x² + 2x + 5",
                    "5x² + 2x + 3"
            };

            // Embaralha as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);

                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }

            // Exibe as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }

            System.out.print("\nResposta: ");
            String resposta = "";
            try {
                resposta = sc.next();
            } catch (java.util.NoSuchElementException e) {
                // Se não houver entrada disponível, continue o loop
                continue;
            }

            int posicaoRespostaCorreta = opcoesResposta[2].equals("5x² + 2x + 5") ? 2 :
                    opcoesResposta[1].equals("5x² + 2x + 5") ? 1 :
                            opcoesResposta[0].equals("5x² + 2x + 5") ? 0 : 3;

            // Converte a resposta do usuário para o índice (0, 1, 2, 3)
            int respostaUsuario = resposta.toLowerCase().charAt(0) - 'a';

            if (respostaUsuario == posicaoRespostaCorreta) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas + "\n");
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: c) 5x² + 2x + 5\n");
                danoTomado = 10;
            }
        }

        return danoTomado;
    }
    // FIM DAS QUEESTÕES DO BOSS!!
//------------------------------------------- FIM DAS 10 QUESTÕES ------------------------------------------


    // Classe de personagem que define a vida, agilidade e dano do personagem.
    static class Personagem {
        int vida;
        int agilidade;
        double dano;
    }

    // Função usada para usuário escolher qual personagem ele vai querer jogar,
    // podendo escolher pelos pontos de dano, vida e agilidade.
    public static void criarPersonagem() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int vida = 0;
        int agilidade = 0;
        double dano = 0;

        do {
            System.out.println("ESCOLHA UM PERSONAGEM:\n ");
            System.out.println("[1] Jonn\n\nVida: 50\nAgilidade: 60\nDano: 8%\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("[2] Anne\n\nVida: 50\nAgilidade: 80\nDano: 6%\n");

            System.out.print("OPÇÃO DESEJADA: ");
            opcao = sc.nextInt();
            System.out.println("");

            if (opcao == 1) {
                // Colorindo a String no Console
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mJONN\u001B[0m\n");
                vida = 50;
                agilidade = 60;
                dano = 0.8;
            } else if (opcao == 2) {
                // Colorindo a String no Console utilizando \u001B[36m e outros.
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mANNE\u001B[0m\n");
                vida = 50;
                 agilidade = 80;
                dano = 0.6;
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }

            Thread.sleep(2500);
            System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
            Thread.sleep(2000);
            System.out.println("\n\n\n\n\n");
        } while (opcao < 1 || opcao > 2);

        jogar(vida, agilidade, dano);
    }

    // Função onde mostra os créditos, utilizamos uma String com texto em ASCII.
    public static void printCreditos() {
        String creditos = " _____    _ _                                                                       \n" +
                " |  ___|__(_) |_ ___    _ __   ___  _ __ _                                           \n" +
                " | |_ / _ \\ | __/ _ \\  | '_ \\ / _ \\| '__(_)                                          \n" +
                " |  _|  __/ | || (_) | | |_) | (_) | |   _                                           \n" +
                " |_|  \\___|_|\\__\\___/  | .__/ \\___/|_|  (_)                                          \n" +
                "          ____         |_|               _                                   _        \n" +
                "         | __ ) _ __ _   _ _ __   ___   | |    ___  ___  _ __   __ _ _ __ __| | ___   \n" +
                "  _____  |  _ \\| '__| | | | '_ \\ / _ \\  | |   / _ \\/ _ \\| '_ \\ / _` | '__/ _` |/ _ \\  \n" +
                " |_____| | |_) | |  | |_| | | | | (_) | | |__|  __/ (_) | | | | (_| | | | (_| | (_) | \n" +
                "         |____/|_|   \\__,_|_| |_|\\___/  |_____\\___|\\___/|_| |_|\\__,_|_|  \\__,_|\\___/  \n" +
                "          __  __            _                    __     ___     _       _             \n" +
                "         |  \\/  | __ _ _ __(_) __ _ _ __   __ _  \\ \\   / (_) __| | __ _| |            \n" +
                "  _____  | |\\/| |/ _` | '__| |/ _` | '_ \\ / _` |  \\ \\ / /| |/ _` |/ _` | |            \n" +
                " |_____| | |  | | (_| | |  | | (_| | | | | (_| |   \\ V / | | (_| | (_| | |            \n" +
                "         |_|  |_|\\__,_|_|  |_|\\__,_|_| |_|\\__,_|    \\_/  |_|\\__,_|\\__,_|_|            \n" +
                "              _                      ____                 _                 _   _    \n"
                + "             | | ___   __ _  ___    / ___|__ ___   ____ _| | ___ __ _ _ __ | |_(_)   \n"
                + "  _____   _  | |/ _ \\ / _` |/ _ \\  | |   / _` \\ \\ / / _` | |/ __/ _` | '_ \\| __| |   \n"
                + " |_____| | |_| | (_) | (_| | (_) | | |__| (_| |\\ V / (_| | | (_| (_| | | | | |_| |   \n"
                + "          \\___/ \\___/ \\__,_|\\___/   \\____\\__,_| \\_/ \\__,_|_|\\___\\__,_|_| |_|\\__|_|   \n\n\n\n";
        System.out.println(creditos);
    }

    // Função onde ocorre o jogo.
    public static void jogar(int vida, int agilidade, double dano) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        // Variáveis que vão ser usadas para controla a vida, dano e agilidade do
        // personagem.
        int vidaPersonagem = vida;
        int agilidadePersonagem = agilidade;
        double danoPersonagem = dano;
        double danoArma = 0;
        double danoGeral = 0;

        clearConsole();

        /*
         * Variáveis de textos em ASCII para o jogo.
         */

        String primeiroMob = "\n\n" +
                "                                                                                                              \n"+
                "                                                                                mm########                    \n"+
                "                                                                            ..@@            ##                \n"+
                "                                                                          @@--                ##              \n"+
                "                                                                        ..--                    ##            \n"+
                "                                                                        @@                        ++          \n"+
                "                                                                      ##                          ##          \n"+
                "                                                                    ##              MMMMM          mm         \n"+
                "                                                                  ++              ##    MM         ++         \n"+
                "                                                                  ++            ##  ##  MM         --         \n"+
                "                                                              ####            MM   ###  MM        ##          \n"+
                "                                                        ####  mm              ##  ##  ##         mm           \n"+
                "                                                      ##@@    ##              ##     ##         ##            \n"+
                "                                                    ##  @@     :               #..##::         ++             \n"+
                "                                      ----####MMm         ::  :      ###                      MM              \n"+
                "                      mm##mm--++++..                      ##  :     ######                   ##               \n"+
                "                    ##                                      --+    ########                ++                 \n"+
                "                  mm                                        MM:   ##################      MM                  \n"+
                "                  ##                                        ##:   #################    ##                     \n"+
                "                                                            ##-   ###############    ++..                     \n"+
                "                mm                                          MM    ############    ####                        \n"+
                "                ##                                          ::     M########      ##    ##                    \n" +
                "              ++                                              ::    @@##      ----        ##..                \n"+
                "              @@                                              ##            @@                ##              \n"+
                "            ::                                                  ##      ::##                    @@::          \n"+
                "            ##                                                    ..mm                              ##        \n"+
                "          ..--                                                                                        ##..    \n"+
                "          mm                                                                                            ##    \n"+
                "          ##                                                                                            @@    \n"+
                "          ::                                                                                            ##    \n"+
                "        --                                                                                              ##    \n"+
                "        ##                                                                                              ##    \n"+
                "        @@                                                                                              ##    \n"+
                "                             m                                                                          ##    \n"+
                "      mm                    ..                                                              m           ##    \n"+
                "      ##                    ++                                                              mm          mm    \n"+
                "      ##                    MM                                                              mm          ..    \n"+
                "      @@                    ##                                                              mm          --    \n"+
                "      @@                    ##                                                              --          ++    \n"+
                "      --                    --                                                              ##          ::    \n"+
                "      mm                    mm                                                              --          ##    \n";

        // System.out.println("\u001B[31m" + primeiroMob + "\u001B[0m");
        // System.out.println(primeiroMob);

        String MobPequeno = "                                                            \n" +
                "                      ::######MM######@@                    \n" +
                "                ..##                        MM##            \n" +
                "              ##                                --++        \n" +
                "            ##                                      ##      \n" +
                "          ##                                          ##    \n" +
                "        ++                                              ##  \n" +
                "                                                        ##  \n" +
                "      @@                                                    \n" +
                "    --                                                    MM\n" +
                "    ::                                                    ##\n" +
                "  ..                                                      ++\n" +
                "  ##                                                        \n" +
                "  ..                                                        \n" +
                "              ####                          ####            \n" +
                "            ########                      ########          \n" +
                "  --        ########                      @@####..          \n" +
                "  mm          mmMM                          ++              \n" +
                "  MM                                                      --\n" +
                "  ##                                                      ++\n" +
                "  ##                                                      ##\n" +
                "  --                                                      ##\n" +
                "    ##                                                      \n" +
                "    mm                                            ..##  MM  \n" +
                "    ..   #                                      ####    MM  \n" +
                "    ..   MM##                                ######    --   \n" +
                "     ##    ####@@                        ####--##      ##   \n" +
                "      mm     ########            ..######  --##..           \n" +
                "              --##  --############      ..##--      ##      \n" +
                "        ##        ####                ####mm                \n" +
                "        --          ####..        --####          ##        \n" +
                "          ##            ####  ++####++          mm          \n" +
                "            mm            @@####::            ++            \n" +
                "              ..                                            \n" +
                "                --                          ##              \n" +
                "                  ##                      ##                \n" +
                "                    --@@                --                  \n" +
                "                        MM##::    ..@@                      \n";

                String voceMorreu = 
                " ██▒   █▓ ▒█████   ▄████▄  ▓█████     ███▄ ▄███▓ ▒█████   ██▀███   ██▀███  ▓█████  █    ██     ▐██▌ \n" +
                "▓██░   █▒▒██▒  ██▒▒██▀ ▀█  ▓█   ▀    ▓██▒▀█▀ ██▒▒██▒  ██▒▓██ ▒ ██▒▓██ ▒ ██▒▓█   ▀  ██  ▓██▒    ▐██▌ \n" +
                " ▓██  █▒░▒██░  ██▒▒▓█    ▄ ▒███      ▓██    ▓██░▒██░  ██▒▓██ ░▄█ ▒▓██ ░▄█ ▒▒███   ▓██  ▒██░    ▐██▌ \n" +
                "  ▒██ █░░▒██   ██░▒▓▓▄ ▄██▒▒▓█  ▄    ▒██    ▒██ ▒██   ██░▒██▀▀█▄  ▒██▀▀█▄  ▒▓█  ▄ ▓▓█  ░██░    ▓██▒ \n" +
                "   ▒▀█░  ░ ████▓▒░▒ ▓███▀ ░░▒████▒   ▒██▒   ░██▒░ ████▓▒░░██▓ ▒██▒░██▓ ▒██▒░▒████▒▒▒█████▓     ▒▄▄  \n" +
                "   ░ ▐░  ░ ▒░▒░▒░ ░ ░▒ ▒  ░░░ ▒░ ░   ░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░ ▒▓ ░▒▓░░░ ▒░ ░░▒▓▒ ▒ ▒     ░▀▀▒ \n" +
                "   ░ ░░    ░ ▒ ▒░   ░  ▒    ░ ░  ░   ░  ░      ░  ░ ▒ ▒░   ░▒ ░ ▒░  ░▒ ░ ▒░ ░ ░  ░░░▒░ ░ ░     ░  ░ \n" +
                "     ░░  ░ ░ ░ ▒  ░           ░      ░      ░   ░ ░ ░ ▒    ░░   ░   ░░   ░    ░    ░░░ ░ ░        ░   \n" +
                "      ░      ░ ░  ░ ░         ░  ░          ░       ░ ░     ░        ░        ░  ░   ░         ░       \n" +
                "     ░            ░                                                                                      \n";

                String olho = "                                                            \n" +
        "                                                            \n" +
        "                          ++######                          \n" +
        "                    ######################                  \n" +
        "                ##############################              \n" +
        "            ++############++------++@@##mm@@####            \n" +
        "          ######::####++--          --++##MM::####++        \n" +
        "        ######..mmmmmm..    --..::    ..--##++--####mm      \n" +
        "      @@####::::####--    ######--##    ::::mmmm..####      \n" +
        "      ####--....mm##..  MM######  ##--  --@@##  ++mm####    \n" +
        "    ####++..::--  mm    ##############  ..--##..++..mm####  \n" +
        "    ####++....--  MM..  ##############  ..::##  ::--######  \n" +
        "      ####--::++MM##..    ##########::  --####  --..####    \n" +
        "      ..####..--####::    ::######..    ++..@@--..####      \n" +
        "        mm####::::mm##--      ..      --####::::####++      \n" +
        "          ++####mmMM####::..      ..::####mmMM####::        \n" +
        "              ######MM####++++::++mm############            \n" +
        "                ##############################              \n" +
        "                    ######################                  \n" +
        "                            ..++..                          \n" +
        "                                                            \n" +
        "                                                            ";
        // System.out.println("\u001B[31m" + MobPequeno + "\u001B[0m");
        // System.out.println(MobPequeno);

        String escritaAuditorio = "   ▄▄▄▄███▄▄▄▄      ▄████████     ███        ▄█    █▄      ▄▄▄▄███▄▄▄▄      ▄████████ ███▄▄▄▄    ▄████████    ▄████████    ▄████████ \n" +
                     " ▄██▀▀▀███▀▀▀██▄   ███    ███ ▀█████████▄   ███    ███   ▄██▀▀▀███▀▀▀██▄   ███    ███ ███▀▀▀██▄ ███    ███   ███    ███   ███    ███ \n" +
                     " ███   ███   ███   ███    ███    ▀███▀▀██   ███    ███   ███   ███   ███   ███    ███ ███   ███ ███    █▀    ███    █▀    ███    ███ \n" +
                     " ███   ███   ███   ███    ███     ███   ▀  ▄███▄▄▄▄███▄▄ ███   ███   ███   ███    ███ ███   ███ ███         ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                     " ███   ███   ███ ▀███████████     ███     ▀▀███▀▀▀▀███▀  ███   ███   ███ ▀███████████ ███   ███ ███        ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                     " ███   ███   ███   ███    ███     ███       ███    ███   ███   ███   ███   ███    ███ ███   ███ ███    █▄    ███    █▄  ▀███████████ \n" +
                     " ███   ███   ███   ███    ███     ███       ███    ███   ███   ███   ███   ███    ███ ███   ███ ███    ███   ███    ███   ███    ███ \n" +
                     "  ▀█   ███   █▀    ███    █▀     ▄████▀     ███    █▀     ▀█   ███   █▀    ███    █▀   ▀█   █▀  ████████▀    ██████████   ███    ███ \n" +
                     "                                                                                                                          ███    ███ \n" +
                     "                                                                                                                                     \n";


        String ultimoPedaco = "┓┏                               ┓ •            ┓       ┓             \n" +
        "┃┃┏┓┏┏┓  ┏┓┏┓┏┏┓┏┓╋┏┓┏┓┓┏  ┏┓  ┓┏┃╋┓┏┳┓┏┓  ┏┓┏┓┏┫┏┓┏┓  ┏┫┏┓  ┏┳┓┏┓┏┓┏┓\n" +
        "┗┛┗┛┗┗   ┗ ┛┗┗┗┛┛┗┗┛ ┗┛┗┻  ┗┛  ┗┻┗┗┗┛┗┗┗┛  ┣┛┗ ┗┻┗┻┗┛  ┗┻┗┛  ┛┗┗┗┻┣┛┗┻\n" +
        "                                           ┛                      ┛   ";

        String capelaDeseho = 
            "                                                            \n" +
            "                                                            \n" +
            "                                                            \n" +
            "                              ##                            \n" +
            "                              ##                            \n" +
            "                           #########                        \n" +
            "                              ##                            \n" +
            "                              ##                            \n" +
            "                              ####                          \n" +
            "                            ##    ##                        \n" +
            "                          ##        ##                      \n" +
            "                        ##            ##                    \n" +
            "                      ++################                    \n" +
            "                      ++              ##                    \n" +
            "                      ++      ##      ##                    \n" +
            "                      ++      ##      ##                    \n" +
            "                      ++      ##      ##                    \n" +
            "                      ++              ##                    \n" +
            "                      ++      ..      ##                    \n" +
            "                      ##    ##  --@@  ####                  \n" +
            "                    ##++    ++    ##  ##  ##                \n" +
            "                  ##  ++    ##    ##  ##    ##              \n" +
            "                ##    ..      ##++    ++      ##            \n" +
            "              ##                                ##          \n" +
            "            ##                 ##                  ##        \n" +
            "          ####  ##  ##      ##.  .##     ##    ::  ####      \n" +
            "            ##  ##  ##     ##      ##    ##    ++ ##        \n" +
            "            ##            ##        ##            ##        \n" +
            "            ##            ::        ##            ##        \n" +
            "            ##  ##  ##    ##        ##   ##    ++ ##        \n" +
            "            ##            ##        ##            ##        \n" +
            "            ##            ##        ##            ##        \n" +
            "            ##            ##        ##            ##        \n" +
            "    ::####################################################  \n";

            String pentagrama =  
            "                                                            \n" +
            "                          ##########                        \n" +
            "                    ##          ####  ####                  \n" +
            "                  @@            ##..    ######              \n" +
            "              ####            ##  mm        ##              \n" +
            "              ##              ##              ##            \n" +
            "            ####                    ##          ##          \n" +
            "            ####  MM######  ##      ##          ##          \n" +
            "          ##    ##        ##  ########            ##        \n" +
            "          ##      ##                ########      ##        \n" +
            "          ##      ++##  ##          ##        @@####        \n" +
            "          ##        ++##            ##@@    ##++            \n" +
            "          ##          ####          @@..##@@      ##        \n" +
            "          ##        ##    ##      ####@@          ##        \n" +
            "          ##        ++        ####    ##          ##        \n" +
            "            ##    ##      @@##        @@        ##          \n" +
            "            ##  --    ##      ##      ##        ##          \n" +
            "              ######            ##    ##      ####          \n" +
            "              ##                  ##  ##    mm@@            \n" +
            "                ####                ####  ##                \n" +
            "                    ####              ####                  \n" +
            "                        ##############                      \n" +
            "                                                            ";


        String fimDoJogo =  
        "  █████▒██▓ ███▄ ▄███▓   ▓█████▄  ▒█████      ▄▄▄██▀▀▀▒█████    ▄████  ▒█████                 \n" +
        "▓██   ▒▓██▒▓██▒▀█▀ ██▒   ▒██▀ ██▌▒██▒  ██▒      ▒██  ▒██▒  ██▒ ██▒ ▀█▒▒██▒  ██▒               \n" +
        "▒████ ░▒██▒▓██    ▓██░   ░██   █▌▒██░  ██▒      ░██  ▒██░  ██▒▒██░▄▄▄░▒██░  ██▒               \n" +
        "░▓█▒  ░░██░▒██    ▒██    ░▓█▄   ▌▒██   ██░   ▓██▄██▓ ▒██   ██░░▓█  ██▓▒██   ██░               \n" +
        "░▒█░   ░██░▒██▒   ░██▒   ░▒████▓ ░ ████▓▒░    ▓███▒  ░ ████▓▒░░▒▓███▀▒░ ████▓▒░ ██▓  ██▓  ██▓ \n" +
        " ▒ ░   ░▓  ░ ▒░   ░  ░    ▒▒▓  ▒ ░ ▒░▒░▒░     ▒▓▒▒░  ░ ▒░▒░▒░  ░▒   ▒ ░ ▒░▒░▒░  ▒▓▒  ▒▓▒  ▒▓▒ \n" +
        " ░      ▒ ░░  ░      ░    ░ ▒  ▒   ░ ▒ ▒░     ▒ ░▒░    ░ ▒ ▒░   ░   ░   ░ ▒ ▒░  ░▒   ░▒   ░▒  \n" +
        " ░ ░    ▒ ░░      ░       ░ ░  ░ ░ ░ ░ ▒      ░ ░ ░  ░ ░ ░ ▒  ░ ░   ░ ░ ░ ░ ▒   ░    ░    ░   \n" +
        "        ░         ░         ░        ░ ░      ░   ░      ░ ░        ░     ░ ░    ░    ░    ░  \n" +
        "                          ░                                                      ░    ░    ░  \n";
        // Começando o jogo e as histórias
        historiaInicial();
        escolherCaminhoPrincipal(input);
        // Escolher arma e definir o dano e o status atual.
        danoArma = primeiraSala(input, agilidadePersonagem);
        if(danoArma == 10){
            agilidadePersonagem -= 10;
        }
        danoGeral = (dano * danoArma) + danoArma;
        clearConsole();
        statusAtual(vidaPersonagem, agilidadePersonagem, danoGeral);
        // FAZER FUNÇÃO DE AO FINALIZAR BUSCA PELA SALA, O PERSONAGEM SE DEPARA COM UM
        // MONSTRO NA PORTA ANTES (SENDO A PRIMEIRA BOSS FIGHT)
        System.out.println("\n\n=-=-=-=-=-=-=-=-= VOCÊ VOLTOU PARA O CORREDOR =-=-=-=-=-=-=-=-=\n\n");
        corredor(input);
        refeitorio(input);
        saidaRefeitorio(input, MobPequeno, danoGeral, danoArma, voceMorreu);
        biblioteca(input, olho, MobPequeno, voceMorreu);
        ciencias(input, escritaAuditorio, MobPequeno, voceMorreu);
        porao(input, MobPequeno, voceMorreu);
        floresta(input, ultimoPedaco, capelaDeseho, MobPequeno, voceMorreu);
        capela(input, pentagrama, primeiroMob, voceMorreu, fimDoJogo);

    }

    // Função que mostra as instruções do jogo, ele contem um sleep onde vai segurar
    // o texto por mais tempo na tela para o usuário ler.
    public static void instrucoes() throws InterruptedException {

        // Tempo em segundos para deixar o texto na tela e depois prosseguir o jogo
        long tempoEmSegundos = 3500;

        System.out.println("\n=-=-=-=-=-= INSTRUÇÕES =-=-=-=-=-=\n");
        System.out.println("- Leia as explicações e a história para aprender e responder as questões de matemática.");
        System.out.println(
                "- Seu personagem terá uma VIDA, onde ela vai servir de base para as suas tentivas de responder as questões.");
        System.out.println("- Leia com atenção as questões!");
        System.out.println("- Itens de Dano irão ajudar a finalizar mais rápido os Monstros.");
        System.out.println("- Itens de Agilidade irão ajudar a desviar de ataques. Caso você tenha baixa");
        System.out.println(
                "- Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.");
        System.out.println("- Aproveite o jogo e se divirta!\n");
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        Thread.sleep(tempoEmSegundos);

    }

    // Função para limpar o console. Ele não limpa literalmente, mas sobe. Estamos
    // utilizando para melhorar a imersão e a visualização do usuário.
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void historiaInicial() throws InterruptedException {

        /*
         * Variáveis de textos em ASCII para a história do jogo.
         */

        String historiaString = " ██░ ██  ██▓  ██████ ▄▄▄█████▓ ▒█████   ██▀███   ██▓ ▄▄▄      \n" +
                "▓██░ ██▒▓██▒▒██    ▒ ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒▓██▒▒████▄    \n" +
                "▒██▀▀██░▒██▒░ ▓██▄   ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒▒██▒▒██  ▀█▄  \n" +
                "░▓█ ░██ ░██░  ▒   ██▒░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄  ░██░░██▄▄▄▄██ \n" +
                "░▓█▒░██▓░██░▒██████▒▒  ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒░██░ ▓█   ▓██▒\n" +
                " ▒ ░░▒░▒░▓  ▒ ▒▓▒ ▒ ░  ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░▓   ▒▒   ▓▒█░\n" +
                " ▒ ░▒░ ░ ▒ ░░ ░▒  ░ ░    ░      ░ ▒ ▒░   ░▒ ░ ▒░ ▒ ░  ▒   ▒▒ ░\n" +
                " ░  ░░ ░ ▒ ░░  ░  ░    ░      ░ ░ ░ ▒    ░░   ░  ▒ ░  ░   ▒   \n" +
                " ░  ░  ░ ░        ░               ░ ░     ░      ░        ░  ░ \n\n\n\n";

        String boaSorteString = "______                              _       \n" +
                "| ___ \\                            | |      \n" +
                "| |_/ / ___   __ _   ___  ___  _ __| |_ ___ \n" +
                "| ___ \\/ _ \\ / _` | / __|/ _ \\| '__| __/ _ \\\n" +
                "| |_/ / (_) | (_| | \\__ \\ (_) | |  | ||  __/\n" +
                "\\____/ \\___/ \\__,_| |___/\\___/|_|   \\__\\___|";

        // Começando o jogo e as histórias
        System.out.println("\u001B[31m" + historiaString + "\u001B[0m");

        Thread.sleep(2000);
        System.out.println(
                "Após a perda recente de seu pai, um mestre da matemática, você se encontra em um estado de luto e confusão. Em uma noite, você decide tentar entrar em contato com ele,\nna esperança de sentir sua presença de alguma forma. ");
        Thread.sleep(7000);
        System.out.println("Porém você acaba encontrando um outro ser...");
        Thread.sleep(6000);
        System.out.println(
                "\nAcreditando ser apenas algo da sua imaginação, você apenas ignora e decide dormir... \nMas essa nem sempre é a melhor opção, certo?\n");
        System.out.println(
                "Você começa a ter um pesadelo e nele você vê partes de um mapa antigo e esse mapa parece familiar para você...\n\n");
        Thread.sleep(10000);
        System.out.println("\u001B[31m " + boaSorteString + "\u001B[0m\n\n\n");
        Thread.sleep(8000);
        clearConsole();
        System.out.println(
                "\n\nAo acordar, você se encontra no meio do nada em frente a uma escola, muito confuso, você percebe que não está sozinho, escutando barulhos de passos se aproximando, mas você não consegue enxergar nada com a neblina e as enormes árvores.\n\n");
    }

    public static int escolherCaminhoPrincipal(Scanner input) throws InterruptedException {
        int escolhaPrincipal;

        do {
            System.out.println("- O que eu devo fazer?");
            System.out.println("== [1] Procurar sua casa. [2] Procurar ajuda. [3] Entrar na escola. ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            escolhaPrincipal = input.nextInt();

            if (escolhaPrincipal == 1) {
                System.out.println("\n- Não é uma boa ideia, imagino que eu não esteja perto de casa.\n");
            } else if (escolhaPrincipal == 2) {
                System.out.println(
                        "\n- Não é uma boa ideia, não consigo enxergar nada além dessa escola e não acho que teria alguém por perto...\n");
            } else if (escolhaPrincipal == 3) {
                System.out.println("\n- Acho que é a única opção que eu tenho, mesmo que essa escola seja medonha.\n");
            } else if (escolhaPrincipal > 3 || escolhaPrincipal < 1) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (escolhaPrincipal != 3);
        Thread.sleep(3000);
        return 0;
    }

    // Escolha da primeira da Sala
    public static int primeiraSala(Scanner input, int agilidadePersonagem) throws InterruptedException {

        int opcaoSala;
        int danoArma = 0;

        Thread.sleep(2500);
        clearConsole();
        System.out.println("\n =-=-=-=-=-=-=-=-= VOCÊ ENTROU NA ESCOLA =-=-=-=-=-=-=-=-=\n\n");
        System.out.println("== Você se encontra em um corredor imenso e tem duas portas próximas a você. ==");
        System.out.println("== Você precisar entrar em uma dessas salas para procurar algo para se proteger... ==");

        do {
            System.out.println("\n\n== Você deseja entrar na sala a ESQUERDA ou a DIREITA? ==\n");
            System.out.println("[1] SALA A ESQUERDA");
            System.out.println("[2] SALA A DIREITA\n");
            System.out.print("\nOPÇÃO DESEJADA: ");
            opcaoSala = input.nextInt();

            if (opcaoSala == 1) {
                danoArma = salaEsquerda(input, agilidadePersonagem);
                return danoArma;
            } else if (opcaoSala == 2) {
                salaDireita(input);
            }

        } while (opcaoSala != 1);

        return danoArma;
    }

    public static void salaDireita(Scanner input) throws InterruptedException {
        int primeiraOpcao;
        int segundaOpcao;

        System.out.println("\n=-=-=-=-=-=-=-=-= VOCÊ ENTROU NA SALA À DIREITA =-=-=-=-=-=-=-=-=\n");
        System.out.println("== Você se encontra em uma sala de aula com as mesas e cadeiras reviradas. ==");

        do {
            System.out.println(" == Você deseja: [1] EXPLORAR a sala [2] VOLTAR? ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            primeiraOpcao = input.nextInt();

            if (primeiraOpcao == 1) {
                System.out.println("\n== Você decidiu explorar a sala ==");
                System.out.println("\nPROCURANDO...\n");
                Thread.sleep(1500);
                System.out.println("== Você olhou nas mesas e nas cadeiras e não encontrou nada! ==");
                System.out.println("== Você deseja: [1] PROCURAR no armário [2] VOLTAR para o corredor ==\n");
                System.out.print("== OPÇÃO DESEJADA: ");
                segundaOpcao = input.nextInt();

                do {
                    if (segundaOpcao == 1) {
                        System.out.println("\n== Você decidiu olhar o armário ==");
                        System.out.println("\nPROCURANDO...\n");
                        Thread.sleep(1000);
                        System.out.println("== Você encontrou uma maçã apodrecida e uns papéis. ==");
                        System.out.println("- Melhor voltar para a corredor e ir explorar a outra sala...");
                        Thread.sleep(4000);
                        break;
                    } else if (segundaOpcao == 2) {
                        break;
                    } else if (segundaOpcao < 1 || segundaOpcao > 2) {
                        System.out.println("\nOPÇÃO INVÁLIDA!\n");
                    }

                } while (segundaOpcao < 1 || segundaOpcao > 2);
            } else if (primeiraOpcao == 2) {
                System.out.println("Você decidiu ir embora...");
                Thread.sleep(1500);
            } else if (primeiraOpcao < 1 || primeiraOpcao > 2) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }

        } while (primeiraOpcao < 1 || primeiraOpcao > 2);
    }

    // Jogador entrou na sala à esquerda e vai encontrar sua arma
    public static int salaEsquerda(Scanner input, int agilidadePersonagem) throws InterruptedException {
        int danoArma = 0;
        int opcaoPrimeiraArma;
        int opcaoSala;

        System.out.println("\n=-=-=-=-=-=-=-=-= VOCÊ ENTROU NA SALA À ESQUERDA =-=-=-=-=-=-=-=-=\n");

        System.out.println("\n== Você se encontra em uma sala com poucas mesas. ==");
        System.out.println("== Você acha que viu algo para se proteger perto da mesa do professor. ==");
        System.out.println("== Você deseja ir [1] OLHAR a mesa do professor ou deseja ir [2] EMBORA ==\n");
        System.out.print("== OPÇÃO DESEJADA: ");
        opcaoSala = input.nextInt();
        if (opcaoSala == 1) {
            do {
                System.out.println(
                        "\n== Você encontra uma TESOURA e uma FACA na mesa do professor, qual você deseja pegar? ==\n");
                System.out.println("[1] FACA\n\nDano: 10\nAgilidade: -10\n");
                System.out.println("[2] TESOURA\n\nDano: 7\nAgilidade: 10\n");

                System.out.print("OPÇÃO DESEJADA: ");
                opcaoPrimeiraArma = input.nextInt();

                if (opcaoPrimeiraArma == 1) {
                    System.out.println("== Você pegou a FACA! ==\n");
                    danoArma = 10;
                    agilidadePersonagem -= 10;
                } else if (opcaoPrimeiraArma == 2) {
                    System.out.println("== Você pegou a TESOURA! ==\n");
                    danoArma = 7;
                    agilidadePersonagem += 10;
                } else {
                    System.out.println("\n== OPÇÃO INVÁLIDA!\n");
                }

            } while (opcaoPrimeiraArma < 1 || opcaoPrimeiraArma > 2);

            return danoArma;
        } else if (opcaoSala == 2) {
            System.out.println("== Você decidiu ir embora... ==");
            Thread.sleep(1500);
            primeiraSala(input, agilidadePersonagem);
        }
        return danoArma;
    }

    public static void statusAtual(int vida, int agilidade, double dano) {
        System.out.println("=-=-=-=-=-= STATUS ATUAL =-=-=-=-=-=");
        System.out.println("\nVida: " + vida);
        System.out.println("Agilidade: " + agilidade);
        System.out.printf("Dano: %.2f\n", dano);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

    }
    public static int corredor (Scanner sc){
        int corredor;
        do {
            System.out.println("== Após a escolha da arma, você volta para o corredor \nPorém você escuta alguém abrindo a porta principal da escola ==");
            System.out.println("== Você deseja: [1] Correr até o final do corredor [2] Entrar em uma das salas ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            corredor = sc.nextInt();

            if (corredor == 1) {
                System.out.println("\n == Você corre e entra em um armário, você consegue ver um ser andando e passando reto pelo armário, parece que você está salvo ==\n\n\n\n- Mas o que é aquilo? eu não sei o que ta acontecendo e não sei que tipo de monstro é aquele, eu tenho que sair daqui\n");
            } else if (corredor == 2) {
                System.out.println(
                        "\n- Se eu entrar nessa sala ele poderia me ouvir, eu acabaria morrendo, melhor não\n");
            } else if (corredor > 2 || corredor < 1) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (corredor != 1);

        return 0;
    }
    public static int refeitorio (Scanner sc) throws InterruptedException{
        int refeitorio;
        do {
            System.out.println("== Você sai do armário, onde deseja entrar? ==");
            System.out.println("== Você deseja: [1] Refeitório [2] Sala 101 [3] Sala 103 ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            refeitorio = sc.nextInt();

            if (refeitorio == 1) {
                System.out.println("== Assim que você entra você vê vários papéis espalhados com um idioma que você jamais entenderia \nO que são esses tantos de papéis? ==");
                System.out.println("== Він знає, що ти тут, він іде за тобою, він збирається послати всю свою армію == \nIsso é russo??? Eu realmente não consigo entender isso...");
                Thread.sleep(10000);
                clearConsole();
                System.out.println("\n- O que é isso?");
                System.out.println("== Você encontrou um mapa. 1/7 ==");
                Thread.sleep(1000);
                //Colocar o cara pra pegar arma
            } else if (refeitorio == 2) {
                System.out.println("- Acabei entrando na sala, parece estar sem nada dentro");
            } else if (refeitorio == 3) {
                        System.out.println("Está trancado.");
            } else if (refeitorio > 3 || refeitorio < 1) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (refeitorio != 1);

            return 0;
        }
        public static int saidaRefeitorio (Scanner sc, String mob, double dano, Double armaAtual, String voceMorreu) throws InterruptedException{

            //Texto usado para exibir a mensagem de sua morte.
            
            int mapaUm;
            int opcao;
            String arma = "";

            if(armaAtual == 10){
                arma = "FACA";
            }else if (armaAtual == 7){
                arma = "TESOURA";
            }else{
                arma = "SOCO";
            }

            do {
                System.out.println("\n- Um pedaço de um mapa? Se parece com o mapa que eu sonhei mas...por quê?");
                System.out.println("== Você deseja: [1] Sair do Refeitório [2] Explorar mais ==\n");
                System.out.print("== OPÇÃO DESEJADA: ");
                mapaUm = sc.nextInt();
    
                if (mapaUm == 1) {
                    System.out.println("\n ==  Você começa á sair do refeitório quando de repente aparece 2 monstros na porta ==");
                    System.out.println(mob);
                    Thread.sleep(7000);
                    clearConsole();

                    do {
                        System.out.printf("\n- O que devo fazer? [1] Usar %s para tentar bater neles  [2] Correr\n", arma);
                        System.out.print("== Opção desejada: ");
                        opcao = sc.nextInt();
                        if (opcao == 1){
                            System.out.println("\n- É preciso fazer uma conta para dar dano á eles: \n");
                            int questao1 = exercicioAdicao01();
                            if(questao1 == 10){
                                Thread.sleep(7000);
                                clearConsole();
                                System.out.println(voceMorreu);
                                Thread.sleep(10000);
                                System.exit(0);
                            } else{
                                System.out.println("\n\n== Você conseguiu derrotar o primeiro monstro, falta apenas mais um. ==\n\n");
                            }
                            Thread.sleep(2000);
                            clearConsole();
                            int questao2 = exercicioAdicao02();
                            if(questao2 == 10){
                                Thread.sleep(7000);
                                clearConsole();
                                System.out.println(voceMorreu);
                                Thread.sleep(10000);
                                System.exit(0);
                            } else{
                                System.out.println("\n\n== Você conseguiu derrotar o último monstro. ==\n\n");
                            }
                            System.out.printf("Você acertou: %.2f de dano em cada monstro.\n\n== Os monstros estão mortos! ==\n", dano);
                            Thread.sleep(3000);
                            System.out.println("\n- CONTA?!?! MATEMÁTICA?!?!? Isso é muito estranho, eu não sei o que está acontecendo\n");
                            Thread.sleep(3000);
                            clearConsole();
                            System.out.println("\n\n==== Você saiu do refeitório ====");
                            
                        }else if (opcao == 2){
                            System.out.println("\n- Eles são muito rápidos, não consigo fugir deles\n");
                        }
                    } while (opcao != 1);
                } else if (mapaUm == 2) {
                    System.out.println("\n- Só vejo um monte de papéis, não consigo entender nada\n");
                }
            } while (mapaUm != 1);
    
            return 0;
        }
        // Sala da biblioteca
        public static int biblioteca (Scanner sc, String olho, String mob, String voceMorreu) throws InterruptedException{
            int salaMusica = 0;
            int piano = 0;
            do{
                System.out.println("\n- Onde devo ir agora?");
                System.out.println("[1] Sala de música [2] Biblioteca");
                
                System.out.print("OPÇÃO: ");
                salaMusica = sc.nextInt();
                if (salaMusica == 1){
                    System.out.println("\n- Quando eu entro me vem uma sensação estranha, um aperto no coração.\n");
                    System.out.println("\n- Eu lembro dessa sala...eu já estudei aqui mas, a escola pegou fogo, ela foi completamente destruída, como ela está inteira?\n");
                    Thread.sleep(5000);
                    clearConsole();
                }else if(salaMusica == 2){
                    System.out.println("- Eu gostaria de ir para a sala de música primeiro, ela parece familiar...");
                }else{
                    System.out.println("\nOPÇÃO INVÁLIDA!\n");
                }
            }while(salaMusica > 2 || salaMusica < 1);
            do{
                System.out.println("\n[1] Olhar piano [2] Olhar gavetas\n");
            piano = sc.nextInt();
                if (piano == 1){
                    clearConsole();
                    System.out.println("- Mais um mapa, tenho certeza que aqueles bichos irão aparecer novamente");
                    System.out.println("== Mapa encontrado 2/7 ==");
                    Thread.sleep(5000);
                    System.out.println(mob);
                    Thread.sleep(3000);
                    System.out.println(" - AI MEU DEUS, de novo esse bicho");
                    Thread.sleep(7000);
                    clearConsole();
                    int questao3 = exercicioAdicao03();
                    if(questao3 == 10){
                        Thread.sleep(7000);
                        clearConsole();
                        System.out.println(voceMorreu);
                        Thread.sleep(10000);
                        System.exit(0);
                    }else{
                        System.out.println("\n\n== Você conseguiu derrotar o último monstro. ==\n\n");
                    }
                    System.out.println("- Agora vou olhar a gaveta, espero que não tenha mais nada estranho.");

                    // gaveta
                    System.out.println("\n- Mas o que é isso?");
                    Thread.sleep(2500);
                    System.out.println(olho);
                    System.out.println("- QUE M**** É ESSA? Isso é um olho???");
                    Thread.sleep(10000);
                    clearConsole();
                    System.out.println("- Eu não sei o que é esse bicho, eu não sei o porque dele me perseguir, eu preciso descobrir o que está acontecendo\n");
                    Thread.sleep(3000);
                    Thread.sleep(7000);

                }else if (piano == 2){
                    System.out.println("\n- Mas o que é isso?");
                    System.out.println(olho);
                    System.out.println("- QUE M**** É ESSA? Isso é um olho???");
                    Thread.sleep(5000);
                    clearConsole();
                    System.out.println("- Eu não sei o que é esse bicho, eu não sei o porque dele me perseguir, eu preciso descobrir o que está acontecendo\n");
                    Thread.sleep(3000);
                    System.out.println("\n- Vou olhar o piano agora, espero que não tenha mais nada estranho");
                    Thread.sleep(5000);

                    // Piano
                    clearConsole();
                    System.out.println("- Mais um mapa, tenho certeza que aqueles bichos irão aparecer novamente");
                    System.out.println("== Mapa encontrado 2/7 ==");
                    Thread.sleep(5000);
                    System.out.println(mob);
                    Thread.sleep(3000);
                    System.out.println(" - AI MEU DEUS, de novo esse bicho");
                    Thread.sleep(7000);
                    clearConsole();
                    int questao3 = exercicioAdicao03();
                    if(questao3 == 10){
                        Thread.sleep(7000);
                        clearConsole();
                        System.out.println(voceMorreu);
                        Thread.sleep(10000);
                        System.exit(0);
                    }else{
                        System.out.println("\n\n== Você conseguiu derrotar o monstro. ==\n\n");
                    }
                    Thread.sleep(7000);
                }else{
                    System.out.println("\nOPÇÃO INVÁLIDA!\n");
                }
            }while(piano > 2 || piano < 1);

                System.out.println("== Indo para a biblioteca ==");
                System.out.println("- Nossa, não sobrou nada nessa sala, o cheiro dessa sala é podre, não consigo ficar aqui por muito tempo");
                Thread.sleep(5000);
                System.out.println("- A maioria dos pedaços de livros que tem aqui são do meu pai, eu reconheço essas páginas, mas... como poderiam ficar inteiros?");
                Thread.sleep(3000);
                System.out.println("- Outro pedaço de um mapa, vou ter que pegar, espero que não apareça nenhum monstro");
                System.out.println("\n== Mapa encontrado 3/7 ==");
                Thread.sleep(5000);
                System.out.println(". . .");
                Thread.sleep(5000);
                System.out.println("- Parece que não apareceu nenhum monstro.");
                Thread.sleep(5000);
                System.out.println(mob);
                Thread.sleep(5000);
                clearConsole();
                int questao4 = exercicioSubtracao01();
                if(questao4 == 10){
                    Thread.sleep(7000);
                    clearConsole();
                    System.out.println(voceMorreu);
                    Thread.sleep(10000);
                    System.exit(0);
                }else{
                    System.out.println("\n\n== Você conseguiu derrotar o monstro. ==\n\n");
                }
                Thread.sleep(7000);
                System.out.println("- DROGA. Só foi eu falar que não tinha monstro...");
            return 0;
        }
        public static int ciencias (Scanner sc, String escritaAuditorio, String mob, String voceMorreu) throws InterruptedException{
            int ciencias;
            do {
                System.out.println("- Você volta para o corredor e percebe que ainda tem duas portas");
                System.out.println("== Preciso dar uma olhada antes de ir para o porão ==\n");
                System.out.println("[1] Sala de ciências [2] Auditório");
                System.out.print("OPÇÃO: ");
                ciencias = sc.nextInt();
    
                if (ciencias == 1) {
                    System.out.println("- A sala de ciências tem um cheiro forte de produtos químicos, todos suspeitavam que o incêndio tinha começado daqui mas descobriram que tinha sido no porão\n");
                    System.out.println("- Diziam que ninguém além do meu pai ia no porão, eu tenho que ir lá, já que nunca me deixaram ir");
                    System.out.println("- E não tem nada aqui, eu deveria ir para o auditório");
                    Thread.sleep(8000);
                    clearConsole();
                    System.out.println(". . .");
                    System.out.println("\n- O que é aquilo no palco? eu tenho que ir lá ler");
                    System.out.println("== Quando você chega no palco, você percebe uma escrita enorme, mas o que é aquilo? Você talvez nunca descubra. ==");
                    System.out.println("\u001B[31m" + escritaAuditorio + "\u001B[0m");
                    Thread.sleep(7000);
                    System.out.println("- Mathmancer? o que...eu ja ouvi esse nome mas, eu não lembro");
                    Thread.sleep(5000);
                    System.out.println("== DOIS MONSTROS APARECEM ==");
                    Thread.sleep(2500);
                    System.out.println(mob);
                    Thread.sleep(4000);
                    clearConsole();
                    int questao5 =  exercicioSubtracao02();
                    if(questao5 == 10){
                        Thread.sleep(7000);
                        clearConsole();
                        System.out.println(voceMorreu);
                        Thread.sleep(10000);
                        System.exit(0);
                    }else{
                        System.out.println("\n\n== Você conseguiu derrotar um dos monstros. ==\n\n");
                    }
                    Thread.sleep(2000);
                    clearConsole();
                    System.out.println("- Agora só falta o outro...");
                    Thread.sleep(2000);
                    System.out.println(mob);
                    Thread.sleep(5000);
                    clearConsole();
                    int questao6 = exercicioMultiplicacao01();
                    if(questao6 == 10){
                        Thread.sleep(7000);
                        clearConsole();
                        System.out.println(voceMorreu);
                        Thread.sleep(10000);
                        System.exit(0);
                    }else{
                        System.out.println("\n\n== Você conseguiu derrotar o último monstro. ==\n\n");
                    }
                    Thread.sleep(4000);
                    clearConsole();

                    System.out.println("== Mapas encontrados 5/7 ==");
                } else if (ciencias == 2) {
                    System.out.println("- Eu deveria dar uma olhada na Sala de ciências antes...");
                } else if (ciencias > 2 || ciencias < 1) {
                    System.out.println("\nOPÇÃO INVÁLIDA!\n");
                }
            } while (ciencias != 1);
    
                return 0;
        }
        public static int porao (Scanner sc, String mob, String voceMorreu) throws InterruptedException{
            int porao;
            do {
                System.out.println("== Você sai do auditório e acaba escutando um barulho vindo de baixo ==");
                System.out.println("- Ele sabe que quero ir lá, eu não sei o que está acontecendo mas meu pai está envolvido nisso\n");
                System.out.println("[1] Descer no porão [2] Tentar montar o mapa");
                System.out.print("OPÇÃO: ");
                porao = sc.nextInt();
    
                if (porao == 1) {
                    System.out.println("== Mapa encontrado 6/7 ==");
                    Thread.sleep(5000);
                    clearConsole();
                    System.out.println("\nO que é isso?");
                    System.out.println("Isso...é...sangue? Mas de quem?");
                    Thread.sleep(4000);
                    System.out.println("Um...diário? Mas isso é impossivel já que a escola pegou fogo e eu nem sei se estou no mundo real ainda");
                    Thread.sleep(4000);
                    System.out.println("\n\n== Ao abrir o diário, não é possivel compreender muitas coisas, mas então você consegue ver a letra de seu pai: ==");
                    System.out.println("\n\nDiário: Eu fiz... a pior escolha da minha vida, eu confiei, eu precisava disso, tudo o que eu queria era ser um gênio, mas eu não queria que isso chegasse em minha família, não desse jeito.");
                    System.out.println("Não tem o que fazer, eu não posso contar pra eles, eu agora tenho que seguir e carregar isso comigo até o meu caixão...");
                    System.out.println("\n\n- Sobre o que é isso? Eu não consigo descobrir, eu não estou entendendo nada");
                } else if (porao == 2) {
                    System.out.println("- Estou com 6 pedaços de 7, o único que falta é o centro do mapa, preciso procurar esse último pedaço");
                } else if (porao > 2 || porao < 1) {
                    System.out.println("\nOPÇÃO INVÁLIDA!\n");
                }
            } while (porao != 1);
    
                return 0;
    }
    public static int floresta (Scanner sc, String ultimoPedaco, String capelaDeseho, String mob, String voceMorreu) throws InterruptedException{
        int floresta;
        do {
            Thread.sleep(5000);
            clearConsole();
            System.out.println("\n== Após uma longa procura do último pedaço... ==");
            Thread.sleep(3000);
            System.out.println("\n- Eu desisto, vou tentar seguir o mapa mesmo sem o último pedaço, eu não aguento mais estar aqui, eu apenas quero ir embora\n");
            System.out.println("[1] SEGUIR O MAPA [2] SEGUIR O MAPA [3] SEGUIR O MAPA");
            System.out.print("OPÇÃO: ");
            floresta = sc.nextInt();

            if (floresta == 1) {
                System.out.println("== Você finalmente se encontra fora daquela escola, quando derrepente, a escola começa a pegar fogo ==");
                System.out.println("- O que? Como é possivel? Pegar fogo de novo sem nem ter nada, não ter eletricidade, não ter ninguém...");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("\n- só me resta seguir o mapa");
                System.out.println("o mapa mostra um caminho, um caminho que parece que foi feito com sangue, da onde vem todo esse sangue?");
                Thread.sleep(4000);
                System.out.println(". . .");
                Thread.sleep(4000);
                System.out.println("== Seguindo o mapa...==");
                Thread.sleep(4000);
                System.out.println("== Após uma longa caminhada ==");
                System.out.println(capelaDeseho);
                System.out.println("- Eu finalmente cheguei, o que é isso? Uma capela abandonada?");
                Thread.sleep(7000);
                clearConsole();
                System.out.println(ultimoPedaco);
                Thread.sleep(8000);
                clearConsole();
                System.out.println(mob);
                Thread.sleep(5000);
                clearConsole();
                int questao7 = exercicioMultiplicacao02();
                if(questao7 == 10){
                    Thread.sleep(7000);
                    clearConsole();
                    System.out.println(voceMorreu);
                    Thread.sleep(10000);
                    System.exit(0);
                }else{
                    System.out.println("\n\n== Você conseguiu derrotar o monstro. ==\n\n");
                }
                Thread.sleep(7000);
                clearConsole();
                System.out.println("- Eu espero não ver essa coisa de novo nunca mais");
                Thread.sleep(7000);
                System.out.println("- Eu nunca soube que existia essa capela, por que esse mapa me trouxe até aqui? ");
            } else if (floresta == 2) {
                System.out.println("== Você finalmente se encontra fora daquela escola, quando derrepente, a escola começa a pegar fogo ==");
                System.out.println("- O que? Como é possivel? Pegar fogo de novo sem nem ter nada, não ter eletricidade, não ter ninguém...");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("\n- só me resta seguir o mapa");
                System.out.println("o mapa mostra um caminho, um caminho que parece que foi feito com sangue, da onde vem todo esse sangue?");
                Thread.sleep(4000);
                System.out.println(". . .");
                Thread.sleep(4000);
                System.out.println("== Seguindo o mapa...==");
                Thread.sleep(4000);
                System.out.println("== Após uma longa caminhada ==");
                System.out.println(capelaDeseho);
                System.out.println("- Eu finalmente cheguei, o que é isso? Uma capela abandonada?");
                Thread.sleep(7000);
                clearConsole();
                System.out.println(ultimoPedaco);
                Thread.sleep(8000);
                clearConsole();
                //BICHO AQUIII
                System.out.println("- Eu espero não ver essa coisa de novo nunca mais");
                Thread.sleep(7000);
                System.out.println("- Eu nunca soube que existia essa capela, por que esse mapa me trouxe até aqui? ");
            }else if (floresta == 3){
                System.out.println("== Você finalmente se encontra fora daquela escola, quando derrepente, a escola começa a pegar fogo ==");
                System.out.println("- O que? Como é possivel? Pegar fogo de novo sem nem ter nada, não ter eletricidade, não ter ninguém...");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("\n- só me resta seguir o mapa");
                System.out.println("o mapa mostra um caminho, um caminho que parece que foi feito com sangue, da onde vem todo esse sangue?");
                Thread.sleep(4000);
                System.out.println(". . .");
                Thread.sleep(4000);
                System.out.println("== Seguindo o mapa...==");
                Thread.sleep(4000);
                System.out.println("== Após uma longa caminhada ==");
                System.out.println(capelaDeseho);
                System.out.println("- Eu finalmente cheguei, o que é isso? Uma capela abandonada?");
                Thread.sleep(7000);
                clearConsole();
                System.out.println(ultimoPedaco);
                Thread.sleep(8000);
                clearConsole();
                //BICHO AQUIII
                System.out.println("- Eu espero não ver essa coisa de novo nunca mais");
                Thread.sleep(7000);
                System.out.println("- Eu nunca soube que existia essa capela, por que esse mapa me trouxe até aqui? ");
            } else if (floresta > 3 || floresta < 1) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (floresta < 1 || floresta > 3);

            return 0;
    }
    public static int capela (Scanner sc, String pentagrama, String primeiroMob, String voceMorreu, String fimDoJogo) throws InterruptedException{
        int capela;
        int entrada;
        do {
            System.out.println("- Eu não tenho escolha");
            System.out.println("[1] ENTRAR NA CAPELA [2] ENTRAR NA CAPELA [3] ENTRAR NA CAPELA\n");
            capela = sc.nextInt();

            if (capela == 1 || capela == 2 || capela == 3) {
                System.out.println("== Assim que você entra, você percebe que não tem nada de estranho ou diferente desse lugar, era o que você achava... ==");
                System.out.println("- Eu tenho que explorar, eu não iria vir aqui atoa");
                System.out.println("== Você então percebe que tem uma escada e você decide descer essa escada, até porque você não tem outra escolha ==");
                Thread.sleep(7000);
                clearConsole();
                System.out.println("\n- O que é isso?");
                System.out.println("Mais sangue? um...pentagrama?");
                System.out.println(pentagrama);
                Thread.sleep(7000);
                clearConsole();
                System.out.println("Por que?");
                Thread.sleep(7000);
                System.out.println("???: Eu te digo o porque...Você é igual seu pai sabia?");
                System.out.println("quem...é você?");
                System.out.println("???: Então ele realmente não te contou né?");
                System.out.println(primeiroMob);
                System.out.println("???: Eu sou o Mathmancer, isso não é obvio?");
                Thread.sleep(8000);
                clearConsole();
                System.out.println("Mathmancer: Bom, a muito tempo atrás, o seu pai...digamos que ele estava precisando de bastante dinheiro...");
                System.out.println("Mathmancer: E a única saida dele, era uma coisa que ele não tinha valor...A própria vida");
                System.out.println("Mathmancer: Então o seu pai sempre teve o grande desejo de se tornar um grande mestre da matemática, pois ele na verdade nunca foi");
                System.out.println("Mathmancer: Mas ao ler um simples livro antigo, ele decide que iria fazer um pacto pra ser O grande mestre da matemática");
                System.out.println("Mathmancer: Tudo isso em troca de que? De fama, dinheiro, reconhecimento, ganancia");
                Thread.sleep(20000);
                System.out.println("\n- Não, isso é mentira, meu pai jamais machucaria eu e minha mãe");
                System.out.println("Mathmancer: Mas ele não machucou, ele vendeu a própria alma, mas você acha mesmo que eu me contentaria com apenas uma?");
                System.out.println("Mathmancer: Esperei você fazer algo que eu pudesse te achar, e você fez...");
                System.out.println("Mathmancer: Vocês, humanos, tão tolos, vocês não se contentam com a realidade, e sempre tentam achar algo pra fugir dela");
                Thread.sleep(20000);
                clearConsole();
                System.out.println("Você nunca me venceria");
                Thread.sleep(7000);
                //Contas do boss (DUAS de multiplicção e 1 de divisão)
                int questao8 = exercicioBoss01();
                if(questao8 == 10){
                    Thread.sleep(7000);
                    clearConsole();
                    System.out.println(voceMorreu);
                    Thread.sleep(10000);
                    System.exit(0);
                }else{
                    System.out.println("\n\n== Você acertou a primeira questão. ==\n\n");
                }
                Thread.sleep(5000);
                clearConsole();
                int questao9 = exercicioBoss02();
                if(questao9 == 10){
                    Thread.sleep(7000);
                    clearConsole();
                    System.out.println(voceMorreu);
                    Thread.sleep(10000);
                    System.exit(0);
                }else{
                    System.out.println("\n\n== Você acertou a segunda questão. ==\n\n");
                }
                Thread.sleep(5000);
                clearConsole();
                int questao10 = exercicioBoss03();
                if(questao10 == 10){
                    Thread.sleep(7000);
                    clearConsole();
                    System.out.println(voceMorreu);
                    Thread.sleep(10000);
                    System.exit(0);
                }else{
                    System.out.println("\n\n== Você acertou a última questão... ==\n\n");
                }
                Thread.sleep(5000);
                clearConsole();
                System.out.print(".");
                Thread.sleep(1500);
                System.out.print(".");
                Thread.sleep(1500);
                System.out.print(".\n\n");
                Thread.sleep(3500);
                System.out.println(voceMorreu);
                Thread.sleep(2500);
                System.out.println("\n\n\n O sangue no porão, era seu, mas você nem sequer percebeu...");
                Thread.sleep(2000);
                System.out.println("Aquela escola, ela existe, mas ela nunca pegou fogo, mas você nunca perceberia, já que quem morreu no fogo em sua própria casa, foi você");
                Thread.sleep(4500);
                System.out.println("Tudo o que se passou até agora, não foi nada real, foi apenas sua passagem do mundo real, para o inferno...");
                Thread.sleep(4500);
                System.out.println("E tudo isso? Tudo isso é culpa da ganancia de seu pai, o que ele fez, foi real também, vender a alma dele e de sua mãe para ser um grande mestre na matemática.");
                Thread.sleep(5500);
                System.out.println("O que realmente é mais importante? A família? O dinheiro? O poder e a fama?");
                Thread.sleep(1500);
                System.out.println("Você sabe o que escolher, você sabe o que seu pai escolheu...");
                int escolhaFinal;
                do { 
                    System.out.println("\n[1] Família | [2] Dinheiro | [3] Poder e Fama\n");
                    System.out.print("Opção: ");
                    escolhaFinal = sc.nextInt();

                    switch(escolhaFinal){
                        case 1:
                            System.out.println("Você sabe o que escolher...");
                            Thread.sleep(1500);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                    }

                } while (escolhaFinal != 2 || escolhaFinal != 3);


                Thread.sleep(4500);
                clearConsole();
                System.out.println("Vocês humanos são todos iguais...");
                Thread.sleep(6000);
                System.out.println(fimDoJogo);
                Thread.sleep(15000);
                System.exit(0);
                
                
                // System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (capela < 1 || capela > 3);
            return 0;

    }
}