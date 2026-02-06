package androidx.compose.foundation.lazy.layout;

import E.F;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;
import z.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "LJ0/V;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function0;", "LE/t;", "itemProviderLambda", "LE/F;", "state", "Lz/q;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lyf/a;LE/F;Lz/q;ZZ)V", "d", "()Landroidx/compose/foundation/lazy/layout/g;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/lazy/layout/g;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lyf/a;", "getItemProviderLambda", "()Lyf/a;", "c", "LE/F;", "getState", "()LE/F;", "Lz/q;", "getOrientation", "()Lz/q;", "Z", "getUserScrollEnabled", "()Z", "f", "getReverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f12970b;

    /* renamed from: c  reason: collision with root package name */
    private final F f12971c;

    /* renamed from: d  reason: collision with root package name */
    private final q f12972d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12973e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12974f;

    public LazyLayoutSemanticsModifier(C6787a aVar, F f10, q qVar, boolean z10, boolean z11) {
        this.f12970b = aVar;
        this.f12971c = f10;
        this.f12972d = qVar;
        this.f12973e = z10;
        this.f12974f = z11;
    }

    /* renamed from: d */
    public g a() {
        return new g(this.f12970b, this.f12971c, this.f12972d, this.f12973e, this.f12974f);
    }

    /* renamed from: e */
    public void b(g gVar) {
        gVar.p2(this.f12970b, this.f12971c, this.f12972d, this.f12973e, this.f12974f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        if (this.f12970b == lazyLayoutSemanticsModifier.f12970b && C6496s.c(this.f12971c, lazyLayoutSemanticsModifier.f12971c) && this.f12972d == lazyLayoutSemanticsModifier.f12972d && this.f12973e == lazyLayoutSemanticsModifier.f12973e && this.f12974f == lazyLayoutSemanticsModifier.f12974f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f12970b.hashCode() * 31) + this.f12971c.hashCode()) * 31) + this.f12972d.hashCode()) * 31) + Boolean.hashCode(this.f12973e)) * 31) + Boolean.hashCode(this.f12974f);
    }
}
