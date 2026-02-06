package R6;

import P6.b;
import P6.c;
import P6.d;
import P6.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

public class a implements P6.a {

    /* renamed from: a  reason: collision with root package name */
    private final S6.a f33704a;

    /* renamed from: b  reason: collision with root package name */
    private final e f33705b;

    /* renamed from: c  reason: collision with root package name */
    private final c f33706c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f33707d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f33708e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f33709f;

    /* renamed from: g  reason: collision with root package name */
    private final int f33710g;

    /* renamed from: h  reason: collision with root package name */
    private final b[] f33711h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f33712i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    private final Rect f33713j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f33714k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f33715l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f33716m;

    public a(S6.a aVar, e eVar, Rect rect, boolean z10) {
        this.f33704a = aVar;
        this.f33705b = eVar;
        c d10 = eVar.d();
        this.f33706c = d10;
        int[] t10 = d10.t();
        this.f33708e = t10;
        aVar.a(t10);
        this.f33710g = aVar.c(t10);
        this.f33709f = aVar.b(t10);
        this.f33707d = o(d10, rect);
        this.f33714k = z10;
        this.f33711h = new b[d10.a()];
        for (int i10 = 0; i10 < this.f33706c.a(); i10++) {
            this.f33711h[i10] = this.f33706c.c(i10);
        }
        Paint paint = new Paint();
        this.f33715l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void n() {
        Bitmap bitmap = this.f33716m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f33716m = null;
        }
    }

