package Rf;

import Of.C5495m;
import Pf.b;
import Pf.h;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import ng.f;
import qg.n;

/* renamed from: Rf.m  reason: case insensitive filesystem */
public abstract class C5524m extends b implements C5495m {

    /* renamed from: b  reason: collision with root package name */
    private final f f64872b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5524m(h hVar, f fVar) {
        super(hVar);
        if (hVar == null) {
            i0(0);
        }
        if (fVar == null) {
            i0(1);
        }
        this.f64872b = fVar;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i10 == 2 || i10 == 3)) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (!(i10 == 5 || i10 == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static String m0(C5495m mVar) {
        if (mVar == null) {
            i0(4);
        }
        try {
            String str = n.f72702k.O(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                i0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + mVar.getName();
            if (str2 == null) {
                i0(6);
            }
            return str2;
        }
    }

    public f getName() {
        f fVar = this.f64872b;
        if (fVar == null) {
            i0(2);
        }
        return fVar;
    }

    public String toString() {
        return m0(this);
    }

    public C5495m a() {
        return this;
    }
}
