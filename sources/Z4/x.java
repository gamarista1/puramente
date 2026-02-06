package Z4;

import T4.i;
import Z4.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n5.C3861d;

public class x implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f35941b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a  reason: collision with root package name */
    private final c f35942a;

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public x(c cVar) {
        this.f35942a = cVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        return new n.a(new C3861d(uri), this.f35942a.a(uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return f35941b.contains(uri.getScheme());
    }

    public static final class a implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f35943a;

        public a(ContentResolver contentResolver) {
            this.f35943a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f35943a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }

        public void teardown() {
        }
    }

    public static class b implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f35944a;

        public b(ContentResolver contentResolver) {
            this.f35944a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f35944a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }

        public void teardown() {
        }
    }

    public static class d implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f35945a;

        public d(ContentResolver contentResolver) {
            this.f35945a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f35945a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }

        public void teardown() {
        }
    }
}
