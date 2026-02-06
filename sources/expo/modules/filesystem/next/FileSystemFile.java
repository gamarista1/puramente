package expo.modules.filesystem.next;

import Sg.C5543f;
import Sg.C5544g;
import Sg.p;
import Ud.g;
import Xd.c;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import wf.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u000b8F¢\u0006\f\u0012\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFile;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Llf/M;", "W0", "()V", "j0", "B0", "", "content", "n1", "(Ljava/lang/String;)V", "Lpe/j;", "z1", "(Lpe/j;)V", "o0", "()Ljava/lang/String;", "R0", "t0", "", "x0", "()[B", "", "E0", "()Z", "exists", "I0", "getMd5$annotations", "md5", "", "L0", "()Ljava/lang/Long;", "size", "P0", "type", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemFile extends FileSystemPath {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemFile(File file) {
        super(file);
        C6496s.h(file, "file");
    }

    public final void B0() {
        j0();
        h0(c.WRITE);
        V().createNewFile();
    }

    public final boolean E0() {
        h0(c.READ);
        return V().isFile();
    }

    public final String I0() {
        h0(c.READ);
        byte[] digest = MessageDigest.getInstance("MD5").digest(k.f(V()));
        C6496s.e(digest);
        return C5543f.i(digest, (C5544g) null, 1, (Object) null);
    }

    public final Long L0() {
        if (V().exists()) {
            return Long.valueOf(V().length());
        }
        return null;
    }

    public final String P0() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(V().getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public final String R0() {
        j0();
        h0(c.READ);
        return k.h(V(), (Charset) null, 1, (Object) null);
    }

    public final void W0() {
    }

    public void j0() {
        h0(c.READ);
        if (V().exists() && V().isDirectory()) {
            throw new g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        wf.C6763c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n1(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r2.j0()
            Xd.c r0 = Xd.c.WRITE
            r2.h0(r0)
            boolean r0 = r2.E0()
            if (r0 != 0) goto L_0x0016
            r2.B0()
        L_0x0016:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r2.V()
            r0.<init>(r1)
            java.nio.charset.Charset r1 = Sg.C5541d.f65029b     // Catch:{ all -> 0x0034 }
            byte[] r3 = r3.getBytes(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.C6496s.g(r3, r1)     // Catch:{ all -> 0x0034 }
            r0.write(r3)     // Catch:{ all -> 0x0034 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0034 }
            r3 = 0
            wf.C6763c.a(r0, r3)
            return
        L_0x0034:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            wf.C6763c.a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.next.FileSystemFile.n1(java.lang.String):void");
    }

    public final String o0() {
        String uri = Uri.fromFile(V()).toString();
        C6496s.g(uri, "toString(...)");
        if (p.u(uri, "/", false, 2, (Object) null)) {
            return p.i1(uri, 1);
        }
        return uri;
    }

    public final String t0() {
        j0();
        h0(c.READ);
        String encodeToString = Base64.encodeToString(k.f(V()), 2);
        C6496s.g(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final byte[] x0() {
        j0();
        h0(c.READ);
        return k.f(V());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        wf.C6763c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z1(pe.j r3) {
        /*
            r2 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r2.j0()
            Xd.c r0 = Xd.c.WRITE
            r2.h0(r0)
            boolean r0 = r2.E0()
            if (r0 != 0) goto L_0x0016
            r2.B0()
        L_0x0016:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r2.V()
            r0.<init>(r1)
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r3 = r3.toDirectBuffer()     // Catch:{ all -> 0x002f }
            r1.write(r3)     // Catch:{ all -> 0x002f }
            r3 = 0
            wf.C6763c.a(r0, r3)
            return
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            wf.C6763c.a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.next.FileSystemFile.z1(pe.j):void");
    }
}
