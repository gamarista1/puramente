package h8;

import Af.a;
import Ef.m;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C3420m;
import com.facebook.react.uimanager.G;
import j8.c;
import j8.e;
import j8.i;
import j8.j;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44103a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44104b;

    /* renamed from: c  reason: collision with root package name */
    private final float f44105c;

    /* renamed from: d  reason: collision with root package name */
    private final float f44106d;

    /* renamed from: e  reason: collision with root package name */
    private final float f44107e;

    /* renamed from: f  reason: collision with root package name */
    private final float f44108f;

    /* renamed from: g  reason: collision with root package name */
    private c f44109g;

    /* renamed from: h  reason: collision with root package name */
    private e f44110h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f44111i;

    public f(Context context, int i10, float f10, float f11, float f12, float f13, c cVar, e eVar) {
        C6496s.h(context, "context");
        this.f44103a = context;
        this.f44104b = i10;
        this.f44105c = f10;
        this.f44106d = f11;
        this.f44107e = f12;
        this.f44108f = f13;
        this.f44109g = cVar;
        this.f44110h = eVar;
        Paint paint = new Paint();
        paint.setColor(i10);
        if (f12 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(C3420m.f41694a.x(f12 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.f44111i = paint;
    }

    private final RectF a() {
        RectF a10;
        c cVar = this.f44109g;
        if (cVar == null || (a10 = cVar.a(getLayoutDirection(), this.f44103a)) == null) {
            return null;
        }
        G g10 = G.f41415a;
        return new RectF(g10.b(a10.left), g10.b(a10.top), g10.b(a10.right), g10.b(a10.bottom));
    }

    private final i b() {
        i iVar;
        e eVar = this.f44110h;
        if (eVar != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f44103a;
            G g10 = G.f41415a;
            iVar = eVar.d(layoutDirection, context, g10.d((float) getBounds().width()), g10.d((float) getBounds().height()));
        } else {
            iVar = null;
        }
        if (iVar == null || !iVar.e()) {
            return null;
        }
        G g11 = G.f41415a;
        return new i(new j(g11.b(iVar.c().a()), g11.b(iVar.c().b())), new j(g11.b(iVar.d().a()), g11.b(iVar.d().b())), new j(g11.b(iVar.a().a()), g11.b(iVar.a().b())), new j(g11.b(iVar.b().a()), g11.b(iVar.b().b())));
    }

    private final float d(float f10, Float f11) {
        float f12;
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        return m.c(f10 - f12, 0.0f);
    }

    public final e c() {
        return this.f44110h;
    }

    public void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float[] fArr;
        Float f14;
        Float f15;
        Float f16;
        Float f17;
        Float f18;
        Float f19;
        Float f20;
        Float f21;
        Canvas canvas2 = canvas;
        C6496s.h(canvas2, "canvas");
        i b10 = b();
        RectF a10 = a();
        float f22 = (float) getBounds().left;
        if (a10 != null) {
            f10 = a10.left;
        } else {
            f10 = 0.0f;
        }
        float f23 = f22 + f10;
        float f24 = (float) getBounds().top;
        if (a10 != null) {
            f11 = a10.top;
        } else {
            f11 = 0.0f;
        }
        float f25 = f24 + f11;
        float f26 = (float) getBounds().right;
        if (a10 != null) {
            f12 = a10.right;
        } else {
            f12 = 0.0f;
        }
        float f27 = f26 - f12;
        float f28 = (float) getBounds().bottom;
        if (a10 != null) {
            f13 = a10.bottom;
        } else {
            f13 = 0.0f;
        }
        RectF rectF = new RectF(f23, f25, f27, f28 - f13);
        if (b10 != null) {
            float a11 = b10.c().a();
            if (a10 != null) {
                f14 = Float.valueOf(a10.left);
            } else {
                f14 = null;
            }
            float d10 = d(a11, f14);
            float b11 = b10.c().b();
            if (a10 != null) {
                f15 = Float.valueOf(a10.top);
            } else {
                f15 = null;
            }
            float d11 = d(b11, f15);
            float a12 = b10.d().a();
            if (a10 != null) {
                f16 = Float.valueOf(a10.right);
            } else {
                f16 = null;
            }
            float d12 = d(a12, f16);
            float b12 = b10.d().b();
            if (a10 != null) {
                f17 = Float.valueOf(a10.top);
            } else {
                f17 = null;
            }
            float d13 = d(b12, f17);
            float a13 = b10.b().a();
            if (a10 != null) {
                f18 = Float.valueOf(a10.right);
            } else {
                f18 = null;
            }
            float d14 = d(a13, f18);
            float b13 = b10.b().b();
            if (a10 != null) {
                f19 = Float.valueOf(a10.bottom);
            } else {
                f19 = null;
            }
            float d15 = d(b13, f19);
            float a14 = b10.a().a();
            if (a10 != null) {
                f20 = Float.valueOf(a10.left);
            } else {
                f20 = null;
            }
            float d16 = d(a14, f20);
            float b14 = b10.a().b();
            if (a10 != null) {
                f21 = Float.valueOf(a10.bottom);
            } else {
                f21 = null;
            }
            fArr = new float[]{d10, d11, d12, d13, d14, d15, d16, d(b14, f21)};
        } else {
            fArr = null;
        }
        G g10 = G.f41415a;
        float b15 = g10.b(this.f44105c);
        float b16 = g10.b(this.f44106d);
        float b17 = g10.b(this.f44108f);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(b17, b17);
        rectF2.offset(b15, b16);
        float x10 = C3420m.f41694a.x(this.f44107e);
        RectF rectF3 = new RectF(rectF2);
        float f29 = -x10;
        rectF3.inset(f29, f29);
        if (b17 < 0.0f) {
            rectF3.inset(b17, b17);
        }
        RectF rectF4 = new RectF(rectF3);
        rectF4.offset(-b15, -b16);
        rectF3.union(rectF4);
        int save = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float a15 : fArr) {
                arrayList.add(Float.valueOf(c.a(a15, -b17)));
            }
            canvas.drawDoubleRoundRect(rectF3, g.f44112a, rectF2, C6565s.b1(arrayList), this.f44111i);
        } else {
            canvas2.clipRect(rectF);
            canvas.drawDoubleRoundRect(rectF3, g.f44112a, rectF2, g.f44112a, this.f44111i);
        }
        canvas2.restoreToCount(save);
    }

    public final void e(c cVar) {
        this.f44109g = cVar;
    }

    public final void f(e eVar) {
        this.f44110h = eVar;
    }

    public int getOpacity() {
        int alpha = this.f44111i.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        if (1 > alpha || alpha >= 255) {
            return -2;
        }
        return -3;
    }

    public void setAlpha(int i10) {
        this.f44111i.setAlpha(a.d((((float) i10) / 255.0f) * (((float) Color.alpha(this.f44104b)) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f44111i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
