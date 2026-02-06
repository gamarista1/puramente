package i3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import i2.C2076a;
import i2.L;
import i3.d0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: i3.e  reason: case insensitive filesystem */
public class C2094e extends View implements d0 {

    /* renamed from: A  reason: collision with root package name */
    private int f22436A;

    /* renamed from: B  reason: collision with root package name */
    private long f22437B;

    /* renamed from: C  reason: collision with root package name */
    private int f22438C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f22439D;

    /* renamed from: E  reason: collision with root package name */
    private ValueAnimator f22440E;

    /* renamed from: F  reason: collision with root package name */
    private float f22441F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f22442G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f22443H;

    /* renamed from: I  reason: collision with root package name */
    private long f22444I;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f22445a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f22446b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f22447c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f22448d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Paint f22449e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f22450f;

    /* renamed from: f0  reason: collision with root package name */
    private long f22451f0;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f22452g;

    /* renamed from: g0  reason: collision with root package name */
    private long f22453g0;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f22454h;

    /* renamed from: h0  reason: collision with root package name */
    private long f22455h0;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f22456i;

    /* renamed from: i0  reason: collision with root package name */
    private int f22457i0;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f22458j;

    /* renamed from: j0  reason: collision with root package name */
    private long[] f22459j0;

    /* renamed from: k  reason: collision with root package name */
    private final Drawable f22460k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean[] f22461k0;

    /* renamed from: l  reason: collision with root package name */
    private final int f22462l;

    /* renamed from: m  reason: collision with root package name */
    private final int f22463m;

    /* renamed from: n  reason: collision with root package name */
    private final int f22464n;

    /* renamed from: o  reason: collision with root package name */
    private final int f22465o;

    /* renamed from: p  reason: collision with root package name */
    private final int f22466p;

    /* renamed from: q  reason: collision with root package name */
    private final int f22467q;

    /* renamed from: r  reason: collision with root package name */
    private final int f22468r;

    /* renamed from: s  reason: collision with root package name */
    private final int f22469s;

    /* renamed from: t  reason: collision with root package name */
    private final int f22470t;

    /* renamed from: u  reason: collision with root package name */
    private final StringBuilder f22471u;

    /* renamed from: v  reason: collision with root package name */
    private final Formatter f22472v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f22473w;

    /* renamed from: x  reason: collision with root package name */
    private final CopyOnWriteArraySet f22474x;

    /* renamed from: y  reason: collision with root package name */
    private final Point f22475y;

