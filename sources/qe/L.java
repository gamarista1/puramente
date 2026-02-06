package qe;

import Tg.d;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import ne.c;
import pe.i;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    public static final L f61392a = new L();

    public interface a {
        WritableArray a();

        WritableMap b();
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61393a = new b();

        private b() {
        }

        public WritableArray a() {
            WritableArray createArray = Arguments.createArray();
            C6496s.g(createArray, "createArray(...)");
            return createArray;
        }

        public WritableMap b() {
            WritableMap createMap = Arguments.createMap();
            C6496s.g(createMap, "createMap(...)");
            return createMap;
        }
    }

    private L() {
    }

    public static /* synthetic */ Object b(L l10, Object obj, a aVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f61393a;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return l10.a(obj, aVar, z10);
    }

    public final Object a(Object obj, a aVar, boolean z10) {
        C6496s.h(aVar, "containerProvider");
        if (obj == null || (obj instanceof C6514M)) {
            return null;
        }
        if (obj instanceof Bundle) {
            return M.j((Bundle) obj, aVar);
        }
        if (obj instanceof Object[]) {
            return M.h((Object[]) obj, aVar);
        }
        if ((obj instanceof int[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof long[])) {
            return obj;
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.f60460a.put(obj);
        }
        if (obj instanceof Map) {
            if (z10) {
                return M.t((Map) obj);
            }
            return M.k((Map) obj, aVar);
        } else if (obj instanceof Enum) {
            return M.m((Enum) obj);
        } else {
            if (obj instanceof c) {
                return M.l((c) obj, aVar);
            }
            if (obj instanceof URI) {
                return M.p((URI) obj);
            }
            if (obj instanceof URL) {
                return M.q((URL) obj);
            }
            if (obj instanceof Uri) {
                return M.n((Uri) obj);
            }
            if (obj instanceof File) {
                return M.o((File) obj);
            }
            if (obj instanceof Pair) {
                return M.d((Pair) obj, aVar);
            }
            if (obj instanceof Long) {
                return Double.valueOf((double) ((Number) obj).longValue());
            }
            if (obj instanceof Tg.a) {
                return Double.valueOf(Tg.a.Q(((Tg.a) obj).X(), d.SECONDS));
            }
            if (obj instanceof i) {
                return ((i) obj).b();
            }
            if (!(obj instanceof Collection)) {
                return obj;
            }
            if (z10) {
                return M.r((Collection) obj);
            }
            return M.c((Collection) obj, aVar);
        }
    }

    public final Object c(Object obj, a aVar) {
        C6496s.h(aVar, "containerProvider");
        if (obj == null || (obj instanceof C6514M)) {
            return null;
        }
        if (obj instanceof Bundle) {
            return M.j((Bundle) obj, aVar);
        }
        if (obj instanceof Object[]) {
            return M.h((Object[]) obj, aVar);
        }
        if (obj instanceof int[]) {
            return M.g((int[]) obj, aVar);
        }
        if (obj instanceof float[]) {
            return M.f((float[]) obj, aVar);
        }
        if (obj instanceof double[]) {
            return M.e((double[]) obj, aVar);
        }
        if (obj instanceof boolean[]) {
            return M.i((boolean[]) obj, aVar);
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.f60460a.put(obj);
        }
        if (obj instanceof Map) {
            return M.k((Map) obj, aVar);
        }
        if (obj instanceof Enum) {
            return M.m((Enum) obj);
        }
        if (obj instanceof c) {
            return M.l((c) obj, aVar);
        }
        if (obj instanceof URI) {
            return M.p((URI) obj);
        }
        if (obj instanceof URL) {
            return M.q((URL) obj);
        }
        if (obj instanceof Uri) {
            return M.n((Uri) obj);
        }
        if (obj instanceof File) {
            return M.o((File) obj);
        }
        if (obj instanceof Pair) {
            return M.d((Pair) obj, aVar);
        }
        if (obj instanceof Long) {
            return Double.valueOf((double) ((Number) obj).longValue());
        }
        if (obj instanceof Tg.a) {
            return Double.valueOf(Tg.a.Q(((Tg.a) obj).X(), d.SECONDS));
        }
        if (obj instanceof i) {
            return ((i) obj).b();
        }
        if (obj instanceof Collection) {
            return M.c((Collection) obj, aVar);
        }
        return obj;
    }
}
