package Zg;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Zg.b  reason: case insensitive filesystem */
public abstract class C5713b extends z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66968a = AtomicReferenceFieldUpdater.newUpdater(C5713b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C5712a.f66967a;

    private final Object c(Object obj) {
        Object obj2 = f66968a.get(this);
        Object obj3 = C5712a.f66967a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (b.a(f66968a, this, obj3, obj)) {
            return obj;
        }
        return f66968a.get(this);
    }

    public final Object a(Object obj) {
        Object obj2 = f66968a.get(this);
        if (obj2 == C5712a.f66967a) {
            obj2 = c(e(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object e(Object obj);
}
