package h8;

import Af.a;
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
import j8.e;
import j8.j;
import kotlin.jvm.internal.C6496s;

public final class i extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44125a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44126b;

    /* renamed from: c  reason: collision with root package name */
    private final float f44127c;

    /* renamed from: d  reason: collision with root package name */
    private final float f44128d;

    /* renamed from: e  reason: collision with root package name */
    private final float f44129e;

    /* renamed from: f  reason: collision with root package name */
    private final float f44130f;

    /* renamed from: g  reason: collision with root package name */
    private e f44131g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f44132h;

    public i(Context context, int i10, float f10, float f11, float f12, float f13, e eVar) {
        C6496s.h(context, "context");
        this.f44125a = context;
        this.f44126b = i10;
        this.f44127c = f10;
        this.f44128d = f11;
        this.f44129e = f12;
        this.f44130f = f13;
        this.f44131g = eVar;
        Paint paint = new Paint();
        paint.setColor(i10);
        if (f12 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(C3420m.f41694a.x(f12 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.f44132h = paint;
    }

    private final void a(Canvas canvas, RectF rectF) {
        boolean unused = canvas.clipOutRect(getBounds());
        canvas.drawRect(rectF, this.f44132h);
    }

    private final void b(Canvas canvas, RectF rectF, float f10, j8.i iVar) {
        Canvas canvas2 = canvas;
        float f11 = f10;
        RectF rectF2 = new RectF(getBounds());
        rectF2.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {iVar.c().a(), iVar.c().b(), iVar.d().a(), iVar.d().b(), iVar.b().a(), iVar.b().b(), iVar.a().a(), iVar.a().b()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        boolean unused = canvas2.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(rectF, new float[]{c.a(iVar.c().a(), f11), c.a(iVar.c().b(), f11), c.a(iVar.d().a(), f11), c.a(iVar.d().b(), f11), c.a(iVar.b().a(), f11), c.a(iVar.b().b(), f11), c.a(iVar.a().a(), f11), c.a(iVar.a().b(), f11)}, direction);
        canvas2.drawPath(path2, this.f44132h);
    }

    public final e c() {
        return this.f44131g;
    }

    public final void d(e eVar) {
        this.f44131g = eVar;
    }

    public void draw(Canvas canvas) {
        j8.i iVar;
        j8.i d10;
        C6496s.h(canvas, "canvas");
        G g10 = G.f41415a;
        float d11 = g10.d((float) getBounds().width());
        float d12 = g10.d((float) getBounds().height());
        e eVar = this.f44131g;
        if (eVar == null || (d10 = eVar.d(getLayoutDirection(), this.f44125a, d11, d12)) == null) {
            iVar = null;
        } else {
            iVar = new j8.i(new j(g10.b(d10.c().a()), g10.b(d10.c().b())), new j(g10.b(d10.d().a()), g10.b(d10.d().b())), new j(g10.b(d10.a().a()), g10.b(d10.a().b())), new j(g10.b(d10.b().a()), g10.b(d10.b().b())));
        }
        float b10 = g10.b(this.f44130f);
        RectF rectF = new RectF(getBounds());
        float f10 = -b10;
        rectF.inset(f10, f10);
        rectF.offset(g10.b(this.f44127c), g10.b(this.f44128d));
        int save = canvas.save();
        if (iVar == null || !iVar.e()) {
            a(canvas, rectF);
        } else {
            b(canvas, rectF, b10, iVar);
        }
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        int alpha = this.f44132h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        if (1 > alpha || alpha >= 255) {
            return -2;
        }
        return -3;
    }

    public void setAlpha(int i10) {
        this.f44132h.setAlpha(a.d((((float) i10) / 255.0f) * (((float) Color.alpha(this.f44126b)) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f44132h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
