package com.evensuss.web.security;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
 
public class LocalRequestsFootprintCache extends AbstractRequestsFootprintCache {
 
	private Cache<String, Boolean> localCache;
 
	private static final AbstractRequestsFootprintCache instance = new LocalRequestsFootprintCache();
 
	public static AbstractRequestsFootprintCache getInstance() {
		return instance;
	}
 
	private LocalRequestsFootprintCache() {
 
		localCache = CacheBuilder.newBuilder()
			       		.expireAfterWrite(3, TimeUnit.MINUTES)
			       		.build();
	}
 
	public boolean isCachedOrPutInCache(String timestamp, String nonce,	String publicKey) {
 
		String cacheKey = getKey(timestamp, nonce, publicKey);
		if (localCache.getIfPresent(cacheKey) != null)
			return true;
 
		localCache.put(cacheKey, true);
		return false;
 
	}
 
}