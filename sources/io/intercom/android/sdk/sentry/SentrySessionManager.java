package io.intercom.android.sdk.sentry;

import Qe.C5510a;
import Sg.p;
import We.C5632i0;
import We.C5643o;
import We.C5649r0;
import We.C5663y0;
import We.M0;
import We.i1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.c;
import ff.C5840A;
import ff.C5852f;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.PlatformIdentifierUtilKt;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0019*\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010\u0003J\u0015\u0010%\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/intercom/android/sdk/sentry/SentrySessionManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "isIntercomActivity", "(Landroid/app/Activity;)Z", "", "isIntercomError", "(Ljava/lang/Throwable;)Z", "redactStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "Ljava/lang/StackTraceElement;", "stackTrace", "getRedactedStacktrace", "([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "Lff/A;", "redact", "(Lff/A;)Lff/A;", "", "isFromAllowedPackage", "(Ljava/lang/String;)Z", "LWe/y0;", "redactThrowable", "(LWe/y0;)LWe/y0;", "redactSentryExceptions", "Landroid/content/Context;", "context", "applyIntercomMetadata", "(LWe/y0;Landroid/content/Context;)LWe/y0;", "Llf/M;", "registerSentry", "(Landroid/content/Context;)V", "closeSentry", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "LWe/i0;", "scope", "LWe/i0;", "LWe/r0;", "scopes", "LWe/r0;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SentrySessionManager {
    public static final int $stable = 8;
    public static final SentrySessionManager INSTANCE = new SentrySessionManager();
    private static C5632i0 scope;
    private static C5649r0 scopes;

    private SentrySessionManager() {
    }

    private final C5663y0 applyIntercomMetadata(C5663y0 y0Var, Context context) {
        String str = Build.MODEL;
        Pair a10 = C6502A.a("device", str);
        Map l10 = O.l(a10, C6502A.a("os", "Android " + Build.VERSION.RELEASE));
        C5852f fVar = new C5852f();
        fVar.c(str);
        fVar.a(Build.BRAND);
        fVar.b(Locale.getDefault().toString());
        if (Injector.isNotInitialised()) {
            y0Var.d(l10);
            y0Var.a().e(fVar);
            return y0Var;
        }
        y0Var.d(O.p(l10, O.l(C6502A.a("app_id", Injector.get().getAppIdentity().appId()), C6502A.a("customer_name", Injector.get().getAppConfigProvider().get().getName()), C6502A.a("package_name", context.getPackageName()), C6502A.a("sdk_type", PlatformIdentifierUtilKt.getPlatformIdentifier(context)))));
        y0Var.a().e(fVar);
        return y0Var;
    }

    private final StackTraceElement[] getRedactedStacktrace(StackTraceElement[] stackTraceElementArr) {
        List d10 = C6565s.d(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            SentrySessionManager sentrySessionManager = INSTANCE;
            String className = stackTraceElement.getClassName();
            C6496s.g(className, "getClassName(...)");
            if (sentrySessionManager.isFromAllowedPackage(className)) {
                d10.add(stackTraceElement);
            } else {
                d10.add(new StackTraceElement("[Non Intercom/OS method]", "[Non Intercom/OS method]", "[Non Intercom/OS method]", stackTraceElement.getLineNumber()));
            }
        }
        return (StackTraceElement[]) C6565s.a(d10).toArray(new StackTraceElement[0]);
    }

    private final boolean isFromAllowedPackage(String str) {
        for (String J10 : SentrySessionManagerKt.ALLOWED_PACKAGES) {
            if (p.J(str, J10, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isIntercomActivity(Activity activity) {
        String name = activity.getClass().getName();
        C6496s.g(name, "getName(...)");
        Locale locale = Locale.ROOT;
        C6496s.g(locale, "ROOT");
        String lowerCase = name.toLowerCase(locale);
        C6496s.g(lowerCase, "toLowerCase(...)");
        return p.O(lowerCase, "intercom", false, 2, (Object) null);
    }

    private final boolean isIntercomError(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        C6496s.g(stackTrace, "getStackTrace(...)");
        for (StackTraceElement className : stackTrace) {
            String className2 = className.getClassName();
            C6496s.g(className2, "getClassName(...)");
            if (p.J(className2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final C5840A redact(C5840A a10) {
        throw null;
    }

    private final C5663y0 redactSentryExceptions(C5663y0 y0Var) {
        List f10 = y0Var.f();
        if (f10 == null) {
            f10 = C6565s.n();
        }
        List d10 = C6565s.d(f10.size());
        Iterator it = f10.iterator();
        if (!it.hasNext()) {
            y0Var.g(C6565s.a(d10));
            return y0Var;
        }
        c.a(it.next());
        throw null;
    }

    private final Throwable redactStackTrace(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        C6496s.g(stackTrace, "getStackTrace(...)");
        th2.setStackTrace(getRedactedStacktrace(stackTrace));
        return th2;
    }

    private final C5663y0 redactThrowable(C5663y0 y0Var) {
        Throwable th2;
        Throwable c10 = y0Var.c();
        if (c10 != null) {
            th2 = redactStackTrace(c10);
        } else {
            th2 = null;
        }
        y0Var.e(th2);
        return y0Var;
    }

    private static final C5663y0 registerSentry$lambda$1$lambda$0(Context context, C5663y0 y0Var, C5643o oVar) {
        C6496s.h(context, "$context");
        C6496s.h(y0Var, "event");
        C6496s.h(oVar, "<unused var>");
        Throwable c10 = y0Var.c();
        if (c10 == null) {
            return null;
        }
        SentrySessionManager sentrySessionManager = INSTANCE;
        if (sentrySessionManager.isIntercomError(c10)) {
            return sentrySessionManager.applyIntercomMetadata(sentrySessionManager.redactSentryExceptions(sentrySessionManager.redactThrowable(y0Var)), context);
        }
        return null;
    }

    public final void closeSentry() {
        C5649r0 r0Var = scopes;
        if (r0Var != null) {
            r0Var.n();
        }
    }

    public final void onActivityStarted(Activity activity) {
        C5649r0 r0Var;
        C6496s.h(activity, "activity");
        if (isIntercomActivity(activity) && (r0Var = scopes) != null) {
            r0Var.B();
        }
    }

    public final void onActivityStopped(Activity activity) {
        C5649r0 r0Var;
        C6496s.h(activity, "activity");
        if (isIntercomActivity(activity) && (r0Var = scopes) != null) {
            r0Var.p();
        }
    }

    public final void registerSentry(Context context) {
        C6496s.h(context, "context");
        if (!SentrySessionManagerKt.getNewSentrySetupDisabled()) {
            M0 m02 = new M0();
            m02.K("https://9c56b6fa301e50355ad7befce1458f0b@o2129.ingest.us.sentry.io/4508687817965568");
            m02.N(BuildConfig.VERSION_NAME);
            m02.L(true);
            m02.M(true);
            m02.J(new C5510a(context));
            C5632i0 i0Var = new C5632i0(m02);
            C5649r0 r0Var = new C5649r0(i0Var, i0Var, i0Var, "intercom");
            scope = i0Var;
            scopes = r0Var;
            i1 i1Var = new i1();
            m02.e(i1Var);
            i1Var.b(r0Var, m02);
        }
    }
}
