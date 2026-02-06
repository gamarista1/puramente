package Z4;

import T4.i;
import Z4.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

public class s implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f35927a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f35928b;

    public s(Resources resources, n nVar) {
        this.f35928b = resources;
        this.f35927a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f35928b.getResourcePackageName(num.intValue()) + '/' + this.f35928b.getResourceTypeName(num.intValue()) + '/' + this.f35928b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    /* renamed from: c */
    public n.a a(Integer num, int i10, int i11, i iVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f35927a.a(d10, i10, i11, iVar);
    }

    /* renamed from: e */
    public boolean b(Integer num) {
        return true;
    }

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f35929a;

        public a(Resources resources) {
            this.f35929a = resources;
        }

        public n c(r rVar) {
            return new s(this.f35929a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f35930a;

        public b(Resources resources) {
            this.f35930a = resources;
        }

        public n c(r rVar) {
            return new s(this.f35930a, rVar.d(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public static class c implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f35931a;

        public c(Resources resources) {
            this.f35931a = resources;
        }

        public n c(r rVar) {
            return new s(this.f35931a, w.c());
        }

        public void teardown() {
        }
    }
}
