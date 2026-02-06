package Rg;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import zf.C6828a;

public final class t implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f65019a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f65020b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f65021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f65022b;

        a(t tVar) {
            this.f65022b = tVar;
            this.f65021a = tVar.f65019a.iterator();
        }

        public boolean hasNext() {
            return this.f65021a.hasNext();
        }

        public Object next() {
            return this.f65022b.f65020b.invoke(this.f65021a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(h hVar, C6798l lVar) {
        C6496s.h(hVar, "sequence");
        C6496s.h(lVar, "transformer");
        this.f65019a = hVar;
        this.f65020b = lVar;
    }

    public final h e(C6798l lVar) {
        C6496s.h(lVar, "iterator");
        return new f(this.f65019a, this.f65020b, lVar);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
