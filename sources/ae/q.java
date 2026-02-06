package ae;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.jni.JavaCallback;
import expo.modules.kotlin.jni.PromiseImpl;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class q {

    public static final class a implements Promise {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f53644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f53645b;

        a(C6798l lVar, p pVar) {
            this.f53644a = lVar;
            this.f53645b = pVar;
        }

        public void reject(String str, String str2) {
            C6496s.h(str, "code");
            this.f53645b.reject(str, str2, (Throwable) null);
        }

        public void resolve(Object obj) {
            this.f53644a.invoke(obj);
        }

        public void reject(String str, Throwable th2) {
            C6496s.h(str, "code");
            this.f53645b.reject(str, (String) null, th2);
        }

        public void reject(String str, String str2, Throwable th2) {
            C6496s.h(str, "code");
            this.f53645b.reject(str, str2, th2);
        }

        public void reject(Throwable th2) {
            C6496s.h(th2, "throwable");
            this.f53645b.reject("UnknownCode", (String) null, th2);
        }

        public void reject(Throwable th2, WritableMap writableMap) {
            C6496s.h(th2, "throwable");
            C6496s.h(writableMap, "userInfo");
            this.f53645b.reject("UnknownCode", (String) null, th2);
        }

        public void reject(String str, WritableMap writableMap) {
            C6496s.h(str, "code");
            C6496s.h(writableMap, "userInfo");
            this.f53645b.reject(str, (String) null, (Throwable) null);
        }

        public void reject(String str, Throwable th2, WritableMap writableMap) {
            C6496s.h(str, "code");
            C6496s.h(writableMap, "userInfo");
            this.f53645b.reject(str, (String) null, th2);
        }

        public void reject(String str, String str2, WritableMap writableMap) {
            C6496s.h(str, "code");
            C6496s.h(writableMap, "userInfo");
            this.f53645b.reject(str, str2, (Throwable) null);
        }

        public void reject(String str, String str2, Throwable th2, WritableMap writableMap) {
            p pVar = this.f53645b;
            if (str == null) {
                str = "UnknownCode";
            }
            pVar.reject(str, str2, th2);
        }

        public void reject(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.f53645b.reject("UnknownCode", str, (Throwable) null);
        }
    }

    /* synthetic */ class b extends C6494p implements C6798l {
        b(Object obj) {
            super(1, obj, JavaCallback.class, "invoke", "invoke(Ljava/lang/Object;)V", 0);
        }

        public final void invoke(Object obj) {
            ((JavaCallback) this.receiver).f(obj);
        }
    }

    /* synthetic */ class c extends C6494p implements C6798l {
        c(Object obj) {
            super(1, obj, p.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
        }

        public final void invoke(Object obj) {
            ((p) this.receiver).resolve(obj);
        }
    }

    public static final Promise a(p pVar) {
        C6798l lVar;
        C6496s.h(pVar, "<this>");
        if (pVar instanceof PromiseImpl) {
            lVar = new b(((PromiseImpl) pVar).h());
        } else {
            lVar = new c(pVar);
        }
        return new a(lVar, pVar);
    }
}
