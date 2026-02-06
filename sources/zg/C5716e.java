package Zg;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6496s;

/* renamed from: Zg.e  reason: case insensitive filesystem */
public abstract class C5716e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66971a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66972b;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<C5716e> cls = C5716e.class;
        Class<Object> cls2 = Object.class;
        f66971a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f66972b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public C5716e(C5716e eVar) {
        this._prev$volatile = eVar;
    }

    private final C5716e d() {
        C5716e h10 = h();
        while (h10 != null && h10.k()) {
            h10 = (C5716e) f66972b.get(h10);
        }
        return h10;
    }

    private final C5716e e() {
        C5716e f10;
        C5716e f11 = f();
        C6496s.e(f11);
        while (f11.k() && (f10 = f11.f()) != null) {
            f11 = f10;
        }
        return f11;
    }

    /* access modifiers changed from: private */
    public final Object g() {
        return f66971a.get(this);
    }

    public final void c() {
        f66972b.set(this, (Object) null);
    }

    public final C5716e f() {
        Object a10 = g();
        if (a10 == C5715d.f66970a) {
            return null;
        }
        return (C5716e) a10;
    }

    public final C5716e h() {
        return (C5716e) f66972b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        if (f() == null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return b.a(f66971a, this, (Object) null, C5715d.f66970a);
    }

    public final void n() {
        Object obj;
        C5716e eVar;
        if (!l()) {
            while (true) {
                C5716e d10 = d();
                C5716e e10 = e();
                AtomicReferenceFieldUpdater j10 = f66972b;
                do {
                    obj = j10.get(e10);
                    if (((C5716e) obj) == null) {
                        eVar = null;
                    } else {
                        eVar = d10;
                    }
                } while (!b.a(j10, e10, obj, eVar));
                if (d10 != null) {
                    f66971a.set(d10, e10);
                }
                if ((!e10.k() || e10.l()) && (d10 == null || !d10.k())) {
                    return;
                }
            }
        }
    }

    public final boolean o(C5716e eVar) {
        return b.a(f66971a, this, (Object) null, eVar);
    }
}
