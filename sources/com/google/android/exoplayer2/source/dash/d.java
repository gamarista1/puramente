package com.google.android.exoplayer2.source.dash;

import F9.c;
import N9.M;
import R9.f;
import k9.C3717q0;
import k9.C3718r0;
import n9.C3871g;

final class d implements M {

    /* renamed from: a  reason: collision with root package name */
    private final C3717q0 f42893a;

    /* renamed from: b  reason: collision with root package name */
    private final c f42894b = new c();

    /* renamed from: c  reason: collision with root package name */
    private long[] f42895c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42896d;

    /* renamed from: e  reason: collision with root package name */
    private f f42897e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f42898f;

    /* renamed from: g  reason: collision with root package name */
    private int f42899g;

    /* renamed from: h  reason: collision with root package name */
    private long f42900h = -9223372036854775807L;

    public d(f fVar, C3717q0 q0Var, boolean z10) {
        this.f42893a = q0Var;
        this.f42897e = fVar;
        this.f42895c = fVar.f33784b;
        c(fVar, z10);
    }

    public String a() {
        return this.f42897e.a();
    }

    public void b(long j10) {
        int e10 = ja.M.e(this.f42895c, j10, true, false);
        this.f42899g = e10;
        if (!this.f42896d || e10 != this.f42895c.length) {
            j10 = -9223372036854775807L;
        }
        this.f42900h = j10;
    }

    public void c(f fVar, boolean z10) {
        long j10;
        int i10 = this.f42899g;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f42895c[i10 - 1];
        }
        this.f42896d = z10;
        this.f42897e = fVar;
        long[] jArr = fVar.f33784b;
        this.f42895c = jArr;
        long j11 = this.f42900h;
        if (j11 != -9223372036854775807L) {
            b(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f42899g = ja.M.e(jArr, j10, false, false);
        }
    }

    public boolean d() {
        return true;
    }

    public void e() {
    }

    public int k(long j10) {
        int max = Math.max(this.f42899g, ja.M.e(this.f42895c, j10, true, false));
        int i10 = max - this.f42899g;
        this.f42899g = max;
        return i10;
    }

    public int q(C3718r0 r0Var, C3871g gVar, int i10) {
        boolean z10;
        int i11 = this.f42899g;
        if (i11 == this.f42895c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f42896d) {
            gVar.t(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f42898f) {
            r0Var.f45824b = this.f42893a;
            this.f42898f = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f42899g = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f42894b.a(this.f42897e.f33783a[i11]);
                gVar.x(a10.length);
                gVar.f46950c.put(a10);
            }
            gVar.f46952e = this.f42895c[i11];
            gVar.t(1);
            return -4;
        }
    }
}
