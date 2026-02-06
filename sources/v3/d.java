package V3;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f8252a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f8253b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList f8254c;

    /* renamed from: d  reason: collision with root package name */
    private String f8255d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f8256e;

    public d(ReadableArray readableArray, ArrayList arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f8255d = str;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f8252a, uri, this.f8256e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f8255d;
        if (str == null) {
            this.f8255d = substring;
            return true;
        } else if (!str.equalsIgnoreCase(substring) && this.f8255d.split("/")[0].equalsIgnoreCase(substring.split("/")[0])) {
            this.f8255d = this.f8255d.split("/")[0].concat("/*");
            return true;
        } else if (this.f8255d.equalsIgnoreCase(substring)) {
            return true;
        } else {
            this.f8255d = "*/*";
            return true;
        }
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String a10 = a(uri.toString());
        if (a10 == null) {
            a10 = a(b(uri));
        }
        if (a10 == null) {
            a10 = "*/*";
        }
        String str = this.f8255d;
        if (str == null) {
            this.f8255d = a10;
            return true;
        } else if (!str.equalsIgnoreCase(a10) && this.f8255d.split("/")[0].equalsIgnoreCase(a10.split("/")[0])) {
            this.f8255d = this.f8255d.split("/")[0].concat("/*");
            return true;
        } else if (this.f8255d.equalsIgnoreCase(a10)) {
            return true;
        } else {
            this.f8255d = "*/*";
            return true;
        }
    }

    public String c() {
        String str = this.f8255d;
        if (str == null) {
            return "*/*";
        }
        return str;
    }

    public ArrayList d() {
        String str;
        File file;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f8253b.size(); i10++) {
            Uri uri = (Uri) this.f8253b.get(i10);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                if (this.f8254c.size() >= i10 + 1) {
                    str = (String) this.f8254c.get(i10);
                } else {
                    str = System.currentTimeMillis() + "." + extensionFromMimeType;
                }
                try {
                    if (this.f8256e.booleanValue()) {
                        file = this.f8252a.getCacheDir();
                    } else {
                        file = this.f8252a.getExternalCacheDir();
                    }
                    File file2 = new File(file, Environment.DIRECTORY_DOWNLOADS);
                    if (!file2.exists()) {
                        if (!file2.mkdirs()) {
                            throw new IOException("mkdirs failed on " + file2.getAbsolutePath());
                        }
                    }
                    File file3 = new File(file2, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(b.a(this.f8252a, file3));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f8254c.size() >= i10 + 1) {
                    arrayList.add(b.a(this.f8252a, new File(uri.getPath(), (String) this.f8254c.get(i10))));
                } else {
                    arrayList.add(b.a(this.f8252a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        Iterator it = this.f8253b.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (e(uri) || g(uri)) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                break;
            }
        }
        return z10;
    }

    public d(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f8253b = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                this.f8253b.add(Uri.parse(string));
            }
        }
        this.f8254c = arrayList;
        this.f8256e = bool;
        this.f8252a = reactApplicationContext;
    }
}
