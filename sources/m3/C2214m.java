package m3;

import Xg.C5694f;
import Xg.D;
import Xg.w;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import m3.Z;
import yf.p;

/* renamed from: m3.m  reason: case insensitive filesystem */
public final class C2214m {

    /* renamed from: a  reason: collision with root package name */
    private final b f24073a = new b();

    /* renamed from: m3.m$a */
    private final class a {

        /* renamed from: a  reason: collision with root package name */
        private Z f24074a;

        /* renamed from: b  reason: collision with root package name */
        private final w f24075b = D.b(1, 0, Wg.a.DROP_OLDEST, 2, (Object) null);

        public a() {
        }

        public final C5694f a() {
            return this.f24075b;
        }

        public final Z b() {
            return this.f24074a;
        }

        public final void c(Z z10) {
            this.f24074a = z10;
            if (z10 != null) {
                this.f24075b.b(z10);
            }
        }
    }

    /* renamed from: m3.m$b */
    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f24077a;

        /* renamed from: b  reason: collision with root package name */
        private final a f24078b;

        /* renamed from: c  reason: collision with root package name */
        private Z.a f24079c;

        /* renamed from: d  reason: collision with root package name */
        private final ReentrantLock f24080d = new ReentrantLock();

        public b() {
            this.f24077a = new a();
            this.f24078b = new a();
        }

        public final C5694f a() {
            return this.f24078b.a();
        }

        public final Z.a b() {
            return this.f24079c;
        }

        public final C5694f c() {
            return this.f24077a.a();
        }

        public final void d(Z.a aVar, p pVar) {
            C6496s.h(pVar, "block");
            ReentrantLock reentrantLock = this.f24080d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.f24079c = aVar;
                }
                pVar.invoke(this.f24077a, this.f24078b);
                C6514M m10 = C6514M.f71813a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* renamed from: m3.m$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24082a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f24082a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2214m.c.<clinit>():void");
        }
    }

    /* renamed from: m3.m$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2220t f24083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z f24084b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2220t tVar, Z z10) {
            super(2);
            this.f24083a = tVar;
            this.f24084b = z10;
        }

        public final void a(a aVar, a aVar2) {
            C6496s.h(aVar, "prependHint");
            C6496s.h(aVar2, "appendHint");
            if (this.f24083a == C2220t.PREPEND) {
                aVar.c(this.f24084b);
            } else {
                aVar2.c(this.f24084b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((a) obj, (a) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.m$e */
    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Z f24085a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Z z10) {
            super(2);
            this.f24085a = z10;
        }

        public final void a(a aVar, a aVar2) {
            C6496s.h(aVar, "prependHint");
            C6496s.h(aVar2, "appendHint");
            if (C2215n.a(this.f24085a, aVar.b(), C2220t.PREPEND)) {
                aVar.c(this.f24085a);
            }
            if (C2215n.a(this.f24085a, aVar2.b(), C2220t.APPEND)) {
                aVar2.c(this.f24085a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((a) obj, (a) obj2);
            return C6514M.f71813a;
        }
    }

    public final void a(C2220t tVar, Z z10) {
        C6496s.h(tVar, "loadType");
        C6496s.h(z10, "viewportHint");
        if (tVar == C2220t.PREPEND || tVar == C2220t.APPEND) {
            this.f24073a.d((Z.a) null, new d(tVar, z10));
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + tVar).toString());
    }

    public final Z.a b() {
        return this.f24073a.b();
    }

    public final C5694f c(C2220t tVar) {
        C6496s.h(tVar, "loadType");
        int i10 = c.f24082a[tVar.ordinal()];
        if (i10 == 1) {
            return this.f24073a.c();
        }
        if (i10 == 2) {
            return this.f24073a.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void d(Z z10) {
        Z.a aVar;
        C6496s.h(z10, "viewportHint");
        b bVar = this.f24073a;
        if (z10 instanceof Z.a) {
            aVar = (Z.a) z10;
        } else {
            aVar = null;
        }
        bVar.d(aVar, new e(z10));
    }
}
