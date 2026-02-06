package Xh;

import Ph.a;
import Vh.b;
import Vh.l;
import ai.c;
import ai.e;
import ci.d;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class a extends c {

    /* renamed from: m  reason: collision with root package name */
    private static ci.c f66720m = d.k(a.class.getName());

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66721n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66722o;

    /* renamed from: p  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66723p;

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66724q;

    /* renamed from: r  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66725r;

    /* renamed from: k  reason: collision with root package name */
    protected b f66726k;

    /* renamed from: l  reason: collision with root package name */
    protected ByteBuffer f66727l;

    static {
        j();
    }

    public a(String str) {
        super(str);
    }

    private static /* synthetic */ void j() {
        Sh.b bVar = new Sh.b("AbstractDescriptorBox.java", a.class);
        f66721n = bVar.f("method-execution", bVar.e("1", "getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 43);
        f66722o = bVar.f("method-execution", bVar.e("1", "setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 47);
        f66723p = bVar.f("method-execution", bVar.e("1", "getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"), 63);
        f66724q = bVar.f("method-execution", bVar.e("1", "setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 67);
        f66725r = bVar.f("method-execution", bVar.e("1", "getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.lang.String"), 71);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66727l = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.f66727l.rewind();
            this.f66726k = l.a(-1, this.f66727l.duplicate());
        } catch (IOException e10) {
            f66720m.c("Error parsing ObjectDescriptor", e10);
        } catch (IndexOutOfBoundsException e11) {
            f66720m.c("Error parsing ObjectDescriptor", e11);
        }
    }

    public b q() {
        e.b().c(Sh.b.b(f66723p, this, this));
        return this.f66726k;
    }

    public void r(ByteBuffer byteBuffer) {
        e.b().c(Sh.b.c(f66722o, this, this, byteBuffer));
        this.f66727l = byteBuffer;
    }

    public void s(b bVar) {
        e.b().c(Sh.b.c(f66724q, this, this, bVar));
        this.f66726k = bVar;
    }
}
