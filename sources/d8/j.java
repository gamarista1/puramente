package D8;

import E8.a;

class j extends e {

    /* renamed from: h  reason: collision with root package name */
    static final int f30609h = e.a("IHDR");

    /* renamed from: e  reason: collision with root package name */
    int f30610e;

    /* renamed from: f  reason: collision with root package name */
    int f30611f;

    /* renamed from: g  reason: collision with root package name */
    byte[] f30612g = new byte[5];

    j() {
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f30610e = aVar.c();
        this.f30611f = aVar.c();
        byte[] bArr = this.f30612g;
        aVar.read(bArr, 0, bArr.length);
    }
}
