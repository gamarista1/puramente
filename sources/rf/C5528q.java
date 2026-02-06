package Rf;

import Eg.g;
import Eg.i;
import Eg.n;
import Fg.C5393u;
import Fg.S;
import Fg.v0;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5501t;
import Of.C5502u;
import Of.E;
import Of.h0;
import Of.r0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ng.f;
import rg.C6695m;
import rg.C6697o;
import yf.C6787a;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;
import yg.C6813l;

/* renamed from: Rf.q  reason: case insensitive filesystem */
public class C5528q extends C5521j {

    /* renamed from: i  reason: collision with root package name */
    private final v0 f64875i;

    /* renamed from: j  reason: collision with root package name */
    private final C6812k f64876j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final i f64877k;

    /* renamed from: l  reason: collision with root package name */
    private final h f64878l;

    /* renamed from: Rf.q$a */
    private class a extends C6813l {

        /* renamed from: b  reason: collision with root package name */
        private final g f64879b;

        /* renamed from: c  reason: collision with root package name */
        private final g f64880c;

        /* renamed from: d  reason: collision with root package name */
        private final i f64881d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5528q f64882e;

        /* renamed from: Rf.q$a$a  reason: collision with other inner class name */
        class C0953a implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5528q f64883a;

            C0953a(C5528q qVar) {
                this.f64883a = qVar;
            }

            /* renamed from: a */
            public Collection invoke(f fVar) {
                return a.this.m(fVar);
            }
        }

        /* renamed from: Rf.q$a$b */
        class b implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5528q f64885a;

            b(C5528q qVar) {
                this.f64885a = qVar;
            }

            /* renamed from: a */
            public Collection invoke(f fVar) {
                return a.this.n(fVar);
            }
        }

        /* renamed from: Rf.q$a$c */
        class c implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5528q f64887a;

            c(C5528q qVar) {
                this.f64887a = qVar;
            }

            /* renamed from: a */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* renamed from: Rf.q$a$d */
        class d extends C6695m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Set f64889a;

            d(Set set) {
                this.f64889a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public void a(C5484b bVar) {
                if (bVar == null) {
                    f(0);
                }
                C6697o.K(bVar, (C6798l) null);
                this.f64889a.add(bVar);
            }

            /* access modifiers changed from: protected */
            public void e(C5484b bVar, C5484b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(C5528q qVar, n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f64882e = qVar;
            this.f64879b = nVar.h(new C0953a(qVar));
            this.f64880c = nVar.h(new b(qVar));
            this.f64881d = nVar.g(new c(qVar));
        }

        private static /* synthetic */ void h(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
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
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
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
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case StdKeyDeserializer.TYPE_URL:
                    objArr[0] = "nameFilter";
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case StdKeyDeserializer.TYPE_CLASS:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case StdKeyDeserializer.TYPE_CLASS:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case StdKeyDeserializer.TYPE_URL:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
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

        /* access modifiers changed from: private */
        public Collection l() {
            HashSet hashSet = new HashSet();
            for (f fVar : (Set) this.f64882e.f64877k.invoke()) {
                Wf.d dVar = Wf.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(c(fVar, dVar));
                hashSet.addAll(b(fVar, dVar));
            }
            return hashSet;
        }

        /* access modifiers changed from: private */
        public Collection m(f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().c(fVar, Wf.d.FOR_NON_TRACKED_SCOPE));
        }

        /* access modifiers changed from: private */
        public Collection n(f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().b(fVar, Wf.d.FOR_NON_TRACKED_SCOPE));
        }

        private C6812k o() {
            C6812k o10 = ((S) this.f64882e.l().l().iterator().next()).o();
            if (o10 == null) {
                h(9);
            }
            return o10;
        }

        private Collection p(f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C6697o.f73033f.v(fVar, collection, Collections.emptySet(), this.f64882e, new d(linkedHashSet));
            return linkedHashSet;
        }

        public Set a() {
            Set set = (Set) this.f64882e.f64877k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        public Collection b(f fVar, Wf.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f64880c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        public Collection c(f fVar, Wf.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f64879b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        public Set d() {
            Set set = (Set) this.f64882e.f64877k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        public Collection f(C6805d dVar, C6798l lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection collection = (Collection) this.f64881d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        public Set g() {
            Set emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(18);
            }
            return emptySet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C5528q(n nVar, C5487e eVar, S s10, f fVar, i iVar, h hVar, h0 h0Var) {
        super(nVar, eVar, fVar, h0Var, false);
        if (nVar == null) {
            F0(6);
        }
        if (eVar == null) {
            F0(7);
        }
        if (s10 == null) {
            F0(8);
        }
        if (fVar == null) {
            F0(9);
        }
        if (iVar == null) {
            F0(10);
        }
        if (hVar == null) {
            F0(11);
        }
        if (h0Var == null) {
            F0(12);
        }
        this.f64878l = hVar;
        this.f64875i = new C5393u(this, Collections.emptyList(), Collections.singleton(s10), nVar);
        this.f64876j = new a(this, nVar);
        this.f64877k = iVar;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static C5528q L0(n nVar, C5487e eVar, f fVar, i iVar, h hVar, h0 h0Var) {
        if (nVar == null) {
            F0(0);
        }
        if (eVar == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (iVar == null) {
            F0(3);
        }
        if (hVar == null) {
            F0(4);
        }
        if (h0Var == null) {
            F0(5);
        }
        return new C5528q(nVar, eVar, eVar.p(), fVar, iVar, hVar, h0Var);
    }

    public boolean A() {
        return false;
    }

    public C5486d E() {
        return null;
    }

    public boolean I0() {
        return false;
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
        h hVar = this.f64878l;
        if (hVar == null) {
            F0(21);
        }
        return hVar;
    }

    public C5502u getVisibility() {
        C5502u uVar = C5501t.f64509e;
        if (uVar == null) {
            F0(20);
        }
        return uVar;
    }

    public C5488f h() {
        C5488f fVar = C5488f.ENUM_ENTRY;
        if (fVar == null) {
            F0(18);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public Collection j() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(16);
        }
        return emptyList;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        v0 v0Var = this.f64875i;
        if (v0Var == null) {
            F0(17);
        }
        return v0Var;
    }

    public C6812k m0(Gg.g gVar) {
        if (gVar == null) {
            F0(13);
        }
        C6812k kVar = this.f64876j;
        if (kVar == null) {
            F0(14);
        }
        return kVar;
    }

    public C6812k n0() {
        C6812k.b bVar = C6812k.b.f73949b;
        if (bVar == null) {
            F0(15);
        }
        return bVar;
    }

    public C5487e o0() {
        return null;
    }

    public List q() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(22);
        }
        return emptyList;
    }

    public E r() {
        E e10 = E.FINAL;
        if (e10 == null) {
            F0(19);
        }
        return e10;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    public Collection y() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(23);
        }
        return emptyList;
    }
}
