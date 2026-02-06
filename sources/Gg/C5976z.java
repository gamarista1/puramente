package gg;

import Bg.C5338y;
import Dg.C5357s;
import Dg.r;
import Of.i0;
import kotlin.jvm.internal.C6496s;

/* renamed from: gg.z  reason: case insensitive filesystem */
public final class C5976z implements C5357s {

    /* renamed from: b  reason: collision with root package name */
    private final C5974x f67828b;

    /* renamed from: c  reason: collision with root package name */
    private final C5338y f67829c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f67830d;

    /* renamed from: e  reason: collision with root package name */
    private final r f67831e;

    public C5976z(C5974x xVar, C5338y yVar, boolean z10, r rVar) {
        C6496s.h(xVar, "binaryClass");
        C6496s.h(rVar, "abiStability");
        this.f67828b = xVar;
        this.f67829c = yVar;
        this.f67830d = z10;
        this.f67831e = rVar;
    }

    public String a() {
        return "Class '" + this.f67828b.d().a().b() + '\'';
    }

    public i0 b() {
        i0 i0Var = i0.f64498a;
        C6496s.g(i0Var, "NO_SOURCE_FILE");
        return i0Var;
    }

    public final C5974x d() {
        return this.f67828b;
    }

    public String toString() {
        return C5976z.class.getSimpleName() + ": " + this.f67828b;
    }
}
