package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: androidx.core.view.d  reason: case insensitive filesystem */
public final class C1683d {

    /* renamed from: a  reason: collision with root package name */
    private final f f16061a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f16062a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f16062a = new b(clipData, i10);
            } else {
                this.f16062a = new C0285d(clipData, i10);
            }
        }

        public C1683d a() {
            return this.f16062a.f();
        }

        public a b(Bundle bundle) {
            this.f16062a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f16062a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f16062a.a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f16063a;

        b(ClipData clipData, int i10) {
            this.f16063a = C1689g.a(clipData, i10);
        }

        public void a(Uri uri) {
            ContentInfo.Builder unused = this.f16063a.setLinkUri(uri);
        }

        public void b(int i10) {
            ContentInfo.Builder unused = this.f16063a.setFlags(i10);
        }

        public C1683d f() {
            return new C1683d(new e(this.f16063a.build()));
        }

        public void setExtras(Bundle bundle) {
            ContentInfo.Builder unused = this.f16063a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C1683d f();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d  reason: collision with other inner class name */
    private static final class C0285d implements c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f16064a;

        /* renamed from: b  reason: collision with root package name */
        int f16065b;

        /* renamed from: c  reason: collision with root package name */
        int f16066c;

        /* renamed from: d  reason: collision with root package name */
        Uri f16067d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f16068e;

        C0285d(ClipData clipData, int i10) {
            this.f16064a = clipData;
            this.f16065b = i10;
        }

        public void a(Uri uri) {
            this.f16067d = uri;
        }

        public void b(int i10) {
            this.f16066c = i10;
        }

        public C1683d f() {
            return new C1683d(new g(this));
        }

        public void setExtras(Bundle bundle) {
            this.f16068e = bundle;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f16069a;

        e(ContentInfo contentInfo) {
            this.f16069a = C1681c.a(x1.g.f(contentInfo));
        }

        public int D() {
            return this.f16069a.getFlags();
        }

        public ClipData a() {
            return this.f16069a.getClip();
        }

        public ContentInfo b() {
            return this.f16069a;
        }

        public int i() {
            return this.f16069a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f16069a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    private interface f {
        int D();

        ClipData a();

        ContentInfo b();

        int i();
    }

    /* renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f16070a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16071b;

        /* renamed from: c  reason: collision with root package name */
        private final int f16072c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f16073d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f16074e;

        g(C0285d dVar) {
            this.f16070a = (ClipData) x1.g.f(dVar.f16064a);
            this.f16071b = x1.g.b(dVar.f16065b, 0, 5, "source");
            this.f16072c = x1.g.e(dVar.f16066c, 1);
            this.f16073d = dVar.f16067d;
            this.f16074e = dVar.f16068e;
        }

        public int D() {
            return this.f16072c;
        }

        public ClipData a() {
            return this.f16070a;
        }

        public ContentInfo b() {
            return null;
        }

        public int i() {
            return this.f16071b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f16070a.getDescription());
            sb2.append(", source=");
            sb2.append(C1683d.e(this.f16071b));
            sb2.append(", flags=");
            sb2.append(C1683d.a(this.f16072c));
            String str2 = "";
            if (this.f16073d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f16073d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f16074e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1683d(f fVar) {
        this.f16061a = fVar;
    }

    static String a(int i10) {
        if ((i10 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 == 4) {
            return "SOURCE_AUTOFILL";
        }
        if (i10 != 5) {
            return String.valueOf(i10);
        }
        return "SOURCE_PROCESS_TEXT";
    }

    public static C1683d g(ContentInfo contentInfo) {
        return new C1683d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f16061a.a();
    }

    public int c() {
        return this.f16061a.D();
    }

    public int d() {
        return this.f16061a.i();
    }

    public ContentInfo f() {
        ContentInfo b10 = this.f16061a.b();
        Objects.requireNonNull(b10);
        return C1681c.a(b10);
    }

    public String toString() {
        return this.f16061a.toString();
    }
}
