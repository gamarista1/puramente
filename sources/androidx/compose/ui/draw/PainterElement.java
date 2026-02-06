package androidx.compose.ui.draw;

import H0.C1187h;
import J0.C1252s;
import J0.E;
import J0.V;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import q0.C2427m;
import r0.C2547y0;
import w0.C2817c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LJ0/V;", "Landroidx/compose/ui/draw/e;", "Lw0/c;", "painter", "", "sizeToIntrinsics", "Lk0/c;", "alignment", "LH0/h;", "contentScale", "", "alpha", "Lr0/y0;", "colorFilter", "<init>", "(Lw0/c;ZLk0/c;LH0/h;FLr0/y0;)V", "d", "()Landroidx/compose/ui/draw/e;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/draw/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lw0/c;", "getPainter", "()Lw0/c;", "c", "Z", "getSizeToIntrinsics", "()Z", "Lk0/c;", "getAlignment", "()Lk0/c;", "LH0/h;", "getContentScale", "()LH0/h;", "f", "F", "getAlpha", "()F", "g", "Lr0/y0;", "getColorFilter", "()Lr0/y0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PainterElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C2817c f13252b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13253c;

    /* renamed from: d  reason: collision with root package name */
    private final c f13254d;

    /* renamed from: e  reason: collision with root package name */
    private final C1187h f13255e;

    /* renamed from: f  reason: collision with root package name */
    private final float f13256f;

    /* renamed from: g  reason: collision with root package name */
    private final C2547y0 f13257g;

    public PainterElement(C2817c cVar, boolean z10, c cVar2, C1187h hVar, float f10, C2547y0 y0Var) {
        this.f13252b = cVar;
        this.f13253c = z10;
        this.f13254d = cVar2;
        this.f13255e = hVar;
        this.f13256f = f10;
        this.f13257g = y0Var;
    }

    /* renamed from: d */
    public e a() {
        return new e(this.f13252b, this.f13253c, this.f13254d, this.f13255e, this.f13256f, this.f13257g);
    }

    /* renamed from: e */
    public void b(e eVar) {
        boolean z10;
        boolean n22 = eVar.n2();
        boolean z11 = this.f13253c;
        if (n22 != z11 || (z11 && !C2427m.h(eVar.m2().k(), this.f13252b.k()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.v2(this.f13252b);
        eVar.w2(this.f13253c);
        eVar.s2(this.f13254d);
        eVar.u2(this.f13255e);
        eVar.c(this.f13256f);
        eVar.t2(this.f13257g);
        if (z10) {
            E.b(eVar);
        }
        C1252s.a(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return C6496s.c(this.f13252b, painterElement.f13252b) && this.f13253c == painterElement.f13253c && C6496s.c(this.f13254d, painterElement.f13254d) && C6496s.c(this.f13255e, painterElement.f13255e) && Float.compare(this.f13256f, painterElement.f13256f) == 0 && C6496s.c(this.f13257g, painterElement.f13257g);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f13252b.hashCode() * 31) + Boolean.hashCode(this.f13253c)) * 31) + this.f13254d.hashCode()) * 31) + this.f13255e.hashCode()) * 31) + Float.hashCode(this.f13256f)) * 31;
        C2547y0 y0Var = this.f13257g;
        return hashCode + (y0Var == null ? 0 : y0Var.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.f13252b + ", sizeToIntrinsics=" + this.f13253c + ", alignment=" + this.f13254d + ", contentScale=" + this.f13255e + ", alpha=" + this.f13256f + ", colorFilter=" + this.f13257g + ')';
    }
}
