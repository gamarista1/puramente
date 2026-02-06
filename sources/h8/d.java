package h8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C3411f0;
import com.facebook.react.uimanager.C3421n;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.G;
import j8.C3643a;
import j8.e;
import j8.f;
import j8.i;
import j8.j;
import java.util.List;
import java.util.Objects;
import p1.C2387c;
import x1.g;

public class d extends Drawable {

    /* renamed from: A  reason: collision with root package name */
    private i f44061A = new i();

    /* renamed from: B  reason: collision with root package name */
    private final Context f44062B;

    /* renamed from: C  reason: collision with root package name */
    private int f44063C = -1;

    /* renamed from: a  reason: collision with root package name */
    private C3411f0 f44064a;

    /* renamed from: b  reason: collision with root package name */
    private C3411f0 f44065b;

    /* renamed from: c  reason: collision with root package name */
    private C3411f0 f44066c;

    /* renamed from: d  reason: collision with root package name */
    private f f44067d;

    /* renamed from: e  reason: collision with root package name */
    private Path f44068e;

    /* renamed from: f  reason: collision with root package name */
    private Path f44069f;

    /* renamed from: g  reason: collision with root package name */
    private Path f44070g;

    /* renamed from: h  reason: collision with root package name */
    private Path f44071h;

    /* renamed from: i  reason: collision with root package name */
    private Path f44072i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f44073j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private Path f44074k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f44075l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f44076m;

    /* renamed from: n  reason: collision with root package name */
    private RectF f44077n;

    /* renamed from: o  reason: collision with root package name */
    private RectF f44078o;

    /* renamed from: p  reason: collision with root package name */
    private PointF f44079p;

    /* renamed from: q  reason: collision with root package name */
    private PointF f44080q;

    /* renamed from: r  reason: collision with root package name */
    private PointF f44081r;

    /* renamed from: s  reason: collision with root package name */
    private PointF f44082s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f44083t = false;

    /* renamed from: u  reason: collision with root package name */
    private final Paint f44084u = new Paint(1);

    /* renamed from: v  reason: collision with root package name */
    private int f44085v = 0;

    /* renamed from: w  reason: collision with root package name */
    private List f44086w = null;

    /* renamed from: x  reason: collision with root package name */
    private int f44087x = 255;

    /* renamed from: y  reason: collision with root package name */
    private final float f44088y = 0.8f;

