package emp.cafeteria.model;

import org.springframework.stereotype.Service;

import emp.cafeteria.entity.bean.Categoria;
import emp.cafeteria.entity.bean.Producto;
import emp.cafeteria.persistence.ProductoRepository;
import emp.cafeteria.usecase.ProductoUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoModel {

	private final ProductoRepository _productoRepository;
}
