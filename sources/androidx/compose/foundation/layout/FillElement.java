package androidx.compose.foundation.layout;

import C.C1096n;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/g;", "LC/n;", "direction", "", "fraction", "", "inspectorName", "<init>", "(LC/n;FLjava/lang/String;)V", "d", "()Landroidx/compose/foundation/layout/g;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/layout/g;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LC/n;", "c", "F", "Ljava/lang/String;", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FillElement extends V {

    /* renamed from: e  reason: collision with root package name */
    public static final a f12767e = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C1096n f12768b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12769c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12770d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(C1096n.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(C1096n.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(C1096n.Horizontal, f10, "fillMaxWidth");
        }

        private a() {
        }
    }

    public FillElement(C1096n nVar, float f10, String str) {
        this.f12768b = nVar;
        this.f12769c = f10;
        this.f12770d = str;
    }

    /* renamed from: d */
    public g a() {
        return new g(this.f12768b, this.f12769c);
    }

    /* renamed from: e */
    public void b(g gVar) {
        gVar.l2(this.f12768b);
        gVar.m2(this.f12769c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.f12768b == fillElement.f12768b && this.f12769c == fillElement.f12769c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12768b.hashCode() * 31) + Float.hashCode(this.f12769c);
    }
}
