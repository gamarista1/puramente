package g5;

import T4.m;
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
import g5.C3534g;
import java.nio.ByteBuffer;
import java.util.List;
import o5.k;

/* renamed from: g5.c  reason: case insensitive filesystem */
public class C3530c extends Drawable implements C3534g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f43613a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f43614b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43615c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f43616d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f43617e;

    /* renamed from: f  reason: collision with root package name */
    private int f43618f;

    /* renamed from: g  reason: collision with root package name */
    private int f43619g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f43620h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f43621i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f43622j;

    /* renamed from: k  reason: collision with root package name */
    private List f43623k;

    /* renamed from: g5.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final C3534g f43624a;

        a(C3534g gVar) {
            this.f43624a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C3530c(this);
        }
    }

    public C3530c(Context context, P4.a aVar, m mVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new C3534g(c.e(context), aVar, i10, i11, mVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f43622j == null) {
            this.f43622j = new Rect();
        }
        return this.f43622j;
    }

    private Paint h() {
        if (this.f43621i == null) {
            this.f43621i = new Paint(2);
        }
        return this.f43621i;
    }

    private void j() {
        List list = this.f43623k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F3.a) this.f43623k.get(i10)).a(this);
            }
        }
    }

    private void l() {
        this.f43618f = 0;
    }

    private void n() {
        k.a(!this.f43616d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f43613a.f43624a.f() == 1) {
            invalidateSelf();
        } else if (!this.f43614b) {
            this.f43614b = true;
            this.f43613a.f43624a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f43614b = false;
        this.f43613a.f43624a.s(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f43618f++;
        }
        int i10 = this.f43619g;
        if (i10 != -1 && this.f43618f >= i10) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.f43613a.f43624a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.f43616d) {
            if (this.f43620h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.f43620h = false;
            }
            canvas.drawBitmap(this.f43613a.f43624a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.f43613a.f43624a.e();
    }

    public int f() {
        return this.f43613a.f43624a.f();
    }

    public int g() {
        return this.f43613a.f43624a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f43613a;
    }

    public int getIntrinsicHeight() {
        return this.f43613a.f43624a.h();
    }

    public int getIntrinsicWidth() {
        return this.f43613a.f43624a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f43613a.f43624a.j();
    }

    public boolean isRunning() {
        return this.f43614b;
    }

    public void k() {
        this.f43616d = true;
        this.f43613a.f43624a.a();
    }

    public void m(m mVar, Bitmap bitmap) {
        this.f43613a.f43624a.o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43620h = true;
    }

    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f43616d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f43617e = z10;
        if (!z10) {
            o();
        } else if (this.f43615c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.f43615c = true;
        l();
        if (this.f43617e) {
            n();
        }
    }

    public void stop() {
        this.f43615c = false;
        o();
    }

    C3530c(a aVar) {
        this.f43617e = true;
        this.f43619g = -1;
        this.f43613a = (a) k.d(aVar);
    }
}
