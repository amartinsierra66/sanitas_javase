
package principal;
import service.PaisesService;
public class TestPaisesService {
    public static void main(String[] args) {
        PaisesService service = new PaisesService();
        //Continentes
        System.out.println ("Lista de continentes: " + service.continentes().toString());
        //Países de un continente
        System.out.println ("Países de Europa:");
        service.paisesPorContinente ("Europe")
            .stream()
            .map(p -> p.getNombre())
            .forEach(System.out::println);
        //País más poblado
        System.out.println ("País más poblado: " + service.paisMasPoblado().getNombre());
        //Población total de un continente
        System.out.println ("Población total de Europa: " + service.poblacionContinente("Europe"));
    }
}
