package Ug;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import rf.C6680b;

/* renamed from: Ug.e  reason: case insensitive filesystem */
final class C5564e {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65358b = AtomicIntegerFieldUpdater.newUpdater(C5564e.class, "notCompletedCount$volatile");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final S[] f65359a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: Ug.e$a */
    private final class a extends D0 {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f65360h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e  reason: collision with root package name */
        private final C5582n f65361e;

        /* renamed from: f  reason: collision with root package name */
        public C5559b0 f65362f;

        public a(C5582n nVar) {
            this.f65361e = nVar;
        }

        public final void A(b bVar) {
            f65360h.set(this, bVar);
        }

        public final void B(C5559b0 b0Var) {
            this.f65362f = b0Var;
        }

        public void b(Throwable th2) {
            if (th2 != null) {
                Object u10 = this.f65361e.u(th2);
                if (u10 != null) {
                    this.f65361e.L(u10);
                    b x10 = x();
                    if (x10 != null) {
                        x10.a();
                    }
                }
            } else if (C5564e.f65358b.decrementAndGet(C5564e.this) == 0) {
                C5582n nVar = this.f65361e;
                S[] a10 = C5564e.this.f65359a;
                ArrayList arrayList = new ArrayList(a10.length);
                for (S v10 : a10) {
                    arrayList.add(v10.v());
                }
                nVar.resumeWith(v.b(arrayList));
            }
        }

        public final b x() {
            return (b) f65360h.get(this);
        }

        public final C5559b0 y() {
            C5559b0 b0Var = this.f65362f;
            if (b0Var != null) {
                return b0Var;
            }
            C6496s.v("handle");
            return null;
        }
    }

    /* renamed from: Ug.e$b */
    private final class b implements C5580m {

        /* renamed from: a  reason: collision with root package name */
        private final a[] f65364a;

        public b(a[] aVarArr) {
            this.f65364a = aVarArr;
        }

        public final void a() {
            for (a y10 : this.f65364a) {
                y10.y().dispose();
            }
        }

        public void b(Throwable th2) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f65364a + ']';
        }
    }

    public C5564e(S[] sArr) {
        this.f65359a = sArr;
        this.notCompletedCount$volatile = sArr.length;
    }

    public final Object c(C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        int length = this.f65359a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            S s10 = this.f65359a[i10];
            s10.start();
            a aVar = new a(oVar);
            aVar.B(C0.o(s10, false, false, aVar, 3, (Object) null));
            C6514M m10 = C6514M.f71813a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (oVar.o()) {
            bVar.a();
        } else {
            C5588q.c(oVar, bVar);
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        return v10;
    }
}
