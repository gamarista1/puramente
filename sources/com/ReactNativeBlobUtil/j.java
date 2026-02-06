package com.ReactNativeBlobUtil;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private long f36711a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f36712b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f36713c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f36714d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36715e = false;

    /* renamed from: f  reason: collision with root package name */
    private a f36716f;

    enum a {
        Upload,
        Download
    }

    j(boolean z10, int i10, int i11, a aVar) {
        a aVar2 = a.Upload;
        this.f36715e = z10;
        this.f36714d = i10;
        this.f36716f = aVar;
        this.f36713c = i11;
    }

    public boolean a(float f10) {
        boolean z10;
        int i10 = this.f36713c;
        boolean z11 = false;
        if (i10 <= 0 || f10 <= 0.0f || Math.floor((double) (f10 * ((float) i10))) > ((double) this.f36712b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (System.currentTimeMillis() - this.f36711a > ((long) this.f36714d) && this.f36715e && z10) {
            z11 = true;
        }
        if (z11) {
            this.f36712b++;
            this.f36711a = System.currentTimeMillis();
        }
        return z11;
    }
}
