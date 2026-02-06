package z;

import Ef.i;
import Ug.C5582n;
import a0.C1538b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import q0.C2423i;
import yf.C6798l;
import z.C2948f;

/* renamed from: z.c  reason: case insensitive filesystem */
public final class C2945c {

    /* renamed from: b  reason: collision with root package name */
    public static final int f28893b = C1538b.f10554d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1538b f28894a = new C1538b(new C2948f.a[16], 0);

    /* renamed from: z.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2945c f28895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2948f.a f28896b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2945c cVar, C2948f.a aVar) {
            super(1);
            this.f28895a = cVar;
            this.f28896b = aVar;
        }

        public final void a(Throwable th2) {
            this.f28895a.f28894a.w(this.f28896b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public final void b(Throwable th2) {
        C1538b bVar = this.f28894a;
        int q10 = bVar.q();
        C5582n[] nVarArr = new C5582n[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            nVarArr[i10] = ((C2948f.a) bVar.p()[i10]).a();
        }
        for (int i11 = 0; i11 < q10; i11++) {
            nVarArr[i11].B(th2);
        }
        if (!this.f28894a.s()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C2948f.a aVar) {
        C2423i iVar = (C2423i) aVar.b().invoke();
        if (iVar == null) {
            C5582n a10 = aVar.a();
            v.a aVar2 = v.f71841b;
            a10.resumeWith(v.b(C6514M.f71813a));
            return false;
        }
        aVar.a().s(new a(this, aVar));
        i iVar2 = new i(0, this.f28894a.q() - 1);
        int k10 = iVar2.k();
        int n10 = iVar2.n();
        if (k10 <= n10) {
            while (true) {
                C2423i iVar3 = (C2423i) ((C2948f.a) this.f28894a.p()[n10]).b().invoke();
                if (iVar3 != null) {
                    C2423i p10 = iVar.p(iVar3);
                    if (C6496s.c(p10, iVar)) {
                        this.f28894a.a(n10 + 1, aVar);
                        return true;
                    } else if (!C6496s.c(p10, iVar3)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int q10 = this.f28894a.q() - 1;
                        if (q10 <= n10) {
                            while (true) {
                                ((C2948f.a) this.f28894a.p()[n10]).a().B(cancellationException);
                                if (q10 == n10) {
                                    break;
                                }
                                q10++;
                            }
                        }
                    }
                }
                if (n10 == k10) {
                    break;
                }
                n10--;
            }
        }
        this.f28894a.a(0, aVar);
        return true;
    }

    public final void d() {
        i iVar = new i(0, this.f28894a.q() - 1);
        int k10 = iVar.k();
        int n10 = iVar.n();
        if (k10 <= n10) {
            while (true) {
                ((C2948f.a) this.f28894a.p()[k10]).a().resumeWith(v.b(C6514M.f71813a));
                if (k10 == n10) {
                    break;
                }
                k10++;
            }
        }
        this.f28894a.i();
    }
}
