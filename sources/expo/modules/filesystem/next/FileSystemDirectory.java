package expo.modules.filesystem.next;

import Sg.p;
import Ud.h;
import Xd.c;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemDirectory;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Llf/M;", "E0", "()V", "j0", "t0", "", "", "", "", "B0", "()Ljava/util/List;", "o0", "()Ljava/lang/String;", "", "x0", "()Z", "exists", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(File file) {
        super(file);
        C6496s.h(file, "file");
    }

    public final List B0() {
        j0();
        h0(c.READ);
        File[] listFiles = V().listFiles();
        if (listFiles == null) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(O.l(C6502A.a("isDirectory", Boolean.valueOf(file.isDirectory())), C6502A.a("path", file.getPath())));
        }
        return arrayList;
    }

    public final void E0() {
    }

    public void j0() {
        if (V().exists() && !V().isDirectory()) {
            throw new h();
        }
    }

    public final String o0() {
        String uri = Uri.fromFile(V()).toString();
        C6496s.g(uri, "toString(...)");
        if (p.u(uri, "/", false, 2, (Object) null)) {
            return uri;
        }
        return uri + "/";
    }

    public final void t0() {
        j0();
        h0(c.WRITE);
        V().mkdir();
    }

    public final boolean x0() {
        h0(c.READ);
        return V().isDirectory();
    }
}
