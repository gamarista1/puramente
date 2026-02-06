package h8;

import Af.a;
import Ef.m;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.G;
import j8.C3643a;
import j8.c;
import j8.e;
import j8.i;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: h8.a  reason: case insensitive filesystem */
public final class C3582a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44021a;

    /* renamed from: b  reason: collision with root package name */
    private e f44022b;

    /* renamed from: c  reason: collision with root package name */
    private c f44023c;

    /* renamed from: d  reason: collision with root package name */
    private final float f44024d = 0.8f;

    /* renamed from: e  reason: collision with root package name */
    private RectF f44025e;

    /* renamed from: f  reason: collision with root package name */
    private i f44026f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f44027g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f44028h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f44029i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    private Path f44030j;

    /* renamed from: k  reason: collision with root package name */
    private List f44031k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f44032l;

    public C3582a(Context context, e eVar, c cVar) {
        C6496s.h(context, "context");
        this.f44021a = context;
        this.f44022b = eVar;
        this.f44023c = cVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f44028h);
        this.f44032l = paint;
    }

    private final RectF a() {
        RectF rectF;
        float f10;
        float f11;
        float f12;
        c cVar = this.f44023c;
        if (cVar != null) {
            rectF = cVar.a(getLayoutDirection(), this.f44021a);
        } else {
            rectF = null;
        }
        float f13 = 0.0f;
        if (rectF != null) {
            f10 = G.f41415a.b(rectF.left);
        } else {
            f10 = 0.0f;
        }
        if (rectF != null) {
            f11 = G.f41415a.b(rectF.top);
        } else {
            f11 = 0.0f;
        }
        if (rectF != null) {
            f12 = G.f41415a.b(rectF.right);
        } else {
            f12 = 0.0f;
        }
        if (rectF != null) {
            f13 = G.f41415a.b(rectF.bottom);
        }
        return new RectF(f10, f11, f12, f13);
    }

    private final Shader c() {
        List<C3643a> list = this.f44031k;
        ComposeShader composeShader = null;
        if (list != null) {
            for (C3643a a10 : list) {
                Rect bounds = getBounds();
                C6496s.g(bounds, "getBounds(...)");
                Shader a11 = a10.a(bounds);
                if (a11 != null) {
                    if (composeShader == null) {
                        composeShader = a11;
                    } else {
                        composeShader = new ComposeShader(a11, composeShader, PorterDuff.Mode.SRC_OVER);
                    }
                }
            }
        }
        return composeShader;
    }

    private final float d(Float f10, Float f11) {
        float f12;
        float f13;
        if (f10 != null) {
            f12 = f10.floatValue();
        } else {
            f12 = 0.0f;
        }
        if (f11 != null) {
            f13 = f11.floatValue();
        } else {
            f13 = 0.0f;
        }
        return m.c(f12 - f13, 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        if (kotlin.jvm.internal.C6496s.b(r2, 0.0f) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r13 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r13.f44027g
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            r13.f44027g = r1
            android.graphics.RectF r2 = r13.a()
            r13.f44025e = r2
            j8.e r2 = r13.f44022b
            r3 = 0
            if (r2 == 0) goto L_0x0039
            int r4 = r13.getLayoutDirection()
            android.content.Context r5 = r13.f44021a
            com.facebook.react.uimanager.G r6 = com.facebook.react.uimanager.G.f41415a
            android.graphics.Rect r7 = r13.getBounds()
            int r7 = r7.width()
            float r7 = r6.e(r7)
            android.graphics.Rect r8 = r13.getBounds()
            int r8 = r8.height()
            float r6 = r6.e(r8)
            j8.i r2 = r2.d(r4, r5, r7, r6)
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            r13.f44026f = r2
            if (r2 == 0) goto L_0x005c
            boolean r2 = r2.e()
            if (r2 != r0) goto L_0x005c
            j8.i r2 = r13.f44026f
            if (r2 == 0) goto L_0x005c
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x005c
            android.graphics.Path r2 = r13.f44030j
            if (r2 != 0) goto L_0x0057
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
        L_0x0057:
            r13.f44030j = r2
            r2.reset()
        L_0x005c:
            android.graphics.RectF r2 = r13.f44025e
            r4 = 0
            if (r2 == 0) goto L_0x00aa
            if (r2 == 0) goto L_0x006a
            float r2 = r2.left
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x006b
        L_0x006a:
            r2 = r3
        L_0x006b:
            boolean r2 = kotlin.jvm.internal.C6496s.b(r2, r4)
            if (r2 == 0) goto L_0x00a7
            android.graphics.RectF r2 = r13.f44025e
            if (r2 == 0) goto L_0x007c
            float r2 = r2.top
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x007d
        L_0x007c:
            r2 = r3
        L_0x007d:
            boolean r2 = kotlin.jvm.internal.C6496s.b(r2, r4)
            if (r2 == 0) goto L_0x00a7
            android.graphics.RectF r2 = r13.f44025e
            if (r2 == 0) goto L_0x008e
            float r2 = r2.right
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            boolean r2 = kotlin.jvm.internal.C6496s.b(r2, r4)
            if (r2 == 0) goto L_0x00a7
            android.graphics.RectF r2 = r13.f44025e
            if (r2 == 0) goto L_0x00a0
            float r2 = r2.bottom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x00a1
        L_0x00a0:
            r2 = r3
        L_0x00a1:
            boolean r2 = kotlin.jvm.internal.C6496s.b(r2, r4)
            if (r2 != 0) goto L_0x00aa
        L_0x00a7:
            float r2 = r13.f44024d
            goto L_0x00ab
        L_0x00aa:
            r2 = r4
        L_0x00ab:
            android.graphics.RectF r5 = r13.f44029i
            android.graphics.Rect r6 = r13.getBounds()
            int r6 = r6.left
            float r6 = (float) r6
            android.graphics.RectF r7 = r13.f44025e
            if (r7 == 0) goto L_0x00bb
            float r7 = r7.left
            goto L_0x00bc
        L_0x00bb:
            r7 = r4
        L_0x00bc:
            float r6 = r6 + r7
            float r6 = r6 - r2
            r5.left = r6
            android.graphics.RectF r5 = r13.f44029i
            android.graphics.Rect r6 = r13.getBounds()
            int r6 = r6.top
            float r6 = (float) r6
            android.graphics.RectF r7 = r13.f44025e
            if (r7 == 0) goto L_0x00d0
            float r7 = r7.top
            goto L_0x00d1
        L_0x00d0:
            r7 = r4
        L_0x00d1:
            float r6 = r6 + r7
            float r6 = r6 - r2
            r5.top = r6
            android.graphics.RectF r5 = r13.f44029i
            android.graphics.Rect r6 = r13.getBounds()
            int r6 = r6.right
            float r6 = (float) r6
            android.graphics.RectF r7 = r13.f44025e
            if (r7 == 0) goto L_0x00e5
            float r7 = r7.right
            goto L_0x00e6
        L_0x00e5:
            r7 = r4
        L_0x00e6:
            float r6 = r6 - r7
            float r6 = r6 + r2
            r5.right = r6
            android.graphics.RectF r5 = r13.f44029i
            android.graphics.Rect r6 = r13.getBounds()
            int r6 = r6.bottom
            float r6 = (float) r6
            android.graphics.RectF r7 = r13.f44025e
            if (r7 == 0) goto L_0x00f9
            float r4 = r7.bottom
        L_0x00f9:
            float r6 = r6 - r4
            float r6 = r6 + r2
            r5.bottom = r6
            j8.e r2 = r13.f44022b
            if (r2 == 0) goto L_0x0286
            boolean r2 = r2.c()
            if (r2 != r0) goto L_0x0286
            j8.i r2 = r13.f44026f
            if (r2 == 0) goto L_0x0113
            boolean r2 = r2.f()
            if (r2 != r0) goto L_0x0113
            goto L_0x0286
        L_0x0113:
            j8.i r2 = r13.f44026f
            if (r2 == 0) goto L_0x012c
            j8.j r2 = r2.c()
            if (r2 == 0) goto L_0x012c
            float r2 = r2.a()
            com.facebook.react.uimanager.G r4 = com.facebook.react.uimanager.G.f41415a
            float r2 = r4.b(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x012d
        L_0x012c:
            r2 = r3
        L_0x012d:
            android.graphics.RectF r4 = r13.f44025e
            if (r4 == 0) goto L_0x0138
            float r4 = r4.left
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0139
        L_0x0138:
            r4 = r3
        L_0x0139:
            float r2 = r13.d(r2, r4)
            j8.i r4 = r13.f44026f
            if (r4 == 0) goto L_0x0156
            j8.j r4 = r4.c()
            if (r4 == 0) goto L_0x0156
            float r4 = r4.b()
            com.facebook.react.uimanager.G r5 = com.facebook.react.uimanager.G.f41415a
            float r4 = r5.b(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0157
        L_0x0156:
            r4 = r3
        L_0x0157:
            android.graphics.RectF r5 = r13.f44025e
            if (r5 == 0) goto L_0x0162
            float r5 = r5.top
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x0163
        L_0x0162:
            r5 = r3
        L_0x0163:
            float r4 = r13.d(r4, r5)
            j8.i r5 = r13.f44026f
            if (r5 == 0) goto L_0x0180
            j8.j r5 = r5.d()
            if (r5 == 0) goto L_0x0180
            float r5 = r5.a()
            com.facebook.react.uimanager.G r6 = com.facebook.react.uimanager.G.f41415a
            float r5 = r6.b(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x0181
        L_0x0180:
            r5 = r3
        L_0x0181:
            android.graphics.RectF r6 = r13.f44025e
            if (r6 == 0) goto L_0x018c
            float r6 = r6.right
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x018d
        L_0x018c:
            r6 = r3
        L_0x018d:
            float r5 = r13.d(r5, r6)
            j8.i r6 = r13.f44026f
            if (r6 == 0) goto L_0x01aa
            j8.j r6 = r6.d()
            if (r6 == 0) goto L_0x01aa
            float r6 = r6.b()
            com.facebook.react.uimanager.G r7 = com.facebook.react.uimanager.G.f41415a
            float r6 = r7.b(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x01ab
        L_0x01aa:
            r6 = r3
        L_0x01ab:
            android.graphics.RectF r7 = r13.f44025e
            if (r7 == 0) goto L_0x01b6
            float r7 = r7.top
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x01b7
        L_0x01b6:
            r7 = r3
        L_0x01b7:
            float r6 = r13.d(r6, r7)
            j8.i r7 = r13.f44026f
            if (r7 == 0) goto L_0x01d4
            j8.j r7 = r7.b()
            if (r7 == 0) goto L_0x01d4
            float r7 = r7.a()
            com.facebook.react.uimanager.G r8 = com.facebook.react.uimanager.G.f41415a
            float r7 = r8.b(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x01d5
        L_0x01d4:
            r7 = r3
        L_0x01d5:
            android.graphics.RectF r8 = r13.f44025e
            if (r8 == 0) goto L_0x01e0
            float r8 = r8.right
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x01e1
        L_0x01e0:
            r8 = r3
        L_0x01e1:
            float r7 = r13.d(r7, r8)
            j8.i r8 = r13.f44026f
            if (r8 == 0) goto L_0x01fe
            j8.j r8 = r8.b()
            if (r8 == 0) goto L_0x01fe
            float r8 = r8.b()
            com.facebook.react.uimanager.G r9 = com.facebook.react.uimanager.G.f41415a
            float r8 = r9.b(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x01ff
        L_0x01fe:
            r8 = r3
        L_0x01ff:
            android.graphics.RectF r9 = r13.f44025e
            if (r9 == 0) goto L_0x020a
            float r9 = r9.bottom
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            goto L_0x020b
        L_0x020a:
            r9 = r3
        L_0x020b:
            float r8 = r13.d(r8, r9)
            j8.i r9 = r13.f44026f
            if (r9 == 0) goto L_0x0228
            j8.j r9 = r9.a()
            if (r9 == 0) goto L_0x0228
            float r9 = r9.a()
            com.facebook.react.uimanager.G r10 = com.facebook.react.uimanager.G.f41415a
            float r9 = r10.b(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            goto L_0x0229
        L_0x0228:
            r9 = r3
        L_0x0229:
            android.graphics.RectF r10 = r13.f44025e
            if (r10 == 0) goto L_0x0234
            float r10 = r10.left
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            goto L_0x0235
        L_0x0234:
            r10 = r3
        L_0x0235:
            float r9 = r13.d(r9, r10)
            j8.i r10 = r13.f44026f
            if (r10 == 0) goto L_0x0252
            j8.j r10 = r10.a()
            if (r10 == 0) goto L_0x0252
            float r10 = r10.b()
            com.facebook.react.uimanager.G r11 = com.facebook.react.uimanager.G.f41415a
            float r10 = r11.b(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            goto L_0x0253
        L_0x0252:
            r10 = r3
        L_0x0253:
            android.graphics.RectF r11 = r13.f44025e
            if (r11 == 0) goto L_0x025d
            float r3 = r11.bottom
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L_0x025d:
            float r3 = r13.d(r10, r3)
            android.graphics.Path r10 = r13.f44030j
            if (r10 == 0) goto L_0x0286
            android.graphics.RectF r11 = r13.f44029i
            r12 = 8
            float[] r12 = new float[r12]
            r12[r1] = r2
            r12[r0] = r4
            r0 = 2
            r12[r0] = r5
            r0 = 3
            r12[r0] = r6
            r0 = 4
            r12[r0] = r7
            r0 = 5
            r12[r0] = r8
            r0 = 6
            r12[r0] = r9
            r0 = 7
            r12[r0] = r3
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r10.addRoundRect(r11, r12, r0)
        L_0x0286:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.C3582a.i():void");
    }

    public final int b() {
        return this.f44028h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r7.i()
            r8.save()
            android.graphics.Paint r0 = r7.f44032l
            int r0 = r0.getAlpha()
            java.lang.String r1 = "Required value was null."
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00aa
            j8.i r0 = r7.f44026f
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.f()
            if (r0 != r3) goto L_0x0087
            j8.e r0 = r7.f44022b
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.c()
            if (r0 != r3) goto L_0x0087
            j8.i r0 = r7.f44026f
            if (r0 == 0) goto L_0x0044
            j8.j r0 = r0.c()
            if (r0 == 0) goto L_0x0044
            float r0 = r0.a()
            com.facebook.react.uimanager.G r4 = com.facebook.react.uimanager.G.f41415a
            float r0 = r4.b(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            android.graphics.RectF r4 = r7.f44025e
            if (r4 == 0) goto L_0x0050
            float r4 = r4.left
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0051
        L_0x0050:
            r4 = r2
        L_0x0051:
            float r0 = r7.d(r0, r4)
            j8.i r4 = r7.f44026f
            if (r4 == 0) goto L_0x006e
            j8.j r4 = r4.c()
            if (r4 == 0) goto L_0x006e
            float r4 = r4.b()
            com.facebook.react.uimanager.G r5 = com.facebook.react.uimanager.G.f41415a
            float r4 = r5.b(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x006f
        L_0x006e:
            r4 = r2
        L_0x006f:
            android.graphics.RectF r5 = r7.f44025e
            if (r5 == 0) goto L_0x007a
            float r5 = r5.top
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x007b
        L_0x007a:
            r5 = r2
        L_0x007b:
            float r4 = r7.d(r4, r5)
            android.graphics.RectF r5 = r7.f44029i
            android.graphics.Paint r6 = r7.f44032l
            r8.drawRoundRect(r5, r0, r4, r6)
            goto L_0x00ac
        L_0x0087:
            j8.e r0 = r7.f44022b
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.c()
            if (r0 != r3) goto L_0x00a1
            android.graphics.Path r0 = r7.f44030j
            if (r0 == 0) goto L_0x009b
            android.graphics.Paint r4 = r7.f44032l
            r8.drawPath(r0, r4)
            goto L_0x00aa
        L_0x009b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L_0x00a1:
            android.graphics.Rect r0 = r7.getBounds()
            android.graphics.Paint r4 = r7.f44032l
            r8.drawRect(r0, r4)
        L_0x00aa:
            r0 = 0
            r4 = r0
        L_0x00ac:
            java.util.List r5 = r7.f44031k
            if (r5 == 0) goto L_0x0106
            if (r5 == 0) goto L_0x0106
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 != r3) goto L_0x0106
            android.graphics.Paint r5 = r7.f44032l
            android.graphics.Shader r6 = r7.c()
            r5.setShader(r6)
            j8.i r5 = r7.f44026f
            if (r5 == 0) goto L_0x00e0
            boolean r5 = r5.f()
            if (r5 != r3) goto L_0x00e0
            j8.e r5 = r7.f44022b
            if (r5 == 0) goto L_0x00e0
            boolean r5 = r5.c()
            if (r5 != r3) goto L_0x00e0
            android.graphics.RectF r1 = r7.f44029i
            android.graphics.Paint r3 = r7.f44032l
            r8.drawRoundRect(r1, r0, r4, r3)
            goto L_0x0101
        L_0x00e0:
            j8.e r0 = r7.f44022b
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.c()
            if (r0 != r3) goto L_0x00fa
            android.graphics.Path r0 = r7.f44030j
            if (r0 == 0) goto L_0x00f4
            android.graphics.Paint r1 = r7.f44032l
            r8.drawPath(r0, r1)
            goto L_0x0101
        L_0x00f4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L_0x00fa:
            android.graphics.RectF r0 = r7.f44029i
            android.graphics.Paint r1 = r7.f44032l
            r8.drawRect(r0, r1)
        L_0x0101:
            android.graphics.Paint r0 = r7.f44032l
            r0.setShader(r2)
        L_0x0106:
            r8.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.C3582a.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10) {
        if (this.f44028h != i10) {
            this.f44028h = i10;
            this.f44032l.setColor(i10);
            invalidateSelf();
        }
    }

    public final void f(List list) {
        if (!C6496s.c(this.f44031k, list)) {
            this.f44031k = list;
            invalidateSelf();
        }
    }

    public final void g(c cVar) {
        this.f44023c = cVar;
    }

    public int getOpacity() {
        int alpha = this.f44032l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        if (1 > alpha || alpha >= 255) {
            return -2;
        }
        return -3;
    }

    public final void h(e eVar) {
        this.f44022b = eVar;
    }

    public void invalidateSelf() {
        this.f44027g = true;
        super.invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        C6496s.h(rect, "bounds");
        super.onBoundsChange(rect);
        this.f44027g = true;
    }

    public void setAlpha(int i10) {
        this.f44032l.setAlpha(a.d((((float) i10) / 255.0f) * (((float) Color.alpha(this.f44028h)) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
