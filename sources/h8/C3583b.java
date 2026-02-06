package h8;

import Bf.b;
import Bf.d;
import Ff.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.C3411f0;
import com.facebook.react.uimanager.C3421n;
import com.facebook.react.uimanager.G;
import j8.c;
import j8.e;
import j8.f;
import j8.h;
import j8.i;
import j8.j;
import j8.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import lf.C6514M;
import lf.C6535s;
import pf.C6632a;

/* renamed from: h8.b  reason: case insensitive filesystem */
public final class C3583b extends Drawable {

    /* renamed from: z  reason: collision with root package name */
    static final /* synthetic */ l[] f44033z = {O.f(new z(C3583b.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};

    /* renamed from: a  reason: collision with root package name */
    private final Context f44034a;

    /* renamed from: b  reason: collision with root package name */
    private final C3411f0 f44035b;

    /* renamed from: c  reason: collision with root package name */
    private e f44036c;

    /* renamed from: d  reason: collision with root package name */
    private c f44037d;

    /* renamed from: e  reason: collision with root package name */
    private final d f44038e;

    /* renamed from: f  reason: collision with root package name */
    private Integer[] f44039f;

    /* renamed from: g  reason: collision with root package name */
    private h f44040g = new h(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private i f44041h;

    /* renamed from: i  reason: collision with root package name */
    private int f44042i = 255;

    /* renamed from: j  reason: collision with root package name */
    private final float f44043j = 0.8f;

    /* renamed from: k  reason: collision with root package name */
    private Path f44044k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f44045l = new Paint(1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f44046m = true;

    /* renamed from: n  reason: collision with root package name */
    private Path f44047n;

    /* renamed from: o  reason: collision with root package name */
    private Path f44048o;

    /* renamed from: p  reason: collision with root package name */
    private Path f44049p;

    /* renamed from: q  reason: collision with root package name */
    private Path f44050q;

    /* renamed from: r  reason: collision with root package name */
    private Path f44051r;

    /* renamed from: s  reason: collision with root package name */
    private PointF f44052s;

    /* renamed from: t  reason: collision with root package name */
    private PointF f44053t;

    /* renamed from: u  reason: collision with root package name */
    private PointF f44054u;

    /* renamed from: v  reason: collision with root package name */
    private PointF f44055v;

    /* renamed from: w  reason: collision with root package name */
    private RectF f44056w;

    /* renamed from: x  reason: collision with root package name */
    private RectF f44057x;

    /* renamed from: y  reason: collision with root package name */
    private RectF f44058y;

    /* renamed from: h8.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                j8.f[] r0 = j8.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j8.f r1 = j8.f.SOLID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j8.f r1 = j8.f.DASHED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j8.f r1 = j8.f.DOTTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f44059a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.C3583b.a.<clinit>():void");
        }
    }

    /* renamed from: h8.b$b  reason: collision with other inner class name */
    public static final class C0677b extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3583b f44060b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0677b(Object obj, C3583b bVar) {
            super(obj);
            this.f44060b = bVar;
        }

        /* access modifiers changed from: protected */
        public void c(l lVar, Object obj, Object obj2) {
            C6496s.h(lVar, "property");
            if (!C6496s.c(obj, obj2)) {
                this.f44060b.f44046m = true;
                this.f44060b.invalidateSelf();
            }
        }
    }

    public C3583b(Context context, C3411f0 f0Var, e eVar, c cVar, f fVar) {
        C6496s.h(context, "context");
        this.f44034a = context;
        this.f44035b = f0Var;
        this.f44036c = eVar;
        this.f44037d = cVar;
        this.f44038e = m(fVar);
    }

    private final RectF b() {
        RectF a10;
        float f10;
        float f11;
        float f12;
        c cVar = this.f44037d;
        float f13 = 0.0f;
        if (cVar == null || (a10 = cVar.a(getLayoutDirection(), this.f44034a)) == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (Float.isNaN(a10.left)) {
            f10 = 0.0f;
        } else {
            f10 = G.f41415a.b(a10.left);
        }
        if (Float.isNaN(a10.top)) {
            f11 = 0.0f;
        } else {
            f11 = G.f41415a.b(a10.top);
        }
        if (Float.isNaN(a10.right)) {
            f12 = 0.0f;
        } else {
            f12 = G.f41415a.b(a10.right);
        }
        if (!Float.isNaN(a10.bottom)) {
            f13 = G.f41415a.b(a10.bottom);
        }
        return new RectF(f10, f11, f12, f13);
    }

    private final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 != 0) {
            if (this.f44044k == null) {
                this.f44044k = new Path();
            }
            this.f44045l.setColor(n(i10, this.f44042i));
            Path path = this.f44044k;
            if (path != null) {
                path.reset();
            }
            Path path2 = this.f44044k;
            if (path2 != null) {
                path2.moveTo(f10, f11);
            }
            Path path3 = this.f44044k;
            if (path3 != null) {
                path3.lineTo(f12, f13);
            }
            Path path4 = this.f44044k;
            if (path4 != null) {
                path4.lineTo(f14, f15);
            }
            Path path5 = this.f44044k;
            if (path5 != null) {
                path5.lineTo(f16, f17);
            }
            Path path6 = this.f44044k;
            if (path6 != null) {
                path6.lineTo(f10, f11);
            }
            Path path7 = this.f44044k;
            if (path7 != null) {
                canvas.drawPath(path7, this.f44045l);
            }
        }
    }

    private final void d(Canvas canvas) {
        Canvas canvas2 = canvas;
        RectF b10 = b();
        int d10 = Af.a.d(b10.left);
        int d11 = Af.a.d(b10.top);
        int d12 = Af.a.d(b10.right);
        int d13 = Af.a.d(b10.bottom);
        if (d10 > 0 || d12 > 0 || d11 > 0 || d13 > 0) {
            Rect bounds = getBounds();
            C6496s.g(bounds, "getBounds(...)");
            int i10 = bounds.left;
            int i11 = bounds.top;
            int b11 = this.f44040g.b();
            int d14 = this.f44040g.d();
            int c10 = this.f44040g.c();
            int i12 = d12;
            int i13 = i11;
            int i14 = c10;
            int i15 = d11;
            int i16 = i10;
            int f10 = f(d10, d11, d12, d13, b11, d14, i14, this.f44040g.a());
            if (f10 == 0) {
                this.f44045l.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (d10 > 0) {
                    float f11 = (float) i16;
                    float f12 = (float) (i16 + d10);
                    int i17 = i13 + height;
                    float f13 = (float) (i17 - d13);
                    float f14 = (float) i17;
                    int b12 = this.f44040g.b();
                    Canvas canvas3 = canvas;
                    float f15 = f11;
                    c(canvas3, b12, f15, (float) i13, f12, (float) (i13 + i15), f12, f13, f11, f14);
                }
                if (i15 > 0) {
                    float f16 = (float) i13;
                    float f17 = (float) (i13 + i15);
                    int i18 = i16 + width;
                    float f18 = (float) (i18 - i12);
                    float f19 = (float) i18;
                    int d15 = this.f44040g.d();
                    Canvas canvas4 = canvas;
                    c(canvas4, d15, (float) i16, f16, (float) (i16 + d10), f17, f18, f17, f19, f16);
                }
                if (i12 > 0) {
                    int i19 = i16 + width;
                    float f20 = (float) i19;
                    int i20 = i13 + height;
                    float f21 = (float) (i19 - i12);
                    int c11 = this.f44040g.c();
                    Canvas canvas5 = canvas;
                    float f22 = f20;
                    c(canvas5, c11, f22, (float) i13, f20, (float) i20, f21, (float) (i20 - d13), f21, (float) (i13 + i15));
                }
                if (d13 > 0) {
                    int i21 = i13 + height;
                    float f23 = (float) i21;
                    int i22 = i16 + width;
                    float f24 = (float) (i21 - d13);
                    int a10 = this.f44040g.a();
                    Canvas canvas6 = canvas;
                    float f25 = f23;
                    c(canvas6, a10, (float) i16, f25, (float) i22, f23, (float) (i22 - i12), f24, (float) (i16 + d10), f24);
                }
                this.f44045l.setAntiAlias(true);
            } else if (Color.alpha(f10) != 0) {
                int i23 = bounds.right;
                int i24 = bounds.bottom;
                this.f44045l.setColor(n(f10, this.f44042i));
                this.f44045l.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                this.f44047n = path;
                if (d10 > 0) {
                    path.reset();
                    int d16 = Af.a.d(b10.left);
                    v(d16);
                    this.f44045l.setStrokeWidth((float) d16);
                    Path path2 = this.f44047n;
                    if (path2 != null) {
                        path2.moveTo((float) (i16 + (d16 / 2)), (float) i13);
                    }
                    Path path3 = this.f44047n;
                    if (path3 != null) {
                        path3.lineTo((float) (i16 + (d16 / 2)), (float) i24);
                    }
                    Path path4 = this.f44047n;
                    if (path4 != null) {
                        canvas2.drawPath(path4, this.f44045l);
                    }
                }
                if (i15 > 0) {
                    Path path5 = this.f44047n;
                    if (path5 != null) {
                        path5.reset();
                    }
                    int d17 = Af.a.d(b10.top);
                    v(d17);
                    this.f44045l.setStrokeWidth((float) d17);
                    Path path6 = this.f44047n;
                    if (path6 != null) {
                        path6.moveTo((float) i16, (float) (i13 + (d17 / 2)));
                    }
                    Path path7 = this.f44047n;
                    if (path7 != null) {
                        path7.lineTo((float) i23, (float) (i13 + (d17 / 2)));
                    }
                    Path path8 = this.f44047n;
                    if (path8 != null) {
                        canvas2.drawPath(path8, this.f44045l);
                    }
                }
                if (i12 > 0) {
                    Path path9 = this.f44047n;
                    if (path9 != null) {
                        path9.reset();
                    }
                    int d18 = Af.a.d(b10.right);
                    v(d18);
                    this.f44045l.setStrokeWidth((float) d18);
                    Path path10 = this.f44047n;
                    if (path10 != null) {
                        path10.moveTo((float) (i23 - (d18 / 2)), (float) i13);
                    }
                    Path path11 = this.f44047n;
                    if (path11 != null) {
                        path11.lineTo((float) (i23 - (d18 / 2)), (float) i24);
                    }
                    Path path12 = this.f44047n;
                    if (path12 != null) {
                        canvas2.drawPath(path12, this.f44045l);
                    }
                }
                if (d13 > 0) {
                    Path path13 = this.f44047n;
                    if (path13 != null) {
                        path13.reset();
                    }
                    int d19 = Af.a.d(b10.bottom);
                    v(d19);
                    this.f44045l.setStrokeWidth((float) d19);
                    Path path14 = this.f44047n;
                    if (path14 != null) {
                        path14.moveTo((float) i16, (float) (i24 - (d19 / 2)));
                    }
                    Path path15 = this.f44047n;
                    if (path15 != null) {
                        path15.lineTo((float) i23, (float) (i24 - (d19 / 2)));
                    }
                    Path path16 = this.f44047n;
                    if (path16 != null) {
                        canvas2.drawPath(path16, this.f44045l);
                    }
                }
            }
        }
    }

    private final void e(Canvas canvas) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f10;
        float f11;
        float f12;
        PointF pointF5;
        PointF pointF6;
        float f13;
        j c10;
        j c11;
        j c12;
        j c13;
        Canvas canvas2 = canvas;
        t();
        canvas.save();
        Path path = this.f44050q;
        if (path != null) {
            canvas2.clipPath(path);
            RectF b10 = b();
            float f14 = 0.0f;
            if (b10.top > 0.0f || b10.bottom > 0.0f || b10.left > 0.0f || b10.right > 0.0f) {
                float j10 = j();
                int g10 = g(m.f44918b);
                if (b10.top != j10 || b10.bottom != j10 || b10.left != j10 || b10.right != j10 || this.f44040g.b() != g10 || this.f44040g.d() != g10 || this.f44040g.c() != g10 || this.f44040g.a() != g10) {
                    this.f44045l.setStyle(Paint.Style.FILL);
                    if (Build.VERSION.SDK_INT >= 26) {
                        Path path2 = this.f44051r;
                        if (path2 != null) {
                            boolean unused = canvas2.clipOutPath(path2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        Path path3 = this.f44051r;
                        if (path3 != null) {
                            canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    RectF rectF = this.f44057x;
                    if (rectF != null) {
                        float f15 = rectF.left;
                        float f16 = rectF.right;
                        float f17 = rectF.top;
                        float f18 = rectF.bottom;
                        PointF pointF7 = this.f44054u;
                        if (pointF7 != null) {
                            PointF pointF8 = this.f44055v;
                            if (pointF8 != null) {
                                PointF pointF9 = this.f44052s;
                                if (pointF9 != null) {
                                    PointF pointF10 = this.f44053t;
                                    if (pointF10 != null) {
                                        if (b10.left > 0.0f) {
                                            float f19 = this.f44043j;
                                            float f20 = pointF7.x;
                                            float f21 = pointF7.y - f19;
                                            float f22 = pointF9.x;
                                            pointF4 = pointF10;
                                            pointF3 = pointF9;
                                            pointF2 = pointF8;
                                            pointF = pointF7;
                                            f12 = f18;
                                            f11 = f17;
                                            f10 = f16;
                                            c(canvas, this.f44040g.b(), f15, f17 - f19, f20, f21, f22, pointF9.y + f19, f15, f18 + f19);
                                        } else {
                                            pointF4 = pointF10;
                                            pointF3 = pointF9;
                                            pointF2 = pointF8;
                                            pointF = pointF7;
                                            f12 = f18;
                                            f11 = f17;
                                            f10 = f16;
                                        }
                                        if (b10.top > 0.0f) {
                                            float f23 = this.f44043j;
                                            PointF pointF11 = pointF;
                                            PointF pointF12 = pointF2;
                                            pointF5 = pointF12;
                                            c(canvas, this.f44040g.d(), f15 - f23, f11, pointF11.x - f23, pointF11.y, pointF12.x + f23, pointF12.y, f10 + f23, f11);
                                        } else {
                                            pointF5 = pointF2;
                                        }
                                        if (b10.right > 0.0f) {
                                            float f24 = this.f44043j;
                                            PointF pointF13 = pointF5;
                                            PointF pointF14 = pointF4;
                                            pointF6 = pointF14;
                                            c(canvas, this.f44040g.c(), f10, f11 - f24, pointF13.x, pointF13.y - f24, pointF14.x, pointF14.y + f24, f10, f12 + f24);
                                        } else {
                                            pointF6 = pointF4;
                                        }
                                        if (b10.bottom > 0.0f) {
                                            float f25 = this.f44043j;
                                            PointF pointF15 = pointF3;
                                            float f26 = pointF15.x - f25;
                                            float f27 = pointF15.y;
                                            PointF pointF16 = pointF6;
                                            c(canvas, this.f44040g.a(), f15 - f25, f12, f26, f27, pointF16.x + f25, pointF16.y, f10 + f25, f12);
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (j10 > 0.0f) {
                    this.f44045l.setColor(n(g10, this.f44042i));
                    this.f44045l.setStyle(Paint.Style.STROKE);
                    this.f44045l.setStrokeWidth(j10);
                    i iVar = this.f44041h;
                    if (iVar == null || !iVar.f()) {
                        Path path4 = this.f44049p;
                        if (path4 != null) {
                            canvas2.drawPath(path4, this.f44045l);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        RectF rectF2 = this.f44058y;
                        if (rectF2 != null) {
                            i iVar2 = this.f44041h;
                            if (iVar2 == null || (c12 = iVar2.c()) == null || (c13 = c12.c()) == null) {
                                f13 = 0.0f;
                            } else {
                                f13 = c13.a();
                            }
                            float f28 = f13 - (b10.left * 0.5f);
                            i iVar3 = this.f44041h;
                            if (!(iVar3 == null || (c10 = iVar3.c()) == null || (c11 = c10.c()) == null)) {
                                f14 = c11.b();
                            }
                            canvas2.drawRoundRect(rectF2, f28, f14 - (b10.top * 0.5f), this.f44045l);
                        }
                    }
                }
            }
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
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

    private final void i(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        PointF pointF2 = pointF;
        double d18 = (double) 2;
        double d19 = (d10 + d12) / d18;
        double d20 = (d11 + d13) / d18;
        double d21 = d14 - d19;
        double d22 = d15 - d20;
        double abs = Math.abs(d12 - d10) / d18;
        double abs2 = Math.abs(d13 - d11) / d18;
        double d23 = ((d17 - d20) - d22) / ((d16 - d19) - d21);
        double d24 = d22 - (d21 * d23);
        double d25 = abs2 * abs2;
        double d26 = abs * abs;
        double d27 = d25 + (d26 * d23 * d23);
        double d28 = d20;
        double d29 = d18 * abs * abs * d24 * d23;
        double d30 = d18 * d27;
        double sqrt = ((-d29) / d30) - Math.sqrt(((-(d26 * ((d24 * d24) - d25))) / d27) + Math.pow(d29 / d30, 2.0d));
        double d31 = sqrt + d19;
        double d32 = (d23 * sqrt) + d24 + d28;
        if (!Double.isNaN(d31) && !Double.isNaN(d32)) {
            PointF pointF3 = pointF;
            pointF3.x = (float) d31;
            pointF3.y = (float) d32;
        }
    }

    private final float j() {
        float f10;
        C3411f0 f0Var = this.f44035b;
        if (f0Var != null) {
            f10 = f0Var.b(8);
        } else {
            f10 = Float.NaN;
        }
        if (!Float.isNaN(f10)) {
            return f10;
        }
        return 0.0f;
    }

    private final float k(float f10, float f11) {
        return Ef.m.c(f10 - f11, 0.0f);
    }

    private final PathEffect l(f fVar, float f10) {
        int i10 = a.f44059a[fVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f11 = f10 * ((float) 3);
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        } else if (i10 == 3) {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        } else {
            throw new C6535s();
        }
    }

    private final d m(Object obj) {
        return new C0677b(obj, this);
    }

    private final int n(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * ((i11 + (i11 >> 7)) >> 7)) >> 8) << 24);
    }

    private final void t() {
        i iVar;
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        float f10;
        Path path;
        Path path2;
        Path path3;
        j b10;
        j a10;
        j d10;
        j c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.f44046m) {
            this.f44046m = false;
            Path path4 = this.f44051r;
            if (path4 == null) {
                path4 = new Path();
            }
            this.f44051r = path4;
            Path path5 = this.f44050q;
            if (path5 == null) {
                path5 = new Path();
            }
            this.f44050q = path5;
            this.f44048o = new Path();
            RectF rectF = this.f44056w;
            if (rectF == null) {
                rectF = new RectF();
            }
            this.f44056w = rectF;
            RectF rectF2 = this.f44057x;
            if (rectF2 == null) {
                rectF2 = new RectF();
            }
            this.f44057x = rectF2;
            RectF rectF3 = this.f44058y;
            if (rectF3 == null) {
                rectF3 = new RectF();
            }
            this.f44058y = rectF3;
            Path path6 = this.f44051r;
            if (path6 != null) {
                path6.reset();
                C6514M m10 = C6514M.f71813a;
            }
            Path path7 = this.f44050q;
            if (path7 != null) {
                path7.reset();
                C6514M m11 = C6514M.f71813a;
            }
            RectF rectF4 = this.f44056w;
            if (rectF4 != null) {
                rectF4.set(getBounds());
                C6514M m12 = C6514M.f71813a;
            }
            RectF rectF5 = this.f44057x;
            if (rectF5 != null) {
                rectF5.set(getBounds());
                C6514M m13 = C6514M.f71813a;
            }
            RectF rectF6 = this.f44058y;
            if (rectF6 != null) {
                rectF6.set(getBounds());
                C6514M m14 = C6514M.f71813a;
            }
            RectF b11 = b();
            if (!(Color.alpha(this.f44040g.b()) == 0 || Color.alpha(this.f44040g.d()) == 0 || Color.alpha(this.f44040g.c()) == 0 || Color.alpha(this.f44040g.a()) == 0)) {
                RectF rectF7 = this.f44056w;
                if (rectF7 != null) {
                    if (rectF7 != null) {
                        f20 = rectF7.top + b11.top;
                    } else {
                        f20 = 0.0f;
                    }
                    rectF7.top = f20;
                    C6514M m15 = C6514M.f71813a;
                }
                if (rectF7 != null) {
                    if (rectF7 != null) {
                        f19 = rectF7.bottom - b11.bottom;
                    } else {
                        f19 = 0.0f;
                    }
                    rectF7.bottom = f19;
                    C6514M m16 = C6514M.f71813a;
                }
                if (rectF7 != null) {
                    if (rectF7 != null) {
                        f18 = rectF7.left + b11.left;
                    } else {
                        f18 = 0.0f;
                    }
                    rectF7.left = f18;
                    C6514M m17 = C6514M.f71813a;
                }
                if (rectF7 != null) {
                    if (rectF7 != null) {
                        f17 = rectF7.right - b11.right;
                    } else {
                        f17 = 0.0f;
                    }
                    rectF7.right = f17;
                    C6514M m18 = C6514M.f71813a;
                }
            }
            RectF rectF8 = this.f44058y;
            if (rectF8 != null) {
                if (rectF8 != null) {
                    f16 = rectF8.top + (b11.top * 0.5f);
                } else {
                    f16 = 0.0f;
                }
                rectF8.top = f16;
                C6514M m19 = C6514M.f71813a;
            }
            if (rectF8 != null) {
                if (rectF8 != null) {
                    f15 = rectF8.bottom - (b11.bottom * 0.5f);
                } else {
                    f15 = 0.0f;
                }
                rectF8.bottom = f15;
                C6514M m20 = C6514M.f71813a;
            }
            if (rectF8 != null) {
                if (rectF8 != null) {
                    f14 = rectF8.left + (b11.left * 0.5f);
                } else {
                    f14 = 0.0f;
                }
                rectF8.left = f14;
                C6514M m21 = C6514M.f71813a;
            }
            if (rectF8 != null) {
                if (rectF8 != null) {
                    f13 = rectF8.right - (b11.right * 0.5f);
                } else {
                    f13 = 0.0f;
                }
                rectF8.right = f13;
                C6514M m22 = C6514M.f71813a;
            }
            e eVar = this.f44036c;
            if (eVar != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f44034a;
                RectF rectF9 = this.f44057x;
                if (rectF9 != null) {
                    f11 = G.f41415a.d(rectF9.width());
                } else {
                    f11 = 0.0f;
                }
                RectF rectF10 = this.f44057x;
                if (rectF10 != null) {
                    f12 = G.f41415a.d(rectF10.height());
                } else {
                    f12 = 0.0f;
                }
                iVar = eVar.d(layoutDirection, context, f11, f12);
            } else {
                iVar = null;
            }
            this.f44041h = iVar;
            if (iVar == null || (c10 = iVar.c()) == null || (jVar = c10.c()) == null) {
                jVar = new j(0.0f, 0.0f);
            }
            i iVar2 = this.f44041h;
            if (iVar2 == null || (d10 = iVar2.d()) == null || (jVar2 = d10.c()) == null) {
                jVar2 = new j(0.0f, 0.0f);
            }
            i iVar3 = this.f44041h;
            if (iVar3 == null || (a10 = iVar3.a()) == null || (jVar3 = a10.c()) == null) {
                jVar3 = new j(0.0f, 0.0f);
            }
            i iVar4 = this.f44041h;
            if (iVar4 == null || (b10 = iVar4.b()) == null || (jVar4 = b10.c()) == null) {
                jVar4 = new j(0.0f, 0.0f);
            }
            float k10 = k(jVar.a(), b11.left);
            float k11 = k(jVar.b(), b11.top);
            float k12 = k(jVar2.a(), b11.right);
            float k13 = k(jVar2.b(), b11.top);
            float k14 = k(jVar4.a(), b11.right);
            float k15 = k(jVar4.b(), b11.bottom);
            float k16 = k(jVar3.a(), b11.left);
            float k17 = k(jVar3.b(), b11.bottom);
            RectF rectF11 = this.f44056w;
            if (!(rectF11 == null || (path3 = this.f44051r) == null)) {
                path3.addRoundRect(rectF11, new float[]{k10, k11, k12, k13, k14, k15, k16, k17}, Path.Direction.CW);
                C6514M m23 = C6514M.f71813a;
            }
            RectF rectF12 = this.f44057x;
            if (!(rectF12 == null || (path2 = this.f44050q) == null)) {
                path2.addRoundRect(rectF12, new float[]{jVar.a(), jVar.b(), jVar2.a(), jVar2.b(), jVar4.a(), jVar4.b(), jVar3.a(), jVar3.b()}, Path.Direction.CW);
                C6514M m24 = C6514M.f71813a;
            }
            C3411f0 f0Var = this.f44035b;
            if (f0Var != null) {
                f10 = f0Var.a(8) / 2.0f;
            } else {
                f10 = 0.0f;
            }
            Path path8 = this.f44048o;
            if (path8 != null) {
                path8.addRoundRect(new RectF(getBounds()), new float[]{jVar.a() + f10, jVar.b() + f10, jVar2.a() + f10, jVar2.b() + f10, jVar4.a() + f10, jVar4.b() + f10, jVar3.a() + f10, jVar3.b() + f10}, Path.Direction.CW);
                C6514M m25 = C6514M.f71813a;
            }
            i iVar5 = this.f44041h;
            if (iVar5 == null || !iVar5.f()) {
                Path path9 = this.f44049p;
                if (path9 == null) {
                    path9 = new Path();
                }
                this.f44049p = path9;
                path9.reset();
                C6514M m26 = C6514M.f71813a;
                RectF rectF13 = this.f44058y;
                if (!(rectF13 == null || (path = this.f44049p) == null)) {
                    path.addRoundRect(rectF13, new float[]{jVar.a() - (b11.left * 0.5f), jVar.b() - (b11.top * 0.5f), jVar2.a() - (b11.right * 0.5f), jVar2.b() - (b11.top * 0.5f), jVar4.a() - (b11.right * 0.5f), jVar4.b() - (b11.bottom * 0.5f), jVar3.a() - (b11.left * 0.5f), jVar3.b() - (b11.bottom * 0.5f)}, Path.Direction.CW);
                    C6514M m27 = C6514M.f71813a;
                }
            }
            RectF rectF14 = this.f44056w;
            RectF rectF15 = this.f44057x;
            if (rectF14 != null && rectF15 != null) {
                PointF pointF = this.f44054u;
                if (pointF == null) {
                    pointF = new PointF();
                }
                PointF pointF2 = pointF;
                this.f44054u = pointF2;
                pointF2.x = rectF14.left;
                C6514M m28 = C6514M.f71813a;
                pointF2.y = rectF14.top;
                C6514M m29 = C6514M.f71813a;
                float f21 = rectF14.left;
                float f22 = rectF14.top;
                float f23 = (float) 2;
                RectF rectF16 = rectF15;
                double d11 = (double) f21;
                RectF rectF17 = rectF14;
                double d12 = (double) f22;
                RectF rectF18 = rectF17;
                double d13 = d11;
                i(d13, (double) f22, (double) ((k10 * f23) + f21), (double) ((f23 * k11) + f22), (double) rectF15.left, (double) rectF15.top, (double) f21, d12, pointF2);
                C6514M m30 = C6514M.f71813a;
                PointF pointF3 = this.f44052s;
                if (pointF3 == null) {
                    pointF3 = new PointF();
                }
                PointF pointF4 = pointF3;
                this.f44052s = pointF4;
                RectF rectF19 = rectF18;
                pointF4.x = rectF19.left;
                C6514M m31 = C6514M.f71813a;
                pointF4.y = rectF19.bottom;
                C6514M m32 = C6514M.f71813a;
                float f24 = rectF19.left;
                float f25 = rectF19.bottom;
                float f26 = (float) 2;
                RectF rectF20 = rectF16;
                RectF rectF21 = rectF20;
                RectF rectF22 = rectF19;
                RectF rectF23 = rectF21;
                PointF pointF5 = pointF4;
                RectF rectF24 = rectF23;
                i((double) f24, (double) (f25 - (k17 * f26)), (double) ((f26 * k16) + f24), (double) f25, (double) rectF20.left, (double) rectF21.bottom, (double) f24, (double) f25, pointF5);
                C6514M m33 = C6514M.f71813a;
                PointF pointF6 = this.f44055v;
                if (pointF6 == null) {
                    pointF6 = new PointF();
                }
                PointF pointF7 = pointF6;
                this.f44055v = pointF7;
                RectF rectF25 = rectF22;
                pointF7.x = rectF25.right;
                C6514M m34 = C6514M.f71813a;
                pointF7.y = rectF25.top;
                C6514M m35 = C6514M.f71813a;
                float f27 = rectF25.right;
                float f28 = (float) 2;
                float f29 = rectF25.top;
                RectF rectF26 = rectF24;
                RectF rectF27 = rectF26;
                RectF rectF28 = rectF27;
                RectF rectF29 = rectF25;
                PointF pointF8 = pointF7;
                double d14 = (double) (f27 - (k12 * f28));
                RectF rectF30 = rectF28;
                i(d14, (double) f29, (double) f27, (double) ((f28 * k13) + f29), (double) rectF26.right, (double) rectF27.top, (double) f27, (double) f29, pointF8);
                C6514M m36 = C6514M.f71813a;
                PointF pointF9 = this.f44053t;
                if (pointF9 == null) {
                    pointF9 = new PointF();
                }
                PointF pointF10 = pointF9;
                this.f44053t = pointF10;
                RectF rectF31 = rectF29;
                pointF10.x = rectF31.right;
                C6514M m37 = C6514M.f71813a;
                pointF10.y = rectF31.bottom;
                C6514M m38 = C6514M.f71813a;
                float f30 = rectF31.right;
                float f31 = (float) 2;
                float f32 = rectF31.bottom;
                RectF rectF32 = rectF30;
                double d15 = (double) (f30 - (k14 * f31));
                i(d15, (double) (f32 - (f31 * k15)), (double) f30, (double) f32, (double) rectF32.right, (double) rectF32.bottom, (double) f30, (double) f32, pointF10);
                C6514M m39 = C6514M.f71813a;
            }
        }
    }

    private final void u() {
        PathEffect pathEffect;
        f h10 = h();
        if (h10 != null) {
            if (h() != null) {
                pathEffect = l(h10, j());
            } else {
                pathEffect = null;
            }
            this.f44045l.setPathEffect(pathEffect);
        }
    }

    private final void v(int i10) {
        PathEffect pathEffect;
        f h10 = h();
        if (h10 != null) {
            if (h() != null) {
                pathEffect = l(h10, (float) i10);
            } else {
                pathEffect = null;
            }
            this.f44045l.setPathEffect(pathEffect);
        }
    }

    public void draw(Canvas canvas) {
        h hVar;
        C6496s.h(canvas, "canvas");
        u();
        Integer[] numArr = this.f44039f;
        if (numArr == null || (hVar = j8.b.c(numArr, getLayoutDirection(), this.f44034a)) == null) {
            hVar = this.f44040g;
        }
        this.f44040g = hVar;
        e eVar = this.f44036c;
        if (eVar == null || !eVar.c()) {
            d(canvas);
        } else {
            e(canvas);
        }
    }

    public final int g(m mVar) {
        Integer num;
        C6496s.h(mVar, "position");
        Integer[] numArr = this.f44039f;
        if (numArr == null || (num = numArr[mVar.ordinal()]) == null) {
            return -16777216;
        }
        return num.intValue();
    }

    public int getOpacity() {
        if (C6632a.i(Color.alpha(n(this.f44040g.b(), this.f44042i)), Color.alpha(n(this.f44040g.d(), this.f44042i)), Color.alpha(n(this.f44040g.c(), this.f44042i)), Color.alpha(n(this.f44040g.a(), this.f44042i))) == 0) {
            return -2;
        }
        if (C6632a.i(Color.alpha(n(this.f44040g.b(), this.f44042i)), Color.alpha(n(this.f44040g.d(), this.f44042i)), Color.alpha(n(this.f44040g.c(), this.f44042i)), Color.alpha(n(this.f44040g.a(), this.f44042i))) == 255) {
            return -1;
        }
        return -3;
    }

    public final f h() {
        return (f) this.f44038e.a(this, f44033z[0]);
    }

    public void invalidateSelf() {
        this.f44046m = true;
        super.invalidateSelf();
    }

    public final void o(m mVar, Integer num) {
        C6496s.h(mVar, "position");
        Integer[] numArr = this.f44039f;
        if (numArr == null) {
            numArr = j8.b.b((Integer[]) null, 1, (DefaultConstructorMarker) null);
        }
        this.f44039f = numArr;
        if (numArr != null) {
            numArr[mVar.ordinal()] = num;
        }
        this.f44046m = true;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        C6496s.h(rect, "bounds");
        super.onBoundsChange(rect);
        this.f44046m = true;
    }

    public final void p(c cVar) {
        this.f44037d = cVar;
    }

    public final void q(e eVar) {
        this.f44036c = eVar;
    }

    public final void r(f fVar) {
        this.f44038e.b(this, f44033z[0], fVar);
    }

    public final void s(int i10, float f10) {
        Float f11;
        C3411f0 f0Var = this.f44035b;
        if (f0Var != null) {
            f11 = Float.valueOf(f0Var.b(i10));
        } else {
            f11 = null;
        }
        if (!C3421n.b(f11, Float.valueOf(f10))) {
            C3411f0 f0Var2 = this.f44035b;
            if (f0Var2 != null) {
                f0Var2.c(i10, f10);
            }
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                this.f44046m = true;
            }
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        this.f44042i = i10;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
