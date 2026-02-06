package M1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f4297b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f4298c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f4297b = context;
        this.f4298c = uri;
    }

    public boolean a() {
        return b.a(this.f4297b, this.f4298c);
    }

    public boolean b() {
        return b.b(this.f4297b, this.f4298c);
    }

    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f4297b.getContentResolver(), this.f4298c);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean f() {
        return b.d(this.f4297b, this.f4298c);
    }

    public String i() {
        return b.e(this.f4297b, this.f4298c);
    }

    public Uri j() {
        return this.f4298c;
    }

    public boolean k() {
        return b.g(this.f4297b, this.f4298c);
    }

    public boolean l() {
        return b.h(this.f4297b, this.f4298c);
    }

    public a[] m() {
        throw new UnsupportedOperationException();
    }
}
