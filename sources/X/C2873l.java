package x;

import c1.d;
import c1.h;
import c1.t;
import k0.i;
import o0.C2342e;
import q0.C2423i;
import q0.C2427m;
import r0.O1;
import r0.g2;
import z.q;

/* renamed from: x.l  reason: case insensitive filesystem */
public abstract class C2873l {

    /* renamed from: a  reason: collision with root package name */
    private static final float f27969a = h.j((float) 30);

    /* renamed from: b  reason: collision with root package name */
    private static final i f27970b;

    /* renamed from: c  reason: collision with root package name */
    private static final i f27971c;

    /* renamed from: x.l$a */
    public static final class a implements g2 {
        a() {
        }

        /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
        public O1 m13createOutlinePq9zytI(long j10, t tVar, d dVar) {
            float E02 = (float) dVar.E0(C2873l.b());
            return new O1.b(new C2423i(0.0f, -E02, C2427m.k(j10), C2427m.i(j10) + E02));
        }
    }

    /* renamed from: x.l$b */
    public static final class b implements g2 {
        b() {
        }

        /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
        public O1 m14createOutlinePq9zytI(long j10, t tVar, d dVar) {
            float E02 = (float) dVar.E0(C2873l.b());
            return new O1.b(new C2423i(-E02, 0.0f, C2427m.k(j10) + E02, C2427m.i(j10)));
        }
    }

    static {
        i.a aVar = i.f23074a;
        f27970b = C2342e.a(aVar, new a());
        f27971c = C2342e.a(aVar, new b());
    }

    public static final i a(i iVar, q qVar) {
        i iVar2;
        if (qVar == q.Vertical) {
            iVar2 = f27971c;
        } else {
            iVar2 = f27970b;
        }
        return iVar.h(iVar2);
    }

    public static final float b() {
        return f27969a;
    }
}
