package Zg;

import Ug.V0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import qf.g;
import yf.p;

public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public static final G f66954a = new G("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p f66955b = a.f66958a;

    /* renamed from: c  reason: collision with root package name */
    private static final p f66956c = b.f66959a;

    /* renamed from: d  reason: collision with root package name */
    private static final p f66957d = c.f66960a;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66958a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            Integer num;
            int i10;
            if (!(bVar instanceof V0)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 1;
            }
            if (i10 == 0) {
                return bVar;
            }
            return Integer.valueOf(i10 + 1);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66959a = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final V0 invoke(V0 v02, g.b bVar) {
            if (v02 != null) {
                return v02;
            }
            if (bVar instanceof V0) {
                return (V0) bVar;
            }
            return null;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66960a = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final O invoke(O o10, g.b bVar) {
            if (bVar instanceof V0) {
                V0 v02 = (V0) bVar;
                o10.a(v02, v02.t0(o10.f66963a));
            }
            return o10;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f66954a) {
            if (obj instanceof O) {
                ((O) obj).b(gVar);
                return;
            }
            Object f02 = gVar.f0((Object) null, f66956c);
            C6496s.f(f02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((V0) f02).E0(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object f02 = gVar.f0(0, f66955b);
        C6496s.e(f02);
        return f02;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f66954a;
        }
        if (obj instanceof Integer) {
            return gVar.f0(new O(gVar, ((Number) obj).intValue()), f66957d);
        }
        C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((V0) obj).t0(gVar);
    }
}
