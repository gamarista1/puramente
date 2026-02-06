package a5;

import T4.i;
import Z4.n;
import Z4.o;
import Z4.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import n5.C3861d;

public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f36104a;

    /* renamed from: b  reason: collision with root package name */
    private final n f36105b;

    /* renamed from: c  reason: collision with root package name */
    private final n f36106c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f36107d;

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: a5.d$d  reason: collision with other inner class name */
    private static final class C0590d implements com.bumptech.glide.load.data.d {

        /* renamed from: k  reason: collision with root package name */
        private static final String[] f36110k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f36111a;

        /* renamed from: b  reason: collision with root package name */
        private final n f36112b;

        /* renamed from: c  reason: collision with root package name */
        private final n f36113c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f36114d;

        /* renamed from: e  reason: collision with root package name */
        private final int f36115e;

        /* renamed from: f  reason: collision with root package name */
        private final int f36116f;

        /* renamed from: g  reason: collision with root package name */
        private final i f36117g;

        /* renamed from: h  reason: collision with root package name */
        private final Class f36118h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f36119i;

        /* renamed from: j  reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f36120j;

        C0590d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, i iVar, Class cls) {
            this.f36111a = context.getApplicationContext();
            this.f36112b = nVar;
            this.f36113c = nVar2;
            this.f36114d = uri;
            this.f36115e = i10;
            this.f36116f = i11;
            this.f36117g = iVar;
            this.f36118h = cls;
        }

        private n.a c() {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f36112b.a(g(this.f36114d), this.f36115e, this.f36116f, this.f36117g);
            }
            if (U4.b.a(this.f36114d)) {
                return this.f36113c.a(this.f36114d, this.f36115e, this.f36116f, this.f36117g);
            }
            if (f()) {
                uri = MediaStore.setRequireOriginal(this.f36114d);
            } else {
                uri = this.f36114d;
            }
            return this.f36113c.a(uri, this.f36115e, this.f36116f, this.f36117g);
        }

        private com.bumptech.glide.load.data.d e() {
            n.a c10 = c();
            if (c10 != null) {
                return c10.f35904c;
            }
            return null;
        }

        private boolean f() {
            if (this.f36111a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        private File g(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f36111a.getContentResolver().query(uri, f36110k, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }

        public Class a() {
            return this.f36118h;
        }

        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f36120j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void cancel() {
            this.f36119i = true;
            com.bumptech.glide.load.data.d dVar = this.f36120j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public void d(h hVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d e10 = e();
                if (e10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f36114d));
                    return;
                }
                this.f36120j = e10;
                if (this.f36119i) {
                    cancel();
                } else {
                    e10.d(hVar, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.c(e11);
            }
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f36104a = context.getApplicationContext();
        this.f36105b = nVar;
        this.f36106c = nVar2;
        this.f36107d = cls;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        return new n.a(new C3861d(uri), new C0590d(this.f36104a, this.f36105b, this.f36106c, uri, i10, i11, iVar, this.f36107d));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (Build.VERSION.SDK_INT < 29 || !U4.b.c(uri)) {
            return false;
        }
        return true;
    }

    private static abstract class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36108a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f36109b;

        a(Context context, Class cls) {
            this.f36108a = context;
            this.f36109b = cls;
        }

        public final n c(r rVar) {
            return new d(this.f36108a, rVar.d(File.class, this.f36109b), rVar.d(Uri.class, this.f36109b), this.f36109b);
        }

        public final void teardown() {
        }
    }
}
