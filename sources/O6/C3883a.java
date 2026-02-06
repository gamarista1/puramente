package o6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p6.C3935b;
import q6.q;

/* renamed from: o6.a  reason: case insensitive filesystem */
public class C3883a extends Drawable implements C3935b {

    /* renamed from: a  reason: collision with root package name */
    private String f47058a;

    /* renamed from: b  reason: collision with root package name */
    private String f47059b;

    /* renamed from: c  reason: collision with root package name */
    private int f47060c;

    /* renamed from: d  reason: collision with root package name */
    private int f47061d;

    /* renamed from: e  reason: collision with root package name */
    private int f47062e;

    /* renamed from: f  reason: collision with root package name */
    private String f47063f;

    /* renamed from: g  reason: collision with root package name */
    private q f47064g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f47065h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private int f47066i;

    /* renamed from: j  reason: collision with root package name */
    private int f47067j;

    /* renamed from: k  reason: collision with root package name */
    private int f47068k = 80;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f47069l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f47070m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f47071n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final RectF f47072o = new RectF();

    /* renamed from: p  reason: collision with root package name */
    private int f47073p;

    /* renamed from: q  reason: collision with root package name */
    private int f47074q;

    /* renamed from: r  reason: collision with root package name */
    private int f47075r;

    /* renamed from: s  reason: collision with root package name */
    private int f47076s;

    /* renamed from: t  reason: collision with root package name */
    private int f47077t;

    /* renamed from: u  reason: collision with root package name */
    private long f47078u;

    /* renamed from: v  reason: collision with root package name */
    private String f47079v;

    /* renamed from: w  reason: collision with root package name */
    private int f47080w = -1;

    /* renamed from: x  reason: collision with root package name */
    private int f47081x = 0;

    public C3883a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float measureText = this.f47069l.measureText(str3);
        float measureText2 = this.f47069l.measureText(str2);
        this.f47069l.setColor(1711276032);
        int i11 = this.f47076s;
        int i12 = this.f47077t;
        canvas.drawRect((float) (i11 - 4), (float) (i12 + 8), ((float) i11) + measureText + measureText2 + 4.0f, (float) (i12 + this.f47075r + 8), this.f47069l);
        this.f47069l.setColor(-1);
        canvas.drawText(str3, (float) this.f47076s, (float) this.f47077t, this.f47069l);
        this.f47069l.setColor(i10);
        canvas.drawText(str2, ((float) this.f47076s) + measureText, (float) this.f47077t, this.f47069l);
        this.f47077t += this.f47075r;
    }

    private static String g(String str, Object... objArr) {
        if (objArr == null) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int i12;
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f47069l.setTextSize((float) min);
        int i13 = min + 8;
        this.f47075r = i13;
        int i14 = this.f47068k;
        if (i14 == 80) {
            this.f47075r = i13 * -1;
        }
        this.f47073p = rect.left + 10;
        if (i14 == 80) {
            i12 = rect.bottom - 10;
        } else {
            i12 = rect.top + 20;
        }
        this.f47074q = i12;
    }

    public void a(long j10) {
        this.f47078u = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f47065h.put(str, str2);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f47069l.setStyle(Paint.Style.STROKE);
        this.f47069l.setStrokeWidth(2.0f);
        this.f47069l.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f47069l);
        Paint paint = this.f47069l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f47069l.setColor(this.f47081x);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f47069l);
        this.f47069l.setStyle(style);
        this.f47069l.setStrokeWidth(0.0f);
        this.f47069l.setColor(-1);
        this.f47076s = this.f47073p;
        this.f47077t = this.f47074q;
        String str = this.f47059b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f47058a, str));
        } else {
            d(canvas, "ID", this.f47058a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(((float) bounds.width()) / ((float) bounds.height())));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f47060c), Integer.valueOf(this.f47061d)), f(this.f47060c, this.f47061d, this.f47064g));
        int i10 = this.f47061d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(((float) this.f47060c) / ((float) i10)));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f47062e / 1024)));
        String str2 = this.f47063f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f47066i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f47067j)));
        }
        q qVar = this.f47064g;
        if (qVar != null) {
            c(canvas, "scale", qVar);
        }
        long j10 = this.f47078u;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f47079v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f47080w);
        }
        for (Map.Entry entry : this.f47065h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public int f(int i10, int i11, q qVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            if (qVar != null) {
                Rect rect = this.f47071n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f47070m.reset();
                qVar.a(this.f47070m, this.f47071n, i10, i11, 0.0f, 0.0f);
                RectF rectF = this.f47072o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i10;
                rectF.bottom = (float) i11;
                this.f47070m.mapRect(rectF);
                width = Math.min(width, (int) this.f47072o.width());
                height = Math.min(height, (int) this.f47072o.height());
            }
            float f10 = (float) width;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = (float) height;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int abs = Math.abs(i10 - width);
            int abs2 = Math.abs(i11 - height);
            float f16 = (float) abs;
            if (f16 < f11 && ((float) abs2) < f14) {
                return -16711936;
            }
            if (f16 >= f12 || ((float) abs2) >= f15) {
                return -65536;
            }
            return -256;
        }
        return -65536;
    }

    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f47060c = -1;
        this.f47061d = -1;
        this.f47062e = -1;
        this.f47065h = new HashMap();
        this.f47066i = -1;
        this.f47067j = -1;
        this.f47063f = null;
        j((String) null);
        this.f47078u = -1;
        this.f47079v = null;
        this.f47080w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f47058a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f47060c = i10;
        this.f47061d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f47062e = i10;
    }

    public void m(q qVar) {
        this.f47064g = qVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
