package w6;

import U6.d;
import X5.a;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.C4106a;
import v6.C4108c;
import v6.C4109d;
import y6.C4188a;
import y6.C4189b;
import yf.C6787a;

/* renamed from: w6.a  reason: case insensitive filesystem */
public final class C4141a implements C4106a, C4108c.b {

    /* renamed from: r  reason: collision with root package name */
    public static final C0747a f49207r = new C0747a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    private static final Class f49208s = C4141a.class;

    /* renamed from: a  reason: collision with root package name */
    private final d f49209a;

    /* renamed from: b  reason: collision with root package name */
    private final C4142b f49210b;

    /* renamed from: c  reason: collision with root package name */
    private final C4109d f49211c;

    /* renamed from: d  reason: collision with root package name */
    private final C4143c f49212d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f49213e;

    /* renamed from: f  reason: collision with root package name */
    private final C4188a f49214f;

    /* renamed from: g  reason: collision with root package name */
    private final C4189b f49215g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f49216h = null;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap.Config f49217i = Bitmap.Config.ARGB_8888;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f49218j = new Paint(6);

    /* renamed from: k  reason: collision with root package name */
    private Rect f49219k;

    /* renamed from: l  reason: collision with root package name */
    private int f49220l;

    /* renamed from: m  reason: collision with root package name */
    private int f49221m;

    /* renamed from: n  reason: collision with root package name */
    private final Path f49222n = new Path();

    /* renamed from: o  reason: collision with root package name */
    private final Matrix f49223o = new Matrix();

    /* renamed from: p  reason: collision with root package name */
    private int f49224p = -1;

    /* renamed from: q  reason: collision with root package name */
    private C4106a.C0739a f49225q;

    /* renamed from: w6.a$a  reason: collision with other inner class name */
    public static final class C0747a {
        public /* synthetic */ C0747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0747a() {
        }
    }

    public C4141a(d dVar, C4142b bVar, C4109d dVar2, C4143c cVar, boolean z10, C4188a aVar, C4189b bVar2, I6.d dVar3) {
        C6496s.h(dVar, "platformBitmapFactory");
        C6496s.h(bVar, "bitmapFrameCache");
        C6496s.h(dVar2, "animationInformation");
        C6496s.h(cVar, "bitmapFrameRenderer");
        this.f49209a = dVar;
        this.f49210b = bVar;
        this.f49211c = dVar2;
        this.f49212d = cVar;
        this.f49213e = z10;
        this.f49214f = aVar;
        this.f49215g = bVar2;
        s();
    }

