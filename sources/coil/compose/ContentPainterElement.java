package coil.compose;

import H0.C1187h;
import J0.C1252s;
import J0.E;
import J0.V;
import Z3.n;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import q0.C2427m;
import r0.C2547y0;
import w0.C2817c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcoil/compose/ContentPainterElement;", "LJ0/V;", "LZ3/n;", "Lw0/c;", "painter", "Lk0/c;", "alignment", "LH0/h;", "contentScale", "", "alpha", "Lr0/y0;", "colorFilter", "<init>", "(Lw0/c;Lk0/c;LH0/h;FLr0/y0;)V", "d", "()LZ3/n;", "node", "Llf/M;", "e", "(LZ3/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lw0/c;", "c", "Lk0/c;", "LH0/h;", "F", "f", "Lr0/y0;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentPainterElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C2817c f19382b;

    /* renamed from: c  reason: collision with root package name */
    private final c f19383c;

    /* renamed from: d  reason: collision with root package name */
    private final C1187h f19384d;

    /* renamed from: e  reason: collision with root package name */
    private final float f19385e;

    /* renamed from: f  reason: collision with root package name */
    private final C2547y0 f19386f;

    public ContentPainterElement(C2817c cVar, c cVar2, C1187h hVar, float f10, C2547y0 y0Var) {
        this.f19382b = cVar;
        this.f19383c = cVar2;
        this.f19384d = hVar;
        this.f19385e = f10;
        this.f19386f = y0Var;
    }

    /* renamed from: d */
    public n a() {
        return new n(this.f19382b, this.f19383c, this.f19384d, this.f19385e, this.f19386f);
    }

    /* renamed from: e */
    public void b(n nVar) {
        boolean h10 = C2427m.h(nVar.n2().k(), this.f19382b.k());
        nVar.t2(this.f19382b);
        nVar.q2(this.f19383c);
        nVar.s2(this.f19384d);
        nVar.c(this.f19385e);
        nVar.r2(this.f19386f);
        if (!h10) {
            E.b(nVar);
        }
        C1252s.a(nVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return C6496s.c(this.f19382b, contentPainterElement.f19382b) && C6496s.c(this.f19383c, contentPainterElement.f19383c) && C6496s.c(this.f19384d, contentPainterElement.f19384d) && Float.compare(this.f19385e, contentPainterElement.f19385e) == 0 && C6496s.c(this.f19386f, contentPainterElement.f19386f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f19382b.hashCode() * 31) + this.f19383c.hashCode()) * 31) + this.f19384d.hashCode()) * 31) + Float.hashCode(this.f19385e)) * 31;
        C2547y0 y0Var = this.f19386f;
        return hashCode + (y0Var == null ? 0 : y0Var.hashCode());
    }

    public String toString() {
        return "ContentPainterElement(painter=" + this.f19382b + ", alignment=" + this.f19383c + ", contentScale=" + this.f19384d + ", alpha=" + this.f19385e + ", colorFilter=" + this.f19386f + ')';
    }
}
