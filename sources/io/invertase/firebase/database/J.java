package io.invertase.firebase.database;

import Gb.b;
import Ue.C5546a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.firebase.database.a;
import com.google.firebase.database.f;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class J {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f71309a;

    /* renamed from: b  reason: collision with root package name */
    private final Condition f71310b;

    /* renamed from: c  reason: collision with root package name */
    public Object f71311c;

    /* renamed from: d  reason: collision with root package name */
    boolean f71312d;

    /* renamed from: e  reason: collision with root package name */
    boolean f71313e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f71314f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f71315g;

    /* renamed from: h  reason: collision with root package name */
    private String f71316h;

    /* renamed from: i  reason: collision with root package name */
    private String f71317i;

    /* renamed from: j  reason: collision with root package name */
    private Map f71318j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f71319k;

    J(int i10, String str, String str2) {
        this.f71316h = str;
        this.f71317i = str2;
        this.f71315g = i10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f71309a = reentrantLock;
        this.f71310b = reentrantLock.newCondition();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z10;
        this.f71309a.lock();
        this.f71319k = false;
        long currentTimeMillis = System.currentTimeMillis() + 5000;
        while (!this.f71314f && !this.f71310b.await(250, TimeUnit.MILLISECONDS) && !(z10 = this.f71319k)) {
            try {
                if (!z10 && System.currentTimeMillis() > currentTimeMillis) {
                    this.f71314f = true;
                }
            } finally {
                this.f71309a.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public WritableMap b(b bVar, boolean z10, a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("timeout", this.f71314f);
        createMap.putBoolean("committed", z10);
        createMap.putBoolean("interrupted", this.f71312d);
        if (bVar != null || this.f71314f || this.f71312d) {
            createMap.putString("type", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            if (bVar != null) {
                N n10 = new N(bVar.f(), bVar.g(), bVar.h());
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("code", n10.a());
                createMap2.putString(MetricTracker.Object.MESSAGE, n10.getMessage());
                createMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, createMap2);
            }
            if (bVar == null && this.f71314f) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString("code", "database/internal-timeout");
                createMap3.putString(MetricTracker.Object.MESSAGE, "A timeout occurred whilst waiting for React Native JavaScript thread to send transaction updates.");
                createMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, createMap3);
            }
        } else {
            createMap.putString("type", NotificationStatuses.COMPLETE_STATUS);
            createMap.putMap("snapshot", C6402a.k(aVar));
        }
        return createMap;
    }

    /* access modifiers changed from: package-private */
    public WritableMap c(f fVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "update");
        if (!fVar.h()) {
            C5546a.c("value", fVar.g(), createMap);
        } else {
            Object f10 = C6402a.f(fVar);
            if (f10 instanceof WritableNativeArray) {
                createMap.putArray("value", (WritableArray) f10);
            } else {
                createMap.putMap("value", (WritableMap) f10);
            }
        }
        return createMap;
    }

    /* access modifiers changed from: package-private */
    public void d(ReadableMap readableMap) {
        Map g10 = C5546a.g(readableMap);
        this.f71309a.lock();
        this.f71311c = g10.get("value");
        this.f71313e = ((Boolean) g10.get("abort")).booleanValue();
        try {
            if (!this.f71319k) {
                this.f71319k = true;
                this.f71318j = g10;
                this.f71310b.signalAll();
                this.f71309a.unlock();
                return;
            }
            throw new IllegalStateException("This transactionUpdateHandler has already been signalled.");
        } catch (Exception unused) {
        } catch (Throwable th2) {
            this.f71309a.unlock();
            throw th2;
        }
    }
}
