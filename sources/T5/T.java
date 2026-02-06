package t5;

import android.content.Context;
import com.facebook.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o7.C3886b;
import org.json.JSONArray;
import t7.C4049a;
import y5.C4187a;

public final class T {

    /* renamed from: f  reason: collision with root package name */
    public static final a f48192f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f48193g = T.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    private static final int f48194h = 1000;

    /* renamed from: a  reason: collision with root package name */
    private final C3886b f48195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48196b;

    /* renamed from: c  reason: collision with root package name */
    private List f48197c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List f48198d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f48199e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public T(C3886b bVar, String str) {
        C6496s.h(bVar, "attributionIdentifiers");
        C6496s.h(str, "anonymousAppDeviceGUID");
        this.f48195a = bVar;
        this.f48196b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        t7.C4049a.b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(com.facebook.M r4, android.content.Context r5, int r6, org.json.JSONArray r7, org.json.JSONArray r8, boolean r9) {
        /*
            r3 = this;
            boolean r0 = t7.C4049a.d(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            F5.i$a r0 = F5.i.a.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001d }
            o7.b r1 = r3.f48195a     // Catch:{ JSONException -> 0x001d }
            java.lang.String r2 = r3.f48196b     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r5 = F5.i.a(r0, r1, r2, r9, r5)     // Catch:{ JSONException -> 0x001d }
            int r9 = r3.f48199e     // Catch:{ JSONException -> 0x001d }
            if (r9 <= 0) goto L_0x0022
            java.lang.String r9 = "num_skipped_events"
            r5.put(r9, r6)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x004f
        L_0x001d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            r4.G(r5)     // Catch:{ all -> 0x001b }
            android.os.Bundle r5 = r4.u()     // Catch:{ all -> 0x001b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "events.toString()"
            kotlin.jvm.internal.C6496s.g(r6, r7)     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001b }
            o7.s$b r7 = o7.C3902s.b.IapLoggingLib5To7     // Catch:{ all -> 0x001b }
            boolean r7 = o7.C3902s.g(r7)     // Catch:{ all -> 0x001b }
            if (r7 == 0) goto L_0x0048
            java.lang.String r7 = "operational_parameters"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x001b }
            r5.putString(r7, r8)     // Catch:{ all -> 0x001b }
        L_0x0048:
            r4.K(r6)     // Catch:{ all -> 0x001b }
            r4.J(r5)     // Catch:{ all -> 0x001b }
            return
        L_0x004f:
            t7.C4049a.b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.T.f(com.facebook.M, android.content.Context, int, org.json.JSONArray, org.json.JSONArray, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(t5.C4028e r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = t7.C4049a.d(r2)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C6496s.h(r3, r0)     // Catch:{ all -> 0x0026 }
            java.util.List r0 = r2.f48197c     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            java.util.List r1 = r2.f48198d     // Catch:{ all -> 0x0026 }
            int r1 = r1.size()     // Catch:{ all -> 0x0026 }
            int r0 = r0 + r1
            int r1 = f48194h     // Catch:{ all -> 0x0026 }
            if (r0 < r1) goto L_0x0028
            int r3 = r2.f48199e     // Catch:{ all -> 0x0026 }
            int r3 = r3 + 1
            r2.f48199e = r3     // Catch:{ all -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            r3 = move-exception
            goto L_0x002f
        L_0x0028:
            java.util.List r0 = r2.f48197c     // Catch:{ all -> 0x0026 }
            r0.add(r3)     // Catch:{ all -> 0x0026 }
        L_0x002d:
            monitor-exit(r2)
            return
        L_0x002f:
            t7.C4049a.b(r3, r2)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.T.a(t5.e):void");
    }

    public final synchronized void b(boolean z10) {
        if (!C4049a.d(this)) {
            if (z10) {
                try {
                    this.f48197c.addAll(this.f48198d);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            }
            this.f48198d.clear();
            this.f48199e = 0;
        }
    }

    public final synchronized int c() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return this.f48197c.size();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            List list = this.f48197c;
            this.f48197c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final int e(M m10, Context context, boolean z10, boolean z11) {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            C6496s.h(m10, "request");
            C6496s.h(context, "applicationContext");
            synchronized (this) {
                int i10 = this.f48199e;
                C4187a.d(this.f48197c);
                this.f48198d.addAll(this.f48197c);
                this.f48197c.clear();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (C4028e eVar : this.f48198d) {
                    if (!z10) {
                        if (!eVar.h()) {
                        }
                    }
                    jSONArray.put(eVar.e());
                    jSONArray2.put(eVar.g());
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                C6514M m11 = C6514M.f71813a;
                f(m10, context, i10, jSONArray, jSONArray2, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }
}
