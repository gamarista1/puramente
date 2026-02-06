package Mg;

import Ff.d;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: Mg.a  reason: case insensitive filesystem */
public abstract class C5480a implements Iterable, C6828a {

    /* renamed from: Mg.a$a  reason: collision with other inner class name */
    public static abstract class C0943a {

        /* renamed from: a  reason: collision with root package name */
        private final int f64138a;

        public C0943a(int i10) {
            this.f64138a = i10;
        }

        /* access modifiers changed from: protected */
        public final Object c(C5480a aVar) {
            C6496s.h(aVar, "thisRef");
            return aVar.a().get(this.f64138a);
        }
    }

    /* access modifiers changed from: protected */
    public abstract c a();

    /* access modifiers changed from: protected */
    public abstract z b();

    /* access modifiers changed from: protected */
    public final void g(d dVar, Object obj) {
        C6496s.h(dVar, "tClass");
        C6496s.h(obj, "value");
        String v10 = dVar.v();
        C6496s.e(v10);
        k(v10, obj);
    }

    public final boolean isEmpty() {
        if (a().a() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return a().iterator();
    }

    /* access modifiers changed from: protected */
    public abstract void k(String str, Object obj);
}
