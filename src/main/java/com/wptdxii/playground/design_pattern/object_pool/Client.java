package com.wptdxii.playground.design_pattern.object_pool;

import com.wptdxii.playground.design_pattern.object_pool.core.ObjectPool;
import com.wptdxii.playground.design_pattern.object_pool.core.Reusable;
import com.wptdxii.playground.design_pattern.object_pool.core.ReusablePool;

public class Client {
    public static void main(String[] args) {
        ObjectPool<Reusable> objectPool = ReusablePool.getInstance();
        Reusable reusable1 = objectPool.require();
        System.out.println(reusable1);
        objectPool.release(reusable1);

        Reusable reusable2 = objectPool.require();
        System.out.println(reusable2);


        Reusable reusable3 = objectPool.require();
        System.out.println(reusable3);

        Reusable reusable4 = objectPool.require();
        System.out.println(reusable4);
        objectPool.release(reusable4);

    }
}
