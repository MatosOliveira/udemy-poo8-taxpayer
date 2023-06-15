/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes da Pessoa Juridica
 * 
 * @author Matos - 15.06.2023
 *
 */
public class PessoaJuridica extends PessoaContribuinte {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double calculoImposto() {
		double imposto;
		
		if(numeroFuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		} else {
			imposto = getRendaAnual() * 0.16;
		}
		return imposto;
	}

	
}
