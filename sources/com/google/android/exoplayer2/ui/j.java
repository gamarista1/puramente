package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class j extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f43088a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f43089b;

    /* renamed from: c  reason: collision with root package name */
    private List f43090c;

    /* renamed from: d  reason: collision with root package name */
    private ha.a f43091d;

    /* renamed from: e  reason: collision with root package name */
    private float f43092e;

    /* renamed from: f  reason: collision with root package name */
    private int f43093f;

    /* renamed from: g  reason: collision with root package name */
    private float f43094g;

    class a extends WebView {
        a(j jVar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f43095a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43095a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43095a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.j.b.<clinit>():void");
        }
    }

    public j(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f43095a[alignment.ordinal()];
        if (i10 == 1) {
            return OpsMetricTracker.START;
        }
        if (i10 != 2) {
            return "center";
        }
        return "end";
    }

    private static String d(ha.a aVar) {
        int i10 = aVar.f44137d;
        if (i10 == 1) {
            return M.C("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", b.b(aVar.f44138e));
        }
        if (i10 == 2) {
            return M.C("0.1em 0.12em 0.15em %s", b.b(aVar.f44138e));
        }
        if (i10 == 3) {
            return M.C("0.06em 0.08em 0.15em %s", b.b(aVar.f44138e));
        }
        if (i10 != 4) {
            return "unset";
        }
        return M.C("-0.05em -0.05em 0.15em %s", b.b(aVar.f44138e));
    }

    private String e(int i10, float f10) {
        float h10 = i.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (h10 == -3.4028235E38f) {
            return "unset";
        }
        return M.C("%.2fpx", Float.valueOf(h10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        if (i10 == 1) {
            return "vertical-rl";
        }
        if (i10 != 2) {
            return "horizontal-tb";
        }
        return "vertical-lr";
    }

    private static String h(W9.b bVar) {
        String str;
        float f10 = bVar.f34944q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = bVar.f34943p;
        if (i10 == 2 || i10 == 1) {
            str = "skewY";
        } else {
            str = "skewX";
        }
        return M.C("%s(%.2fdeg)", str, Float.valueOf(f10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013b, code lost:
        if (r8 != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0144, code lost:
        if (r8 != false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r31 = this;
            r0 = r31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ha.a r2 = r0.f43091d
            int r2 = r2.f44134a
            java.lang.String r2 = com.google.android.exoplayer2.ui.b.b(r2)
            int r3 = r0.f43093f
            float r4 = r0.f43092e
            java.lang.String r3 = r0.e(r3, r4)
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            ha.a r6 = r0.f43091d
            java.lang.String r6 = d(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r5, r6}
            java.lang.String r3 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r2 = ja.M.C(r3, r2)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r5 = com.google.android.exoplayer2.ui.b.a(r3)
            ha.a r6 = r0.f43091d
            int r6 = r6.f44135b
            java.lang.String r6 = com.google.android.exoplayer2.ui.b.b(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "background-color:%s;"
            java.lang.String r6 = ja.M.C(r7, r6)
            r2.put(r5, r6)
            r6 = 0
        L_0x0052:
            java.util.List r7 = r0.f43090c
            int r7 = r7.size()
            r8 = 1
            if (r6 >= r7) goto L_0x0205
            java.util.List r7 = r0.f43090c
            java.lang.Object r7 = r7.get(r6)
            W9.b r7 = (W9.b) r7
            float r9 = r7.f34935h
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r11 == 0) goto L_0x0070
            float r9 = r9 * r12
            goto L_0x0072
        L_0x0070:
            r9 = 1112014848(0x42480000, float:50.0)
        L_0x0072:
            int r11 = r7.f34936i
            int r11 = b(r11)
            float r13 = r7.f34932e
            int r14 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "%.2f%%"
            if (r14 == 0) goto L_0x00d5
            int r14 = r7.f34933f
            if (r14 == r8) goto L_0x00a9
            float r13 = r13 * r12
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = ja.M.C(r5, r13)
            int r14 = r7.f34943p
            if (r14 != r8) goto L_0x009f
            int r14 = r7.f34934g
            int r14 = b(r14)
            int r14 = -r14
            goto L_0x00a5
        L_0x009f:
            int r14 = r7.f34934g
            int r14 = b(r14)
        L_0x00a5:
            r20 = r13
            r8 = 0
            goto L_0x00e8
        L_0x00a9:
            r14 = 0
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            java.lang.String r8 = "%.2fem"
            if (r14 < 0) goto L_0x00c2
            float r13 = r13 * r4
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = ja.M.C(r8, r13)
            r20 = r13
            r8 = 0
        L_0x00c0:
            r14 = 0
            goto L_0x00e8
        L_0x00c2:
            float r13 = -r13
            float r13 = r13 - r15
            float r13 = r13 * r4
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = ja.M.C(r8, r13)
            r20 = r13
            r8 = 1
            goto L_0x00c0
        L_0x00d5:
            float r8 = r0.f43094g
            float r15 = r15 - r8
            float r15 = r15 * r12
            java.lang.Float r8 = java.lang.Float.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r13 = ja.M.C(r5, r8)
            r14 = -100
            goto L_0x00a5
        L_0x00e8:
            float r13 = r7.f34937j
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x00fe
            float r13 = r13 * r12
            java.lang.Float r10 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r5 = ja.M.C(r5, r10)
        L_0x00fb:
            r22 = r5
            goto L_0x0101
        L_0x00fe:
            java.lang.String r5 = "fit-content"
            goto L_0x00fb
        L_0x0101:
            android.text.Layout$Alignment r5 = r7.f34929b
            java.lang.String r23 = c(r5)
            int r5 = r7.f34943p
            java.lang.String r24 = f(r5)
            int r5 = r7.f34941n
            float r10 = r7.f34942o
            java.lang.String r25 = r0.e(r5, r10)
            boolean r5 = r7.f34939l
            if (r5 == 0) goto L_0x011c
            int r5 = r7.f34940m
            goto L_0x0120
        L_0x011c:
            ha.a r5 = r0.f43091d
            int r5 = r5.f44136c
        L_0x0120:
            java.lang.String r26 = com.google.android.exoplayer2.ui.b.b(r5)
            int r5 = r7.f34943p
            java.lang.String r10 = "right"
            r12 = 2
            java.lang.String r13 = "top"
            java.lang.String r15 = "left"
            r4 = 1
            if (r5 == r4) goto L_0x0144
            if (r5 == r12) goto L_0x013b
            if (r8 == 0) goto L_0x0136
            java.lang.String r13 = "bottom"
        L_0x0136:
            r19 = r13
            r17 = r15
            goto L_0x0147
        L_0x013b:
            if (r8 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r10 = r15
        L_0x013f:
            r19 = r10
            r17 = r13
            goto L_0x0147
        L_0x0144:
            if (r8 == 0) goto L_0x013f
            goto L_0x013e
        L_0x0147:
            if (r5 == r12) goto L_0x0152
            r4 = 1
            if (r5 != r4) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            java.lang.String r4 = "width"
            r21 = r4
            goto L_0x015b
        L_0x0152:
            java.lang.String r4 = "height"
            r21 = r4
            r30 = r14
            r14 = r11
            r11 = r30
        L_0x015b:
            java.lang.CharSequence r4 = r7.f34928a
            android.content.Context r5 = r31.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            com.google.android.exoplayer2.ui.c$b r4 = com.google.android.exoplayer2.ui.c.a(r4, r5)
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0177:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01a3
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r2.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.put(r8, r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x019e
            java.lang.Object r8 = r2.get(r8)
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r8 = 0
            goto L_0x019f
        L_0x019e:
            r8 = 1
        L_0x019f:
            ja.C3645a.f(r8)
            goto L_0x0177
        L_0x01a3:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            java.lang.Float r18 = java.lang.Float.valueOf(r9)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r14)
            java.lang.String r29 = h(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.lang.String r8 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r5 = ja.M.C(r8, r5)
            r1.append(r5)
            java.lang.String r5 = "<span class='%s'>"
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r5 = ja.M.C(r5, r8)
            r1.append(r5)
            android.text.Layout$Alignment r5 = r7.f34930c
            java.lang.String r7 = "</span>"
            if (r5 == 0) goto L_0x01f1
            java.lang.String r5 = c(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r8 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r5 = ja.M.C(r8, r5)
            r1.append(r5)
            java.lang.String r4 = r4.f43042a
            r1.append(r4)
            r1.append(r7)
            goto L_0x01f6
        L_0x01f1:
            java.lang.String r4 = r4.f43042a
            r1.append(r4)
        L_0x01f6:
            r1.append(r7)
            java.lang.String r4 = "</div>"
            r1.append(r4)
            int r6 = r6 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0052
        L_0x0205:
            java.lang.String r3 = "</div></body></html>"
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<html><head><style>"
            r3.append(r4)
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x021c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.String r6 = "{"
            r3.append(r6)
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.String r5 = "}"
            r3.append(r5)
            goto L_0x021c
        L_0x023f:
            java.lang.String r2 = "</style></head>"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r1.insert(r3, r2)
            android.webkit.WebView r2 = r0.f43089b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = nb.C5110e.f61085c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.j.i():void");
    }

    public void a(List list, ha.a aVar, float f10, int i10, float f11) {
        this.f43091d = aVar;
        this.f43092e = f10;
        this.f43093f = i10;
        this.f43094g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            W9.b bVar = (W9.b) list.get(i11);
            if (bVar.f34931d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f43090c.isEmpty() || !arrayList2.isEmpty()) {
            this.f43090c = arrayList2;
            i();
        }
        this.f43088a.a(arrayList, aVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f43089b.destroy();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f43090c.isEmpty()) {
            i();
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43090c = Collections.emptyList();
        this.f43091d = ha.a.f44133g;
        this.f43092e = 0.0533f;
        this.f43093f = 0;
        this.f43094g = 0.08f;
        a aVar = new a(context, attributeSet);
        this.f43088a = aVar;
        a aVar2 = new a(this, context, attributeSet);
        this.f43089b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
