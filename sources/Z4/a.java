package Z4;

import T4.i;
import Z4.n;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import n5.C3861d;

public class a implements n {

    /* renamed from: c  reason: collision with root package name */
    private static final int f35842c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f35843a;

    /* renamed from: b  reason: collision with root package name */
    private final C0583a f35844b;

    /* renamed from: Z4.a$a  reason: collision with other inner class name */
    public interface C0583a {
        d a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, C0583a aVar) {
        this.f35843a = assetManager;
        this.f35844b = aVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        return new n.a(new C3861d(uri), this.f35844b.a(this.f35843a, uri.toString().substring(f35842c)));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public static class b implements o, C0583a {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f35845a;

        public b(AssetManager assetManager) {
            this.f35845a = assetManager;
        }

        public d a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public n c(r rVar) {
            return new a(this.f35845a, this);
        }

        public void teardown() {
        }
    }

    public static class c implements o, C0583a {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f35846a;

        public c(AssetManager assetManager) {
            this.f35846a = assetManager;
        }

        public d a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        public n c(r rVar) {
            return new a(this.f35846a, this);
        }

        public void teardown() {
        }
    }
}
