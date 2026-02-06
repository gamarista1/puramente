package Rf;

import Fg.C;
import Fg.E0;
import Fg.G0;
import Fg.N0;
import Fg.S;
import Of.C5483a;
import Of.C5484b;
import Of.C5495m;
import Of.C5497o;
import Of.C5501t;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.h0;
import Of.m0;
import Of.t0;
import Pf.h;
import Pf.j;
import Pg.k;
import Rf.V;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf.C6565s;
import ng.f;
import rg.C6690h;
import yf.C6787a;
import zg.C6837d;
import zg.C6839f;

/* renamed from: Rf.s  reason: case insensitive filesystem */
public abstract class C5529s extends C5525n implements C5507z {

    /* renamed from: A  reason: collision with root package name */
    private final C5507z f64892A;

    /* renamed from: B  reason: collision with root package name */
    private final C5484b.a f64893B;

    /* renamed from: C  reason: collision with root package name */
    private C5507z f64894C;

    /* renamed from: D  reason: collision with root package name */
    protected Map f64895D;

    /* renamed from: e  reason: collision with root package name */
    private List f64896e;

    /* renamed from: f  reason: collision with root package name */
    private List f64897f;

    /* renamed from: g  reason: collision with root package name */
    private S f64898g;

    /* renamed from: h  reason: collision with root package name */
    private List f64899h;

    /* renamed from: i  reason: collision with root package name */
    private c0 f64900i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public c0 f64901j;

    /* renamed from: k  reason: collision with root package name */
    private E f64902k;

    /* renamed from: l  reason: collision with root package name */
    private C5502u f64903l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64904m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f64905n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f64906o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f64907p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f64908q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f64909r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f64910s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f64911t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f64912u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f64913v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f64914w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f64915x;

    /* renamed from: y  reason: collision with root package name */
    private Collection f64916y;

    /* renamed from: z  reason: collision with root package name */
    private volatile C6787a f64917z;

    /* renamed from: Rf.s$a */
    class a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G0 f64918a;

        a(G0 g02) {
            this.f64918a = g02;
        }

