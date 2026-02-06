package o7;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C4049a;

/* renamed from: o7.a  reason: case insensitive filesystem */
public final class C3885a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0707a f47176d = new C0707a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static C3885a f47177e;

    /* renamed from: a  reason: collision with root package name */
    private int f47178a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f47179b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f47180c;

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    public static final class C0707a {
        public /* synthetic */ C0707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final synchronized boolean d(C3885a aVar) {
            boolean z10;
            C3885a c10 = c();
            C3885a.b(aVar);
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return z10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized o7.C3885a b(java.util.UUID r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callId"
                kotlin.jvm.internal.C6496s.h(r4, r0)     // Catch:{ all -> 0x0023 }
                o7.a r0 = r3.c()     // Catch:{ all -> 0x0023 }
                r1 = 0
                if (r0 == 0) goto L_0x0025
                java.util.UUID r2 = r0.c()     // Catch:{ all -> 0x0023 }
                boolean r4 = kotlin.jvm.internal.C6496s.c(r2, r4)     // Catch:{ all -> 0x0023 }
                if (r4 == 0) goto L_0x0025
                int r4 = r0.d()     // Catch:{ all -> 0x0023 }
                if (r4 == r5) goto L_0x001e
                goto L_0x0025
            L_0x001e:
                r3.d(r1)     // Catch:{ all -> 0x0023 }
                monitor-exit(r3)
                return r0
            L_0x0023:
                r4 = move-exception
                goto L_0x0027
            L_0x0025:
                monitor-exit(r3)
                return r1
            L_0x0027:
                monitor-exit(r3)     // Catch:{ all -> 0x0023 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.C3885a.C0707a.b(java.util.UUID, int):o7.a");
        }

        public final C3885a c() {
            return C3885a.a();
        }

        private C0707a() {
        }
    }

    public C3885a(int i10) {
        this(i10, (UUID) null, 2, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ C3885a a() {
        Class<C3885a> cls = C3885a.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f47177e;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void b(C3885a aVar) {
        Class<C3885a> cls = C3885a.class;
        if (!C4049a.d(cls)) {
            try {
                f47177e = aVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final UUID c() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f47179b;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final int d() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return this.f47178a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    public final Intent e() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f47180c;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final boolean f() {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return f47176d.d(this);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public final void g(Intent intent) {
        if (!C4049a.d(this)) {
            try {
                this.f47180c = intent;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public C3885a(int i10, UUID uuid) {
        C6496s.h(uuid, "callId");
        this.f47178a = i10;
        this.f47179b = uuid;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3885a(int r1, java.util.UUID r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r3 = "randomUUID()"
            kotlin.jvm.internal.C6496s.g(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C3885a.<init>(int, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
