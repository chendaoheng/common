package com.skill.base.poiutils;

/**
 * <p>description</p>
 *
 * @author chendaoheng
 * @date 2019/11/20 11:52
 */
public class Boss {

    enum SingletonEnum {
        /**
         * 创建一个枚举对象，该对象天生为单例
         */
        singletonBoss;
        private Boss boss = new Boss();

        private Boss getInstance() {
            return this.boss;
        }
    }

    public static Boss getInstance() {
        return SingletonEnum.singletonBoss.getInstance();
    }

}
