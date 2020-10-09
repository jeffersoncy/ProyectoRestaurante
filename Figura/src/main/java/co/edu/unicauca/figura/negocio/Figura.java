package co.edu.unicauca.figura.negocio;

/**
 *
 * @author Jefferson Campo
 */
public abstract class Figura {
    
    protected float x;
    
    public Figura(float parX)
    {
        super();
        this.x = parX;
    }
    
    public abstract float CalcularArea();
}
