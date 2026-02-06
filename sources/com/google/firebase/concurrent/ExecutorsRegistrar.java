package com.google.firebase.concurrent;

import Eb.C4282c;
import Eb.C4283d;
import Eb.E;
import Eb.w;
import Fb.b;
import Fb.c;
import Fb.d;
import Fb.e;
import Fb.f;
import Fb.g;
import Fb.h;
import Fb.i;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import yb.C5292a;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final w f57062a = new w(new b());

    /* renamed from: b  reason: collision with root package name */
    static final w f57063b = new w(new c());

    /* renamed from: c  reason: collision with root package name */
    static final w f57064c = new w(new d());

    /* renamed from: d  reason: collision with root package name */
    static final w f57065d = new w(new e());

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            StrictMode.ThreadPolicy.Builder unused = detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, (StrictMode.ThreadPolicy) null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(C4283d dVar) {
        return (ScheduledExecutorService) f57062a.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(C4283d dVar) {
        return (ScheduledExecutorService) f57064c.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(C4283d dVar) {
        return (ScheduledExecutorService) f57063b.get();
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f57065d.get());
    }

    public List getComponents() {
        Class<C5292a> cls = C5292a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        Class<yb.b> cls5 = yb.b.class;
        Class<yb.c> cls6 = yb.c.class;
        return Arrays.asList(new C4282c[]{C4282c.d(E.a(cls, cls2), E.a(cls, cls3), E.a(cls, cls4)).f(new f()).d(), C4282c.d(E.a(cls5, cls2), E.a(cls5, cls3), E.a(cls5, cls4)).f(new g()).d(), C4282c.d(E.a(cls6, cls2), E.a(cls6, cls3), E.a(cls6, cls4)).f(new h()).d(), C4282c.c(E.a(yb.d.class, cls4)).f(new i()).d()});
    }
}
