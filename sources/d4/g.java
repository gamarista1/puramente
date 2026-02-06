package D4;

import A4.e;
import C4.a;
import C4.q;
import F4.C3007j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import u4.C4071k;
import u4.L;
import w4.C4119d;

public class g extends b {

    /* renamed from: E  reason: collision with root package name */
    private final C4119d f30357E;

    /* renamed from: F  reason: collision with root package name */
    private final c f30358F;

    g(L l10, e eVar, c cVar, C4071k kVar) {
        super(l10, eVar);
        this.f30358F = cVar;
        C4119d dVar = new C4119d(l10, this, new q("__container", eVar.o(), false), kVar);
        this.f30357E = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    public void J(e eVar, int i10, List list, e eVar2) {
        this.f30357E.d(eVar, i10, list, eVar2);
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        this.f30357E.f(rectF, this.f30288o, z10);
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        this.f30357E.h(canvas, matrix, i10);
    }

    public a x() {
        a x10 = super.x();
        if (x10 != null) {
            return x10;
        }
        return this.f30358F.x();
    }

    public C3007j z() {
        C3007j z10 = super.z();
        if (z10 != null) {
            return z10;
        }
        return this.f30358F.z();
    }
}
