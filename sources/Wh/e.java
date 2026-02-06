package Wh;

import ai.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class e extends b implements Uh.b {

    /* renamed from: d  reason: collision with root package name */
    private int f66049d;

    /* renamed from: e  reason: collision with root package name */
    private int f66050e;

    public e() {
        super("dref");
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(o());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        bi.e.i(allocate, this.f66049d);
        bi.e.f(allocate, this.f66050e);
        bi.e.g(allocate, (long) b().size());
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
