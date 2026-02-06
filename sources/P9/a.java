package P9;

import ia.C3612j;
import ia.n;
import ja.C3645a;
import k9.C3717q0;

public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f33573k;

    /* renamed from: l  reason: collision with root package name */
    public final long f33574l;

    /* renamed from: m  reason: collision with root package name */
    private c f33575m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f33576n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(C3612j jVar, n nVar, C3717q0 q0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(jVar, nVar, q0Var, i10, obj, j10, j11, j14);
        this.f33573k = j12;
        this.f33574l = j13;
    }

    public final int i(int i10) {
        return ((int[]) C3645a.h(this.f33576n))[i10];
    }

    /* access modifiers changed from: protected */
    public final c j() {
        return (c) C3645a.h(this.f33575m);
    }

    public void k(c cVar) {
        this.f33575m = cVar;
        this.f33576n = cVar.a();
    }
}
