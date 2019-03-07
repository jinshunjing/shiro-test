package org.jim.shiro.config;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.PropertiesRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

    @Bean
    public Realm realm() {
        PropertiesRealm realm = new PropertiesRealm();
        realm.setCachingEnabled(true);
        System.out.println("***** instantiated Realm");
        return realm;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition filterChainDefinition = new DefaultShiroFilterChainDefinition();

        // basic authentication
        filterChainDefinition.addPathDefinition("/**", "authcBasic[permissive]");

        // 需要登录才能访问
        //filterChainDefinition.addPathDefinition("/**", "authc");

        System.out.println("***** instantiated FilterChainDefinition");
        return filterChainDefinition;
    }

    @Bean
    public CacheManager cacheManager() {
        CacheManager cacheManager = new MemoryConstrainedCacheManager();

        System.out.println("***** instantiated CacheManager");
        return cacheManager;
    }
}
