package expo.modules.kotlin.jni;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils;", "", "a", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JNIUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60431a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(JavaScriptModuleObject javaScriptModuleObject, JSIContext jSIContext, String str, Map map) {
            JNIUtils.emitEvent(javaScriptModuleObject, jSIContext, str, (Map<String, ? extends Object>) map);
        }

        public final void b(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr) {
            JNIUtils.emitEvent(javaScriptWeakObject, jSIContext, str, objArr);
        }

        private a() {
        }
    }

    public static final native void emitEvent(JavaScriptModuleObject javaScriptModuleObject, JSIContext jSIContext, String str, Map<String, ? extends Object> map);

    public static final native void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr);

    public static final native void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr);
}
