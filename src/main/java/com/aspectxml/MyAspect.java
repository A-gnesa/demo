package com.aspectxml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
//    前置通知
    public void myBefore(JoinPoint joinpoint){
        System.out.println("前置通知：模拟执行权限检查");
        System.out.println(" 目标类是："+ joinpoint.getTarget());
        System.out.println("被植入增强处理的目标方法为："+joinpoint.getSignature().getName());
    }
//    后置通知
    public void myAfterReturning(JoinPoint joinpoint){
        System.out.println("后置通知：模拟记录日志");
        System.out.println("被植入增强处理的目标方法为："+joinpoint.getSignature().getName());
    }
/*   环绕通知
    ProceedingJoinPoint是JoinPoint的子接口，表示可以执行目标方法
    必须是Object的返回值 必须接受一个参数类型为ProceedingJoinPoint 必须throws Throwable
*/

    public Object myAround(ProceedingJoinPoint proceedinngJoinPoin) throws Throwable {
        System.out.println("环绕开始：执行目标方法之前，模拟开启事务。。。");
        Object obj = proceedinngJoinPoin.proceed();
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事务。。。");
        return obj;
    }
    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
            System.out.println("异常通知："+e.getMessage());
        }
//       最终通知
    public void myAfter(){
        System.out.println("最终通知，模拟执行结束后释放资源");
    }
}
