package Wh;

import Ph.a;
import ai.c;
import ai.e;

public abstract class b extends c {

    /* renamed from: k  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66047k;

    static {
        j();
    }

    public b(String str) {
        super(str);
    }

    private static /* synthetic */ void j() {
        Sh.b bVar = new Sh.b("ChunkOffsetBox.java", b.class);
        f66047k = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public abstract long[] q();

    public String toString() {
        e.b().c(Sh.b.b(f66047k, this, this));
        return getClass().getSimpleName() + "[entryCount=" + q().length + "]";
    }
}
