package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import n.e;

public abstract class Q implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f11578a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11579b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11580c;

    /* renamed from: d  reason: collision with root package name */
    final View f11581d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f11582e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f11583f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11584g;

    /* renamed from: h  reason: collision with root package name */
    private int f11585h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f11586i = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = Q.this.f11581d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            Q.this.e();
        }
    }

    public Q(View view) {
        this.f11581d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11578a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11579b = tapTimeout;
        this.f11580c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f11583f;
        if (runnable != null) {
            this.f11581d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f11582e;
        if (runnable2 != null) {
            this.f11581d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        O o10;
        boolean z10;
        View view = this.f11581d;
        e b10 = b();
        if (b10 == null || !b10.c() || (o10 = (O) b10.o()) == null || !o10.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(o10, obtainNoHistory);
        boolean e10 = o10.e(obtainNoHistory, this.f11585h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!e10 || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f11581d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f11585h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f11578a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f11585h = r6
            java.lang.Runnable r6 = r5.f11582e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.Q$a r6 = new androidx.appcompat.widget.Q$a
            r6.<init>()
            r5.f11582e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f11582e
            int r1 = r5.f11579b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f11583f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.Q$b r6 = new androidx.appcompat.widget.Q$b
            r6.<init>()
            r5.f11583f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f11583f
            int r1 = r5.f11580c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Q.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        if (f10 < f13 || f11 < f13 || f10 >= ((float) (view.getRight() - view.getLeft())) + f12 || f11 >= ((float) (view.getBottom() - view.getTop())) + f12) {
            return false;
        }
        return true;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11586i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11586i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract e b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        e b10 = b();
        if (b10 == null || !b10.c()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f11581d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f11584g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f11584g;
        if (!z11) {
            if (!g(motionEvent) || !c()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f11581d.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (f(motionEvent) || !d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11584g = z10;
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f11584g = false;
        this.f11585h = -1;
        Runnable runnable = this.f11582e;
        if (runnable != null) {
            this.f11581d.removeCallbacks(runnable);
        }
    }
}
