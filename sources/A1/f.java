package A1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f430a;

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f430a = new a(uri, clipDescription, uri2);
        } else {
            this.f430a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f430a.b();
    }

    public ClipDescription b() {
        return this.f430a.getDescription();
    }

    public Uri c() {
        return this.f430a.d();
    }

    public void d() {
        this.f430a.c();
    }

    public Object e() {
        return this.f430a.a();
    }

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f431a;

        a(Object obj) {
            this.f431a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f431a;
        }

        public Uri b() {
            return this.f431a.getContentUri();
        }

        public void c() {
            this.f431a.requestPermission();
        }

        public Uri d() {
            return this.f431a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f431a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f431a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f430a = cVar;
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f432a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f433b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f434c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f432a = uri;
            this.f433b = clipDescription;
            this.f434c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.f432a;
        }

        public Uri d() {
            return this.f434c;
        }

        public ClipDescription getDescription() {
            return this.f433b;
        }

        public void c() {
        }
    }
}
