package com.bugsnag.android;

import com.bugsnag.android.K0;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.m0  reason: case insensitive filesystem */
public final class C3256m0 implements K0.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38773e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f38774a;

    /* renamed from: b  reason: collision with root package name */
    private String f38775b;

    /* renamed from: c  reason: collision with root package name */
    private ErrorType f38776c;

    /* renamed from: d  reason: collision with root package name */
    private final List f38777d;

    /* renamed from: com.bugsnag.android.m0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(Throwable th2, Collection collection, S0 s02) {
            ArrayList arrayList = new ArrayList();
            for (Throwable th3 : H1.a(th2)) {
                StackTraceElement[] stackTrace = th3.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                arrayList.add(new C3250k0(new C3256m0(th3.getClass().getName(), th3.getLocalizedMessage(), new u1(stackTrace, collection, s02), (ErrorType) null, 8, (DefaultConstructorMarker) null), s02));
            }
            return arrayList;
        }

        private a() {
        }
    }

    public C3256m0(String str, String str2, u1 u1Var, ErrorType errorType) {
        this.f38774a = str;
        this.f38775b = str2;
        this.f38776c = errorType;
        this.f38777d = u1Var.a();
    }

    public final String a() {
        return this.f38774a;
    }

    public final String b() {
        return this.f38775b;
    }

    public final List c() {
        return this.f38777d;
    }

    public final ErrorType d() {
        return this.f38776c;
    }

    public final void e(String str) {
        this.f38774a = str;
    }

    public final void f(String str) {
        this.f38775b = str;
    }

    public final void g(ErrorType errorType) {
        this.f38776c = errorType;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("errorClass").j0(this.f38774a);
        k02.y(MetricTracker.Object.MESSAGE).j0(this.f38775b);
        k02.y("type").j0(this.f38776c.getDesc$bugsnag_android_core_release());
        k02.y("stacktrace").E0(this.f38777d);
        k02.t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3256m0(String str, String str2, u1 u1Var, ErrorType errorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, u1Var, (i10 & 8) != 0 ? ErrorType.ANDROID : errorType);
    }
}
