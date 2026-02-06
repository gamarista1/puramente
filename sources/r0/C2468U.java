package r0;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.c;
import r0.i2;
import r0.j2;

/* renamed from: r0.U  reason: case insensitive filesystem */
public abstract class C2468U {

    /* renamed from: r0.U$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25463a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25464b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f25465c;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f25463a = r0
                android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f25464b = r0
                android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f25465c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.C2468U.a.<clinit>():void");
        }
    }

    public static final Q1 a() {
        return new C2467T();
    }

    public static final Q1 b(Paint paint) {
        return new C2467T(paint);
    }

    public static final float c(Paint paint) {
        return ((float) paint.getAlpha()) / 255.0f;
    }

    public static final long d(Paint paint) {
        return C2550z0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        if (!paint.isFilterBitmap()) {
            return C1.f25397a.b();
        }
        return C1.f25397a.a();
    }

    public static final int f(Paint paint) {
        int i10;
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i10 = -1;
        } else {
            i10 = a.f25464b[strokeCap.ordinal()];
        }
        if (i10 == 1) {
            return i2.f25529a.a();
        }
        if (i10 == 2) {
            return i2.f25529a.b();
        }
        if (i10 != 3) {
            return i2.f25529a.a();
        }
        return i2.f25529a.c();
    }

    public static final int g(Paint paint) {
        int i10;
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i10 = -1;
        } else {
            i10 = a.f25465c[strokeJoin.ordinal()];
        }
        if (i10 == 1) {
            return j2.f25533a.b();
        }
        if (i10 == 2) {
            return j2.f25533a.a();
        }
        if (i10 != 3) {
            return j2.f25533a.b();
        }
        return j2.f25533a.c();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) ((float) Math.rint((double) (f10 * 255.0f))));
    }

    public static final void l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            p2.f25550a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C2444F.c(i10)));
        }
    }

    public static final void m(Paint paint, long j10) {
        paint.setColor(C2550z0.k(j10));
    }

    public static final void n(Paint paint, C2547y0 y0Var) {
        ColorFilter colorFilter;
        if (y0Var != null) {
            colorFilter = C2450I.d(y0Var);
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public static final void o(Paint paint, int i10) {
        paint.setFilterBitmap(!C1.d(i10, C1.f25397a.b()));
    }

    public static final void p(Paint paint, T1 t12) {
        c.a(t12);
        paint.setPathEffect((PathEffect) null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i10) {
        Paint.Cap cap;
        i2.a aVar = i2.f25529a;
        if (i2.e(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (i2.e(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else if (i2.e(i10, aVar.a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i10) {
        Paint.Join join;
        j2.a aVar = j2.f25533a;
        if (j2.e(i10, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (j2.e(i10, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else if (j2.e(i10, aVar.c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void v(Paint paint, int i10) {
        Paint.Style style;
        if (R1.d(i10, R1.f25451a.b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
