package M1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

class d extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f4299b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f4300c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f4299b = context;
        this.f4300c = uri;
    }

    private static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean a() {
        return b.a(this.f4299b, this.f4300c);
    }

    public boolean b() {
        return b.b(this.f4299b, this.f4300c);
    }

    public a c(String str) {
        Uri o10 = o(this.f4299b, this.f4300c, "vnd.android.document/directory", str);
        if (o10 != null) {
            return new d(this, this.f4299b, o10);
        }
        return null;
    }

    public a d(String str, String str2) {
        Uri o10 = o(this.f4299b, this.f4300c, str, str2);
        if (o10 != null) {
            return new d(this, this.f4299b, o10);
        }
        return null;
    }

    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f4299b.getContentResolver(), this.f4300c);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean f() {
        return b.d(this.f4299b, this.f4300c);
    }

    public String i() {
        return b.e(this.f4299b, this.f4300c);
    }

    public Uri j() {
        return this.f4300c;
    }

    public boolean k() {
        return b.g(this.f4299b, this.f4300c);
    }

    public boolean l() {
        return b.h(this.f4299b, this.f4300c);
    }

    public a[] m() {
        ContentResolver contentResolver = this.f4299b.getContentResolver();
        Uri uri = this.f4300c;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f4300c, cursor.getString(0)));
            }
        } catch (Exception e10) {
            Log.w("DocumentFile", "Failed query: " + e10);
        } catch (Throwable th2) {
            n((AutoCloseable) null);
            throw th2;
        }
        n(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        a[] aVarArr = new a[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            aVarArr[i10] = new d(this, this.f4299b, uriArr[i10]);
        }
        return aVarArr;
    }
}
