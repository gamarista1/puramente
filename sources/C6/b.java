package C6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import i6.C3591a;
import q6.C3955d;
import v6.C4106a;

public class b extends Drawable implements Animatable, C3591a {

    /* renamed from: r  reason: collision with root package name */
    private static final Class f30044r = b.class;

    /* renamed from: s  reason: collision with root package name */
    private static final d f30045s = new e();

    /* renamed from: a  reason: collision with root package name */
    private C4106a f30046a;

    /* renamed from: b  reason: collision with root package name */
    private E6.b f30047b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f30048c;

    /* renamed from: d  reason: collision with root package name */
    private long f30049d;

    /* renamed from: e  reason: collision with root package name */
    private long f30050e;

    /* renamed from: f  reason: collision with root package name */
    private long f30051f;

    /* renamed from: g  reason: collision with root package name */
    private int f30052g;

    /* renamed from: h  reason: collision with root package name */
    private long f30053h;

    /* renamed from: i  reason: collision with root package name */
    private long f30054i;

    /* renamed from: j  reason: collision with root package name */
    private int f30055j;

    /* renamed from: k  reason: collision with root package name */
    private long f30056k = 8;

    /* renamed from: l  reason: collision with root package name */
    private long f30057l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f30058m;

    /* renamed from: n  reason: collision with root package name */
    private volatile d f30059n = f30045s;

    /* renamed from: o  reason: collision with root package name */
    private final C4106a.C0739a f30060o;

    /* renamed from: p  reason: collision with root package name */
    private C3955d f30061p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Runnable f30062q;

    class a implements Runnable {
        a() {
        }

        public void run() {
            b bVar = b.this;
            bVar.unscheduleSelf(bVar.f30062q);
            b.this.invalidateSelf();
        }
    }

    public b(C4106a aVar) {
        a aVar2 = new a(this);
        this.f30060o = aVar2;
        this.f30062q = new a();
        this.f30046a = aVar;
        this.f30047b = c(aVar);
        if (aVar != null) {
            aVar.i(aVar2);
        }
    }

    private static E6.b c(C4106a aVar) {
        if (aVar == null) {
            return null;
        }
        return new E6.a(aVar);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.f30058m++;
        if (U5.a.w(2)) {
            U5.a.y(f30044r, "Dropped a frame. Count: %s", Integer.valueOf(this.f30058m));
        }
    }

    private void f(long j10) {
        long j11 = this.f30049d + j10;
        this.f30051f = j11;
        scheduleSelf(this.f30062q, j11);
    }

    public void a() {
        C4106a aVar = this.f30046a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void draw(Canvas canvas) {
        long j10;
        if (this.f30046a != null && this.f30047b != null) {
            long d10 = d();
            if (this.f30048c) {
                j10 = (d10 - this.f30049d) + this.f30057l;
            } else {
                j10 = Math.max(this.f30050e, 0);
            }
            int b10 = this.f30047b.b(j10, this.f30050e);
            if (b10 == -1) {
                b10 = this.f30046a.a() - 1;
                this.f30059n.c(this);
                this.f30048c = false;
            } else if (b10 == 0 && this.f30052g != -1 && d10 >= this.f30051f) {
                this.f30059n.a(this);
            }
            boolean h10 = this.f30046a.h(this, canvas, b10);
            if (h10) {
                this.f30059n.d(this, b10);
                this.f30052g = b10;
            }
            if (!h10) {
                e();
            }
            long d11 = d();
            if (this.f30048c) {
                long a10 = this.f30047b.a(d11 - this.f30049d);
                if (a10 != -1) {
                    f(a10 + this.f30056k);
                } else {
                    this.f30059n.c(this);
                    this.f30048c = false;
                }
            }
            this.f30050e = j10;
        }
    }

    public int getIntrinsicHeight() {
        C4106a aVar = this.f30046a;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.c();
    }

    public int getIntrinsicWidth() {
        C4106a aVar = this.f30046a;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.e();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f30048c;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C4106a aVar = this.f30046a;
        if (aVar != null) {
            aVar.d(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        if (this.f30048c) {
            return false;
        }
        long j10 = (long) i10;
        if (this.f30050e == j10) {
            return false;
        }
        this.f30050e = j10;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i10) {
        if (this.f30061p == null) {
            this.f30061p = new C3955d();
        }
        this.f30061p.b(i10);
        C4106a aVar = this.f30046a;
        if (aVar != null) {
            aVar.m(i10);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f30061p == null) {
            this.f30061p = new C3955d();
        }
        this.f30061p.c(colorFilter);
        C4106a aVar = this.f30046a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
    }

    public void start() {
        C4106a aVar;
        if (!this.f30048c && (aVar = this.f30046a) != null && aVar.a() > 1) {
            this.f30048c = true;
            long d10 = d();
            long j10 = d10 - this.f30053h;
            this.f30049d = j10;
            this.f30051f = j10;
            this.f30050e = d10 - this.f30054i;
            this.f30052g = this.f30055j;
            invalidateSelf();
            this.f30059n.b(this);
        }
    }

    public void stop() {
        if (this.f30048c) {
            long d10 = d();
            this.f30053h = d10 - this.f30049d;
            this.f30054i = d10 - this.f30050e;
            this.f30055j = this.f30052g;
            this.f30048c = false;
            this.f30049d = 0;
            this.f30051f = 0;
            this.f30050e = -1;
            this.f30052g = -1;
            unscheduleSelf(this.f30062q);
            this.f30059n.c(this);
        }
    }
}
