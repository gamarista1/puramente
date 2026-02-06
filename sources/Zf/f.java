package Zf;

import Fg.S;
import Lf.i;
import Of.C5483a;
import Of.C5484b;
import Of.C5492j;
import Of.C5495m;
import Of.C5502u;
import Of.E;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.h0;
import Of.t0;
import Pf.h;
import Rf.K;
import Rf.L;
import Rf.M;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import fg.C5917k0;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.List;
import kotlin.Pair;
import mf.C6565s;
import rg.C6690h;
import yf.C6787a;

public class f extends K implements a {

    /* renamed from: C  reason: collision with root package name */
    private final boolean f66942C;

    /* renamed from: D  reason: collision with root package name */
    private final Pair f66943D;

    /* renamed from: E  reason: collision with root package name */
    private S f66944E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected f(C5495m mVar, h hVar, E e10, C5502u uVar, boolean z10, ng.f fVar, h0 h0Var, Z z11, C5484b.a aVar, boolean z12, Pair pair) {
        super(mVar, z11, hVar, e10, uVar, z10, fVar, aVar, h0Var, false, false, false, false, false, false);
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (e10 == null) {
            i0(2);
        }
        if (uVar == null) {
            i0(3);
        }
        if (fVar == null) {
            i0(4);
        }
        if (h0Var == null) {
            i0(5);
        }
        if (aVar == null) {
            i0(6);
        }
        this.f66944E = null;
        this.f66942C = z12;
        this.f66943D = pair;
    }

    public static f f1(C5495m mVar, h hVar, E e10, C5502u uVar, boolean z10, ng.f fVar, h0 h0Var, boolean z11) {
        if (mVar == null) {
            i0(7);
        }
        if (hVar == null) {
            i0(8);
        }
        if (e10 == null) {
            i0(9);
        }
        if (uVar == null) {
            i0(10);
        }
        if (fVar == null) {
            i0(11);
        }
        if (h0Var == null) {
            i0(12);
        }
        return new f(mVar, hVar, e10, uVar, z10, fVar, h0Var, (Z) null, C5484b.a.DECLARATION, z11, (Pair) null);
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "newModality";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 21) {
            th2 = new IllegalArgumentException(format);
        } else {
            th2 = new IllegalStateException(format);
        }
        throw th2;
    }

    public Object B(C5483a.C0945a aVar) {
        Pair pair = this.f66943D;
        if (pair == null || !((C5483a.C0945a) pair.c()).equals(aVar)) {
            return null;
        }
        return this.f66943D.d();
    }

    /* access modifiers changed from: protected */
    public K P0(C5495m mVar, E e10, C5502u uVar, Z z10, C5484b.a aVar, ng.f fVar, h0 h0Var) {
        if (mVar == null) {
            i0(13);
        }
        if (e10 == null) {
            i0(14);
        }
        if (uVar == null) {
            i0(15);
        }
        if (aVar == null) {
            i0(16);
        }
        if (fVar == null) {
            i0(17);
        }
        if (h0Var == null) {
            i0(18);
        }
        return new f(mVar, getAnnotations(), e10, uVar, O(), fVar, h0Var, z10, aVar, this.f66942C, this.f66943D);
    }

    public void Z0(S s10) {
        if (s10 == null) {
            i0(22);
        }
        this.f66944E = s10;
    }

    public boolean c0() {
        S type = getType();
        if (!this.f66942C || !C5492j.a(type) || (C5917k0.i(type) && !i.v0(type))) {
            return false;
        }
        return true;
    }

    public boolean h0() {
        return false;
    }

    public a z(S s10, List list, S s11, Pair pair) {
        Z z10;
        L l10;
        M m10;
        c0 c0Var;
        b0 b0Var;
        a0 a0Var;
        S s12 = s10;
        S s13 = s11;
        if (list == null) {
            i0(19);
        }
        if (s13 == null) {
            i0(20);
        }
        if (a() == this) {
            z10 = null;
        } else {
            z10 = a();
        }
        f fVar = r5;
        f fVar2 = new f(b(), getAnnotations(), r(), getVisibility(), O(), getName(), i(), z10, h(), this.f66942C, pair);
        L R02 = d();
        if (R02 != null) {
            h annotations = R02.getAnnotations();
            E r10 = R02.r();
            C5502u visibility = R02.getVisibility();
            boolean G10 = R02.G();
            boolean isExternal = R02.isExternal();
            boolean isInline = R02.isInline();
            C5484b.a h10 = h();
            if (z10 == null) {
                a0Var = null;
            } else {
                a0Var = z10.d();
            }
            l10 = r5;
            L l11 = new L(fVar, annotations, r10, visibility, G10, isExternal, isInline, h10, a0Var, R02.i());
            l10.M0(R02.t0());
            l10.P0(s13);
        } else {
            l10 = null;
        }
        b0 g10 = g();
        if (g10 != null) {
            h annotations2 = g10.getAnnotations();
            E r11 = g10.r();
            C5502u visibility2 = g10.getVisibility();
            boolean G11 = g10.G();
            boolean isExternal2 = g10.isExternal();
            boolean isInline2 = g10.isInline();
            C5484b.a h11 = h();
            if (z10 == null) {
                b0Var = null;
            } else {
                b0Var = z10.g();
            }
            M m11 = r5;
            M m12 = new M(fVar, annotations2, r11, visibility2, G11, isExternal2, isInline2, h11, b0Var, g10.i());
            M m13 = m11;
            m13.M0(m11.t0());
            m13.Q0((t0) g10.k().get(0));
            m10 = m13;
        } else {
            m10 = null;
        }
        f fVar3 = fVar;
        fVar3.V0(l10, m10, w0(), Q());
        fVar3.a1(W0());
        C6787a aVar = this.f64827h;
        if (aVar != null) {
            fVar3.K0(this.f64826g, aVar);
        }
        fVar3.E0(e());
        if (s12 == null) {
            c0Var = null;
        } else {
            c0Var = C6690h.i(this, s12, h.f64602L.b());
        }
        fVar3.b1(s11, getTypeParameters(), M(), c0Var, C6565s.n());
        return fVar3;
    }
}
