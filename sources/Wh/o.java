package Wh;

import ai.b;
import bi.e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class o extends b implements Uh.b {

    /* renamed from: d  reason: collision with root package name */
    private int f66144d;

    /* renamed from: e  reason: collision with root package name */
    private int f66145e;

    public o() {
        super("stsd");
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(o());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        e.i(allocate, this.f66144d);
        e.f(allocate, this.f66145e);
        e.g(allocate, (long) b().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        n(writableByteChannel);
    }

    public long getSize() {
        int i10;
        long f10 = f();
        long j10 = 8 + f10;
        if (this.f67097c || f10 + 16 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return j10 + ((long) i10);
    }
}
