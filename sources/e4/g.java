package E4;

import H4.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final e f30632a;

    public g(e eVar) {
        this.f30632a = eVar;
    }

    private static String b(String str, c cVar, boolean z10) {
        String str2;
        if (z10) {
            str2 = cVar.b();
        } else {
            str2 = cVar.f30631a;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            replaceAll = d(replaceAll, length);
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    private File c(String str) {
        File file = new File(e(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private static String d(String str, int i10) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte valueOf : digest) {
                sb2.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    private File e() {
        File a10 = this.f30632a.a();
        if (a10.isFile()) {
            a10.delete();
        }
        if (!a10.exists()) {
            a10.mkdirs();
        }
        return a10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.c(r6)     // Catch:{ FileNotFoundException -> 0x0053 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            E4.c r0 = E4.c.ZIP
            goto L_0x002d
        L_0x001c:
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".gz"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x002b
            E4.c r0 = E4.c.GZIP
            goto L_0x002d
        L_0x002b:
            E4.c r0 = E4.c.JSON
        L_0x002d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            H4.f.a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.g.a(java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    public void f(String str, c cVar) {
        File file = new File(e(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        f.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            f.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* access modifiers changed from: package-private */
    public File g(String str, InputStream inputStream, c cVar) {
        FileOutputStream fileOutputStream;
        File file = new File(e(), b(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
