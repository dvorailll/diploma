package com.diploma.RestServer.Order;

import com.diploma.RestServer.Order.MenuOrderDao;
import com.diploma.RestServer.Order.MenuOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuOrderController {

    @Autowired
    private MenuOrderDao menuOrderDao;

    @GetMapping("/menu_order/get-all")
    public List<MenuOrder> getAllOrders() {
        return menuOrderDao.getAllOrders();
    }

    @PostMapping("/menu_order/save")
    public MenuOrder save(@RequestBody MenuOrder menuOrder) {
        return menuOrderDao.save(menuOrder);
    }
}
