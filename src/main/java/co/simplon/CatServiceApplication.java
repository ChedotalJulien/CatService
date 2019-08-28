/* Ici se trouve le package*/
package co.simplon;

/* Ici se trouve les imports */
import co.simplon.entities.Product;
import co.simplon.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/* Ici se trouve notre Class */
@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

/* Ici on incremente nos objets */
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Product.class);
		productRepository.save(new Product(null,"Samsung A10", 1800, 50));
		productRepository.save(new Product(null,"Sony Xperia Z8", 1900, 34));
		productRepository.save(new Product(null,"Apple Iphone 10", 7000, 28));
		productRepository.save(new Product(null,"Samsung S10", 3000, 56));
		productRepository.save(new Product(null,"Sony Xperia Z10", 1900, 44));
		productRepository.save(new Product(null,"Apple Iphone 6", 850, 80));
		productRepository.save(new Product(null,"Samsung S8", 900, 57));
		productRepository.save(new Product(null,"Sony Xperia Z9", 1100, 74));
		productRepository.save(new Product(null,"Apple Iphone 8s", 1200, 18));
		productRepository.findAll().forEach(p-> {
			System.out.println(p.toString());
		});
	}
}
/* Fin */