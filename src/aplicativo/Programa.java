package aplicativo;

import java.util.Scanner;

import calculos.CalculadoraImc;

public class Programa {

	public static void main(String[] args) {
		
		CalculadoraImc calculo = new CalculadoraImc();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("  C A L C U L A D O R A    I M C  ");
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.print("Digite seu peso: ");
		calculo.peso = ler.nextDouble();
		System.out.println();
		
		System.out.print("Digite sua altura: ");
		calculo.altura = ler.nextDouble();
		System.out.println();
		
		ler.close();
		
		calculo.calcular();
		
		System.out.println("Seu IMC é: " + calculo.imc);
		System.out.println();
		
		calculo.classificar();
	}

}