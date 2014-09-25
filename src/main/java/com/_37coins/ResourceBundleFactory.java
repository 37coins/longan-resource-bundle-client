package com._37coins;

import java.util.List;
import java.util.Locale;

import net.sf.ehcache.Cache;

public class ResourceBundleFactory {
    public static final String CLASS_NAME = "labels";
    private List<Locale> activeLocales;
    private final Cache cache;
    private final ResourceBundleClient client;
    
    public ResourceBundleFactory(List<Locale> activeLocales, ResourceBundleClient client, Cache cache) {
        this.activeLocales = activeLocales;
        this.cache = cache;
        this.client = client;
    }
    
    public ResourceBundle getBundle(Locale locale, String className){
        return new ResourceBundle(locale, cache, activeLocales, client, className);
    }

    public List<Locale> getActiveLocales() {
        return activeLocales;
    }

}
