public class Partido {
 Equipo equipo1;
 Equipo equipo2;
 int golesEquipo1;
 int golesEquipo2;
    public ResEnum resultado(Equipo equipo){

        int resultadoComparacion = Integer.compare(golesEquipo1, golesEquipo2);

        if(resultadoComparacion == 0 )
            return ResEnum.EMPATADO;

        if ( equipo.equals(equipo1) )
            return resultadoComparacion > 0 ? ResEnum.GANADO : ResEnum.PERDIDO;
        else
            return resultadoComparacion < 0 ? ResEnum.GANADO : ResEnum.PERDIDO;
    }

    public Object getEquipo1() {
        return null;
    }

    public Object getEquipo2() {
        return null;
    }

    public ResEnum getResultado() {
        return null;
    }
}
