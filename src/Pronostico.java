import java.util.Objects;

public class Pronostico{
    private String nombre;
    private Equipo equipo1;
    private Equipo equipo2;
    private ResEnum resultado;

    public int calcularPuntos(Partido partido) {
        int puntos = 0;

        if (Objects.equals(partido.getEquipo1(), equipo1) && partido.getEquipo2().equals(equipo2) && partido.getResultado().equals(resultado)) {
            // El usuario acertó el resultado exacto
            puntos = 1;
        } else {
            // Verificar si el usuario acertó el ganador o si hubo empate
            if (resultado == ResEnum.GANADO && partido.getResultado() == ResEnum.GANADO) {
                puntos = 1;
            } else if (resultado == ResEnum.PERDIDO && partido.getResultado() == ResEnum.PERDIDO) {
                puntos = 1;
            } else if (resultado == ResEnum.EMPATADO && partido.getResultado() == ResEnum.EMPATADO) {
                puntos = 1;
            }
        }

        return puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }



    public ResEnum getResultado() {
        return resultado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setResultado(ResEnum resultado) {
        this.resultado = resultado;
    }

    public void setPuntos(int puntos) {

    }
}