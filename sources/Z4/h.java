package Z4;

import T4.f;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import o5.k;

public class h implements f {

    /* renamed from: b  reason: collision with root package name */
    private final i f35874b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f35875c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35876d;

    /* renamed from: e  reason: collision with root package name */
    private String f35877e;

    /* renamed from: f  reason: collision with root package name */
    private URL f35878f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f35879g;

    /* renamed from: h  reason: collision with root package name */
    private int f35880h;

    public h(URL url) {
        this(url, i.f35882b);
    }

    private byte[] d() {
        if (this.f35879g == null) {
            this.f35879g = c().getBytes(f.f34158a);
        }
        return this.f35879g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f35877e)) {
            String str = this.f35876d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) k.d(this.f35875c)).toString();
            }
            this.f35877e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f35877e;
    }

    private URL g() {
        if (this.f35878f == null) {
            this.f35878f = new URL(f());
        }
        return this.f35878f;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f35876d;
        if (str != null) {
            return str;
        }
        return ((URL) k.d(this.f35875c)).toString();
    }

    public Map e() {
        return this.f35874b.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!c().equals(hVar.c()) || !this.f35874b.equals(hVar.f35874b)) {
            return false;
        }
        return true;
    }

    public String h() {
        return f();
    }

    public int hashCode() {
        if (this.f35880h == 0) {
            int hashCode = c().hashCode();
            this.f35880h = hashCode;
            this.f35880h = (hashCode * 31) + this.f35874b.hashCode();
        }
        return this.f35880h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f35882b);
    }

    public h(URL url, i iVar) {
        this.f35875c = (URL) k.d(url);
        this.f35876d = null;
        this.f35874b = (i) k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f35875c = null;
        this.f35876d = k.b(str);
        this.f35874b = (i) k.d(iVar);
    }
}
