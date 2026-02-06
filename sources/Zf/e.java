package Zf;

import Fg.S;
import Mg.s;
import Of.C5483a;
import Of.C5484b;
import Of.C5495m;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.g0;
import Of.h0;
import Pf.h;
import Rf.O;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ng.f;
import rg.C6690h;

public class e extends O implements a {

    /* renamed from: G  reason: collision with root package name */
    public static final C5483a.C0945a f66931G = new a();

    /* renamed from: H  reason: collision with root package name */
    public static final C5483a.C0945a f66932H = new b();

    /* renamed from: E  reason: collision with root package name */
    private c f66933E;

    /* renamed from: F  reason: collision with root package name */
    private final boolean f66934F;

    static class a implements C5483a.C0945a {
        a() {
        }
    }

    static class b implements C5483a.C0945a {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: a  reason: collision with root package name */
        public final boolean f66940a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f66941b;

        private c(boolean z10, boolean z11) {
            this.f66940a = z10;
            this.f66941b = z11;
        }

        public static c b(boolean z10, boolean z11) {
            c cVar;
            if (z10) {
                if (z11) {
                    cVar = STABLE_SYNTHESIZED;
                } else {
                    cVar = STABLE_DECLARED;
                }
            } else if (z11) {
                cVar = NON_STABLE_SYNTHESIZED;
            } else {
                cVar = NON_STABLE_DECLARED;
            }
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected e(C5495m mVar, g0 g0Var, h hVar, f fVar, C5484b.a aVar, h0 h0Var, boolean z10) {
        super(mVar, g0Var, hVar, fVar, aVar, h0Var);
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (fVar == null) {
            i0(2);
        }
        if (aVar == null) {
            i0(3);
        }
        if (h0Var == null) {
            i0(4);
        }
        this.f66933E = null;
        this.f66934F = z10;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 13 || i10 == 18 || i10 == 21) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 13 || i10 == 18 || i10 == 21) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 21) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static e p1(C5495m mVar, h hVar, f fVar, h0 h0Var, boolean z10) {
        if (mVar == null) {
            i0(5);
        }
        if (hVar == null) {
            i0(6);
        }
        if (fVar == null) {
            i0(7);
        }
        if (h0Var == null) {
            i0(8);
        }
        return new e(mVar, (g0) null, hVar, fVar, C5484b.a.DECLARATION, h0Var, z10);
    }

    public boolean Q0() {
        return this.f66933E.f66940a;
    }

    public boolean h0() {
        return this.f66933E.f66941b;
    }

    public O o1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, C5502u uVar, Map map) {
        if (list == null) {
            i0(9);
        }
        if (list2 == null) {
            i0(10);
        }
        if (list3 == null) {
            i0(11);
        }
        if (uVar == null) {
            i0(12);
        }
        O o12 = super.o1(c0Var, c0Var2, list, list2, list3, s10, e10, uVar, map);
        f1(s.f64173a.a(o12).a());
        if (o12 == null) {
            i0(13);
        }
        return o12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public e L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        if (mVar == null) {
            i0(14);
        }
        if (aVar == null) {
            i0(15);
        }
        if (hVar == null) {
            i0(16);
        }
        if (h0Var == null) {
            i0(17);
        }
        g0 g0Var = (g0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, g0Var, hVar, fVar, aVar, h0Var, this.f66934F);
        eVar.s1(Q0(), h0());
        return eVar;
    }

    /* renamed from: r1 */
    public e z(S s10, List list, S s11, Pair pair) {
        c0 c0Var;
        if (list == null) {
            i0(19);
        }
        if (s11 == null) {
            i0(20);
        }
        List a10 = h.a(list, k(), this);
        if (s10 == null) {
            c0Var = null;
        } else {
            c0Var = C6690h.i(this, s10, h.f64602L.b());
        }
        e eVar = (e) v().h(a10).s(s11).l(c0Var).g().u().f();
        if (pair != null) {
            eVar.U0((C5483a.C0945a) pair.c(), pair.d());
        }
        if (eVar == null) {
            i0(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.f66933E = c.b(z10, z11);
    }
}
