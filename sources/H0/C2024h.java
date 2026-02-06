package h0;

import h0.C2023g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mf.C6565s;
import mf.O;
import yf.C6787a;
import yf.C6798l;

/* renamed from: h0.h  reason: case insensitive filesystem */
final class C2024h implements C2023g {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f21137a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f21138b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map f21139c;

    /* renamed from: h0.h$a */
    public static final class a implements C2023g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2024h f21140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f21142c;

        a(C2024h hVar, String str, C6787a aVar) {
            this.f21140a = hVar;
            this.f21141b = str;
            this.f21142c = aVar;
        }

        public void a() {
            List list = (List) this.f21140a.f21139c.remove(this.f21141b);
            if (list != null) {
                list.remove(this.f21142c);
            }
            if (list != null && !list.isEmpty()) {
                this.f21140a.f21139c.put(this.f21141b, list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = mf.O.B(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2024h(java.util.Map r1, yf.C6798l r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f21137a = r2
            if (r1 == 0) goto L_0x000d
            java.util.Map r1 = mf.O.B(r1)
            if (r1 != 0) goto L_0x0012
        L_0x000d:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L_0x0012:
            r0.f21138b = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f21139c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C2024h.<init>(java.util.Map, yf.l):void");
    }

    public boolean a(Object obj) {
        return ((Boolean) this.f21137a.invoke(obj)).booleanValue();
    }

    public C2023g.a b(String str, C6787a aVar) {
        if (!C2025i.c(str)) {
            Map map = this.f21139c;
            Object obj = map.get(str);
            if (obj == null) {
                obj = new ArrayList();
                map.put(str, obj);
            }
            ((List) obj).add(aVar);
            return new a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    public Map e() {
        Map B10 = O.B(this.f21138b);
        for (Map.Entry entry : this.f21139c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int i10 = 0;
            if (list.size() == 1) {
                Object invoke = ((C6787a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    B10.put(str, C6565s.h(invoke));
                } else {
                    throw new IllegalStateException(C2018b.b(invoke).toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i10 < size) {
                    Object invoke2 = ((C6787a) list.get(i10)).invoke();
                    if (invoke2 == null || a(invoke2)) {
                        arrayList.add(invoke2);
                        i10++;
                    } else {
                        throw new IllegalStateException(C2018b.b(invoke2).toString());
                    }
                }
                B10.put(str, arrayList);
            }
        }
        return B10;
    }

    public Object f(String str) {
        List list = (List) this.f21138b.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.f21138b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
