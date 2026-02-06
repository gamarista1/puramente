package Rf;

import Eg.i;
import Eg.n;
import Fg.C5366d0;
import Fg.E0;
import Fg.G0;
import Fg.J0;
import Fg.V;
import Gg.g;
import Of.C5487e;
import Of.C5490h;
import Of.C5497o;
import Of.c0;
import Of.l0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collections;
import java.util.List;
import ng.f;
import rg.C6691i;
import vg.C6755e;
import yf.C6787a;
import yf.C6798l;
import yg.C6808g;
import yg.C6812k;
import yg.C6821t;

/* renamed from: Rf.a  reason: case insensitive filesystem */
public abstract class C5512a extends z {

    /* renamed from: b  reason: collision with root package name */
    private final f f64828b;

    /* renamed from: c  reason: collision with root package name */
    protected final i f64829c;

    /* renamed from: d  reason: collision with root package name */
    private final i f64830d;

    /* renamed from: e  reason: collision with root package name */
    private final i f64831e;

    /* renamed from: Rf.a$a  reason: collision with other inner class name */
    class C0951a implements C6787a {

        /* renamed from: Rf.a$a$a  reason: collision with other inner class name */
        class C0952a implements C6798l {
            C0952a() {
            }

            /* renamed from: a */
            public C5366d0 invoke(g gVar) {
                C5490h f10 = gVar.f(C5512a.this);
                if (f10 == null) {
                    return (C5366d0) C5512a.this.f64829c.invoke();
                }
                if (f10 instanceof l0) {
                    return V.c((l0) f10, J0.g(f10.l().getParameters()));
                }
                if (f10 instanceof z) {
                    return J0.u(f10.l().n(gVar), ((z) f10).m0(gVar), this);
                }
                return f10.p();
            }
        }

        C0951a() {
        }

        /* renamed from: a */
        public C5366d0 invoke() {
            C5512a aVar = C5512a.this;
            return J0.v(aVar, aVar.Y(), new C0952a());
        }
    }

    /* renamed from: Rf.a$b */
    class b implements C6787a {
        b() {
        }

        /* renamed from: a */
        public C6812k invoke() {
            return new C6808g(C5512a.this.Y());
        }
    }

    /* renamed from: Rf.a$c */
    class c implements C6787a {
        c() {
        }

        /* renamed from: a */
        public c0 invoke() {
            return new C5530t(C5512a.this);
        }
    }

    public C5512a(n nVar, f fVar) {
        if (nVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        this.f64828b = fVar;
        this.f64829c = nVar.g(new C0951a());
        this.f64830d = nVar.g(new b());
        this.f64831e = nVar.g(new c());
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16 || i12 == 17 || i12 == 19 || i12 == 20) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16 || i12 == 17 || i12 == 19 || i12 == 20) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i12) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case StdKeyDeserializer.TYPE_URL:
            case 16:
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i12 == 2) {
            objArr[1] = "getName";
        } else if (i12 == 3) {
            objArr[1] = "getOriginal";
        } else if (i12 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i12 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i12 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i12 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i12 == 19) {
            objArr[1] = "substitute";
        } else if (i12 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i12) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case StdKeyDeserializer.TYPE_URL:
            case 16:
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16 || i12 == 17 || i12 == 19 || i12 == 20) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* renamed from: H0 */
    public C5487e c(G0 g02) {
        if (g02 == null) {
            F0(18);
        }
        if (g02.k()) {
            return this;
        }
        return new C5535y(this, g02);
    }

    public C6812k I(E0 e02) {
        if (e02 == null) {
            F0(15);
        }
        C6812k i02 = i0(e02, C6755e.r(C6691i.g(this)));
        if (i02 == null) {
            F0(16);
        }
        return i02;
    }

    public c0 J0() {
        c0 c0Var = (c0) this.f64831e.invoke();
        if (c0Var == null) {
            F0(5);
        }
        return c0Var;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.c(this, obj);
    }

    public C6812k V() {
        C6812k kVar = (C6812k) this.f64830d.invoke();
        if (kVar == null) {
            F0(4);
        }
        return kVar;
    }

    public C6812k Y() {
        C6812k m02 = m0(C6755e.r(C6691i.g(this)));
        if (m02 == null) {
            F0(17);
        }
        return m02;
    }

    public List a0() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(6);
        }
        return emptyList;
    }

    public f getName() {
        f fVar = this.f64828b;
        if (fVar == null) {
            F0(2);
        }
        return fVar;
    }

    public C6812k i0(E0 e02, g gVar) {
        if (e02 == null) {
            F0(10);
        }
        if (gVar == null) {
            F0(11);
        }
        if (e02.f()) {
            C6812k m02 = m0(gVar);
            if (m02 == null) {
                F0(12);
            }
            return m02;
        }
        return new C6821t(m0(gVar), G0.g(e02));
    }

    public C5366d0 p() {
        C5366d0 d0Var = (C5366d0) this.f64829c.invoke();
        if (d0Var == null) {
            F0(20);
        }
        return d0Var;
    }

    public C5487e a() {
        return this;
    }
}
