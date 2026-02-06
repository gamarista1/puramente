package Ue;

import Ve.C5607a;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class g {

    /* renamed from: g  reason: collision with root package name */
    private static g f65197g = new g();

    /* renamed from: a  reason: collision with root package name */
    private final List f65198a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f65199b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f65200c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private ReactContext f65201d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f65202e = Boolean.FALSE;

    /* renamed from: f  reason: collision with root package name */
    private int f65203f;

    private boolean g(C5607a aVar) {
        ReactContext reactContext;
        if (this.f65202e.booleanValue() && (reactContext = this.f65201d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f65201d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.b(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.b(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f65197g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(ReactContext reactContext) {
        this.f65201d = reactContext;
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        this.f65202e = bool;
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(C5607a aVar) {
        synchronized (this.f65200c) {
            try {
                if (this.f65200c.containsKey(aVar.b())) {
                    if (!g(aVar)) {
                    }
                }
                this.f65198a.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void p() {
        synchronized (this.f65200c) {
            try {
                Iterator it = new ArrayList(this.f65198a).iterator();
                while (it.hasNext()) {
                    C5607a aVar = (C5607a) it.next();
                    if (this.f65200c.containsKey(aVar.b())) {
                        this.f65198a.remove(aVar);
                        o(aVar);
                    }
                }
            } finally {
            }
        }
    }

    public void e(String str) {
        synchronized (this.f65200c) {
            try {
                this.f65203f++;
                if (!this.f65200c.containsKey(str)) {
                    this.f65200c.put(str, 1);
                } else {
                    this.f65200c.put(str, Integer.valueOf(((Integer) this.f65200c.get(str)).intValue() + 1));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f65199b.post(new e(this));
    }

    public void f(ReactContext reactContext) {
        this.f65199b.post(new d(this, reactContext));
    }

    public WritableMap h() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f65203f);
        createMap.putInt("queued", this.f65198a.size());
        synchronized (this.f65200c) {
            try {
                for (Map.Entry entry : this.f65200c.entrySet()) {
                    createMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    public void m(Boolean bool) {
        this.f65199b.post(new c(this, bool));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ all -> 0x002d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.lang.String r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            java.util.HashMap r0 = r5.f65200c
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f65200c     // Catch:{ all -> 0x002d }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0041
            java.util.HashMap r1 = r5.f65200c     // Catch:{ all -> 0x002d }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x002d }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x002d }
            int r1 = r1.intValue()     // Catch:{ all -> 0x002d }
            r2 = 1
            if (r1 <= r2) goto L_0x002f
            boolean r3 = r7.booleanValue()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0021
            goto L_0x002f
        L_0x0021:
            java.util.HashMap r3 = r5.f65200c     // Catch:{ all -> 0x002d }
            int r4 = r1 + -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002d }
            r3.put(r6, r4)     // Catch:{ all -> 0x002d }
            goto L_0x0034
        L_0x002d:
            r6 = move-exception
            goto L_0x0043
        L_0x002f:
            java.util.HashMap r3 = r5.f65200c     // Catch:{ all -> 0x002d }
            r3.remove(r6)     // Catch:{ all -> 0x002d }
        L_0x0034:
            int r6 = r5.f65203f     // Catch:{ all -> 0x002d }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            int r6 = r6 - r1
            r5.f65203f = r6     // Catch:{ all -> 0x002d }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ue.g.n(java.lang.String, java.lang.Boolean):void");
    }

    public void o(C5607a aVar) {
        this.f65199b.post(new f(this, aVar));
    }
}
