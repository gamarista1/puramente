package U;

import B.j;
import B.n;
import J0.C1252s;
import Ug.C5600w0;
import Ug.M;
import androidx.collection.K;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import qf.g;
import r0.C2443E0;
import r0.C2544x0;
import rf.C6680b;
import t0.C2605f;
import yf.C6787a;
import yf.p;

public final class c extends q {
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final K f6208y;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f6210b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f6211c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n.b f6212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, c cVar, n.b bVar, C6658d dVar) {
            super(2, dVar);
            this.f6210b = hVar;
            this.f6211c = cVar;
            this.f6212d = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f6210b, this.f6211c, this.f6212d, dVar);
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6209a;
            if (i10 == 0) {
                w.b(obj);
                h hVar = this.f6210b;
                this.f6209a = 1;
                if (hVar.d(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Throwable th2) {
                    this.f6211c.f6208y.o(this.f6212d);
                    C1252s.a(this.f6211c);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f6211c.f6208y.o(this.f6212d);
            C1252s.a(this.f6211c);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ c(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, e02, aVar);
    }

    public void W1() {
        this.f6208y.h();
    }

    public void q2(n.b bVar, long j10, float f10) {
        C2421g gVar;
        n.b bVar2 = bVar;
        K k10 = this.f6208y;
        Object[] objArr = k10.f12124b;
        Object[] objArr2 = k10.f12125c;
        long[] jArr = k10.f12123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            int i13 = (i10 << 3) + i12;
                            n.b bVar3 = (n.b) objArr[i13];
                            ((h) objArr2[i13]).h();
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        if (s2()) {
            gVar = C2421g.d(bVar.a());
        } else {
            gVar = null;
        }
        h hVar = new h(gVar, f10, s2(), (DefaultConstructorMarker) null);
        this.f6208y.r(bVar2, hVar);
        C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new a(hVar, this, bVar2, (C6658d) null), 3, (Object) null);
        C1252s.a(this);
    }

    public void r2(C2605f fVar) {
        float f10;
        int i10;
        int i11;
        float f11;
        int i12;
        float d10 = ((g) t2().invoke()).d();
        if (d10 == 0.0f) {
            return;
        }
        K k10 = this.f6208y;
        Object[] objArr = k10.f12124b;
        Object[] objArr2 = k10.f12125c;
        long[] jArr = k10.f12123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j10 = jArr[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    long j11 = j10;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            n.b bVar = (n.b) objArr[i17];
                            float f12 = d10;
                            i11 = i16;
                            i10 = i15;
                            f11 = d10;
                            i12 = i14;
                            ((h) objArr2[i17]).e(fVar, C2544x0.o(u2(), f12, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                        } else {
                            C2605f fVar2 = fVar;
                            f11 = d10;
                            i11 = i16;
                            i10 = i15;
                            i12 = i14;
                        }
                        j11 >>= i12;
                        i16 = i11 + 1;
                        i14 = i12;
                        d10 = f11;
                        i15 = i10;
                    }
                    C2605f fVar3 = fVar;
                    f10 = d10;
                    if (i15 != i14) {
                        return;
                    }
                } else {
                    C2605f fVar4 = fVar;
                    f10 = d10;
                }
                if (i13 != length) {
                    i13++;
                    d10 = f10;
                } else {
                    return;
                }
            }
        }
    }

    public void x2(n.b bVar) {
        h hVar = (h) this.f6208y.b(bVar);
        if (hVar != null) {
            hVar.h();
        }
    }

    private c(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar) {
        super(jVar, z10, f10, e02, aVar, (DefaultConstructorMarker) null);
        this.f6208y = new K(0, 1, (DefaultConstructorMarker) null);
    }
}
