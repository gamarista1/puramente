package P1;

import java.nio.ByteBuffer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f4998a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f4999b;

    /* renamed from: c  reason: collision with root package name */
    private int f5000c;

    /* renamed from: d  reason: collision with root package name */
    private int f5001d;

    /* renamed from: e  reason: collision with root package name */
    d f5002e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f4999b.getInt(i10);
    }

    /* access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f5001d) {
            return this.f4999b.getShort(this.f5000c + i10);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f4999b = byteBuffer;
        if (byteBuffer != null) {
            this.f4998a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f5000c = i11;
            this.f5001d = this.f4999b.getShort(i11);
            return;
        }
        this.f4998a = 0;
        this.f5000c = 0;
        this.f5001d = 0;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f4998a;
        return i11 + this.f4999b.getInt(i11) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f4998a;
        return this.f4999b.getInt(i11 + this.f4999b.getInt(i11));
    }
}
