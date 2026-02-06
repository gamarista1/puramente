package com.bugsnag.android;

import com.amazon.a.a.o.b;
import com.bugsnag.android.ndk.NativeBridge;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H ¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010 \u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b%\u0010$J!\u0010(\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0\u001a¢\u0006\u0004\b(\u0010!R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R(\u00101\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\f8\u0006@BX\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/i1;", "<init>", "()V", "Llf/M;", "enableCrashReporting", "disableCrashReporting", "", "getBinaryArch", "()Ljava/lang/String;", "Lcom/bugsnag/android/A;", "client", "Lcom/bugsnag/android/ndk/NativeBridge;", "initNativeBridge", "(Lcom/bugsnag/android/A;)Lcom/bugsnag/android/ndk/NativeBridge;", "performOneTimeSetup", "(Lcom/bugsnag/android/A;)V", "load", "unload", "", "enabled", "setInternalMetricsEnabled", "(Z)V", "", "getSignalUnwindStackFunction", "()J", "", "", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "(Ljava/lang/String;)V", "notifyRemoveCallback", "", "data", "setStaticData", "Lcom/bugsnag/android/R0;", "libraryLoader", "Lcom/bugsnag/android/R0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/A;", "<set-?>", "nativeBridge", "Lcom/bugsnag/android/ndk/NativeBridge;", "getNativeBridge", "()Lcom/bugsnag/android/ndk/NativeBridge;", "Companion", "a", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NdkPlugin implements C3245i1 {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    @Deprecated
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private A client;
    private final R0 libraryLoader = new R0();
    private NativeBridge nativeBridge;
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    private final NativeBridge initNativeBridge(A a10) {
        NativeBridge nativeBridge2 = new NativeBridge(a10.f38390z);
        a10.d(nativeBridge2);
        a10.X();
        return nativeBridge2;
    }

    private final void performOneTimeSetup(A a10) {
        this.libraryLoader.c("bugsnag-ndk", a10, new C3224b1());
        if (this.libraryLoader.a()) {
            a10.S(getBinaryArch());
            this.nativeBridge = initNativeBridge(a10);
            return;
        }
        a10.f38381q.f(LOAD_ERR_MSG);
    }

    /* access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-0  reason: not valid java name */
    public static final boolean m18performOneTimeSetup$lambda0(C3262o0 o0Var) {
        C3250k0 k0Var = (C3250k0) o0Var.h().get(0);
        o0Var.b("LinkError", "errorClass", k0Var.b());
        o0Var.b("LinkError", b.f37483f, k0Var.c());
        k0Var.g("NdkLinkError");
        k0Var.h(LOAD_ERR_MSG);
        return true;
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Map<String, Integer> map;
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 == null) {
            map = null;
        } else {
            map = nativeBridge2.getCurrentCallbackSetCounts();
        }
        if (map == null) {
            return O.i();
        }
        return map;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Map<String, Boolean> map;
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 == null) {
            map = null;
        } else {
            map = nativeBridge2.getCurrentNativeApiCallUsage();
        }
        if (map == null) {
            return O.i();
        }
        return map;
    }

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 == null) {
            return 0;
        }
        return nativeBridge2.getSignalUnwindStackFunction();
    }

    public final void initCallbackCounts(Map<String, Integer> map) {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 != null) {
            nativeBridge2.initCallbackCounts(map);
        }
    }

    public void load(A a10) {
        this.client = a10;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(a10);
        }
        if (this.libraryLoader.a()) {
            enableCrashReporting();
            a10.f38381q.d("Initialised NDK Plugin");
        }
    }

    public final void notifyAddCallback(String str) {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 != null) {
            nativeBridge2.notifyAddCallback(str);
        }
    }

    public final void notifyRemoveCallback(String str) {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 != null) {
            nativeBridge2.notifyRemoveCallback(str);
        }
    }

    public final void setInternalMetricsEnabled(boolean z10) {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 != null) {
            nativeBridge2.setInternalMetricsEnabled(z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        wf.C6763c.a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        wf.C6763c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStaticData(java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
        /*
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            com.bugsnag.android.K0 r1 = new com.bugsnag.android.K0     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            r1.E0(r4)     // Catch:{ all -> 0x0025 }
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0025 }
            r4 = 0
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0023 }
            wf.C6763c.a(r0, r4)
            java.lang.String r4 = r0.toString()
            com.bugsnag.android.ndk.NativeBridge r0 = r3.nativeBridge
            if (r0 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r0.setStaticJsonData(r4)
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x002c
        L_0x0025:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r2 = move-exception
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0023 }
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x002c:
            throw r4     // Catch:{ all -> 0x002d }
        L_0x002d:
            r1 = move-exception
            wf.C6763c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.NdkPlugin.setStaticData(java.util.Map):void");
    }

    public void unload() {
        A a10;
        if (this.libraryLoader.a()) {
            disableCrashReporting();
            NativeBridge nativeBridge2 = this.nativeBridge;
            if (nativeBridge2 != null && (a10 = this.client) != null) {
                a10.O(nativeBridge2);
            }
        }
    }
}
