package D4;

import B4.k;
import B4.l;
import B4.m;
import C4.q;
import C4.u;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C1607v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u4.C4071k;
import u4.L;
import u4.T;
import w4.C4119d;
import x4.C4155a;
import x4.C4158d;
import x4.o;

public class i extends b {

    /* renamed from: E  reason: collision with root package name */
    private final StringBuilder f30366E = new StringBuilder(2);

    /* renamed from: F  reason: collision with root package name */
    private final RectF f30367F = new RectF();

    /* renamed from: G  reason: collision with root package name */
    private final Matrix f30368G = new Matrix();

    /* renamed from: H  reason: collision with root package name */
    private final Paint f30369H = new a(1);

    /* renamed from: I  reason: collision with root package name */
    private final Paint f30370I = new b(1);

    /* renamed from: J  reason: collision with root package name */
    private final Map f30371J = new HashMap();

    /* renamed from: K  reason: collision with root package name */
    private final C1607v f30372K = new C1607v();

    /* renamed from: L  reason: collision with root package name */
    private final List f30373L = new ArrayList();

    /* renamed from: M  reason: collision with root package name */
    private final o f30374M;

    /* renamed from: N  reason: collision with root package name */
    private final L f30375N;

    /* renamed from: O  reason: collision with root package name */
    private final C4071k f30376O;

    /* renamed from: P  reason: collision with root package name */
    private u f30377P = u.INDEX;

    /* renamed from: Q  reason: collision with root package name */
    private C4155a f30378Q;

    /* renamed from: R  reason: collision with root package name */
    private C4155a f30379R;

    /* renamed from: S  reason: collision with root package name */
    private C4155a f30380S;

    /* renamed from: T  reason: collision with root package name */
    private C4155a f30381T;

    /* renamed from: U  reason: collision with root package name */
    private C4155a f30382U;

    /* renamed from: V  reason: collision with root package name */
    private C4155a f30383V;

    /* renamed from: W  reason: collision with root package name */
    private C4155a f30384W;

    /* renamed from: X  reason: collision with root package name */
    private C4155a f30385X;

    /* renamed from: Y  reason: collision with root package name */
    private C4155a f30386Y;

    /* renamed from: Z  reason: collision with root package name */
    private C4155a f30387Z;

    /* renamed from: a0  reason: collision with root package name */
    private C4155a f30388a0;

    /* renamed from: b0  reason: collision with root package name */
    private C4155a f30389b0;

    /* renamed from: c0  reason: collision with root package name */
    private C4155a f30390c0;

