package vd;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62011a;

    /* renamed from: b  reason: collision with root package name */
    private final b f62012b;

    /* renamed from: c  reason: collision with root package name */
    private float f62013c;

    /* renamed from: d  reason: collision with root package name */
    private float f62014d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62015e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f62016f;

    /* renamed from: g  reason: collision with root package name */
    private float f62017g;

    /* renamed from: h  reason: collision with root package name */
    private float f62018h;

    /* renamed from: i  reason: collision with root package name */
    private float f62019i;

    /* renamed from: j  reason: collision with root package name */
    private float f62020j;

    /* renamed from: k  reason: collision with root package name */
    private float f62021k;

    /* renamed from: l  reason: collision with root package name */
    private float f62022l;

    /* renamed from: m  reason: collision with root package name */
    private float f62023m;

    /* renamed from: n  reason: collision with root package name */
    private long f62024n;

    /* renamed from: o  reason: collision with root package name */
    private long f62025o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f62026p;

    /* renamed from: q  reason: collision with root package name */
    private int f62027q;

    /* renamed from: r  reason: collision with root package name */
    private int f62028r;

    /* renamed from: s  reason: collision with root package name */
    private final Handler f62029s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public float f62030t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public float f62031u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public int f62032v;

    /* renamed from: w  reason: collision with root package name */
    private GestureDetector f62033w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f62034x;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f62030t = motionEvent.getX();
            y.this.f62031u = motionEvent.getY();
            y.this.f62032v = 1;
            return true;
        }
    }

    public interface b {
        boolean a(y yVar);

        boolean b(y yVar);

        void c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, (Handler) null);
    }

    private boolean j() {
        if (this.f62032v != 0) {
            return true;
        }
        return false;
    }

    public float d() {
        return this.f62017g;
    }

    public float e() {
        return this.f62013c;
    }

    public float f() {
        return this.f62014d;
    }

    public float g() {
        boolean z10;
        if (j()) {
            boolean z11 = this.f62034x;
            if ((!z11 || this.f62017g >= this.f62018h) && (z11 || this.f62017g <= this.f62018h)) {
                z10 = false;
            } else {
                z10 = true;
            }
            float abs = Math.abs(1.0f - (this.f62017g / this.f62018h)) * 0.5f;
            if (this.f62018h <= ((float) this.f62027q)) {
                return 1.0f;
            }
            if (z10) {
                return 1.0f + abs;
            }
            return 1.0f - abs;
        }
        float f10 = this.f62018h;
        if (f10 > 0.0f) {
            return this.f62017g / f10;
        }
        return 1.0f;
    }

    public long h() {
        return this.f62024n - this.f62025o;
    }

    public double i() {
        return ((double) h()) / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        int i12;
        boolean z15;
        MotionEvent motionEvent2 = motionEvent;
        this.f62024n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f62015e) {
            this.f62033w.onTouchEvent(motionEvent2);
        }
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getButtonState() & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f62032v != 2 || z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (actionMasked == 1 || actionMasked == 3 || z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f13 = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f62026p) {
                this.f62012b.c(this);
                this.f62026p = false;
                this.f62019i = 0.0f;
                this.f62032v = 0;
            } else if (j() && z12) {
                this.f62026p = false;
                this.f62019i = 0.0f;
                this.f62032v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f62026p && this.f62016f && !j() && !z12 && z10) {
            this.f62030t = motionEvent.getX();
            this.f62031u = motionEvent.getY();
            this.f62032v = 2;
            this.f62019i = 0.0f;
        }
        if (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (actionMasked == 6) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            i10 = motionEvent.getActionIndex();
        } else {
            i10 = -1;
        }
        if (z14) {
            i11 = pointerCount - 1;
        } else {
            i11 = pointerCount;
        }
        if (j()) {
            f11 = this.f62030t;
            f10 = this.f62031u;
            if (motionEvent.getY() < f10) {
                this.f62034x = true;
            } else {
                this.f62034x = false;
            }
        } else {
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (int i13 = 0; i13 < pointerCount; i13++) {
                if (i10 != i13) {
                    f14 += motionEvent2.getX(i13);
                    f15 += motionEvent2.getY(i13);
                }
            }
            float f16 = (float) i11;
            float f17 = f14 / f16;
            f10 = f15 / f16;
            f11 = f17;
        }
        float f18 = 0.0f;
        for (int i14 = 0; i14 < pointerCount; i14++) {
            if (i10 != i14) {
                f13 += Math.abs(motionEvent2.getX(i14) - f11);
                f18 += Math.abs(motionEvent2.getY(i14) - f10);
            }
        }
        float f19 = (float) i11;
        float f20 = (f13 / f19) * 2.0f;
        float f21 = (f18 / f19) * 2.0f;
        if (j()) {
            f12 = f21;
        } else {
            f12 = (float) Math.hypot((double) f20, (double) f21);
        }
        boolean z16 = this.f62026p;
        this.f62013c = f11;
        this.f62014d = f10;
        if (!j() && this.f62026p && (f12 < ((float) this.f62028r) || z13)) {
            this.f62012b.c(this);
            this.f62026p = false;
            this.f62019i = f12;
        }
        if (z13) {
            this.f62020j = f20;
            this.f62022l = f20;
            this.f62021k = f21;
            this.f62023m = f21;
            this.f62017g = f12;
            this.f62018h = f12;
            this.f62019i = f12;
        }
        if (j()) {
            i12 = this.f62027q;
        } else {
            i12 = this.f62028r;
        }
        if (!this.f62026p && f12 >= ((float) i12) && (z16 || Math.abs(f12 - this.f62019i) > ((float) this.f62027q))) {
            this.f62020j = f20;
            this.f62022l = f20;
            this.f62021k = f21;
            this.f62023m = f21;
            this.f62017g = f12;
            this.f62018h = f12;
            this.f62025o = this.f62024n;
            this.f62026p = this.f62012b.a(this);
        }
        if (actionMasked == 2) {
            this.f62020j = f20;
            this.f62021k = f21;
            this.f62017g = f12;
            if (this.f62026p) {
                z15 = this.f62012b.b(this);
            } else {
                z15 = true;
            }
            if (z15) {
                this.f62022l = this.f62020j;
                this.f62023m = this.f62021k;
                this.f62018h = this.f62017g;
                this.f62025o = this.f62024n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f62015e = z10;
        if (z10 && this.f62033w == null) {
            this.f62033w = new GestureDetector(this.f62011a, new a(), this.f62029s);
        }
    }

    public void m(boolean z10) {
        this.f62016f = z10;
    }

    public y(Context context, b bVar, Handler handler) {
        this.f62032v = 0;
        this.f62011a = context;
        this.f62012b = bVar;
        this.f62027q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f62028r = 0;
        this.f62029s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }
}
