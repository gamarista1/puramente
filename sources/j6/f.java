package j6;

import G6.g;
import M5.d;
import V6.k;
import X6.C3096t;
import android.content.Context;
import d6.C3477c;
import e7.e;
import i7.C3593b;
import java.util.Set;
import n6.b;
import t6.C4046a;

public class f extends b {

    /* renamed from: t  reason: collision with root package name */
    private final C3096t f44825t;

    /* renamed from: u  reason: collision with root package name */
    private final h f44826u;

    /* renamed from: v  reason: collision with root package name */
    private T5.f f44827v;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44828a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                n6.b$c[] r0 = n6.b.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44828a = r0
                n6.b$c r1 = n6.b.c.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44828a     // Catch:{ NoSuchFieldError -> 0x001d }
                n6.b$c r1 = n6.b.c.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44828a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n6.b$c r1 = n6.b.c.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j6.f.a.<clinit>():void");
        }
    }

    public f(Context context, h hVar, C3096t tVar, Set set, Set set2) {
        super(context, set, set2);
        this.f44825t = tVar;
        this.f44826u = hVar;
    }

    public static C3593b.c F(b.c cVar) {
        int i10 = a.f44828a[cVar.ordinal()];
        if (i10 == 1) {
            return C3593b.c.FULL_FETCH;
        }
        if (i10 == 2) {
            return C3593b.c.DISK_CACHE;
        }
        if (i10 == 3) {
            return C3593b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private d G() {
        C3593b bVar = (C3593b) l();
        k r10 = this.f44825t.r();
        if (r10 == null || bVar == null) {
            return null;
        }
        if (bVar.l() != null) {
            return r10.b(bVar, d());
        }
        return r10.a(bVar, d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C3477c g(C4046a aVar, String str, C3593b bVar, Object obj, b.c cVar) {
        return this.f44825t.m(bVar, obj, F(cVar), I(aVar), str);
    }

    /* access modifiers changed from: protected */
    public e I(C4046a aVar) {
        if (aVar instanceof e) {
            return ((e) aVar).p0();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public e v() {
        e eVar;
        if (j7.b.d()) {
            j7.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            C4046a n10 = n();
            String c10 = b.c();
            if (n10 instanceof e) {
                eVar = (e) n10;
            } else {
                eVar = this.f44826u.c();
            }
            eVar.r0(w(eVar, c10), c10, G(), d(), this.f44827v);
            eVar.s0((g) null, this);
            if (j7.b.d()) {
                j7.b.b();
            }
            return eVar;
        } catch (Throwable th2) {
            if (j7.b.d()) {
                j7.b.b();
            }
            throw th2;
        }
    }

    public f K(g gVar) {
        return (f) p();
    }
}
