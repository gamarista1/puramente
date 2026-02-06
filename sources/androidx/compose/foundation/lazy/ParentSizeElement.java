package androidx.compose.foundation.lazy;

import J0.V;
import Y.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "LJ0/V;", "Landroidx/compose/foundation/lazy/b;", "", "fraction", "LY/A1;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLY/A1;LY/A1;Ljava/lang/String;)V", "d", "()Landroidx/compose/foundation/lazy/b;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/lazy/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "F", "getFraction", "()F", "c", "LY/A1;", "getWidthState", "()LY/A1;", "getHeightState", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ParentSizeElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12931b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f12932c;

    /* renamed from: d  reason: collision with root package name */
    private final A1 f12933d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12934e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentSizeElement(float f10, A1 a12, A1 a13, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : a12, (i10 & 4) != 0 ? null : a13, str);
    }

    /* renamed from: d */
    public b a() {
        return new b(this.f12931b, this.f12932c, this.f12933d);
    }

    /* renamed from: e */
    public void b(b bVar) {
        bVar.l2(this.f12931b);
        bVar.n2(this.f12932c);
        bVar.m2(this.f12933d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        if (this.f12931b != parentSizeElement.f12931b || !C6496s.c(this.f12932c, parentSizeElement.f12932c) || !C6496s.c(this.f12933d, parentSizeElement.f12933d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        A1 a12 = this.f12932c;
        int i11 = 0;
        if (a12 != null) {
            i10 = a12.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        A1 a13 = this.f12933d;
        if (a13 != null) {
            i11 = a13.hashCode();
        }
        return ((i12 + i11) * 31) + Float.hashCode(this.f12931b);
    }

    public ParentSizeElement(float f10, A1 a12, A1 a13, String str) {
        this.f12931b = f10;
        this.f12932c = a12;
        this.f12933d = a13;
        this.f12934e = str;
    }
}
