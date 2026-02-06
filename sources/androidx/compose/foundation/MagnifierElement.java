package androidx.compose.foundation;

import J0.V;
import c1.h;
import c1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.C2846J;
import x.C2858W;
import yf.C6798l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010'R\u001a\u0010\u0012\u001a\u00020\u00108\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010'R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LJ0/V;", "Lx/J;", "Lkotlin/Function1;", "Lc1/d;", "Lq0/g;", "sourceCenter", "magnifierCenter", "Lc1/k;", "Llf/M;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc1/h;", "cornerRadius", "elevation", "clippingEnabled", "Lx/W;", "platformMagnifierFactory", "<init>", "(Lyf/l;Lyf/l;Lyf/l;FZJFFZLx/W;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lx/J;", "node", "e", "(Lx/J;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lyf/l;", "c", "F", "f", "Z", "g", "J", "h", "i", "j", "k", "Lx/W;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MagnifierElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f12438b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f12439c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f12440d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12441e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12442f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12443g;

    /* renamed from: h  reason: collision with root package name */
    private final float f12444h;

    /* renamed from: i  reason: collision with root package name */
    private final float f12445i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f12446j;

    /* renamed from: k  reason: collision with root package name */
    private final C2858W f12447k;

    public /* synthetic */ MagnifierElement(C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w10);
    }

    /* renamed from: d */
    public C2846J a() {
        return new C2846J(this.f12438b, this.f12439c, this.f12440d, this.f12441e, this.f12442f, this.f12443g, this.f12444h, this.f12445i, this.f12446j, this.f12447k, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(C2846J j10) {
        j10.t2(this.f12438b, this.f12439c, this.f12441e, this.f12442f, this.f12443g, this.f12444h, this.f12445i, this.f12446j, this.f12440d, this.f12447k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (this.f12438b == magnifierElement.f12438b && this.f12439c == magnifierElement.f12439c && this.f12441e == magnifierElement.f12441e && this.f12442f == magnifierElement.f12442f && k.f(this.f12443g, magnifierElement.f12443g) && h.m(this.f12444h, magnifierElement.f12444h) && h.m(this.f12445i, magnifierElement.f12445i) && this.f12446j == magnifierElement.f12446j && this.f12440d == magnifierElement.f12440d && C6496s.c(this.f12447k, magnifierElement.f12447k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f12438b.hashCode() * 31;
        C6798l lVar = this.f12439c;
        int i11 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((((((((((hashCode + i10) * 31) + Float.hashCode(this.f12441e)) * 31) + Boolean.hashCode(this.f12442f)) * 31) + k.i(this.f12443g)) * 31) + h.o(this.f12444h)) * 31) + h.o(this.f12445i)) * 31) + Boolean.hashCode(this.f12446j)) * 31;
        C6798l lVar2 = this.f12440d;
        if (lVar2 != null) {
            i11 = lVar2.hashCode();
        }
        return ((hashCode2 + i11) * 31) + this.f12447k.hashCode();
    }

    private MagnifierElement(C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10) {
        this.f12438b = lVar;
        this.f12439c = lVar2;
        this.f12440d = lVar3;
        this.f12441e = f10;
        this.f12442f = z10;
        this.f12443g = j10;
        this.f12444h = f11;
        this.f12445i = f12;
        this.f12446j = z11;
        this.f12447k = w10;
    }
}
