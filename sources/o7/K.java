package o7;

import Sg.p;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.C3449s;
import com.facebook.C3459v;
import com.facebook.I;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import wf.k;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final K f47118a = new K();

    /* renamed from: b  reason: collision with root package name */
    private static final String f47119b = K.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static File f47120c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f47121a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f47122b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f47123c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47124d;

        /* renamed from: e  reason: collision with root package name */
        private final String f47125e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f47126f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f47127g;

        public a(UUID uuid, Bitmap bitmap, Uri uri) {
            String str;
            C6496s.h(uuid, "callId");
            this.f47121a = uuid;
            this.f47122b = bitmap;
            this.f47123c = uri;
            String str2 = null;
            boolean z10 = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (p.v("content", scheme, true)) {
                    this.f47126f = true;
                    String authority = uri.getAuthority();
                    this.f47127g = (authority == null || p.J(authority, "media", false, 2, (Object) null)) ? false : z10;
                } else if (p.v("file", uri.getScheme(), true)) {
                    this.f47127g = true;
                } else if (!W.g0(uri)) {
                    throw new C3459v("Unsupported scheme for media Uri : " + scheme);
                }
            } else if (bitmap != null) {
                this.f47127g = true;
            } else {
                throw new C3459v("Cannot share media without a bitmap or Uri set");
            }
            str2 = this.f47127g ? UUID.randomUUID().toString() : str2;
            this.f47125e = str2;
            if (!this.f47127g) {
                str = String.valueOf(uri);
            } else {
                str = C3449s.f42386a.a(I.m(), uuid, str2);
            }
            this.f47124d = str;
        }

        public final String a() {
            return this.f47125e;
        }

        public final String b() {
            return this.f47124d;
        }

        public final Bitmap c() {
            return this.f47122b;
        }

        public final UUID d() {
            return this.f47121a;
        }

        public final Uri e() {
            return this.f47123c;
        }

        public final boolean f() {
            return this.f47127g;
        }

        public final boolean g() {
            return this.f47126f;
        }
    }

    private K() {
    }

    public static final void a(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            if (f47120c == null) {
                b();
            }
            f();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.f()) {
                        File g10 = g(aVar.d(), aVar.a(), true);
                        if (g10 != null) {
                            arrayList.add(g10);
                            if (aVar.c() != null) {
                                f47118a.j(aVar.c(), g10);
                            } else if (aVar.e() != null) {
                                f47118a.k(aVar.e(), aVar.g(), g10);
                            }
                        }
                    }
                }
            } catch (IOException e10) {
                String str = f47119b;
                Log.e(str, "Got unexpected exception:" + e10);
                for (File file : arrayList) {
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                throw new C3459v((Throwable) e10);
            }
        }
    }

    public static final void b() {
        File h10 = h();
        if (h10 != null) {
            k.t(h10);
        }
    }

    public static final void c(UUID uuid) {
        C6496s.h(uuid, "callId");
        File i10 = i(uuid, false);
        if (i10 != null) {
            k.t(i10);
        }
    }

    public static final a d(UUID uuid, Bitmap bitmap) {
        C6496s.h(uuid, "callId");
        C6496s.h(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, (Uri) null);
    }

    public static final a e(UUID uuid, Uri uri) {
        C6496s.h(uuid, "callId");
        C6496s.h(uri, "attachmentUri");
        return new a(uuid, (Bitmap) null, uri);
    }

    public static final File f() {
        File h10 = h();
        if (h10 != null) {
            h10.mkdirs();
        }
        return h10;
    }

    public static final File g(UUID uuid, String str, boolean z10) {
        C6496s.h(uuid, "callId");
        File i10 = i(uuid, z10);
        if (i10 == null) {
            return null;
        }
        try {
            return new File(i10, URLEncoder.encode(str, Constants.ENCODING));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File h() {
        File file;
        synchronized (K.class) {
            try {
                if (f47120c == null) {
                    f47120c = new File(I.l().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
                }
                file = f47120c;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return file;
    }

    public static final File i(UUID uuid, boolean z10) {
        C6496s.h(uuid, "callId");
        if (f47120c == null) {
            return null;
        }
        File file = new File(f47120c, uuid.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final void j(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            W.j(fileOutputStream);
        }
    }

    private final void k(Uri uri, boolean z10, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (!z10) {
            try {
                inputStream = new FileInputStream(uri.getPath());
            } catch (Throwable th2) {
                W.j(fileOutputStream);
                throw th2;
            }
        } else {
            inputStream = I.l().getContentResolver().openInputStream(uri);
        }
        W.q(inputStream, fileOutputStream);
        W.j(fileOutputStream);
    }
}
