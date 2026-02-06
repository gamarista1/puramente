package L4;

import K4.b;
import K4.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f32505a;

    /* renamed from: b  reason: collision with root package name */
    public final t f32506b;

    public a(b bVar, t tVar) {
        this.f32505a = bVar;
        this.f32506b = tVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, t tVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? t.DEFAULT : tVar);
    }
}
