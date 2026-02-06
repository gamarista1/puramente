package androidx.compose.foundation;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.C2544x0;
import r0.g2;
import yf.C6798l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LJ0/V;", "Landroidx/compose/foundation/c;", "Lr0/x0;", "color", "Lr0/n0;", "brush", "", "alpha", "Lr0/g2;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(JLr0/n0;FLr0/g2;Lyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/c;", "node", "e", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Lr0/n0;", "F", "Lr0/g2;", "f", "Lyf/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final long f12409b;

    /* renamed from: c  reason: collision with root package name */
    private final C2514n0 f12410c;

    /* renamed from: d  reason: collision with root package name */
    private final float f12411d;

    /* renamed from: e  reason: collision with root package name */
    private final g2 f12412e;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f12413f;

    public /* synthetic */ BackgroundElement(long j10, C2514n0 n0Var, float f10, g2 g2Var, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, n0Var, f10, g2Var, lVar);
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f12409b, this.f12410c, this.f12411d, this.f12412e, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.q2(this.f12409b);
        cVar.p2(this.f12410c);
        cVar.c(this.f12411d);
        cVar.O0(this.f12412e);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement != null && C2544x0.q(this.f12409b, backgroundElement.f12409b) && C6496s.c(this.f12410c, backgroundElement.f12410c) && this.f12411d == backgroundElement.f12411d && C6496s.c(this.f12412e, backgroundElement.f12412e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int w10 = C2544x0.w(this.f12409b) * 31;
        C2514n0 n0Var = this.f12410c;
        if (n0Var != null) {
            i10 = n0Var.hashCode();
        } else {
            i10 = 0;
        }
        return ((((w10 + i10) * 31) + Float.hashCode(this.f12411d)) * 31) + this.f12412e.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackgroundElement(long j10, C2514n0 n0Var, float f10, g2 g2Var, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2544x0.f25560b.h() : j10, (i10 & 2) != 0 ? null : n0Var, f10, g2Var, lVar, (DefaultConstructorMarker) null);
    }

    private BackgroundElement(long j10, C2514n0 n0Var, float f10, g2 g2Var, C6798l lVar) {
        this.f12409b = j10;
        this.f12410c = n0Var;
        this.f12411d = f10;
        this.f12412e = g2Var;
        this.f12413f = lVar;
    }
}
