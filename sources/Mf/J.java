package mf;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;
import zf.C6828a;

public final class J implements Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C6787a f72034a;

    public J(C6787a aVar) {
        C6496s.h(aVar, "iteratorFactory");
        this.f72034a = aVar;
    }

    public Iterator iterator() {
        return new K((Iterator) this.f72034a.invoke());
    }
}
