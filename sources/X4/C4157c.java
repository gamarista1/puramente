package x4;

import D4.b;
import F4.C3007j;
import I4.c;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import x4.C4155a;

/* renamed from: x4.c  reason: case insensitive filesystem */
public class C4157c implements C4155a.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f49371a;

    /* renamed from: b  reason: collision with root package name */
    private final C4155a.b f49372b;

    /* renamed from: c  reason: collision with root package name */
    private final C4155a f49373c;

    /* renamed from: d  reason: collision with root package name */
    private final C4158d f49374d;

    /* renamed from: e  reason: collision with root package name */
    private final C4158d f49375e;

    /* renamed from: f  reason: collision with root package name */
    private final C4158d f49376f;

    /* renamed from: g  reason: collision with root package name */
    private final C4158d f49377g;

    /* renamed from: h  reason: collision with root package name */
    private float f49378h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    private float f49379i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    private float f49380j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private int f49381k = 0;

    /* renamed from: l  reason: collision with root package name */
    private final float[] f49382l = new float[9];

    /* renamed from: x4.c$a */
    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f49383d;

        a(c cVar) {
            this.f49383d = cVar;
        }

        /* renamed from: d */
        public Float a(I4.b bVar) {
            Float f10 = (Float) this.f49383d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public C4157c(C4155a.b bVar, b bVar2, C3007j jVar) {
        this.f49372b = bVar;
        this.f49371a = bVar2;
        C4155a h10 = jVar.a().h();
        this.f49373c = h10;
        h10.a(this);
        bVar2.i(h10);
        C4158d a10 = jVar.d().h();
        this.f49374d = a10;
        a10.a(this);
        bVar2.i(a10);
        C4158d a11 = jVar.b().h();
        this.f49375e = a11;
        a11.a(this);
        bVar2.i(a11);
        C4158d a12 = jVar.c().h();
        this.f49376f = a12;
        a12.a(this);
        bVar2.i(a12);
        C4158d a13 = jVar.e().h();
        this.f49377g = a13;
        a13.a(this);
        bVar2.i(a13);
    }

    public void a(Paint paint, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f49376f.h()).floatValue();
        double q10 = (double) (this.f49375e.q() * 0.017453292f);
        float sin = ((float) Math.sin(q10)) * floatValue;
        float cos = ((float) Math.cos(q10 + 3.141592653589793d)) * floatValue;
        this.f49371a.f30297x.f().getValues(this.f49382l);
        float[] fArr = this.f49382l;
        float f10 = fArr[0];
        float f11 = fArr[4];
        matrix.getValues(fArr);
        float[] fArr2 = this.f49382l;
        float f12 = fArr2[0] / f10;
        float f13 = sin * f12;
        float f14 = cos * (fArr2[4] / f11);
        int intValue = ((Integer) this.f49373c.h()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f49374d.h()).floatValue() * ((float) i10)) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        float max = Math.max(((Float) this.f49377g.h()).floatValue() * f12 * 0.33f, Float.MIN_VALUE);
        if (this.f49378h != max || this.f49379i != f13 || this.f49380j != f14 || this.f49381k != argb) {
            this.f49378h = max;
            this.f49379i = f13;
            this.f49380j = f14;
            this.f49381k = argb;
            paint.setShadowLayer(max, f13, f14, argb);
        }
    }

    public void b() {
        this.f49372b.b();
    }

    public void c(c cVar) {
        this.f49373c.o(cVar);
    }

    public void d(c cVar) {
        this.f49375e.o(cVar);
    }

    public void e(c cVar) {
        this.f49376f.o(cVar);
    }

    public void f(c cVar) {
        if (cVar == null) {
            this.f49374d.o((c) null);
        } else {
            this.f49374d.o(new a(cVar));
        }
    }

    public void g(c cVar) {
        this.f49377g.o(cVar);
    }
}
