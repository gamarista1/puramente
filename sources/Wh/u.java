package Wh;

import Ph.a;
import Sh.b;
import ai.e;
import java.nio.ByteBuffer;

public class u extends a {

    /* renamed from: k  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66170k;

    static {
        j();
    }

    public u() {
        super("sthd");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("SubtitleMediaHeaderBox.java", u.class);
        f66170k = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 4;
    }

    public String toString() {
        e.b().c(b.b(f66170k, this, this));
        return "SubtitleMediaHeaderBox";
    }
}
