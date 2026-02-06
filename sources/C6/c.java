package C6;

import E6.b;
import android.os.SystemClock;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f30064a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30065b;

    /* renamed from: c  reason: collision with root package name */
    private long f30066c = 8;

    /* renamed from: d  reason: collision with root package name */
    private long f30067d;

    /* renamed from: e  reason: collision with root package name */
    private long f30068e;

    /* renamed from: f  reason: collision with root package name */
    private long f30069f;

    /* renamed from: g  reason: collision with root package name */
    private long f30070g;

    /* renamed from: h  reason: collision with root package name */
    private long f30071h;

    /* renamed from: i  reason: collision with root package name */
    private long f30072i;

    /* renamed from: j  reason: collision with root package name */
    private int f30073j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f30074k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f30075l;

    public c(b bVar) {
        C6496s.h(bVar, "frameScheduler");
        this.f30064a = bVar;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long j10;
        long d10 = d();
        if (this.f30065b) {
            j10 = (d10 - this.f30069f) + this.f30067d;
        } else {
            j10 = Math.max(this.f30071h, 0);
        }
        int b10 = this.f30064a.b(j10, this.f30071h);
        this.f30071h = j10;
        return b10;
    }

    public final boolean b() {
        return this.f30065b;
    }

    public final long c() {
        if (!this.f30065b) {
            return -1;
        }
        long a10 = this.f30064a.a(d() - this.f30069f);
        if (a10 != -1) {
            long j10 = a10 + this.f30066c;
            this.f30070g = this.f30069f + j10;
            return j10;
        }
        this.f30065b = false;
        return -1;
    }

    public final void e() {
        this.f30075l++;
    }

    public final void f(int i10) {
        this.f30073j = i10;
    }

    public final void g(boolean z10) {
        this.f30065b = z10;
    }

    public final boolean h() {
        if (this.f30073j == -1 || d() < this.f30070g) {
            return false;
        }
        return true;
    }

    public final void i() {
        if (!this.f30065b) {
            long d10 = d();
            long j10 = d10 - this.f30068e;
            this.f30069f = j10;
            this.f30070g = j10;
            this.f30071h = d10 - this.f30072i;
            this.f30073j = this.f30074k;
            this.f30065b = true;
        }
    }

    public final void j() {
        if (this.f30065b) {
            long d10 = d();
            this.f30068e = d10 - this.f30069f;
            this.f30072i = d10 - this.f30071h;
            this.f30069f = 0;
            this.f30070g = 0;
            this.f30071h = -1;
            this.f30073j = -1;
            this.f30065b = false;
        }
    }
}
