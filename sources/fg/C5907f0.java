package fg;

import Ef.m;
import gg.C5946F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6559l;
import mf.C6565s;
import mf.I;
import mf.O;
import wg.C6769e;
import yf.C6798l;

/* renamed from: fg.f0  reason: case insensitive filesystem */
final class C5907f0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f67635a = new LinkedHashMap();

    /* renamed from: fg.f0$a */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f67636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5907f0 f67637b;

        /* renamed from: fg.f0$a$a  reason: collision with other inner class name */
        public final class C0995a {

            /* renamed from: a  reason: collision with root package name */
            private final String f67638a;

            /* renamed from: b  reason: collision with root package name */
            private final String f67639b;

            /* renamed from: c  reason: collision with root package name */
            private final List f67640c = new ArrayList();

            /* renamed from: d  reason: collision with root package name */
            private Pair f67641d = C6502A.a("V", (Object) null);

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f67642e;

            public C0995a(a aVar, String str, String str2) {
                C6496s.h(str, "functionName");
                this.f67642e = aVar;
                this.f67638a = str;
                this.f67639b = str2;
            }

            public final Pair a() {
                C5946F f10 = C5946F.f67716a;
                String c10 = this.f67642e.c();
                String str = this.f67638a;
                Iterable<Pair> iterable = this.f67640c;
                ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (Pair c11 : iterable) {
                    arrayList.add((String) c11.c());
                }
                String l10 = f10.l(c10, f10.j(str, arrayList, (String) this.f67641d.c()));
                C5915j0 j0Var = (C5915j0) this.f67641d.d();
                Iterable<Pair> iterable2 = this.f67640c;
                ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
                for (Pair d10 : iterable2) {
                    arrayList2.add((C5915j0) d10.d());
                }
                return C6502A.a(l10, new C5894Y(j0Var, arrayList2, this.f67639b));
            }

            public final void b(String str, C5910h... hVarArr) {
                C5915j0 j0Var;
                C6496s.h(str, "type");
                C6496s.h(hVarArr, "qualifiers");
                Collection collection = this.f67640c;
                if (hVarArr.length == 0) {
                    j0Var = null;
                } else {
                    Iterable<I> A12 = C6559l.A1(hVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(A12, 10)), 16));
                    for (I i10 : A12) {
                        linkedHashMap.put(Integer.valueOf(i10.c()), (C5910h) i10.d());
                    }
                    j0Var = new C5915j0(linkedHashMap);
                }
                collection.add(C6502A.a(str, j0Var));
            }

            public final void c(String str, C5910h... hVarArr) {
                C6496s.h(str, "type");
                C6496s.h(hVarArr, "qualifiers");
                Iterable<I> A12 = C6559l.A1(hVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(A12, 10)), 16));
                for (I i10 : A12) {
                    linkedHashMap.put(Integer.valueOf(i10.c()), (C5910h) i10.d());
                }
                this.f67641d = C6502A.a(str, new C5915j0(linkedHashMap));
            }

            public final void d(C6769e eVar) {
                C6496s.h(eVar, "type");
                String e10 = eVar.e();
                C6496s.g(e10, "getDesc(...)");
                this.f67641d = C6502A.a(e10, (Object) null);
            }
        }

        public a(C5907f0 f0Var, String str) {
            C6496s.h(str, "className");
            this.f67637b = f0Var;
            this.f67636a = str;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, C6798l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(String str, String str2, C6798l lVar) {
            C6496s.h(str, "name");
            C6496s.h(lVar, "block");
            Map a10 = this.f67637b.f67635a;
            C0995a aVar = new C0995a(this, str, str2);
            lVar.invoke(aVar);
            Pair a11 = aVar.a();
            a10.put(a11.c(), a11.d());
        }

        public final String c() {
            return this.f67636a;
        }
    }

    public final Map b() {
        return this.f67635a;
    }
}
