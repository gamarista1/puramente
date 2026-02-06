package androidx.compose.foundation.gestures;

import B.l;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import x.C2855T;
import z.C2946d;
import z.n;
import z.q;
import z.y;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LJ0/V;", "Landroidx/compose/foundation/gestures/f;", "Lz/y;", "state", "Lz/q;", "orientation", "Lx/T;", "overscrollEffect", "", "enabled", "reverseDirection", "Lz/n;", "flingBehavior", "LB/l;", "interactionSource", "Lz/d;", "bringIntoViewSpec", "<init>", "(Lz/y;Lz/q;Lx/T;ZZLz/n;LB/l;Lz/d;)V", "d", "()Landroidx/compose/foundation/gestures/f;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/gestures/f;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lz/y;", "getState", "()Lz/y;", "c", "Lz/q;", "getOrientation", "()Lz/q;", "Lx/T;", "getOverscrollEffect", "()Lx/T;", "Z", "getEnabled", "()Z", "f", "getReverseDirection", "g", "Lz/n;", "getFlingBehavior", "()Lz/n;", "h", "LB/l;", "getInteractionSource", "()LB/l;", "i", "Lz/d;", "getBringIntoViewSpec", "()Lz/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollableElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final y f12584b;

    /* renamed from: c  reason: collision with root package name */
    private final q f12585c;

    /* renamed from: d  reason: collision with root package name */
    private final C2855T f12586d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12587e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12588f;

    /* renamed from: g  reason: collision with root package name */
    private final n f12589g;

    /* renamed from: h  reason: collision with root package name */
    private final l f12590h;

    /* renamed from: i  reason: collision with root package name */
    private final C2946d f12591i;

    public ScrollableElement(y yVar, q qVar, C2855T t10, boolean z10, boolean z11, n nVar, l lVar, C2946d dVar) {
        this.f12584b = yVar;
        this.f12585c = qVar;
        this.f12586d = t10;
        this.f12587e = z10;
        this.f12588f = z11;
        this.f12589g = nVar;
        this.f12590h = lVar;
        this.f12591i = dVar;
    }

    /* renamed from: d */
    public f a() {
        return new f(this.f12584b, this.f12586d, this.f12589g, this.f12585c, this.f12587e, this.f12588f, this.f12590h, this.f12591i);
    }

    /* renamed from: e */
    public void b(f fVar) {
        fVar.S2(this.f12584b, this.f12585c, this.f12586d, this.f12587e, this.f12588f, this.f12589g, this.f12590h, this.f12591i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (C6496s.c(this.f12584b, scrollableElement.f12584b) && this.f12585c == scrollableElement.f12585c && C6496s.c(this.f12586d, scrollableElement.f12586d) && this.f12587e == scrollableElement.f12587e && this.f12588f == scrollableElement.f12588f && C6496s.c(this.f12589g, scrollableElement.f12589g) && C6496s.c(this.f12590h, scrollableElement.f12590h) && C6496s.c(this.f12591i, scrollableElement.f12591i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = ((this.f12584b.hashCode() * 31) + this.f12585c.hashCode()) * 31;
        C2855T t10 = this.f12586d;
        int i13 = 0;
        if (t10 != null) {
            i10 = t10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + Boolean.hashCode(this.f12587e)) * 31) + Boolean.hashCode(this.f12588f)) * 31;
        n nVar = this.f12589g;
        if (nVar != null) {
            i11 = nVar.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (hashCode2 + i11) * 31;
        l lVar = this.f12590h;
        if (lVar != null) {
            i12 = lVar.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        C2946d dVar = this.f12591i;
        if (dVar != null) {
            i13 = dVar.hashCode();
        }
        return i15 + i13;
    }
}
