package com.example.online.store.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.service.OrderService.placeOrder(..))")
    public void logBeforeOrderPlacement() {
        logger.info("Пользователь начал процесс оформления заказа.");
    }

    @Before("execution(* com.example.service.CartService.addItemToCart(..))")
    public void logBeforeAddToCart() {
        logger.info("Пользователь добавил товар в корзину.");
    }
}
