package Wh;

import Ph.a;
import Sh.b;
import bi.d;
import bi.e;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;

public class h extends a {

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66074o;

    /* renamed from: p  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66075p;

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66076q;

    /* renamed from: r  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66077r;

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66078s;

    /* renamed from: k  reason: collision with root package name */
    private int f66079k;

    /* renamed from: l  reason: collision with root package name */
    private int f66080l;

    /* renamed from: m  reason: collision with root package name */
    private long f66081m;

    /* renamed from: n  reason: collision with root package name */
    private long f66082n;

    static {
        j();
    }

    public h() {
        super("hmhd");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("HintMediaHeaderBox.java", h.class);
        f66074o = bVar.f("method-execution", bVar.e("1", "getMaxPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 42);
        f66075p = bVar.f("method-execution", bVar.e("1", "getAvgPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 46);
        f66076q = bVar.f("method-execution", bVar.e("1", "getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", Constants.LONG), 50);
        f66077r = bVar.f("method-execution", bVar.e("1", "getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", Constants.LONG), 54);
        f66078s = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66079k = d.h(byteBuffer);
        this.f66080l = d.h(byteBuffer);
        this.f66081m = d.j(byteBuffer);
        this.f66082n = d.j(byteBuffer);
        d.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.e(byteBuffer, this.f66079k);
        e.e(byteBuffer, this.f66080l);
        e.g(byteBuffer, this.f66081m);
        e.g(byteBuffer, this.f66082n);
        e.g(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 20;
    }

    public String toString() {
        ai.e.b().c(b.b(f66078s, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.f66079k + ", avgPduSize=" + this.f66080l + ", maxBitrate=" + this.f66081m + ", avgBitrate=" + this.f66082n + '}';
    }
}
