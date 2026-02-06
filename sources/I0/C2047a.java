package i0;

import java.util.List;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import yf.C6798l;

/* renamed from: i0.a  reason: case insensitive filesystem */
public final class C2047a extends C2049c {

    /* renamed from: i0.a$a  reason: collision with other inner class name */
    static final class C0356a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f21703a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0356a(List list) {
            super(1);
            this.f21703a = list;
        }

        public final void a(Object obj) {
            List list = this.f21703a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C6798l) list.get(i10)).invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: i0.a$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f21704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f21705b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6798l lVar, C6798l lVar2) {
            super(1);
            this.f21704a = lVar;
            this.f21705b = lVar2;
        }

        /* renamed from: a */
        public final C2049c invoke(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f21757e;
                p.f21757e = i10 + 1;
            }
            return new C2049c(i10, nVar, this.f21704a, this.f21705b);
        }
    }

    /* renamed from: i0.a$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f21706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6798l lVar) {
            super(1);
            this.f21706a = lVar;
        }

        /* renamed from: a */
        public final C2054h invoke(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f21757e;
                p.f21757e = i10 + 1;
            }
            return new C2054h(i10, nVar, this.f21706a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2047a(int r4, i0.n r5) {
        /*
            r3 = this;
            java.lang.Object r0 = i0.p.I()
            monitor-enter(r0)
            java.util.List r1 = i0.p.f21761i     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = mf.C6565s.R0(r1)     // Catch:{ all -> 0x0017 }
            yf.l r2 = (yf.C6798l) r2     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0019
            i0.a$a r2 = new i0.a$a     // Catch:{ all -> 0x0017 }
            r2.<init>(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x001f
        L_0x0019:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L_0x001f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C2047a.<init>(int, i0.n):void");
    }

    public C2058l C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    public C2049c Q(C6798l lVar, C6798l lVar2) {
        return (C2049c) p.b0(new b(lVar, lVar2));
    }

    /* renamed from: T */
    public Void m(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    /* renamed from: U */
    public Void n(C2057k kVar) {
        t.a();
        throw new C6527k();
    }

    public void d() {
        synchronized (p.I()) {
            q();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public void o() {
        p.B();
    }

    public C2057k x(C6798l lVar) {
        return p.b0(new c(lVar));
    }
}
