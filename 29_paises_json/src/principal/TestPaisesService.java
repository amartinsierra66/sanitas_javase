
package principal;
import service.PaisesService;
public class TestPaisesService {
    public static void main(String[] args) {
        PaisesService service = new PaisesService();
        //Continentes
        System.out.println ("Lista de continentes: " + service.continentes().toString());
        //Pa�ses de un continente
        System.out.println ("Pa�ses de Europa:");
        service.paisesPorContinente ("Europe")
            .stream()
            .map(p -> p.getNombre())
            .forEach(System.out::println);
        //Pa�s m�s poblado
        System.out.println ("Pa�s m�s poblado: " + service.paisMasPoblado().getNombre());
        //Poblaci�n total de un continente
        System.out.println ("Poblaci�n total de Europa: " + service.poblacionContinente("Europe"));
    }
}
