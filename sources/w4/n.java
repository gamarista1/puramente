package w4;

import A4.e;
import C4.k;
import C4.t;
import D4.b;
import I4.c;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.C4158d;

public class n implements C4128m, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49082a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f49083b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final PathMeasure f49084c = new PathMeasure();

    /* renamed from: d  reason: collision with root package name */
    private final float[] f49085d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final String f49086e;

    /* renamed from: f  reason: collision with root package name */
    private final L f49087f;

    /* renamed from: g  reason: collision with root package name */
    private final k.a f49088g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49089h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f49090i;

    /* renamed from: j  reason: collision with root package name */
    private final C4155a f49091j;

    /* renamed from: k  reason: collision with root package name */
    private final C4155a f49092k;

    /* renamed from: l  reason: collision with root package name */
    private final C4155a f49093l;

    /* renamed from: m  reason: collision with root package name */
    private final C4155a f49094m;

    /* renamed from: n  reason: collision with root package name */
    private final C4155a f49095n;

    /* renamed from: o  reason: collision with root package name */
    private final C4155a f49096o;

    /* renamed from: p  reason: collision with root package name */
    private final C4155a f49097p;

    /* renamed from: q  reason: collision with root package name */
    private final C4117b f49098q = new C4117b();

    /* renamed from: r  reason: collision with root package name */
    private boolean f49099r;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f49100a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                C4.k$a[] r0 = C4.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49100a = r0
                C4.k$a r1 = C4.k.a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49100a     // Catch:{ NoSuchFieldError -> 0x001d }
                C4.k$a r1 = C4.k.a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.n.a.<clinit>():void");
        }
    }

    public n(L l10, b bVar, k kVar) {
        this.f49087f = l10;
        this.f49086e = kVar.d();
        k.a j10 = kVar.j();
        this.f49088g = j10;
        this.f49089h = kVar.k();
        this.f49090i = kVar.l();
        C4158d a10 = kVar.g().h();
        this.f49091j = a10;
        C4155a h10 = kVar.h().h();
        this.f49092k = h10;
        C4158d a11 = kVar.i().h();
        this.f49093l = a11;
        C4158d a12 = kVar.e().h();
        this.f49095n = a12;
        C4158d a13 = kVar.f().h();
        this.f49097p = a13;
        k.a aVar = k.a.STAR;
        if (j10 == aVar) {
            this.f49094m = kVar.b().h();
            this.f49096o = kVar.c().h();
        } else {
            this.f49094m = null;
            this.f49096o = null;
        }
        bVar.i(a10);
        bVar.i(h10);
        bVar.i(a11);
        bVar.i(a12);
        bVar.i(a13);
        if (j10 == aVar) {
            bVar.i(this.f49094m);
            bVar.i(this.f49096o);
        }
        a10.a(this);
        h10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (j10 == aVar) {
            this.f49094m.a(this);
            this.f49096o.a(this);
        }
    }

    private void g() {
        double d10;
        double d11;
        n nVar;
        float f10;
        n nVar2 = this;
        int floor = (int) Math.floor((double) ((Float) nVar2.f49091j.h()).floatValue());
        C4155a aVar = nVar2.f49093l;
        if (aVar == null) {
            d10 = 0.0d;
        } else {
            d10 = (double) ((Float) aVar.h()).floatValue();
        }
        double radians = Math.toRadians(d10 - 90.0d);
        double d12 = (double) floor;
        float floatValue = ((Float) nVar2.f49097p.h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) nVar2.f49095n.h()).floatValue();
        double d13 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d13);
        float sin = (float) (Math.sin(radians) * d13);
        nVar2.f49082a.moveTo(cos, sin);
        double d14 = (double) ((float) (6.283185307179586d / d12));
        double ceil = Math.ceil(d12);
        double d15 = radians + d14;
        int i10 = 0;
        while (true) {
            double d16 = (double) i10;
            if (d16 < ceil) {
                int i11 = i10;
                float cos2 = (float) (d13 * Math.cos(d15));
                double d17 = d14;
                float sin2 = (float) (d13 * Math.sin(d15));
                if (floatValue != 0.0f) {
                    d11 = d13;
                    double d18 = d16;
                    double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    f10 = sin2;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float f11 = floatValue2 * floatValue * 0.25f;
                    float f12 = cos3 * f11;
                    float sin3 = ((float) Math.sin(atan2)) * f11;
                    float cos4 = ((float) Math.cos(atan22)) * f11;
                    float sin4 = f11 * ((float) Math.sin(atan22));
                    if (d18 == ceil - 1.0d) {
                        nVar = this;
                        nVar.f49083b.reset();
                        nVar.f49083b.moveTo(cos, sin);
                        float f13 = cos - f12;
                        float f14 = sin - sin3;
                        float f15 = cos2 + cos4;
                        float f16 = sin4 + f10;
                        nVar.f49083b.cubicTo(f13, f14, f15, f16, cos2, f10);
                        nVar.f49084c.setPath(nVar.f49083b, false);
                        PathMeasure pathMeasure = nVar.f49084c;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, nVar.f49085d, (float[]) null);
                        Path path = nVar.f49082a;
                        float[] fArr = nVar.f49085d;
                        path.cubicTo(f13, f14, f15, f16, fArr[0], fArr[1]);
                    } else {
                        nVar = this;
                        nVar.f49082a.cubicTo(cos - f12, sin - sin3, cos2 + cos4, f10 + sin4, cos2, f10);
                    }
                } else {
                    double d19 = d16;
                    d11 = d13;
                    f10 = sin2;
                    nVar = nVar2;
                    if (d19 == ceil - 1.0d) {
                        sin = f10;
                        cos = cos2;
                        d14 = d17;
                        i10 = i11 + 1;
                        nVar2 = nVar;
                        d13 = d11;
                    } else {
                        nVar.f49082a.lineTo(cos2, f10);
                    }
                }
                d15 += d17;
                sin = f10;
                cos = cos2;
                d14 = d17;
                i10 = i11 + 1;
                nVar2 = nVar;
                d13 = d11;
            } else {
                n nVar3 = nVar2;
                PointF pointF = (PointF) nVar3.f49092k.h();
                nVar3.f49082a.offset(pointF.x, pointF.y);
                nVar3.f49082a.close();
                return;
            }
        }
    }

    private void i() {
        double d10;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        double d11;
        float f16;
        float f17;
        float f18;
        double d12;
        float f19;
        double d13;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float floatValue = ((Float) this.f49091j.h()).floatValue();
        C4155a aVar = this.f49093l;
        if (aVar == null) {
            d10 = 0.0d;
        } else {
            d10 = (double) ((Float) aVar.h()).floatValue();
        }
        double radians = Math.toRadians(d10 - 90.0d);
        double d14 = (double) floatValue;
        float f26 = (float) (6.283185307179586d / d14);
        if (this.f49090i) {
            f26 *= -1.0f;
        }
        float f27 = f26 / 2.0f;
        float f28 = floatValue - ((float) ((int) floatValue));
        int i11 = (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (double) ((1.0f - f28) * f27);
        }
        float floatValue2 = ((Float) this.f49095n.h()).floatValue();
        float floatValue3 = ((Float) this.f49094m.h()).floatValue();
        C4155a aVar2 = this.f49096o;
        if (aVar2 != null) {
            f10 = ((Float) aVar2.h()).floatValue() / 100.0f;
        } else {
            f10 = 0.0f;
        }
        C4155a aVar3 = this.f49097p;
        if (aVar3 != null) {
            f11 = ((Float) aVar3.h()).floatValue() / 100.0f;
        } else {
            f11 = 0.0f;
        }
        if (i11 != 0) {
            f12 = ((floatValue2 - floatValue3) * f28) + floatValue3;
            i10 = i11;
            double d15 = (double) f12;
            float f29 = f27;
            float cos = (float) (d15 * Math.cos(radians));
            f14 = (float) (d15 * Math.sin(radians));
            this.f49082a.moveTo(cos, f14);
            d11 = radians + ((double) ((f26 * f28) / 2.0f));
            f13 = cos;
            f15 = f29;
        } else {
            float f30 = f27;
            i10 = i11;
            double d16 = (double) floatValue2;
            float cos2 = (float) (Math.cos(radians) * d16);
            float sin = (float) (d16 * Math.sin(radians));
            this.f49082a.moveTo(cos2, sin);
            f13 = cos2;
            f15 = f30;
            d11 = radians + ((double) f15);
            f14 = sin;
            f12 = 0.0f;
        }
        double ceil = Math.ceil(d14) * 2.0d;
        int i12 = 0;
        float f31 = f15;
        float f32 = f13;
        float f33 = floatValue2;
        float f34 = floatValue3;
        boolean z10 = false;
        while (true) {
            double d17 = (double) i12;
            if (d17 < ceil) {
                if (z10) {
                    f16 = f33;
                } else {
                    f16 = f34;
                }
                int i13 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i13 == 0 || d17 != ceil - 2.0d) {
                    f17 = f26;
                    f18 = f31;
                } else {
                    f17 = f26;
                    f18 = (f26 * f28) / 2.0f;
                }
                if (i13 == 0 || d17 != ceil - 1.0d) {
                    d12 = d17;
                    f19 = f12;
                    f12 = f16;
                } else {
                    d12 = d17;
                    f19 = f12;
                }
                double d18 = (double) f12;
                double d19 = ceil;
                float cos3 = (float) (d18 * Math.cos(d11));
                float sin2 = (float) (d18 * Math.sin(d11));
                if (f10 == 0.0f && f11 == 0.0f) {
                    this.f49082a.lineTo(cos3, sin2);
                    d13 = d11;
                    f20 = f10;
                    f21 = f11;
                } else {
                    f20 = f10;
                    double atan2 = (double) ((float) (Math.atan2((double) f14, (double) f32) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f21 = f11;
                    d13 = d11;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos3) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z10) {
                        f22 = f20;
                    } else {
                        f22 = f21;
                    }
                    if (z10) {
                        f23 = f21;
                    } else {
                        f23 = f20;
                    }
                    if (z10) {
                        f24 = f34;
                    } else {
                        f24 = f33;
                    }
                    if (z10) {
                        f25 = f33;
                    } else {
                        f25 = f34;
                    }
                    float f35 = f24 * f22 * 0.47829f;
                    float f36 = cos4 * f35;
                    float f37 = f35 * sin3;
                    float f38 = f25 * f23 * 0.47829f;
                    float f39 = cos5 * f38;
                    float f40 = f38 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f36 *= f28;
                            f37 *= f28;
                        } else if (d12 == d19 - 1.0d) {
                            f39 *= f28;
                            f40 *= f28;
                        }
                    }
                    this.f49082a.cubicTo(f32 - f36, f14 - f37, cos3 + f39, sin2 + f40, cos3, sin2);
                }
                d11 = d13 + ((double) f18);
                z10 = !z10;
                i12++;
                f32 = cos3;
                f14 = sin2;
                f11 = f21;
                f10 = f20;
                f12 = f19;
                f26 = f17;
                ceil = d19;
            } else {
                PointF pointF = (PointF) this.f49092k.h();
                this.f49082a.offset(pointF.x, pointF.y);
                this.f49082a.close();
                return;
            }
        }
    }

    private void j() {
        this.f49099r = false;
        this.f49087f.invalidateSelf();
    }

    public void b() {
        j();
    }

    public void c(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4118c cVar = (C4118c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f49098q.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        H4.k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        C4155a aVar;
        C4155a aVar2;
        if (obj == T.f48426w) {
            this.f49091j.o(cVar);
        } else if (obj == T.f48427x) {
            this.f49093l.o(cVar);
        } else if (obj == T.f48417n) {
            this.f49092k.o(cVar);
        } else if (obj == T.f48428y && (aVar2 = this.f49094m) != null) {
            aVar2.o(cVar);
        } else if (obj == T.f48429z) {
            this.f49095n.o(cVar);
        } else if (obj == T.f48388A && (aVar = this.f49096o) != null) {
            aVar.o(cVar);
        } else if (obj == T.f48389B) {
            this.f49097p.o(cVar);
        }
    }

    public String getName() {
        return this.f49086e;
    }

    public Path m() {
        if (this.f49099r) {
            return this.f49082a;
        }
        this.f49082a.reset();
        if (this.f49089h) {
            this.f49099r = true;
            return this.f49082a;
        }
        int i10 = a.f49100a[this.f49088g.ordinal()];
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            g();
        }
        this.f49082a.close();
        this.f49098q.b(this.f49082a);
        this.f49099r = true;
        return this.f49082a;
    }
}
