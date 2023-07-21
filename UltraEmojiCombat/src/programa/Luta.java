package programa;

import java.util.Random;

public class Luta {

	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada = false;

	// Metodos de classe
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);

			System.out.println("Luta aprovada pela Comissão Técnica");
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);

			System.out.println("Luta negada pela Comissão Técnica");
		}
	}

	public void lutar() {
		if (this.getAprovado()) {

			System.out.println("CHEGOU A HORA!!!");
			System.out.println("VAMOS APRESENTAR O LUTADOR");

			desafiado.cartel();
			desafiante.cartel();

			Random aleatorio = new Random();
			int sorteio = aleatorio.nextInt(3);

			switch (sorteio) {

			case 0:
				System.out.println("Luta terminou!!\nResultado: Empate técnico");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println("Atualização do cartel:");
				this.desafiado.cartel();
				System.out.println("Atualização do cartel:");
				this.desafiante.cartel();

				break;

			case 1:
				System.out.println("Luta Terminou!!\nResultado: Vitória do " + desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("Atualização do cartel: ");
				this.desafiado.cartel();
				System.out.println("Atualização do cartel: ");
				this.desafiante.cartel();

				break;

			case 2:
				System.out.println("Luta terminou!!\nResultado: Lutador " + desafiante.getNome() + " Venceu a Luta");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				System.out.println("Atualização de cartel: ");
				this.desafiado.cartel();
				this.desafiante.cartel();

				break;

			default:
				System.out.println("Luta não autorizada");
				break;
			}
		}

	}

	// Getters & Setters
	public void setAprovada(boolean aprovado) {
		this.aprovada = aprovado;
	}

	public boolean getAprovado() {
		return aprovada;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setRound(int rounds) {
		this.rounds = rounds;
	}

	public int getRound() {
		return rounds;
	}

}
