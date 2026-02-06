package Wh;

import Ph.a;
import Sh.b;
import bi.d;
import bi.e;
import java.nio.ByteBuffer;

public class t extends b {

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66167m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66168n;

    /* renamed from: l  reason: collision with root package name */
    private long[] f66169l = new long[0];

    static {
        j();
    }

    public t() {
        super("stco");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("StaticChunkOffsetBox.java", t.class);
        f66167m = bVar.f("method-execution", bVar.e("1", "getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "", "", "", "[J"), 38);
        f66168n = bVar.f("method-execution", bVar.e("1", "setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 43);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        int a10 = bi.a.a(d.j(byteBuffer));
        this.f66169l = new long[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            this.f66169l[i10] = d.j(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, (long) this.f66169l.length);
        for (long g10 : this.f66169l) {
            e.g(byteBuffer, g10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f66169l.length * 4) + 8);
    }

    public long[] q() {
        ai.e.b().c(b.b(f66167m, this, this));
        return this.f66169l;
    }

    public void r(long[] jArr) {
        ai.e.b().c(b.c(f66168n, this, this, jArr));
        this.f66169l = jArr;
    }
}
