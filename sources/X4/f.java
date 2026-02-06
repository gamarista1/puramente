package X4;

import X4.d;
import android.content.Context;
import java.io.File;

public final class f extends d {

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f35006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35007b;

        a(Context context, String str) {
            this.f35006a = context;
            this.f35007b = str;
        }

        public File a() {
            File cacheDir = this.f35006a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f35007b != null) {
                return new File(cacheDir, this.f35007b);
            }
            return cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
