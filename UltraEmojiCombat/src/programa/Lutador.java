package programa;

public class Lutador {

	// Atributos
	private String nome, categoria, nacionalidade;
	private int idade, vitoria, derrota, empate;
	private float peso, altura;

	// Construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota,
			int empate) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitoria(vitoria);
		this.setDerrota(derrota);
		this.setEmpate(empate);
	}

	// Metodos de classe

	public void cartel() {
		System.out.println("\n---------------------------------\n");
		System.out.println("Nome:" + "" + this.getNome() + "\nPaís: " + this.getNacionalidade() + " com o peso de "
				+ this.getPeso() + "Kg");
		System.out.println("Lutando pela categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitoria());
		System.out.println("Derrotas: " + this.getDerrota());
		System.out.println("Empates: " + this.getEmpate() + "\n");
		System.out.println("---------------------------------\n");
	}

	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);

	}

	public void perderLuta() {
		this.setDerrota(this.getDerrota() + 1);

	}

	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
	}

	// Getters & Setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Categoria Inválida";
		} else if (this.peso <= 70.3) {
			this.categoria = "Peso Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Categoria inválida";
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getEmpate() {
		return empate;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public float getPeso() {
		return peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}
}
