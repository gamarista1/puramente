package Wh;

import Ph.a;
import Sh.b;
import ai.c;
import bi.d;
import bi.e;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;

public class p extends c {

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66146n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66147o;

    /* renamed from: p  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66148p;

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66149q;

    /* renamed from: r  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66150r;

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66151s;

    /* renamed from: t  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66152t;

    /* renamed from: k  reason: collision with root package name */
    int f66153k;

    /* renamed from: l  reason: collision with root package name */
    private long f66154l;

    /* renamed from: m  reason: collision with root package name */
    private long[] f66155m = new long[0];

    static {
        j();
    }

    public p() {
        super("stsz");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("SampleSizeBox.java", p.class);
        f66146n = bVar.f("method-execution", bVar.e("1", "getSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", Constants.LONG), 49);
        f66147o = bVar.f("method-execution", bVar.e("1", "setSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", Constants.LONG, "sampleSize", "", "void"), 53);
        f66148p = bVar.f("method-execution", bVar.e("1", "getSampleSizeAtIndex", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "int", "index", "", Constants.LONG), 58);
        f66149q = bVar.f("method-execution", bVar.e("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", Constants.LONG), 66);
        f66150r = bVar.f("method-execution", bVar.e("1", "getSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "[J"), 75);
        f66151s = bVar.f("method-execution", bVar.e("1", "setSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "[J", "sampleSizes", "", "void"), 79);
        f66152t = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "java.lang.String"), 118);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66154l = d.j(byteBuffer);
        int a10 = bi.a.a(d.j(byteBuffer));
        this.f66153k = a10;
        if (this.f66154l == 0) {
            this.f66155m = new long[a10];
            for (int i10 = 0; i10 < this.f66153k; i10++) {
                this.f66155m[i10] = d.j(byteBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, this.f66154l);
        if (this.f66154l == 0) {
            e.g(byteBuffer, (long) this.f66155m.length);
            for (long g10 : this.f66155m) {
                e.g(byteBuffer, g10);
            }
            return;
        }
        e.g(byteBuffer, (long) this.f66153k);
    }

    /* access modifiers changed from: protected */
    public long c() {
        int i10;
        if (this.f66154l == 0) {
            i10 = this.f66155m.length * 4;
        } else {
            i10 = 0;
        }
        return (long) (i10 + 12);
    }

    public long q() {
        int length;
        ai.e.b().c(b.b(f66149q, this, this));
        if (this.f66154l > 0) {
            length = this.f66153k;
        } else {
            length = this.f66155m.length;
        }
        return (long) length;
    }

    public long r() {
        ai.e.b().c(b.b(f66146n, this, this));
        return this.f66154l;
    }

    public void s(long[] jArr) {
        ai.e.b().c(b.c(f66151s, this, this, jArr));
        this.f66155m = jArr;
    }

    public String toString() {
        ai.e.b().c(b.b(f66152t, this, this));
        return "SampleSizeBox[sampleSize=" + r() + ";sampleCount=" + q() + "]";
    }
}
