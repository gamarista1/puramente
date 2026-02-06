package androidx.compose.foundation;

import B.l;
import J0.V;
import O0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.C2845I;
import yf.C6787a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LJ0/V;", "Landroidx/compose/foundation/e;", "LB/l;", "interactionSource", "Lx/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LO0/g;", "role", "Lkotlin/Function0;", "Llf/M;", "onClick", "<init>", "(LB/l;Lx/I;ZLjava/lang/String;LO0/g;Lyf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/e;", "node", "e", "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/l;", "c", "Lx/I;", "Z", "Ljava/lang/String;", "f", "LO0/g;", "g", "Lyf/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ClickableElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final l f12417b;

    /* renamed from: c  reason: collision with root package name */
    private final C2845I f12418c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12419d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12420e;

    /* renamed from: f  reason: collision with root package name */
    private final g f12421f;

    /* renamed from: g  reason: collision with root package name */
    private final C6787a f12422g;

    public /* synthetic */ ClickableElement(l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, i10, z10, str, gVar, aVar);
    }

    /* renamed from: d */
    public e a() {
        return new e(this.f12417b, this.f12418c, this.f12419d, this.f12420e, this.f12421f, this.f12422g, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(e eVar) {
        eVar.L2(this.f12417b, this.f12418c, this.f12419d, this.f12420e, this.f12421f, this.f12422g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (C6496s.c(this.f12417b, clickableElement.f12417b) && C6496s.c(this.f12418c, clickableElement.f12418c) && this.f12419d == clickableElement.f12419d && C6496s.c(this.f12420e, clickableElement.f12420e) && C6496s.c(this.f12421f, clickableElement.f12421f) && this.f12422g == clickableElement.f12422g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        l lVar = this.f12417b;
        int i13 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        C2845I i15 = this.f12418c;
        if (i15 != null) {
            i11 = i15.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode = (((i14 + i11) * 31) + Boolean.hashCode(this.f12419d)) * 31;
        String str = this.f12420e;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (hashCode + i12) * 31;
        g gVar = this.f12421f;
        if (gVar != null) {
            i13 = g.l(gVar.n());
        }
        return ((i16 + i13) * 31) + this.f12422g.hashCode();
    }

    private ClickableElement(l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar) {
        this.f12417b = lVar;
        this.f12418c = i10;
        this.f12419d = z10;
        this.f12420e = str;
        this.f12421f = gVar;
        this.f12422g = aVar;
    }
}
