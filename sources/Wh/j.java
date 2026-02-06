package Wh;

import Ph.a;
import Sh.b;
import ai.c;
import bi.e;
import ci.d;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.util.Date;

public class j extends c {

    /* renamed from: A  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66083A;

    /* renamed from: p  reason: collision with root package name */
    private static ci.c f66084p = d.j(j.class);

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66085q;

    /* renamed from: r  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66086r;

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66087s;

    /* renamed from: t  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66088t;

    /* renamed from: u  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66089u;

    /* renamed from: v  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66090v;

    /* renamed from: w  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66091w;

    /* renamed from: x  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66092x;

    /* renamed from: y  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66093y;

    /* renamed from: z  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66094z;

    /* renamed from: k  reason: collision with root package name */
    private Date f66095k = new Date();

    /* renamed from: l  reason: collision with root package name */
    private Date f66096l = new Date();

    /* renamed from: m  reason: collision with root package name */
    private long f66097m;

    /* renamed from: n  reason: collision with root package name */
    private long f66098n;

    /* renamed from: o  reason: collision with root package name */
    private String f66099o = "eng";

    static {
        j();
    }

    public j() {
        super("mdhd");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("MediaHeaderBox.java", j.class);
        f66085q = bVar.f("method-execution", bVar.e("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 48);
        f66086r = bVar.f("method-execution", bVar.e("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 52);
        f66083A = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 125);
        f66087s = bVar.f("method-execution", bVar.e("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 56);
        f66088t = bVar.f("method-execution", bVar.e("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 60);
        f66089u = bVar.f("method-execution", bVar.e("1", "getTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", Constants.LONG), 64);
        f66090v = bVar.f("method-execution", bVar.e("1", "setTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", Constants.LONG, "timescale", "", "void"), 68);
        f66091w = bVar.f("method-execution", bVar.e("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", Constants.LONG), 72);
        f66092x = bVar.f("method-execution", bVar.e("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", Constants.LONG, "duration", "", "void"), 76);
        f66093y = bVar.f("method-execution", bVar.e("1", "getLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 80);
        f66094z = bVar.f("method-execution", bVar.e("1", "setLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.lang.String", "language", "", "void"), 84);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        if (l() == 1) {
            this.f66095k = bi.b.b(bi.d.k(byteBuffer));
            this.f66096l = bi.b.b(bi.d.k(byteBuffer));
            this.f66097m = bi.d.j(byteBuffer);
            this.f66098n = byteBuffer.getLong();
        } else {
            this.f66095k = bi.b.b(bi.d.j(byteBuffer));
            this.f66096l = bi.b.b(bi.d.j(byteBuffer));
            this.f66097m = bi.d.j(byteBuffer);
            this.f66098n = (long) byteBuffer.getInt();
        }
        if (this.f66098n < -1) {
            f66084p.f("mdhd duration is not in expected range");
        }
        this.f66099o = bi.d.f(byteBuffer);
        bi.d.h(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        if (l() == 1) {
            e.h(byteBuffer, bi.b.a(this.f66095k));
            e.h(byteBuffer, bi.b.a(this.f66096l));
            e.g(byteBuffer, this.f66097m);
            byteBuffer.putLong(this.f66098n);
        } else {
            e.g(byteBuffer, bi.b.a(this.f66095k));
            e.g(byteBuffer, bi.b.a(this.f66096l));
            e.g(byteBuffer, this.f66097m);
            byteBuffer.putInt((int) this.f66098n);
        }
        e.d(byteBuffer, this.f66099o);
        e.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        long j10;
        if (l() == 1) {
            j10 = 32;
        } else {
            j10 = 20;
        }
        return j10 + 4;
    }

    public Date q() {
        ai.e.b().c(b.b(f66085q, this, this));
        return this.f66095k;
    }

    public long r() {
        ai.e.b().c(b.b(f66091w, this, this));
        return this.f66098n;
    }

    public String s() {
        ai.e.b().c(b.b(f66093y, this, this));
        return this.f66099o;
    }

    public Date t() {
        ai.e.b().c(b.b(f66087s, this, this));
        return this.f66096l;
    }

    public String toString() {
        ai.e.b().c(b.b(f66083A, this, this));
        return "MediaHeaderBox[" + "creationTime=" + q() + ";" + "modificationTime=" + t() + ";" + "timescale=" + u() + ";" + "duration=" + r() + ";" + "language=" + s() + "]";
    }

    public long u() {
        ai.e.b().c(b.b(f66089u, this, this));
        return this.f66097m;
    }

    public void v(Date date) {
        ai.e.b().c(b.c(f66086r, this, this, date));
        this.f66095k = date;
    }

    public void w(long j10) {
        ai.e.b().c(b.c(f66092x, this, this, Rh.a.e(j10)));
        this.f66098n = j10;
    }

    public void x(String str) {
        ai.e.b().c(b.c(f66094z, this, this, str));
        this.f66099o = str;
    }

    public void y(long j10) {
        ai.e.b().c(b.c(f66090v, this, this, Rh.a.e(j10)));
        this.f66097m = j10;
    }
}
