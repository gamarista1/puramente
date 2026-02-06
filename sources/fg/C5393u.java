package Fg;

import Eg.n;
import Of.C5487e;
import Of.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import rg.C6691i;

/* renamed from: Fg.u  reason: case insensitive filesystem */
public class C5393u extends C5361b {

    /* renamed from: d  reason: collision with root package name */
    private final C5487e f63051d;

    /* renamed from: e  reason: collision with root package name */
    private final List f63052e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection f63053f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5393u(C5487e eVar, List list, Collection collection, n nVar) {
        super(nVar);
        if (eVar == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (nVar == null) {
            H(3);
        }
        this.f63051d = eVar;
        this.f63052e = Collections.unmodifiableList(new ArrayList(list));
        this.f63053f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* renamed from: I */
    public C5487e o() {
        C5487e eVar = this.f63051d;
        if (eVar == null) {
            H(5);
        }
        return eVar;
    }

    public List getParameters() {
        List list = this.f63052e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    public boolean p() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Collection r() {
        Collection collection = this.f63053f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    public String toString() {
        return C6691i.m(this.f63051d).b();
    }

    /* access modifiers changed from: protected */
    public k0 v() {
        k0.a aVar = k0.a.f64500a;
        if (aVar == null) {
            H(7);
        }
        return aVar;
    }
}
