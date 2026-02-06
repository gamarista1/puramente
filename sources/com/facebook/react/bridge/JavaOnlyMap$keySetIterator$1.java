package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\"\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"com/facebook/react/bridge/JavaOnlyMap$keySetIterator$1", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "iterator", "", "", "", "", "hasNextKey", "", "nextKey", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaOnlyMap$keySetIterator$1 implements ReadableMapKeySetIterator {
    private final Iterator<Map.Entry<String, Object>> iterator;

    JavaOnlyMap$keySetIterator$1(JavaOnlyMap javaOnlyMap) {
        this.iterator = javaOnlyMap.backingMap.entrySet().iterator();
    }

    public boolean hasNextKey() {
        return this.iterator.hasNext();
    }

    public String nextKey() {
        return (String) this.iterator.next().getKey();
    }
}
