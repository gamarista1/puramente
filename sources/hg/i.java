package Hg;

import Fg.C5366d0;
import Fg.r0;
import Fg.v0;
import Gg.g;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import mf.C6565s;
import yg.C6812k;

public final class i extends C5366d0 {

    /* renamed from: b  reason: collision with root package name */
    private final v0 f63373b;

    /* renamed from: c  reason: collision with root package name */
    private final C6812k f63374c;

    /* renamed from: d  reason: collision with root package name */
    private final k f63375d;

    /* renamed from: e  reason: collision with root package name */
    private final List f63376e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63377f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f63378g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63379h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(v0 v0Var, C6812k kVar, k kVar2, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0Var, kVar, kVar2, (i10 & 8) != 0 ? C6565s.n() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    public List L0() {
        return this.f63376e;
    }

    public r0 M0() {
        return r0.f63046b.j();
    }

    public v0 N0() {
        return this.f63373b;
    }

    public boolean O0() {
        return this.f63377f;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        v0 N02 = N0();
        C6812k o10 = o();
        k kVar = this.f63375d;
        List L02 = L0();
        String[] strArr = this.f63378g;
        return new i(N02, o10, kVar, L02, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f63379h;
    }

    public final k X0() {
        return this.f63375d;
    }

    /* renamed from: Y0 */
    public i S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this;
    }

    public final i Z0(List list) {
        C6496s.h(list, "newArguments");
        v0 N02 = N0();
        C6812k o10 = o();
        k kVar = this.f63375d;
        boolean O02 = O0();
        String[] strArr = this.f63378g;
        return new i(N02, o10, kVar, list, O02, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public C6812k o() {
        return this.f63374c;
    }

    public i(v0 v0Var, C6812k kVar, k kVar2, List list, boolean z10, String... strArr) {
        C6496s.h(v0Var, "constructor");
        C6496s.h(kVar, "memberScope");
        C6496s.h(kVar2, "kind");
        C6496s.h(list, "arguments");
        C6496s.h(strArr, "formatParams");
        this.f63373b = v0Var;
        this.f63374c = kVar;
        this.f63375d = kVar2;
        this.f63376e = list;
        this.f63377f = z10;
        this.f63378g = strArr;
        U u10 = U.f71764a;
        String b10 = kVar2.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b10, Arrays.copyOf(copyOf, copyOf.length));
        C6496s.g(format, "format(...)");
        this.f63379h = format;
    }
}
