package P3;

import android.os.Build;
import androidx.work.C1834a;
import androidx.work.D;
import androidx.work.t;
import androidx.work.x;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public static final B f5047a = new B();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5048a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5049b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f5050c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f5051d;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0098 */
        static {
            /*
                androidx.work.D[] r0 = androidx.work.D.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.work.D r2 = androidx.work.D.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.work.D r3 = androidx.work.D.RUNNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                androidx.work.D r4 = androidx.work.D.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                androidx.work.D r5 = androidx.work.D.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                androidx.work.D r6 = androidx.work.D.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.work.D r6 = androidx.work.D.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f5048a = r0
                androidx.work.a[] r0 = androidx.work.C1834a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.a r6 = androidx.work.C1834a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                androidx.work.a r6 = androidx.work.C1834a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f5049b = r0
                androidx.work.t[] r0 = androidx.work.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.t r6 = androidx.work.t.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                androidx.work.t r6 = androidx.work.t.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                androidx.work.t r6 = androidx.work.t.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                androidx.work.t r3 = androidx.work.t.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                androidx.work.t r3 = androidx.work.t.METERED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                f5050c = r0
                androidx.work.x[] r0 = androidx.work.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.x r3 = androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                androidx.work.x r1 = androidx.work.x.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f5051d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P3.B.a.<clinit>():void");
        }
    }

    private B() {
    }

    public static final int a(C1834a aVar) {
        C6496s.h(aVar, "backoffPolicy");
        int i10 = a.f5049b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C6535s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        wf.C6763c.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set b(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0046 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0046 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x003c }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x003e
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x003c }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x003c }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x003c }
            androidx.work.e$c r7 = new androidx.work.e$c     // Catch:{ all -> 0x003c }
            java.lang.String r8 = "uri"
            kotlin.jvm.internal.C6496s.g(r5, r8)     // Catch:{ all -> 0x003c }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x003c }
            r0.add(r7)     // Catch:{ all -> 0x003c }
            int r4 = r4 + 1
            goto L_0x001e
        L_0x003c:
            r3 = move-exception
            goto L_0x0048
        L_0x003e:
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x003c }
            wf.C6763c.a(r2, r9)     // Catch:{ IOException -> 0x0046 }
            goto L_0x0051
        L_0x0044:
            r9 = move-exception
            goto L_0x0057
        L_0x0046:
            r2 = move-exception
            goto L_0x004e
        L_0x0048:
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            wf.C6763c.a(r2, r3)     // Catch:{ IOException -> 0x0046 }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x004e:
            r2.printStackTrace()     // Catch:{ all -> 0x0044 }
        L_0x0051:
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0044 }
            wf.C6763c.a(r1, r9)
            return r0
        L_0x0057:
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            wf.C6763c.a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.B.b(byte[]):java.util.Set");
    }

    public static final C1834a c(int i10) {
        if (i10 == 0) {
            return C1834a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return C1834a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final t d(int i10) {
        if (i10 == 0) {
            return t.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return t.CONNECTED;
        }
        if (i10 == 2) {
            return t.UNMETERED;
        }
        if (i10 == 3) {
            return t.NOT_ROAMING;
        }
        if (i10 == 4) {
            return t.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return t.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final x e(int i10) {
        if (i10 == 0) {
            return x.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return x.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final D f(int i10) {
        if (i10 == 0) {
            return D.ENQUEUED;
        }
        if (i10 == 1) {
            return D.RUNNING;
        }
        if (i10 == 2) {
            return D.SUCCEEDED;
        }
        if (i10 == 3) {
            return D.FAILED;
        }
        if (i10 == 4) {
            return D.BLOCKED;
        }
        if (i10 == 5) {
            return D.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(t tVar) {
        C6496s.h(tVar, "networkType");
        int i10 = a.f5050c[tVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && tVar == t.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + tVar + " to int");
            }
        }
        return i11;
    }

    public static final int h(x xVar) {
        C6496s.h(xVar, "policy");
        int i10 = a.f5051d[xVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C6535s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        wf.C6763c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] i(java.util.Set r4) {
        /*
            java.lang.String r0 = "triggers"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0058 }
            r1.<init>(r0)     // Catch:{ all -> 0x0058 }
            int r2 = r4.size()     // Catch:{ all -> 0x0043 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0043 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0043 }
            androidx.work.e$c r2 = (androidx.work.C1838e.c) r2     // Catch:{ all -> 0x0043 }
            android.net.Uri r3 = r2.a()     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0043 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0043 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0043 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0043 }
            goto L_0x0024
        L_0x0043:
            r4 = move-exception
            goto L_0x005a
        L_0x0045:
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0043 }
            r4 = 0
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0058 }
            wf.C6763c.a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C6496s.g(r4, r0)
            return r4
        L_0x0058:
            r4 = move-exception
            goto L_0x0060
        L_0x005a:
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r2 = move-exception
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0058 }
            throw r2     // Catch:{ all -> 0x0058 }
        L_0x0060:
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            wf.C6763c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.B.i(java.util.Set):byte[]");
    }

    public static final int j(D d10) {
        C6496s.h(d10, "state");
        switch (a.f5048a[d10.ordinal()]) {
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
            default:
                throw new C6535s();
        }
    }
}
