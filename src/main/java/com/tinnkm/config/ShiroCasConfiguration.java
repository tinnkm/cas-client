package com.tinnkm.config;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro集成cas配置
 * Created by tinnkm on 2017/8/4.
 */
@Configuration
public class ShiroCasConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(ShiroCasConfiguration.class);
    @Value("${cas.server.prefix}")
    public static String CASSERVERURLPREFIX;
    //登录地址
    @Value("${cas.server.login}")
    public static String CASLOGINURL;
    //登出地址
    @Value("${cas.server.logout}")
    public static String CASLOGOUTURL;
    //当前工程前缀
    @Value("${cas.client.prefix}")
    public static String BASEURLPREFIX;
    //cas过滤器路径
    @Value("${cas.filter}")
    public static String CASFILTERURL;
    //客户端登录
    @Value("${cas.client.login}")
    public static String CLIENTLOGINURL;

    @Bean
    public EhCacheManager getEhcacheManager(){
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
        return ehCacheManager;
    }



}
