package com.service;

import com.entity.Buy;

public interface BuyService {
	Buy addBuy(String name);
    void delete(int id);
    Buy getByCustomerMailName(String mailname);
    Buy editBuy(String name);
    Iterable<Buy> getAll();
}
