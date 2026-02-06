package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import java.util.List;
import je.C5054c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import sf.C6714a;
import yf.C6787a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001CB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH ¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H ¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H ¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-H ¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H ¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n03H\u0000¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0019H ¢\u0006\u0004\b7\u00108J-\u0010;\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0004¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010B¨\u0006D"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "name", "", "value", "Llf/M;", "setBoolProperty", "(Ljava/lang/String;Z)V", "", "setDoubleProperty", "(Ljava/lang/String;D)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "setJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;)V", "setJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "unsetProperty", "(Ljava/lang/String;)V", "", "options", "defineBoolProperty", "(Ljava/lang/String;ZI)V", "defineDoubleProperty", "(Ljava/lang/String;DI)V", "defineStringProperty", "(Ljava/lang/String;Ljava/lang/String;I)V", "defineJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;I)V", "defineJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;I)V", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "deallocator", "defineNativeDeallocator", "(Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "hasProperty", "(Ljava/lang/String;)Z", "getProperty", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "", "getPropertyNames", "()[Ljava/lang/String;", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "createWeak", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lkotlin/Function0;", "d", "(Lyf/a;)V", "size", "setExternalMemoryPressure", "(I)V", "", "Lexpo/modules/kotlin/jni/JavaScriptObject$a;", "f", "(Ljava/lang/String;ILjava/util/List;)V", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "finalize", "()V", "b", "Lcom/facebook/jni/HybridData;", "a", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class JavaScriptObject implements Destructible {
    private final HybridData mHybridData;

    public enum a {
        Configurable(1),
        Enumerable(2),
        Writable(4);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f60442a;

        static {
            a[] a10;
            f60441f = C6714a.a(a10);
        }

        private a(int i10) {
            this.f60442a = i10;
        }

        public final int b() {
            return this.f60442a;
        }
    }

    public JavaScriptObject(HybridData hybridData) {
        C6496s.h(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    private final native void defineBoolProperty(String str, boolean z10, int i10);

    private final native void defineDoubleProperty(String str, double d10, int i10);

    private final native void defineJSObjectProperty(String str, JavaScriptObject javaScriptObject, int i10);

    private final native void defineJSValueProperty(String str, JavaScriptValue javaScriptValue, int i10);

    private final native void defineNativeDeallocator(JNIFunctionBody jNIFunctionBody);

    private final native void defineStringProperty(String str, String str2, int i10);

    /* access modifiers changed from: private */
    public static final C6514M e(C6787a aVar, Object[] objArr) {
        C6496s.h(objArr, "it");
        aVar.invoke();
        return C6514M.f71813a;
    }

    public static /* synthetic */ void h(JavaScriptObject javaScriptObject, String str, int i10, List list, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = C6565s.n();
            }
            javaScriptObject.f(str, i10, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
    }

    public static /* synthetic */ void i(JavaScriptObject javaScriptObject, String str, String str2, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                list = C6565s.n();
            }
            javaScriptObject.g(str, str2, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
    }

    private final native void setBoolProperty(String str, boolean z10);

    private final native void setDoubleProperty(String str, double d10);

    private final native void setJSObjectProperty(String str, JavaScriptObject javaScriptObject);

    private final native void setJSValueProperty(String str, JavaScriptValue javaScriptValue);

    private final native void setStringProperty(String str, String str2);

    private final native void unsetProperty(String str);

    public void b() {
        this.mHybridData.resetNative();
    }

    public final native JavaScriptWeakObject createWeak();

    public final void d(C6787a aVar) {
        C6496s.h(aVar, "deallocator");
        defineNativeDeallocator(new C5054c(aVar));
    }

    public final void f(String str, int i10, List list) {
        C6496s.h(str, "name");
        C6496s.h(list, "options");
        defineDoubleProperty(str, (double) i10, a.b(list));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public final void g(String str, String str2, List list) {
        C6496s.h(str, "name");
        C6496s.h(list, "options");
        defineStringProperty(str, str2, a.b(list));
    }

    public final native JavaScriptValue getProperty(String str);

    public final native String[] getPropertyNames();

    public final native boolean hasProperty(String str);

    public final native void setExternalMemoryPressure(int i10);
}
