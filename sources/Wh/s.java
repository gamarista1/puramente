package Wh;

import Ph.a;
import Sh.b;
import bi.d;
import bi.e;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;

public class s extends a {

    /* renamed from: l  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66164l;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66165m;

    /* renamed from: k  reason: collision with root package name */
    private float f66166k;

    static {
        j();
    }

    public s() {
        super("smhd");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("SoundMediaHeaderBox.java", s.class);
        f66164l = bVar.f("method-execution", bVar.e("1", "getBalance", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", AttributeType.FLOAT), 36);
        f66165m = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66166k = d.e(byteBuffer);
        d.h(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.c(byteBuffer, (double) this.f66166k);
        e.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 8;
    }

    public float q() {
        ai.e.b().c(b.b(f66164l, this, this));
        return this.f66166k;
    }

    public String toString() {
        ai.e.b().c(b.b(f66165m, this, this));
        return "SoundMediaHeaderBox[balance=" + q() + "]";
    }
}
