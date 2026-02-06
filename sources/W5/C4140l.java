package w5;

import F5.h;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import com.facebook.S;
import com.facebook.V;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import o7.J;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

/* renamed from: w5.l  reason: case insensitive filesystem */
public final class C4140l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f49196e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f49197f;

    /* renamed from: g  reason: collision with root package name */
    private static C4140l f49198g;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f49199a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f49200b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f49201c;

    /* renamed from: d  reason: collision with root package name */
    private String f49202d = null;

    /* renamed from: w5.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void c(S s10) {
            C6496s.h(s10, "it");
            J.f47112e.b(V.APP_EVENTS, C4140l.d(), "App index sent to FB!");
        }

        public final M b(String str, C3286a aVar, String str2, String str3) {
            C6496s.h(str3, "requestType");
            if (str == null) {
                return null;
            }
            M.c cVar = M.f39311n;
            U u10 = U.f71764a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C6496s.g(format, "format(locale, format, *args)");
            M A10 = cVar.A(aVar, format, (JSONObject) null, (M.b) null);
            Bundle u11 = A10.u();
            if (u11 == null) {
                u11 = new Bundle();
            }
            u11.putString("tree", str);
            u11.putString("app_version", h.c());
            u11.putString("platform", "android");
            u11.putString("request_type", str3);
            if (C6496s.c(str3, "app_indexing")) {
                u11.putString("device_session_id", C4133e.g());
            }
            A10.J(u11);
            A10.E(new C4139k());
            return A10;
        }

        private a() {
        }
    }

    /* renamed from: w5.l$b */
    private static final class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f49203a;

        public b(View view) {
            C6496s.h(view, "rootView");
            this.f49203a = new WeakReference(view);
        }

        /* renamed from: a */
        public String call() {
            View view = (View) this.f49203a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            C6496s.g(createBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C6496s.g(encodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* renamed from: w5.l$c */
    public static final class c extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4140l f49204a;

        c(C4140l lVar) {
            this.f49204a = lVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                w5.l r0 = r7.f49204a     // Catch:{ Exception -> 0x002f }
                java.lang.ref.WeakReference r0 = w5.C4140l.c(r0)     // Catch:{ Exception -> 0x002f }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x002f }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x002f }
                android.view.View r1 = F5.h.d(r0)     // Catch:{ Exception -> 0x002f }
                if (r0 == 0) goto L_0x0095
                if (r1 != 0) goto L_0x0016
                goto L_0x0095
            L_0x0016:
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x002f }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x002f }
                boolean r2 = w5.C4133e.h()     // Catch:{ Exception -> 0x002f }
                if (r2 != 0) goto L_0x0025
                return
            L_0x0025:
                boolean r2 = o7.G.b()     // Catch:{ Exception -> 0x002f }
                if (r2 == 0) goto L_0x0031
                x5.C4169e.a()     // Catch:{ Exception -> 0x002f }
                return
            L_0x002f:
                r0 = move-exception
                goto L_0x0096
            L_0x0031:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x002f }
                w5.l$b r3 = new w5.l$b     // Catch:{ Exception -> 0x002f }
                r3.<init>(r1)     // Catch:{ Exception -> 0x002f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x002f }
                w5.l r3 = r7.f49204a     // Catch:{ Exception -> 0x002f }
                android.os.Handler r3 = w5.C4140l.e(r3)     // Catch:{ Exception -> 0x002f }
                r3.post(r2)     // Catch:{ Exception -> 0x002f }
                java.lang.String r3 = ""
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0052 }
                r5 = 1
                java.lang.Object r2 = r2.get(r5, r4)     // Catch:{ Exception -> 0x0052 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0052 }
                r3 = r2
                goto L_0x005c
            L_0x0052:
                r2 = move-exception
                java.lang.String r4 = w5.C4140l.d()     // Catch:{ Exception -> 0x002f }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x002f }
            L_0x005c:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x002f }
                r2.<init>()     // Catch:{ Exception -> 0x002f }
                java.lang.String r4 = "screenname"
                r2.put(r4, r0)     // Catch:{ JSONException -> 0x007d }
                java.lang.String r0 = "screenshot"
                r2.put(r0, r3)     // Catch:{ JSONException -> 0x007d }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007d }
                r0.<init>()     // Catch:{ JSONException -> 0x007d }
                org.json.JSONObject r1 = x5.C4170f.d(r1)     // Catch:{ JSONException -> 0x007d }
                r0.put(r1)     // Catch:{ JSONException -> 0x007d }
                java.lang.String r1 = "view"
                r2.put(r1, r0)     // Catch:{ JSONException -> 0x007d }
                goto L_0x0086
            L_0x007d:
                java.lang.String r0 = w5.C4140l.d()     // Catch:{ Exception -> 0x002f }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x002f }
            L_0x0086:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x002f }
                java.lang.String r1 = "viewTree.toString()"
                kotlin.jvm.internal.C6496s.g(r0, r1)     // Catch:{ Exception -> 0x002f }
                w5.l r1 = r7.f49204a     // Catch:{ Exception -> 0x002f }
                w5.C4140l.f(r1, r0)     // Catch:{ Exception -> 0x002f }
                goto L_0x009f
            L_0x0095:
                return
            L_0x0096:
                java.lang.String r1 = w5.C4140l.d()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.C4140l.c.run():void");
        }
    }

    static {
        String canonicalName = C4140l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f49197f = canonicalName;
    }

    public C4140l(Activity activity) {
        C6496s.h(activity, "activity");
        this.f49200b = new WeakReference(activity);
        f49198g = this;
    }

    public static final /* synthetic */ WeakReference c(C4140l lVar) {
        Class<C4140l> cls = C4140l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f49200b;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        Class<C4140l> cls = C4140l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f49197f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(C4140l lVar) {
        Class<C4140l> cls = C4140l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f49199a;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void f(C4140l lVar, String str) {
        Class<C4140l> cls = C4140l.class;
        if (!C4049a.d(cls)) {
            try {
                lVar.j(str);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void i(C4140l lVar, TimerTask timerTask) {
        Class<C4140l> cls = C4140l.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(lVar, "this$0");
                C6496s.h(timerTask, "$indexingTask");
                Timer timer = lVar.f49201c;
                if (timer != null) {
                    timer.cancel();
                }
                lVar.f49202d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0, 1000);
                lVar.f49201c = timer2;
            } catch (Exception e10) {
                Log.e(f49197f, "Error scheduling indexing job", e10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void j(String str) {
        if (!C4049a.d(this)) {
            try {
                I.t().execute(new C4138j(str, this));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void k(String str, C4140l lVar) {
        Class<C4140l> cls = C4140l.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$tree");
                C6496s.h(lVar, "this$0");
                String o02 = W.o0(str);
                C3286a e10 = C3286a.f39402l.e();
                if (o02 == null || !C6496s.c(o02, lVar.f49202d)) {
                    lVar.g(f49196e.b(str, e10, I.m(), "app_indexing"), o02);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void g(M m10, String str) {
        if (!C4049a.d(this) && m10 != null) {
            try {
                S k10 = m10.k();
                JSONObject c10 = k10.c();
                if (c10 != null) {
                    if (C6496s.c(com.amazon.a.a.o.b.f37475af, c10.optString(com.amazon.device.simplesignin.a.a.a.f38020s))) {
                        J.f47112e.b(V.APP_EVENTS, f49197f, "Successfully send UI component tree to server");
                        this.f49202d = str;
                    }
                    if (c10.has("is_app_indexing_enabled")) {
                        C4133e.n(c10.getBoolean("is_app_indexing_enabled"));
                        return;
                    }
                    return;
                }
                String str2 = f49197f;
                Log.e(str2, "Error sending UI component tree to Facebook: " + k10.b());
            } catch (JSONException e10) {
                Log.e(f49197f, "Error decoding server response.", e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void h() {
        if (!C4049a.d(this)) {
            try {
                I.t().execute(new C4137i(this, new c(this)));
            } catch (RejectedExecutionException e10) {
                Log.e(f49197f, "Error scheduling indexing job", e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void l() {
        if (!C4049a.d(this)) {
            try {
                if (((Activity) this.f49200b.get()) != null) {
                    Timer timer = this.f49201c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.f49201c = null;
                }
            } catch (Exception e10) {
                Log.e(f49197f, "Error unscheduling indexing job", e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
