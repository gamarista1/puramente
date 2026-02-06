package mf;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import zf.C6832e;

/* renamed from: mf.g  reason: case insensitive filesystem */
public abstract class C6554g extends AbstractMap implements Map, C6832e {
    protected C6554g() {
    }

    public abstract Set a();

    public abstract /* bridge */ Set b();

    public abstract /* bridge */ int c();

    public abstract /* bridge */ Collection e();

    public final /* bridge */ Set entrySet() {
        return a();
    }

    public final /* bridge */ Set keySet() {
        return b();
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final /* bridge */ Collection values() {
        return e();
    }
}
