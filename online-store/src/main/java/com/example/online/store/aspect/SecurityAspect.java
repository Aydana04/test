package com.example.online.store.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before("execution(* com.example.service.AdminService.*(..))")
    public void checkAdminAccess(JoinPoint joinPoint) {
        // Предполагаем, что есть метод для проверки прав текущего пользователя
        if (SecurityContext.isAdmin()) {
            return;
        }
        throw new AccessDeniedException("Доступ запрещен: у пользователя нет прав администратора.");
    }
}
