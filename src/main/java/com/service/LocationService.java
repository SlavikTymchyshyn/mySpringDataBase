package com.service;

import com.entity.Location;

public interface LocationService {

	Location addLocation(String name);
    void delete(int id);
    Location getByIdLocation(int id);			//ask about ID
    Location editLocation(String name);
    Iterable<Location> getAll();
}
