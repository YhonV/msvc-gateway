package com.ms.springboot.app.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.ms.springboot.app.producto.models.Producto;

public interface ProductoRepository extends CrudRepository<Producto,Long>{
	
}
