package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.G;
import e8.C3501b;
import kotlin.jvm.internal.C6496s;

public final class p extends C3428v {

    /* renamed from: a  reason: collision with root package name */
    private n f60041a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f60042b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f60043c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60044d;

    public p() {
        int[] iArr = F0.f41412c;
        this.f60042b = new float[iArr.length];
        this.f60043c = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f60042b[i10] = Float.NaN;
            this.f60043c[i10] = Float.NaN;
        }
    }

    private final float g(l lVar, float f10, float f11) {
        if (lVar == l.OFF) {
            return f11;
        }
        if (lVar == l.MAXIMUM) {
            return Math.max(f10, f11);
        }
        return f10 + f11;
    }

    private final void h(o oVar) {
        if (oVar == o.PADDING) {
            super.setPadding(1, this.f60042b[1]);
            super.setPadding(2, this.f60042b[1]);
            super.setPadding(3, this.f60042b[3]);
            super.setPadding(0, this.f60042b[0]);
        } else {
            super.setMargin(1, this.f60043c[1]);
            super.setMargin(2, this.f60043c[1]);
            super.setMargin(3, this.f60043c[3]);
            super.setMargin(0, this.f60043c[0]);
        }
        markUpdated();
    }

    private final void i() {
        float[] fArr;
        n nVar = this.f60041a;
        if (nVar != null) {
            o c10 = nVar.c();
            o oVar = o.PADDING;
            if (c10 == oVar) {
                fArr = this.f60042b;
            } else {
                fArr = this.f60043c;
            }
            float f10 = fArr[8];
            if (Float.isNaN(f10)) {
                f10 = 0.0f;
            }
            float f11 = f10;
            float f12 = f11;
            float f13 = f12;
            float f14 = fArr[7];
            if (!Float.isNaN(f14)) {
                f10 = f14;
                f12 = f10;
            }
            float f15 = fArr[6];
            if (!Float.isNaN(f15)) {
                f11 = f15;
                f13 = f11;
            }
            float f16 = fArr[1];
            if (!Float.isNaN(f16)) {
                f10 = f16;
            }
            float f17 = fArr[2];
            if (!Float.isNaN(f17)) {
                f11 = f17;
            }
            float f18 = fArr[3];
            if (!Float.isNaN(f18)) {
                f12 = f18;
            }
            float f19 = fArr[0];
            if (!Float.isNaN(f19)) {
                f13 = f19;
            }
            float h10 = G.h(f10);
            float h11 = G.h(f11);
            float h12 = G.h(f12);
            float h13 = G.h(f13);
            m a10 = nVar.a();
            a b10 = nVar.b();
            if (nVar.c() == oVar) {
                super.setPadding(1, g(a10.d(), b10.d(), h10));
                super.setPadding(2, g(a10.c(), b10.c(), h11));
                super.setPadding(3, g(a10.a(), b10.a(), h12));
                super.setPadding(0, g(a10.b(), b10.b(), h13));
                return;
            }
            super.setMargin(1, g(a10.d(), b10.d(), h10));
            super.setMargin(2, g(a10.c(), b10.c(), h11));
            super.setMargin(3, g(a10.a(), b10.a(), h12));
            super.setMargin(0, g(a10.b(), b10.b(), h13));
        }
    }

    public void onBeforeLayout(D d10) {
        C6496s.h(d10, "nativeViewHierarchyOptimizer");
        if (this.f60044d) {
            this.f60044d = false;
            i();
        }
    }

    public void setLocalData(Object obj) {
        C6496s.h(obj, "data");
        if (obj instanceof n) {
            n nVar = this.f60041a;
            if (!(nVar == null || nVar.c() == ((n) obj).c())) {
                h(nVar.c());
            }
            this.f60041a = (n) obj;
            this.f60044d = false;
            i();
        }
    }

    @C3501b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        float f10;
        C6496s.h(dynamic, "margin");
        int i11 = F0.f41412c[i10];
        float[] fArr = this.f60043c;
        if (dynamic.getType() == ReadableType.Number) {
            f10 = (float) dynamic.asDouble();
        } else {
            f10 = Float.NaN;
        }
        fArr[i11] = f10;
        super.setMargins(i10, dynamic);
        this.f60044d = true;
    }

    @C3501b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        float f10;
        C6496s.h(dynamic, "padding");
        int i11 = F0.f41412c[i10];
        float[] fArr = this.f60042b;
        if (dynamic.getType() == ReadableType.Number) {
            f10 = (float) dynamic.asDouble();
        } else {
            f10 = Float.NaN;
        }
        fArr[i11] = f10;
        super.setPaddings(i10, dynamic);
        this.f60044d = true;
    }
}
