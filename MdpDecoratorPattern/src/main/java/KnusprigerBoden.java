/**
 * 
 * @author Daniel Mounir
 */
public class KnusprigerBoden implements IPizza {

    private String beschreibung = "Pizza mit knusprigem Boden, Mozzarella, Tomatensauce";
    private double preis = 14.00;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPreis() {
        return preis;
    }

}
