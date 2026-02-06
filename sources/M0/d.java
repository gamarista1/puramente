package M0;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import x0.C2891d;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f4290a = new HashMap();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2891d f4291a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4292b;

        public a(C2891d dVar, int i10) {
            this.f4291a = dVar;
            this.f4292b = i10;
        }

        public final int a() {
            return this.f4292b;
        }

        public final C2891d b() {
            return this.f4291a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f4291a, aVar.f4291a) && this.f4292b == aVar.f4292b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f4291a.hashCode() * 31) + Integer.hashCode(this.f4292b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f4291a + ", configFlags=" + this.f4292b + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f4293a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4294b;

        public b(Resources.Theme theme, int i10) {
            this.f4293a = theme;
            this.f4294b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(this.f4293a, bVar.f4293a) && this.f4294b == bVar.f4294b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f4293a.hashCode() * 31) + Integer.hashCode(this.f4294b);
        }

        public String toString() {
            return "Key(theme=" + this.f4293a + ", id=" + this.f4294b + ')';
        }
    }

    public final void a() {
        this.f4290a.clear();
    }

    public final a b(b bVar) {
        WeakReference weakReference = (WeakReference) this.f4290a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator it = this.f4290a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        this.f4290a.put(bVar, new WeakReference(aVar));
    }
}
