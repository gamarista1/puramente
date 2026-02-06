package Wh;

import Ph.a;
import Sh.b;
import ai.c;
import bi.d;
import bi.e;
import java.nio.ByteBuffer;

public class v extends c {

    /* renamed from: l  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66171l;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66172m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66173n;

    /* renamed from: k  reason: collision with root package name */
    private long[] f66174k;

    static {
        j();
    }

    public v() {
        super("stss");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("SyncSampleBox.java", v.class);
        f66171l = bVar.f("method-execution", bVar.e("1", "getSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "[J"), 45);
        f66172m = bVar.f("method-execution", bVar.e("1", "setSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "[J", "sampleNumber", "", "void"), 49);
        f66173n = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "java.lang.String"), 80);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        int a10 = bi.a.a(d.j(byteBuffer));
        this.f66174k = new long[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            this.f66174k[i10] = d.j(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, (long) this.f66174k.length);
        for (long g10 : this.f66174k) {
            e.g(byteBuffer, g10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (((long) this.f66174k.length) * 4) + 8;
    }

    public void q(long[] jArr) {
        ai.e.b().c(b.c(f66172m, this, this, jArr));
        this.f66174k = jArr;
    }

    public String toString() {
        ai.e.b().c(b.b(f66173n, this, this));
        return "SyncSampleBox[entryCount=" + this.f66174k.length + "]";
    }
}
