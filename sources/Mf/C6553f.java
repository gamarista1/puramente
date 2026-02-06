package mf;

import java.util.AbstractList;
import java.util.List;
import zf.C6831d;

/* renamed from: mf.f  reason: case insensitive filesystem */
public abstract class C6553f extends AbstractList implements List, C6831d {
    protected C6553f() {
    }

    public abstract int a();

    public abstract Object b(int i10);

    public final /* bridge */ Object remove(int i10) {
        return b(i10);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
