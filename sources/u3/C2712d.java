package u3;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import y3.e;
import y3.f;
import y3.g;
import y3.h;
import y3.j;
import y3.k;
import yf.C6798l;

/* renamed from: u3.d  reason: case insensitive filesystem */
public final class C2712d implements h, C2715g {

    /* renamed from: a  reason: collision with root package name */
    private final h f26607a;

    /* renamed from: b  reason: collision with root package name */
    public final C2711c f26608b;

    /* renamed from: c  reason: collision with root package name */
    private final a f26609c;

    /* renamed from: u3.d$a */
    public static final class a implements y3.g {

        /* renamed from: a  reason: collision with root package name */
        private final C2711c f26610a;

        /* renamed from: u3.d$a$a  reason: collision with other inner class name */
        static final class C0439a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0439a f26611a = new C0439a();

            C0439a() {
                super(1);
            }

            /* renamed from: a */
            public final List invoke(y3.g gVar) {
                C6496s.h(gVar, "obj");
                return gVar.w();
            }
        }

        /* renamed from: u3.d$a$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f26612a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f26612a = str;
            }

            /* renamed from: a */
            public final Object invoke(y3.g gVar) {
                C6496s.h(gVar, "db");
                gVar.z(this.f26612a);
                return null;
            }
        }

        /* renamed from: u3.d$a$c */
        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f26613a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object[] f26614b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f26613a = str;
                this.f26614b = objArr;
            }

            /* renamed from: a */
            public final Object invoke(y3.g gVar) {
                C6496s.h(gVar, "db");
                gVar.R(this.f26613a, this.f26614b);
                return null;
            }
        }

        /* renamed from: u3.d$a$d  reason: collision with other inner class name */
        /* synthetic */ class C0440d extends C6494p implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0440d f26615a = new C0440d();

            C0440d() {
                super(1, y3.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* renamed from: i */
            public final Boolean invoke(y3.g gVar) {
                C6496s.h(gVar, "p0");
                return Boolean.valueOf(gVar.o1());
            }
        }

        /* renamed from: u3.d$a$e */
        static final class e extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final e f26616a = new e();

            e() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(y3.g gVar) {
                C6496s.h(gVar, "db");
                return Boolean.valueOf(gVar.q1());
            }
        }

        /* renamed from: u3.d$a$f */
        static final class f extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final f f26617a = new f();

            f() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(y3.g gVar) {
                C6496s.h(gVar, "obj");
                return gVar.m();
            }
        }

        /* renamed from: u3.d$a$g */
        static final class g extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final g f26618a = new g();

            g() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(y3.g gVar) {
                C6496s.h(gVar, "it");
                return null;
            }
        }

        /* renamed from: u3.d$a$h */
        static final class h extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f26619a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f26620b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ContentValues f26621c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f26622d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object[] f26623e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f26619a = str;
                this.f26620b = i10;
                this.f26621c = contentValues;
                this.f26622d = str2;
                this.f26623e = objArr;
            }

            /* renamed from: a */
            public final Integer invoke(y3.g gVar) {
                C6496s.h(gVar, "db");
                return Integer.valueOf(gVar.S0(this.f26619a, this.f26620b, this.f26621c, this.f26622d, this.f26623e));
            }
        }

        public a(C2711c cVar) {
            C6496s.h(cVar, "autoCloser");
            this.f26610a = cVar;
        }

        public k G0(String str) {
            C6496s.h(str, "sql");
            return new b(str, this.f26610a);
        }

        public void R(String str, Object[] objArr) {
            C6496s.h(str, "sql");
            C6496s.h(objArr, "bindArgs");
            this.f26610a.g(new c(str, objArr));
        }

        public void S() {
            try {
                this.f26610a.j().S();
            } catch (Throwable th2) {
                this.f26610a.e();
                throw th2;
            }
        }

        public int S0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
            C6496s.h(str, "table");
            C6496s.h(contentValues, "values");
            return ((Number) this.f26610a.g(new h(str, i10, contentValues, str2, objArr))).intValue();
        }

        public final void a() {
            this.f26610a.g(g.f26618a);
        }

        public Cursor a1(String str) {
            C6496s.h(str, "query");
            try {
                return new c(this.f26610a.j().a1(str), this.f26610a);
            } catch (Throwable th2) {
                this.f26610a.e();
                throw th2;
            }
        }

        public Cursor b0(j jVar, CancellationSignal cancellationSignal) {
            C6496s.h(jVar, "query");
            try {
                return new c(this.f26610a.j().b0(jVar, cancellationSignal), this.f26610a);
            } catch (Throwable th2) {
                this.f26610a.e();
                throw th2;
            }
        }

        public void close() {
            this.f26610a.d();
        }

        public void g() {
            try {
                this.f26610a.j().g();
            } catch (Throwable th2) {
                this.f26610a.e();
                throw th2;
            }
        }

        public boolean isOpen() {
            y3.g h10 = this.f26610a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        public void j() {
            C6514M m10;
            y3.g h10 = this.f26610a.h();
            if (h10 != null) {
                h10.j();
                m10 = C6514M.f71813a;
            } else {
                m10 = null;
            }
            if (m10 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        public Cursor j1(j jVar) {
            C6496s.h(jVar, "query");
            try {
                return new c(this.f26610a.j().j1(jVar), this.f26610a);
            } catch (Throwable th2) {
                this.f26610a.e();
                throw th2;
            }
        }

        public void k() {
            if (this.f26610a.h() != null) {
                try {
                    y3.g h10 = this.f26610a.h();
                    C6496s.e(h10);
                    h10.k();
                } finally {
                    this.f26610a.e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public String m() {
            return (String) this.f26610a.g(f.f26617a);
        }

        public boolean o1() {
            if (this.f26610a.h() == null) {
                return false;
            }
            return ((Boolean) this.f26610a.g(C0440d.f26615a)).booleanValue();
        }

        public boolean q1() {
            return ((Boolean) this.f26610a.g(e.f26616a)).booleanValue();
        }

        public List w() {
            return (List) this.f26610a.g(C0439a.f26611a);
        }

        public void z(String str) {
            C6496s.h(str, "sql");
            this.f26610a.g(new b(str));
        }
    }

    /* renamed from: u3.d$c */
    private static final class c implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f26631a;

        /* renamed from: b  reason: collision with root package name */
        private final C2711c f26632b;

        public c(Cursor cursor, C2711c cVar) {
            C6496s.h(cursor, "delegate");
            C6496s.h(cVar, "autoCloser");
            this.f26631a = cursor;
            this.f26632b = cVar;
        }

        public void close() {
            this.f26631a.close();
            this.f26632b.e();
        }

        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f26631a.copyStringToBuffer(i10, charArrayBuffer);
        }

        public void deactivate() {
            this.f26631a.deactivate();
        }

        public byte[] getBlob(int i10) {
            return this.f26631a.getBlob(i10);
        }

        public int getColumnCount() {
            return this.f26631a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f26631a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f26631a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i10) {
            return this.f26631a.getColumnName(i10);
        }

        public String[] getColumnNames() {
            return this.f26631a.getColumnNames();
        }

        public int getCount() {
            return this.f26631a.getCount();
        }

        public double getDouble(int i10) {
            return this.f26631a.getDouble(i10);
        }

        public Bundle getExtras() {
            return this.f26631a.getExtras();
        }

        public float getFloat(int i10) {
            return this.f26631a.getFloat(i10);
        }

        public int getInt(int i10) {
            return this.f26631a.getInt(i10);
        }

        public long getLong(int i10) {
            return this.f26631a.getLong(i10);
        }

        public Uri getNotificationUri() {
            return y3.c.a(this.f26631a);
        }

        public List getNotificationUris() {
            return f.a(this.f26631a);
        }

        public int getPosition() {
            return this.f26631a.getPosition();
        }

        public short getShort(int i10) {
            return this.f26631a.getShort(i10);
        }

        public String getString(int i10) {
            return this.f26631a.getString(i10);
        }

        public int getType(int i10) {
            return this.f26631a.getType(i10);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f26631a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f26631a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f26631a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f26631a.isClosed();
        }

        public boolean isFirst() {
            return this.f26631a.isFirst();
        }

        public boolean isLast() {
            return this.f26631a.isLast();
        }

        public boolean isNull(int i10) {
            return this.f26631a.isNull(i10);
        }

        public boolean move(int i10) {
            return this.f26631a.move(i10);
        }

        public boolean moveToFirst() {
            return this.f26631a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f26631a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f26631a.moveToNext();
        }

        public boolean moveToPosition(int i10) {
            return this.f26631a.moveToPosition(i10);
        }

        public boolean moveToPrevious() {
            return this.f26631a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f26631a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f26631a.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f26631a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f26631a.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            C6496s.h(bundle, "extras");
            e.a(this.f26631a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f26631a.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List list) {
            C6496s.h(contentResolver, "cr");
            C6496s.h(list, "uris");
            f.b(this.f26631a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f26631a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f26631a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C2712d(h hVar, C2711c cVar) {
        C6496s.h(hVar, "delegate");
        C6496s.h(cVar, "autoCloser");
        this.f26607a = hVar;
        this.f26608b = cVar;
        cVar.k(a());
        this.f26609c = new a(cVar);
    }

    public g X0() {
        this.f26609c.a();
        return this.f26609c;
    }

    public h a() {
        return this.f26607a;
    }

    public void close() {
        this.f26609c.close();
    }

    public String getDatabaseName() {
        return this.f26607a.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f26607a.setWriteAheadLoggingEnabled(z10);
    }

    /* renamed from: u3.d$b */
    private static final class b implements k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f26624a;

        /* renamed from: b  reason: collision with root package name */
        private final C2711c f26625b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f26626c = new ArrayList();

        /* renamed from: u3.d$b$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f26627a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final Long invoke(k kVar) {
                C6496s.h(kVar, "obj");
                return Long.valueOf(kVar.w0());
            }
        }

        /* renamed from: u3.d$b$b  reason: collision with other inner class name */
        static final class C0441b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f26628a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f26629b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0441b(b bVar, C6798l lVar) {
                super(1);
                this.f26628a = bVar;
                this.f26629b = lVar;
            }

            /* renamed from: a */
            public final Object invoke(g gVar) {
                C6496s.h(gVar, "db");
                k G02 = gVar.G0(this.f26628a.f26624a);
                this.f26628a.f(G02);
                return this.f26629b.invoke(G02);
            }
        }

        /* renamed from: u3.d$b$c */
        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final c f26630a = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final Integer invoke(k kVar) {
                C6496s.h(kVar, "obj");
                return Integer.valueOf(kVar.C());
            }
        }

        public b(String str, C2711c cVar) {
            C6496s.h(str, "sql");
            C6496s.h(cVar, "autoCloser");
            this.f26624a = str;
            this.f26625b = cVar;
        }

        /* access modifiers changed from: private */
        public final void f(k kVar) {
            Iterator it = this.f26626c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                Object obj = this.f26626c.get(i10);
                if (obj == null) {
                    kVar.i1(i11);
                } else if (obj instanceof Long) {
                    kVar.Q0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.G(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.C0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.U0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object n(C6798l lVar) {
            return this.f26625b.g(new C0441b(this, lVar));
        }

        private final void o(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f26626c.size() && (size = this.f26626c.size()) <= i11) {
                while (true) {
                    this.f26626c.add((Object) null);
                    if (size == i11) {
                        break;
                    }
                    size++;
                }
            }
            this.f26626c.set(i11, obj);
        }

        public int C() {
            return ((Number) n(c.f26630a)).intValue();
        }

        public void C0(int i10, String str) {
            C6496s.h(str, "value");
            o(i10, str);
        }

        public void G(int i10, double d10) {
            o(i10, Double.valueOf(d10));
        }

        public void Q0(int i10, long j10) {
            o(i10, Long.valueOf(j10));
        }

        public void U0(int i10, byte[] bArr) {
            C6496s.h(bArr, "value");
            o(i10, bArr);
        }

        public void i1(int i10) {
            o(i10, (Object) null);
        }

        public long w0() {
            return ((Number) n(a.f26627a)).longValue();
        }

        public void close() {
        }
    }
}
