package androidx.compose.foundation.layout;

import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/r;", "Lc1/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(FFFFZLyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/r;", "node", "e", "(Landroidx/compose/foundation/layout/r;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "c", "f", "Z", "g", "Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12792b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12793c;

    /* renamed from: d  reason: collision with root package name */
    private final float f12794d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12795e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12796f;

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f12797g;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    /* renamed from: d */
    public r a() {
        return new r(this.f12792b, this.f12793c, this.f12794d, this.f12795e, this.f12796f, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(r rVar) {
        rVar.q2(this.f12792b);
        rVar.p2(this.f12793c);
        rVar.o2(this.f12794d);
        rVar.n2(this.f12795e);
        rVar.m2(this.f12796f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (h.m(this.f12792b, sizeElement.f12792b) && h.m(this.f12793c, sizeElement.f12793c) && h.m(this.f12794d, sizeElement.f12794d) && h.m(this.f12795e, sizeElement.f12795e) && this.f12796f == sizeElement.f12796f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((h.o(this.f12792b) * 31) + h.o(this.f12793c)) * 31) + h.o(this.f12794d)) * 31) + h.o(this.f12795e)) * 31) + Boolean.hashCode(this.f12796f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.f19213b.c() : f10, (i10 & 2) != 0 ? h.f19213b.c() : f11, (i10 & 4) != 0 ? h.f19213b.c() : f12, (i10 & 8) != 0 ? h.f19213b.c() : f13, z10, lVar, (DefaultConstructorMarker) null);
    }

    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, C6798l lVar) {
        this.f12792b = f10;
        this.f12793c = f11;
        this.f12794d = f12;
        this.f12795e = f13;
        this.f12796f = z10;
        this.f12797g = lVar;
    }
}
