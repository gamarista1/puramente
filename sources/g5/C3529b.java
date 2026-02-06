package g5;

import P4.a;
import W4.b;
import W4.d;
import android.graphics.Bitmap;

/* renamed from: g5.b  reason: case insensitive filesystem */
public final class C3529b implements a.C0546a {

    /* renamed from: a  reason: collision with root package name */
    private final d f43611a;

    /* renamed from: b  reason: collision with root package name */
    private final b f43612b;

    public C3529b(d dVar, b bVar) {
        this.f43611a = dVar;
        this.f43612b = bVar;
    }

    public void a(Bitmap bitmap) {
        this.f43611a.c(bitmap);
    }

    public byte[] b(int i10) {
        b bVar = this.f43612b;
        if (bVar == null) {
            return new byte[i10];
        }
        return (byte[]) bVar.d(i10, byte[].class);
    }

    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f43611a.e(i10, i11, config);
    }

    public int[] d(int i10) {
        b bVar = this.f43612b;
        if (bVar == null) {
            return new int[i10];
        }
        return (int[]) bVar.d(i10, int[].class);
    }

    public void e(byte[] bArr) {
        b bVar = this.f43612b;
        if (bVar != null) {
            bVar.c(bArr);
        }
    }

    public void f(int[] iArr) {
        b bVar = this.f43612b;
        if (bVar != null) {
            bVar.c(iArr);
        }
    }
}
