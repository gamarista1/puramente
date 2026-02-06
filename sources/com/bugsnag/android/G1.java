package com.bugsnag.android;

import K4.k;
import android.os.SystemClock;
import com.bugsnag.android.B1;
import com.bugsnag.android.K0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import pf.C6632a;
import yf.C6798l;

public final class G1 implements K0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38482b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f38483a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ThreadGroup b() {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            C6496s.e(threadGroup);
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            return threadGroup;
        }

        public final List a() {
            ThreadGroup b10 = b();
            Thread[] threadArr = new Thread[b10.activeCount()];
            b10.enumerate(threadArr);
            return C6559l.Z(threadArr);
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Long.valueOf(((Thread) obj).getId()), Long.valueOf(((Thread) obj2).getId()));
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread f38484a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Thread thread) {
            super(1);
            this.f38484a = thread;
        }

        /* renamed from: a */
        public final Integer invoke(Thread thread) {
            return Integer.valueOf(C6496s.j(thread.getId(), this.f38484a.getId()));
        }
    }

    public G1(Throwable th2, boolean z10, int i10, long j10, E1 e12, Collection collection, S0 s02, Thread thread, List list) {
        List a10;
        E1 e13 = e12;
        if (e13 == E1.ALWAYS || (e13 == E1.UNHANDLED_ONLY && z10)) {
            a10 = a(list, thread, th2, z10, i10, j10, collection, s02);
        } else {
            a10 = new ArrayList();
        }
        this.f38483a = a10;
    }

    private final List a(List list, Thread thread, Throwable th2, boolean z10, int i10, long j10, Collection collection, S0 s02) {
        int i11;
        int i12 = i10;
        List U02 = C6565s.U0(list, new b());
        int j11 = C6565s.j(U02, 0, Math.min(i12, U02.size()), new c(thread));
        Iterable iterable = U02;
        if (j11 >= 0) {
            i11 = i12;
        } else {
            i11 = Math.max(i12 - 1, 0);
        }
        List<Thread> V02 = C6565s.V0(iterable, i11);
        ArrayList arrayList = new ArrayList(i12);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        for (Thread thread2 : V02) {
            if (SystemClock.elapsedRealtime() >= elapsedRealtime) {
                break;
            }
            arrayList.add(b(thread, th2, z10, collection, s02, thread2));
        }
        if (j11 < 0) {
            int i13 = (-j11) - 1;
            if (i13 >= arrayList.size()) {
                arrayList.add(b(thread, th2, z10, collection, s02, thread));
            } else {
                arrayList.add(i13, b(thread, th2, z10, collection, s02, thread));
            }
        } else if (j11 >= arrayList.size()) {
            arrayList.add(b(thread, th2, z10, collection, s02, thread));
        }
        if (list.size() > i12) {
            arrayList.add(new B1("", '[' + (list.size() - i12) + " threads omitted as the maxReportedThreads limit (" + i12 + ") was exceeded]", ErrorType.UNKNOWN, false, B1.b.UNKNOWN, new u1(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, collection, s02), s02));
        }
        return arrayList;
    }

    private static final B1 b(Thread thread, Throwable th2, boolean z10, Collection collection, S0 s02, Thread thread2) {
        boolean z11;
        StackTraceElement[] stackTraceElementArr;
        if (thread2.getId() == thread.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        if (!z12) {
            stackTraceElementArr = thread2.getStackTrace();
        } else if (th2 == null || !z10) {
            stackTraceElementArr = thread.getStackTrace();
        } else {
            stackTraceElementArr = th2.getStackTrace();
        }
        return new B1(String.valueOf(thread2.getId()), thread2.getName(), ErrorType.ANDROID, z12, B1.b.b(thread2), new u1(stackTraceElementArr, collection, s02), s02);
    }

    public final List c() {
        return this.f38483a;
    }

    public void toStream(K0 k02) {
        k02.f();
        for (B1 E02 : this.f38483a) {
            k02.E0(E02);
        }
        k02.q();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ G1(java.lang.Throwable r14, boolean r15, int r16, long r17, com.bugsnag.android.E1 r19, java.util.Collection r20, com.bugsnag.android.S0 r21, java.lang.Thread r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x000c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r11 = r1
            goto L_0x000e
        L_0x000c:
            r11 = r22
        L_0x000e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001a
            com.bugsnag.android.G1$a r0 = f38482b
            java.util.List r0 = r0.a()
            r12 = r0
            goto L_0x001c
        L_0x001a:
            r12 = r23
        L_0x001c:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.G1.<init>(java.lang.Throwable, boolean, int, long, com.bugsnag.android.E1, java.util.Collection, com.bugsnag.android.S0, java.lang.Thread, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public G1(Throwable th2, boolean z10, k kVar) {
        this(th2, z10, kVar.v(), kVar.H(), kVar.E(), kVar.A(), kVar.r(), (Thread) null, (List) null, 384, (DefaultConstructorMarker) null);
    }
}
