package org.itstack.demo.design.store;

import java.util.Map;

/**
 *  提供一个统一的接口，为了让工厂方法更好地使用
 */
public interface ICommodity {

    /**
     * 统一的方法，由不同的子类实现
     * @param uId 用户唯一ID
     * @param commodityId 实物商品SKU，或优惠券couponNumber
     * @param bizId 业务ID，防重复
     * @param extMap 扩展信息
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
