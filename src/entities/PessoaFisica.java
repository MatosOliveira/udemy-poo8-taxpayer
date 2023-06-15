/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes da Pessoa Fisica
 * 
 * @author Matos - 15.06.2023
 *
 */
public class PessoaFisica extends PessoaContribuinte {

	private Double gastosSaude;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}
	
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calculoImposto() {
		double imposto;
		
		if(getRendaAnual() < 20000.00) {
			imposto = (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
		} else {
			imposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
		}
		
		return imposto;
	}

	
}
