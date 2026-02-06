package Hb;

import Lb.C;
import Lb.C4368b;
import Lb.C4373g;
import Lb.l;
import Nb.f;
import Nb.h;
import Ob.d;
import Ob.e;
import Ob.g;
import Qb.i;
import Tb.m;
import Tb.n;
import Tb.o;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.adjust.sdk.Constants;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.NotificationStatuses;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class q implements f {

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f50893e = Charset.forName(Constants.ENCODING);

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f50894a;

    /* renamed from: b  reason: collision with root package name */
    private final Sb.c f50895b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50896c;

    /* renamed from: d  reason: collision with root package name */
    private long f50897d = 0;

    class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f50898a;

        a(d dVar) {
            this.f50898a = dVar;
        }

        /* renamed from: b */
        public Integer a(l lVar, Void voidR, Integer num) {
            int i10;
            if (this.f50898a.n(lVar) == null) {
                i10 = num.intValue() + 1;
            } else {
                i10 = num.intValue();
            }
            return Integer.valueOf(i10);
        }
    }

    class b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f50900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50901b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f50902c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f50903d;

        b(d dVar, List list, l lVar, n nVar) {
            this.f50900a = dVar;
            this.f50901b = list;
            this.f50902c = lVar;
            this.f50903d = nVar;
        }

        /* renamed from: b */
        public Void a(l lVar, Void voidR, Void voidR2) {
            if (this.f50900a.n(lVar) != null) {
                return null;
            }
            this.f50901b.add(new g(this.f50902c.t(lVar), this.f50903d.U(lVar)));
            return null;
        }
    }

    private static class c extends SQLiteOpenHelper {
        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            boolean z10;
            if (i11 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Ob.l.g(z10, "Why is onUpgrade() called with a different version?");
            if (i10 <= 1) {
                a(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                a(sQLiteDatabase, NotificationStatuses.COMPLETE_STATUS);
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
                return;
            }
            throw new AssertionError("We don't handle upgrading to " + i11);
        }
    }

    public q(Context context, C4373g gVar, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f50895b = gVar.q("Persistence");
            this.f50894a = B(context, encode);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private Cursor A(l lVar, String[] strArr) {
        String E10 = E(lVar);
        String D10 = D(E10);
        String[] strArr2 = new String[(lVar.size() + 3)];
        String str = e(lVar, strArr2) + " OR (path > ? AND path < ?)";
        strArr2[lVar.size() + 1] = E10;
        strArr2[lVar.size() + 2] = D10;
        return this.f50894a.query("serverCache", strArr, str, strArr2, (String) null, (String) null, "path");
    }

    private SQLiteDatabase B(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new c(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", (String[]) null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e10) {
            if (e10 instanceof SQLiteDatabaseLockedException) {
                throw new Gb.c("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e10);
            }
            throw e10;
        }
    }

    private String C(l lVar, int i10) {
        return E(lVar) + String.format(Locale.US, ".part-%04d", new Object[]{Integer.valueOf(i10)});
    }

    private static String D(String str) {
        Ob.l.g(str.endsWith("/"), "Path keys must end with a '/'");
        return str.substring(0, str.length() - 1) + '0';
    }

    private static String E(l lVar) {
        if (lVar.isEmpty()) {
            return "/";
        }
        return lVar.toString() + "/";
    }

    private void F(l lVar, l lVar2, d dVar, d dVar2, Nb.g gVar, List list) {
        d dVar3 = dVar2;
        Nb.g gVar2 = gVar;
        if (dVar.getValue() != null) {
            Integer num = (Integer) gVar2.b(0, new a(dVar3));
            if (num.intValue() > 0) {
                l t10 = lVar.t(lVar2);
                if (this.f50895b.f()) {
                    this.f50895b.b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", new Object[]{num, t10}), new Object[0]);
                }
                gVar2.b((Object) null, new b(dVar2, list, lVar2, z(t10)));
                return;
            }
            return;
        }
        Iterator it = dVar.t().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tb.b bVar = (Tb.b) entry.getKey();
            Nb.g a10 = gVar2.a((Tb.b) entry.getKey());
            l lVar3 = lVar2;
            d r10 = dVar3.r(bVar);
            F(lVar, lVar2.x(bVar), (d) entry.getValue(), r10, a10, list);
        }
    }

    private int G(String str, l lVar) {
        String E10 = E(lVar);
        return this.f50894a.delete(str, "path >= ? AND path < ?", new String[]{E10, D(E10)});
    }

    private int H(l lVar, n nVar) {
        long b10 = e.b(nVar);
        if (!(nVar instanceof Tb.c) || b10 <= 16384) {
            I(lVar, nVar);
            return 1;
        }
        int i10 = 0;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[]{lVar, Long.valueOf(b10), 16384}), new Object[0]);
        }
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            i10 += H(lVar.x(mVar.c()), mVar.d());
        }
        if (!nVar.q().isEmpty()) {
            I(lVar.x(Tb.b.l()), nVar.q());
            i10++;
        }
        I(lVar, Tb.g.A());
        return i10 + 1;
    }

    private void I(l lVar, n nVar) {
        byte[] K10 = K(nVar.K(true));
        if (K10.length >= 262144) {
            List L10 = L(K10, 262144);
            if (this.f50895b.f()) {
                Sb.c cVar = this.f50895b;
                cVar.b("Saving huge leaf node with " + L10.size() + " parts.", new Object[0]);
            }
            for (int i10 = 0; i10 < L10.size(); i10++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", C(lVar, i10));
                contentValues.put("value", (byte[]) L10.get(i10));
                this.f50894a.insertWithOnConflict("serverCache", (String) null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", E(lVar));
        contentValues2.put("value", K10);
        this.f50894a.insertWithOnConflict("serverCache", (String) null, contentValues2, 5);
    }

    private void J(l lVar, long j10, String str, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = bArr;
        O();
        this.f50894a.delete("writes", "id = ?", new String[]{String.valueOf(j10)});
        if (bArr2.length >= 262144) {
            List L10 = L(bArr2, 262144);
            for (int i10 = 0; i10 < L10.size(); i10++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j10));
                contentValues.put("path", E(lVar));
                contentValues.put("type", str2);
                contentValues.put("part", Integer.valueOf(i10));
                contentValues.put("node", (byte[]) L10.get(i10));
                this.f50894a.insertWithOnConflict("writes", (String) null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j10));
        contentValues2.put("path", E(lVar));
        contentValues2.put("type", str2);
        contentValues2.put("part", (Integer) null);
        contentValues2.put("node", bArr2);
        this.f50894a.insertWithOnConflict("writes", (String) null, contentValues2, 5);
    }

    private byte[] K(Object obj) {
        try {
            return Vb.b.d(obj).getBytes(f50893e);
        } catch (IOException e10) {
            throw new RuntimeException("Could not serialize leaf node", e10);
        }
    }

    private static List L(byte[] bArr, int i10) {
        int length = ((bArr.length - 1) / i10) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * i10;
            int min = Math.min(i10, bArr.length - i12);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i12, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    private int M(l lVar, List list, int i10) {
        int i11 = i10 + 1;
        String E10 = E(lVar);
        if (((String) list.get(i10)).startsWith(E10)) {
            while (i11 < list.size() && ((String) list.get(i11)).equals(C(lVar, i11 - i10))) {
                i11++;
            }
            if (i11 < list.size()) {
                if (((String) list.get(i11)).startsWith(E10 + ".part-")) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i11 - i10;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private void N(l lVar, n nVar, boolean z10) {
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z10) {
            i10 = G("serverCache", lVar);
            i11 = H(lVar, nVar);
        } else {
            Iterator it = nVar.iterator();
            int i12 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                m mVar = (m) it.next();
                i13 += G("serverCache", lVar.x(mVar.c()));
                i12 += H(lVar.x(mVar.c()), mVar.d());
            }
            i11 = i12;
            i10 = i13;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[]{Integer.valueOf(i11), Integer.valueOf(i10), lVar.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    private void O() {
        Ob.l.g(this.f50896c, "Transaction expected to already be in progress.");
    }

    private static String e(l lVar, String[] strArr) {
        boolean z10 = true;
        int i10 = 0;
        if (strArr.length < lVar.size() + 1) {
            z10 = false;
        }
        Ob.l.f(z10);
        StringBuilder sb2 = new StringBuilder("(");
        while (!lVar.isEmpty()) {
            sb2.append("path");
            sb2.append(" = ? OR ");
            strArr[i10] = E(lVar);
            lVar = lVar.H();
            i10++;
        }
        sb2.append("path");
        sb2.append(" = ?)");
        strArr[i10] = E(l.D());
        return sb2.toString();
    }

    private String f(Collection collection) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (!z10) {
                sb2.append(com.amazon.a.a.o.b.f.f37529a);
            }
            sb2.append(longValue);
            z10 = false;
        }
        return sb2.toString();
    }

    private n h(byte[] bArr) {
        try {
            return o.a(Vb.b.b(new String(bArr, f50893e)));
        } catch (IOException e10) {
            String str = new String(bArr, f50893e);
            throw new RuntimeException("Could not deserialize node: " + str, e10);
        }
    }

    private byte[] i(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[i10];
        Iterator it2 = list.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: finally extract failed */
    private n z(l lVar) {
        long j10;
        l lVar2;
        n nVar;
        int i10;
        l lVar3;
        l lVar4 = lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor A10 = A(lVar4, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (A10.moveToNext()) {
            try {
                arrayList.add(A10.getString(0));
                arrayList2.add(A10.getBlob(1));
            } catch (Throwable th2) {
                A10.close();
                throw th2;
            }
        }
        A10.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        n A11 = Tb.g.A();
        HashMap hashMap = new HashMap();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < arrayList2.size()) {
            long j11 = currentTimeMillis4;
            if (((String) arrayList.get(i11)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i11);
                j10 = currentTimeMillis2;
                l lVar5 = new l(str.substring(0, str.length() - 10));
                int M10 = M(lVar5, arrayList, i11);
                if (this.f50895b.f()) {
                    lVar3 = lVar5;
                    this.f50895b.b("Loading split node with " + M10 + " parts.", new Object[0]);
                } else {
                    lVar3 = lVar5;
                }
                int i12 = M10 + i11;
                nVar = h(i(arrayList2.subList(i11, i12)));
                i11 = i12 - 1;
                lVar2 = lVar3;
            } else {
                j10 = currentTimeMillis2;
                nVar = h((byte[]) arrayList2.get(i11));
                lVar2 = new l((String) arrayList.get(i11));
            }
            if (lVar2.C() != null && lVar2.C().p()) {
                hashMap.put(lVar2, nVar);
            } else if (lVar2.A(lVar4)) {
                Ob.l.g(!z10, "Descendants of path must come after ancestors.");
                A11 = nVar.U(l.I(lVar2, lVar4));
            } else if (lVar4.A(lVar2)) {
                A11 = A11.Y(l.I(lVar4, lVar2), nVar);
                i10 = 1;
                z10 = true;
                i11 += i10;
                currentTimeMillis4 = j11;
                currentTimeMillis2 = j10;
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[]{lVar2, lVar4}));
            }
            i10 = 1;
            i11 += i10;
            currentTimeMillis4 = j11;
            currentTimeMillis2 = j10;
        }
        long j12 = currentTimeMillis2;
        long j13 = currentTimeMillis4;
        n nVar2 = A11;
        for (Map.Entry entry : hashMap.entrySet()) {
            nVar2 = nVar2.Y(l.I(lVar4, (l) entry.getKey()), (n) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(e.c(nVar2)), lVar, Long.valueOf(currentTimeMillis7), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(currentTimeMillis6)}), new Object[0]);
        }
        return nVar2;
    }

    public List a() {
        byte[] bArr;
        C c10;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f50894a.query("writes", new String[]{"id", "path", "type", "part", "node"}, (String) null, (String[]) null, (String) null, (String) null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                l lVar = new l(query.getString(1));
                String string = query.getString(2);
                if (query.isNull(3)) {
                    bArr = query.getBlob(4);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        arrayList2.add(query.getBlob(4));
                        if (!query.moveToNext() || query.getLong(0) != j10) {
                            query.moveToPrevious();
                            bArr = i(arrayList2);
                        }
                        arrayList2.add(query.getBlob(4));
                        break;
                    } while (query.getLong(0) != j10);
                    query.moveToPrevious();
                    bArr = i(arrayList2);
                }
                Object b10 = Vb.b.b(new String(bArr, f50893e));
                if ("o".equals(string)) {
                    c10 = new C(j10, lVar, o.a(b10), true);
                } else if ("m".equals(string)) {
                    c10 = new C(j10, lVar, C4368b.t((Map) b10));
                } else {
                    throw new IllegalStateException("Got invalid write type: " + string);
                }
                arrayList.add(c10);
            } catch (IOException e10) {
                throw new RuntimeException("Failed to load writes", e10);
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Loaded %d writes in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void b(long j10) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f50894a.delete("writes", "id = ?", new String[]{String.valueOf(j10)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(j10), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void c(l lVar, n nVar, long j10) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        J(lVar, j10, "o", K(nVar.K(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Persisted user overwrite in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void d(l lVar, C4368b bVar, long j10) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        J(lVar, j10, "m", K(bVar.z(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Persisted user merge in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void g() {
        Ob.l.g(!this.f50896c, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f50895b.f()) {
            this.f50895b.b("Starting transaction.", new Object[0]);
        }
        this.f50894a.beginTransaction();
        this.f50896c = true;
        this.f50897d = System.currentTimeMillis();
    }

    public void j() {
        this.f50894a.setTransactionSuccessful();
    }

    public void k() {
        this.f50894a.endTransaction();
        this.f50896c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f50897d;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void l(long j10) {
        O();
        String valueOf = String.valueOf(j10);
        this.f50894a.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.f50894a.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    public void m(l lVar, n nVar) {
        O();
        N(lVar, nVar, true);
    }

    public Set n(Set set) {
        String[] strArr = {SubscriberAttributeKt.JSON_NAME_KEY};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f50894a.query(true, "trackedKeys", strArr, "id IN (" + f(set) + ")", (String[]) null, (String) null, (String) null, (String) null, (String) null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(Tb.b.e(query.getString(0)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", new Object[]{Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return hashSet;
    }

    public void o(l lVar, C4368b bVar) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = bVar.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += G("serverCache", lVar.t((l) entry.getKey()));
            i11 += H(lVar.t((l) entry.getKey()), (n) entry.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[]{Integer.valueOf(i11), Integer.valueOf(i10), lVar.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void p(long j10) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j10));
        this.f50894a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Reset active tracked queries in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void q(h hVar) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(hVar.f52080a));
        contentValues.put("path", E(hVar.f52081b.e()));
        contentValues.put("queryParams", hVar.f52081b.d().y());
        contentValues.put("lastUse", Long.valueOf(hVar.f52082c));
        contentValues.put(NotificationStatuses.COMPLETE_STATUS, Boolean.valueOf(hVar.f52083d));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(hVar.f52084e));
        this.f50894a.insertWithOnConflict("trackedQueries", (String) null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Saved new tracked query in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public long r() {
        Cursor rawQuery = this.f50894a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[]{"value", "path", "serverCache"}), (String[]) null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    public void s(l lVar, n nVar) {
        O();
        N(lVar, nVar, false);
    }

    public Set t(long j10) {
        return n(Collections.singleton(Long.valueOf(j10)));
    }

    public void u(long j10, Set set) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        this.f50894a.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j10)});
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j10));
            contentValues.put(SubscriberAttributeKt.JSON_NAME_KEY, ((Tb.b) it.next()).b());
            this.f50894a.insertWithOnConflict("trackedKeys", (String) null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", new Object[]{Integer.valueOf(set.size()), Long.valueOf(j10), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void v(l lVar, Nb.g gVar) {
        int i10;
        int i11;
        l lVar2 = lVar;
        Nb.g gVar2 = gVar;
        if (gVar.e()) {
            O();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor A10 = A(lVar2, new String[]{"rowid", "path"});
            d dVar = new d((Object) null);
            d dVar2 = new d((Object) null);
            while (A10.moveToNext()) {
                long j10 = A10.getLong(0);
                l lVar3 = new l(A10.getString(1));
                if (!lVar2.A(lVar3)) {
                    this.f50895b.i("We are pruning at " + lVar2 + " but we have data stored higher up at " + lVar3 + ". Ignoring.");
                } else {
                    l I10 = l.I(lVar2, lVar3);
                    if (gVar2.g(I10)) {
                        dVar = dVar.C(I10, Long.valueOf(j10));
                    } else if (gVar2.f(I10)) {
                        dVar2 = dVar2.C(I10, Long.valueOf(j10));
                    } else {
                        this.f50895b.i("We are pruning at " + lVar2 + " and have data at " + lVar3 + " that isn't marked for pruning or keeping. Ignoring.");
                    }
                }
            }
            if (!dVar.isEmpty()) {
                ArrayList<g> arrayList = new ArrayList<>();
                F(lVar, l.D(), dVar, dVar2, gVar, arrayList);
                Collection H10 = dVar.H();
                this.f50894a.delete("serverCache", "rowid IN (" + f(H10) + ")", (String[]) null);
                for (g gVar3 : arrayList) {
                    H(lVar2.t((l) gVar3.a()), (n) gVar3.b());
                }
                i11 = H10.size();
                i10 = arrayList.size();
            } else {
                i11 = 0;
                i10 = 0;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.f50895b.f()) {
                this.f50895b.b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", new Object[]{Integer.valueOf(i11), Integer.valueOf(i10), Long.valueOf(currentTimeMillis2)}), new Object[0]);
            }
        }
    }

    public List w() {
        boolean z10;
        boolean z11;
        String[] strArr = {"id", "path", "queryParams", "lastUse", NotificationStatuses.COMPLETE_STATUS, AppStateModule.APP_STATE_ACTIVE};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f50894a.query("trackedQueries", strArr, (String) null, (String[]) null, (String) null, (String) null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                i b10 = i.b(new l(query.getString(1)), Vb.b.a(query.getString(2)));
                long j11 = query.getLong(3);
                if (query.getInt(4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (query.getInt(5) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList.add(new h(j10, b10, j11, z10, z11));
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Loaded %d tracked queries in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void x(long j10, Set set, Set set2) {
        O();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j10);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            this.f50894a.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, ((Tb.b) it.next()).b()});
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j10));
            contentValues.put(SubscriberAttributeKt.JSON_NAME_KEY, ((Tb.b) it2.next()).b());
            this.f50894a.insertWithOnConflict("trackedKeys", (String) null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f50895b.f()) {
            this.f50895b.b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j10), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public n y(l lVar) {
        return z(lVar);
    }
}
