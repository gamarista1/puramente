package g7;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f43675a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f43676b;

    public f(boolean z10, boolean z11) {
        this.f43675a = z10;
        this.f43676b = z11;
    }

    public final boolean a() {
        return this.f43675a;
    }

    public final boolean b() {
        return this.f43676b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
