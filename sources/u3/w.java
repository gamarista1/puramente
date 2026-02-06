package u3;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v3.C2756b;
import y3.g;
import y3.h;

public class w extends h.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f26756g = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private C2714f f26757c;

    /* renamed from: d  reason: collision with root package name */
    private final b f26758d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26759e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26760f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            wf.C6763c.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(y3.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C6496s.h(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.a1(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                wf.C6763c.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                wf.C6763c.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.w.a.a(y3.g):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            wf.C6763c.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(y3.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C6496s.h(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.a1(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                wf.C6763c.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                wf.C6763c.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.w.a.b(y3.g):boolean");
        }

        private a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f26761a;

        public b(int i10) {
            this.f26761a = i10;
        }

        public abstract void a(g gVar);

        public abstract void b(g gVar);

        public abstract void c(g gVar);

        public abstract void d(g gVar);

        public abstract void e(g gVar);

        public abstract void f(g gVar);

        public abstract c g(g gVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f26762a;

        /* renamed from: b  reason: collision with root package name */
        public final String f26763b;

        public c(boolean z10, String str) {
            this.f26762a = z10;
            this.f26763b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(C2714f fVar, b bVar, String str, String str2) {
        super(bVar.f26761a);
        C6496s.h(fVar, "configuration");
        C6496s.h(bVar, "delegate");
        C6496s.h(str, "identityHash");
        C6496s.h(str2, "legacyHash");
        this.f26757c = fVar;
        this.f26758d = bVar;
        this.f26759e = str;
        this.f26760f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        wf.C6763c.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(y3.g r4) {
        /*
            r3 = this;
            u3.w$a r0 = f26756g
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x005e
            y3.a r0 = new y3.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.j1(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0058
        L_0x0022:
            r0 = r1
        L_0x0023:
            wf.C6763c.a(r4, r1)
            java.lang.String r4 = r3.f26759e
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r0)
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = r3.f26760f
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r0)
            if (r4 == 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f26759e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            wf.C6763c.a(r4, r0)
            throw r1
        L_0x005e:
            u3.w$b r0 = r3.f26758d
            u3.w$c r0 = r0.g(r4)
            boolean r1 = r0.f26762a
            if (r1 == 0) goto L_0x0071
            u3.w$b r0 = r3.f26758d
            r0.e(r4)
            r3.j(r4)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f26763b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.w.h(y3.g):void");
    }

    private final void i(g gVar) {
        gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(g gVar) {
        i(gVar);
        gVar.z(v.a(this.f26759e));
    }

    public void b(g gVar) {
        C6496s.h(gVar, "db");
        super.b(gVar);
    }

    public void d(g gVar) {
        C6496s.h(gVar, "db");
        boolean a10 = f26756g.a(gVar);
        this.f26758d.a(gVar);
        if (!a10) {
            c g10 = this.f26758d.g(gVar);
            if (!g10.f26762a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f26763b);
            }
        }
        j(gVar);
        this.f26758d.c(gVar);
    }

    public void e(g gVar, int i10, int i11) {
        C6496s.h(gVar, "db");
        g(gVar, i10, i11);
    }

    public void f(g gVar) {
        C6496s.h(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f26758d.d(gVar);
        this.f26757c = null;
    }

    public void g(g gVar, int i10, int i11) {
        List<C2756b> d10;
        C6496s.h(gVar, "db");
        C2714f fVar = this.f26757c;
        if (fVar == null || (d10 = fVar.f26638d.d(i10, i11)) == null) {
            C2714f fVar2 = this.f26757c;
            if (fVar2 == null || fVar2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f26758d.b(gVar);
            this.f26758d.a(gVar);
            return;
        }
        this.f26758d.f(gVar);
        for (C2756b a10 : d10) {
            a10.a(gVar);
        }
        c g10 = this.f26758d.g(gVar);
        if (g10.f26762a) {
            this.f26758d.e(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Migration didn't properly handle: " + g10.f26763b);
    }
}
