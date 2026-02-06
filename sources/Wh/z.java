package Wh;

import Ph.a;
import Sh.b;
import bi.d;
import bi.e;
import java.nio.ByteBuffer;

public class z extends a {

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66223m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66224n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66225o;

    /* renamed from: p  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66226p;

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66227q;

    /* renamed from: k  reason: collision with root package name */
    private int f66228k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int[] f66229l = new int[3];

    static {
        j();
    }

    public z() {
        super("vmhd");
        this.f67101h = 1;
    }

    private static /* synthetic */ void j() {
        b bVar = new b("VideoMediaHeaderBox.java", z.class);
        f66223m = bVar.f("method-execution", bVar.e("1", "getGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "int"), 39);
        f66224n = bVar.f("method-execution", bVar.e("1", "setGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 43);
        f66225o = bVar.f("method-execution", bVar.e("1", "getOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "[I"), 47);
        f66226p = bVar.f("method-execution", bVar.e("1", "setOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 51);
        f66227q = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 78);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66228k = d.h(byteBuffer);
        this.f66229l = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f66229l[i10] = d.h(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.e(byteBuffer, this.f66228k);
        for (int e10 : this.f66229l) {
            e.e(byteBuffer, e10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 12;
    }

    public int q() {
        ai.e.b().c(b.b(f66223m, this, this));
        return this.f66228k;
    }

    public int[] r() {
        ai.e.b().c(b.b(f66225o, this, this));
        return this.f66229l;
    }

    public String toString() {
        ai.e.b().c(b.b(f66227q, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + q() + ";opcolor0=" + r()[0] + ";opcolor1=" + r()[1] + ";opcolor2=" + r()[2] + "]";
    }
}