    /* renamed from: d0  reason: collision with root package name */
    private C4155a f30391d0;

    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                A4.b$a[] r0 = A4.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30394a = r0
                A4.b$a r1 = A4.b.a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30394a     // Catch:{ NoSuchFieldError -> 0x001d }
                A4.b$a r1 = A4.b.a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30394a     // Catch:{ NoSuchFieldError -> 0x0028 }
                A4.b$a r1 = A4.b.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.i.c.<clinit>():void");
        }
    }

    i(L l10, e eVar) {
        super(l10, eVar);
        l lVar;
        l lVar2;
        B4.d dVar;
        l lVar3;
        B4.d dVar2;
        l lVar4;
        B4.d dVar3;
        m mVar;
        B4.d dVar4;
        m mVar2;
        B4.b bVar;
        m mVar3;
        B4.b bVar2;
        m mVar4;
        B4.a aVar;
        m mVar5;
        B4.a aVar2;
        this.f30375N = l10;
        this.f30376O = eVar.c();
        o a10 = eVar.t().h();
        this.f30374M = a10;
        a10.a(this);
        i(a10);
        k u10 = eVar.u();
        if (!(u10 == null || (mVar5 = u10.f29795a) == null || (aVar2 = mVar5.f29801a) == null)) {
            C4155a h10 = aVar2.h();
            this.f30378Q = h10;
            h10.a(this);
            i(this.f30378Q);
        }
        if (!(u10 == null || (mVar4 = u10.f29795a) == null || (aVar = mVar4.f29802b) == null)) {
            C4155a h11 = aVar.h();
            this.f30380S = h11;
            h11.a(this);
            i(this.f30380S);
        }
        if (!(u10 == null || (mVar3 = u10.f29795a) == null || (bVar2 = mVar3.f29803c) == null)) {
            C4158d a11 = bVar2.h();
            this.f30382U = a11;
            a11.a(this);
            i(this.f30382U);
        }
        if (!(u10 == null || (mVar2 = u10.f29795a) == null || (bVar = mVar2.f29804d) == null)) {
            C4158d a12 = bVar.h();
            this.f30384W = a12;
            a12.a(this);
            i(this.f30384W);
        }
        if (!(u10 == null || (mVar = u10.f29795a) == null || (dVar4 = mVar.f29805e) == null)) {
            C4155a h12 = dVar4.h();
            this.f30386Y = h12;
            h12.a(this);
            i(this.f30386Y);
        }
        if (!(u10 == null || (lVar4 = u10.f29796b) == null || (dVar3 = lVar4.f29797a) == null)) {
            C4155a h13 = dVar3.h();
            this.f30389b0 = h13;
            h13.a(this);
            i(this.f30389b0);
        }
        if (!(u10 == null || (lVar3 = u10.f29796b) == null || (dVar2 = lVar3.f29798b) == null)) {
            C4155a h14 = dVar2.h();
            this.f30390c0 = h14;
            h14.a(this);
            i(this.f30390c0);
        }
        if (!(u10 == null || (lVar2 = u10.f29796b) == null || (dVar = lVar2.f29799c) == null)) {
            C4155a h15 = dVar.h();
            this.f30391d0 = h15;
            h15.a(this);
            i(this.f30391d0);
        }
        if (u10 != null && (lVar = u10.f29796b) != null) {
            this.f30377P = lVar.f29800d;
        }
    }

    private String Q(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!f0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = (long) codePointAt;
        if (this.f30372K.d(j10)) {
            return (String) this.f30372K.e(j10);
        }
        this.f30366E.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.f30366E.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.f30366E.toString();
        this.f30372K.j(j10, sb2);
        return sb2;
    }

    private void R(A4.b bVar, int i10, int i11) {
        int i12;
        C4155a aVar = this.f30379R;
        if (aVar != null) {
            this.f30369H.setColor(((Integer) aVar.h()).intValue());
        } else if (this.f30378Q == null || !e0(i11)) {
            this.f30369H.setColor(bVar.f29345h);
        } else {
            this.f30369H.setColor(((Integer) this.f30378Q.h()).intValue());
        }
        C4155a aVar2 = this.f30381T;
        if (aVar2 != null) {
            this.f30370I.setColor(((Integer) aVar2.h()).intValue());
        } else if (this.f30380S == null || !e0(i11)) {
            this.f30370I.setColor(bVar.f29346i);
        } else {
            this.f30370I.setColor(((Integer) this.f30380S.h()).intValue());
        }
        int i13 = 100;
        if (this.f30297x.h() == null) {
            i12 = 100;
        } else {
            i12 = ((Integer) this.f30297x.h().h()).intValue();
        }
        if (this.f30386Y != null && e0(i11)) {
            i13 = ((Integer) this.f30386Y.h()).intValue();
        }
        int round = Math.round(((((((float) i12) * 255.0f) / 100.0f) * (((float) i13) / 100.0f)) * ((float) i10)) / 255.0f);
        this.f30369H.setAlpha(round);
        this.f30370I.setAlpha(round);
        C4155a aVar3 = this.f30383V;
        if (aVar3 != null) {
            this.f30370I.setStrokeWidth(((Float) aVar3.h()).floatValue());
        } else if (this.f30382U == null || !e0(i11)) {
            this.f30370I.setStrokeWidth(bVar.f29347j * H4.l.e());
        } else {
            this.f30370I.setStrokeWidth(((Float) this.f30382U.h()).floatValue());
        }
    }

    private void S(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private void T(A4.d dVar, float f10, A4.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        List b02 = b0(dVar);
        for (int i12 = 0; i12 < b02.size(); i12++) {
            Path m10 = ((C4119d) b02.get(i12)).m();
            m10.computeBounds(this.f30367F, false);
            this.f30368G.reset();
            this.f30368G.preTranslate(0.0f, (-bVar.f29344g) * H4.l.e());
            this.f30368G.preScale(f10, f10);
            m10.transform(this.f30368G);
            if (bVar.f29348k) {
                W(m10, this.f30369H, canvas);
                W(m10, this.f30370I, canvas);
            } else {
                W(m10, this.f30370I, canvas);
                W(m10, this.f30369H, canvas);
            }
        }
    }

    private void U(String str, A4.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        if (bVar.f29348k) {
            S(str, this.f30369H, canvas);
            S(str, this.f30370I, canvas);
            return;
        }
        S(str, this.f30370I, canvas);
        S(str, this.f30369H, canvas);
    }

    private void V(String str, A4.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int i12 = 0;
        while (i12 < str.length()) {
            String Q10 = Q(str, i12);
            U(Q10, bVar, canvas, i10 + i12, i11);
            canvas.translate(this.f30369H.measureText(Q10) + f10, 0.0f);
            i12 += Q10.length();
        }
    }

    private void W(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void X(String str, A4.b bVar, A4.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            String str2 = str;
            A4.d dVar = (A4.d) this.f30376O.c().g(A4.d.c(str.charAt(i11), cVar.a(), cVar.c()));
            if (dVar == null) {
                Canvas canvas2 = canvas;
            } else {
                T(dVar, f11, bVar, canvas, i11, i10);
                Canvas canvas3 = canvas;
                canvas.translate((((float) dVar.b()) * f11 * H4.l.e()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(A4.b r21, A4.c r22, android.graphics.Canvas r23, int r24) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = r7.d0(r9)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r1 = r8.f29338a
            u4.L r2 = r7.f30375N
            u4.c0 r2 = r2.a0()
            if (r2 == 0) goto L_0x001f
            java.lang.String r3 = r20.getName()
            java.lang.String r1 = r2.c(r3, r1)
        L_0x001f:
            android.graphics.Paint r2 = r7.f30369H
            r2.setTypeface(r0)
            x4.a r0 = r7.f30387Z
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0035
        L_0x0033:
            float r0 = r8.f29340c
        L_0x0035:
            android.graphics.Paint r2 = r7.f30369H
            float r3 = H4.l.e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f30370I
            android.graphics.Paint r3 = r7.f30369H
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f30370I
            android.graphics.Paint r3 = r7.f30369H
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f29342e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            x4.a r3 = r7.f30385X
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L_0x0069:
            float r2 = r2 + r3
            goto L_0x007a
        L_0x006b:
            x4.a r3 = r7.f30384W
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0069
        L_0x007a:
            float r3 = H4.l.e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r10 = r2 / r0
            java.util.List r11 = r7.c0(r1)
            int r12 = r11.size()
            r13 = 0
            r0 = -1
            r14 = r0
            r15 = r13
            r16 = r15
        L_0x0092:
            if (r15 >= r12) goto L_0x0100
            java.lang.Object r0 = r11.get(r15)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f29350m
            if (r0 != 0) goto L_0x00a2
            r0 = 0
        L_0x00a0:
            r2 = r0
            goto L_0x00a5
        L_0x00a2:
            float r0 = r0.x
            goto L_0x00a0
        L_0x00a5:
            r4 = 0
            r6 = 0
            r0 = r20
            r3 = r22
            r5 = r10
            java.util.List r6 = r0.h0(r1, r2, r3, r4, r5, r6)
            r5 = r13
        L_0x00b1:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x00fd
            java.lang.Object r0 = r6.get(r5)
            r17 = r0
            D4.i$d r17 = (D4.i.d) r17
            int r14 = r14 + 1
            r23.save()
            float r0 = r17.f30396b
            r4 = r23
            boolean r0 = r7.g0(r4, r8, r14, r0)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r1 = r17.f30395a
            r0 = r20
            r2 = r21
            r3 = r23
            r4 = r10
            r18 = r5
            r5 = r16
            r19 = r6
            r6 = r24
            r0.V(r1, r2, r3, r4, r5, r6)
            goto L_0x00eb
        L_0x00e7:
            r18 = r5
            r19 = r6
        L_0x00eb:
            java.lang.String r0 = r17.f30395a
            int r0 = r0.length()
            int r16 = r16 + r0
            r23.restore()
            int r5 = r18 + 1
            r6 = r19
            goto L_0x00b1
        L_0x00fd:
            int r15 = r15 + 1
            goto L_0x0092
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.i.Y(A4.b, A4.c, android.graphics.Canvas, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z(A4.b r22, android.graphics.Matrix r23, A4.c r24, android.graphics.Canvas r25, int r26) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            x4.a r0 = r9.f30387Z
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0015
        L_0x0013:
            float r0 = r10.f29340c
        L_0x0015:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r11 = r0 / r1
            float r12 = H4.l.g(r23)
            java.lang.String r0 = r10.f29338a
            java.util.List r13 = r9.c0(r0)
            int r14 = r13.size()
            int r0 = r10.f29342e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            x4.a r1 = r9.f30385X
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L_0x003b:
            float r0 = r0 + r1
        L_0x003c:
            r15 = r0
            goto L_0x004d
        L_0x003e:
            x4.a r1 = r9.f30384W
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L_0x003b
        L_0x004d:
            r16 = 0
            r0 = -1
            r7 = r0
            r8 = r16
        L_0x0053:
            if (r8 >= r14) goto L_0x00c6
            java.lang.Object r0 = r13.get(r8)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r10.f29350m
            if (r0 != 0) goto L_0x0063
            r0 = 0
        L_0x0061:
            r2 = r0
            goto L_0x0066
        L_0x0063:
            float r0 = r0.x
            goto L_0x0061
        L_0x0066:
            r6 = 1
            r0 = r21
            r3 = r24
            r4 = r11
            r5 = r15
            java.util.List r6 = r0.h0(r1, r2, r3, r4, r5, r6)
            r5 = r16
        L_0x0073:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x00c1
            java.lang.Object r0 = r6.get(r5)
            D4.i$d r0 = (D4.i.d) r0
            int r7 = r7 + 1
            r25.save()
            float r1 = r0.f30396b
            r4 = r25
            boolean r1 = r9.g0(r4, r10, r7, r1)
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = r0.f30395a
            r0 = r21
            r2 = r22
            r3 = r24
            r4 = r25
            r17 = r5
            r5 = r12
            r18 = r6
            r6 = r11
            r19 = r7
            r7 = r15
            r20 = r8
            r8 = r26
            r0.X(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00b5
        L_0x00ad:
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
        L_0x00b5:
            r25.restore()
            int r5 = r17 + 1
            r6 = r18
            r7 = r19
            r8 = r20
            goto L_0x0073
        L_0x00c1:
            r20 = r8
            int r8 = r20 + 1
            goto L_0x0053
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.i.Z(A4.b, android.graphics.Matrix, A4.c, android.graphics.Canvas, int):void");
    }

    private d a0(int i10) {
        for (int size = this.f30373L.size(); size < i10; size++) {
            this.f30373L.add(new d((a) null));
        }
        return (d) this.f30373L.get(i10 - 1);
    }

    private List b0(A4.d dVar) {
        if (this.f30371J.containsKey(dVar)) {
            return (List) this.f30371J.get(dVar);
        }
        List a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C4119d(this.f30375N, this, (q) a10.get(i10), this.f30376O));
        }
        this.f30371J.put(dVar, arrayList);
        return arrayList;
    }

    private List c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface d0(A4.c cVar) {
        Typeface typeface;
        C4155a aVar = this.f30388a0;
        if (aVar != null && (typeface = (Typeface) aVar.h()) != null) {
            return typeface;
        }
        Typeface b02 = this.f30375N.b0(cVar);
        if (b02 != null) {
            return b02;
        }
        return cVar.d();
    }

    private boolean e0(int i10) {
        int length = ((A4.b) this.f30374M.h()).f29338a.length();
        C4155a aVar = this.f30389b0;
        if (aVar == null || this.f30390c0 == null) {
            return true;
        }
        int min = Math.min(((Integer) aVar.h()).intValue(), ((Integer) this.f30390c0.h()).intValue());
        int max = Math.max(((Integer) this.f30389b0.h()).intValue(), ((Integer) this.f30390c0.h()).intValue());
        C4155a aVar2 = this.f30391d0;
        if (aVar2 != null) {
            int intValue = ((Integer) aVar2.h()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.f30377P != u.INDEX) {
            float f10 = (((float) i10) / ((float) length)) * 100.0f;
            if (f10 < ((float) min) || f10 >= ((float) max)) {
                return false;
            }
            return true;
        } else if (i10 < min || i10 >= max) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f0(int i10) {
        if (Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19) {
            return true;
        }
        return false;
    }

    private boolean g0(Canvas canvas, A4.b bVar, int i10, float f10) {
        float f11;
        float f12;
        PointF pointF = bVar.f29349l;
        PointF pointF2 = bVar.f29350m;
        float e10 = H4.l.e();
        float f13 = 0.0f;
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = (bVar.f29343f * e10) + pointF.y;
        }
        float f14 = (((float) i10) * bVar.f29343f * e10) + f11;
        if (this.f30375N.H() && pointF2 != null && pointF != null && f14 >= pointF.y + pointF2.y + bVar.f29340c) {
            return false;
        }
        if (pointF == null) {
            f12 = 0.0f;
        } else {
            f12 = pointF.x;
        }
        if (pointF2 != null) {
            f13 = pointF2.x;
        }
        int i11 = c.f30394a[bVar.f29341d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f14);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f14);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f14);
        }
        return true;
    }

    private List h0(String str, float f10, A4.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        String str2 = str;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str2.charAt(i13);
            if (z10) {
                A4.d dVar = (A4.d) this.f30376O.c().g(A4.d.c(charAt, cVar.a(), cVar.c()));
                if (dVar == null) {
                } else {
                    measureText = ((float) dVar.b()) * f11 * H4.l.e();
                }
            } else {
                measureText = this.f30369H.measureText(str2.substring(i13, i13 + 1));
            }
            float f16 = measureText + f12;
            if (charAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                d a02 = a0(i10);
                if (i12 == i11) {
                    String substring = str2.substring(i11, i13);
                    String trim = substring.trim();
                    a02.c(trim, (f13 - f16) - (((float) (trim.length() - substring.length())) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String substring2 = str2.substring(i11, i12 - 1);
                    String trim2 = substring2.trim();
                    a02.c(trim2, ((f13 - f14) - (((float) (substring2.length() - trim2.length())) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            a0(i10).c(str2.substring(i11), f13);
        }
        return this.f30373L.subList(0, i10);
    }

    public void e(Object obj, I4.c cVar) {
        super.e(obj, cVar);
        if (obj == T.f48404a) {
            C4155a aVar = this.f30379R;
            if (aVar != null) {
                I(aVar);
            }
            if (cVar == null) {
                this.f30379R = null;
                return;
            }
            x4.q qVar = new x4.q(cVar);
            this.f30379R = qVar;
            qVar.a(this);
            i(this.f30379R);
        } else if (obj == T.f48405b) {
            C4155a aVar2 = this.f30381T;
            if (aVar2 != null) {
                I(aVar2);
            }
            if (cVar == null) {
                this.f30381T = null;
                return;
            }
            x4.q qVar2 = new x4.q(cVar);
            this.f30381T = qVar2;
            qVar2.a(this);
            i(this.f30381T);
        } else if (obj == T.f48422s) {
            C4155a aVar3 = this.f30383V;
            if (aVar3 != null) {
                I(aVar3);
            }
            if (cVar == null) {
                this.f30383V = null;
                return;
            }
            x4.q qVar3 = new x4.q(cVar);
            this.f30383V = qVar3;
            qVar3.a(this);
            i(this.f30383V);
        } else if (obj == T.f48423t) {
            C4155a aVar4 = this.f30385X;
            if (aVar4 != null) {
                I(aVar4);
            }
            if (cVar == null) {
                this.f30385X = null;
                return;
            }
            x4.q qVar4 = new x4.q(cVar);
            this.f30385X = qVar4;
            qVar4.a(this);
            i(this.f30385X);
        } else if (obj == T.f48393F) {
            C4155a aVar5 = this.f30387Z;
            if (aVar5 != null) {
                I(aVar5);
            }
            if (cVar == null) {
                this.f30387Z = null;
                return;
            }
            x4.q qVar5 = new x4.q(cVar);
            this.f30387Z = qVar5;
            qVar5.a(this);
            i(this.f30387Z);
        } else if (obj == T.f48400M) {
            C4155a aVar6 = this.f30388a0;
            if (aVar6 != null) {
                I(aVar6);
            }
            if (cVar == null) {
                this.f30388a0 = null;
                return;
            }
            x4.q qVar6 = new x4.q(cVar);
            this.f30388a0 = qVar6;
            qVar6.a(this);
            i(this.f30388a0);
        } else if (obj == T.f48402O) {
            this.f30374M.r(cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, (float) this.f30376O.b().width(), (float) this.f30376O.b().height());
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        A4.b bVar = (A4.b) this.f30374M.h();
        A4.c cVar = (A4.c) this.f30376O.g().get(bVar.f29339b);
        if (cVar != null) {
            canvas.save();
            canvas.concat(matrix);
            R(bVar, i10, 0);
            if (this.f30375N.k1()) {
                Z(bVar, matrix, cVar, canvas, i10);
            } else {
                Y(bVar, cVar, canvas, i10);
            }
            canvas.restore();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f30395a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f30396b;

        private d() {
            this.f30395a = "";
            this.f30396b = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public void c(String str, float f10) {
            this.f30395a = str;
            this.f30396b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
