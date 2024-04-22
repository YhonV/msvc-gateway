package com.ms.springboot.app.producto.service;

import java.util.List;

import com.ms.springboot.app.producto.models.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}
