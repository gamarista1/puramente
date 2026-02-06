package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.s0;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.r;
import e8.C3500a;
import java.util.ArrayList;
import java.util.Map;
import n7.C3863a;

public class f extends c {
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public static final TextPaint f42129F = new TextPaint(1);
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public Spannable f42130B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public boolean f42131C;

    /* renamed from: D  reason: collision with root package name */
    private final o f42132D = new a();

    /* renamed from: E  reason: collision with root package name */
    private final com.facebook.yoga.b f42133E = new b();

    class a implements o {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0168, code lost:
            if (r2 > r21) goto L_0x016a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a(com.facebook.yoga.r r18, float r19, com.facebook.yoga.p r20, float r21, com.facebook.yoga.p r22) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                r2 = r20
                r3 = r22
                com.facebook.react.views.text.f r4 = com.facebook.react.views.text.f.this
                android.text.Spannable r4 = r4.f42130B
                java.lang.String r5 = "Spannable element has not been prepared in onBeforeLayout"
                java.lang.Object r4 = n7.C3863a.d(r4, r5)
                android.text.Spannable r4 = (android.text.Spannable) r4
                com.facebook.react.views.text.f r5 = com.facebook.react.views.text.f.this
                android.text.Layout r5 = r5.o(r4, r1, r2)
                com.facebook.react.views.text.f r6 = com.facebook.react.views.text.f.this
                boolean r7 = r6.f42118t
                r8 = -1
                r9 = 0
                r10 = 1
                if (r7 == 0) goto L_0x00ba
                com.facebook.react.views.text.p r6 = r6.f42099a
                int r6 = r6.c()
                com.facebook.react.views.text.f r7 = com.facebook.react.views.text.f.this
                com.facebook.react.views.text.p r7 = r7.f42099a
                int r7 = r7.c()
                com.facebook.react.views.text.f r11 = com.facebook.react.views.text.f.this
                float r11 = r11.f42119u
                float r6 = (float) r6
                float r11 = r11 * r6
                r12 = 1082130432(0x40800000, float:4.0)
                float r12 = com.facebook.react.uimanager.G.h(r12)
                float r11 = java.lang.Math.max(r11, r12)
                int r11 = (int) r11
            L_0x0044:
                if (r7 <= r11) goto L_0x00ba
                com.facebook.react.views.text.f r12 = com.facebook.react.views.text.f.this
                int r12 = r12.f42106h
                if (r12 == r8) goto L_0x0056
                int r12 = r5.getLineCount()
                com.facebook.react.views.text.f r13 = com.facebook.react.views.text.f.this
                int r13 = r13.f42106h
                if (r12 > r13) goto L_0x0063
            L_0x0056:
                com.facebook.yoga.p r12 = com.facebook.yoga.p.UNDEFINED
                if (r3 == r12) goto L_0x00ba
                int r12 = r5.getHeight()
                float r12 = (float) r12
                int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
                if (r12 <= 0) goto L_0x00ba
            L_0x0063:
                r5 = 1065353216(0x3f800000, float:1.0)
                float r5 = com.facebook.react.uimanager.G.h(r5)
                int r5 = (int) r5
                int r5 = java.lang.Math.max(r10, r5)
                int r7 = r7 - r5
                float r5 = (float) r7
                float r5 = r5 / r6
                int r12 = r4.length()
                java.lang.Class<s8.e> r13 = s8.C3996e.class
                java.lang.Object[] r12 = r4.getSpans(r9, r12, r13)
                s8.e[] r12 = (s8.C3996e[]) r12
                int r13 = r12.length
                r14 = r9
            L_0x007f:
                if (r14 >= r13) goto L_0x00b0
                r15 = r12[r14]
                s8.e r9 = new s8.e
                int r10 = r15.getSize()
                float r10 = (float) r10
                float r10 = r10 * r5
                float r8 = (float) r11
                float r8 = java.lang.Math.max(r10, r8)
                int r8 = (int) r8
                r9.<init>(r8)
                int r8 = r4.getSpanStart(r15)
                int r10 = r4.getSpanEnd(r15)
                r16 = r5
                int r5 = r4.getSpanFlags(r15)
                r4.setSpan(r9, r8, r10, r5)
                r4.removeSpan(r15)
                int r14 = r14 + 1
                r5 = r16
                r8 = -1
                r9 = 0
                r10 = 1
                goto L_0x007f
            L_0x00b0:
                com.facebook.react.views.text.f r5 = com.facebook.react.views.text.f.this
                android.text.Layout r5 = r5.o(r4, r1, r2)
                r8 = -1
                r9 = 0
                r10 = 1
                goto L_0x0044
            L_0x00ba:
                com.facebook.react.views.text.f r6 = com.facebook.react.views.text.f.this
                boolean r6 = r6.f42131C
                if (r6 == 0) goto L_0x00ff
                com.facebook.react.views.text.f r6 = com.facebook.react.views.text.f.this
                com.facebook.react.uimanager.h0 r6 = r6.getThemedContext()
                android.text.TextPaint r7 = com.facebook.react.views.text.f.f42129F
                com.facebook.react.bridge.WritableArray r7 = com.facebook.react.views.text.b.a(r4, r5, r7, r6)
                com.facebook.react.bridge.WritableMap r8 = com.facebook.react.bridge.Arguments.createMap()
                java.lang.String r9 = "lines"
                r8.putArray(r9, r7)
                boolean r7 = r6.hasActiveReactInstance()
                if (r7 == 0) goto L_0x00f3
                java.lang.Class<com.facebook.react.uimanager.events.RCTEventEmitter> r7 = com.facebook.react.uimanager.events.RCTEventEmitter.class
                com.facebook.react.bridge.JavaScriptModule r6 = r6.getJSModule(r7)
                com.facebook.react.uimanager.events.RCTEventEmitter r6 = (com.facebook.react.uimanager.events.RCTEventEmitter) r6
                com.facebook.react.views.text.f r7 = com.facebook.react.views.text.f.this
                int r7 = r7.getReactTag()
                java.lang.String r9 = "topTextLayout"
                r6.receiveEvent(r7, r9, r8)
                goto L_0x00ff
            L_0x00f3:
                com.facebook.react.bridge.ReactNoCrashSoftException r6 = new com.facebook.react.bridge.ReactNoCrashSoftException
                java.lang.String r7 = "Cannot get RCTEventEmitter, no CatalystInstance"
                r6.<init>((java.lang.String) r7)
                java.lang.String r7 = "ReactTextShadowNode"
                com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r7, r6)
            L_0x00ff:
                com.facebook.react.views.text.f r6 = com.facebook.react.views.text.f.this
                int r6 = r6.f42106h
                r7 = -1
                if (r6 != r7) goto L_0x010b
                int r6 = r5.getLineCount()
                goto L_0x0113
            L_0x010b:
                int r7 = r5.getLineCount()
                int r6 = java.lang.Math.min(r6, r7)
            L_0x0113:
                com.facebook.yoga.p r7 = com.facebook.yoga.p.EXACTLY
                if (r2 != r7) goto L_0x0118
                goto L_0x014b
            L_0x0118:
                r7 = 0
                r9 = 0
            L_0x011a:
                if (r9 >= r6) goto L_0x0141
                int r8 = r4.length()
                if (r8 <= 0) goto L_0x0135
                int r8 = r5.getLineEnd(r9)
                r10 = 1
                int r8 = r8 - r10
                char r8 = r4.charAt(r8)
                r10 = 10
                if (r8 != r10) goto L_0x0135
                float r8 = r5.getLineMax(r9)
                goto L_0x0139
            L_0x0135:
                float r8 = r5.getLineWidth(r9)
            L_0x0139:
                int r10 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x013e
                r7 = r8
            L_0x013e:
                int r9 = r9 + 1
                goto L_0x011a
            L_0x0141:
                com.facebook.yoga.p r4 = com.facebook.yoga.p.AT_MOST
                if (r2 != r4) goto L_0x014a
                int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x014a
                goto L_0x014b
            L_0x014a:
                r1 = r7
            L_0x014b:
                int r2 = android.os.Build.VERSION.SDK_INT
                r4 = 29
                if (r2 <= r4) goto L_0x0157
                double r1 = (double) r1
                double r1 = java.lang.Math.ceil(r1)
                float r1 = (float) r1
            L_0x0157:
                com.facebook.yoga.p r2 = com.facebook.yoga.p.EXACTLY
                if (r3 == r2) goto L_0x016a
                r2 = 1
                int r6 = r6 - r2
                int r2 = r5.getLineBottom(r6)
                float r2 = (float) r2
                com.facebook.yoga.p r4 = com.facebook.yoga.p.AT_MOST
                if (r3 != r4) goto L_0x016c
                int r3 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
                if (r3 <= 0) goto L_0x016c
            L_0x016a:
                r2 = r21
            L_0x016c:
                long r1 = com.facebook.yoga.q.a(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.f.a.a(com.facebook.yoga.r, float, com.facebook.yoga.p, float, com.facebook.yoga.p):long");
        }
    }

    class b implements com.facebook.yoga.b {
        b() {
        }

        public float a(r rVar, float f10, float f11) {
            Layout k10 = f.this.o((Spannable) C3863a.d(f.this.f42130B, "Spannable element has not been prepared in onBeforeLayout"), f10, p.EXACTLY);
            return (float) k10.getLineBaseline(k10.getLineCount() - 1);
        }
    }

    public f(l lVar) {
        super(lVar);
        n();
    }

    private int m() {
        int i10 = this.f42107i;
        if (getLayoutDirection() != h.RTL) {
            return i10;
        }
        if (i10 == 5) {
            return 3;
        }
        if (i10 == 3) {
            return 5;
        }
        return i10;
    }

    private void n() {
        if (!isVirtual()) {
            setMeasureFunction(this.f42132D);
            setBaselineFunction(this.f42133E);
        }
    }

    /* access modifiers changed from: private */
    public Layout o(Spannable spannable, float f10, p pVar) {
        float f11;
        boolean z10;
        TextPaint textPaint = f42129F;
        textPaint.setTextSize((float) this.f42099a.c());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        if (isBoring == null) {
            f11 = Layout.getDesiredWidth(spannable, textPaint);
        } else {
            f11 = Float.NaN;
        }
        if (pVar == p.UNDEFINED || f10 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int m10 = m();
        if (m10 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (m10 != 3 && m10 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z10 || (!g.a(f11) && f11 <= f10))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil((double) f11)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f42117s).setBreakStrategy(this.f42108j).setHyphenationFrequency(this.f42109k);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                StaticLayout.Builder unused = hyphenationFrequency.setJustificationMode(this.f42110l);
            }
            if (i10 >= 28) {
                StaticLayout.Builder unused2 = hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring == null || (!z10 && ((float) isBoring.width) > f10)) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 > 29) {
                f10 = (float) Math.ceil((double) f10);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f10).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f42117s).setBreakStrategy(this.f42108j).setHyphenationFrequency(this.f42109k);
            if (i11 >= 26) {
                StaticLayout.Builder unused3 = hyphenationFrequency2.setJustificationMode(this.f42110l);
            }
            if (i11 >= 28) {
                StaticLayout.Builder unused4 = hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        } else {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, 0.0f, isBoring, this.f42117s);
        }
    }

    public Iterable calculateLayoutOnChildren() {
        Map map = this.f42098A;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) C3863a.d(this.f42130B, "Spannable element has not been prepared in onBeforeLayout");
        s8.r[] rVarArr = (s8.r[]) spanned.getSpans(0, spanned.length(), s8.r.class);
        ArrayList arrayList = new ArrayList(rVarArr.length);
        for (s8.r b10 : rVarArr) {
            U u10 = (U) this.f42098A.get(Integer.valueOf(b10.b()));
            u10.calculateLayout();
            arrayList.add(u10);
        }
        return arrayList;
    }

    public boolean hoistNativeChildren() {
        return true;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    public void onBeforeLayout(D d10) {
        this.f42130B = h(this, (String) null, true, d10);
        markUpdated();
    }

    public void onCollectExtraUpdates(s0 s0Var) {
        super.onCollectExtraUpdates(s0Var);
        if (this.f42130B != null) {
            s0Var.O(getReactTag(), new g(this.f42130B, -1, this.f42124z, getPadding(4), getPadding(1), getPadding(5), getPadding(3), m(), this.f42108j, this.f42110l));
        }
    }

    @C3500a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z10) {
        this.f42131C = z10;
    }
}
