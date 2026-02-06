package Zg;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66997a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public s(boolean z10) {
        this._cur$volatile = new t(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater d10 = f66997a;
        while (true) {
            t tVar = (t) d10.get(this);
            int a10 = tVar.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f66997a, this, tVar, tVar.l());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater d10 = f66997a;
        while (true) {
            t tVar = (t) d10.get(this);
            if (!tVar.d()) {
                b.a(f66997a, this, tVar, tVar.l());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((t) f66997a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater d10 = f66997a;
        while (true) {
            t tVar = (t) d10.get(this);
            Object m10 = tVar.m();
            if (m10 != t.f67001h) {
                return m10;
            }
            b.a(f66997a, this, tVar, tVar.l());
        }
    }
}
