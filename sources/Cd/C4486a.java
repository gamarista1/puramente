package cd;

import java.lang.reflect.Array;

/* renamed from: cd.a  reason: case insensitive filesystem */
public final class C4486a {

    /* renamed from: a  reason: collision with root package name */
    private final C4487b[] f53716a;

    /* renamed from: b  reason: collision with root package name */
    private int f53717b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53718c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53719d;

    C4486a(int i10, int i11) {
        C4487b[] bVarArr = new C4487b[i10];
        this.f53716a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f53716a[i12] = new C4487b(((i11 + 4) * 17) + 1);
        }
        this.f53719d = i11 * 17;
        this.f53718c = i10;
        this.f53717b = -1;
    }

    /* access modifiers changed from: package-private */
    public C4487b a() {
        return this.f53716a[this.f53717b];
    }

    public byte[][] b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = this.f53719d * i10;
        iArr[0] = this.f53718c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i12 = this.f53718c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f53716a[i13 / i11].b(i10);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f53717b++;
    }
}