    /* renamed from: z  reason: collision with root package name */
    private final float f22476z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2094e(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        AttributeSet attributeSet3 = attributeSet2;
        Paint paint = new Paint();
        this.f22449e = paint;
        Paint paint2 = new Paint();
        this.f22450f = paint2;
        Paint paint3 = new Paint();
        this.f22452g = paint3;
        Paint paint4 = new Paint();
        this.f22454h = paint4;
        Paint paint5 = new Paint();
        this.f22456i = paint5;
        Paint paint6 = new Paint();
        this.f22458j = paint6;
        paint6.setAntiAlias(true);
        this.f22474x = new CopyOnWriteArraySet();
        this.f22475y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f22476z = f10;
        this.f22470t = e(f10, -50);
        int e10 = e(f10, 4);
        int e11 = e(f10, 26);
        int e12 = e(f10, 4);
        int e13 = e(f10, 12);
        int e14 = e(f10, 0);
        int e15 = e(f10, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, b0.f22397d, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(b0.f22419o);
                this.f22460k = drawable;
                if (drawable != null) {
                    q(drawable);
                    e11 = Math.max(drawable.getMinimumHeight(), e11);
                }
                this.f22462l = obtainStyledAttributes.getDimensionPixelSize(b0.f22405h, e10);
                this.f22463m = obtainStyledAttributes.getDimensionPixelSize(b0.f22423q, e11);
                this.f22464n = obtainStyledAttributes.getInt(b0.f22403g, 0);
                this.f22465o = obtainStyledAttributes.getDimensionPixelSize(b0.f22401f, e12);
                this.f22466p = obtainStyledAttributes.getDimensionPixelSize(b0.f22421p, e13);
                this.f22467q = obtainStyledAttributes.getDimensionPixelSize(b0.f22415m, e14);
                this.f22468r = obtainStyledAttributes.getDimensionPixelSize(b0.f22417n, e15);
                int i12 = obtainStyledAttributes.getInt(b0.f22411k, -1);
                int i13 = obtainStyledAttributes.getInt(b0.f22413l, -1);
                int i14 = obtainStyledAttributes.getInt(b0.f22407i, -855638017);
                int i15 = obtainStyledAttributes.getInt(b0.f22425r, 872415231);
                int i16 = obtainStyledAttributes.getInt(b0.f22399e, -1291845888);
                int i17 = obtainStyledAttributes.getInt(b0.f22409j, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint7.setColor(i16);
                paint8.setColor(i17);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f22462l = e10;
            this.f22463m = e11;
            this.f22464n = 0;
            this.f22465o = e12;
            this.f22466p = e13;
            this.f22467q = e14;
            this.f22468r = e15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f22460k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f22471u = sb2;
        this.f22472v = new Formatter(sb2, Locale.getDefault());
        this.f22473w = new C2092c(this);
        Drawable drawable2 = this.f22460k;
        if (drawable2 != null) {
            this.f22469s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22469s = (Math.max(this.f22467q, Math.max(this.f22466p, this.f22468r)) + 1) / 2;
        }
        this.f22441F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f22440E = valueAnimator;
        valueAnimator.addUpdateListener(new C2093d(this));
        this.f22451f0 = -9223372036854775807L;
        this.f22437B = -9223372036854775807L;
        this.f22436A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f10, int i10) {
        return (int) ((((float) i10) * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i10;
        if (this.f22451f0 > 0) {
            Rect rect = this.f22448d;
            int o10 = L.o(rect.right, rect.left, this.f22446b.right);
            int centerY = this.f22448d.centerY();
            Drawable drawable = this.f22460k;
            if (drawable == null) {
                if (this.f22443H || isFocused()) {
                    i10 = this.f22468r;
                } else if (isEnabled()) {
                    i10 = this.f22466p;
                } else {
                    i10 = this.f22467q;
                }
                canvas.drawCircle((float) o10, (float) centerY, (float) ((int) ((((float) i10) * this.f22441F) / 2.0f)), this.f22458j);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f22441F)) / 2;
            int intrinsicHeight = ((int) (((float) this.f22460k.getIntrinsicHeight()) * this.f22441F)) / 2;
            this.f22460k.setBounds(o10 - intrinsicWidth, centerY - intrinsicHeight, o10 + intrinsicWidth, centerY + intrinsicHeight);
            this.f22460k.draw(canvas);
        }
    }

    private void g(Canvas canvas) {
        Paint paint;
        int height = this.f22446b.height();
        int centerY = this.f22446b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.f22451f0 <= 0) {
            Rect rect = this.f22446b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i10, this.f22452g);
            return;
        }
        Rect rect2 = this.f22447c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f22446b.left, i12), this.f22448d.right);
        int i13 = this.f22446b.right;
        if (max < i13) {
            canvas.drawRect((float) max, (float) centerY, (float) i13, (float) i10, this.f22452g);
        }
        int max2 = Math.max(i11, this.f22448d.right);
        if (i12 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i12, (float) i10, this.f22450f);
        }
        if (this.f22448d.width() > 0) {
            Rect rect3 = this.f22448d;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i10, this.f22449e);
        }
        if (this.f22457i0 != 0) {
            long[] jArr = (long[]) C2076a.e(this.f22459j0);
            boolean[] zArr = (boolean[]) C2076a.e(this.f22461k0);
            int i14 = this.f22465o / 2;
            for (int i15 = 0; i15 < this.f22457i0; i15++) {
                long p10 = L.p(jArr[i15], 0, this.f22451f0);
                Rect rect4 = this.f22446b;
                int min = rect4.left + Math.min(rect4.width() - this.f22465o, Math.max(0, ((int) ((((long) this.f22446b.width()) * p10) / this.f22451f0)) - i14));
                if (zArr[i15]) {
                    paint = this.f22456i;
                } else {
                    paint = this.f22454h;
                }
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f22465o), (float) i10, paint);
            }
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f22437B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f22451f0;
        if (j11 == -9223372036854775807L) {
            return 0;
        }
        return j11 / ((long) this.f22436A);
    }

    private String getProgressText() {
        return L.k0(this.f22471u, this.f22472v, this.f22453g0);
    }

    private long getScrubberPosition() {
        if (this.f22446b.width() <= 0 || this.f22451f0 == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f22448d.width()) * this.f22451f0) / ((long) this.f22446b.width());
    }

    private boolean j(float f10, float f11) {
        return this.f22445a.contains((int) f10, (int) f11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        w(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.f22441F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f22445a);
    }

    private void m(float f10) {
        Rect rect = this.f22448d;
        Rect rect2 = this.f22446b;
        rect.right = L.o((int) f10, rect2.left, rect2.right);
    }

    private static int n(float f10, int i10) {
        return (int) (((float) i10) / f10);
    }

    private Point o(MotionEvent motionEvent) {
        this.f22475y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f22475y;
    }

    private boolean p(long j10) {
        long j11;
        long j12 = this.f22451f0;
        if (j12 <= 0) {
            return false;
        }
        if (this.f22443H) {
            j11 = this.f22444I;
        } else {
            j11 = this.f22453g0;
        }
        long j13 = j11;
        long p10 = L.p(j13 + j10, 0, j12);
        if (p10 == j13) {
            return false;
        }
        if (!this.f22443H) {
            v(p10);
        } else {
            z(p10);
        }
        x();
        return true;
    }

    private boolean q(Drawable drawable) {
        if (L.f22072a < 23 || !r(drawable, getLayoutDirection())) {
            return false;
        }
        return true;
    }

    private static boolean r(Drawable drawable, int i10) {
        if (L.f22072a < 23 || !drawable.setLayoutDirection(i10)) {
            return false;
        }
        return true;
    }

    private void s(int i10, int i11) {
        Rect rect = this.f22439D;
        if (rect == null || rect.width() != i10 || this.f22439D.height() != i11) {
            Rect rect2 = new Rect(0, 0, i10, i11);
            this.f22439D = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    private void v(long j10) {
        this.f22444I = j10;
        this.f22443H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f22474x.iterator();
        while (it.hasNext()) {
            ((d0.a) it.next()).O(this, j10);
        }
    }

    private void w(boolean z10) {
        removeCallbacks(this.f22473w);
        this.f22443H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f22474x.iterator();
        while (it.hasNext()) {
            ((d0.a) it.next()).T(this, this.f22444I, z10);
        }
    }

    private void x() {
        long j10;
        this.f22447c.set(this.f22446b);
        this.f22448d.set(this.f22446b);
        if (this.f22443H) {
            j10 = this.f22444I;
        } else {
            j10 = this.f22453g0;
        }
        if (this.f22451f0 > 0) {
            Rect rect = this.f22447c;
            Rect rect2 = this.f22446b;
            rect.right = Math.min(rect2.left + ((int) ((((long) this.f22446b.width()) * this.f22455h0) / this.f22451f0)), rect2.right);
            int width = (int) ((((long) this.f22446b.width()) * j10) / this.f22451f0);
            Rect rect3 = this.f22448d;
            Rect rect4 = this.f22446b;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f22447c;
            int i10 = this.f22446b.left;
            rect5.right = i10;
            this.f22448d.right = i10;
        }
        invalidate(this.f22445a);
    }

    private void y() {
        Drawable drawable = this.f22460k;
        if (drawable != null && drawable.isStateful() && this.f22460k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void z(long j10) {
        if (this.f22444I != j10) {
            this.f22444I = j10;
            Iterator it = this.f22474x.iterator();
            while (it.hasNext()) {
                ((d0.a) it.next()).w(this, j10);
            }
        }
    }

    public void a(d0.a aVar) {
        C2076a.e(aVar);
        this.f22474x.add(aVar);
    }

    public void b(long[] jArr, boolean[] zArr, int i10) {
        boolean z10;
        if (i10 == 0 || !(jArr == null || zArr == null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f22457i0 = i10;
        this.f22459j0 = jArr;
        this.f22461k0 = zArr;
        x();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    public long getPreferredUpdateDelay() {
        int n10 = n(this.f22476z, this.f22446b.width());
        if (n10 != 0) {
            long j10 = this.f22451f0;
            if (!(j10 == 0 || j10 == -9223372036854775807L)) {
                return j10 / ((long) n10);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j10) {
        if (this.f22440E.isStarted()) {
            this.f22440E.cancel();
        }
        this.f22440E.setFloatValues(new float[]{this.f22441F, 0.0f});
        this.f22440E.setDuration(j10);
        this.f22440E.start();
    }

    public void i(boolean z10) {
        if (this.f22440E.isStarted()) {
            this.f22440E.cancel();
        }
        this.f22442G = z10;
        this.f22441F = 0.0f;
        invalidate(this.f22445a);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22460k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f22443H && !z10) {
            w(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f22451f0 > 0) {
            if (L.f22072a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (p(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f22473w);
        postDelayed(r4.f22473w, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f22473w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f22473w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f22443H
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.w(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2094e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        if (this.f22442G) {
            i14 = 0;
        } else {
            i14 = this.f22469s;
        }
        if (this.f22464n == 1) {
            i16 = (i18 - getPaddingBottom()) - this.f22463m;
            int i19 = this.f22462l;
            i15 = ((i18 - getPaddingBottom()) - i19) - Math.max(i14 - (i19 / 2), 0);
        } else {
            i16 = (i18 - this.f22463m) / 2;
            i15 = (i18 - this.f22462l) / 2;
        }
        this.f22445a.set(paddingLeft, i16, paddingRight, this.f22463m + i16);
        Rect rect = this.f22446b;
        Rect rect2 = this.f22445a;
        rect.set(rect2.left + i14, i15, rect2.right - i14, this.f22462l + i15);
        if (L.f22072a >= 29) {
            s(i17, i18);
        }
        x();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f22463m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f22463m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        y();
    }

    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f22460k;
        if (drawable != null && r(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f22451f0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.o(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f22443H
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f22470t
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f22438C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m(r8)
            goto L_0x0040
        L_0x003a:
            r7.f22438C = r2
            float r8 = (float) r2
            r7.m(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.z(r0)
            r7.x()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f22443H
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = r4
        L_0x0059:
            r7.w(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            r7.x()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2094e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f22451f0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (p(-getPositionIncrement())) {
                w(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (p(getPositionIncrement())) {
                w(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f22454h.setColor(i10);
        invalidate(this.f22445a);
    }

    public void setBufferedColor(int i10) {
        this.f22450f.setColor(i10);
        invalidate(this.f22445a);
    }

    public void setBufferedPosition(long j10) {
        if (this.f22455h0 != j10) {
            this.f22455h0 = j10;
            x();
        }
    }

    public void setDuration(long j10) {
        if (this.f22451f0 != j10) {
            this.f22451f0 = j10;
            if (this.f22443H && j10 == -9223372036854775807L) {
                w(true);
            }
            x();
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f22443H && !z10) {
            w(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f22436A = i10;
        this.f22437B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f22436A = -1;
        this.f22437B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f22456i.setColor(i10);
        invalidate(this.f22445a);
    }

    public void setPlayedColor(int i10) {
        this.f22449e.setColor(i10);
        invalidate(this.f22445a);
    }

    public void setPosition(long j10) {
        if (this.f22453g0 != j10) {
            this.f22453g0 = j10;
            setContentDescription(getProgressText());
            x();
        }
    }

    public void setScrubberColor(int i10) {
        this.f22458j.setColor(i10);
        invalidate(this.f22445a);
    }

    public void setUnplayedColor(int i10) {
        this.f22452g.setColor(i10);
        invalidate(this.f22445a);
    }

    public void t() {
        if (this.f22440E.isStarted()) {
            this.f22440E.cancel();
        }
        this.f22442G = false;
        this.f22441F = 1.0f;
        invalidate(this.f22445a);
    }

    public void u(long j10) {
        if (this.f22440E.isStarted()) {
            this.f22440E.cancel();
        }
        this.f22442G = false;
        this.f22440E.setFloatValues(new float[]{this.f22441F, 1.0f});
        this.f22440E.setDuration(j10);
        this.f22440E.start();
    }
}
