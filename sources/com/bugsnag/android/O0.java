package com.bugsnag.android;

import K4.k;
import Sg.p;
import com.amazon.a.a.o.b.f;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    private final File f38562a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38563b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantReadWriteLock f38564c = new ReentrantReadWriteLock();

    public O0(k kVar) {
        this.f38562a = new File((File) kVar.z().getValue(), "bugsnag/last-run-info");
        this.f38563b = kVar.r();
    }

    private final boolean a(String str, String str2) {
        return Boolean.parseBoolean(p.S0(str, C6496s.o(str2, f.f37530b), (String) null, 2, (Object) null));
    }

    private final int b(String str, String str2) {
        return Integer.parseInt(p.S0(str, C6496s.o(str2, f.f37530b), (String) null, 2, (Object) null));
    }

    private final N0 e() {
        if (!this.f38562a.exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : p.F0(wf.k.h(this.f38562a, (Charset) null, 1, (Object) null), new String[]{"\n"}, false, 0, 6, (Object) null)) {
            if (!p.d0((String) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() != 3) {
            this.f38563b.e(C6496s.o("Unexpected number of lines when loading LastRunInfo. Skipping load. ", arrayList));
            return null;
        }
        try {
            N0 n02 = new N0(b((String) arrayList.get(0), "consecutiveLaunchCrashes"), a((String) arrayList.get(1), "crashed"), a((String) arrayList.get(2), "crashedDuringLaunch"));
            this.f38563b.g(C6496s.o("Loaded: ", n02));
            return n02;
        } catch (NumberFormatException e10) {
            this.f38563b.b("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e10);
            return null;
        }
    }

    private final void g(N0 n02) {
        M0 m02 = new M0();
        m02.a("consecutiveLaunchCrashes", Integer.valueOf(n02.a()));
        m02.a("crashed", Boolean.valueOf(n02.b()));
        m02.a("crashedDuringLaunch", Boolean.valueOf(n02.c()));
        String m03 = m02.toString();
        File parentFile = this.f38562a.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        wf.k.k(this.f38562a, m03, (Charset) null, 2, (Object) null);
        this.f38563b.g(C6496s.o("Persisted: ", m03));
    }

    public final File c() {
        return this.f38562a;
    }

    public final N0 d() {
        N0 n02;
        ReentrantReadWriteLock.ReadLock readLock = this.f38564c.readLock();
        readLock.lock();
        try {
            n02 = e();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
        readLock.unlock();
        return n02;
    }

    public final void f(N0 n02) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f38564c.writeLock();
        writeLock.lock();
        try {
            g(n02);
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
        C6514M m10 = C6514M.f71813a;
        writeLock.unlock();
    }
}
