package com.nowcoder.service;

import org.springframework.stereotype.Service;

/**
 * Created by guan on 2021/1/15.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
