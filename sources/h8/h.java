package h8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.G;
import j8.e;
import j8.i;
import j8.j;
import j8.n;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public final class h extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44113a;

    /* renamed from: b  reason: collision with root package name */
    private e f44114b;

    /* renamed from: c  reason: collision with root package name */
    private final float f44115c = 0.8f;

    /* renamed from: d  reason: collision with root package name */
    private float f44116d;

    /* renamed from: e  reason: collision with root package name */
    private n f44117e;

    /* renamed from: f  reason: collision with root package name */
    private int f44118f;

    /* renamed from: g  reason: collision with root package name */
    private float f44119g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f44120h;

    /* renamed from: i  reason: collision with root package name */
    private i f44121i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f44122j;

    /* renamed from: k  reason: collision with root package name */
    private final Path f44123k;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                j8.n[] r0 = j8.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j8.n r1 = j8.n.SOLID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j8.n r1 = j8.n.DASHED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j8.n r1 = j8.n.DOTTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f44124a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.h.a.<clinit>():void");
        }
    }

    public h(Context context, e eVar, int i10, float f10, n nVar, float f11) {
        C6496s.h(context, "context");
        C6496s.h(nVar, "outlineStyle");
        this.f44113a = context;
        this.f44114b = eVar;
        this.f44116d = f10;
        this.f44117e = nVar;
        this.f44118f = i10;
        this.f44119g = f11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
        paint.setPathEffect(d(nVar, f11));
        this.f44120h = paint;
        this.f44122j = new RectF();
        this.f44123k = new Path();
    }

    private final float a(float f10, float f11) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 + (f11 * 0.5f);
    }

    private final void b(Canvas canvas) {
        this.f44123k.addRect(this.f44122j, Path.Direction.CW);
        canvas.drawPath(this.f44123k, this.f44120h);
    }

    private final void c(Canvas canvas) {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j b10;
        j a10;
        j d10;
        j c10;
        i iVar = this.f44121i;
        if (iVar == null || (c10 = iVar.c()) == null || (jVar = c10.c()) == null) {
            jVar = new j(0.0f, 0.0f);
        }
        i iVar2 = this.f44121i;
        if (iVar2 == null || (d10 = iVar2.d()) == null || (jVar2 = d10.c()) == null) {
            jVar2 = new j(0.0f, 0.0f);
        }
        i iVar3 = this.f44121i;
        if (iVar3 == null || (a10 = iVar3.a()) == null || (jVar3 = a10.c()) == null) {
            jVar3 = new j(0.0f, 0.0f);
        }
        i iVar4 = this.f44121i;
        if (iVar4 == null || (b10 = iVar4.b()) == null || (jVar4 = b10.c()) == null) {
            jVar4 = new j(0.0f, 0.0f);
        }
        this.f44123k.addRoundRect(this.f44122j, new float[]{a(jVar.a(), this.f44119g), a(jVar.b(), this.f44119g), a(jVar2.a(), this.f44119g), a(jVar2.b(), this.f44119g), a(jVar4.a(), this.f44119g), a(jVar4.b(), this.f44119g), a(jVar3.a(), this.f44119g), a(jVar3.b(), this.f44119g)}, Path.Direction.CW);
        canvas.drawPath(this.f44123k, this.f44120h);
    }

    private final PathEffect d(n nVar, float f10) {
        int i10 = a.f44124a[nVar.ordinal()];
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

    private final void j() {
        this.f44122j.set(getBounds());
        RectF rectF = this.f44122j;
        float f10 = rectF.top;
        float f11 = this.f44119g;
        float f12 = this.f44116d;
        float f13 = this.f44115c;
        rectF.top = f10 - (((f11 * 0.5f) + f12) - f13);
        rectF.bottom += ((f11 * 0.5f) + f12) - f13;
        rectF.left -= ((f11 * 0.5f) + f12) - f13;
        rectF.right += ((f11 * 0.5f) + f12) - f13;
    }

    public void draw(Canvas canvas) {
        i iVar;
        C6496s.h(canvas, "canvas");
        if (this.f44119g != 0.0f) {
            this.f44123k.reset();
            e eVar = this.f44114b;
            if (eVar != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f44113a;
                G g10 = G.f41415a;
                iVar = eVar.d(layoutDirection, context, g10.e(getBounds().width()), g10.e(getBounds().height()));
            } else {
                iVar = null;
            }
            this.f44121i = iVar;
            j();
            i iVar2 = this.f44121i;
            if (iVar2 == null || iVar2 == null || !iVar2.e()) {
                b(canvas);
            } else {
                c(canvas);
            }
        }
    }

    public final void e(e eVar) {
        this.f44114b = eVar;
    }

    public final void f(int i10) {
        if (i10 != this.f44118f) {
            this.f44118f = i10;
            this.f44120h.setColor(i10);
            invalidateSelf();
        }
    }

    public final void g(float f10) {
        if (f10 != this.f44116d) {
            this.f44116d = f10;
            invalidateSelf();
        }
    }

    public int getOpacity() {
        int alpha = this.f44120h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        if (1 > alpha || alpha >= 255) {
            return -2;
        }
        return -3;
    }

    public final void h(n nVar) {
        C6496s.h(nVar, "value");
        if (nVar != this.f44117e) {
            this.f44117e = nVar;
            this.f44120h.setPathEffect(d(nVar, this.f44119g));
            invalidateSelf();
        }
    }

    public final void i(float f10) {
        if (f10 != this.f44119g) {
            this.f44119g = f10;
            this.f44120h.setStrokeWidth(f10);
            this.f44120h.setPathEffect(d(this.f44117e, f10));
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        this.f44120h.setAlpha(Af.a.d((((float) i10) / 255.0f) * (((float) Color.alpha(this.f44118f)) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f44120h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
