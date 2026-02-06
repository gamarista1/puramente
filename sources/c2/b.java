package c2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.a;
import c2.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import u1.d;
import u1.l;

public class b extends C1893a {

    /* renamed from: o  reason: collision with root package name */
    private final c.a f19262o = new c.a();

    /* renamed from: p  reason: collision with root package name */
    private Uri f19263p;

    /* renamed from: q  reason: collision with root package name */
    private String[] f19264q;

    /* renamed from: r  reason: collision with root package name */
    private String f19265r;

    /* renamed from: s  reason: collision with root package name */
    private String[] f19266s;

    /* renamed from: t  reason: collision with root package name */
    private String f19267t;

    /* renamed from: u  reason: collision with root package name */
    private Cursor f19268u;

    /* renamed from: v  reason: collision with root package name */
    private d f19269v;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f19263p = uri;
        this.f19264q = strArr;
        this.f19265r = str;
        this.f19266s = strArr2;
        this.f19267t = str2;
    }

    public void A() {
        super.A();
        synchronized (this) {
            try {
                d dVar = this.f19269v;
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    public void f(Cursor cursor) {
        if (!k()) {
            Cursor cursor2 = this.f19268u;
            this.f19268u = cursor;
            if (l()) {
                super.f(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: K */
    public Cursor G() {
        Cursor b10;
        synchronized (this) {
            if (!F()) {
                this.f19269v = new d();
            } else {
                throw new l();
            }
        }
        try {
            b10 = a.b(i().getContentResolver(), this.f19263p, this.f19264q, this.f19265r, this.f19266s, this.f19267t, this.f19269v);
            if (b10 != null) {
                b10.getCount();
                b10.registerContentObserver(this.f19262o);
            }
            synchronized (this) {
                this.f19269v = null;
            }
            return b10;
        } catch (RuntimeException e10) {
            b10.close();
            throw e10;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f19269v = null;
                throw th2;
            }
        }
    }

    /* renamed from: L */
    public void H(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f19263p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f19264q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f19265r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f19266s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f19267t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f19268u);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        s();
        Cursor cursor = this.f19268u;
        if (cursor != null && !cursor.isClosed()) {
            this.f19268u.close();
        }
        this.f19268u = null;
    }

    /* access modifiers changed from: protected */
    public void r() {
        Cursor cursor = this.f19268u;
        if (cursor != null) {
            f(cursor);
        }
        if (y() || this.f19268u == null) {
            h();
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        b();
    }
}
