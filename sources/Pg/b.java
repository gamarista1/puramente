package Pg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import yf.C6798l;

public abstract class b {

    static class a extends C0948b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f64687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean[] f64688b;

        a(C6798l lVar, boolean[] zArr) {
            this.f64687a = lVar;
            this.f64688b = zArr;
        }

        public boolean c(Object obj) {
            if (((Boolean) this.f64687a.invoke(obj)).booleanValue()) {
                this.f64688b[0] = true;
            }
            return !this.f64688b[0];
        }

        /* renamed from: d */
        public Boolean a() {
            return Boolean.valueOf(this.f64688b[0]);
        }
    }

    public interface c {
        Iterable a(Object obj);
    }

    public interface d {
        Object a();

        void b(Object obj);

        boolean c(Object obj);
    }

    public interface e {
        boolean a(Object obj);
    }

    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Set f64689a;

        public f() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        public boolean a(Object obj) {
            return this.f64689a.add(obj);
        }

        public f(Set set) {
            if (set == null) {
                b(0);
            }
            this.f64689a = set;
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case StdKeyDeserializer.TYPE_CLASS:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, d dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new f(), dVar);
    }

    public static Object c(Collection collection, c cVar, e eVar, d dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        for (Object d10 : collection) {
            d(d10, cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static void d(Object obj, c cVar, e eVar, d dVar) {
        if (obj == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(obj) && dVar.c(obj)) {
            for (Object d10 : cVar.a(obj)) {
                d(d10, cVar, eVar, dVar);
            }
            dVar.b(obj);
        }
    }

    public static Boolean e(Collection collection, c cVar, C6798l lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(lVar, new boolean[1]));
    }

    /* renamed from: Pg.b$b  reason: collision with other inner class name */
    public static abstract class C0948b implements d {
        public void b(Object obj) {
        }
    }
}
