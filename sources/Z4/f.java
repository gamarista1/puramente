package Z4;

import T4.i;
import Z4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import e5.C3495f;
import java.io.IOException;
import java.io.InputStream;
import n5.C3861d;

public final class f implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35859a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35860b;

    private interface e {
        Class a();

        void b(Object obj);

        Object d(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f35859a = context.getApplicationContext();
        this.f35860b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    /* renamed from: d */
    public n.a a(Integer num, int i10, int i11, i iVar) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) iVar.c(e5.i.f43344b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.f35859a.getResources();
        }
        return new n.a(new C3861d(num), new d(theme, resources, this.f35860b, num.intValue()));
    }

    /* renamed from: f */
    public boolean b(Integer num) {
        return true;
    }

    private static final class a implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35861a;

        a(Context context) {
            this.f35861a = context;
        }

        public Class a() {
            return AssetFileDescriptor.class;
        }

        public n c(r rVar) {
            return new f(this.f35861a, this);
        }

        /* renamed from: e */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        /* renamed from: f */
        public AssetFileDescriptor d(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        public void teardown() {
        }
    }

    private static final class b implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35862a;

        b(Context context) {
            this.f35862a = context;
        }

        public Class a() {
            return Drawable.class;
        }

        public n c(r rVar) {
            return new f(this.f35862a, this);
        }

        /* renamed from: f */
        public Drawable d(Resources.Theme theme, Resources resources, int i10) {
            return C3495f.a(this.f35862a, i10, theme);
        }

        public void teardown() {
        }

        /* renamed from: e */
        public void b(Drawable drawable) {
        }
    }

    private static final class c implements o, e {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35863a;

        c(Context context) {
            this.f35863a = context;
        }

        public Class a() {
            return InputStream.class;
        }

        public n c(r rVar) {
            return new f(this.f35863a, this);
        }

        /* renamed from: e */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        /* renamed from: f */
        public InputStream d(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        public void teardown() {
        }
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f35864a;

        /* renamed from: b  reason: collision with root package name */
        private final Resources f35865b;

        /* renamed from: c  reason: collision with root package name */
        private final e f35866c;

        /* renamed from: d  reason: collision with root package name */
        private final int f35867d;

        /* renamed from: e  reason: collision with root package name */
        private Object f35868e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f35864a = theme;
            this.f35865b = resources;
            this.f35866c = eVar;
            this.f35867d = i10;
        }

        public Class a() {
            return this.f35866c.a();
        }

        public void b() {
            Object obj = this.f35868e;
            if (obj != null) {
                try {
                    this.f35866c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        public void d(h hVar, d.a aVar) {
            try {
                Object d10 = this.f35866c.d(this.f35864a, this.f35865b, this.f35867d);
                this.f35868e = d10;
                aVar.e(d10);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void cancel() {
        }
    }
}
