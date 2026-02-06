package V3;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f8246a;

    /* renamed from: b  reason: collision with root package name */
    private String f8247b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f8248c;

    /* renamed from: d  reason: collision with root package name */
    private String f8249d;

    /* renamed from: e  reason: collision with root package name */
    private String f8250e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f8251f;

    public c(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f8249d = str2;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f8246a, uri, this.f8251f);
    }

    private boolean e() {
        if (this.f8248c.getScheme() == null || !this.f8248c.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : this.f8248c.toString().substring(5).toCharArray()) {
            if (c10 == ';') {
                break;
            }
            sb2.append(c10);
        }
        this.f8249d = sb2.toString();
        return true;
    }

    private boolean g() {
        if (this.f8248c.getScheme() == null || (!this.f8248c.getScheme().equals("content") && !this.f8248c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f8249d != null) {
            return true;
        }
        String a10 = a(this.f8248c.toString());
        this.f8249d = a10;
        if (a10 == null) {
            String b10 = b(this.f8248c);
            if (b10 == null) {
                return false;
            }
            this.f8249d = a(b10);
        }
        if (this.f8249d == null) {
            this.f8249d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f8249d;
        if (str == null) {
            return "*/*";
        }
        return str;
    }

    public Uri d() {
        File file;
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String substring = this.f8248c.toString().substring(this.f8249d.length() + 13);
            String str = this.f8250e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                if (this.f8251f.booleanValue()) {
                    file = this.f8246a.getCacheDir();
                } else {
                    file = this.f8246a.getExternalCacheDir();
                }
                File file2 = new File(file, Environment.DIRECTORY_DOWNLOADS);
                if (!file2.exists()) {
                    if (!file2.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file2.getAbsolutePath());
                    }
                }
                File file3 = new File(file2, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return b.a(this.f8246a, file3);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            if (g()) {
                Uri parse = Uri.parse(this.f8247b);
                if (parse.getPath() == null) {
                    return null;
                }
                return b.a(this.f8246a, new File(parse.getPath()));
            }
            return null;
        }
    }

    public boolean f() {
        if (e() || g()) {
            return true;
        }
        return false;
    }

    public c(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f8247b = str;
        this.f8248c = Uri.parse(str);
        this.f8250e = str2;
        this.f8251f = bool;
        this.f8246a = reactApplicationContext;
    }
}
