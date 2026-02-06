package S4;

import S4.o;
import T4.m;
import W4.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.c;
import java.nio.ByteBuffer;
import java.util.List;

public class k extends Drawable implements o.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f33883a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33884b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33885c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33886d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33887e;

    /* renamed from: f  reason: collision with root package name */
    private int f33888f;

    /* renamed from: g  reason: collision with root package name */
    private int f33889g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33890h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f33891i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f33892j;

    /* renamed from: k  reason: collision with root package name */
    private List f33893k;

    static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final d f33894a;

        /* renamed from: b  reason: collision with root package name */
        final o f33895b;

        public a(d dVar, o oVar) {
            this.f33894a = dVar;
            this.f33895b = oVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new k(this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(Context context, i iVar, d dVar, m mVar, int i10, int i11, Bitmap bitmap) {
        this(new a(dVar, new o(c.e(context), iVar, i10, i11, mVar, bitmap)));
        d dVar2 = dVar;
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f33892j == null) {
            this.f33892j = new Rect();
        }
        return this.f33892j;
    }

    private Paint h() {
        if (this.f33891i == null) {
            this.f33891i = new Paint(2);
        }
        return this.f33891i;
    }

    private void k() {
        List list = this.f33893k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F3.a) this.f33893k.get(i10)).a(this);
            }
        }
    }

    private void m() {
        this.f33888f = 0;
    }

    private void o() {
        o5.k.a(!this.f33886d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f33883a.f33895b.f() == 1) {
            invalidateSelf();
        } else if (!this.f33884b) {
            this.f33884b = true;
            this.f33883a.f33895b.s(this);
            invalidateSelf();
        }
    }

    private void p() {
        this.f33884b = false;
        this.f33883a.f33895b.t(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f33888f++;
        }
        int i10 = this.f33889g;
        if (i10 != -1 && this.f33888f >= i10) {
            stop();
            k();
        }
    }

    public ByteBuffer c() {
        return this.f33883a.f33895b.b();
    }

    public void draw(Canvas canvas) {
        if (!j()) {
            if (this.f33890h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.f33890h = false;
            }
            canvas.drawBitmap(this.f33883a.f33895b.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.f33883a.f33895b.e();
    }

    public int f() {
        return this.f33883a.f33895b.f();
    }

    public int g() {
        return this.f33883a.f33895b.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f33883a;
    }

    public int getIntrinsicHeight() {
        return this.f33883a.f33895b.h();
    }

    public int getIntrinsicWidth() {
        return this.f33883a.f33895b.l();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f33883a.f33895b.k();
    }

    public boolean isRunning() {
        return this.f33884b;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f33886d;
    }

    public void l() {
        this.f33886d = true;
        this.f33883a.f33895b.a();
    }

    public void n(int i10) {
        int i11 = -1;
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to LOOP_FOREVER, or equal to LOOP_INTRINSIC");
        } else if (i10 == 0) {
            int i12 = this.f33883a.f33895b.i();
            if (i12 != 0) {
                i11 = i12;
            }
            this.f33889g = i11;
        } else {
            this.f33889g = i10;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33890h = true;
    }

    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        o5.k.a(!this.f33886d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f33887e = z10;
        if (!z10) {
            p();
        } else if (this.f33885c) {
            o();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.f33885c = true;
        m();
        if (this.f33887e) {
            o();
        }
    }

    public void stop() {
        this.f33885c = false;
        p();
    }

    k(a aVar) {
        this.f33889g = -1;
        this.f33887e = true;
        this.f33883a = (a) o5.k.d(aVar);
        n(0);
    }
}
