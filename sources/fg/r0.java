package Fg;

import Mg.c;
import Mg.e;
import Mg.z;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;
import zf.C6828a;

public final class r0 extends e implements Iterable, C6828a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63046b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f63047c = new r0(C6565s.n());

    public static final class a extends z {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int b(ConcurrentHashMap concurrentHashMap, String str, C6798l lVar) {
            int i10;
            C6496s.h(concurrentHashMap, "<this>");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(lVar, "compute");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        i10 = num2.intValue();
                    } else {
                        Object invoke = lVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) invoke).intValue()));
                        i10 = ((Number) invoke).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public final r0 i(List list) {
            C6496s.h(list, "attributes");
            if (list.isEmpty()) {
                return j();
            }
            return new r0(list, (DefaultConstructorMarker) null);
        }

        public final r0 j() {
            return r0.f63047c;
        }

        private a() {
        }
    }

    public /* synthetic */ r0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* access modifiers changed from: protected */
    public z b() {
        return f63046b;
    }

    public final r0 r(r0 r0Var) {
        p0 p0Var;
        C6496s.h(r0Var, "other");
        if (isEmpty() && r0Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f63046b.g()) {
            int intValue2 = intValue.intValue();
            p0 p0Var2 = (p0) a().get(intValue2);
            p0 p0Var3 = (p0) r0Var.a().get(intValue2);
            if (p0Var2 != null) {
                p0Var = p0Var2.a(p0Var3);
            } else if (p0Var3 != null) {
                p0Var = p0Var3.a(p0Var2);
            } else {
                p0Var = null;
            }
            Pg.a.a(arrayList, p0Var);
        }
        return f63046b.i(arrayList);
    }

    public final boolean t(p0 p0Var) {
        C6496s.h(p0Var, "attribute");
        if (a().get(f63046b.d(p0Var.b())) != null) {
            return true;
        }
        return false;
    }

    public final r0 v(r0 r0Var) {
        p0 p0Var;
        C6496s.h(r0Var, "other");
        if (isEmpty() && r0Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f63046b.g()) {
            int intValue2 = intValue.intValue();
            p0 p0Var2 = (p0) a().get(intValue2);
            p0 p0Var3 = (p0) r0Var.a().get(intValue2);
            if (p0Var2 != null) {
                p0Var = p0Var2.c(p0Var3);
            } else if (p0Var3 != null) {
                p0Var = p0Var3.c(p0Var2);
            } else {
                p0Var = null;
            }
            Pg.a.a(arrayList, p0Var);
        }
        return f63046b.i(arrayList);
    }

    public final r0 x(p0 p0Var) {
        C6496s.h(p0Var, "attribute");
        if (t(p0Var)) {
            return this;
        }
        if (isEmpty()) {
            return new r0(p0Var);
        }
        return f63046b.i(C6565s.L0(C6565s.e1(this), p0Var));
    }

    public final r0 z(p0 p0Var) {
        C6496s.h(p0Var, "attribute");
        if (isEmpty()) {
            return this;
        }
        c a10 = a();
        ArrayList arrayList = new ArrayList();
        for (Object next : a10) {
            if (!C6496s.c((p0) next, p0Var)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == a().a()) {
            return this;
        }
        return f63046b.i(arrayList);
    }

    private r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            g(p0Var.b(), p0Var);
        }
    }

    private r0(p0 p0Var) {
        this(C6565s.e(p0Var));
    }
}
