package J;

import B.d;
import B.e;
import B.g;
import B.h;
import B.i;
import B.j;
import B.n;
import Xg.C5695g;
import Y.C1488g1;
import Y.C1505o0;
import androidx.collection.I;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

/* renamed from: J.z  reason: case insensitive filesystem */
public final class C1229z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f3523a = 1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f3524b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f3525c = 4;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1505o0 f3526d = C1488g1.a(0);

    /* renamed from: J.z$a */
    static final class a implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I f3527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1229z f3528b;

        a(I i10, C1229z zVar) {
            this.f3527a = i10;
            this.f3528b = zVar;
        }

        /* renamed from: a */
        public final Object emit(i iVar, C6658d dVar) {
            boolean z10;
            int d10;
            boolean z11 = true;
            if (iVar instanceof g) {
                z10 = true;
            } else {
                z10 = iVar instanceof d;
            }
            if (!z10) {
                z11 = iVar instanceof n.b;
            }
            if (z11) {
                this.f3527a.g(iVar);
            } else if (iVar instanceof h) {
                this.f3527a.j(((h) iVar).a());
            } else if (iVar instanceof e) {
                this.f3527a.j(((e) iVar).a());
            } else if (iVar instanceof n.c) {
                this.f3527a.j(((n.c) iVar).a());
            } else if (iVar instanceof n.a) {
                this.f3527a.j(((n.a) iVar).a());
            }
            I i10 = this.f3527a;
            C1229z zVar = this.f3528b;
            Object[] objArr = i10.f12112a;
            int i11 = i10.f12113b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                i iVar2 = (i) objArr[i13];
                if (iVar2 instanceof g) {
                    d10 = zVar.f3524b;
                } else if (iVar2 instanceof d) {
                    d10 = zVar.f3523a;
                } else if (iVar2 instanceof n.b) {
                    d10 = zVar.f3525c;
                }
                i12 |= d10;
            }
            this.f3528b.f3526d.f(i12);
            return C6514M.f71813a;
        }
    }

    public final Object e(j jVar, C6658d dVar) {
        Object collect = jVar.c().collect(new a(new I(0, 1, (DefaultConstructorMarker) null), this), dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    public final boolean f() {
        if ((this.f3526d.b() & this.f3523a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f3526d.b() & this.f3524b) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f3526d.b() & this.f3525c) != 0) {
            return true;
        }
        return false;
    }
}
