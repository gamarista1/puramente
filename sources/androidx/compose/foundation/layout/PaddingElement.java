package androidx.compose.foundation.layout;

import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/o;", "Lc1/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(FFFFZLyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/o;", "node", "e", "(Landroidx/compose/foundation/layout/o;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "c", "getTop-D9Ej5fM", "setTop-0680j_4", "getEnd-D9Ej5fM", "setEnd-0680j_4", "getBottom-D9Ej5fM", "setBottom-0680j_4", "f", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "g", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private float f12784b;

    /* renamed from: c  reason: collision with root package name */
    private float f12785c;

    /* renamed from: d  reason: collision with root package name */
    private float f12786d;

    /* renamed from: e  reason: collision with root package name */
    private float f12787e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12788f;

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f12789g;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    /* renamed from: d */
    public o a() {
        return new o(this.f12784b, this.f12785c, this.f12786d, this.f12787e, this.f12788f, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(o oVar) {
        oVar.r2(this.f12784b);
        oVar.s2(this.f12785c);
        oVar.p2(this.f12786d);
        oVar.o2(this.f12787e);
        oVar.q2(this.f12788f);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement != null && h.m(this.f12784b, paddingElement.f12784b) && h.m(this.f12785c, paddingElement.f12785c) && h.m(this.f12786d, paddingElement.f12786d) && h.m(this.f12787e, paddingElement.f12787e) && this.f12788f == paddingElement.f12788f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((h.o(this.f12784b) * 31) + h.o(this.f12785c)) * 31) + h.o(this.f12786d)) * 31) + h.o(this.f12787e)) * 31) + Boolean.hashCode(this.f12788f);
    }

    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, C6798l lVar) {
        this.f12784b = f10;
        this.f12785c = f11;
        this.f12786d = f12;
        this.f12787e = f13;
        this.f12788f = z10;
        this.f12789g = lVar;
        if (f10 >= 0.0f || h.m(f10, h.f19213b.c())) {
            float f14 = this.f12785c;
            if (f14 >= 0.0f || h.m(f14, h.f19213b.c())) {
                float f15 = this.f12786d;
                if (f15 >= 0.0f || h.m(f15, h.f19213b.c())) {
                    float f16 = this.f12787e;
                    if (f16 >= 0.0f || h.m(f16, h.f19213b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
