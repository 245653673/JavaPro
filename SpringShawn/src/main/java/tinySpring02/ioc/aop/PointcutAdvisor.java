package tinySpring02.ioc.aop;

public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();
}