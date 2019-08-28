/* Ici se trouve le package*/
package co.simplon;

/* Ici se trouve les imports */
import co.simplon.dao.ProductRepository;
import co.simplon.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/* Ici se trouve notre Class */
@RestController
public class ProductRestServices {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping(value = "/ListProduct")
    public List <Product> listproduct(){
        return productRepository.findAll();
    }

    /* Ici se trouve la methode Get*/
    @GetMapping(value = "/ListProduct/{id}")
    public Product listproduct(@PathVariable(name="id") Long id){
        return productRepository.findById(id).get();
    }

    /* Ici se trouve la methode Put */
    @PutMapping(value = "/ListProduct/{id}")
    public Product update (@PathVariable(name="id") Long id,@RequestBody Product p){
        p.setId(id);
        return productRepository.save(p);
    }

    /* Ici se trouve la methode Post */
    @PostMapping (value = "/ListProduct")
    public Product save (@RequestBody Product p){
        return productRepository.save(p);
    }

    /* Ici se trouve la methode Delete */
    @DeleteMapping(value = "/ListProduct/{id}")
    public void delete (@PathVariable(name="id") Long id){
        productRepository.deleteById(id);
    }
}

/* Fin */