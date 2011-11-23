/**
 * @author Daniel Mounir
 */
public class Schinken extends PizzaDekorierer {
    /**
     * Name der Zutat
     * Preis der Zutat 
     */
    private static final String ZUTAT = "Schinken";
    private static final int PREIS = 2;

    private IPizza pizza;

    public Schinken(IPizza aPizza) {
        pizza = aPizza;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung() + ", " + ZUTAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPreis() {
        return pizza.getPreis() + PREIS;
    }

}
