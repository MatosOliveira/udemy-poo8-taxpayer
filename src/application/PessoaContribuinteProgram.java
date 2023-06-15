/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaContribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

/**
 * @author Matos
 *
 */
public class PessoaContribuinteProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PessoaContribuinte> contribuintes = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			
			System.out.print("Individual or company (i/c)? ");
			char opcao = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(opcao == 'i') {
				System.out.print("Gastos com saude: ");
				double gastosSaude = sc.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			} else if (opcao == 'c') {
				System.out.print("Numero de Funcionarios: ");
				int numFuncionarios = sc.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
				
			}
		}
		
		double sum = 0.0;
		
		System.out.println("\nTAXAS DE IMPOSTO PAGAS: ");
		for(PessoaContribuinte p: contribuintes) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.calculoImposto()));
			sum += p.calculoImposto();
		}
		
		System.out.print("TOTAL DE IMPOSTOS: " + sum);
		
		sc.close();

	}

}
