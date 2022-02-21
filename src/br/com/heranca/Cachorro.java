package br.com.heranca;


public class Cachorro extends Animal {

	private String Som;
	private String Corre;
	private String Come;
	private String Nome;


	@Override
	public String getNome() {
		return Nome;
	}
	@Override
	public void setNome(String nome) {
		Nome = nome;
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
	public String getCorre() {
		return Corre;
	}
	@Override
	public void setCorre(String corre) {
		Corre = corre;
	}
	@Override
	public String getCome() {
		return Come;
	}
	@Override
	public void setCome(String come) {
		Come = come;
	}




}