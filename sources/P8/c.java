package P8;

import Q8.a;

public class c extends e {

    /* renamed from: m  reason: collision with root package name */
    static final int f33536m = e.a("ANMF");

    /* renamed from: d  reason: collision with root package name */
    int f33537d;

    /* renamed from: e  reason: collision with root package name */
    int f33538e;

    /* renamed from: f  reason: collision with root package name */
    int f33539f;

    /* renamed from: g  reason: collision with root package name */
    int f33540g;

    /* renamed from: h  reason: collision with root package name */
    int f33541h;

    /* renamed from: i  reason: collision with root package name */
    byte f33542i;

    /* renamed from: j  reason: collision with root package name */
    a f33543j;

    /* renamed from: k  reason: collision with root package name */
    i f33544k;

    /* renamed from: l  reason: collision with root package name */
    j f33545l;

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        int available = aVar.available();
        this.f33537d = aVar.d();
        this.f33538e = aVar.d();
        this.f33539f = aVar.a();
        this.f33540g = aVar.a();
        this.f33541h = aVar.d();
        this.f33542i = aVar.peek();
        long j10 = (long) (available - this.f33554b);
        while (((long) aVar.available()) > j10) {
            e c10 = m.c(aVar);
            if (c10 instanceof a) {
                this.f33543j = (a) c10;
            } else if (c10 instanceof i) {
                this.f33544k = (i) c10;
            } else if (c10 instanceof j) {
                this.f33545l = (j) c10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if ((this.f33542i & 2) == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if ((this.f33542i & 1) == 1) {
            return true;
        }
        return false;
    }
}
