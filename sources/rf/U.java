package Rf;

import Eg.n;
import Fg.N0;
import Fg.S;
import Fg.W;
import Of.C5495m;
import Of.h0;
import Of.k0;
import Of.m0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;
import ng.f;
import rg.C6691i;
import vg.C6755e;
import yf.C6798l;

public class U extends C5519h {

    /* renamed from: k  reason: collision with root package name */
    private final C6798l f64812k;

    /* renamed from: l  reason: collision with root package name */
    private final List f64813l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64814m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private U(C5495m mVar, h hVar, boolean z10, N0 n02, f fVar, int i10, h0 h0Var, C6798l lVar, k0 k0Var, n nVar) {
        super(nVar, mVar, hVar, fVar, n02, z10, i10, h0Var, k0Var);
        if (mVar == null) {
            i0(19);
        }
        if (hVar == null) {
            i0(20);
        }
        if (n02 == null) {
            i0(21);
        }
        if (fVar == null) {
            i0(22);
        }
        if (h0Var == null) {
            i0(23);
        }
        if (k0Var == null) {
            i0(24);
        }
        if (nVar == null) {
            i0(25);
        }
        this.f64813l = new ArrayList(1);
        this.f64814m = false;
        this.f64812k = lVar;
    }

    private void N0() {
        if (!this.f64814m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
        }
    }

    private void O0() {
        if (this.f64814m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public static U P0(C5495m mVar, h hVar, boolean z10, N0 n02, f fVar, int i10, h0 h0Var, n nVar) {
        if (mVar == null) {
            i0(6);
        }
        if (hVar == null) {
            i0(7);
        }
        if (n02 == null) {
            i0(8);
        }
        if (fVar == null) {
            i0(9);
        }
        if (h0Var == null) {
            i0(10);
        }
        if (nVar == null) {
            i0(11);
        }
        return Q0(mVar, hVar, z10, n02, fVar, i10, h0Var, (C6798l) null, k0.a.f64500a, nVar);
    }

    public static U Q0(C5495m mVar, h hVar, boolean z10, N0 n02, f fVar, int i10, h0 h0Var, C6798l lVar, k0 k0Var, n nVar) {
        if (mVar == null) {
            i0(12);
        }
        if (hVar == null) {
            i0(13);
        }
        if (n02 == null) {
            i0(14);
        }
        if (fVar == null) {
            i0(15);
        }
        if (h0Var == null) {
            i0(16);
        }
        if (k0Var == null) {
            i0(17);
        }
        if (nVar == null) {
            i0(18);
        }
        return new U(mVar, hVar, z10, n02, fVar, i10, h0Var, lVar, k0Var, nVar);
    }

    public static m0 R0(C5495m mVar, h hVar, boolean z10, N0 n02, f fVar, int i10, n nVar) {
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (n02 == null) {
            i0(2);
        }
        if (fVar == null) {
            i0(3);
        }
        if (nVar == null) {
            i0(4);
        }
        U P02 = P0(mVar, hVar, z10, n02, fVar, i10, h0.f64497a, nVar);
        P02.M0(C6755e.m(mVar).y());
        P02.V0();
        return P02;
    }

    private void S0(S s10) {
        if (!W.a(s10)) {
            this.f64813l.add(s10);
        }
    }

    private String U0() {
        return getName() + " declared in " + C6691i.m(b());
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 5 || i10 == 28) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 5 || i10 == 28) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case StdKeyDeserializer.TYPE_URL:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case StdKeyDeserializer.TYPE_CLASS:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 28) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* access modifiers changed from: protected */
    public void K0(S s10) {
        if (s10 == null) {
            i0(27);
        }
        C6798l lVar = this.f64812k;
        if (lVar != null) {
            lVar.invoke(s10);
        }
    }

    /* access modifiers changed from: protected */
    public List L0() {
        N0();
        List list = this.f64813l;
        if (list == null) {
            i0(28);
        }
        return list;
    }

    public void M0(S s10) {
        if (s10 == null) {
            i0(26);
        }
        O0();
        S0(s10);
    }

    public boolean T0() {
        return this.f64814m;
    }

    public void V0() {
        O0();
        this.f64814m = true;
    }
}
