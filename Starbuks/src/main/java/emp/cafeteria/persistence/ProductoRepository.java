package emp.cafeteria.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import emp.cafeteria.entity.bean.Producto;

import emp.cafeteria.entity.bean.Categoria;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	long countByCategoriaId(Categoria categoriaId);
}
