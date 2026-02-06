package t5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

/* renamed from: t5.f  reason: case insensitive filesystem */
public final class C4029f {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f48233a = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = com.facebook.I.l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized t5.T e(t5.C4024a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap r0 = r4.f48233a     // Catch:{ all -> 0x0023 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0023 }
            t5.T r0 = (t5.T) r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0025
            android.content.Context r1 = com.facebook.I.l()     // Catch:{ all -> 0x0023 }
            o7.b$a r2 = o7.C3886b.f47182f     // Catch:{ all -> 0x0023 }
            o7.b r2 = r2.e(r1)     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0025
            t5.T r0 = new t5.T     // Catch:{ all -> 0x0023 }
            t5.p$a r3 = t5.C4039p.f48255b     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = r3.c(r1)     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r5 = move-exception
            goto L_0x0031
        L_0x0025:
            if (r0 != 0) goto L_0x002a
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x002a:
            java.util.HashMap r1 = r4.f48233a     // Catch:{ all -> 0x0023 }
            r1.put(r5, r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)
            return r0
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x0023 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4029f.e(t5.a):t5.T");
    }

    public final synchronized void a(C4024a aVar, C4028e eVar) {
        C6496s.h(aVar, "accessTokenAppIdPair");
        C6496s.h(eVar, "appEvent");
        T e10 = e(aVar);
        if (e10 != null) {
            e10.a(eVar);
        }
    }

    public final synchronized void b(S s10) {
        if (s10 != null) {
            for (Map.Entry entry : s10.b()) {
                T e10 = e((C4024a) entry.getKey());
                if (e10 != null) {
                    for (C4028e a10 : (List) entry.getValue()) {
                        e10.a(a10);
                    }
                }
            }
        }
    }

    public final synchronized T c(C4024a aVar) {
        C6496s.h(aVar, "accessTokenAppIdPair");
        return (T) this.f48233a.get(aVar);
    }

    public final synchronized int d() {
        int i10;
        i10 = 0;
        for (T c10 : this.f48233a.values()) {
            i10 += c10.c();
        }
        return i10;
    }

    public final synchronized Set f() {
        Set keySet;
        keySet = this.f48233a.keySet();
        C6496s.g(keySet, "stateMap.keys");
        return keySet;
    }
}
