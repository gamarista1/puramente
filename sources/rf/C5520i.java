package Rf;

import Fg.G0;
import Fg.S;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.C5497o;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.h0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ng.f;

/* renamed from: Rf.i  reason: case insensitive filesystem */
public class C5520i extends C5529s implements C5486d {

    /* renamed from: E  reason: collision with root package name */
    protected final boolean f64860E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5520i(C5487e eVar, C5494l lVar, h hVar, boolean z10, C5484b.a aVar, h0 h0Var) {
        super(eVar, lVar, hVar, ng.h.f72312j, aVar, h0Var);
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
        this.f64860E = z10;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "initialize";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private List k1() {
        C5487e p12 = b();
        if (!p12.a0().isEmpty()) {
            List a02 = p12.a0();
            if (a02 == null) {
                i0(15);
            }
            return a02;
        }
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(16);
        }
        return emptyList;
    }

    public static C5520i n1(C5487e eVar, h hVar, boolean z10, h0 h0Var) {
        if (eVar == null) {
            i0(4);
        }
        if (hVar == null) {
            i0(5);
        }
        if (h0Var == null) {
            i0(6);
        }
        return new C5520i(eVar, (C5494l) null, hVar, z10, C5484b.a.DECLARATION, h0Var);
    }

    public void E0(Collection collection) {
        if (collection == null) {
            i0(22);
        }
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.a(this, obj);
    }

    public boolean d0() {
        return this.f64860E;
    }

    public Collection e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            i0(21);
        }
        return emptySet;
    }

    public C5487e e0() {
        C5487e p12 = b();
        if (p12 == null) {
            i0(18);
        }
        return p12;
    }

    public c0 l1() {
        C5487e p12 = b();
        if (!p12.A()) {
            return null;
        }
        C5495m b10 = p12.b();
        if (b10 instanceof C5487e) {
            return ((C5487e) b10).J0();
        }
        return null;
    }

    /* renamed from: m1 */
    public C5486d p0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        C5486d dVar = (C5486d) super.K0(mVar, e10, uVar, aVar, z10);
        if (dVar == null) {
            i0(27);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public C5520i L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        if (mVar == null) {
            i0(23);
        }
        if (aVar == null) {
            i0(24);
        }
        if (hVar == null) {
            i0(25);
        }
        if (h0Var == null) {
            i0(26);
        }
        C5484b.a aVar2 = C5484b.a.DECLARATION;
        if (aVar == aVar2 || aVar == C5484b.a.SYNTHESIZED) {
            return new C5520i((C5487e) mVar, this, hVar, this.f64860E, aVar2, h0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: p1 */
    public C5487e b() {
        C5487e eVar = (C5487e) super.b();
        if (eVar == null) {
            i0(17);
        }
        return eVar;
    }

    public C5520i q1(List list, C5502u uVar) {
        if (list == null) {
            i0(13);
        }
        if (uVar == null) {
            i0(14);
        }
        r1(list, uVar, b().q());
        return this;
    }

    public C5520i r1(List list, C5502u uVar, List list2) {
        if (list == null) {
            i0(10);
        }
        if (uVar == null) {
            i0(11);
        }
        if (list2 == null) {
            i0(12);
        }
        super.R0((c0) null, l1(), k1(), list2, list, (S) null, E.FINAL, uVar);
        return this;
    }

    public C5486d c(G0 g02) {
        if (g02 == null) {
            i0(20);
        }
        return (C5486d) super.c(g02);
    }

    public C5486d a() {
        C5486d dVar = (C5486d) super.a();
        if (dVar == null) {
            i0(19);
        }
        return dVar;
    }
}
