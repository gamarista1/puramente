package Wh;

import Ph.a;
import Sh.b;
import Uh.c;
import ai.a;
import bi.d;
import bi.e;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class f extends a {

    /* renamed from: j  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66051j;

    /* renamed from: k  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66052k;

    /* renamed from: l  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66053l;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66054m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66055n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66056o;

    /* renamed from: g  reason: collision with root package name */
    private String f66057g;

    /* renamed from: h  reason: collision with root package name */
    private long f66058h;

    /* renamed from: i  reason: collision with root package name */
    private List f66059i;

    static {
        j();
    }

    public f(String str, long j10, List list) {
        super("ftyp");
        Collections.emptyList();
        this.f66057g = str;
        this.f66058h = j10;
        this.f66059i = list;
    }

    private static /* synthetic */ void j() {
        b bVar = new b("FileTypeBox.java", f.class);
        f66051j = bVar.f("method-execution", bVar.e("1", "getMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.lang.String"), 85);
        f66052k = bVar.f("method-execution", bVar.e("1", "setMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        f66053l = bVar.f("method-execution", bVar.e("1", "getMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", Constants.LONG), 104);
        f66054m = bVar.f("method-execution", bVar.e("1", "setMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", Constants.LONG, "minorVersion", "", "void"), 113);
        f66055n = bVar.f("method-execution", bVar.e("1", "getCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.util.List"), 122);
        f66056o = bVar.f("method-execution", bVar.e("1", "setCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    public void a(ByteBuffer byteBuffer) {
        this.f66057g = d.b(byteBuffer);
        this.f66058h = d.j(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f66059i = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f66059i.add(d.b(byteBuffer));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        byteBuffer.put(c.o(this.f66057g));
        e.g(byteBuffer, this.f66058h);
        for (String o10 : this.f66059i) {
            byteBuffer.put(c.o(o10));
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f66059i.size() * 4) + 8);
    }

    public String k() {
        ai.e.b().c(b.b(f66051j, this, this));
        return this.f66057g;
    }

    public long l() {
        ai.e.b().c(b.b(f66053l, this, this));
        return this.f66058h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FileTypeBox[");
        sb2.append("majorBrand=");
        sb2.append(k());
        sb2.append(";");
        sb2.append("minorVersion=");
        sb2.append(l());
        for (String append : this.f66059i) {
            sb2.append(";");
            sb2.append("compatibleBrand=");
            sb2.append(append);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
