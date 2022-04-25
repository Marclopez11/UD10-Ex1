package ud10;

public class GenerarNumero {

	private int min;
	private int max;
	private int numeroAleatorio;
	private int intentos = 0;

	public GenerarNumero() {
		super();
		this.min = 11;
		this.max = 500;
	}

	public int generarNumero() {

		numeroAleatorio = (int) Math.floor(Math.random() * (0 - 500 + 1) + 500);
		return numeroAleatorio;

	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos += intentos;
	}

	public int comprobarNumero(int numero) throws MiException {

		if (numeroAleatorio > numero) {
			intentos++;
			throw new MiException(111);
		} else if (numeroAleatorio < numero) {
			intentos++;

			throw new MiException(222);
		}
		return numero;

	}

}
