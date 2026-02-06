package Ic;

import Ic.b;
import android.support.v4.media.session.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51165a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f51166b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: Ic.a$a  reason: collision with other inner class name */
    private static final class C0785a {
    }

    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f51167a;

        /* renamed from: b  reason: collision with root package name */
        Object f51168b;

        /* renamed from: c  reason: collision with root package name */
        Object f51169c;

        /* renamed from: d  reason: collision with root package name */
        Object f51170d;

        /* renamed from: e  reason: collision with root package name */
        Object f51171e;

        /* renamed from: f  reason: collision with root package name */
        Object f51172f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f51173g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f51174h;

        /* renamed from: i  reason: collision with root package name */
        int f51175i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C6658d dVar) {
            super(dVar);
            this.f51174h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51173g = obj;
            this.f51175i |= Integer.MIN_VALUE;
            return this.f51174h.b(this);
        }
    }

    private a() {
    }

    private final C0785a a(b.a aVar) {
        Map map = f51166b;
        C6496s.g(map, "dependencies");
        Object obj = map.get(aVar);
        if (obj != null) {
            C6496s.g(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            c.a(obj);
            return null;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Ic.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ic.a$b r0 = (Ic.a.b) r0
            int r1 = r0.f51175i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51175i = r1
            goto L_0x0018
        L_0x0013:
            Ic.a$b r0 = new Ic.a$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f51173g
            rf.C6680b.f()
            int r1 = r0.f51175i
            r2 = 0
            if (r1 == 0) goto L_0x0057
            r3 = 1
            if (r1 != r3) goto L_0x004f
            java.lang.Object r1 = r0.f51172f
            java.lang.Object r3 = r0.f51171e
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r0.f51170d
            dh.a r4 = (dh.C5817a) r4
            java.lang.Object r5 = r0.f51169c
            Ic.b$a r5 = (Ic.b.a) r5
            java.lang.Object r6 = r0.f51168b
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r0 = r0.f51167a
            java.util.Map r0 = (java.util.Map) r0
            lf.w.b(r8)
            Ic.a r8 = f51165a     // Catch:{ all -> 0x004a }
            r8.c(r5)     // Catch:{ all -> 0x004a }
            r4.e(r2)
            r3.put(r1, r2)
            goto L_0x0078
        L_0x004a:
            r8 = move-exception
            r4.e(r2)
            throw r8
        L_0x004f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0057:
            lf.w.b(r8)
            java.util.Map r8 = f51166b
            java.lang.String r0 = "dependencies"
            kotlin.jvm.internal.C6496s.g(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r8.size()
            int r1 = mf.O.e(r1)
            r0.<init>(r1)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L_0x0078:
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L_0x007f
            return r0
        L_0x007f:
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r8.getKey()
            java.lang.Object r0 = r8.getKey()
            Ic.b$a r0 = (Ic.b.a) r0
            java.lang.Object r8 = r8.getValue()
            android.support.v4.media.session.c.a(r8)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ic.a.b(qf.d):java.lang.Object");
    }

    public final b c(b.a aVar) {
        C6496s.h(aVar, "subscriberName");
        a(aVar);
        throw null;
    }
}
