package com.bugsnag.android.ndk;

import K4.b;
import K4.r;
import K4.t;
import Sg.p;
import android.os.Build;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.S0;
import com.bugsnag.android.v1;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\b*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ`\u0010*\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH ¢\u0006\u0004\b*\u0010+J0\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH ¢\u0006\u0004\b0\u00101J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u00102J(\u00105\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H ¢\u0006\u0004\b5\u00106J(\u00108\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u000207H ¢\u0006\u0004\b8\u00109J(\u0010:\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0013H ¢\u0006\u0004\b:\u0010;J(\u0010<\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H ¢\u0006\u0004\b<\u00106J\u0010\u0010=\u001a\u00020\rH ¢\u0006\u0004\b=\u0010\u0011J\u0010\u0010>\u001a\u00020\rH ¢\u0006\u0004\b>\u0010\u0011J\u0018\u0010?\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0006H ¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H ¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\rH ¢\u0006\u0004\bC\u0010\u0011J\u0018\u0010E\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H ¢\u0006\u0004\bE\u0010@J \u0010H\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u0006H ¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u0013H ¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH ¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u0006H ¢\u0006\u0004\bP\u0010@J\u0018\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H ¢\u0006\u0004\bR\u0010@J\u0018\u0010S\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H ¢\u0006\u0004\bS\u0010@J\u0018\u0010T\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H ¢\u0006\u0004\bT\u0010@J\u0010\u0010V\u001a\u00020UH ¢\u0006\u0004\bV\u0010WJ \u0010Y\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\u0006H ¢\u0006\u0004\bY\u0010IJ\"\u0010[\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b[\u0010BJ\u0018\u0010\\\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\\\u0010@J\u0010\u0010]\u001a\u00020\rH ¢\u0006\u0004\b]\u0010\u0011J\u0010\u0010^\u001a\u00020\rH ¢\u0006\u0004\b^\u0010\u0011J$\u0010a\u001a\u00020\r2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0_H ¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0006H ¢\u0006\u0004\bd\u0010@J\u0018\u0010e\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0006H ¢\u0006\u0004\be\u0010@J\u001e\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010_H ¢\u0006\u0004\bf\u0010gJ\u001e\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010_H ¢\u0006\u0004\bh\u0010gJ\u0018\u0010j\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u0006H ¢\u0006\u0004\bj\u0010@J\u0018\u0010l\u001a\u00020\r2\u0006\u0010k\u001a\u00020\u0013H ¢\u0006\u0004\bl\u0010LJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010'\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010~¨\u0006"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "LK4/r;", "LK4/b;", "bgTaskService", "<init>", "(LK4/b;)V", "", "name", "", "type", "timestamp", "", "metadata", "Llf/M;", "addBreadcrumb", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V", "deliverPendingReports", "()V", "msg", "", "isInvalidMessage", "(Ljava/lang/Object;)Z", "Lcom/bugsnag/android/v1$i;", "arg", "handleInstallMessage", "(Lcom/bugsnag/android/v1$i;)V", "Lcom/bugsnag/android/v1$c;", "handleAddMetadata", "(Lcom/bugsnag/android/v1$c;)V", "Lcom/bugsnag/android/BreadcrumbType;", "toNativeValue", "(Lcom/bugsnag/android/BreadcrumbType;)I", "apiKey", "reportingDirectory", "lastRunInfoPath", "eventUUID", "consecutiveLaunchCrashes", "autoDetectNdkCrashes", "apiLevel", "is32bit", "threadSendPolicy", "maxBreadcrumbs", "install", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZII)V", "sessionID", "key", "handledCount", "unhandledCount", "startedSession", "(Ljava/lang/String;Ljava/lang/String;II)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "tab", "value", "addMetadataString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "addMetadataDouble", "(Ljava/lang/String;Ljava/lang/String;D)V", "addMetadataBoolean", "(Ljava/lang/String;Ljava/lang/String;Z)V", "addMetadataOpaque", "addHandledEvent", "addUnhandledEvent", "clearMetadataTab", "(Ljava/lang/String;)V", "removeMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "pausedSession", "context", "updateContext", "inForeground", "activityName", "updateInForeground", "(ZLjava/lang/String;)V", "isLaunching", "updateIsLaunching", "(Z)V", "updateLastRunInfo", "(I)V", "orientation", "updateOrientation", "newValue", "updateUserId", "updateUserEmail", "updateUserName", "", "getSignalUnwindStackFunction", "()J", "memoryTrimLevelDescription", "updateLowMemory", "variant", "addFeatureFlag", "clearFeatureFlag", "clearFeatureFlags", "refreshSymbolTable", "", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "notifyRemoveCallback", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "data", "setStaticJsonData", "enabled", "setInternalMetricsEnabled", "Lcom/bugsnag/android/v1;", "event", "onStateChange", "(Lcom/bugsnag/android/v1;)V", "LK4/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/File;", "reportDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/S0;", "logger", "Lcom/bugsnag/android/S0;", "()Z", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NativeBridge implements r {
    private final b bgTaskService;
    private final AtomicBoolean installed = new AtomicBoolean(false);
    private final ReentrantLock lock = new ReentrantLock();
    private final S0 logger = NativeInterface.getLogger();
    private final File reportDirectory = NativeInterface.getNativeReportPath();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38790a;

        static {
            int[] iArr = new int[BreadcrumbType.values().length];
            iArr[BreadcrumbType.ERROR.ordinal()] = 1;
            iArr[BreadcrumbType.LOG.ordinal()] = 2;
            iArr[BreadcrumbType.MANUAL.ordinal()] = 3;
            iArr[BreadcrumbType.NAVIGATION.ordinal()] = 4;
            iArr[BreadcrumbType.PROCESS.ordinal()] = 5;
            iArr[BreadcrumbType.REQUEST.ordinal()] = 6;
            iArr[BreadcrumbType.STATE.ordinal()] = 7;
            iArr[BreadcrumbType.USER.ordinal()] = 8;
            f38790a = iArr;
        }
    }

    public NativeBridge(b bVar) {
        this.bgTaskService = bVar;
    }

    private final native void addBreadcrumb(String str, int i10, String str2, Object obj);

    private final void deliverPendingReports() {
        M4.b bVar = new M4.b(this.logger, (Collection) null, 2, (DefaultConstructorMarker) null);
        File[] listFiles = this.reportDirectory.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                if (bVar.a(file)) {
                    file.delete();
                } else {
                    NativeInterface.deliverReport(file);
                }
            }
        }
    }

    private final void handleAddMetadata(v1.c cVar) {
        if (cVar.f38911b != null) {
            Object c10 = OpaqueValue.f38791b.c(cVar.f38912c);
            if (c10 instanceof String) {
                String str = cVar.f38910a;
                String str2 = cVar.f38911b;
                C6496s.e(str2);
                addMetadataString(str, str2, (String) c10);
            } else if (c10 instanceof Boolean) {
                String str3 = cVar.f38910a;
                String str4 = cVar.f38911b;
                C6496s.e(str4);
                addMetadataBoolean(str3, str4, ((Boolean) c10).booleanValue());
            } else if (c10 instanceof Number) {
                String str5 = cVar.f38910a;
                String str6 = cVar.f38911b;
                C6496s.e(str6);
                addMetadataDouble(str5, str6, ((Number) c10).doubleValue());
            } else if (c10 instanceof OpaqueValue) {
                String str7 = cVar.f38910a;
                String str8 = cVar.f38911b;
                C6496s.e(str8);
                addMetadataOpaque(str7, str8, ((OpaqueValue) c10).getJson());
            }
        }
    }

    private final void handleInstallMessage(v1.i iVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                this.logger.e(C6496s.o("Received duplicate setup message with arg: ", iVar));
            } else {
                install(iVar.f38919a, this.reportDirectory.getAbsolutePath(), iVar.f38924f, UUID.randomUUID().toString(), iVar.f38925g, iVar.f38920b, Build.VERSION.SDK_INT, is32bit(), iVar.f38926h.ordinal(), iVar.f38927i);
                this.installed.set(true);
            }
            C6514M m10 = C6514M.f71813a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        int length = cpuAbi.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String str = cpuAbi[i10];
            i10++;
            if (p.O(str, "64", false, 2, (Object) null)) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    private final boolean isInvalidMessage(Object obj) {
        if (obj == null || !(obj instanceof v1)) {
            return true;
        }
        if (this.installed.get() || (obj instanceof v1.i)) {
            return false;
        }
        this.logger.e(C6496s.o("Received message before INSTALL: ", obj));
        return true;
    }

    private final int toNativeValue(BreadcrumbType breadcrumbType) {
        switch (a.f38790a[breadcrumbType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new C6535s();
        }
    }

    public final void addBreadcrumb(String str, String str2, String str3, Object obj) {
        BreadcrumbType breadcrumbType;
        BreadcrumbType[] values = BreadcrumbType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                breadcrumbType = null;
                break;
            }
            breadcrumbType = values[i10];
            i10++;
            if (C6496s.c(breadcrumbType.toString(), str2)) {
                break;
            }
        }
        if (breadcrumbType == null) {
            breadcrumbType = BreadcrumbType.MANUAL;
        }
        addBreadcrumb(str, toNativeValue(breadcrumbType), str3, obj);
    }

    public final native void addFeatureFlag(String str, String str2);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String str, String str2, boolean z10);

    public final native void addMetadataDouble(String str, String str2, double d10);

    public final native void addMetadataOpaque(String str, String str2, String str3);

    public final native void addMetadataString(String str, String str2, String str3);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String str);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String str);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> map);

    public final native void install(String str, String str2, String str3, String str4, int i10, boolean z10, int i11, boolean z11, int i12, int i13);

    public final native void notifyAddCallback(String str);

    public final native void notifyRemoveCallback(String str);

    public void onStateChange(v1 v1Var) {
        if (!isInvalidMessage(v1Var)) {
            if (v1Var instanceof v1.i) {
                handleInstallMessage((v1.i) v1Var);
            } else if (v1Var instanceof v1.h) {
                deliverPendingReports();
            } else if (v1Var instanceof v1.c) {
                handleAddMetadata((v1.c) v1Var);
            } else if (v1Var instanceof v1.f) {
                clearMetadataTab(((v1.f) v1Var).f38915a);
            } else {
                String str = "";
                if (v1Var instanceof v1.g) {
                    v1.g gVar = (v1.g) v1Var;
                    String str2 = gVar.f38916a;
                    String str3 = gVar.f38917b;
                    if (str3 != null) {
                        str = str3;
                    }
                    removeMetadata(str2, str);
                } else if (v1Var instanceof v1.a) {
                    v1.a aVar = (v1.a) v1Var;
                    addBreadcrumb(aVar.f38904a, toNativeValue(aVar.f38905b), aVar.f38906c, (Object) aVar.f38907d);
                } else if (C6496s.c(v1Var, v1.j.f38928a)) {
                    addHandledEvent();
                } else if (C6496s.c(v1Var, v1.k.f38929a)) {
                    addUnhandledEvent();
                } else if (C6496s.c(v1Var, v1.l.f38930a)) {
                    pausedSession();
                } else if (v1Var instanceof v1.m) {
                    v1.m mVar = (v1.m) v1Var;
                    startedSession(mVar.f38931a, mVar.f38932b, mVar.f38933c, mVar.a());
                } else if (v1Var instanceof v1.n) {
                    String str4 = ((v1.n) v1Var).f38935a;
                    if (str4 != null) {
                        str = str4;
                    }
                    updateContext(str);
                } else if (v1Var instanceof v1.o) {
                    v1.o oVar = (v1.o) v1Var;
                    boolean z10 = oVar.f38936a;
                    String a10 = oVar.a();
                    if (a10 != null) {
                        str = a10;
                    }
                    updateInForeground(z10, str);
                } else if (v1Var instanceof v1.p) {
                    v1.p pVar = (v1.p) v1Var;
                    updateIsLaunching(pVar.f38938a);
                    if (!pVar.f38938a) {
                        this.bgTaskService.d(t.DEFAULT, new M4.a(this));
                    }
                } else if (v1Var instanceof v1.r) {
                    String str5 = ((v1.r) v1Var).f38942a;
                    if (str5 != null) {
                        str = str5;
                    }
                    updateOrientation(str);
                } else if (v1Var instanceof v1.s) {
                    v1.s sVar = (v1.s) v1Var;
                    String b10 = sVar.f38943a.b();
                    if (b10 == null) {
                        b10 = str;
                    }
                    updateUserId(b10);
                    String c10 = sVar.f38943a.c();
                    if (c10 == null) {
                        c10 = str;
                    }
                    updateUserName(c10);
                    String a11 = sVar.f38943a.a();
                    if (a11 != null) {
                        str = a11;
                    }
                    updateUserEmail(str);
                } else if (v1Var instanceof v1.q) {
                    v1.q qVar = (v1.q) v1Var;
                    updateLowMemory(qVar.f38939a, qVar.f38941c);
                } else if (v1Var instanceof v1.b) {
                    v1.b bVar = (v1.b) v1Var;
                    addFeatureFlag(bVar.f38908a, bVar.f38909b);
                } else if (v1Var instanceof v1.d) {
                    clearFeatureFlag(((v1.d) v1Var).f38913a);
                } else if (v1Var instanceof v1.e) {
                    clearFeatureFlags();
                }
            }
        }
    }

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(String str, String str2);

    public final native void setInternalMetricsEnabled(boolean z10);

    public final native void setStaticJsonData(String str);

    public final native void startedSession(String str, String str2, int i10, int i11);

    public final native void updateContext(String str);

    public final native void updateInForeground(boolean z10, String str);

    public final native void updateIsLaunching(boolean z10);

    public final native void updateLastRunInfo(int i10);

    public final native void updateLowMemory(boolean z10, String str);

    public final native void updateOrientation(String str);

    public final native void updateUserEmail(String str);

    public final native void updateUserId(String str);

    public final native void updateUserName(String str);
}
