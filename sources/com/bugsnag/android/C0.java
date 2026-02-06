package com.bugsnag.android;

import com.bugsnag.android.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6559l;

public final class C0 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private volatile A0[] f38422a;

    private C0(A0[] a0Arr) {
        this.f38422a = a0Arr;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.bugsnag.android.A0[] r0 = r6.f38422a     // Catch:{ all -> 0x0019 }
            int r1 = r0.length     // Catch:{ all -> 0x0019 }
            r2 = 0
        L_0x0005:
            r3 = -1
            if (r2 >= r1) goto L_0x001b
            int r4 = r2 + 1
            r5 = r0[r2]     // Catch:{ all -> 0x0019 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x0019 }
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r7)     // Catch:{ all -> 0x0019 }
            if (r5 == 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r2 = r4
            goto L_0x0005
        L_0x0019:
            r7 = move-exception
            goto L_0x0055
        L_0x001b:
            r2 = r3
        L_0x001c:
            if (r2 != r3) goto L_0x002a
            com.bugsnag.android.A0 r1 = new com.bugsnag.android.A0     // Catch:{ all -> 0x0019 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x0019 }
            java.lang.Object[] r7 = mf.C6559l.G(r0, r1)     // Catch:{ all -> 0x0019 }
            com.bugsnag.android.A0[] r7 = (com.bugsnag.android.A0[]) r7     // Catch:{ all -> 0x0019 }
            goto L_0x004d
        L_0x002a:
            r1 = r0[r2]     // Catch:{ all -> 0x0019 }
            java.lang.String r1 = r1.d()     // Catch:{ all -> 0x0019 }
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r8)     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0053
            int r1 = r0.length     // Catch:{ all -> 0x0019 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0019 }
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.C6496s.g(r0, r1)     // Catch:{ all -> 0x0019 }
            r1 = r0
            com.bugsnag.android.A0[] r1 = (com.bugsnag.android.A0[]) r1     // Catch:{ all -> 0x0019 }
            com.bugsnag.android.A0 r3 = new com.bugsnag.android.A0     // Catch:{ all -> 0x0019 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0019 }
            r1[r2] = r3     // Catch:{ all -> 0x0019 }
            r7 = r0
            com.bugsnag.android.A0[] r7 = (com.bugsnag.android.A0[]) r7     // Catch:{ all -> 0x0019 }
        L_0x004d:
            r6.f38422a = r7     // Catch:{ all -> 0x0019 }
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x0019 }
            monitor-exit(r6)
            return
        L_0x0053:
            monitor-exit(r6)
            return
        L_0x0055:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C0.a(java.lang.String, java.lang.String):void");
    }

    public void b(String str) {
        synchronized (this) {
            A0[] a0Arr = this.f38422a;
            int length = a0Arr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                int i11 = i10 + 1;
                if (C6496s.c(a0Arr[i10].b(), str)) {
                    break;
                }
                i10 = i11;
            }
            if (i10 != -1) {
                A0[] a0Arr2 = new A0[(a0Arr.length - 1)];
                C6559l.m(a0Arr, a0Arr2, 0, 0, i10);
                C6559l.q(a0Arr, a0Arr2, i10, i10 + 1, 0, 8, (Object) null);
                this.f38422a = a0Arr2;
                C6514M m10 = C6514M.f71813a;
            }
        }
    }

    public void c() {
        synchronized (this) {
            this.f38422a = new A0[0];
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final C0 d() {
        return new C0(this.f38422a);
    }

    public final List e() {
        A0[] a0Arr = this.f38422a;
        ArrayList arrayList = new ArrayList(a0Arr.length);
        int length = a0Arr.length;
        int i10 = 0;
        while (i10 < length) {
            A0 a02 = a0Arr[i10];
            i10++;
            arrayList.add(new A0((String) a02.getKey(), (String) a02.getValue()));
        }
        return arrayList;
    }

    public void toStream(K0 k02) {
        A0[] a0Arr = this.f38422a;
        k02.f();
        int length = a0Arr.length;
        int i10 = 0;
        while (i10 < length) {
            A0 a02 = a0Arr[i10];
            i10++;
            String str = (String) a02.getValue();
            k02.n();
            k02.y("featureFlag").j0((String) a02.getKey());
            if (str != null) {
                k02.y("variant").j0(str);
            }
            k02.t();
        }
        k02.q();
    }

    public C0() {
        this(new A0[0]);
    }
}
