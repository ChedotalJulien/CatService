/* Ici se trouve le package*/
package co.simplon.dao;

/* Ici se trouve les imports */
import co.simplon.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.awt.print.Pageable;
import java.util.List;

/* Ici se trouve notre Class */
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

    @RestResource (path = "/byDesignation")
    public List<Product> findByDesignationContent(@Param("mc") String des);

    @RestResource (path = "/byDesignationPage")
    public Page<Product> findByDesignationContent(@Param("mc") String des, Pageable pageable);

}
/* Fin */