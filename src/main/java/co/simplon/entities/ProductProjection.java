/* Ici se trouve le package*/
package co.simplon.entities;

/* Ici se trouve les imports */
import org.springframework.data.rest.core.config.Projection;

/* Ici se trouve notre Class */
@Projection(name = "P1", types = Product.class)
public interface ProductProjection {
    public double getPrice();
    public String getDesignation();
}

/* Fin */