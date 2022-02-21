package br.com.heranca;

public class Preguica extends Animal {

	private String Come;
	private String Som;
	private String SobeEmArvore;
	private String Nome;
	@Override
	public String getCome() {
		return Come;
	}
	@Override
	public void setCome(String come) {
		Come = come;
	}
	@Override
	public String getSom() {
		return Som;
	}
	@Override
	public void setSom(String som) {
		Som = som;
	}
	@Override
	public String getSobeEmArvore() {
		return SobeEmArvore;
	}
	@Override
	public void setSobeEmArvore(String sobeEmArvore) {
		SobeEmArvore = sobeEmArvore;
	}
	@Override
	public String getNome() {
		return Nome;
	}
	@Override
	public void setNome(String nome) {
		Nome = nome;
	}




}
