package w4;

import A4.e;
import C4.m;
import D4.b;
import H4.k;
import I4.c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.C4158d;

public class p implements C4120e, C4128m, C4125j, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f49112a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f49113b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final L f49114c;

    /* renamed from: d  reason: collision with root package name */
    private final b f49115d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49116e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f49117f;

    /* renamed from: g  reason: collision with root package name */
    private final C4155a f49118g;

    /* renamed from: h  reason: collision with root package name */
    private final C4155a f49119h;

    /* renamed from: i  reason: collision with root package name */
    private final x4.p f49120i;

    /* renamed from: j  reason: collision with root package name */
    private C4119d f49121j;

    public p(L l10, b bVar, m mVar) {
        this.f49114c = l10;
        this.f49115d = bVar;
        this.f49116e = mVar.c();
        this.f49117f = mVar.f();
        C4158d a10 = mVar.b().h();
        this.f49118g = a10;
        bVar.i(a10);
        a10.a(this);
        C4158d a11 = mVar.d().h();
        this.f49119h = a11;
        bVar.i(a11);
        a11.a(this);
        x4.p b10 = mVar.e().b();
        this.f49120i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    public void b() {
        this.f49114c.invalidateSelf();
    }

    public void c(List list, List list2) {
        this.f49121j.c(list, list2);
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f49121j.j().size(); i11++) {
            C4118c cVar = (C4118c) this.f49121j.j().get(i11);
            if (cVar instanceof C4126k) {
                k.k(eVar, i10, list, eVar2, (C4126k) cVar);
            }
        }
    }

    public void e(Object obj, c cVar) {
        if (!this.f49120i.c(obj, cVar)) {
            if (obj == T.f48424u) {
                this.f49118g.o(cVar);
            } else if (obj == T.f48425v) {
                this.f49119h.o(cVar);
            }
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f49121j.f(rectF, matrix, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.ListIterator r9) {
        /*
            r8 = this;
            w4.d r0 = r8.f49121j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r9.previous()
            w4.c r0 = (w4.C4118c) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x002a:
            java.util.Collections.reverse(r6)
            w4.d r9 = new w4.d
            u4.L r2 = r8.f49114c
            D4.b r3 = r8.f49115d
            boolean r5 = r8.f49117f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f49121j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.p.g(java.util.ListIterator):void");
    }

    public String getName() {
        return this.f49116e;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f49118g.h()).floatValue();
        float floatValue2 = ((Float) this.f49119h.h()).floatValue();
        float floatValue3 = ((Float) this.f49120i.i().h()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f49120i.e().h()).floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f49112a.set(matrix);
            float f10 = (float) i11;
            this.f49112a.preConcat(this.f49120i.g(f10 + floatValue2));
            this.f49121j.h(canvas, this.f49112a, (int) (((float) i10) * k.i(floatValue3, floatValue4, f10 / floatValue)));
        }
    }

    public Path m() {
        Path m10 = this.f49121j.m();
        this.f49113b.reset();
        float floatValue = ((Float) this.f49118g.h()).floatValue();
        float floatValue2 = ((Float) this.f49119h.h()).floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f49112a.set(this.f49120i.g(((float) i10) + floatValue2));
            this.f49113b.addPath(m10, this.f49112a);
        }
        return this.f49113b;
    }
}
