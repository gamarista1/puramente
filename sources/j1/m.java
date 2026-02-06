package j1;

import i1.C2064f;
import java.util.ArrayList;

class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f22655h;

    /* renamed from: a  reason: collision with root package name */
    public int f22656a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22657b = false;

    /* renamed from: c  reason: collision with root package name */
    p f22658c = null;

    /* renamed from: d  reason: collision with root package name */
    p f22659d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f22660e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f22661f;

    /* renamed from: g  reason: collision with root package name */
    int f22662g;

    m(p pVar, int i10) {
        int i11 = f22655h;
        this.f22661f = i11;
        f22655h = i11 + 1;
        this.f22658c = pVar;
        this.f22659d = pVar;
        this.f22662g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f22631d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f22638k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f22638k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22631d != pVar) {
                    j11 = Math.min(j11, c(fVar2, ((long) fVar2.f22633f) + j10));
                }
            }
        }
        if (fVar != pVar.f22688i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f22687h, j12)), j12 - ((long) pVar.f22687h.f22633f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f22631d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f22638k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f22638k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22631d != pVar) {
                    j11 = Math.max(j11, d(fVar2, ((long) fVar2.f22633f) + j10));
                }
            }
        }
        if (fVar != pVar.f22687h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f22688i, j12)), j12 - ((long) pVar.f22688i.f22633f));
    }

    public void a(p pVar) {
        this.f22660e.add(pVar);
        this.f22659d = pVar;
    }

    public long b(C2064f fVar, int i10) {
        p pVar;
        p pVar2;
        long j10;
        int i11;
        p pVar3 = this.f22658c;
        long j11 = 0;
        if (pVar3 instanceof c) {
            if (((c) pVar3).f22685f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar3 instanceof l)) {
                return 0;
            }
        } else if (!(pVar3 instanceof n)) {
            return 0;
        }
        if (i10 == 0) {
            pVar = fVar.f21918e;
        } else {
            pVar = fVar.f21920f;
        }
        f fVar2 = pVar.f22687h;
        if (i10 == 0) {
            pVar2 = fVar.f21918e;
        } else {
            pVar2 = fVar.f21920f;
        }
        f fVar3 = pVar2.f22688i;
        boolean contains = pVar3.f22687h.f22639l.contains(fVar2);
        boolean contains2 = this.f22658c.f22688i.f22639l.contains(fVar3);
        long j12 = this.f22658c.j();
        if (contains && contains2) {
            long d10 = d(this.f22658c.f22687h, 0);
            long c10 = c(this.f22658c.f22688i, 0);
            long j13 = d10 - j12;
            p pVar4 = this.f22658c;
            int i12 = pVar4.f22688i.f22633f;
            if (j13 >= ((long) (-i12))) {
                j13 += (long) i12;
            }
            int i13 = pVar4.f22687h.f22633f;
            long j14 = ((-c10) - j12) - ((long) i13);
            if (j14 >= ((long) i13)) {
                j14 -= (long) i13;
            }
            float s10 = pVar4.f22681b.s(i10);
            if (s10 > 0.0f) {
                j11 = (long) ((((float) j14) / s10) + (((float) j13) / (1.0f - s10)));
            }
            float f10 = (float) j11;
            long j15 = ((long) ((f10 * s10) + 0.5f)) + j12 + ((long) ((f10 * (1.0f - s10)) + 0.5f));
            p pVar5 = this.f22658c;
            j10 = ((long) pVar5.f22687h.f22633f) + j15;
            i11 = pVar5.f22688i.f22633f;
        } else if (contains) {
            f fVar4 = this.f22658c.f22687h;
            return Math.max(d(fVar4, (long) fVar4.f22633f), ((long) this.f22658c.f22687h.f22633f) + j12);
        } else if (contains2) {
            f fVar5 = this.f22658c.f22688i;
            return Math.max(-c(fVar5, (long) fVar5.f22633f), ((long) (-this.f22658c.f22688i.f22633f)) + j12);
        } else {
            p pVar6 = this.f22658c;
            j10 = ((long) pVar6.f22687h.f22633f) + pVar6.j();
            i11 = this.f22658c.f22688i.f22633f;
        }
        return j10 - ((long) i11);
    }
}
