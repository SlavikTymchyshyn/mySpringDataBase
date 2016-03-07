package com.service;

import com.entity.Site;

public interface SiteService {

	Site addSite(String name);
    void delete(int id);
    Site getByName(String name);
    Site editSite(String name);
    Iterable<Site> getAll();
}