    private final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f49219k;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f49218j);
        } else if (t(i10, bitmap, (float) rect.width(), (float) rect.height())) {
            canvas.drawPath(this.f49222n, this.f49218j);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f49218j);
        }
    }

    private final boolean p(int i10, a aVar, Canvas canvas, int i11) {
        if (aVar == null || !a.T(aVar)) {
            return false;
        }
        Object I10 = aVar.I();
        C6496s.g(I10, "get(...)");
        o(i10, (Bitmap) I10, canvas);
        if (i11 == 3 || this.f49213e) {
            return true;
        }
        this.f49210b.d(i10, aVar, i11);
        return true;
    }

    private final boolean q(Canvas canvas, int i10, int i11) {
        boolean z10;
        a aVar;
        a aVar2 = null;
        try {
            boolean z11 = false;
            int i12 = 1;
            if (this.f49213e) {
                C4188a aVar3 = this.f49214f;
                if (aVar3 != null) {
                    aVar = aVar3.b(i10, canvas.getWidth(), canvas.getHeight());
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    try {
                        if (aVar.Q()) {
                            Object I10 = aVar.I();
                            C6496s.g(I10, "get(...)");
                            o(i10, (Bitmap) I10, canvas);
                            a.E(aVar);
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        a.E(aVar2);
                        throw th;
                    }
                }
                C4188a aVar4 = this.f49214f;
                if (aVar4 != null) {
                    aVar4.a(canvas.getWidth(), canvas.getHeight(), (C6787a) null);
                }
                a.E(aVar);
                return false;
            }
            if (i11 == 0) {
                aVar2 = this.f49210b.e(i10);
                z10 = p(i10, aVar2, canvas, 0);
            } else if (i11 == 1) {
                aVar2 = this.f49210b.c(i10, this.f49220l, this.f49221m);
                if (r(i10, aVar2) && p(i10, aVar2, canvas, 1)) {
                    z11 = true;
                }
                z10 = z11;
                i12 = 2;
            } else if (i11 == 2) {
                aVar2 = this.f49209a.b(this.f49220l, this.f49221m, this.f49217i);
                if (r(i10, aVar2) && p(i10, aVar2, canvas, 2)) {
                    z11 = true;
                }
                z10 = z11;
                i12 = 3;
            } else if (i11 != 3) {
                a.E((a) null);
                return false;
            } else {
                aVar2 = this.f49210b.b(i10);
                z10 = p(i10, aVar2, canvas, 3);
                i12 = -1;
            }
            a.E(aVar2);
            if (z10 || i12 == -1) {
                return z10;
            }
            return q(canvas, i10, i12);
        } catch (RuntimeException e10) {
            U5.a.F(f49208s, "Failed to create frame bitmap", e10);
            a.E((a) null);
            return false;
        } catch (Throwable th3) {
            th = th3;
            a.E(aVar2);
            throw th;
        }
    }

    private final boolean r(int i10, a aVar) {
        if (aVar == null || !aVar.Q()) {
            return false;
        }
        C4143c cVar = this.f49212d;
        Object I10 = aVar.I();
        C6496s.g(I10, "get(...)");
        boolean a10 = cVar.a(i10, (Bitmap) I10);
        if (!a10) {
            a.E(aVar);
        }
        return a10;
    }

    private final void s() {
        int i10;
        int e10 = this.f49212d.e();
        this.f49220l = e10;
        int i11 = -1;
        if (e10 == -1) {
            Rect rect = this.f49219k;
            if (rect != null) {
                i10 = rect.width();
            } else {
                i10 = -1;
            }
            this.f49220l = i10;
        }
        int c10 = this.f49212d.c();
        this.f49221m = c10;
        if (c10 == -1) {
            Rect rect2 = this.f49219k;
            if (rect2 != null) {
                i11 = rect2.height();
            }
            this.f49221m = i11;
        }
    }

    private final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.f49216h == null) {
            return false;
        }
        if (i10 == this.f49224p) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f49223o.setRectToRect(new RectF(0.0f, 0.0f, (float) this.f49220l, (float) this.f49221m), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f49223o);
        this.f49218j.setShader(bitmapShader);
        this.f49222n.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.f49216h, Path.Direction.CW);
        this.f49224p = i10;
        return true;
    }

    public int a() {
        return this.f49211c.a();
    }

    public int b() {
        return this.f49211c.b();
    }

    public int c() {
        return this.f49221m;
    }

    public void clear() {
        if (this.f49213e) {
            C4188a aVar = this.f49214f;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        this.f49210b.clear();
    }

    public void d(Rect rect) {
        this.f49219k = rect;
        this.f49212d.d(rect);
        s();
    }

    public int e() {
        return this.f49220l;
    }

    public void f(ColorFilter colorFilter) {
        this.f49218j.setColorFilter(colorFilter);
    }

    public int g() {
        return this.f49211c.g();
    }

    public boolean h(Drawable drawable, Canvas canvas, int i10) {
        C4189b bVar;
        C4188a aVar;
        C6496s.h(drawable, "parent");
        C6496s.h(canvas, "canvas");
        boolean q10 = q(canvas, i10, 0);
        if (!(this.f49213e || (bVar = this.f49215g) == null || (aVar = this.f49214f) == null)) {
            C4188a.C0754a.f(aVar, bVar, this.f49210b, this, i10, (C6787a) null, 16, (Object) null);
        }
        return q10;
    }

    public void i(C4106a.C0739a aVar) {
        this.f49225q = aVar;
    }

    public void j() {
        if (this.f49213e) {
            C4188a aVar = this.f49214f;
            if (aVar != null) {
                aVar.onStop();
                return;
            }
            return;
        }
        clear();
    }

    public int k() {
        return this.f49211c.k();
    }

    public int l(int i10) {
        return this.f49211c.l(i10);
    }

    public void m(int i10) {
        this.f49218j.setAlpha(i10);
    }

    public int n() {
        return this.f49211c.n();
    }
}
