package Z4;

import T4.i;
import Z4.n;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class y implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f35946b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", Constants.SCHEME})));

    /* renamed from: a  reason: collision with root package name */
    private final n f35947a;

    public y(n nVar) {
        this.f35947a = nVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        return this.f35947a.a(new h(uri.toString()), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return f35946b.contains(uri.getScheme());
    }

    public static class a implements o {
        public n c(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }

        public void teardown() {
        }
    }
}
