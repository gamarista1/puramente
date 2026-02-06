package ai;

import Uh.a;
import bi.e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class b extends a implements Uh.b {

    /* renamed from: b  reason: collision with root package name */
    protected String f67096b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f67097c;

    public b(String str) {
        this.f67096b = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(o());
        n(writableByteChannel);
    }

    public long getSize() {
        int i10;
        long f10 = f();
        if (this.f67097c || 8 + f10 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return f10 + ((long) i10);
    }

    /* access modifiers changed from: protected */
    public ByteBuffer o() {
        ByteBuffer byteBuffer;
        if (this.f67097c || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.f67096b.getBytes()[0];
            bArr[5] = this.f67096b.getBytes()[1];
            bArr[6] = this.f67096b.getBytes()[2];
            bArr[7] = this.f67096b.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr);
            byteBuffer.position(8);
            e.h(byteBuffer, getSize());
        } else {
            byte[] bArr2 = new byte[8];
            bArr2[4] = this.f67096b.getBytes()[0];
            bArr2[5] = this.f67096b.getBytes()[1];
            bArr2[6] = this.f67096b.getBytes()[2];
            bArr2[7] = this.f67096b.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr2);
            e.g(byteBuffer, getSize());
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
}
