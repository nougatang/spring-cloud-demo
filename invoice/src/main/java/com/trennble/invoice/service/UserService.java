package com.trennble.invoice.service;

import com.trennble.auth.entity.User;
import com.trennble.invoice.util.PageData;

public interface UserService {

    User save(User user);

    void delete(Integer id);

    User update(User user);

    User fetch(Integer id);

    PageData list(int page, int limit);

}