package org.itstack.demo.design;

import org.itstack.demo.design.store.ICommodity;
import org.itstack.demo.design.store.impl.CardCommodityService;
import org.itstack.demo.design.store.impl.CouponCommodityService;
import org.itstack.demo.design.store.impl.GoodsCommodityService;

/**
 *
 * 工厂模式又称工厂方法模式，是一种创建型设计模式，其在父类中提供一个创建对象的方法， 允许子类决定实例化对象的类型。
 *
 * 多种类型商品，统一发奖服务搭建场景
 *
 *  工厂并不是虚空存在的，是在 1-00 的基础上又抽象了一层
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        //实际项目中不需要用到太多的if else，可以使用一些注解替换掉
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
