package M1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final a f4296a;

    a(a aVar) {
        this.f4296a = aVar;
    }

    public static a g(Context context, Uri uri) {
        return new c((a) null, context, uri);
    }

    public static a h(Context context, Uri uri) {
        return new d((a) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(String str);

    public abstract a d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    public abstract Uri j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract a[] m();
}
