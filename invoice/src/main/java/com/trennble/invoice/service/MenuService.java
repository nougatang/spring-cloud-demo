package com.trennble.invoice.service;

import com.trennble.invoice.entity.Menu;
import com.trennble.invoice.util.PageData;

public interface MenuService {

    Menu save(Menu menu);

    void delete(Integer id);

    Menu update(Menu menu);

    Menu fetch(Integer id);

    PageData list(int page, int limit);
}
