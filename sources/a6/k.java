package A6;

import U6.d;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import v6.C4109d;
import w6.C4143c;
import z6.c;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f29415d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f29416e = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final d f29417a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29418b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29419c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date date) {
            C6496s.h(date, "until");
            synchronized (k.f29416e) {
                try {
                    ConcurrentHashMap a10 = k.f29416e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : a10.entrySet()) {
                        if (((m) entry.getValue()).b().compareTo(date) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((m) entry2.getValue()).a().clear();
                        k.f29416e.remove(entry2.getKey());
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
        }

        public final void b(String str, j jVar) {
            C6496s.h(str, "cacheKey");
            C6496s.h(jVar, "frameLoader");
            k.f29416e.put(str, new m(jVar, new Date()));
        }

        private a() {
        }
    }

    public k(d dVar, int i10, int i11) {
        C6496s.h(dVar, "platformBitmapFactory");
        this.f29417a = dVar;
        this.f29418b = i10;
        this.f29419c = i11;
    }

    public final j b(String str, C4143c cVar, C4109d dVar) {
        C6496s.h(str, "cacheKey");
        C6496s.h(cVar, "bitmapFrameRenderer");
        C6496s.h(dVar, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f29416e;
        synchronized (concurrentHashMap) {
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar != null) {
                concurrentHashMap.remove(str);
                j a10 = mVar.a();
                return a10;
            }
            C6514M m10 = C6514M.f71813a;
            return new g(this.f29417a, cVar, new c(this.f29418b), dVar, this.f29419c);
        }
    }
}
