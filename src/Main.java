public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo ("Argentina","equipo con huevos");
        Equipo equipo2 = new Equipo ("Francia", "segundo");
      //  System.out.println(equipo1.nombre +" "+ equipo1.descripcion);
        Partido partido = new Partido();
        partido.equipo1 = equipo1;
        partido.equipo2 = equipo2;
        partido.golesEquipo1 = 4;
        partido.golesEquipo2 = 5;
       ResEnum resultado = partido.resultado(equipo2);
        System.out.println(resultado);
    }
}