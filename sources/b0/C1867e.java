package b0;

import java.util.Collection;
import java.util.List;
import yf.C6798l;
import zf.C6829b;
import zf.C6831d;

/* renamed from: b0.e  reason: case insensitive filesystem */
public interface C1867e extends C1865c, C1864b {

    /* renamed from: b0.e$a */
    public interface a extends List, Collection, C6829b, C6831d {
        C1867e f();
    }

    C1867e J(C6798l lVar);

    C1867e add(int i10, Object obj);

    C1867e add(Object obj);

    C1867e addAll(Collection collection);

    a builder();

    C1867e remove(Object obj);

    C1867e removeAll(Collection collection);

    C1867e set(int i10, Object obj);

    C1867e y(int i10);
}
