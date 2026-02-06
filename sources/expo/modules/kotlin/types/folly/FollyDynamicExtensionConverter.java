package expo.modules.kotlin.types.folly;

import Sg.p;
import android.util.ArrayMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;", "", "<init>", "()V", "a", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FollyDynamicExtensionConverter {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60460a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayMap f60461b = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static int f60462c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized Object get(String str) {
            String substring;
            C6496s.h(str, "payload");
            if (p.J(str, "__expo_dynamic_extension__#", false, 2, (Object) null)) {
                substring = str.substring(27);
                C6496s.g(substring, "substring(...)");
            } else {
                throw new re.a();
            }
            return FollyDynamicExtensionConverter.f60461b.remove(Integer.valueOf(Integer.parseInt(substring)));
        }

        public final synchronized String put(Object obj) {
            int b10;
            C6496s.h(obj, "any");
            b10 = FollyDynamicExtensionConverter.f60462c;
            FollyDynamicExtensionConverter.f60462c = b10 + 1;
            FollyDynamicExtensionConverter.f60461b.put(Integer.valueOf(b10), obj);
            return "__expo_dynamic_extension__#" + b10;
        }

        private a() {
        }
    }

    public static final synchronized Object get(String str) {
        Object obj;
        synchronized (FollyDynamicExtensionConverter.class) {
            obj = f60460a.get(str);
        }
        return obj;
    }

    public static final synchronized String put(Object obj) {
        String put;
        synchronized (FollyDynamicExtensionConverter.class) {
            put = f60460a.put(obj);
        }
        return put;
    }
}
