package Va;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private long f53425a;

    /* renamed from: b  reason: collision with root package name */
    private long f53426b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f53427c;

    /* renamed from: d  reason: collision with root package name */
    private int f53428d;

    /* renamed from: e  reason: collision with root package name */
    private int f53429e;

    public d(long j10, long j11) {
        this.f53427c = null;
        this.f53428d = 0;
        this.f53429e = 1;
        this.f53425a = j10;
        this.f53426b = j11;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f53428d = valueAnimator.getRepeatCount();
        dVar.f53429e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f53419b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f53420c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f53421d;
        }
        return interpolator;
    }

    public long b() {
        return this.f53425a;
    }

    public long c() {
        return this.f53426b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f53427c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f53419b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f53428d;
    }

    public int g() {
        return this.f53429e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f53428d = 0;
        this.f53429e = 1;
        this.f53425a = j10;
        this.f53426b = j11;
        this.f53427c = timeInterpolator;
    }
}
