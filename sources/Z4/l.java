package Z4;

import T4.i;
import Z4.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import n5.C3861d;

public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35891a;

    public l(Context context) {
        this.f35891a = context;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        return new n.a(new C3861d(uri), new b(this.f35891a, uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return U4.b.c(uri);
    }

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35892a;

        public a(Context context) {
            this.f35892a = context;
        }

        public n c(r rVar) {
            return new l(this.f35892a);
        }

        public void teardown() {
        }
    }

    private static class b implements d {

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f35893c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f35894a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f35895b;

        b(Context context, Uri uri) {
            this.f35894a = context;
            this.f35895b = uri;
        }

        public Class a() {
            return File.class;
        }

        public void d(h hVar, d.a aVar) {
            Cursor query = this.f35894a.getContentResolver().query(this.f35895b, f35893c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f35895b));
                return;
            }
            aVar.e(new File(str));
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void b() {
        }

        public void cancel() {
        }
    }
}
