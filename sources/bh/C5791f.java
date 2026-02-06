package bh;

import Ug.C5579l0;
import qf.g;

/* renamed from: bh.f  reason: case insensitive filesystem */
public abstract class C5791f extends C5579l0 {

    /* renamed from: d  reason: collision with root package name */
    private final int f67301d;

    /* renamed from: e  reason: collision with root package name */
    private final int f67302e;

    /* renamed from: f  reason: collision with root package name */
    private final long f67303f;

    /* renamed from: g  reason: collision with root package name */
    private final String f67304g;

    /* renamed from: h  reason: collision with root package name */
    private C5786a f67305h = D1();

    public C5791f(int i10, int i11, long j10, String str) {
        this.f67301d = i10;
        this.f67302e = i11;
        this.f67303f = j10;
        this.f67304g = str;
    }

    private final C5786a D1() {
        return new C5786a(this.f67301d, this.f67302e, this.f67303f, this.f67304g);
    }

    public void A1(g gVar, Runnable runnable) {
        C5786a.v(this.f67305h, runnable, (C5794i) null, true, 2, (Object) null);
    }

    public final void E1(Runnable runnable, C5794i iVar, boolean z10) {
        this.f67305h.q(runnable, iVar, z10);
    }

    public void z1(g gVar, Runnable runnable) {
        C5786a.v(this.f67305h, runnable, (C5794i) null, false, 6, (Object) null);
    }
}
