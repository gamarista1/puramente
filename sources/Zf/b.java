package Zf;

import Fg.S;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.C5507z;
import Of.c0;
import Of.h0;
import Pf.h;
import Rf.C5520i;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.List;
import kotlin.Pair;
import mf.C6565s;
import ng.f;
import rg.C6690h;

public class b extends C5520i implements a {

    /* renamed from: F  reason: collision with root package name */
    private Boolean f66926F;

    /* renamed from: G  reason: collision with root package name */
    private Boolean f66927G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected b(C5487e eVar, b bVar, h hVar, boolean z10, C5484b.a aVar, h0 h0Var) {
        super(eVar, bVar, hVar, z10, aVar, h0Var);
        if (eVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (aVar == null) {
            i0(2);
        }
        if (h0Var == null) {
            i0(3);
        }
        this.f66926F = null;
        this.f66927G = null;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 11 || i10 == 18) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 11 || i10 == 18) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 11 || i10 == 18) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static b t1(C5487e eVar, h hVar, boolean z10, h0 h0Var) {
        if (eVar == null) {
            i0(4);
        }
        if (hVar == null) {
            i0(5);
        }
        if (h0Var == null) {
            i0(6);
        }
        return new b(eVar, (b) null, hVar, z10, C5484b.a.DECLARATION, h0Var);
    }

    public boolean Q0() {
        return this.f66926F.booleanValue();
    }

    public void Y0(boolean z10) {
        this.f66926F = Boolean.valueOf(z10);
    }

    public void Z0(boolean z10) {
        this.f66927G = Boolean.valueOf(z10);
    }

    public boolean h0() {
        return this.f66927G.booleanValue();
    }

    /* access modifiers changed from: protected */
    public b s1(C5487e eVar, b bVar, C5484b.a aVar, h0 h0Var, h hVar) {
        if (eVar == null) {
            i0(12);
        }
        if (aVar == null) {
            i0(13);
        }
        if (h0Var == null) {
            i0(14);
        }
        if (hVar == null) {
            i0(15);
        }
        return new b(eVar, bVar, hVar, this.f64860E, aVar, h0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public b o1(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        if (mVar == null) {
            i0(7);
        }
        if (aVar == null) {
            i0(8);
        }
        if (hVar == null) {
            i0(9);
        }
        if (h0Var == null) {
            i0(10);
        }
        if (aVar == C5484b.a.DECLARATION || aVar == C5484b.a.SYNTHESIZED) {
            b s12 = s1((C5487e) mVar, (b) zVar, aVar, h0Var, hVar);
            s12.Y0(Q0());
            s12.Z0(h0());
            return s12;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: v1 */
    public b z(S s10, List list, S s11, Pair pair) {
        c0 i10;
        S s12 = s10;
        if (list == null) {
            i0(16);
        }
        if (s11 == null) {
            i0(17);
        }
        b u12 = o1(b(), (C5507z) null, h(), (f) null, getAnnotations(), i());
        if (s12 == null) {
            i10 = null;
        } else {
            i10 = C6690h.i(u12, s10, h.f64602L.b());
        }
        u12.R0(i10, M(), C6565s.n(), getTypeParameters(), h.a(list, k(), u12), s11, r(), getVisibility());
        if (pair != null) {
            u12.U0((C5483a.C0945a) pair.c(), pair.d());
        }
        return u12;
    }
}
