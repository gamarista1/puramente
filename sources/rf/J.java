package Rf;

import Fg.G0;
import Of.C5483a;
import Of.C5484b;
import Of.C5495m;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.Y;
import Of.Z;
import Of.c0;
import Of.h0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ng.f;

public abstract class J extends C5525n implements Y {

    /* renamed from: e  reason: collision with root package name */
    private boolean f64755e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f64756f;

    /* renamed from: g  reason: collision with root package name */
    private final E f64757g;

    /* renamed from: h  reason: collision with root package name */
    private final Z f64758h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f64759i;

    /* renamed from: j  reason: collision with root package name */
    private final C5484b.a f64760j;

    /* renamed from: k  reason: collision with root package name */
    private C5502u f64761k;

    /* renamed from: l  reason: collision with root package name */
    private C5507z f64762l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(E e10, C5502u uVar, Z z10, h hVar, f fVar, boolean z11, boolean z12, boolean z13, C5484b.a aVar, h0 h0Var) {
        super(z10.b(), hVar, fVar, h0Var);
        if (e10 == null) {
            i0(0);
        }
        if (uVar == null) {
            i0(1);
        }
        if (z10 == null) {
            i0(2);
        }
        if (hVar == null) {
            i0(3);
        }
        if (fVar == null) {
            i0(4);
        }
        if (h0Var == null) {
            i0(5);
        }
        this.f64762l = null;
        this.f64757g = e10;
        this.f64761k = uVar;
        this.f64758h = z10;
        this.f64755e = z11;
        this.f64756f = z12;
        this.f64759i = z13;
        this.f64760j = aVar;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "getContextReceiverParameters";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public Object B(C5483a.C0945a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public boolean D0() {
        return false;
    }

    public void E0(Collection collection) {
        if (collection == null) {
            i0(16);
        }
    }

    public boolean G() {
        return this.f64755e;
    }

    public boolean G0() {
        return false;
    }

    /* renamed from: H0 */
    public Y p0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* access modifiers changed from: protected */
    public Collection K0(boolean z10) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (Z z11 : X().e()) {
            if (z10) {
                obj = z11.d();
            } else {
                obj = z11.g();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public void L0(boolean z10) {
        this.f64755e = z10;
    }

    public c0 M() {
        return X().M();
    }

    public void M0(C5507z zVar) {
        this.f64762l = zVar;
    }

    public void N0(C5502u uVar) {
        this.f64761k = uVar;
    }

    public c0 P() {
        return X().P();
    }

    public Z X() {
        Z z10 = this.f64758h;
        if (z10 == null) {
            i0(13);
        }
        return z10;
    }

    public boolean Z() {
        return false;
    }

    public C5507z c(G0 g02) {
        if (g02 == null) {
            i0(7);
        }
        return this;
    }

    public List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(9);
        }
        return emptyList;
    }

    public C5502u getVisibility() {
        C5502u uVar = this.f64761k;
        if (uVar == null) {
            i0(11);
        }
        return uVar;
    }

    public C5484b.a h() {
        C5484b.a aVar = this.f64760j;
        if (aVar == null) {
            i0(6);
        }
        return aVar;
    }

    public boolean h0() {
        return false;
    }

    public boolean isExternal() {
        return this.f64756f;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f64759i;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean k0() {
        return false;
    }

    public E r() {
        E e10 = this.f64757g;
        if (e10 == null) {
            i0(10);
        }
        return e10;
    }

    public C5507z t0() {
        return this.f64762l;
    }

    public List x0() {
        List x02 = X().x0();
        if (x02 == null) {
            i0(14);
        }
        return x02;
    }
}
