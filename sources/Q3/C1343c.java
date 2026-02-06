package Q3;

import android.text.TextUtils;
import androidx.work.impl.C;
import androidx.work.impl.C1857q;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.z;
import androidx.work.s;
import androidx.work.w;
import java.util.List;

/* renamed from: Q3.c  reason: case insensitive filesystem */
public class C1343c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f5458c = s.i("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final C f5459a;

    /* renamed from: b  reason: collision with root package name */
    private final C1857q f5460b;

    public C1343c(C c10) {
        this(c10, new C1857q());
    }

    private static boolean b(C c10) {
        boolean c11 = c(c10.g(), c10.f(), (String[]) C.l(c10).toArray(new String[0]), c10.d(), c10.b());
        c10.k();
        return c11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(androidx.work.impl.P r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, androidx.work.i r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            androidx.work.c r3 = r18.g()
            androidx.work.b r3 = r3.a()
            long r3 = r3.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.n()
            r7 = 0
            if (r0 == 0) goto L_0x001e
            int r8 = r0.length
            if (r8 <= 0) goto L_0x001e
            r8 = 1
            goto L_0x001f
        L_0x001e:
            r8 = r7
        L_0x001f:
            if (r8 == 0) goto L_0x006c
            int r9 = r0.length
            r10 = r7
            r12 = r10
            r13 = r12
            r11 = 1
        L_0x0026:
            if (r10 >= r9) goto L_0x006f
            r14 = r0[r10]
            P3.v r15 = r5.H()
            P3.u r15 = r15.h(r14)
            if (r15 != 0) goto L_0x0054
            androidx.work.s r0 = androidx.work.s.e()
            java.lang.String r1 = f5458c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.c(r1, r2)
            return r7
        L_0x0054:
            androidx.work.D r14 = r15.f5092b
            androidx.work.D r15 = androidx.work.D.SUCCEEDED
            if (r14 != r15) goto L_0x005c
            r15 = 1
            goto L_0x005d
        L_0x005c:
            r15 = r7
        L_0x005d:
            r11 = r11 & r15
            androidx.work.D r15 = androidx.work.D.FAILED
            if (r14 != r15) goto L_0x0064
            r13 = 1
            goto L_0x0069
        L_0x0064:
            androidx.work.D r15 = androidx.work.D.CANCELLED
            if (r14 != r15) goto L_0x0069
            r12 = 1
        L_0x0069:
            int r10 = r10 + 1
            goto L_0x0026
        L_0x006c:
            r12 = r7
            r13 = r12
            r11 = 1
        L_0x006f:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            if (r9 != 0) goto L_0x0156
            if (r8 != 0) goto L_0x0156
            P3.v r10 = r5.H()
            java.util.List r10 = r10.o(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0156
            androidx.work.i r14 = androidx.work.i.APPEND
            if (r2 == r14) goto L_0x008d
            androidx.work.i r14 = androidx.work.i.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0090
        L_0x008d:
            r14 = r18
            goto L_0x00d5
        L_0x0090:
            androidx.work.i r14 = androidx.work.i.KEEP
            if (r2 != r14) goto L_0x00af
            java.util.Iterator r2 = r10.iterator()
        L_0x0098:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00af
            java.lang.Object r14 = r2.next()
            P3.u$b r14 = (P3.u.b) r14
            androidx.work.D r14 = r14.f5115b
            androidx.work.D r15 = androidx.work.D.ENQUEUED
            if (r14 == r15) goto L_0x00ae
            androidx.work.D r15 = androidx.work.D.RUNNING
            if (r14 != r15) goto L_0x0098
        L_0x00ae:
            return r7
        L_0x00af:
            r14 = r18
            Q3.b r2 = Q3.C1342b.c(r1, r14, r7)
            r2.run()
            P3.v r2 = r5.H()
            java.util.Iterator r10 = r10.iterator()
        L_0x00c0:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00d2
            java.lang.Object r15 = r10.next()
            P3.u$b r15 = (P3.u.b) r15
            java.lang.String r15 = r15.f5114a
            r2.a(r15)
            goto L_0x00c0
        L_0x00d2:
            r6 = 1
            goto L_0x0159
        L_0x00d5:
            P3.b r8 = r5.C()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e2:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x011c
            java.lang.Object r16 = r10.next()
            r6 = r16
            P3.u$b r6 = (P3.u.b) r6
            java.lang.String r7 = r6.f5114a
            boolean r7 = r8.d(r7)
            if (r7 != 0) goto L_0x0116
            androidx.work.D r7 = r6.f5115b
            r17 = r8
            androidx.work.D r8 = androidx.work.D.SUCCEEDED
            if (r7 != r8) goto L_0x0102
            r8 = 1
            goto L_0x0103
        L_0x0102:
            r8 = 0
        L_0x0103:
            r8 = r8 & r11
            androidx.work.D r11 = androidx.work.D.FAILED
            if (r7 != r11) goto L_0x010a
            r13 = 1
            goto L_0x010f
        L_0x010a:
            androidx.work.D r11 = androidx.work.D.CANCELLED
            if (r7 != r11) goto L_0x010f
            r12 = 1
        L_0x010f:
            java.lang.String r6 = r6.f5114a
            r15.add(r6)
            r11 = r8
            goto L_0x0118
        L_0x0116:
            r17 = r8
        L_0x0118:
            r8 = r17
            r7 = 0
            goto L_0x00e2
        L_0x011c:
            androidx.work.i r6 = androidx.work.i.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0148
            if (r12 != 0) goto L_0x0124
            if (r13 == 0) goto L_0x0148
        L_0x0124:
            P3.v r2 = r5.H()
            java.util.List r6 = r2.o(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0130:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0142
            java.lang.Object r7 = r6.next()
            P3.u$b r7 = (P3.u.b) r7
            java.lang.String r7 = r7.f5114a
            r2.a(r7)
            goto L_0x0130
        L_0x0142:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0148:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0153
            r8 = 1
            goto L_0x0154
        L_0x0153:
            r8 = 0
        L_0x0154:
            r6 = 0
            goto L_0x0159
        L_0x0156:
            r14 = r18
            goto L_0x0154
        L_0x0159:
            java.util.Iterator r2 = r19.iterator()
        L_0x015d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ea
            java.lang.Object r7 = r2.next()
            androidx.work.F r7 = (androidx.work.F) r7
            P3.u r10 = r7.d()
            if (r8 == 0) goto L_0x0184
            if (r11 != 0) goto L_0x0184
            if (r13 == 0) goto L_0x0178
            androidx.work.D r15 = androidx.work.D.FAILED
            r10.f5092b = r15
            goto L_0x0186
        L_0x0178:
            if (r12 == 0) goto L_0x017f
            androidx.work.D r15 = androidx.work.D.CANCELLED
            r10.f5092b = r15
            goto L_0x0186
        L_0x017f:
            androidx.work.D r15 = androidx.work.D.BLOCKED
            r10.f5092b = r15
            goto L_0x0186
        L_0x0184:
            r10.f5104n = r3
        L_0x0186:
            androidx.work.D r15 = r10.f5092b
            r19 = r2
            androidx.work.D r2 = androidx.work.D.ENQUEUED
            if (r15 != r2) goto L_0x018f
            r6 = 1
        L_0x018f:
            P3.v r2 = r5.H()
            java.util.List r15 = r18.l()
            P3.u r10 = Q3.d.c(r15, r10)
            r2.m(r10)
            if (r8 == 0) goto L_0x01c1
            int r2 = r0.length
            r10 = 0
        L_0x01a2:
            if (r10 >= r2) goto L_0x01c1
            r15 = r0[r10]
            r17 = r0
            P3.a r0 = new P3.a
            r20 = r2
            java.lang.String r2 = r7.b()
            r0.<init>(r2, r15)
            P3.b r2 = r5.C()
            r2.a(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x01a2
        L_0x01c1:
            r17 = r0
            P3.z r0 = r5.I()
            java.lang.String r2 = r7.b()
            java.util.Set r10 = r7.c()
            r0.d(r2, r10)
            if (r9 != 0) goto L_0x01e4
            P3.o r0 = r5.F()
            P3.n r2 = new P3.n
            java.lang.String r7 = r7.b()
            r2.<init>(r1, r7)
            r0.b(r2)
        L_0x01e4:
            r2 = r19
            r0 = r17
            goto L_0x015d
        L_0x01ea:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.C1343c.c(androidx.work.impl.P, java.util.List, java.lang.String[], java.lang.String, androidx.work.i):boolean");
    }

    private static boolean e(C c10) {
        List<C> e10 = c10.e();
        boolean z10 = false;
        if (e10 != null) {
            for (C c11 : e10) {
                if (!c11.j()) {
                    z10 |= e(c11);
                } else {
                    s e11 = s.e();
                    String str = f5458c;
                    e11.k(str, "Already enqueued work ids (" + TextUtils.join(", ", c11.c()) + ")");
                }
            }
        }
        return b(c10) | z10;
    }

    public boolean a() {
        P g10 = this.f5459a.g();
        WorkDatabase n10 = g10.n();
        n10.e();
        try {
            d.a(n10, g10.g(), this.f5459a);
            boolean e10 = e(this.f5459a);
            n10.A();
            return e10;
        } finally {
            n10.i();
        }
    }

    public w d() {
        return this.f5460b;
    }

    public void f() {
        P g10 = this.f5459a.g();
        z.h(g10.g(), g10.n(), g10.l());
    }

    public void run() {
        try {
            if (!this.f5459a.h()) {
                if (a()) {
                    p.c(this.f5459a.g().f(), RescheduleReceiver.class, true);
                    f();
                }
                this.f5460b.a(w.f19041a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f5459a + ")");
        } catch (Throwable th2) {
            this.f5460b.a(new w.b.a(th2));
        }
    }

    public C1343c(C c10, C1857q qVar) {
        this.f5459a = c10;
        this.f5460b = qVar;
    }
}
