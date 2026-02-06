package V0;

import U0.b;
import Y0.q;
import Y0.r;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final r f8163a = q.a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f8164b = new b(16);

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f8165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ D f8166b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(E e10, D d10) {
            super(1);
            this.f8165a = e10;
            this.f8166b = d10;
        }

        public final void a(F f10) {
            r b10 = this.f8165a.b();
            E e10 = this.f8165a;
            D d10 = this.f8166b;
            synchronized (b10) {
                try {
                    if (f10.e()) {
                        e10.f8164b.e(d10, f10);
                    } else {
                        e10.f8164b.f(d10);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F) obj);
            return C6514M.f71813a;
        }
    }

    public final r b() {
        return this.f8163a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5 = (V0.F) r5.invoke(new V0.E.a(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r3.f8163a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3.f8164b.d(r4) != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.e() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.f8164b.e(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r4 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y.A1 c(V0.D r4, yf.C6798l r5) {
        /*
            r3 = this;
            Y0.r r0 = r3.f8163a
            monitor-enter(r0)
            U0.b r1 = r3.f8164b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x001e }
            V0.F r1 = (V0.F) r1     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            boolean r2 = r1.e()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)
            return r1
        L_0x0015:
            U0.b r1 = r3.f8164b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.f(r4)     // Catch:{ all -> 0x001e }
            V0.F r1 = (V0.F) r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r4 = move-exception
            goto L_0x0054
        L_0x0020:
            monitor-exit(r0)
            V0.E$a r0 = new V0.E$a     // Catch:{ Exception -> 0x004b }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x004b }
            V0.F r5 = (V0.F) r5     // Catch:{ Exception -> 0x004b }
            Y0.r r0 = r3.f8163a
            monitor-enter(r0)
            U0.b r1 = r3.f8164b     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0045
            boolean r1 = r5.e()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0045
            U0.b r1 = r3.f8164b     // Catch:{ all -> 0x0043 }
            r1.e(r4, r5)     // Catch:{ all -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r5
        L_0x0049:
            monitor-exit(r0)
            throw r4
        L_0x004b:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0054:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.E.c(V0.D, yf.l):Y.A1");
    }
}
