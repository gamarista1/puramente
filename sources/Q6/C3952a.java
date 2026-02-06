package q6;

import T5.k;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: q6.a  reason: case insensitive filesystem */
public abstract class C3952a extends Drawable implements Drawable.Callback, C3950D, C3949C {

    /* renamed from: a  reason: collision with root package name */
    private C3950D f47609a;

    /* renamed from: b  reason: collision with root package name */
    private final C3955d f47610b = new C3955d();

    /* renamed from: c  reason: collision with root package name */
    private final Drawable[] f47611c;

    /* renamed from: d  reason: collision with root package name */
    private final C3954c[] f47612d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f47613e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private boolean f47614f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47615g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47616h;

    /* renamed from: q6.a$a  reason: collision with other inner class name */
    class C0717a implements C3954c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47617a;

        C0717a(int i10) {
            this.f47617a = i10;
        }

        public Drawable b() {
            return C3952a.this.b(this.f47617a);
        }

        public Drawable i(Drawable drawable) {
            return C3952a.this.f(this.f47617a, drawable);
        }
    }

    public C3952a(Drawable[] drawableArr) {
        int i10 = 0;
        this.f47614f = false;
        this.f47615g = false;
        this.f47616h = false;
        k.g(drawableArr);
        this.f47611c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f47611c;
            if (i10 < drawableArr2.length) {
                C3956e.d(drawableArr2[i10], this, this);
                i10++;
            } else {
                this.f47612d = new C3954c[drawableArr2.length];
                return;
            }
        }
    }

    private C3954c a(int i10) {
        return new C0717a(i10);
    }

    public Drawable b(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i10 < this.f47611c.length) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        return this.f47611c[i10];
    }

    public C3954c c(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i10 < this.f47612d.length) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        C3954c[] cVarArr = this.f47612d;
        if (cVarArr[i10] == null) {
            cVarArr[i10] = a(i10);
        }
        return this.f47612d[i10];
    }

    public int d() {
        return this.f47611c.length;
    }

    public void e(Matrix matrix) {
        C3950D d10 = this.f47609a;
        if (d10 != null) {
            d10.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable f(int i10, Drawable drawable) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i10 >= this.f47611c.length) {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        Drawable drawable2 = this.f47611c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f47616h) {
                drawable.mutate();
            }
            C3956e.d(this.f47611c[i10], (Drawable.Callback) null, (C3950D) null);
            C3956e.d(drawable, (Drawable.Callback) null, (C3950D) null);
            C3956e.e(drawable, this.f47610b);
            C3956e.a(drawable, this);
            C3956e.d(drawable, this, this);
            this.f47615g = false;
            this.f47611c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public int getIntrinsicHeight() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f47611c.length == 0) {
            return -2;
        }
        int i10 = 1;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                return i11;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Drawable.resolveOpacity(i11, drawable.getOpacity());
            }
            i10++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f47613e;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.f47615g) {
            this.f47614f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f47611c;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f47614f;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f47614f = z11 | z10;
                i10++;
            }
            this.f47615g = true;
        }
        return this.f47614f;
    }

    public void k(C3950D d10) {
        this.f47609a = d10;
    }

    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.mutate();
                }
                i10++;
            } else {
                this.f47616h = true;
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    public void q(RectF rectF) {
        C3950D d10 = this.f47609a;
        if (d10 != null) {
            d10.q(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47610b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z10) {
        this.f47610b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.setDither(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z10) {
        this.f47610b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.setFilterBitmap(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.setHotspot(f10, f11);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47611c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
