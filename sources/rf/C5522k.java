package Rf;

import Eg.n;
import Fg.C5393u;
import Fg.v0;
import Gg.g;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5495m;
import Of.C5501t;
import Of.C5502u;
import Of.E;
import Of.h0;
import Of.r0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ng.f;
import yg.C6812k;

/* renamed from: Rf.k  reason: case insensitive filesystem */
public class C5522k extends C5521j {

    /* renamed from: i  reason: collision with root package name */
    private final E f64864i;

    /* renamed from: j  reason: collision with root package name */
    private final C5488f f64865j;

    /* renamed from: k  reason: collision with root package name */
    private final v0 f64866k;

    /* renamed from: l  reason: collision with root package name */
    private C6812k f64867l;

    /* renamed from: m  reason: collision with root package name */
    private Set f64868m;

    /* renamed from: n  reason: collision with root package name */
    private C5486d f64869n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5522k(C5495m mVar, f fVar, E e10, C5488f fVar2, Collection collection, h0 h0Var, boolean z10, n nVar) {
        super(nVar, mVar, fVar, h0Var, z10);
        if (mVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        if (e10 == null) {
            F0(2);
        }
        if (fVar2 == null) {
            F0(3);
        }
        if (collection == null) {
            F0(4);
        }
        if (h0Var == null) {
            F0(5);
        }
        if (nVar == null) {
            F0(6);
        }
        this.f64864i = e10;
        this.f64865j = fVar2;
        this.f64866k = new C5393u(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "getStaticScope";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public boolean A() {
        return false;
    }

    public C5486d E() {
        return this.f64869n;
    }

    public boolean I0() {
        return false;
    }

    public final void K0(C6812k kVar, Set set, C5486d dVar) {
        if (kVar == null) {
            F0(7);
        }
        if (set == null) {
            F0(8);
        }
        this.f64867l = kVar;
        this.f64868m = set;
        this.f64869n = dVar;
    }

    public r0 W() {
        return null;
    }

    public boolean Z() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean f0() {
        return false;
    }

    public h getAnnotations() {
        h b10 = h.f64602L.b();
        if (b10 == null) {
            F0(9);
        }
        return b10;
    }

    public C5502u getVisibility() {
        C5502u uVar = C5501t.f64509e;
        if (uVar == null) {
            F0(17);
        }
        return uVar;
    }

    public C5488f h() {
        C5488f fVar = this.f64865j;
        if (fVar == null) {
            F0(15);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public Collection j() {
        Set set = this.f64868m;
        if (set == null) {
            F0(11);
        }
        return set;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        v0 v0Var = this.f64866k;
        if (v0Var == null) {
            F0(10);
        }
        return v0Var;
    }

    public C6812k m0(g gVar) {
        if (gVar == null) {
            F0(12);
        }
        C6812k kVar = this.f64867l;
        if (kVar == null) {
            F0(13);
        }
        return kVar;
    }

    public C6812k n0() {
        C6812k.b bVar = C6812k.b.f73949b;
        if (bVar == null) {
            F0(14);
        }
        return bVar;
    }

    public C5487e o0() {
        return null;
    }

    public List q() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(18);
        }
        return emptyList;
    }

    public E r() {
        E e10 = this.f64864i;
        if (e10 == null) {
            F0(16);
        }
        return e10;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    public Collection y() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(19);
        }
        return emptyList;
    }
}
