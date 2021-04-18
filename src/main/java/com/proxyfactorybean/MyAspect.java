package com.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

import java.lang.reflect.Method;

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        // TODO 自动生成的方法存根
        check_Permission();
        Object object = arg0.proceed();
        log();
        return object;
    }

    public void check_Permission() {
        System.out.println("模拟检查权限...");
    }
    public void log() {
        System.out.println("模拟记录日志...");
    }

}
