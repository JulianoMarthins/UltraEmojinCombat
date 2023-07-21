package programa;

// Programado por JulianoMarthins

public class Main {

	public static void main(String[] args) {

		Lutador lutador[] = new Lutador[6];

		lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.90f, 11, 2, 1);
		lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.80f, 14, 2, 3);
		lutador[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 1.65f, 80.90f, 12, 2, 1);
		lutador[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.60f, 13, 0, 2);
		lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		lutador[5] = new Lutador("Nerdaart", "Estados Unidos", 30, 1.81f, 105.70f, 12, 2, 4);

		Luta luta = new Luta();

		luta.marcarLuta(lutador[0], lutador[1]);
		luta.lutar();

	}

}
