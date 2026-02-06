package com.facebook.react.views.text;

import L7.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.d0;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.M;
import com.facebook.yoga.p;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import j8.d;
import j8.f;
import j8.o;
import java.util.Comparator;
import s8.l;
import s8.q;

public class k extends C implements M {

    /* renamed from: n  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f42166n = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f42167a;

    /* renamed from: b  reason: collision with root package name */
    private int f42168b;

    /* renamed from: c  reason: collision with root package name */
    private TextUtils.TruncateAt f42169c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42170d;

    /* renamed from: e  reason: collision with root package name */
    private float f42171e;

    /* renamed from: f  reason: collision with root package name */
    private float f42172f;

    /* renamed from: g  reason: collision with root package name */
    private float f42173g;

    /* renamed from: h  reason: collision with root package name */
    private int f42174h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f42175i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f42176j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f42177k;

    /* renamed from: l  reason: collision with root package name */
    private o f42178l = o.VISIBLE;

    /* renamed from: m  reason: collision with root package name */
    private Spannable f42179m;

    class a implements Comparator {
        a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public k(Context context) {
        super(context);
        g();
    }

    private void f() {
        if (!Float.isNaN(this.f42171e)) {
            setTextSize(0, this.f42171e);
        }
        if (!Float.isNaN(this.f42173g)) {
            super.setLetterSpacing(this.f42173g);
        }
    }

