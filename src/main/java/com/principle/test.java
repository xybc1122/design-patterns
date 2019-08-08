package com.principle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class test {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
//        byte i = 25;
//        System.out.println(Integer.toBinaryString(i));

        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 11; i++) {
            map.put(i, i);
        }

//        System.out.println(map);
//        map.putIfAbsent(1,20);
//        System.out.println(map);
        map.computeIfAbsent(1, (v) -> {
            //计算返回
            return 10;
        });

        System.out.println(map);
        //  00011001
//        /* 需要运行的代码块*/
//        Map<String, String> map = new HashMap<>();
//        for (int i = 0; i < 20000000; i++) {
//            map.put(UUID.randomUUID() + "", UUID.randomUUID() + "");
//        }
//        System.out.println(map);
//        for (String str : map.keySet()) {
//            if (str.equals("cs")) {
//                break;
//            }
//        }
//        int h = 4;
//        System.out.println(h >>> 1);
//        long endTime = System.currentTimeMillis();
//        System.out.println("运行时间:" + (endTime - startTime) + "ms");
    }


    private static Object apply(String v) {
        return 1;
    }
}


class DynamicProxyHandler implements InvocationHandler {
    private Object proxyed;

    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理工作了.");
        return method.invoke(proxyed, args);
    }
}