package v;

import Y.C1503n0;
import Y.D0;
import androidx.compose.animation.a;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.p;

/* renamed from: v.i  reason: case insensitive filesystem */
public final class C2726i {

    /* renamed from: a  reason: collision with root package name */
    private final i f26872a;

    /* renamed from: b  reason: collision with root package name */
    private final k f26873b;

    /* renamed from: c  reason: collision with root package name */
    private final C1503n0 f26874c;

    /* renamed from: d  reason: collision with root package name */
    private C2738u f26875d;

    public C2726i(i iVar, k kVar, float f10, C2738u uVar) {
        this.f26872a = iVar;
        this.f26873b = kVar;
        this.f26874c = D0.a(f10);
        this.f26875d = uVar;
    }

    public final k a() {
        return this.f26873b;
    }

    public final C2738u b() {
        return this.f26875d;
    }

    public final i c() {
        return this.f26872a;
    }

    public final float d() {
        return this.f26874c.c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2726i(i iVar, k kVar, float f10, C2738u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, kVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? a.c(false, (p) null, 3, (Object) null) : uVar);
    }
}
