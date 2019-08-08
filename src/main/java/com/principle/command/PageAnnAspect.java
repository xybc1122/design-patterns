package com.principle.command;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 类描述:
 *
 * @author 陈恩惠
 * @since 2019年08月08日 16:36:00
 */
@Aspect
@Component
public class PageAnnAspect {


    @Pointcut("@annotation(com.principle.command.PageAnn)")
    public void serviceFindFunction() {

    }

    @Around("serviceFindFunction()")
    public Object serviceImplAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //log.info("进入PageHelper AOP");

        //获取连接点方法运行时的入参列表
        Object[] args = proceedingJoinPoint.getArgs();
        //获取连接点的方法签名对象
        Signature signature = proceedingJoinPoint.getSignature();

        //获取连接点所在的类的对象(实例)
        Object target = proceedingJoinPoint.getTarget();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        if (requestAttributes == null) {
            //报错
            throw new Exception();
        }
        HttpServletRequest request = requestAttributes.getRequest();
        String method = request.getMethod();
        if ("GET".equals(method)) {

        } else if ("POST".equals(method)) {

        }

        PageHelper.startPage(Integer.parseInt(args[0].toString()), Integer.parseInt(args[1].toString()));

        // log.info("方法[{}]开始执行...", signature.getName());
        Object object = proceedingJoinPoint.proceed();
        //log.info("方法[{}]执行结束.", signature.getName());

        if (object instanceof List) {
            List objList = (List) object;
            return new PageInfo<>(objList);
        }
        return object;
    }

}
