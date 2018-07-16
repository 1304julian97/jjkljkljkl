package steps;

import com.google.gson.Gson;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java8.Es;
import entidades.Persona;
import io.vavr.control.Try;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEscenarioJson implements Es {

    List<Persona> personas;
    String json;

    public TestEscenarioJson()
    {
        Dado("^un archivo json recuperado de la siguiente ruta \"([^\"]*)\"$", (String ruta) -> {
            json = obtenerJsonDeArchivo(ruta);

        });

        Cuando("^cuando se convierta en un objeto Java$", () -> {
            Gson gson = new Gson();
            Persona[] personaV = gson.fromJson(json, Persona[].class);
            personas = Arrays.asList(personaV);
        });

        Entonces("^imprimir las caracterisiticas$", () -> {
            personas.stream().map(x -> {
                System.out.println(x.nombre());
                System.out.println(x.genero());
                System.out.println(x.edad());
                return x;
            }).collect(Collectors.toList());
            Stream<Persona> streamm = personas.stream().filter(x->{
                System.out.println("1");
                return x.edad() > 22;});
            System.out.println("2");
            List<Persona> persona = streamm.collect(Collectors.toList());
            System.out.println("3");
            String hola = "";
        });
    }


    public String obtenerJsonDeArchivo(String ruta) throws IOException {
        String cadena= "";
        String parcial = "";
        FileReader f = new FileReader(ruta);
        BufferedReader b = new BufferedReader(f);
        while(parcial !=null) {
            cadena += parcial;
            parcial = b.readLine();
        }
        b.close();
        return cadena;
    }
}
