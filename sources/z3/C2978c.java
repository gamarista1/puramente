package z3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.C2936a;
import y3.g;
import y3.j;
import y3.k;
import yf.r;

/* renamed from: z3.c  reason: case insensitive filesystem */
public final class C2978c implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f29298c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f29299d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f29300e = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f29301a;

    /* renamed from: b  reason: collision with root package name */
    private final List f29302b;

    /* renamed from: z3.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: z3.c$b */
    static final class b extends C6498u implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f29303a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f29303a = jVar;
        }

        /* renamed from: a */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f29303a;
            C6496s.e(sQLiteQuery);
            jVar.b(new C2982g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C2978c(SQLiteDatabase sQLiteDatabase) {
        C6496s.h(sQLiteDatabase, "delegate");
        this.f29301a = sQLiteDatabase;
        this.f29302b = sQLiteDatabase.getAttachedDbs();
    }

    /* access modifiers changed from: private */
    public static final Cursor n(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C6496s.h(rVar, "$tmp0");
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* access modifiers changed from: private */
    public static final Cursor o(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C6496s.h(jVar, "$query");
        C6496s.e(sQLiteQuery);
        jVar.b(new C2982g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public k G0(String str) {
        C6496s.h(str, "sql");
        SQLiteStatement compileStatement = this.f29301a.compileStatement(str);
        C6496s.g(compileStatement, "delegate.compileStatement(sql)");
        return new C2983h(compileStatement);
    }

    public void R(String str, Object[] objArr) {
        C6496s.h(str, "sql");
        C6496s.h(objArr, "bindArgs");
        this.f29301a.execSQL(str, objArr);
    }

    public void S() {
        this.f29301a.beginTransactionNonExclusive();
    }

    public int S0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        int i11;
        String str3;
        C6496s.h(str, "table");
        C6496s.h(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            if (objArr == null) {
                i11 = size;
            } else {
                i11 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(f29299d[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int i12 = 0;
            for (String next : contentValues.keySet()) {
                if (i12 > 0) {
                    str3 = f.f37529a;
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(next);
                objArr2[i12] = contentValues.get(next);
                sb2.append("=?");
                i12++;
            }
            if (objArr != null) {
                for (int i13 = size; i13 < i11; i13++) {
                    objArr2[i13] = objArr[i13 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            k G02 = G0(sb3);
            C2936a.f28721c.b(G02, objArr2);
            return G02.C();
        }
        throw new IllegalArgumentException("Empty values");
    }

    public Cursor a1(String str) {
        C6496s.h(str, "query");
        return j1(new C2936a(str));
    }

    public Cursor b0(j jVar, CancellationSignal cancellationSignal) {
        C6496s.h(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f29301a;
        String a10 = jVar.a();
        String[] strArr = f29300e;
        C6496s.e(cancellationSignal);
        return y3.b.c(sQLiteDatabase, a10, strArr, (String) null, cancellationSignal, new C2976a(jVar));
    }

    public void close() {
        this.f29301a.close();
    }

    public final boolean f(SQLiteDatabase sQLiteDatabase) {
        C6496s.h(sQLiteDatabase, "sqLiteDatabase");
        return C6496s.c(this.f29301a, sQLiteDatabase);
    }

    public void g() {
        this.f29301a.beginTransaction();
    }

    public boolean isOpen() {
        return this.f29301a.isOpen();
    }

    public void j() {
        this.f29301a.setTransactionSuccessful();
    }

    public Cursor j1(j jVar) {
        C6496s.h(jVar, "query");
        Cursor rawQueryWithFactory = this.f29301a.rawQueryWithFactory(new C2977b(new b(jVar)), jVar.a(), f29300e, (String) null);
        C6496s.g(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public void k() {
        this.f29301a.endTransaction();
    }

    public String m() {
        return this.f29301a.getPath();
    }

    public boolean o1() {
        return this.f29301a.inTransaction();
    }

    public boolean q1() {
        return y3.b.b(this.f29301a);
    }

    public List w() {
        return this.f29302b;
    }

    public void z(String str) {
        C6496s.h(str, "sql");
        this.f29301a.execSQL(str);
    }
}