    /* renamed from: z  reason: collision with root package name */
    private e f44089z = new e();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44090a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j8.f[] r0 = j8.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44090a = r0
                j8.f r1 = j8.f.SOLID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44090a     // Catch:{ NoSuchFieldError -> 0x001d }
                j8.f r1 = j8.f.DASHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44090a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j8.f r1 = j8.f.DOTTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.d.a.<clinit>():void");
        }
    }

    public d(Context context) {
        this.f44062B = context;
    }

    private void D() {
        float f10;
        float f11;
        if (this.f44083t) {
            this.f44083t = false;
            if (this.f44068e == null) {
                this.f44068e = new Path();
            }
            if (this.f44069f == null) {
                this.f44069f = new Path();
            }
            if (this.f44070g == null) {
                this.f44070g = new Path();
            }
            if (this.f44071h == null) {
                this.f44071h = new Path();
            }
            if (this.f44074k == null) {
                this.f44074k = new Path();
            }
            if (this.f44075l == null) {
                this.f44075l = new RectF();
            }
            if (this.f44076m == null) {
                this.f44076m = new RectF();
            }
            if (this.f44077n == null) {
                this.f44077n = new RectF();
            }
            if (this.f44078o == null) {
                this.f44078o = new RectF();
            }
            this.f44068e.reset();
            this.f44069f.reset();
            this.f44070g.reset();
            this.f44071h.reset();
            this.f44074k.reset();
            this.f44075l.set(getBounds());
            this.f44076m.set(getBounds());
            this.f44077n.set(getBounds());
            this.f44078o.set(getBounds());
            RectF l10 = l();
            int g10 = g(0);
            int g11 = g(1);
            int g12 = g(2);
            int g13 = g(3);
            int g14 = g(8);
            int g15 = g(9);
            int g16 = g(11);
            int g17 = g(10);
            if (t(9)) {
                g11 = g15;
                g13 = g11;
            }
            if (!t(10)) {
                g17 = g13;
            }
            if (!t(11)) {
                g16 = g11;
            }
            if (Color.alpha(g10) == 0 || Color.alpha(g16) == 0 || Color.alpha(g12) == 0 || Color.alpha(g17) == 0 || Color.alpha(g14) == 0) {
                f10 = 0.0f;
            } else {
                RectF rectF = this.f44075l;
                rectF.top += l10.top;
                rectF.bottom -= l10.bottom;
                rectF.left += l10.left;
                rectF.right -= l10.right;
                f10 = 0.8f;
            }
            RectF rectF2 = this.f44078o;
            rectF2.top += l10.top * 0.5f;
            rectF2.bottom -= l10.bottom * 0.5f;
            rectF2.left += l10.left * 0.5f;
            rectF2.right -= l10.right * 0.5f;
            i d10 = this.f44089z.d(getLayoutDirection(), this.f44062B, G.f(this.f44076m.width()), G.f(this.f44076m.height()));
            this.f44061A = d10;
            j c10 = d10.c().c();
            j c11 = this.f44061A.d().c();
            j c12 = this.f44061A.a().c();
            j c13 = this.f44061A.b().c();
            float o10 = o(c10.a(), l10.left);
            float o11 = o(c10.b(), l10.top);
            float o12 = o(c11.a(), l10.right);
            float o13 = o(c11.b(), l10.top);
            float o14 = o(c13.a(), l10.right);
            float o15 = o(c13.b(), l10.bottom);
            float o16 = o(c12.a(), l10.left);
            float o17 = o(c12.b(), l10.bottom);
            RectF rectF3 = l10;
            j jVar = c12;
            j jVar2 = c13;
            Path.Direction direction = Path.Direction.CW;
            this.f44068e.addRoundRect(this.f44075l, new float[]{o10, o11, o12, o13, o14, o15, o16, o17}, direction);
            Path path = this.f44069f;
            RectF rectF4 = this.f44075l;
            path.addRoundRect(rectF4.left - f10, rectF4.top - f10, rectF4.right + f10, rectF4.bottom + f10, new float[]{o10, o11, o12, o13, o14, o15, o16, o17}, direction);
            float f12 = o14;
            float f13 = o15;
            this.f44070g.addRoundRect(this.f44076m, new float[]{c10.a(), c10.b(), c11.a(), c11.b(), jVar2.a(), jVar2.b(), jVar.a(), jVar.b()}, direction);
            C3411f0 f0Var = this.f44064a;
            if (f0Var != null) {
                f11 = f0Var.a(8) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            this.f44071h.addRoundRect(this.f44077n, new float[]{c10.a() + f11, c10.b() + f11, c11.a() + f11, c11.b() + f11, jVar2.a() + f11, jVar2.b() + f11, jVar.a() + f11, jVar.b() + f11}, direction);
            Path path2 = this.f44074k;
            RectF rectF5 = this.f44078o;
            RectF rectF6 = rectF3;
            float a10 = c10.a() - (rectF6.left * 0.5f);
            float b10 = c10.b() - (rectF6.top * 0.5f);
            float f14 = o13;
            float a11 = c11.a() - (rectF6.right * 0.5f);
            float b11 = c11.b() - (rectF6.top * 0.5f);
            float f15 = o12;
            float a12 = jVar2.a() - (rectF6.right * 0.5f);
            float f16 = o16;
            float b12 = jVar2.b() - (rectF6.bottom * 0.5f);
            float f17 = o17;
            path2.addRoundRect(rectF5, new float[]{a10, b10, a11, b11, a12, b12, jVar.a() - (rectF6.left * 0.5f), jVar.b() - (rectF6.bottom * 0.5f)}, direction);
            if (this.f44079p == null) {
                this.f44079p = new PointF();
            }
            PointF pointF = this.f44079p;
            PointF pointF2 = pointF;
            RectF rectF7 = this.f44075l;
            float f18 = rectF7.left;
            pointF.x = f18;
            float f19 = rectF7.top;
            pointF.y = f19;
            RectF rectF8 = this.f44076m;
            m((double) f18, (double) f19, (double) ((o10 * 2.0f) + f18), (double) ((o11 * 2.0f) + f19), (double) rectF8.left, (double) rectF8.top, (double) f18, (double) f19, pointF2);
            if (this.f44082s == null) {
                this.f44082s = new PointF();
            }
            PointF pointF3 = this.f44082s;
            PointF pointF4 = pointF3;
            RectF rectF9 = this.f44075l;
            float f20 = rectF9.left;
            pointF3.x = f20;
            float f21 = rectF9.bottom;
            pointF3.y = f21;
            RectF rectF10 = this.f44076m;
            m((double) f20, (double) (f21 - (f17 * 2.0f)), (double) ((f16 * 2.0f) + f20), (double) f21, (double) rectF10.left, (double) rectF10.bottom, (double) f20, (double) f21, pointF4);
            if (this.f44080q == null) {
                this.f44080q = new PointF();
            }
            PointF pointF5 = this.f44080q;
            PointF pointF6 = pointF5;
            RectF rectF11 = this.f44075l;
            float f22 = rectF11.right;
            pointF5.x = f22;
            float f23 = rectF11.top;
            pointF5.y = f23;
            RectF rectF12 = this.f44076m;
            m((double) (f22 - (f15 * 2.0f)), (double) f23, (double) f22, (double) ((f14 * 2.0f) + f23), (double) rectF12.right, (double) rectF12.top, (double) f22, (double) f23, pointF6);
            if (this.f44081r == null) {
                this.f44081r = new PointF();
            }
            PointF pointF7 = this.f44081r;
            PointF pointF8 = pointF7;
            RectF rectF13 = this.f44075l;
            float f24 = rectF13.right;
            pointF7.x = f24;
            float f25 = rectF13.bottom;
            pointF7.y = f25;
            RectF rectF14 = this.f44076m;
            m((double) (f24 - (f12 * 2.0f)), (double) (f25 - (f13 * 2.0f)), (double) f24, (double) f25, (double) rectF14.right, (double) rectF14.bottom, (double) f24, (double) f25, pointF8);
        }
    }

    private void E() {
        PathEffect pathEffect;
        f fVar = this.f44067d;
        if (fVar != null) {
            pathEffect = r(fVar, n());
        } else {
            pathEffect = null;
        }
        this.f44084u.setPathEffect(pathEffect);
    }

    private void F(int i10) {
        PathEffect pathEffect;
        f fVar = this.f44067d;
        if (fVar != null) {
            pathEffect = r(fVar, (float) i10);
        } else {
            pathEffect = null;
        }
        this.f44084u.setPathEffect(pathEffect);
    }

    private static int a(float f10, float f11) {
        return ((((int) f10) << 24) & -16777216) | (((int) f11) & 16777215);
    }

    private void b(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 != 0) {
            if (this.f44072i == null) {
                this.f44072i = new Path();
            }
            this.f44084u.setColor(i10);
            this.f44072i.reset();
            this.f44072i.moveTo(f10, f11);
            this.f44072i.lineTo(f12, f13);
            this.f44072i.lineTo(f14, f15);
            this.f44072i.lineTo(f16, f17);
            this.f44072i.lineTo(f10, f11);
            canvas.drawPath(this.f44072i, this.f44084u);
        }
    }

    private void c(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        Canvas canvas2 = canvas;
        this.f44084u.setStyle(Paint.Style.FILL);
        int u10 = u(this.f44085v, this.f44087x);
        if (Color.alpha(u10) != 0) {
            this.f44084u.setColor(u10);
            canvas2.drawRect(getBounds(), this.f44084u);
        }
        List list = this.f44086w;
        if (list != null && !list.isEmpty()) {
            this.f44084u.setShader(f());
            canvas2.drawRect(getBounds(), this.f44084u);
            this.f44084u.setShader((Shader) null);
        }
        RectF l10 = l();
        int round = Math.round(l10.left);
        int round2 = Math.round(l10.top);
        int round3 = Math.round(l10.right);
        int round4 = Math.round(l10.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int g10 = g(0);
            int g11 = g(1);
            int g12 = g(2);
            int g13 = g(3);
            int g14 = g(9);
            int g15 = g(11);
            int g16 = g(10);
            if (t(9)) {
                g11 = g14;
                g13 = g11;
            }
            if (!t(10)) {
                g16 = g13;
            }
            if (!t(11)) {
                g15 = g11;
            }
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int g17 = g(4);
            int g18 = g(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f44062B)) {
                if (t(4)) {
                    g10 = g17;
                }
                if (t(5)) {
                    g12 = g18;
                }
                if (z10) {
                    i14 = g12;
                } else {
                    i14 = g10;
                }
                if (!z10) {
                    g10 = g12;
                }
                i10 = g10;
                i11 = i14;
            } else {
                if (z10) {
                    i13 = g18;
                } else {
                    i13 = g17;
                }
                if (!z10) {
                    g17 = g18;
                }
                boolean t10 = t(4);
                boolean t11 = t(5);
                if (z10) {
                    z11 = t11;
                } else {
                    z11 = t10;
                }
                if (!z10) {
                    t10 = t11;
                }
                if (z11) {
                    g10 = i13;
                }
                i11 = g10;
                if (t10) {
                    i10 = g17;
                } else {
                    i10 = g12;
                }
            }
            int i15 = bounds.left;
            int i16 = i11;
            int i17 = bounds.top;
            int i18 = round3;
            int i19 = i15;
            int e10 = e(round, round2, round3, round4, i11, g15, i10, g16);
            if (e10 == 0) {
                this.f44084u.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (round > 0) {
                    float f10 = (float) i19;
                    float f11 = (float) (i19 + round);
                    int i20 = i17 + height;
                    i12 = i17;
                    b(canvas, i16, f10, (float) i17, f11, (float) (i17 + round2), f11, (float) (i20 - round4), f10, (float) i20);
                } else {
                    i12 = i17;
                }
                if (round2 > 0) {
                    float f12 = (float) i12;
                    float f13 = (float) (i12 + round2);
                    int i21 = i19 + width;
                    b(canvas, g15, (float) i19, f12, (float) (i19 + round), f13, (float) (i21 - i18), f13, (float) i21, f12);
                }
                if (i18 > 0) {
                    int i22 = i19 + width;
                    float f14 = (float) i22;
                    int i23 = i12 + height;
                    float f15 = (float) (i22 - i18);
                    b(canvas, i10, f14, (float) i12, f14, (float) i23, f15, (float) (i23 - round4), f15, (float) (i12 + round2));
                }
                if (round4 > 0) {
                    int i24 = i12 + height;
                    float f16 = (float) i24;
                    int i25 = i19 + width;
                    float f17 = (float) (i24 - round4);
                    b(canvas, g16, (float) i19, f16, (float) i25, f16, (float) (i25 - i18), f17, (float) (i19 + round), f17);
                }
                this.f44084u.setAntiAlias(true);
            } else if (Color.alpha(e10) != 0) {
                int i26 = bounds.right;
                int i27 = bounds.bottom;
                this.f44084u.setColor(e10);
                this.f44084u.setStyle(Paint.Style.STROKE);
                if (round > 0) {
                    this.f44073j.reset();
                    int round5 = Math.round(l10.left);
                    F(round5);
                    this.f44084u.setStrokeWidth((float) round5);
                    float f18 = (float) (i19 + (round5 / 2));
                    this.f44073j.moveTo(f18, (float) i17);
                    this.f44073j.lineTo(f18, (float) i27);
                    canvas2.drawPath(this.f44073j, this.f44084u);
                }
                if (round2 > 0) {
                    this.f44073j.reset();
                    int round6 = Math.round(l10.top);
                    F(round6);
                    this.f44084u.setStrokeWidth((float) round6);
                    float f19 = (float) (i17 + (round6 / 2));
                    this.f44073j.moveTo((float) i19, f19);
                    this.f44073j.lineTo((float) i26, f19);
                    canvas2.drawPath(this.f44073j, this.f44084u);
                }
                if (i18 > 0) {
                    this.f44073j.reset();
                    int round7 = Math.round(l10.right);
                    F(round7);
                    this.f44084u.setStrokeWidth((float) round7);
                    float f20 = (float) (i26 - (round7 / 2));
                    this.f44073j.moveTo(f20, (float) i17);
                    this.f44073j.lineTo(f20, (float) i27);
                    canvas2.drawPath(this.f44073j, this.f44084u);
                }
                if (round4 > 0) {
                    this.f44073j.reset();
                    int round8 = Math.round(l10.bottom);
                    F(round8);
                    this.f44084u.setStrokeWidth((float) round8);
                    float f21 = (float) (i27 - (round8 / 2));
                    this.f44073j.moveTo((float) i19, f21);
                    this.f44073j.lineTo((float) i26, f21);
                    canvas2.drawPath(this.f44073j, this.f44084u);
                }
            }
        }
    }

    private void d(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f10;
        PointF pointF;
        float f11;
        float f12;
        float f13;
        int i13;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        int i14;
        boolean z10;
        Canvas canvas2 = canvas;
        D();
        canvas.save();
        canvas2.clipPath((Path) g.f(this.f44070g), Region.Op.INTERSECT);
        int i15 = this.f44085v;
        int p10 = C2387c.p(i15, (Color.alpha(i15) * this.f44087x) >> 8);
        if (Color.alpha(p10) != 0) {
            this.f44084u.setColor(p10);
            this.f44084u.setStyle(Paint.Style.FILL);
            canvas2.drawPath((Path) g.f(this.f44069f), this.f44084u);
        }
        List list = this.f44086w;
        if (list != null && !list.isEmpty()) {
            this.f44084u.setShader(f());
            this.f44084u.setStyle(Paint.Style.FILL);
            canvas2.drawPath((Path) g.f(this.f44069f), this.f44084u);
            this.f44084u.setShader((Shader) null);
        }
        RectF l10 = l();
        boolean z11 = false;
        int g10 = g(0);
        int g11 = g(1);
        int g12 = g(2);
        int g13 = g(3);
        int g14 = g(9);
        int g15 = g(11);
        int g16 = g(10);
        if (t(9)) {
            g11 = g14;
            g13 = g11;
        }
        if (!t(10)) {
            g16 = g13;
        }
        if (t(11)) {
            i10 = g15;
        } else {
            i10 = g11;
        }
        if (l10.top > 0.0f || l10.bottom > 0.0f || l10.left > 0.0f || l10.right > 0.0f) {
            float n10 = n();
            int g17 = g(8);
            if (l10.top != n10 || l10.bottom != n10 || l10.left != n10 || l10.right != n10 || g10 != g17 || i10 != g17 || g12 != g17 || g16 != g17) {
                this.f44084u.setStyle(Paint.Style.FILL);
                canvas2.clipPath((Path) g.f(this.f44068e), Region.Op.DIFFERENCE);
                if (getLayoutDirection() == 1) {
                    z11 = true;
                }
                int g18 = g(4);
                int g19 = g(5);
                if (com.facebook.react.modules.i18nmanager.a.f().d(this.f44062B)) {
                    if (t(4)) {
                        g10 = g18;
                    }
                    if (t(5)) {
                        g12 = g19;
                    }
                    if (z11) {
                        i12 = g12;
                    } else {
                        i12 = g10;
                    }
                    if (!z11) {
                        g10 = g12;
                    }
                    i11 = g10;
                } else {
                    if (z11) {
                        i14 = g19;
                    } else {
                        i14 = g18;
                    }
                    if (!z11) {
                        g18 = g19;
                    }
                    boolean t10 = t(4);
                    boolean t11 = t(5);
                    if (z11) {
                        z10 = t11;
                    } else {
                        z10 = t10;
                    }
                    if (!z11) {
                        t10 = t11;
                    }
                    if (z10) {
                        g10 = i14;
                    }
                    if (t10) {
                        i12 = g10;
                        i11 = g18;
                    } else {
                        i12 = g10;
                        i11 = g12;
                    }
                }
                RectF rectF = (RectF) g.f(this.f44076m);
                float f14 = rectF.left;
                float f15 = rectF.right;
                float f16 = rectF.top;
                float f17 = rectF.bottom;
                PointF pointF5 = (PointF) g.f(this.f44079p);
                PointF pointF6 = (PointF) g.f(this.f44080q);
                PointF pointF7 = (PointF) g.f(this.f44082s);
                PointF pointF8 = (PointF) g.f(this.f44081r);
                if (l10.left > 0.0f) {
                    float f18 = pointF5.x;
                    float f19 = pointF5.y - 0.8f;
                    float f20 = pointF7.x;
                    float f21 = pointF7.y + 0.8f;
                    float f22 = f17 + 0.8f;
                    pointF4 = pointF8;
                    PointF pointF9 = pointF7;
                    i13 = g16;
                    pointF2 = pointF6;
                    pointF = pointF9;
                    pointF3 = pointF5;
                    float f23 = f19;
                    f13 = f17;
                    float f24 = f20;
                    f12 = f16;
                    float f25 = f21;
                    f11 = f15;
                    f10 = f14;
                    b(canvas, i12, f14, f16 - 0.8f, f18, f23, f24, f25, f14, f22);
                } else {
                    pointF4 = pointF8;
                    pointF = pointF7;
                    pointF3 = pointF5;
                    f13 = f17;
                    f12 = f16;
                    f11 = f15;
                    f10 = f14;
                    i13 = g16;
                    pointF2 = pointF6;
                }
                if (l10.top > 0.0f) {
                    b(canvas, i10, f10 - 0.8f, f12, pointF3.x - 0.8f, pointF3.y, pointF2.x + 0.8f, pointF2.y, f11 + 0.8f, f12);
                }
                if (l10.right > 0.0f) {
                    b(canvas, i11, f11, f12 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF4.x, pointF4.y + 0.8f, f11, f13 + 0.8f);
                }
                if (l10.bottom > 0.0f) {
                    PointF pointF10 = pointF;
                    b(canvas, i13, f10 - 0.8f, f13, pointF10.x - 0.8f, pointF10.y, pointF4.x + 0.8f, pointF4.y, f11 + 0.8f, f13);
                }
            } else if (n10 > 0.0f) {
                this.f44084u.setColor(u(g17, this.f44087x));
                this.f44084u.setStyle(Paint.Style.STROKE);
                this.f44084u.setStrokeWidth(n10);
                canvas2.drawPath((Path) g.f(this.f44074k), this.f44084u);
            }
        }
        canvas.restore();
    }

    private static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i20;
        int i21 = -1;
        if (i10 > 0) {
            i18 = i14;
        } else {
            i18 = -1;
        }
        if (i11 > 0) {
            i19 = i15;
        } else {
            i19 = -1;
        }
        int i22 = i18 & i19;
        if (i12 > 0) {
            i20 = i16;
        } else {
            i20 = -1;
        }
        int i23 = i22 & i20;
        if (i13 > 0) {
            i21 = i17;
        }
        int i24 = i21 & i23;
        if (i10 <= 0) {
            i14 = 0;
        }
        if (i11 <= 0) {
            i15 = 0;
        }
        int i25 = i14 | i15;
        if (i12 <= 0) {
            i16 = 0;
        }
        int i26 = i25 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        if (i24 == (i26 | i17)) {
            return i24;
        }
        return 0;
    }

    private Shader f() {
        List<C3643a> list = this.f44086w;
        ComposeShader composeShader = null;
        if (list == null) {
            return null;
        }
        for (C3643a a10 : list) {
            Shader a11 = a10.a(getBounds());
            if (a11 != null) {
                if (composeShader == null) {
                    composeShader = a11;
                } else {
                    composeShader = new ComposeShader(a11, composeShader, PorterDuff.Mode.SRC_OVER);
                }
            }
        }
        return composeShader;
    }

    private static void m(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        PointF pointF2 = pointF;
        double d18 = (d10 + d12) / 2.0d;
        double d19 = (d11 + d13) / 2.0d;
        double d20 = d14 - d18;
        double d21 = d15 - d19;
        double abs = Math.abs(d12 - d10) / 2.0d;
        double abs2 = Math.abs(d13 - d11) / 2.0d;
        double d22 = ((d17 - d19) - d21) / ((d16 - d18) - d20);
        double d23 = d21 - (d20 * d22);
        double d24 = abs2 * abs2;
        double d25 = abs * abs;
        double d26 = d24 + (d25 * d22 * d22);
        double d27 = abs * 2.0d * abs * d23 * d22;
        double d28 = (-(d25 * ((d23 * d23) - d24))) / d26;
        double d29 = d26 * 2.0d;
        double sqrt = ((-d27) / d29) - Math.sqrt(d28 + Math.pow(d27 / d29, 2.0d));
        double d30 = (d22 * sqrt) + d23;
        double d31 = sqrt + d18;
        double d32 = d30 + d19;
        if (!Double.isNaN(d31) && !Double.isNaN(d32)) {
            PointF pointF3 = pointF;
            pointF3.x = (float) d31;
            pointF3.y = (float) d32;
        }
    }

    private static PathEffect r(f fVar, float f10) {
        int i10 = a.f44090a[fVar.ordinal()];
        if (i10 == 2) {
            float f11 = f10 * 3.0f;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        } else if (i10 != 3) {
            return null;
        } else {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
    }

    private boolean t(int i10) {
        float f10;
        C3411f0 f0Var = this.f44065b;
        float f11 = Float.NaN;
        if (f0Var != null) {
            f10 = f0Var.a(i10);
        } else {
            f10 = Float.NaN;
        }
        C3411f0 f0Var2 = this.f44066c;
        if (f0Var2 != null) {
            f11 = f0Var2.a(i10);
        }
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return false;
        }
        return true;
    }

    private static int u(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    private void w(int i10, float f10) {
        if (this.f44066c == null) {
            this.f44066c = new C3411f0(255.0f);
        }
        if (!C3421n.a(this.f44066c.b(i10), f10)) {
            this.f44066c.c(i10, f10);
            invalidateSelf();
        }
    }

    private void y(int i10, float f10) {
        if (this.f44065b == null) {
            this.f44065b = new C3411f0(0.0f);
        }
        if (!C3421n.a(this.f44065b.b(i10), f10)) {
            this.f44065b.c(i10, f10);
            invalidateSelf();
        }
    }

    public void A(f fVar) {
        if (this.f44067d != fVar) {
            this.f44067d = fVar;
            this.f44083t = true;
            invalidateSelf();
        }
    }

    public void B(int i10, float f10) {
        if (this.f44064a == null) {
            this.f44064a = new C3411f0();
        }
        if (!C3421n.a(this.f44064a.b(i10), f10)) {
            this.f44064a.c(i10, f10);
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                this.f44083t = true;
            }
            invalidateSelf();
        }
    }

    public void C(int i10) {
        this.f44085v = i10;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        E();
        if (!s()) {
            c(canvas);
        } else {
            d(canvas);
        }
    }

    public int g(int i10) {
        float f10;
        float f11;
        C3411f0 f0Var = this.f44065b;
        if (f0Var != null) {
            f10 = f0Var.a(i10);
        } else {
            f10 = 0.0f;
        }
        C3411f0 f0Var2 = this.f44066c;
        if (f0Var2 != null) {
            f11 = f0Var2.a(i10);
        } else {
            f11 = 255.0f;
        }
        return a(f11, f10);
    }

    public int getAlpha() {
        return this.f44087x;
    }

    public int getLayoutDirection() {
        int i10 = this.f44063C;
        if (i10 == -1) {
            return super.getLayoutDirection();
        }
        return i10;
    }

    public int getOpacity() {
        int alpha = (Color.alpha(this.f44085v) * this.f44087x) >> 8;
        if (alpha == 0) {
            return -2;
        }
        if (alpha != 255) {
            return -3;
        }
        return -1;
    }

    public void getOutline(Outline outline) {
        if (s()) {
            D();
            outline.setConvexPath((Path) g.f(this.f44071h));
            return;
        }
        outline.setRect(getBounds());
    }

    public e h() {
        return this.f44089z;
    }

    public Float i(int i10) {
        C3411f0 f0Var = this.f44064a;
        if (f0Var == null) {
            return null;
        }
        float b10 = f0Var.b(i10);
        if (Float.isNaN(b10)) {
            return null;
        }
        return Float.valueOf(b10);
    }

    public float j(float f10, int i10) {
        Float i11 = i(i10);
        if (i11 == null) {
            return f10;
        }
        return i11.floatValue();
    }

    public int k() {
        return this.f44085v;
    }

    public RectF l() {
        float f10;
        float f11;
        float j10 = j(0.0f, 8);
        boolean z10 = true;
        float j11 = j(j10, 1);
        float j12 = j(j10, 3);
        float j13 = j(j10, 0);
        float j14 = j(j10, 2);
        if (this.f44064a != null) {
            if (getLayoutDirection() != 1) {
                z10 = false;
            }
            float b10 = this.f44064a.b(4);
            float b11 = this.f44064a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f44062B)) {
                if (!Float.isNaN(b10)) {
                    j13 = b10;
                }
                if (!Float.isNaN(b11)) {
                    j14 = b11;
                }
                if (z10) {
                    f11 = j14;
                } else {
                    f11 = j13;
                }
                if (z10) {
                    j14 = j13;
                }
                j13 = f11;
            } else {
                if (z10) {
                    f10 = b11;
                } else {
                    f10 = b10;
                }
                if (!z10) {
                    b10 = b11;
                }
                if (!Float.isNaN(f10)) {
                    j13 = f10;
                }
                if (!Float.isNaN(b10)) {
                    j14 = b10;
                }
            }
        }
        return new RectF(j13, j11, j14, j12);
    }

    public float n() {
        C3411f0 f0Var = this.f44064a;
        if (f0Var == null || Float.isNaN(f0Var.b(8))) {
            return 0.0f;
        }
        return this.f44064a.b(8);
    }

    public float o(float f10, float f11) {
        return Math.max(f10 - f11, 0.0f);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f44083t = true;
    }

    public Path p() {
        if (!s()) {
            return null;
        }
        D();
        return new Path((Path) g.f(this.f44068e));
    }

    public RectF q() {
        RectF l10 = l();
        if (l10 == null) {
            return new RectF(0.0f, 0.0f, (float) getBounds().width(), (float) getBounds().height());
        }
        return new RectF(l10.left, l10.top, ((float) getBounds().width()) - l10.right, ((float) getBounds().height()) - l10.bottom);
    }

    public boolean s() {
        return this.f44089z.c();
    }

    public void setAlpha(int i10) {
        if (i10 != this.f44087x) {
            this.f44087x = i10;
            invalidateSelf();
        }
    }

    public void v(List list) {
        this.f44086w = list;
        invalidateSelf();
    }

    public void x(int i10, Integer num) {
        float f10;
        float f11 = Float.NaN;
        if (num == null) {
            f10 = Float.NaN;
        } else {
            f10 = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f11 = (float) (num.intValue() >>> 24);
        }
        y(i10, f10);
        w(i10, f11);
        this.f44083t = true;
    }

    public void z(j8.d dVar, C3430x xVar) {
        if (!Objects.equals(xVar, this.f44089z.b(dVar))) {
            this.f44089z.e(dVar, xVar);
            this.f44083t = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
