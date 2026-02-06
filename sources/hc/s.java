package Hc;

import jc.C5046e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f51030c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f51031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51032b;

    public static final class a {

        /* renamed from: Hc.s$a$a  reason: collision with other inner class name */
        static final class C0778a extends d {

            /* renamed from: a  reason: collision with root package name */
            Object f51033a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f51034b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f51035c;

            /* renamed from: d  reason: collision with root package name */
            int f51036d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0778a(a aVar, C6658d dVar) {
                super(dVar);
                this.f51035c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f51034b = obj;
                this.f51036d |= Integer.MIN_VALUE;
                return this.f51035c.a((C5046e) null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[Catch:{ Exception -> 0x0034 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(jc.C5046e r9, qf.C6658d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Hc.s.a.C0778a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                Hc.s$a$a r0 = (Hc.s.a.C0778a) r0
                int r1 = r0.f51036d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f51036d = r1
                goto L_0x0018
            L_0x0013:
                Hc.s$a$a r0 = new Hc.s$a$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f51034b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f51036d
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r6) goto L_0x003e
                if (r2 != r5) goto L_0x0036
                java.lang.Object r9 = r0.f51033a
                java.lang.String r9 = (java.lang.String) r9
                lf.w.b(r10)     // Catch:{ Exception -> 0x0034 }
                goto L_0x008a
            L_0x0034:
                r10 = move-exception
                goto L_0x0093
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.f51033a
                jc.e r9 = (jc.C5046e) r9
                lf.w.b(r10)     // Catch:{ Exception -> 0x0046 }
                goto L_0x0060
            L_0x0046:
                r10 = move-exception
                goto L_0x006f
            L_0x0048:
                lf.w.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch:{ Exception -> 0x0046 }
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.C6496s.g(r10, r2)     // Catch:{ Exception -> 0x0046 }
                r0.f51033a = r9     // Catch:{ Exception -> 0x0046 }
                r0.f51036d = r6     // Catch:{ Exception -> 0x0046 }
                java.lang.Object r10 = eh.C5839b.a(r10, r0)     // Catch:{ Exception -> 0x0046 }
                if (r10 != r1) goto L_0x0060
                return r1
            L_0x0060:
                com.google.firebase.installations.g r10 = (com.google.firebase.installations.g) r10     // Catch:{ Exception -> 0x0046 }
                java.lang.String r10 = r10.b()     // Catch:{ Exception -> 0x0046 }
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.C6496s.g(r10, r2)     // Catch:{ Exception -> 0x0046 }
                r7 = r10
                r10 = r9
                r9 = r7
                goto L_0x0076
            L_0x006f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L_0x0076:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch:{ Exception -> 0x0034 }
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.C6496s.g(r10, r2)     // Catch:{ Exception -> 0x0034 }
                r0.f51033a = r9     // Catch:{ Exception -> 0x0034 }
                r0.f51036d = r5     // Catch:{ Exception -> 0x0034 }
                java.lang.Object r10 = eh.C5839b.a(r10, r0)     // Catch:{ Exception -> 0x0034 }
                if (r10 != r1) goto L_0x008a
                return r1
            L_0x008a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.C6496s.g(r10, r0)     // Catch:{ Exception -> 0x0034 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0034 }
                r3 = r10
                goto L_0x0098
            L_0x0093:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L_0x0098:
                Hc.s r10 = new Hc.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Hc.s.a.a(jc.e, qf.d):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ s(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f51032b;
    }

    public final String b() {
        return this.f51031a;
    }

    private s(String str, String str2) {
        this.f51031a = str;
        this.f51032b = str2;
    }
}
