package org.pek.school.log;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Created by e.paku on 2018/06/05.
 *  SEE: https://docs.spring.io/spring/docs/2.5.x/reference/aop.html
 *       https://qiita.com/rubytomato@github/items/de1019aeaaab51c8784d
 */
@Aspect
@Component
public class DemoInterceptor {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* org.pek..*Service.*(..))")
    public Object demo(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("BEGIN - " + joinPoint.toLongString() + " args: " + ToStringBuilder.reflectionToString(joinPoint.getArgs(), ToStringStyle.SHORT_PREFIX_STYLE));
        Object retValue = joinPoint.proceed(joinPoint.getArgs());
        logger.info("with return - " + ToStringBuilder.reflectionToString(retValue, ToStringStyle.SHORT_PREFIX_STYLE));
        return retValue;
    }
}
