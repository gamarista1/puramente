package Rf;

import Eg.n;
import Fg.C5393u;
import Fg.v0;
import Gg.g;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5495m;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.h0;
import Of.r0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ng.f;
import yg.C6812k;

public class G extends C5521j {

    /* renamed from: i  reason: collision with root package name */
    private final C5488f f64741i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f64742j;

    /* renamed from: k  reason: collision with root package name */
    private E f64743k;

    /* renamed from: l  reason: collision with root package name */
    private C5502u f64744l;

    /* renamed from: m  reason: collision with root package name */
    private v0 f64745m;

    /* renamed from: n  reason: collision with root package name */
    private List f64746n;

    /* renamed from: o  reason: collision with root package name */
    private final Collection f64747o;

    /* renamed from: p  reason: collision with root package name */
    private final n f64748p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(C5495m mVar, C5488f fVar, boolean z10, boolean z11, f fVar2, h0 h0Var, n nVar) {
        super(nVar, mVar, fVar2, h0Var, z11);
        if (mVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        if (fVar2 == null) {
            F0(2);
        }
        if (h0Var == null) {
            F0(3);
        }
        if (nVar == null) {
            F0(4);
        }
        this.f64747o = new ArrayList();
        this.f64748p = nVar;
        this.f64741i = fVar;
        this.f64742j = z10;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
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
        return this.f64742j;
    }

    public C5486d E() {
        return null;
    }

    public boolean I0() {
        return false;
    }

    public void K0() {
        this.f64745m = new C5393u(this, this.f64746n, this.f64747o, this.f64748p);
        for (C5507z zVar : j()) {
            ((C5520i) zVar).g1(p());
        }
    }

    /* renamed from: L0 */
    public Set j() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            F0(13);
        }
        return emptySet;
    }

    public void M0(E e10) {
        if (e10 == null) {
            F0(6);
        }
        this.f64743k = e10;
    }

    public void N0(List list) {
        if (list == null) {
            F0(14);
        }
        if (this.f64746n == null) {
            this.f64746n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(C5502u uVar) {
        if (uVar == null) {
            F0(9);
        }
        this.f64744l = uVar;
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
            F0(5);
        }
        return b10;
    }

    public C5502u getVisibility() {
        C5502u uVar = this.f64744l;
        if (uVar == null) {
            F0(10);
        }
        return uVar;
    }

    public C5488f h() {
        C5488f fVar = this.f64741i;
        if (fVar == null) {
            F0(8);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        v0 v0Var = this.f64745m;
        if (v0Var == null) {
            F0(11);
        }
        return v0Var;
    }

    public C6812k m0(g gVar) {
        if (gVar == null) {
            F0(16);
        }
        C6812k.b bVar = C6812k.b.f73949b;
        if (bVar == null) {
            F0(17);
        }
        return bVar;
    }

    public C6812k n0() {
        C6812k.b bVar = C6812k.b.f73949b;
        if (bVar == null) {
            F0(18);
        }
        return bVar;
    }

    public C5487e o0() {
        return null;
    }

    public List q() {
        List list = this.f64746n;
        if (list == null) {
            F0(15);
        }
        return list;
    }

    public E r() {
        E e10 = this.f64743k;
        if (e10 == null) {
            F0(7);
        }
        return e10;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return C5524m.m0(this);
    }

    public Collection y() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(19);
        }
        return emptyList;
    }
}
