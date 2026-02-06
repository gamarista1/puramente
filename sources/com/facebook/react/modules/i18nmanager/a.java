package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.b;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w1.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0643a f41056a = new C0643a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final a f41057b = new a();

    /* renamed from: com.facebook.react.modules.i18nmanager.a$a  reason: collision with other inner class name */
    public static final class C0643a {
        public /* synthetic */ C0643a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f41057b;
        }

        private C0643a() {
        }
    }

    private a() {
    }

    private final boolean c(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public static final a f() {
        return f41056a.a();
    }

    private final boolean g() {
        if (p.a(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    private final boolean h(Context context, String str, boolean z10) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z10);
    }

    private final boolean j(Context context) {
        return h(context, "RCTI18nUtil_allowRTL", true);
    }

    private final boolean k(Context context) {
        if (h(context, "RCTI18nUtil_forceRTL", false) || Sg.p.v(System.getProperty("FORCE_RTL_FOR_TESTING", b.f37476ag), b.f37475af, true)) {
            return true;
        }
        return false;
    }

    private final void l(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public final void b(Context context, boolean z10) {
        C6496s.h(context, "context");
        l(context, "RCTI18nUtil_allowRTL", z10);
    }

    public final boolean d(Context context) {
        C6496s.h(context, "context");
        return h(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void e(Context context, boolean z10) {
        C6496s.h(context, "context");
        l(context, "RCTI18nUtil_forceRTL", z10);
    }

    public final boolean i(Context context) {
        C6496s.h(context, "context");
        if (!c(context) || (!k(context) && (!j(context) || !g()))) {
            return false;
        }
        return true;
    }

    public final void m(Context context, boolean z10) {
        C6496s.h(context, "context");
        l(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z10);
    }
}
