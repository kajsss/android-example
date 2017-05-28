package com.miloapp.repository;


import com.miloapp.domain.Item;

import java.util.List;

public class ItemRepository {

    public List<Item> getAllItems(){
        return dummyData();
    }

    private List<Item> dummyData(){

        return null;
    }
}
