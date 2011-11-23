/**
 * @author Daniel Mounir
 */
public abstract class PizzaDekorierer implements IPizza {

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract String getBeschreibung();

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract double getPreis();
}
