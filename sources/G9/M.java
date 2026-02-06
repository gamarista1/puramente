package g9;

import W8.e;
import Y8.h;
import Y8.i;
import Y8.o;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b9.C3160a;
import b9.C3161b;
import b9.C3162c;
import b9.C3163d;
import b9.C3164e;
import b9.f;
import c9.C3193a;
import h9.C3584a;
import h9.C3585b;
import i9.C3597a;
import j9.C3644a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

public class M implements C3546d, C3585b, C3545c {

    /* renamed from: f  reason: collision with root package name */
    private static final W8.c f43691f = W8.c.b("proto");

    /* renamed from: a  reason: collision with root package name */
    private final U f43692a;

    /* renamed from: b  reason: collision with root package name */
    private final C3597a f43693b;

    /* renamed from: c  reason: collision with root package name */
    private final C3597a f43694c;

    /* renamed from: d  reason: collision with root package name */
    private final C3547e f43695d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f43696e;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f43697a;

        /* renamed from: b  reason: collision with root package name */
        final String f43698b;

        private c(String str, String str2) {
            this.f43697a = str;
            this.f43698b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(C3597a aVar, C3597a aVar2, C3547e eVar, U u10, Provider provider) {
        this.f43692a = u10;
        this.f43693b = aVar;
        this.f43694c = aVar2;
        this.f43695d = eVar;
        this.f43696e = provider;
    }

    private C3161b B1() {
        return C3161b.b().b(C3164e.c().b(z1()).c(C3547e.f43730a.f()).a()).a();
    }

    private long C1() {
        return A1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long D1() {
        return A1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f E1() {
        return (f) G1(new C(this.f43693b.a()));
    }

    private Long F1(SQLiteDatabase sQLiteDatabase, o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.b(), String.valueOf(C3644a.a(oVar.d()))}));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) q2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C3556n());
    }

    private boolean H1() {
        if (C1() * D1() >= this.f43695d.f()) {
            return true;
        }
        return false;
    }

    private List I1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C3553k kVar = (C3553k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a l10 = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    l10.c(cVar.f43697a, cVar.f43698b);
                }
                listIterator.set(C3553k.a(kVar.c(), kVar.d(), l10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object J1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b((long) i10, C3162c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer K1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        q2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C3560s(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object M1(Throwable th2) {
        throw new C3584a("Timed out while trying to acquire the lock.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase N1(Throwable th2) {
        throw new C3584a("Timed out while trying to open db.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long O1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f Q1(long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) q2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new D(j10));
    }

    private C3162c.b R0(int i10) {
        C3162c.b bVar = C3162c.b.REASON_UNKNOWN;
        if (i10 == bVar.d()) {
            return bVar;
        }
        C3162c.b bVar2 = C3162c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.d()) {
            return bVar2;
        }
        C3162c.b bVar3 = C3162c.b.CACHE_FULL;
        if (i10 == bVar3.d()) {
            return bVar3;
        }
        C3162c.b bVar4 = C3162c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.d()) {
            return bVar4;
        }
        C3162c.b bVar5 = C3162c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.d()) {
            return bVar5;
        }
        C3162c.b bVar6 = C3162c.b.INVALID_PAYLOD;
        if (i10 == bVar6.d()) {
            return bVar6;
        }
        C3162c.b bVar7 = C3162c.b.SERVER_ERROR;
        if (i10 == bVar7.d()) {
            return bVar7;
        }
        C3193a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long R1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean S1(o oVar, SQLiteDatabase sQLiteDatabase) {
        Long F12 = F1(sQLiteDatabase, oVar);
        if (F12 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) q2(A1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{F12.toString()}), new C3562u());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List T1(SQLiteDatabase sQLiteDatabase) {
        return (List) q2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new K());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List U1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(o.a().b(cursor.getString(1)).d(C3644a.b(cursor.getInt(2))).c(k2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List V1(o oVar, SQLiteDatabase sQLiteDatabase) {
        List i22 = i2(sQLiteDatabase, oVar, this.f43695d.d());
        for (e eVar : e.values()) {
            if (eVar != oVar.d()) {
                int d10 = this.f43695d.d() - i22.size();
                if (d10 <= 0) {
                    break;
                }
                i22.addAll(i2(sQLiteDatabase, oVar.f(eVar), d10));
            }
        }
        return I1(i22, j2(sQLiteDatabase, i22));
    }

    private void W0(SQLiteDatabase sQLiteDatabase) {
        n2(new C3554l(sQLiteDatabase), new w());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C3160a W1(Map map, C3160a.C0595a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C3162c.b R02 = R0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C3162c.c().c(R02).b(j10).a());
        }
        l2(aVar, map);
        aVar.e(E1());
        aVar.d(B1());
        aVar.c((String) this.f43696e.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C3160a X1(String str, Map map, C3160a.C0595a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C3160a) q2(sQLiteDatabase.rawQuery(str, new String[0]), new C3541A(this, map, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object Y1(List list, o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a k10 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new h(o2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new h(o2(cursor.getString(4)), m2(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C3553k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object Z1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long a2(i iVar, o oVar, SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        byte[] bArr;
        if (H1()) {
            b(1, C3162c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long n12 = n1(sQLiteDatabase, oVar);
        int e10 = this.f43695d.e();
        byte[] a10 = iVar.e().a();
        if (a10.length <= e10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(n12));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        if (z10) {
            bArr = a10;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] b2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object c2(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b((long) i10, C3162c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        q2(sQLiteDatabase.rawQuery(str2, (String[]) null), new C3563v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean e2(Cursor cursor) {
        boolean z10;
        if (cursor.getCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object f2(String str, C3162c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) q2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), new y())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.d()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g2(long j10, o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(C3644a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(C3644a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object h2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f43693b.a()).execute();
        return null;
    }

    private List i2(SQLiteDatabase sQLiteDatabase, o oVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long F12 = F1(sQLiteDatabase, oVar);
        if (F12 == null) {
            return arrayList;
        }
        q2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{F12.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new x(this, arrayList, oVar));
        return arrayList;
    }

    private Map j2(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((C3553k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        q2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new z(hashMap));
        return hashMap;
    }

    private static byte[] k2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void l2(C3160a.C0595a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(C3163d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] m2(long j10) {
        return (byte[]) q2(A1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), new C3542B());
    }

    private long n1(SQLiteDatabase sQLiteDatabase, o oVar) {
        Long F12 = F1(sQLiteDatabase, oVar);
        if (F12 != null) {
            return F12.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(C3644a.a(oVar.d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private Object n2(d dVar, b bVar) {
        long a10 = this.f43694c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f43694c.a() >= ((long) this.f43695d.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static W8.c o2(String str) {
        if (str == null) {
            return f43691f;
        }
        return W8.c.b(str);
    }

    private static String p2(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C3553k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object q2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase A1() {
        U u10 = this.f43692a;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) n2(new E(u10), new F());
    }

    /* access modifiers changed from: package-private */
    public Object G1(b bVar) {
        SQLiteDatabase A12 = A1();
        A12.beginTransaction();
        try {
            Object apply = bVar.apply(A12);
            A12.setTransactionSuccessful();
            return apply;
        } finally {
            A12.endTransaction();
        }
    }

    public Iterable H(o oVar) {
        return (Iterable) G1(new C3555m(this, oVar));
    }

    public Iterable J() {
        return (Iterable) G1(new G());
    }

    public void a() {
        G1(new C3559q(this));
    }

    public void b(long j10, C3162c.b bVar, String str) {
        G1(new r(str, bVar, j10));
    }

    public void c0(o oVar, long j10) {
        G1(new C3558p(j10, oVar));
    }

    public void close() {
        this.f43692a.close();
    }

    public C3160a f() {
        return (C3160a) G1(new C3561t(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C3160a.e()));
    }

    public C3553k g1(o oVar, i iVar) {
        C3193a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) G1(new I(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C3553k.a(longValue, oVar, iVar);
    }

    public int h() {
        return ((Integer) G1(new J(this, this.f43693b.a() - this.f43695d.c()))).intValue();
    }

    public Object n(C3585b.a aVar) {
        SQLiteDatabase A12 = A1();
        W0(A12);
        try {
            Object b10 = aVar.b();
            A12.setTransactionSuccessful();
            return b10;
        } finally {
            A12.endTransaction();
        }
    }

    public void s0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            G1(new L(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + p2(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public long s1(o oVar) {
        return ((Long) q2(A1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(C3644a.a(oVar.d()))}), new H())).longValue();
    }

    public void u(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            A1().compileStatement("DELETE FROM events WHERE _id in " + p2(iterable)).execute();
        }
    }

    public boolean w1(o oVar) {
        return ((Boolean) G1(new C3557o(this, oVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public long z1() {
        return C1() * D1();
    }
}
