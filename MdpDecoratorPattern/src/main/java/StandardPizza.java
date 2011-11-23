/**
 * Klasse mit ein paar definierten Standardpizzas. Wuerde man natuerlich irgendwie zur Laufzeit
 * aus einer Konfig-Datei oder Konfig-DB rauslesen, koennten auch separate Klassen sein
 *
 * @author Daniel Mounir
 */
public class StandardPizza {

    public static IPizza Margherita() {

        return new Oregano(new KnusprigerBoden());

    }

    public static IPizza Prosciutto() {

        return new Schinken(new Oregano(new KnusprigerBoden()));

    }

}
