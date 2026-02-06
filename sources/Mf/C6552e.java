package mf;

import java.util.AbstractCollection;
import java.util.Collection;
import zf.C6829b;

/* renamed from: mf.e  reason: case insensitive filesystem */
public abstract class C6552e extends AbstractCollection implements Collection, C6829b {
    protected C6552e() {
    }

    public abstract int a();

    public final /* bridge */ int size() {
        return a();
    }
}
