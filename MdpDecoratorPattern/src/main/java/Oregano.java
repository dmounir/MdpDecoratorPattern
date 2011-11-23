/**
 * @author Daniel Mounir
 */
public class Oregano extends PizzaDekorierer {
    /**
     * Name der Zutat
     * Preis der Zutat 
     */
    private static final String ZUTAT = "Oregano";
    private static final int PREIS = 1;

    private IPizza pizza;

    public Oregano(IPizza aPizza) {
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
