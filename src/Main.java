import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        System.out.println(args[1]);
        // Abrir archivo para la lectura
        File archivoResultados = new File(args[0]);
        File archivoPronostico = new File(args[1]);
        FileReader frResultados = new FileReader(archivoResultados);
        BufferedReader brResultados = new BufferedReader(frResultados);
        FileReader frPronostico = new FileReader(archivoPronostico);
        BufferedReader brPronostico = new BufferedReader(frPronostico);
        String lineaPartido = brResultados.readLine();
        List<Partido> partidos = new ArrayList<>();
        while (lineaPartido != null) {
            String[] campos = lineaPartido.split(",");

            // Crea objetos equipo y partido
            Equipo equipo1 = new Equipo(campos[0]);
            Equipo equipo2 = new Equipo(campos[3]);
            Partido partido = new Partido();
            partido.equipo1 = equipo1;
            partido.equipo2 = equipo2;
            partido.golesEquipo1 = Integer.parseInt(campos[1]);
            partido.golesEquipo2 = Integer.parseInt(campos[2]);
            partidos.add(partido);

            lineaPartido = brResultados.readLine();
        }
        brResultados.close();

        String lineaPronostico = brPronostico.readLine();
        int puntajeTotal = 0;
        int index = 0;
        while (lineaPronostico != null) {
            String[] campos = lineaPronostico.split(",");
            Partido partido = partidos.get(index);

            // Crea objetos equipo
            Equipo equipo1 = new Equipo(campos[0]);
            String jugador = campos[5];
            Equipo equipo2 = new Equipo(campos[4]);
            
            // Crear objeto Pronostico
            Pronostico pronostico = new Pronostico();
            ResEnum resultado = null;
            if(partido.equipo1.nombre.equalsIgnoreCase(equipo1.nombre)){
                if (campos[1].equalsIgnoreCase("x")){
                    resultado= ResEnum.GANADO;
                }
                if (campos[2].equalsIgnoreCase("x")){
                    resultado= ResEnum.PERDIDO;
                }
                if (campos[3].equalsIgnoreCase("x")){
                    resultado= ResEnum.EMPATADO;
                }
                if(partido.resultado(equipo1)== resultado){
                    System.out.println(jugador +" "+ 1);
                }
            }

        }
        brPronostico.close();

    }
}