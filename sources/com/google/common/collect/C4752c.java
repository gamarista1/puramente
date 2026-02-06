package com.google.common.collect;

import com.google.common.collect.C4753d;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.collect.c  reason: case insensitive filesystem */
abstract class C4752c extends C4753d implements D {
    private static final long serialVersionUID = 6588350623831699109L;

    protected C4752c(Map map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    public Collection A(Object obj, Collection collection) {
        return B(obj, (List) collection, (C4753d.k) null);
    }

    /* renamed from: C */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    public Map asMap() {
        return super.asMap();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public Collection z(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }
}
