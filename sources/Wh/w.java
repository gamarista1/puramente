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
import java.util.Map;
import java.util.WeakHashMap;

public class w extends c {

    /* renamed from: l  reason: collision with root package name */
    static Map f66175l = new WeakHashMap();

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66176m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66177n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66178o;

    /* renamed from: k  reason: collision with root package name */
    List f66179k = Collections.emptyList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f66180a;

        /* renamed from: b  reason: collision with root package name */
        long f66181b;

        public a(long j10, long j11) {
            this.f66180a = j10;
            this.f66181b = j11;
        }

        public long a() {
            return this.f66180a;
        }

        public long b() {
            return this.f66181b;
        }

        public void c(long j10) {
            this.f66180a = j10;
        }

        public String toString() {
            return "Entry{count=" + this.f66180a + ", delta=" + this.f66181b + '}';
        }
    }

    static {
        j();
    }

    public w() {
        super("stts");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("TimeToSampleBox.java", w.class);
        f66176m = bVar.f("method-execution", bVar.e("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.util.List"), 111);
        f66177n = bVar.f("method-execution", bVar.e("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "java.util.List", "entries", "", "void"), 115);
        f66178o = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.lang.String"), 119);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        int a10 = bi.a.a(d.j(byteBuffer));
        this.f66179k = new ArrayList(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            this.f66179k.add(new a(d.j(byteBuffer), d.j(byteBuffer)));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, (long) this.f66179k.size());
        for (a aVar : this.f66179k) {
            e.g(byteBuffer, aVar.a());
            e.g(byteBuffer, aVar.b());
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f66179k.size() * 8) + 8);
    }

    public void q(List list) {
        ai.e.b().c(b.c(f66177n, this, this, list));
        this.f66179k = list;
    }

    public String toString() {
        ai.e.b().c(b.b(f66178o, this, this));
        return "TimeToSampleBox[entryCount=" + this.f66179k.size() + "]";
    }
}