        /* renamed from: a */
        public Collection invoke() {
            k kVar = new k();
            for (C5507z c10 : C5529s.this.e()) {
                kVar.add(c10.c(this.f64918a));
            }
            return kVar;
        }
    }

    /* renamed from: Rf.s$b */
    static class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f64920a;

        b(List list) {
            this.f64920a = list;
        }

        /* renamed from: a */
        public List invoke() {
            return this.f64920a;
        }
    }

    /* renamed from: Rf.s$c */
    public class c implements C5507z.a {

        /* renamed from: a  reason: collision with root package name */
        protected E0 f64921a;

        /* renamed from: b  reason: collision with root package name */
        protected C5495m f64922b;

        /* renamed from: c  reason: collision with root package name */
        protected E f64923c;

        /* renamed from: d  reason: collision with root package name */
        protected C5502u f64924d;

        /* renamed from: e  reason: collision with root package name */
        protected C5507z f64925e;

        /* renamed from: f  reason: collision with root package name */
        protected C5484b.a f64926f;

        /* renamed from: g  reason: collision with root package name */
        protected List f64927g;

        /* renamed from: h  reason: collision with root package name */
        protected List f64928h;

        /* renamed from: i  reason: collision with root package name */
        protected c0 f64929i;

        /* renamed from: j  reason: collision with root package name */
        protected c0 f64930j;

        /* renamed from: k  reason: collision with root package name */
        protected S f64931k;

        /* renamed from: l  reason: collision with root package name */
        protected f f64932l;

        /* renamed from: m  reason: collision with root package name */
        protected boolean f64933m;

        /* renamed from: n  reason: collision with root package name */
        protected boolean f64934n;

        /* renamed from: o  reason: collision with root package name */
        protected boolean f64935o;

        /* renamed from: p  reason: collision with root package name */
        protected boolean f64936p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public boolean f64937q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public List f64938r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public h f64939s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f64940t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public Map f64941u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public Boolean f64942v;

        /* renamed from: w  reason: collision with root package name */
        protected boolean f64943w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ C5529s f64944x;

        public c(C5529s sVar, E0 e02, C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, List list, List list2, c0 c0Var, S s10, f fVar) {
            if (e02 == null) {
                a(0);
            }
            if (mVar == null) {
                a(1);
            }
            if (e10 == null) {
                a(2);
            }
            if (uVar == null) {
                a(3);
            }
            if (aVar == null) {
                a(4);
            }
            if (list == null) {
                a(5);
            }
            if (list2 == null) {
                a(6);
            }
            if (s10 == null) {
                a(7);
            }
            this.f64944x = sVar;
            this.f64925e = null;
            this.f64930j = sVar.f64901j;
            this.f64933m = true;
            this.f64934n = false;
            this.f64935o = false;
            this.f64936p = false;
            this.f64937q = sVar.D0();
            this.f64938r = null;
            this.f64939s = null;
            this.f64940t = sVar.G0();
            this.f64941u = new LinkedHashMap();
            this.f64942v = null;
            this.f64943w = false;
            this.f64921a = e02;
            this.f64922b = mVar;
            this.f64923c = e10;
            this.f64924d = uVar;
            this.f64926f = aVar;
            this.f64927g = list;
            this.f64928h = list2;
            this.f64929i = c0Var;
            this.f64931k = s10;
            this.f64932l = fVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 18:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 18:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case StdKeyDeserializer.TYPE_URL:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 18:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case com.amazon.c.a.a.c.f37660h:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case CharsToNameCanonicalizer.HASH_MULT:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 18:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case StdKeyDeserializer.TYPE_URL:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 18:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    th2 = new IllegalStateException(format);
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
            throw th2;
        }

        /* renamed from: C */
        public c t(h hVar) {
            if (hVar == null) {
                a(35);
            }
            this.f64939s = hVar;
            return this;
        }

        /* renamed from: D */
        public c w(boolean z10) {
            this.f64933m = z10;
            return this;
        }

        /* renamed from: E */
        public c p(c0 c0Var) {
            this.f64930j = c0Var;
            return this;
        }

        /* renamed from: F */
        public c g() {
            this.f64936p = true;
            return this;
        }

        /* renamed from: G */
        public c l(c0 c0Var) {
            this.f64929i = c0Var;
            return this;
        }

        public c H(boolean z10) {
            this.f64942v = Boolean.valueOf(z10);
            return this;
        }

        /* renamed from: I */
        public c i() {
            this.f64940t = true;
            return this;
        }

        /* renamed from: J */
        public c m() {
            this.f64937q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f64943w = z10;
            return this;
        }

        /* renamed from: L */
        public c n(C5484b.a aVar) {
            if (aVar == null) {
                a(14);
            }
            this.f64926f = aVar;
            return this;
        }

        /* renamed from: M */
        public c r(E e10) {
            if (e10 == null) {
                a(10);
            }
            this.f64923c = e10;
            return this;
        }

        /* renamed from: N */
        public c o(f fVar) {
            if (fVar == null) {
                a(17);
            }
            this.f64932l = fVar;
            return this;
        }

        /* renamed from: O */
        public c y(C5484b bVar) {
            this.f64925e = (C5507z) bVar;
            return this;
        }

        /* renamed from: P */
        public c v(C5495m mVar) {
            if (mVar == null) {
                a(8);
            }
            this.f64922b = mVar;
            return this;
        }

        /* renamed from: Q */
        public c u() {
            this.f64935o = true;
            return this;
        }

        /* renamed from: R */
        public c s(S s10) {
            if (s10 == null) {
                a(23);
            }
            this.f64931k = s10;
            return this;
        }

        /* renamed from: S */
        public c z() {
            this.f64934n = true;
            return this;
        }

        /* renamed from: T */
        public c j(E0 e02) {
            if (e02 == null) {
                a(37);
            }
            this.f64921a = e02;
            return this;
        }

        /* renamed from: U */
        public c x(List list) {
            if (list == null) {
                a(21);
            }
            this.f64938r = list;
            return this;
        }

        /* renamed from: V */
        public c h(List list) {
            if (list == null) {
                a(19);
            }
            this.f64927g = list;
            return this;
        }

        /* renamed from: W */
        public c k(C5502u uVar) {
            if (uVar == null) {
                a(12);
            }
            this.f64924d = uVar;
            return this;
        }

        public C5507z f() {
            return this.f64944x.M0(this);
        }

        public C5507z.a q(C5483a.C0945a aVar, Object obj) {
            if (aVar == null) {
                a(39);
            }
            this.f64941u.put(aVar, obj);
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5529s(C5495m mVar, C5507z zVar, h hVar, f fVar, C5484b.a aVar, h0 h0Var) {
        super(mVar, hVar, fVar, h0Var);
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (fVar == null) {
            i0(2);
        }
        if (aVar == null) {
            i0(3);
        }
        if (h0Var == null) {
            i0(4);
        }
        this.f64903l = C5501t.f64513i;
        this.f64904m = false;
        this.f64905n = false;
        this.f64906o = false;
        this.f64907p = false;
        this.f64908q = false;
        this.f64909r = false;
        this.f64910s = false;
        this.f64911t = false;
        this.f64912u = false;
        this.f64913v = false;
        this.f64914w = true;
        this.f64915x = false;
        this.f64916y = null;
        this.f64917z = null;
        this.f64894C = null;
        this.f64895D = null;
        this.f64892A = zVar == null ? this : zVar;
        this.f64893B = aVar;
    }

    private h0 N0(boolean z10, C5507z zVar) {
        h0 h0Var;
        if (z10) {
            if (zVar == null) {
                zVar = a();
            }
            h0Var = zVar.i();
        } else {
            h0Var = h0.f64497a;
        }
        if (h0Var == null) {
            i0(27);
        }
        return h0Var;
    }

    public static List O0(C5507z zVar, List list, G0 g02) {
        if (list == null) {
            i0(28);
        }
        if (g02 == null) {
            i0(29);
        }
        return P0(zVar, list, g02, false, false, (boolean[]) null);
    }

    public static List P0(C5507z zVar, List list, G0 g02, boolean z10, boolean z11, boolean[] zArr) {
        S s10;
        b bVar;
        t0 t0Var;
        h0 h0Var;
        G0 g03 = g02;
        if (list == null) {
            i0(30);
        }
        if (g03 == null) {
            i0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t0 t0Var2 = (t0) it.next();
            S type = t0Var2.getType();
            N0 n02 = N0.IN_VARIANCE;
            S p10 = g03.p(type, n02);
            S v02 = t0Var2.v0();
            if (v02 == null) {
                s10 = null;
            } else {
                s10 = g03.p(v02, n02);
            }
            if (p10 == null) {
                return null;
            }
            if (!((p10 == t0Var2.getType() && v02 == s10) || zArr == null)) {
                zArr[0] = true;
            }
            if (t0Var2 instanceof V.b) {
                bVar = new b(((V.b) t0Var2).P0());
            } else {
                bVar = null;
            }
            if (z10) {
                t0Var = null;
            } else {
                t0Var = t0Var2;
            }
            int index = t0Var2.getIndex();
            h annotations = t0Var2.getAnnotations();
            f name = t0Var2.getName();
            boolean A02 = t0Var2.A0();
            boolean s02 = t0Var2.s0();
            boolean r02 = t0Var2.r0();
            if (z11) {
                h0Var = t0Var2.i();
            } else {
                h0Var = h0.f64497a;
            }
            arrayList.add(V.K0(zVar, t0Var, index, annotations, name, p10, A02, s02, r02, s10, h0Var, bVar));
        }
        return arrayList;
    }

    private void T0() {
        C6787a aVar = this.f64917z;
        if (aVar != null) {
            this.f64916y = (Collection) aVar.invoke();
            this.f64917z = null;
        }
    }

    private void a1(boolean z10) {
        this.f64912u = z10;
    }

    private void b1(boolean z10) {
        this.f64911t = z10;
    }

    private void d1(C5507z zVar) {
        this.f64894C = zVar;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 9:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 23:
            case 26:
            case 27:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public Object B(C5483a.C0945a aVar) {
        Map map = this.f64895D;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public boolean D() {
        return this.f64908q;
    }

    public boolean D0() {
        return this.f64911t;
    }

    public void E0(Collection collection) {
        if (collection == null) {
            i0(17);
        }
        this.f64916y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C5507z) it.next()).G0()) {
                this.f64912u = true;
                return;
            }
        }
    }

    public boolean G0() {
        return this.f64912u;
    }

    public C5507z K0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        C5507z f10 = v().v(mVar).r(e10).k(uVar).n(aVar).w(z10).f();
        if (f10 == null) {
            i0(26);
        }
        return f10;
    }

    /* access modifiers changed from: protected */
    public abstract C5529s L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var);

    public c0 M() {
        return this.f64901j;
    }

    /* access modifiers changed from: protected */
    public C5507z M0(c cVar) {
        h annotations;
        List list;
        N n10;
        c0 c0Var;
        S p10;
        boolean z10;
        boolean z11;
        C5507z zVar;
        boolean z12;
        boolean z13;
        boolean z14;
        c cVar2 = cVar;
        if (cVar2 == null) {
            i0(25);
        }
        boolean[] zArr = new boolean[1];
        if (cVar.f64939s != null) {
            annotations = j.a(getAnnotations(), cVar.f64939s);
        } else {
            annotations = getAnnotations();
        }
        h hVar = annotations;
        C5495m mVar = cVar2.f64922b;
        C5507z zVar2 = cVar2.f64925e;
        C5529s L02 = L0(mVar, zVar2, cVar2.f64926f, cVar2.f64932l, hVar, N0(cVar2.f64935o, zVar2));
        if (cVar.f64938r == null) {
            list = getTypeParameters();
        } else {
            list = cVar.f64938r;
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        G0 c10 = C.c(list, cVar2.f64921a, L02, arrayList, zArr);
        if (c10 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar2.f64928h.isEmpty()) {
            int i10 = 0;
            for (c0 c0Var2 : cVar2.f64928h) {
                S p11 = c10.p(c0Var2.getType(), N0.IN_VARIANCE);
                if (p11 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(C6690h.b(L02, p11, ((C6839f) c0Var2.getValue()).a(), c0Var2.getAnnotations(), i10));
                boolean z15 = zArr[0];
                if (p11 != c0Var2.getType()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zArr[0] = z15 | z14;
                i10 = i11;
            }
        }
        c0 c0Var3 = cVar2.f64929i;
        if (c0Var3 != null) {
            S p12 = c10.p(c0Var3.getType(), N0.IN_VARIANCE);
            if (p12 == null) {
                return null;
            }
            N n11 = new N(L02, new C6837d(L02, p12, cVar2.f64929i.getValue()), cVar2.f64929i.getAnnotations());
            boolean z16 = zArr[0];
            if (p12 != cVar2.f64929i.getType()) {
                z13 = true;
            } else {
                z13 = false;
            }
            zArr[0] = z13 | z16;
            n10 = n11;
        } else {
            n10 = null;
        }
        c0 c0Var4 = cVar2.f64930j;
        if (c0Var4 != null) {
            c0 c11 = c0Var4.c(c10);
            if (c11 == null) {
                return null;
            }
            boolean z17 = zArr[0];
            if (c11 != cVar2.f64930j) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[0] = z17 | z12;
            c0Var = c11;
        } else {
            c0Var = null;
        }
        List P02 = P0(L02, cVar2.f64927g, c10, cVar2.f64936p, cVar2.f64935o, zArr);
        if (P02 == null || (p10 = c10.p(cVar2.f64931k, N0.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z18 = zArr[0];
        if (p10 != cVar2.f64931k) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z19 = z18 | z10;
        zArr[0] = z19;
        if (!z19 && cVar2.f64943w) {
            return this;
        }
        G0 g02 = c10;
        L02.R0(n10, c0Var, arrayList2, arrayList, P02, p10, cVar2.f64923c, cVar2.f64924d);
        L02.f1(this.f64904m);
        L02.c1(this.f64905n);
        L02.X0(this.f64906o);
        L02.e1(this.f64907p);
        L02.i1(this.f64908q);
        L02.h1(this.f64913v);
        L02.W0(this.f64909r);
        L02.V0(this.f64910s);
        L02.Y0(this.f64914w);
        L02.b1(cVar.f64937q);
        L02.a1(cVar.f64940t);
        if (cVar.f64942v != null) {
            z11 = cVar.f64942v.booleanValue();
        } else {
            z11 = this.f64915x;
        }
        L02.Z0(z11);
        if (!cVar.f64941u.isEmpty() || this.f64895D != null) {
            Map B10 = cVar.f64941u;
            Map map = this.f64895D;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!B10.containsKey(entry.getKey())) {
                        B10.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (B10.size() == 1) {
                L02.f64895D = Collections.singletonMap(B10.keySet().iterator().next(), B10.values().iterator().next());
            } else {
                L02.f64895D = B10;
            }
        }
        if (cVar2.f64934n || t0() != null) {
            if (t0() != null) {
                zVar = t0();
            } else {
                zVar = this;
            }
            L02.d1(zVar.c(g02));
        }
        if (cVar2.f64933m && !a().e().isEmpty()) {
            if (cVar2.f64921a.f()) {
                C6787a aVar = this.f64917z;
                if (aVar != null) {
                    L02.f64917z = aVar;
                } else {
                    L02.E0(e());
                }
            } else {
                L02.f64917z = new a(g02);
            }
        }
        return L02;
    }

    public c0 P() {
        return this.f64900i;
    }

    public boolean Q0() {
        return this.f64914w;
    }

    public C5529s R0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, C5502u uVar) {
        if (list == null) {
            i0(5);
        }
        if (list2 == null) {
            i0(6);
        }
        if (list3 == null) {
            i0(7);
        }
        if (uVar == null) {
            i0(8);
        }
        this.f64896e = C6565s.e1(list2);
        this.f64897f = C6565s.e1(list3);
        this.f64898g = s10;
        this.f64902k = e10;
        this.f64903l = uVar;
        this.f64900i = c0Var;
        this.f64901j = c0Var2;
        this.f64899h = list;
        int i10 = 0;
        int i11 = 0;
        while (i11 < list2.size()) {
            m0 m0Var = (m0) list2.get(i11);
            if (m0Var.getIndex() == i11) {
                i11++;
            } else {
                throw new IllegalStateException(m0Var + " index is " + m0Var.getIndex() + " but position is " + i11);
            }
        }
        while (i10 < list3.size()) {
            t0 t0Var = (t0) list3.get(i10);
            if (t0Var.getIndex() == i10) {
                i10++;
            } else {
                throw new IllegalStateException(t0Var + "index is " + t0Var.getIndex() + " but position is " + i10);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public c S0(G0 g02) {
        if (g02 == null) {
            i0(24);
        }
        return new c(this, g02.j(), b(), r(), getVisibility(), h(), k(), x0(), P(), getReturnType(), (f) null);
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.f(this, obj);
    }

    public void U0(C5483a.C0945a aVar, Object obj) {
        if (this.f64895D == null) {
            this.f64895D = new LinkedHashMap();
        }
        this.f64895D.put(aVar, obj);
    }

    public void V0(boolean z10) {
        this.f64910s = z10;
    }

    public void W0(boolean z10) {
        this.f64909r = z10;
    }

    public void X0(boolean z10) {
        this.f64906o = z10;
    }

    public void Y0(boolean z10) {
        this.f64914w = z10;
    }

    public boolean Z() {
        return this.f64910s;
    }

    public void Z0(boolean z10) {
        this.f64915x = z10;
    }

    public C5507z a() {
        C5507z zVar;
        C5507z zVar2 = this.f64892A;
        if (zVar2 == this) {
            zVar = this;
        } else {
            zVar = zVar2.a();
        }
        if (zVar == null) {
            i0(20);
        }
        return zVar;
    }

    public void c1(boolean z10) {
        this.f64905n = z10;
    }

    public Collection e() {
        T0();
        Collection collection = this.f64916y;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            i0(14);
        }
        return collection;
    }

    public void e1(boolean z10) {
        this.f64907p = z10;
    }

    public void f1(boolean z10) {
        this.f64904m = z10;
    }

    public void g1(S s10) {
        if (s10 == null) {
            i0(11);
        }
        this.f64898g = s10;
    }

    public S getReturnType() {
        return this.f64898g;
    }

    public List getTypeParameters() {
        List list = this.f64896e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C5502u getVisibility() {
        C5502u uVar = this.f64903l;
        if (uVar == null) {
            i0(16);
        }
        return uVar;
    }

    public C5484b.a h() {
        C5484b.a aVar = this.f64893B;
        if (aVar == null) {
            i0(21);
        }
        return aVar;
    }

    public boolean h0() {
        return this.f64915x;
    }

    public void h1(boolean z10) {
        this.f64913v = z10;
    }

    public void i1(boolean z10) {
        this.f64908q = z10;
    }

    public boolean isExternal() {
        return this.f64906o;
    }

    public boolean isInfix() {
        if (this.f64905n) {
            return true;
        }
        for (C5507z isInfix : a().e()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f64907p;
    }

    public boolean isOperator() {
        if (this.f64904m) {
            return true;
        }
        for (C5507z isOperator : a().e()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f64913v;
    }

    public void j1(C5502u uVar) {
        if (uVar == null) {
            i0(10);
        }
        this.f64903l = uVar;
    }

    public List k() {
        List list = this.f64897f;
        if (list == null) {
            i0(19);
        }
        return list;
    }

    public boolean k0() {
        return this.f64909r;
    }

    public E r() {
        E e10 = this.f64902k;
        if (e10 == null) {
            i0(15);
        }
        return e10;
    }

    public C5507z t0() {
        return this.f64894C;
    }

    public C5507z.a v() {
        c S02 = S0(G0.f62929b);
        if (S02 == null) {
            i0(23);
        }
        return S02;
    }

    public List x0() {
        List list = this.f64899h;
        if (list == null) {
            i0(13);
        }
        return list;
    }

    public C5507z c(G0 g02) {
        if (g02 == null) {
            i0(22);
        }
        if (g02.k()) {
            return this;
        }
        return S0(g02).y(a()).u().K(true).f();
    }
}
