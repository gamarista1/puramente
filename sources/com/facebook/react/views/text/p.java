package com.facebook.react.views.text;

import U5.a;
import com.facebook.react.uimanager.G;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42214a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f42215b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    private float f42216c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    private float f42217d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f42218e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private float f42219f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    private r f42220g = r.UNSET;

    public p a(p pVar) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        p pVar2 = new p();
        pVar2.f42214a = this.f42214a;
        if (!Float.isNaN(pVar.f42215b)) {
            f10 = pVar.f42215b;
        } else {
            f10 = this.f42215b;
        }
        pVar2.f42215b = f10;
        if (!Float.isNaN(pVar.f42216c)) {
            f11 = pVar.f42216c;
        } else {
            f11 = this.f42216c;
        }
        pVar2.f42216c = f11;
        if (!Float.isNaN(pVar.f42217d)) {
            f12 = pVar.f42217d;
        } else {
            f12 = this.f42217d;
        }
        pVar2.f42217d = f12;
        if (!Float.isNaN(pVar.f42218e)) {
            f13 = pVar.f42218e;
        } else {
            f13 = this.f42218e;
        }
        pVar2.f42218e = f13;
        if (!Float.isNaN(pVar.f42219f)) {
            f14 = pVar.f42219f;
        } else {
            f14 = this.f42219f;
        }
        pVar2.f42219f = f14;
        r rVar = pVar.f42220g;
        if (rVar == r.UNSET) {
            rVar = this.f42220g;
        }
        pVar2.f42220g = rVar;
        return pVar2;
    }

    public boolean b() {
        return this.f42214a;
    }

    public int c() {
        float f10;
        double ceil;
        if (!Float.isNaN(this.f42215b)) {
            f10 = this.f42215b;
        } else {
            f10 = 14.0f;
        }
        if (this.f42214a) {
            ceil = Math.ceil((double) G.k(f10, f()));
        } else {
            ceil = Math.ceil((double) G.h(f10));
        }
        return (int) ceil;
    }

    public float d() {
        float f10;
        if (Float.isNaN(this.f42217d)) {
            return Float.NaN;
        }
        if (this.f42214a) {
            f10 = G.k(this.f42217d, f());
        } else {
            f10 = G.h(this.f42217d);
        }
        return f10 / ((float) c());
    }

    public float e() {
        float f10;
        if (Float.isNaN(this.f42216c)) {
            return Float.NaN;
        }
        if (this.f42214a) {
            f10 = G.k(this.f42216c, f());
        } else {
            f10 = G.h(this.f42216c);
        }
        if (Float.isNaN(this.f42219f)) {
            return f10;
        }
        float f11 = this.f42219f;
        if (f11 > f10) {
            return f11;
        }
        return f10;
    }

    public float f() {
        if (!Float.isNaN(this.f42218e)) {
            return this.f42218e;
        }
        return 0.0f;
    }

    public float g() {
        return this.f42215b;
    }

    public float h() {
        return this.f42219f;
    }

    public float i() {
        return this.f42217d;
    }

    public float j() {
        return this.f42216c;
    }

    public float k() {
        return this.f42218e;
    }

    public r l() {
        return this.f42220g;
    }

    public void m(boolean z10) {
        this.f42214a = z10;
    }

    public void n(float f10) {
        this.f42215b = f10;
    }

    public void o(float f10) {
        this.f42219f = f10;
    }

    public void p(float f10) {
        this.f42217d = f10;
    }

    public void q(float f10) {
        this.f42216c = f10;
    }

    public void r(float f10) {
        if (f10 == 0.0f || f10 >= 1.0f) {
            this.f42218e = f10;
            return;
        }
        a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
        this.f42218e = Float.NaN;
    }

    public void s(r rVar) {
        this.f42220g = rVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
