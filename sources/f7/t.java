package f7;

import W5.d;
import android.graphics.Bitmap;

public class t implements i {

    /* renamed from: a  reason: collision with root package name */
    protected final C3511A f43461a = new j();

    /* renamed from: b  reason: collision with root package name */
    private final int f43462b;

    /* renamed from: c  reason: collision with root package name */
    private int f43463c;

    /* renamed from: d  reason: collision with root package name */
    private final F f43464d;

    /* renamed from: e  reason: collision with root package name */
    private int f43465e;

    public t(int i10, int i11, F f10, d dVar) {
        this.f43462b = i10;
        this.f43463c = i11;
        this.f43464d = f10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap h(int i10) {
        this.f43464d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i10) {
        while (true) {
            if (this.f43465e <= i10) {
                break;
            }
            Bitmap bitmap = (Bitmap) this.f43461a.b();
            if (bitmap == null) {
                break;
            }
            int a10 = this.f43461a.a(bitmap);
            this.f43465e -= a10;
            this.f43464d.b(a10);
        }
    }

    /* renamed from: i */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f43465e;
            int i12 = this.f43462b;
            if (i11 > i12) {
                k(i12);
            }
            Bitmap bitmap = (Bitmap) this.f43461a.get(i10);
            if (bitmap != null) {
                int a10 = this.f43461a.a(bitmap);
                this.f43465e -= a10;
                this.f43464d.e(a10);
                return bitmap;
            }
            return h(i10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void a(Bitmap bitmap) {
        int a10 = this.f43461a.a(bitmap);
        if (a10 <= this.f43463c) {
            this.f43464d.c(a10);
            this.f43461a.c(bitmap);
            synchronized (this) {
                this.f43465e += a10;
            }
        }
    }
}
