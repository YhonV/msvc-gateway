package com.ms.springboot.app.item.service;

import java.util.List;

import com.ms.springboot.app.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
