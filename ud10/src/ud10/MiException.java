package ud10;

public class MiException extends Exception {

	private int codigoException;

	public MiException(int codigoException) {
		super();
		this.codigoException = codigoException;
	}

	@Override
	public String getMessage() {

		String mensaje = "";

		switch (codigoException) {
		case 111:
			mensaje = "Exception 111, El numero indicado esta por debajo ";

			break;
		case 222:
			mensaje = "Exception 111, El numero indicado esta por encima ";

			break;
		case 333:
			mensaje = "Exception 111, Has adivinado el numero ";

			break;

		default:
			break;
		}
		return mensaje;

	}

}
