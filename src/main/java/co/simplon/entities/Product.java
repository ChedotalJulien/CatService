/* Ici se trouve le package*/
package co.simplon.entities;

/* Ici se trouve les imports */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/* Ici se trouve notre Class */
@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String designation;
    private double price;
    private int quantity;
}
/* Fin */