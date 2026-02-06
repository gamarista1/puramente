package t5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import t7.C4049a;

public final class S implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48188b = new a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f48189a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        public static final a f48190b = new a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a  reason: collision with root package name */
        private final HashMap f48191a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(HashMap hashMap) {
            C6496s.h(hashMap, "proxyEvents");
            this.f48191a = hashMap;
        }

        private final Object readResolve() {
            return new S(this.f48191a);
        }
    }

    public S() {
        this.f48189a = new HashMap();
    }

    private final Object writeReplace() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return new b(this.f48189a);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final void a(C4024a aVar, List list) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(aVar, "accessTokenAppIdPair");
                C6496s.h(list, "appEvents");
                if (!this.f48189a.containsKey(aVar)) {
                    this.f48189a.put(aVar, C6565s.h1(list));
                    return;
                }
                List list2 = (List) this.f48189a.get(aVar);
                if (list2 != null) {
                    list2.addAll(list);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final Set b() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Set entrySet = this.f48189a.entrySet();
            C6496s.g(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public S(HashMap hashMap) {
        C6496s.h(hashMap, "appEventMap");
        HashMap hashMap2 = new HashMap();
        this.f48189a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
