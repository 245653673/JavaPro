package tinySpring02.ioc.aop;

import org.junit.Assert;
import org.junit.Test;
import tinySpring02.ioc.HelloWorldServiceAOP;
import tinySpring02.ioc.HelloWorldServiceAOPImpl;

public class AspectJExpressionPointcutTest {
    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* tinySpring02.ioc.aop.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldServiceAOP.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* tinySpring02.ioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceAOPImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceAOPImpl.class);
        Assert.assertTrue(matches);
    }
}
