package Z4;

import T4.i;
import Z4.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

public class v implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f35937a;

    public v(n nVar) {
        this.f35937a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return f(str);
        }
        return parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public n.a a(String str, int i10, int i11, i iVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f35937a.b(e10)) {
            return null;
        }
        return this.f35937a.a(e10, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(String str) {
        return true;
    }

    public static final class a implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class b implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class c implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }
}
