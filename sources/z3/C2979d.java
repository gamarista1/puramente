package z3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import y3.d;
import y3.g;
import y3.h;
import yf.C6787a;

/* renamed from: z3.d  reason: case insensitive filesystem */
public final class C2979d implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f29304h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f29305a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f29306b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h.a f29307c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f29308d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29309e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f29310f = C6531o.b(new C0495d(this));
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f29311g;

    /* renamed from: z3.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: z3.d$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C2978c f29312a;

        public b(C2978c cVar) {
            this.f29312a = cVar;
        }

        public final C2978c a() {
            return this.f29312a;
        }

        public final void b(C2978c cVar) {
            this.f29312a = cVar;
        }
    }

    /* renamed from: z3.d$c */
    private static final class c extends SQLiteOpenHelper {

        /* renamed from: h  reason: collision with root package name */
        public static final C0493c f29313h = new C0493c((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Context f29314a;

        /* renamed from: b  reason: collision with root package name */
        private final b f29315b;

        /* renamed from: c  reason: collision with root package name */
        private final h.a f29316c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f29317d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29318e;

        /* renamed from: f  reason: collision with root package name */
        private final A3.a f29319f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f29320g;

        /* renamed from: z3.d$c$a */
        private static final class a extends RuntimeException {

            /* renamed from: a  reason: collision with root package name */
            private final b f29321a;

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f29322b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th2) {
                super(th2);
                C6496s.h(bVar, "callbackName");
                C6496s.h(th2, "cause");
                this.f29321a = bVar;
                this.f29322b = th2;
            }

            public final b a() {
                return this.f29321a;
            }

            public Throwable getCause() {
                return this.f29322b;
            }
        }

        /* renamed from: z3.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: z3.d$c$c  reason: collision with other inner class name */
        public static final class C0493c {
            public /* synthetic */ C0493c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2978c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                C6496s.h(bVar, "refHolder");
                C6496s.h(sQLiteDatabase, "sqLiteDatabase");
                C2978c a10 = bVar.a();
                if (a10 != null && a10.f(sQLiteDatabase)) {
                    return a10;
                }
                C2978c cVar = new C2978c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }

            private C0493c() {
            }
        }

        /* renamed from: z3.d$c$d  reason: collision with other inner class name */
        public /* synthetic */ class C0494d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f29329a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    z3.d$c$b[] r0 = z3.C2979d.c.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    z3.d$c$b r1 = z3.C2979d.c.b.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    z3.d$c$b r1 = z3.C2979d.c.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    z3.d$c$b r1 = z3.C2979d.c.b.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    z3.d$c$b r1 = z3.C2979d.c.b.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    z3.d$c$b r1 = z3.C2979d.c.b.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f29329a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: z3.C2979d.c.C0494d.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, b bVar, h.a aVar, boolean z10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f28730a, new C2980e(aVar, bVar));
            C6496s.h(context, "context");
            C6496s.h(bVar, "dbRef");
            C6496s.h(aVar, "callback");
            this.f29314a = context;
            this.f29315b = bVar;
            this.f29316c = aVar;
            this.f29317d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C6496s.g(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            C6496s.g(cacheDir, "context.cacheDir");
            this.f29319f = new A3.a(str, cacheDir, false);
        }

        /* access modifiers changed from: private */
        public static final void b(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            C6496s.h(aVar, "$callback");
            C6496s.h(bVar, "$dbRef");
            C0493c cVar = f29313h;
            C6496s.g(sQLiteDatabase, "dbObj");
            aVar.c(cVar.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase o(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                C6496s.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            C6496s.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.database.sqlite.SQLiteDatabase q(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0031
                android.content.Context r1 = r4.f29314a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0031
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0031
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0031:
                android.database.sqlite.SQLiteDatabase r5 = r4.o(r5)     // Catch:{ all -> 0x0036 }
                return r5
            L_0x0036:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x003e }
            L_0x003e:
                android.database.sqlite.SQLiteDatabase r5 = r4.o(r5)     // Catch:{ all -> 0x0043 }
                return r5
            L_0x0043:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof z3.C2979d.c.a
                if (r2 == 0) goto L_0x0070
                z3.d$c$a r1 = (z3.C2979d.c.a) r1
                java.lang.Throwable r2 = r1.getCause()
                z3.d$c$b r1 = r1.a()
                int[] r3 = z3.C2979d.c.C0494d.f29329a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x006f
                r3 = 2
                if (r1 == r3) goto L_0x006f
                r3 = 3
                if (r1 == r3) goto L_0x006f
                r3 = 4
                if (r1 == r3) goto L_0x006f
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x006e
                goto L_0x007a
            L_0x006e:
                throw r2
            L_0x006f:
                throw r2
            L_0x0070:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008b
                if (r0 == 0) goto L_0x008a
                boolean r2 = r4.f29317d
                if (r2 == 0) goto L_0x008a
            L_0x007a:
                android.content.Context r1 = r4.f29314a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.o(r5)     // Catch:{ a -> 0x0084 }
                return r5
            L_0x0084:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008a:
                throw r1
            L_0x008b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.C2979d.c.q(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void close() {
            try {
                A3.a.c(this.f29319f, false, 1, (Object) null);
                super.close();
                this.f29315b.b((C2978c) null);
                this.f29320g = false;
            } finally {
                this.f29319f.d();
            }
        }

        public final g f(boolean z10) {
            boolean z11;
            try {
                A3.a aVar = this.f29319f;
                if (this.f29320g || getDatabaseName() == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aVar.b(z11);
                this.f29318e = false;
                SQLiteDatabase q10 = q(z10);
                if (this.f29318e) {
                    close();
                    g f10 = f(z10);
                    this.f29319f.d();
                    return f10;
                }
                C2978c n10 = n(q10);
                this.f29319f.d();
                return n10;
            } catch (Throwable th2) {
                this.f29319f.d();
                throw th2;
            }
        }

        public final C2978c n(SQLiteDatabase sQLiteDatabase) {
            C6496s.h(sQLiteDatabase, "sqLiteDatabase");
            return f29313h.a(this.f29315b, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C6496s.h(sQLiteDatabase, "db");
            try {
                this.f29316c.b(n(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C6496s.h(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f29316c.d(n(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C6496s.h(sQLiteDatabase, "db");
            this.f29318e = true;
            try {
                this.f29316c.e(n(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            C6496s.h(sQLiteDatabase, "db");
            if (!this.f29318e) {
                try {
                    this.f29316c.f(n(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f29320g = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C6496s.h(sQLiteDatabase, "sqLiteDatabase");
            this.f29318e = true;
            try {
                this.f29316c.g(n(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: z3.d$d  reason: collision with other inner class name */
    static final class C0495d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2979d f29330a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0495d(C2979d dVar) {
            super(0);
            this.f29330a = dVar;
        }

        /* renamed from: a */
        public final c invoke() {
            c cVar;
            if (this.f29330a.f29306b == null || !this.f29330a.f29308d) {
                cVar = new c(this.f29330a.f29305a, this.f29330a.f29306b, new b((C2978c) null), this.f29330a.f29307c, this.f29330a.f29309e);
            } else {
                cVar = new c(this.f29330a.f29305a, new File(d.a(this.f29330a.f29305a), this.f29330a.f29306b).getAbsolutePath(), new b((C2978c) null), this.f29330a.f29307c, this.f29330a.f29309e);
            }
            y3.b.d(cVar, this.f29330a.f29311g);
            return cVar;
        }
    }

    public C2979d(Context context, String str, h.a aVar, boolean z10, boolean z11) {
        C6496s.h(context, "context");
        C6496s.h(aVar, "callback");
        this.f29305a = context;
        this.f29306b = str;
        this.f29307c = aVar;
        this.f29308d = z10;
        this.f29309e = z11;
    }

    private final c t() {
        return (c) this.f29310f.getValue();
    }

    public g X0() {
        return t().f(true);
    }

    public void close() {
        if (this.f29310f.e()) {
            t().close();
        }
    }

    public String getDatabaseName() {
        return this.f29306b;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f29310f.e()) {
            y3.b.d(t(), z10);
        }
        this.f29311g = z10;
    }
}
