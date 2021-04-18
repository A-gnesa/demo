package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    //    定义切入点表达式
    @Pointcut("execution(* com.po.*.*(..))")
    //    使用一个返回值为void、方法体为空的方法来命名切入点
    private void myPointCut(){}
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedinngJoinPoin) throws Throwable {
        System.out.println("环绕开始：执行目标方法之前");
        Object obj = proceedinngJoinPoin.proceed();
        System.out.println("环绕结束：执行目标方法之后");
        return obj;
    }
}
