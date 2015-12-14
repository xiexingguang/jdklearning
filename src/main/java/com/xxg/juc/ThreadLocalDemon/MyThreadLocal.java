package com.xxg.juc.ThreadLocalDemon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ecuser on 2015/12/11.
 *
 * 自己实现threadLocal模式
 */
public class MyThreadLocal<T> {

    private Map<Thread, T> mythreadMap = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T t) {
        Thread thread = Thread.currentThread(); //
        mythreadMap.put(thread, t);
    }

    public T get() {
        Thread thread = Thread.currentThread();
        T t = mythreadMap.get(thread);
        if (t == null || !mythreadMap.containsKey(thread)) {
            t = null;
            mythreadMap.put(thread, t);
        }
        return mythreadMap.get(thread);
    }

    public T initialValue() {
        return null;
    }

    public void remove() {
        mythreadMap.remove(Thread.currentThread());
    }


}