    private void g() {
        this.f42168b = a.e.API_PRIORITY_OTHER;
        this.f42170d = false;
        this.f42174h = 0;
        this.f42175i = false;
        this.f42176j = false;
        this.f42177k = false;
        this.f42169c = TextUtils.TruncateAt.END;
        this.f42171e = Float.NaN;
        this.f42172f = Float.NaN;
        this.f42173g = 0.0f;
        this.f42178l = o.VISIBLE;
        this.f42179m = null;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof d0) {
            return (ReactContext) ((d0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private static WritableMap h(int i10, int i11, int i12, int i13, int i14, int i15) {
        WritableMap createMap = Arguments.createMap();
        if (i10 == 8) {
            createMap.putString("visibility", "gone");
            createMap.putInt("index", i11);
        } else if (i10 == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i11);
            createMap.putDouble(BlockAlignment.LEFT, (double) G.f((float) i12));
            createMap.putDouble(VerticalAlignment.TOP, (double) G.f((float) i13));
            createMap.putDouble(BlockAlignment.RIGHT, (double) G.f((float) i14));
            createMap.putDouble(VerticalAlignment.BOTTOM, (double) G.f((float) i15));
        } else {
            createMap.putString("visibility", "unknown");
            createMap.putInt("index", i11);
        }
        return createMap;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (C1680b0.M(this)) {
            C1677a l10 = C1680b0.l(this);
            if (l10 instanceof G1.a) {
                if (((G1.a) l10).k(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f42179m;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        g();
        C3400a.n(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f42166n);
        super.setText((CharSequence) null);
        f();
        setGravity(8388659);
        setNumberOfLines(this.f42168b);
        setAdjustFontSizeToFit(this.f42170d);
        setLinkifyMask(this.f42174h);
        setTextIsSelectable(this.f42176j);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f42169c);
        setEnabled(true);
        if (i10 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        k();
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q a10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                if (a10.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void j(float f10, int i10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(G.f(f10), C3431y.POINT);
        }
        C3400a.r(this, d.values()[i10], xVar);
    }

    public void k() {
        TextUtils.TruncateAt truncateAt;
        if (this.f42168b == Integer.MAX_VALUE || this.f42170d) {
            truncateAt = null;
        } else {
            truncateAt = this.f42169c;
        }
        setEllipsize(truncateAt);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f42176j);
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q c10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                c10.c();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q d10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                d10.d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Throwable th2;
        int a10;
        c cVar = new c("ReactTextView.onDraw");
        try {
            if (this.f42170d && getSpanned() != null && this.f42177k) {
                this.f42177k = false;
                Spannable spanned = getSpanned();
                float width = (float) getWidth();
                p pVar = p.EXACTLY;
                float height = (float) getHeight();
                double d10 = (double) this.f42172f;
                int i10 = this.f42168b;
                boolean includeFontPadding = getIncludeFontPadding();
                int breakStrategy = getBreakStrategy();
                int hyphenationFrequency = getHyphenationFrequency();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (Build.VERSION.SDK_INT < 26) {
                    a10 = -1;
                } else {
                    a10 = getJustificationMode();
                }
                q.a(spanned, width, pVar, height, pVar, d10, i10, includeFontPadding, breakStrategy, hyphenationFrequency, alignment, a10, getPaint());
                setText(getSpanned());
            }
            if (this.f42178l != o.VISIBLE) {
                C3400a.a(this, canvas);
            }
            super.onDraw(canvas);
            cVar.close();
            return;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th2;
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q e10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                e10.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
        if (r5 != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r23.getId()
            java.lang.CharSequence r2 = r23.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x01a4
            int r2 = f8.C3519a.a(r1)
            r3 = 2
            if (r2 != r3) goto L_0x0017
            goto L_0x01a4
        L_0x0017:
            com.facebook.react.bridge.ReactContext r2 = r23.getReactContext()
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r3 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r2 = r2.getNativeModule(r3)
            com.facebook.react.uimanager.UIManagerModule r2 = (com.facebook.react.uimanager.UIManagerModule) r2
            java.lang.Object r2 = n7.C3863a.c(r2)
            com.facebook.react.uimanager.UIManagerModule r2 = (com.facebook.react.uimanager.UIManagerModule) r2
            java.lang.CharSequence r3 = r23.getText()
            android.text.Spanned r3 = (android.text.Spanned) r3
            android.text.Layout r4 = r23.getLayout()
            if (r4 != 0) goto L_0x0036
            return
        L_0x0036:
            int r5 = r3.length()
            java.lang.Class<s8.r> r6 = s8.r.class
            r7 = 0
            java.lang.Object[] r5 = r3.getSpans(r7, r5, r6)
            s8.r[] r5 = (s8.r[]) r5
            boolean r6 = r0.f42175i
            if (r6 == 0) goto L_0x004e
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r5.length
            r6.<init>(r8)
            goto L_0x004f
        L_0x004e:
            r6 = 0
        L_0x004f:
            int r8 = r27 - r25
            int r9 = r28 - r26
            int r10 = r5.length
            r11 = r7
        L_0x0055:
            if (r11 >= r10) goto L_0x016c
            r12 = r5[r11]
            int r13 = r12.b()
            android.view.View r13 = r2.resolveView(r13)
            int r15 = r3.getSpanStart(r12)
            int r14 = r4.getLineForOffset(r15)
            int r16 = r4.getEllipsisCount(r14)
            if (r16 <= 0) goto L_0x0088
            int r16 = r4.getLineStart(r14)
            int r17 = r4.getEllipsisStart(r14)
            int r7 = r16 + r17
            if (r15 >= r7) goto L_0x007c
            goto L_0x0088
        L_0x007c:
            r21 = r1
            r22 = r3
            r20 = r5
            r28 = r10
            r1 = 8
            goto L_0x0147
        L_0x0088:
            int r7 = r0.f42168b
            if (r14 >= r7) goto L_0x007c
            int r7 = r4.getLineEnd(r14)
            if (r15 < r7) goto L_0x0093
            goto L_0x007c
        L_0x0093:
            int r7 = r12.c()
            int r12 = r12.a()
            r20 = r5
            boolean r5 = r4.isRtlCharAt(r15)
            r28 = r10
            int r10 = r4.getParagraphDirection(r14)
            r21 = r1
            r1 = -1
            r16 = 1
            if (r10 != r1) goto L_0x00b1
            r1 = r16
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            int r10 = r3.length()
            int r10 = r10 + -1
            if (r15 != r10) goto L_0x00e7
            int r10 = r3.length()
            if (r10 <= 0) goto L_0x00d5
            int r10 = r4.getLineEnd(r14)
            int r10 = r10 + -1
            char r10 = r3.charAt(r10)
            r22 = r3
            r3 = 10
            if (r10 != r3) goto L_0x00d7
            float r3 = r4.getLineMax(r14)
            goto L_0x00db
        L_0x00d5:
            r22 = r3
        L_0x00d7:
            float r3 = r4.getLineWidth(r14)
        L_0x00db:
            if (r1 == 0) goto L_0x00e1
            int r1 = (int) r3
            int r1 = r8 - r1
            goto L_0x0105
        L_0x00e1:
            float r1 = r4.getLineRight(r14)
            int r1 = (int) r1
            goto L_0x0104
        L_0x00e7:
            r22 = r3
            if (r1 != r5) goto L_0x00f1
            float r3 = r4.getPrimaryHorizontal(r15)
        L_0x00ef:
            int r3 = (int) r3
            goto L_0x00f6
        L_0x00f1:
            float r3 = r4.getSecondaryHorizontal(r15)
            goto L_0x00ef
        L_0x00f6:
            if (r1 == 0) goto L_0x0101
            float r1 = r4.getLineRight(r14)
            int r1 = (int) r1
            int r1 = r1 - r3
            int r1 = r8 - r1
            goto L_0x0102
        L_0x0101:
            r1 = r3
        L_0x0102:
            if (r5 == 0) goto L_0x0105
        L_0x0104:
            int r1 = r1 - r7
        L_0x0105:
            if (r5 == 0) goto L_0x010d
            int r3 = r23.getTotalPaddingRight()
        L_0x010b:
            int r1 = r1 + r3
            goto L_0x0112
        L_0x010d:
            int r3 = r23.getTotalPaddingLeft()
            goto L_0x010b
        L_0x0112:
            int r3 = r25 + r1
            int r5 = r23.getTotalPaddingTop()
            int r10 = r4.getLineBaseline(r14)
            int r5 = r5 + r10
            int r5 = r5 - r12
            int r10 = r26 + r5
            if (r8 <= r1) goto L_0x0127
            if (r9 > r5) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r14 = 0
            goto L_0x0129
        L_0x0127:
            r14 = 8
        L_0x0129:
            int r1 = r3 + r7
            int r5 = r10 + r12
            r13.setVisibility(r14)
            r13.layout(r3, r10, r1, r5)
            boolean r7 = r0.f42175i
            if (r7 == 0) goto L_0x015f
            r16 = r3
            r17 = r10
            r18 = r1
            r19 = r5
            com.facebook.react.bridge.WritableMap r1 = h(r14, r15, r16, r17, r18, r19)
            r6.add(r1)
            goto L_0x015f
        L_0x0147:
            r13.setVisibility(r1)
            boolean r1 = r0.f42175i
            if (r1 == 0) goto L_0x015f
            r18 = -1
            r19 = -1
            r14 = 8
            r16 = -1
            r17 = -1
            com.facebook.react.bridge.WritableMap r1 = h(r14, r15, r16, r17, r18, r19)
            r6.add(r1)
        L_0x015f:
            int r11 = r11 + 1
            r10 = r28
            r5 = r20
            r1 = r21
            r3 = r22
            r7 = 0
            goto L_0x0055
        L_0x016c:
            r21 = r1
            boolean r1 = r0.f42175i
            if (r1 == 0) goto L_0x01a4
            com.facebook.react.views.text.k$a r1 = new com.facebook.react.views.text.k$a
            r1.<init>()
            java.util.Collections.sort(r6, r1)
            com.facebook.react.bridge.WritableArray r1 = com.facebook.react.bridge.Arguments.createArray()
            java.util.Iterator r3 = r6.iterator()
        L_0x0182:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0192
            java.lang.Object r4 = r3.next()
            com.facebook.react.bridge.WritableMap r4 = (com.facebook.react.bridge.WritableMap) r4
            r1.pushMap(r4)
            goto L_0x0182
        L_0x0192:
            com.facebook.react.bridge.WritableMap r3 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r4 = "inlineViews"
            r3.putArray(r4, r1)
            if (r2 == 0) goto L_0x01a4
            java.lang.String r1 = "topInlineViewLayout"
            r4 = r21
            r2.receiveEvent(r4, r1, r3)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.k.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        c cVar = new c("ReactTextView.onMeasure");
        try {
            super.onMeasure(i10, i11);
            cVar.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q f10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                f10.f();
            }
        }
    }

    public int reactTagForTouch(float f10, float f11) {
        int i10;
        CharSequence text = getText();
        int id2 = getId();
        int i11 = (int) f10;
        int i12 = (int) f11;
        Layout layout = getLayout();
        if (layout == null) {
            return id2;
        }
        int lineForVertical = layout.getLineForVertical(i12);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i11 >= lineLeft && i11 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i11);
                l[] lVarArr = (l[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, l.class);
                if (lVarArr != null) {
                    int length = text.length();
                    for (int i13 = 0; i13 < lVarArr.length; i13++) {
                        int spanStart = spanned.getSpanStart(lVarArr[i13]);
                        int spanEnd = spanned.getSpanEnd(lVarArr[i13]);
                        if (spanEnd >= offsetForHorizontal && (i10 = spanEnd - spanStart) <= length) {
                            id2 = lVarArr[i13].a();
                            length = i10;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                U5.a.m("ReactNative", "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
            }
        }
        return id2;
    }

    public void setAdjustFontSizeToFit(boolean z10) {
        this.f42170d = z10;
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        j(f10, d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(this, fVar);
    }

    public void setBreakStrategy(int i10) {
        super.setBreakStrategy(i10);
        this.f42177k = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f42169c = truncateAt;
    }

    public void setFontSize(float f10) {
        double ceil;
        if (this.f42170d) {
            ceil = Math.ceil((double) G.j(f10));
        } else {
            ceil = Math.ceil((double) G.h(f10));
        }
        this.f42171e = (float) ceil;
        f();
    }

    /* access modifiers changed from: package-private */
    public void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = 8388611;
        }
        setGravity(i10 | (getGravity() & -8388616));
    }

    /* access modifiers changed from: package-private */
    public void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = 48;
        }
        setGravity(i10 | (getGravity() & -113));
    }

    public void setHyphenationFrequency(int i10) {
        super.setHyphenationFrequency(i10);
        this.f42177k = true;
    }

    public void setIncludeFontPadding(boolean z10) {
        super.setIncludeFontPadding(z10);
        this.f42177k = true;
    }

    public void setLetterSpacing(float f10) {
        if (!Float.isNaN(f10)) {
            this.f42173g = G.h(f10) / this.f42171e;
            f();
        }
    }

    public void setLinkifyMask(int i10) {
        this.f42174h = i10;
    }

    public void setMinimumFontSize(float f10) {
        this.f42172f = f10;
        this.f42177k = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z10) {
        this.f42175i = z10;
    }

    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        this.f42168b = i10;
        setMaxLines(i10);
        this.f42177k = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f42178l = o.VISIBLE;
        } else {
            o b10 = o.b(str);
            if (b10 == null) {
                b10 = o.VISIBLE;
            }
            this.f42178l = b10;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.f42179m = spannable;
        this.f42177k = true;
    }

    public void setText(g gVar) {
        c cVar = new c("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.f42167a = gVar.b();
            if (getLayoutParams() == null) {
                setLayoutParams(f42166n);
            }
            Spannable i10 = gVar.i();
            int i11 = this.f42174h;
            if (i11 > 0) {
                Linkify.addLinks(i10, i11);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(i10);
            float f10 = gVar.f();
            float h10 = gVar.h();
            float g10 = gVar.g();
            float e10 = gVar.e();
            if (!(f10 == -1.0f || h10 == -1.0f || g10 == -1.0f || e10 == -1.0f)) {
                setPadding((int) Math.floor((double) f10), (int) Math.floor((double) h10), (int) Math.floor((double) g10), (int) Math.floor((double) e10));
            }
            int j10 = gVar.j();
            if (j10 != getGravityHorizontal()) {
                setGravityHorizontal(j10);
            }
            if (getBreakStrategy() != gVar.k()) {
                setBreakStrategy(gVar.k());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != gVar.d()) {
                setJustificationMode(gVar.d());
            }
            requestLayout();
            cVar.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void setTextIsSelectable(boolean z10) {
        this.f42176j = z10;
        super.setTextIsSelectable(z10);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f42167a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (q a10 : (q[]) spanned.getSpans(0, spanned.length(), q.class)) {
                if (a10.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
