package pub.guoxin.protocol.analysis.conf.cache;

import pub.guoxin.protocol.analysis.model.entity.DataProtocol;

/**
 * 协议对象缓存
 * <p>
 * Create by guoxin on 2018/7/10
 */
public class DataProtocolCache {

    private static ConcurrentHashMapCache<Short, DataProtocol> instance = new ConcurrentHashMapCache<>();

    private DataProtocolCache() {
    }

    public static ConcurrentHashMapCache<Short, DataProtocol> getInstance() {
        return instance;
    }

}
