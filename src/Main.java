import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] numeros; // Declaração de uma array de inteiros
    	double[] precos; // Declaração de uma array de valores reais (ponto flutuante)
    	String[] nomes; // Declaração de uma array de strings
    	boolean[] valores; // Declaração de uma array de valores booleanos

    	// Exemplo de declaração e inicialização de uma array
    	int[] idades = new int[5]; // Declaração de uma array de inteiros com tamanho 5
    	
        System.out.println("Digite um Valor de comprimento:");

        int i = sc.nextInt();
        System.out.println("Digite um Valor de Largura: " );
        int j = sc.nextInt();
    	
   	ExemploVoid exempl = new ExemploVoid();    	
   	exempl.saudacao();
//    	
    	
        // Criando uma instância da classe
       Retangulo retangulo = new Retangulo(i, j);       

        
        // Acessando métodos
       double area = retangulo.calcularArea();
       double perimetro = retangulo.calcularPerimetro();

        System.out.println("Área: " + area);
       System.out.println("Perímetro: " + perimetro);

        // Alterando valores usando setters
//        retangulo.setComprimento(7.0);
//        retangulo.setLargura(4.0);

        // Recalculando área e perímetro
//        area = retangulo.calcularArea();
//        perimetro = retangulo.calcularPerimetro();
//
//        System.out.println("Nova área: " + area);
//        System.out.println("Novo perímetro: " + perimetro);
    }
}
