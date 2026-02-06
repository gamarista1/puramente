package j3;

import j3.C2128E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;

/* renamed from: j3.F  reason: case insensitive filesystem */
public class C2129F {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22772b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map f22773c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f22774a = new LinkedHashMap();

    /* renamed from: j3.F$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            C6496s.h(cls, "navigatorClass");
            String str = (String) C2129F.f22773c.get(cls);
            if (str == null) {
                C2128E.b bVar = (C2128E.b) cls.getAnnotation(C2128E.b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (b(str)) {
                    C2129F.f22773c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            C6496s.e(str);
            return str;
        }

        public final boolean b(String str) {
            if (str == null || str.length() <= 0) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    public final C2128E b(C2128E e10) {
        C6496s.h(e10, "navigator");
        return c(f22772b.a(e10.getClass()), e10);
    }

    public C2128E c(String str, C2128E e10) {
        C6496s.h(str, "name");
        C6496s.h(e10, "navigator");
        if (f22772b.b(str)) {
            C2128E e11 = (C2128E) this.f22774a.get(str);
            if (C6496s.c(e11, e10)) {
                return e10;
            }
            boolean z10 = false;
            if (e11 != null && e11.c()) {
                z10 = true;
            }
            if (z10) {
                throw new IllegalStateException(("Navigator " + e10 + " is replacing an already attached " + e11).toString());
            } else if (!e10.c()) {
                return (C2128E) this.f22774a.put(str, e10);
            } else {
                throw new IllegalStateException(("Navigator " + e10 + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
    }

    public final C2128E d(Class cls) {
        C6496s.h(cls, "navigatorClass");
        return e(f22772b.a(cls));
    }

    public C2128E e(String str) {
        C6496s.h(str, "name");
        if (f22772b.b(str)) {
            C2128E e10 = (C2128E) this.f22774a.get(str);
            if (e10 != null) {
                return e10;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final Map f() {
        return O.y(this.f22774a);
    }
}
