package com.evensuss.web.security;

import javax.cache.CacheException;

/**
 * This abstract class represents a datastore that keeps tuples of (timestamp, nonce, publicKey).
 * The data is used by OAuth to prevent replay attacks.
 *
 */
public abstract class AbstractRequestsFootprintCache {
 
	public abstract boolean isCachedOrPutInCache(String timestamp, String nonce, String publicKey) throws CacheException;
 
	String getKey(String timestamp, String nonce, String publicKey) {
		return new StringBuffer()
				.append(timestamp).append("_")
				.append(nonce).append("_")
				.append(publicKey)
				.toString();
	}
}