/**
 * @author Daniel Mounir
 */
public class Funghi extends PizzaDekorierer {
    /**
     * Name der Zutat
     * Preis der Zutat 
     */
    private static final String ZUTAT = "Funghi";
    private static final int PREIS = 2;

    private IPizza pizza;

    public Funghi(IPizza aPizza) {
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
