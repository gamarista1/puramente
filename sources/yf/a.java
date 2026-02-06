package Yf;

import Bg.C5336w;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.t0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import lf.C6514M;
import ng.f;
import rg.C6695m;
import rg.C6697o;
import yf.C6798l;

public abstract class a {

    /* renamed from: Yf.a$a  reason: collision with other inner class name */
    static class C0978a extends C6695m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5336w f66732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f66733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f66734c;

        /* renamed from: Yf.a$a$a  reason: collision with other inner class name */
        class C0979a implements C6798l {
            C0979a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }

            /* renamed from: b */
            public C6514M invoke(C5484b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C0978a.this.f66732a.a(bVar);
                return C6514M.f71813a;
            }
        }

        C0978a(C5336w wVar, Set set, boolean z10) {
            this.f66732a = wVar;
            this.f66733b = set;
            this.f66734c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(C5484b bVar) {
            if (bVar == null) {
                f(0);
            }
            C6697o.K(bVar, new C0979a());
            this.f66733b.add(bVar);
        }

        public void d(C5484b bVar, Collection collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f66734c || bVar.h() == C5484b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        public void e(C5484b bVar, C5484b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 18) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 18) {
            th2 = new IllegalArgumentException(format);
        } else {
            th2 = new IllegalStateException(format);
        }
        throw th2;
    }

    public static t0 b(f fVar, C5487e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection j10 = eVar.j();
        if (j10.size() != 1) {
            return null;
        }
        for (t0 t0Var : ((C5486d) j10.iterator().next()).k()) {
            if (t0Var.getName().equals(fVar)) {
                return t0Var;
            }
        }
        return null;
    }

    private static Collection c(f fVar, Collection collection, Collection collection2, C5487e eVar, C5336w wVar, C6697o oVar, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (wVar == null) {
            a(16);
        }
        if (oVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.v(fVar, collection, collection2, eVar, new C0978a(wVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static Collection d(f fVar, Collection collection, Collection collection2, C5487e eVar, C5336w wVar, C6697o oVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (wVar == null) {
            a(4);
        }
        if (oVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, false);
    }

    public static Collection e(f fVar, Collection collection, Collection collection2, C5487e eVar, C5336w wVar, C6697o oVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (wVar == null) {
            a(10);
        }
        if (oVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, true);
    }
}
