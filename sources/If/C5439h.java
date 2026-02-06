package If;

import Ff.p;
import Gf.f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;

/* renamed from: If.h  reason: case insensitive filesystem */
public abstract class C5439h {

    /* renamed from: a  reason: collision with root package name */
    private static final C5425a f63679a = C5427b.a(C5429c.f63649a);

    /* renamed from: b  reason: collision with root package name */
    private static final C5425a f63680b = C5427b.a(C5431d.f63652a);

    /* renamed from: c  reason: collision with root package name */
    private static final C5425a f63681c = C5427b.a(C5433e.f63666a);

    /* renamed from: d  reason: collision with root package name */
    private static final C5425a f63682d = C5427b.a(C5435f.f63671a);

    /* renamed from: e  reason: collision with root package name */
    private static final C5425a f63683e = C5427b.a(C5437g.f63676a);

    /* access modifiers changed from: private */
    public static final p a(Class cls) {
        C6496s.h(cls, "it");
        return f.b(m(cls), C6565s.n(), false, C6565s.n());
    }

    /* access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class cls) {
        C6496s.h(cls, "it");
        return new ConcurrentHashMap();
    }

    /* access modifiers changed from: private */
    public static final p c(Class cls) {
        C6496s.h(cls, "it");
        return f.b(m(cls), C6565s.n(), true, C6565s.n());
    }

    /* access modifiers changed from: private */
    public static final X d(Class cls) {
        C6496s.h(cls, "it");
        return new X(cls);
    }

    /* access modifiers changed from: private */
    public static final C5467v0 e(Class cls) {
        C6496s.h(cls, "it");
        return new C5467v0(cls);
    }

    public static final p k(Class cls, List list, boolean z10) {
        C6496s.h(cls, "jClass");
        C6496s.h(list, "arguments");
        if (!list.isEmpty()) {
            return l(cls, list, z10);
        }
        if (z10) {
            return (p) f63682d.a(cls);
        }
        return (p) f63681c.a(cls);
    }

    private static final p l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f63683e.a(cls);
        Pair a10 = C6502A.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(a10);
        if (obj == null) {
            p b10 = f.b(m(cls), list, z10, C6565s.n());
            Object putIfAbsent = concurrentHashMap.putIfAbsent(a10, b10);
            if (putIfAbsent == null) {
                obj = b10;
            } else {
                obj = putIfAbsent;
            }
        }
        C6496s.g(obj, "getOrPut(...)");
        return (p) obj;
    }

    public static final X m(Class cls) {
        C6496s.h(cls, "jClass");
        Object a10 = f63679a.a(cls);
        C6496s.f(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) a10;
    }

    public static final Ff.f n(Class cls) {
        C6496s.h(cls, "jClass");
        return (Ff.f) f63680b.a(cls);
    }
}
