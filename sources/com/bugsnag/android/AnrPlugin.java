package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import com.amazon.a.a.o.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H ¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\n\u001a\u00020\u0006H ¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/i1;", "<init>", "()V", "", "unwindFunction", "Llf/M;", "setUnwindFunction", "(J)V", "enableAnrReporting", "disableAnrReporting", "", "clz", "Ljava/lang/Class;", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "initNativePlugin", "Lcom/bugsnag/android/A;", "client", "performOneTimeSetup", "(Lcom/bugsnag/android/A;)V", "", "Lcom/bugsnag/android/NativeStackframe;", "nativeTrace", "notifyAnrDetected", "(Ljava/util/List;)V", "load", "unload", "Lcom/bugsnag/android/R0;", "libraryLoader", "Lcom/bugsnag/android/R0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/A;", "Lcom/bugsnag/android/c;", "collector", "Lcom/bugsnag/android/c;", "Companion", "a", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnrPlugin implements C3245i1 {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private A client;
    private final C3225c collector = new C3225c();
    private final R0 libraryLoader = new R0();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(StackTraceElement[] stackTraceElementArr) {
            if (stackTraceElementArr.length == 0) {
                return false;
            }
            return ((StackTraceElement) C6559l.b0(stackTraceElementArr)).isNativeMethod();
        }

        private a() {
        }
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    private final void initNativePlugin() {
        enableAnrReporting();
        A a10 = this.client;
        if (a10 == null) {
            C6496s.v("client");
            a10 = null;
        }
        a10.f38381q.d("Initialised ANR Plugin");
    }

    /* access modifiers changed from: private */
    /* renamed from: load$lambda-0  reason: not valid java name */
    public static final void m15load$lambda0(AnrPlugin anrPlugin) {
        anrPlugin.initNativePlugin();
    }

    private final Class<?> loadClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> list) {
        Object obj;
        A a10 = null;
        try {
            A a11 = this.client;
            if (a11 == null) {
                C6496s.v("client");
                a11 = null;
            }
            if (!a11.f38365a.N(ANR_ERROR_CLASS)) {
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                boolean a12 = Companion.a(stackTrace);
                RuntimeException runtimeException = new RuntimeException();
                runtimeException.setStackTrace(stackTrace);
                A a13 = this.client;
                if (a13 == null) {
                    C6496s.v("client");
                    a13 = null;
                }
                C3262o0 createEvent = NativeInterface.createEvent(runtimeException, a13, q1.h("anrError"));
                C3250k0 k0Var = (C3250k0) createEvent.h().get(0);
                k0Var.g(ANR_ERROR_CLASS);
                k0Var.h(ANR_ERROR_MSG);
                if (a12) {
                    Iterable<NativeStackframe> iterable = list;
                    ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                    for (NativeStackframe s1Var : iterable) {
                        arrayList.add(new s1(s1Var));
                    }
                    k0Var.d().addAll(0, arrayList);
                    Iterator it = createEvent.l().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((B1) obj).a()) {
                            break;
                        }
                    }
                    B1 b12 = (B1) obj;
                    if (b12 != null) {
                        List d10 = b12.d();
                        if (d10 != null) {
                            d10.addAll(0, arrayList);
                        }
                    }
                }
                C3225c cVar = this.collector;
                A a14 = this.client;
                if (a14 == null) {
                    C6496s.v("client");
                    a14 = null;
                }
                cVar.d(a14, createEvent);
            }
        } catch (Exception e10) {
            A a15 = this.client;
            if (a15 == null) {
                C6496s.v("client");
            } else {
                a10 = a15;
            }
            a10.f38381q.c("Internal error reporting ANR", e10);
        }
    }

    private final void performOneTimeSetup(A a10) {
        Class<?> loadClass;
        C3245i1 x10;
        if (this.libraryLoader.c("bugsnag-plugin-android-anr", a10, new C3228d()) && (loadClass = loadClass("com.bugsnag.android.NdkPlugin")) != null && (x10 = a10.x(loadClass)) != null) {
            Object invoke = x10.getClass().getMethod("getSignalUnwindStackFunction", (Class[]) null).invoke(x10, (Object[]) null);
            if (invoke != null) {
                setUnwindFunction(((Long) invoke).longValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-1  reason: not valid java name */
    public static final boolean m16performOneTimeSetup$lambda1(C3262o0 o0Var) {
        C3250k0 k0Var = (C3250k0) o0Var.h().get(0);
        o0Var.b("LinkError", "errorClass", k0Var.b());
        o0Var.b("LinkError", b.f37483f, k0Var.c());
        k0Var.g("AnrLinkError");
        k0Var.h(LOAD_ERR_MSG);
        return true;
    }

    private final native void setUnwindFunction(long j10);

    public void load(A a10) {
        this.client = a10;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(a10);
        }
        if (this.libraryLoader.a()) {
            Looper mainLooper = Looper.getMainLooper();
            if (C6496s.c(Looper.myLooper(), mainLooper)) {
                initNativePlugin();
            } else {
                new Handler(mainLooper).postAtFrontOfQueue(new C3231e(this));
            }
        } else {
            a10.f38381q.f(LOAD_ERR_MSG);
        }
    }

    public void unload() {
        if (this.libraryLoader.a()) {
            disableAnrReporting();
        }
    }
}
