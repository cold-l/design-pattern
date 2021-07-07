package com.design.proxy;

import com.design.proxy.invoke.DynamicProxyHandler;
import com.design.service.CodeMessageService;
import com.design.service.MessageService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * @author lvz
 * @date 2021/7/7
 */
public class ProxyTest {


    @Test
    public void proxyTest1(){
        MessageService messageService = new CodeMessageService();
        MessageService proxyInstance = (MessageService) Proxy.newProxyInstance(MessageService.class.getClassLoader(), new Class[]{MessageService.class}, new DynamicProxyHandler(messageService));
        proxyInstance.sendMessage("111");
    }

}
