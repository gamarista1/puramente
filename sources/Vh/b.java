package Vh;

import bi.d;
import java.nio.ByteBuffer;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    int f65505a;

    /* renamed from: b  reason: collision with root package name */
    int f65506b;

    /* renamed from: c  reason: collision with root package name */
    int f65507c;

    /* access modifiers changed from: package-private */
    public abstract int a();

    public int b() {
        return a() + c() + 1;
    }

    public int c() {
        int a10 = a();
        int i10 = 0;
        while (true) {
            if (a10 <= 0 && i10 >= this.f65507c) {
                return i10;
            }
            a10 >>>= 7;
            i10++;
        }
    }

    public final void d(int i10, ByteBuffer byteBuffer) {
        this.f65505a = i10;
        int l10 = d.l(byteBuffer);
        this.f65506b = l10 & 127;
        int i11 = 1;
        while ((l10 >>> 7) == 1) {
            l10 = d.l(byteBuffer);
            i11++;
            this.f65506b = (this.f65506b << 7) | (l10 & 127);
        }
        this.f65507c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f65506b);
        e(slice);
        byteBuffer.position(byteBuffer.position() + this.f65506b);
    }

    public abstract void e(ByteBuffer byteBuffer);

    public void f(ByteBuffer byteBuffer, int i10) {
        int position = byteBuffer.position();
        int i11 = 0;
        while (true) {
            if (i10 > 0 || i11 < this.f65507c) {
                i11++;
                if (i10 > 0) {
                    byteBuffer.put((c() + position) - i11, (byte) (i10 & 127));
                } else {
                    byteBuffer.put((c() + position) - i11, Byte.MIN_VALUE);
                }
                i10 >>>= 7;
            } else {
                byteBuffer.position(position + c());
                return;
            }
        }
    }
}
