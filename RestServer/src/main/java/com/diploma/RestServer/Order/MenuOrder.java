package com.diploma.RestServer.Order;

import jakarta.persistence.*;

@Entity
public class MenuOrder {

    @Id
    @SequenceGenerator(
            name = "table_sequence",
            sequenceName = "table_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int table_num;
    private int table_cost;
    private int table_items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTable_num() {
        return table_num;
    }

    public void setTable_num(int table_num) {
        this.table_num = table_num;
    }

    public int getTable_cost() {
        return table_cost;
    }

    public void setTable_cost(int table_cost) {
        this.table_cost = table_cost;
    }

    public int getTable_items() {
        return table_items;
    }

    public void setTable_items(int table_items) {
        this.table_items = table_items;
    }

    @Override
    public String toString() {
        return "MenuOrder{" +
                "id=" + id +
                ", table_num=" + table_num +
                ", table_cost=" + table_cost +
                ", table_items=" + table_items +
                '}';
    }
}
