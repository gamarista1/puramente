package I;

import c1.d;
import c1.t;
import q0.C2427m;
import r0.O1;
import r0.g2;

public abstract class a implements g2 {

    /* renamed from: a  reason: collision with root package name */
    private final b f2663a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2664b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2665c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2666d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f2663a = bVar;
        this.f2664b = bVar2;
        this.f2665c = bVar3;
        this.f2666d = bVar4;
    }

    public static /* synthetic */ a b(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f2663a;
            }
            if ((i10 & 2) != 0) {
                bVar2 = aVar.f2664b;
            }
            if ((i10 & 4) != 0) {
                bVar3 = aVar.f2665c;
            }
            if ((i10 & 8) != 0) {
                bVar4 = aVar.f2666d;
            }
            return aVar.a(bVar, bVar2, bVar3, bVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public abstract a a(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract O1 c(long j10, float f10, float f11, float f12, float f13, t tVar);

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public final O1 m7createOutlinePq9zytI(long j10, t tVar, d dVar) {
        float a10 = this.f2663a.a(j10, dVar);
        float a11 = this.f2664b.a(j10, dVar);
        float a12 = this.f2665c.a(j10, dVar);
        float a13 = this.f2666d.a(j10, dVar);
        float j11 = C2427m.j(j10);
        float f10 = a10 + a13;
        if (f10 > j11) {
            float f11 = j11 / f10;
            a10 *= f11;
            a13 *= f11;
        }
        float f12 = a13;
        float f13 = a11 + a12;
        if (f13 > j11) {
            float f14 = j11 / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f && f12 >= 0.0f) {
            return c(j10, a10, a11, a12, f12, tVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final b d() {
        return this.f2665c;
    }

    public final b e() {
        return this.f2666d;
    }

    public final b f() {
        return this.f2664b;
    }

    public final b g() {
        return this.f2663a;
    }
}
