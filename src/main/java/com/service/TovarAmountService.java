package com.service;

import com.entity.TovarAmount;

public interface TovarAmountService {

	TovarAmount addTovarAmount(String name);
    void delete(int id);
    TovarAmount getByNameTovarAmount(String name);
    TovarAmount editTovarAmount(String name);
    Iterable<TovarAmount> getAll();
}
