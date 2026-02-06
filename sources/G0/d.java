package g0;

import Sg.C5538a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f20856a;

    public d(int i10) {
        this.f20856a = i10;
    }

    public final int a() {
        return this.f20856a;
    }

    public final void b(int i10) {
        this.f20856a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f20856a);
        sb2.append(")@");
        String num = Integer.toString(hashCode(), C5538a.a(16));
        C6496s.g(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
