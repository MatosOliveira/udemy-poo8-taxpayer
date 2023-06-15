/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes de um contribuinte
 * 
 * @author Matos - 15.06.2023
 *
 */
public abstract class PessoaContribuinte {

	private String nome;
	private Double rendaAnual;
	
	public PessoaContribuinte() {
	}
	
	public PessoaContribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double calculoImposto();
	
}
