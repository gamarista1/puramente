package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.c;
import androidx.datastore.preferences.protobuf.C1749w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o  reason: case insensitive filesystem */
public class C1742o {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f16406b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Class f16407c = c();

    /* renamed from: d  reason: collision with root package name */
    private static volatile C1742o f16408d;

    /* renamed from: e  reason: collision with root package name */
    static final C1742o f16409e = new C1742o(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f16410a = Collections.emptyMap();

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f16411a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16412b;

        a(Object obj, int i10) {
            this.f16411a = obj;
            this.f16412b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16411a == aVar.f16411a && this.f16412b == aVar.f16412b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16411a) * 65535) + this.f16412b;
        }
    }

    C1742o(boolean z10) {
    }

    public static C1742o b() {
        C1742o oVar = f16408d;
        if (oVar == null) {
            synchronized (C1742o.class) {
                try {
                    oVar = f16408d;
                    if (oVar == null) {
                        if (f16406b) {
                            oVar = C1741n.a();
                        } else {
                            oVar = f16409e;
                        }
                        f16408d = oVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return oVar;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public C1749w.c a(O o10, int i10) {
        c.a(this.f16410a.get(new a(o10, i10)));
        return null;
    }
}
