package u3;

import Sg.p;
import android.content.Context;
import kotlin.jvm.internal.C6496s;
import u3.u;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f26710a = new t();

    private t() {
    }

    public static final u.a a(Context context, Class cls, String str) {
        boolean z10;
        C6496s.h(context, "context");
        C6496s.h(cls, "klass");
        if (str == null || p.d0(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return new u.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object b(Class cls, String str) {
        String str2;
        C6496s.h(cls, "klass");
        C6496s.h(str, "suffix");
        Package packageR = cls.getPackage();
        C6496s.e(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C6496s.e(canonicalName);
        C6496s.g(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            C6496s.g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = p.C(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            C6496s.f(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final u.a c(Context context, Class cls) {
        C6496s.h(context, "context");
        C6496s.h(cls, "klass");
        return new u.a(context, cls, (String) null);
    }
}
