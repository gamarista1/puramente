package Wh;

import Ph.a;
import Sh.b;
import ai.c;
import bi.d;
import bi.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class r extends c {

    /* renamed from: l  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66156l;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66157m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66158n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66159o;

    /* renamed from: k  reason: collision with root package name */
    List f66160k = Collections.emptyList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f66161a;

        /* renamed from: b  reason: collision with root package name */
        long f66162b;

        /* renamed from: c  reason: collision with root package name */
        long f66163c;

        public a(long j10, long j11, long j12) {
            this.f66161a = j10;
            this.f66162b = j11;
            this.f66163c = j12;
        }

        public long a() {
            return this.f66161a;
        }

        public long b() {
            return this.f66163c;
        }

        public long c() {
            return this.f66162b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f66161a == aVar.f66161a && this.f66163c == aVar.f66163c && this.f66162b == aVar.f66162b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f66161a;
            long j11 = this.f66162b;
            long j12 = this.f66163c;
            return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f66161a + ", samplesPerChunk=" + this.f66162b + ", sampleDescriptionIndex=" + this.f66163c + '}';
        }
    }

    static {
        j();
    }

    public r() {
        super("stsc");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("SampleToChunkBox.java", r.class);
        f66156l = bVar.f("method-execution", bVar.e("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.util.List"), 41);
        f66157m = bVar.f("method-execution", bVar.e("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "java.util.List", "entries", "", "void"), 45);
        f66158n = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.lang.String"), 78);
        f66159o = bVar.f("method-execution", bVar.e("1", "blowup", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "int", "chunkCount", "", "[J"), 89);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        int a10 = bi.a.a(d.j(byteBuffer));
        this.f66160k = new ArrayList(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            this.f66160k.add(new a(d.j(byteBuffer), d.j(byteBuffer), d.j(byteBuffer)));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, (long) this.f66160k.size());
        for (a aVar : this.f66160k) {
            e.g(byteBuffer, aVar.a());
            e.g(byteBuffer, aVar.c());
            e.g(byteBuffer, aVar.b());
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f66160k.size() * 12) + 8);
    }

    public List q() {
        ai.e.b().c(b.b(f66156l, this, this));
        return this.f66160k;
    }

    public void r(List list) {
        ai.e.b().c(b.c(f66157m, this, this, list));
        this.f66160k = list;
    }

    public String toString() {
        ai.e.b().c(b.b(f66158n, this, this));
        return "SampleToChunkBox[entryCount=" + this.f66160k.size() + "]";
    }
}