    private static Rect o(c cVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, cVar.e(), cVar.d());
        }
        return new Rect(0, 0, Math.min(rect.width(), cVar.e()), Math.min(rect.height(), cVar.d()));
    }

    private void p(Canvas canvas, float f10, float f11, b bVar) {
        if (bVar.f33493g == b.C0547b.DISPOSE_TO_BACKGROUND) {
            int ceil = (int) Math.ceil((double) (((float) bVar.f33488b) * f10));
            int ceil2 = (int) Math.ceil((double) (((float) bVar.f33489c) * f11));
            canvas.drawRect(new Rect(ceil, ceil2, ((int) Math.ceil((double) (((float) bVar.f33490d) * f10))) + ceil, ((int) Math.ceil((double) (((float) bVar.f33491e) * f11))) + ceil2), this.f33715l);
        }
    }

    private synchronized Bitmap q(int i10, int i11) {
        try {
            Bitmap bitmap = this.f33716m;
            if (bitmap != null) {
                if (bitmap.getWidth() >= i10) {
                    if (this.f33716m.getHeight() < i11) {
                    }
                }
                n();
            }
            if (this.f33716m == null) {
                this.f33716m = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f33716m.eraseColor(0);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f33716m;
    }

    private void r(Canvas canvas, d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f33714k) {
            float max = Math.max(((float) dVar.e()) / ((float) Math.min(dVar.e(), canvas.getWidth())), ((float) dVar.d()) / ((float) Math.min(dVar.d(), canvas.getHeight())));
            i12 = (int) (((float) dVar.e()) / max);
            i11 = (int) (((float) dVar.d()) / max);
            i10 = (int) (((float) dVar.b()) / max);
            i13 = (int) (((float) dVar.c()) / max);
        } else {
            i12 = dVar.e();
            i11 = dVar.d();
            i10 = dVar.b();
            i13 = dVar.c();
        }
        synchronized (this) {
            Bitmap q10 = q(i12, i11);
            this.f33716m = q10;
            dVar.a(i12, i11, q10);
            canvas.save();
            canvas.translate((float) i10, (float) i13);
            canvas.drawBitmap(this.f33716m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void s(Canvas canvas, d dVar) {
        double width = ((double) this.f33707d.width()) / ((double) this.f33706c.e());
        double height = ((double) this.f33707d.height()) / ((double) this.f33706c.d());
        int round = (int) Math.round(((double) dVar.e()) * width);
        int round2 = (int) Math.round(((double) dVar.d()) * height);
        int b10 = (int) (((double) dVar.b()) * width);
        int c10 = (int) (((double) dVar.c()) * height);
        synchronized (this) {
            try {
                int width2 = this.f33707d.width();
                int height2 = this.f33707d.height();
                q(width2, height2);
                Bitmap bitmap = this.f33716m;
                if (bitmap != null) {
                    dVar.a(round, round2, bitmap);
                }
                this.f33712i.set(0, 0, width2, height2);
                this.f33713j.set(b10, c10, width2 + b10, height2 + c10);
                Bitmap bitmap2 = this.f33716m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f33712i, this.f33713j, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void t(Canvas canvas, d dVar, b bVar, b bVar2) {
        Rect rect = this.f33707d;
        if (rect != null && rect.width() > 0 && this.f33707d.height() > 0) {
            float width = ((float) canvas.getWidth()) / ((float) this.f33707d.width());
            if (bVar2 != null) {
                p(canvas, width, width, bVar2);
            }
            int e10 = dVar.e();
            int d10 = dVar.d();
            Rect rect2 = new Rect(0, 0, e10, d10);
            int b10 = (int) (((float) dVar.b()) * width);
            int c10 = (int) (((float) dVar.c()) * width);
            Rect rect3 = new Rect(b10, c10, ((int) (((float) e10) * width)) + b10, ((int) (((float) d10) * width)) + c10);
            if (bVar.f33492f == b.a.NO_BLEND) {
                canvas.drawRect(rect3, this.f33715l);
            }
            synchronized (this) {
                Bitmap q10 = q(e10, d10);
                dVar.a(e10, d10, q10);
                canvas.drawBitmap(q10, rect2, rect3, (Paint) null);
            }
        }
    }

    private void u(Canvas canvas, d dVar, b bVar, b bVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int e10 = this.f33706c.e();
        int d10 = this.f33706c.d();
        float f14 = (float) e10;
        float f15 = (float) d10;
        int e11 = dVar.e();
        int d11 = dVar.d();
        int b10 = dVar.b();
        int c10 = dVar.c();
        if (f14 > ((float) canvas.getWidth()) || f15 > ((float) canvas.getHeight())) {
            int min = Math.min(canvas.getWidth(), e10);
            int min2 = Math.min(canvas.getHeight(), d10);
            float f16 = f14 / f15;
            if (min > min2) {
                f13 = (float) min;
                f12 = f13 / f16;
            } else {
                f12 = (float) min2;
                f13 = f12 * f16;
            }
            f11 = f13 / f14;
            f10 = f12 / f15;
            e11 = (int) Math.ceil((double) (((float) dVar.e()) * f11));
            d11 = (int) Math.ceil((double) (((float) dVar.d()) * f10));
            b10 = (int) Math.ceil((double) (((float) dVar.b()) * f11));
            c10 = (int) Math.ceil((double) (((float) dVar.c()) * f10));
        } else {
            f11 = 1.0f;
            f10 = 1.0f;
        }
        Rect rect = new Rect(0, 0, e11, d11);
        Rect rect2 = new Rect(b10, c10, b10 + e11, c10 + d11);
        if (bVar2 != null) {
            p(canvas, f11, f10, bVar2);
        }
        if (bVar.f33492f == b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f33715l);
        }
        synchronized (this) {
            Bitmap q10 = q(e11, d11);
            dVar.a(e11, d11, q10);
            canvas.drawBitmap(q10, rect, rect2, (Paint) null);
        }
    }

    public int a() {
        return this.f33706c.a();
    }

    public int b() {
        return this.f33706c.b();
    }

    public b c(int i10) {
        return this.f33711h[i10];
    }

    public int d() {
        return this.f33706c.d();
    }

    public int e() {
        return this.f33706c.e();
    }

    public int f() {
        return this.f33710g;
    }

    public void g(int i10, Canvas canvas) {
        d s10 = this.f33706c.s(i10);
        try {
            if (s10.e() > 0) {
                if (s10.d() > 0) {
                    if (this.f33706c.q()) {
                        s(canvas, s10);
                    } else {
                        r(canvas, s10);
                    }
                    s10.dispose();
                }
            }
        } finally {
            s10.dispose();
        }
    }

    public P6.a h(Rect rect) {
        if (o(this.f33706c, rect).equals(this.f33707d)) {
            return this;
        }
        return new a(this.f33704a, this.f33705b, rect, this.f33714k);
    }

    public int i(int i10) {
        return this.f33708e[i10];
    }

    public int j() {
        return this.f33707d.height();
    }

    public void k(int i10, Canvas canvas) {
        b bVar;
        d s10 = this.f33706c.s(i10);
        b c10 = this.f33706c.c(i10);
        if (i10 == 0) {
            bVar = null;
        } else {
            bVar = this.f33706c.c(i10 - 1);
        }
        try {
            if (s10.e() > 0) {
                if (s10.d() > 0) {
                    if (this.f33706c.q()) {
                        u(canvas, s10, c10, bVar);
                    } else {
                        t(canvas, s10, c10, bVar);
                    }
                    s10.dispose();
                }
            }
        } finally {
            s10.dispose();
        }
    }

    public int l() {
        return this.f33707d.width();
    }

    public e m() {
        return this.f33705b;
    }
}
