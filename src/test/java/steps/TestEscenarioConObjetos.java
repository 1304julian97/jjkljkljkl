package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import entidades.Persona;


import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CucumberOptions(tags = {"@ejemploObjetos"})
public class TestEscenarioConObjetos {

    List<Persona> personas;

    private List<Persona> convertirListaDeAtributosEnObjetos(List<List<String>> listaDeAtributos)
    {
        List<Persona> personaList = listaDeAtributos.stream().map(atributos -> new Persona(atributos.get(0),
                atributos.get(1), Integer.parseInt(atributos.get(2)))).collect(Collectors.toList());
        personas = personaList;
        return personaList;
    }
    @Dado("^las siguientes personas:$")
    public void las_siguientes_personas(DataTable tabla) throws Exception {
        List<Persona> lista = convertirListaDeAtributosEnObjetos(tabla.asLists(String.class));
        System.out.println(lista);
    }

    @Cuando("^Su anio de nacimiento sea mayor a (\\d+)$")
    public void su_anio_de_nacimiento_sea_mayor_a(int edadLimite) throws Exception {
        List<Persona> listas = personas.stream().filter(x -> x.anioNacimiento() >= edadLimite).collect(Collectors.toList());
        if (listas.size()<2) throw new Exception("Años no válidos");
    }

    @Entonces("^imprima el nombre de la persona con mas edad$")
    public void imprima_el_nombre_de_la_persona_con_mas_edad() throws Exception {
        Optional<Persona> reduce = personas.stream().reduce((p1, p2) -> p1.anioNacimiento() < p2.anioNacimiento() ? p1 :p2);
        System.out.println("la persona con mas edad es: "+reduce.get().nombre()+" "+reduce.get().apellido());
    }

    @Entonces("^también imprima su edad$")
    public void también_imprima_su_edad() {
        Optional<Persona> reduce = personas.stream().reduce((p1, p2) -> p1.anioNacimiento() < p2.anioNacimiento() ? p1 :p2);
        int edad = Calendar.getInstance().get(Calendar.YEAR)- reduce.get().anioNacimiento();
        System.out.println("La edad es: "+edad);
    }


}
