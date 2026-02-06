package Xh;

import Ph.a;
import Vh.h;
import ai.e;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;

public class b extends a {

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66728s;

    /* renamed from: t  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66729t;

    /* renamed from: u  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66730u;

    /* renamed from: v  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66731v;

    static {
        j();
    }

    public b() {
        super("esds");
    }

    private static /* synthetic */ void j() {
        Sh.b bVar = new Sh.b("ESDescriptorBox.java", b.class);
        f66728s = bVar.f("method-execution", bVar.e("1", "getEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor"), 36);
        f66729t = bVar.f("method-execution", bVar.e("1", "setEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 40);
        f66730u = bVar.f("method-execution", bVar.e("1", "equals", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN), 45);
        f66731v = bVar.f("method-execution", bVar.e("1", "hashCode", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "int"), 56);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        h t10 = t();
        if (t10 != null) {
            byteBuffer.put((ByteBuffer) t10.g().rewind());
        } else {
            byteBuffer.put(this.f66727l.duplicate());
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        int remaining;
        h t10 = t();
        if (t10 != null) {
            remaining = t10.b();
        } else {
            remaining = this.f66727l.remaining();
        }
        return (long) (remaining + 4);
    }

    public boolean equals(Object obj) {
        e.b().c(Sh.b.c(f66730u, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f66727l;
        ByteBuffer byteBuffer2 = ((b) obj).f66727l;
        if (byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        e.b().c(Sh.b.b(f66731v, this, this));
        ByteBuffer byteBuffer = this.f66727l;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public h t() {
        e.b().c(Sh.b.b(f66728s, this, this));
        return (h) super.q();
    }

    public void u(h hVar) {
        e.b().c(Sh.b.c(f66729t, this, this, hVar));
        super.s(hVar);
    }
}
