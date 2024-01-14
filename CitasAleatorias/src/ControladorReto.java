import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ControladorReto {
    private CitasAleatorias selectorCitas;
    private String citaActual;
    private int posicionActual;
    private Map<Character, Integer> erroresPorCaracter;
    private int totalPulsaciones;

    public ControladorReto() {
        selectorCitas = new CitasAleatorias();
        erroresPorCaracter = new HashMap<>();
        totalPulsaciones = 0;
    }

    public String iniciarNuevoReto() {
        citaActual = selectorCitas.obtenerCitaAleatoria();
        posicionActual = 0;
        erroresPorCaracter.clear();
        totalPulsaciones = 0;
        return citaActual;
    }

    public boolean verificarCaracter(char caracter) {
        totalPulsaciones++;
        if (posicionActual < citaActual.length() && caracter == citaActual.charAt(posicionActual)) {
            posicionActual++;
            return true;
        } else {
            erroresPorCaracter.put(caracter, erroresPorCaracter.getOrDefault(caracter, 0) + 1);
            return false;
        }
    }

    public void retrocederPosicion() {
        if (posicionActual > 0) {
            posicionActual--;
        }
    }

	public void mostrarInformeFinal() {
		// TODO Auto-generated method stub
		
	}

	public String getCitaActual() {
		// TODO Auto-generated method stub
		return null;
	}
}