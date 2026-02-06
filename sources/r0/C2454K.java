package r0;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import u0.C2673c;
import v0.C2744a;
import v0.C2745b;

/* renamed from: r0.K  reason: case insensitive filesystem */
final class C2454K implements F1 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25432e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static boolean f25433f = true;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f25434a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f25435b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private C2744a f25436c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentCallbacks2 f25437d = null;

    /* renamed from: r0.K$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: r0.K$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25438a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C2454K(ViewGroup viewGroup) {
        this.f25434a = viewGroup;
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1;
    }

    private final C2744a d(ViewGroup viewGroup) {
        C2744a aVar = this.f25436c;
        if (aVar != null) {
            return aVar;
        }
        C2745b bVar = new C2745b(viewGroup.getContext());
        viewGroup.addView(bVar);
        this.f25436c = bVar;
        return bVar;
    }

    public void a(C2673c cVar) {
        synchronized (this.f25435b) {
            cVar.H();
            C6514M m10 = C6514M.f71813a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [u0.d] */
    /* JADX WARNING: type inference failed for: r2v8, types: [u0.E] */
    /* JADX WARNING: type inference failed for: r2v9, types: [u0.E] */
    /* JADX WARNING: type inference failed for: r2v10, types: [u0.f] */
    /* JADX WARNING: type inference failed for: r2v11, types: [u0.D] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u0.C2673c b() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f25435b
            monitor-enter(r0)
            android.view.ViewGroup r1 = r12.f25434a     // Catch:{ all -> 0x001b }
            long r10 = r12.c(r1)     // Catch:{ all -> 0x001b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001b }
            r2 = 29
            if (r1 < r2) goto L_0x001d
            u0.D r1 = new u0.D     // Catch:{ all -> 0x001b }
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x001b:
            r1 = move-exception
            goto L_0x0060
        L_0x001d:
            boolean r1 = f25433f     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0046
            u0.f r1 = new u0.f     // Catch:{ all -> 0x0030 }
            android.view.ViewGroup r3 = r12.f25434a     // Catch:{ all -> 0x0030 }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r1 = 0
            f25433f = r1     // Catch:{ all -> 0x001b }
            u0.E r1 = new u0.E     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f25434a     // Catch:{ all -> 0x001b }
            v0.a r3 = r12.d(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x0046:
            u0.E r1 = new u0.E     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f25434a     // Catch:{ all -> 0x001b }
            v0.a r3 = r12.d(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
        L_0x0058:
            u0.c r2 = new u0.c     // Catch:{ all -> 0x001b }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)
            return r2
        L_0x0060:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C2454K.b():u0.c");
    }
}
