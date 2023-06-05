package com.diploma.RestServer.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuOrderDao {
    @Autowired
    private MenuOrderRepository repository;

    public MenuOrder save(MenuOrder menuOrder) {
        return repository.save(menuOrder);
    }

    public List<MenuOrder> getAllOrders() {
        List<MenuOrder> menuOrders = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(menuOrder -> {
                    menuOrders.add(menuOrder);
                });
        return menuOrders;
    }

    public void delete(long menuOrderId) {
        repository.deleteById(menuOrderId);
    }


}
