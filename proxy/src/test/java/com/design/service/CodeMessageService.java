package com.design.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 验证码实现
 * @author lvz
 * @date 2021/7/7
 */
@Slf4j
@Service
public class CodeMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        log.info("验证码短信已发送");
        return "125602";
    }
}
