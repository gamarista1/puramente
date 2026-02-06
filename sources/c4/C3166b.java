package c4;

import Ef.m;
import a4.C3116i;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import k4.C3666h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c4.b  reason: case insensitive filesystem */
public final class C3166b extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: m  reason: collision with root package name */
    public static final a f36378m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C3666h f36379a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36380b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36381c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f36382d;

    /* renamed from: e  reason: collision with root package name */
    private final List f36383e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final int f36384f;

    /* renamed from: g  reason: collision with root package name */
    private final int f36385g;

    /* renamed from: h  reason: collision with root package name */
    private long f36386h;

    /* renamed from: i  reason: collision with root package name */
    private int f36387i;

    /* renamed from: j  reason: collision with root package name */
    private int f36388j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f36389k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f36390l;

    /* renamed from: c4.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3166b(Drawable drawable, Drawable drawable2, C3666h hVar, int i10, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        this.f36379a = hVar;
        this.f36380b = i10;
        this.f36381c = z10;
        this.f36382d = z11;
        Drawable drawable4 = null;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.f36384f = a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.f36385g = a(num3, num4);
        this.f36387i = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.f36389k = drawable3;
        drawable4 = drawable2 != null ? drawable2.mutate() : drawable4;
        this.f36390l = drawable4;
        if (i10 > 0) {
            Drawable drawable5 = this.f36389k;
            if (drawable5 != null) {
                drawable5.setCallback(this);
            }
            if (drawable4 != null) {
                drawable4.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    private final int a(Integer num, Integer num2) {
        int i10;
        int i11 = -1;
        if (!this.f36382d && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return Math.max(i10, i11);
    }

    private final void b() {
        this.f36388j = 2;
        this.f36389k = null;
        List list = this.f36383e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((F3.a) list.get(i10)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c10 = C3116i.c(intrinsicWidth, intrinsicHeight, width, height, this.f36379a);
        double d10 = (double) 2;
        int c11 = Af.a.c((((double) width) - (((double) intrinsicWidth) * c10)) / d10);
        int c12 = Af.a.c((((double) height) - (c10 * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + c11, rect.top + c12, rect.right - c11, rect.bottom - c12);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Drawable drawable;
        int i10 = this.f36388j;
        if (i10 == 0) {
            Drawable drawable2 = this.f36389k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f36387i);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i10 == 2) {
            Drawable drawable3 = this.f36390l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f36387i);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.f36386h)) / ((double) this.f36380b);
            double j10 = m.j(uptimeMillis, 0.0d, 1.0d);
            int i11 = this.f36387i;
            int i12 = (int) (j10 * ((double) i11));
            if (this.f36381c) {
                i11 -= i12;
            }
            if (uptimeMillis >= 1.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (drawable = this.f36389k) != null) {
                drawable.setAlpha(i11);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.f36390l;
            if (drawable4 != null) {
                drawable4.setAlpha(i12);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z10) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.f36387i;
    }

    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f36388j;
        if (i10 == 0) {
            Drawable drawable2 = this.f36389k;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        } else if (i10 == 1) {
            Drawable drawable3 = this.f36390l;
            if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.f36389k;
            if (drawable4 != null) {
                return drawable4.getColorFilter();
            }
            return null;
        } else if (i10 == 2 && (drawable = this.f36390l) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.f36385g;
    }

    public int getIntrinsicWidth() {
        return this.f36384f;
    }

    public int getOpacity() {
        Drawable drawable = this.f36389k;
        Drawable drawable2 = this.f36390l;
        int i10 = this.f36388j;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        } else if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        if (this.f36388j == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            z10 = drawable.setLevel(i10);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i10);
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
        }
        this.f36387i = i10;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i10) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36389k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f36390l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f36389k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.start()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r4.f36390l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.start()
        L_0x001e:
            int r0 = r4.f36388j
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r0 = 1
            r4.f36388j = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.f36386h = r0
            java.util.List r0 = r4.f36383e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x0036:
            if (r2 >= r1) goto L_0x0044
            java.lang.Object r3 = r0.get(r2)
            F3.a r3 = (F3.a) r3
            r3.b(r4)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0044:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C3166b.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f36389k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.stop()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r3.f36390l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.stop()
        L_0x001e:
            int r0 = r3.f36388j
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r3.b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C3166b.stop():void");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
