package we;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.views.l;
import j8.m;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import qe.C5155b;
import qe.C5157d;
import yf.p;
import yf.q;

public abstract class b {

    public static final class a implements p {
        public final void a(View view, Integer num) {
            C6496s.h(view, "view");
            C3400a.o(view, num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Integer) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: we.b$b  reason: collision with other inner class name */
    public static final class C0915b implements q {
        public final void a(View view, int i10, Integer num) {
            C6496s.h(view, "view");
            C3400a.q(view, m.f44917a.a(i10), num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Integer) obj3);
            return C6514M.f71813a;
        }
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f62126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f62127b;

        public c(q qVar, Object obj) {
            this.f62126a = qVar;
            this.f62127b = obj;
        }

        public final void a(View view, Object obj) {
            C6496s.h(view, "view");
            this.f62126a.invoke(view, this.f62127b, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return C6514M.f71813a;
        }
    }

    public static final class d implements q {
        public final void a(View view, int i10, Float f10) {
            C3430x xVar;
            C6496s.h(view, "view");
            Object obj = j8.d.b().get(i10);
            if (f10 != null) {
                xVar = new C3430x(f10.floatValue(), C3431y.POINT);
            } else {
                xVar = null;
            }
            C3400a.r(view, (j8.d) obj, xVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return C6514M.f71813a;
        }
    }

    public static final class e implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f62128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62129b;

        public e(q qVar, int i10) {
            this.f62128a = qVar;
            this.f62129b = i10;
        }

        public final void a(View view, Object obj) {
            C6496s.h(view, "view");
            this.f62128a.invoke(view, Integer.valueOf(this.f62129b), obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return C6514M.f71813a;
        }
    }

    public static final class f implements p {
        public final void a(View view, String str) {
            j8.f fVar;
            C6496s.h(view, "view");
            if (str != null) {
                fVar = j8.f.f44875a.a(str);
            } else {
                fVar = null;
            }
            C3400a.s(view, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (String) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class g implements q {
        public final void a(View view, int i10, Float f10) {
            float f11;
            C6496s.h(view, "view");
            m mVar = (m) m.b().get(i10);
            if (f10 != null) {
                f11 = f10.floatValue();
            } else {
                f11 = Float.NaN;
            }
            C3400a.t(view, mVar, Float.valueOf(f11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return C6514M.f71813a;
        }
    }

    public static final class h implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f62130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62131b;

        public h(q qVar, int i10) {
            this.f62130a = qVar;
            this.f62131b = i10;
        }

        public final void a(View view, Object obj) {
            C6496s.h(view, "view");
            this.f62130a.invoke(view, Integer.valueOf(this.f62131b), obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return C6514M.f71813a;
        }
    }

    public static final class i implements p {
        public final void a(View view, ReadableArray readableArray) {
            C6496s.h(view, "view");
            if (readableArray == null) {
                C3400a.v(view, C6565s.n());
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                Context context = view.getContext();
                C6496s.g(context, "getContext(...)");
                j8.g a10 = xe.a.a(map, context);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            C3400a.v(view, arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (ReadableArray) obj2);
            return C6514M.f71813a;
        }
    }

    private static final void a(l lVar) {
        a aVar = new a();
        Map f10 = lVar.f();
        C5157d dVar = C5157d.f61437a;
        Class<Integer> cls = Integer.class;
        C5155b bVar = (C5155b) dVar.a().get(new Pair(O.b(cls), Boolean.TRUE));
        if (bVar == null) {
            bVar = new C5155b(new qe.O(O.b(cls), true, a.f62125a));
        }
        f10.put("backgroundColor", new expo.modules.kotlin.views.c("backgroundColor", bVar, aVar));
    }

    private static final void b(l lVar) {
        Pair[] pairArr = {C6502A.a("borderColor", 8), C6502A.a("borderLeftColor", 0), C6502A.a("borderRightColor", 2), C6502A.a("borderTopColor", 1), C6502A.a("borderBottomColor", 3), C6502A.a("borderStartColor", 4), C6502A.a("borderEndColor", 5), C6502A.a("borderBlockColor", 9), C6502A.a("borderBlockEndColor", 10), C6502A.a("borderBlockStartColor", 11)};
        C0915b bVar = new C0915b();
        for (int i10 = 0; i10 < 10; i10++) {
            Pair pair = pairArr[i10];
            String str = (String) pair.a();
            c cVar = new c(bVar, pair.b());
            Map f10 = lVar.f();
            C5157d dVar = C5157d.f61437a;
            Class<Integer> cls = Integer.class;
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(O.b(cls), Boolean.TRUE));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(O.b(cls), true, c.f62132a));
            }
            f10.put(str, new expo.modules.kotlin.views.c(str, bVar2, cVar));
        }
    }

    private static final void c(l lVar) {
        String[] strArr = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        d dVar = new d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 13) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            e eVar = new e(dVar, i11);
            Map f10 = lVar.f();
            Class<Float> cls = Float.class;
            C5155b bVar = (C5155b) C5157d.f61437a.a().get(new Pair(O.b(cls), Boolean.TRUE));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(O.b(cls), true, d.f62133a));
            }
            f10.put(str, new expo.modules.kotlin.views.c(str, bVar, eVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void d(l lVar) {
        f fVar = new f();
        Map f10 = lVar.f();
        C5157d dVar = C5157d.f61437a;
        Class<String> cls = String.class;
        C5155b bVar = (C5155b) dVar.a().get(new Pair(O.b(cls), Boolean.TRUE));
        if (bVar == null) {
            bVar = new C5155b(new qe.O(O.b(cls), true, e.f62134a));
        }
        f10.put("borderStyle", new expo.modules.kotlin.views.c("borderStyle", bVar, fVar));
    }

    private static final void e(l lVar) {
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        g gVar = new g();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 7) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            h hVar = new h(gVar, i11);
            Map f10 = lVar.f();
            Class<Float> cls = Float.class;
            C5155b bVar = (C5155b) C5157d.f61437a.a().get(new Pair(O.b(cls), Boolean.TRUE));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(O.b(cls), true, f.f62135a));
            }
            f10.put(str, new expo.modules.kotlin.views.c(str, bVar, hVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void f(l lVar) {
        i iVar = new i();
        Map f10 = lVar.f();
        C5157d dVar = C5157d.f61437a;
        Class<ReadableArray> cls = ReadableArray.class;
        C5155b bVar = (C5155b) dVar.a().get(new Pair(O.b(cls), Boolean.TRUE));
        if (bVar == null) {
            bVar = new C5155b(new qe.O(O.b(cls), true, g.f62136a));
        }
        f10.put("boxShadow", new expo.modules.kotlin.views.c("boxShadow", bVar, iVar));
    }

    public static final void g(l lVar) {
        C6496s.h(lVar, "<this>");
        b(lVar);
        e(lVar);
        c(lVar);
        d(lVar);
        a(lVar);
        f(lVar);
    }
}
