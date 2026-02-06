package Gh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: Gh.u  reason: case insensitive filesystem */
public class C5419u extends C5411l {
    private final List r(M m10, boolean z10) {
        File s10 = m10.s();
        String[] list = s10.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C6496s.e(str);
                arrayList.add(m10.p(str));
            }
            C6565s.B(arrayList);
            return arrayList;
        } else if (!z10) {
            return null;
        } else {
            if (!s10.exists()) {
                throw new FileNotFoundException("no such file: " + m10);
            }
            throw new IOException("failed to list " + m10);
        }
    }

    private final void s(M m10) {
        if (j(m10)) {
            throw new IOException(m10 + " already exists.");
        }
    }

    private final void t(M m10) {
        if (!j(m10)) {
            throw new IOException(m10 + " doesn't exist.");
        }
    }

    public U b(M m10, boolean z10) {
        C6496s.h(m10, "file");
        if (z10) {
            t(m10);
        }
        return H.g(m10.s(), true);
    }

    public void c(M m10, M m11) {
        C6496s.h(m10, "source");
        C6496s.h(m11, "target");
        if (!m10.s().renameTo(m11.s())) {
            throw new IOException("failed to move " + m10 + " to " + m11);
        }
    }

    public void g(M m10, boolean z10) {
        C6496s.h(m10, "dir");
        if (!m10.s().mkdir()) {
            C5410k m11 = m(m10);
            if (m11 == null || !m11.e()) {
                throw new IOException("failed to create directory: " + m10);
            } else if (z10) {
                throw new IOException(m10 + " already exists.");
            }
        }
    }

    public void i(M m10, boolean z10) {
        C6496s.h(m10, "path");
        if (!Thread.interrupted()) {
            File s10 = m10.s();
            if (s10.delete()) {
                return;
            }
            if (s10.exists()) {
                throw new IOException("failed to delete " + m10);
            } else if (z10) {
                throw new FileNotFoundException("no such file: " + m10);
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    public List k(M m10) {
        C6496s.h(m10, "dir");
        List r10 = r(m10, true);
        C6496s.e(r10);
        return r10;
    }

    public C5410k m(M m10) {
        C6496s.h(m10, "path");
        File s10 = m10.s();
        boolean isFile = s10.isFile();
        boolean isDirectory = s10.isDirectory();
        long lastModified = s10.lastModified();
        long length = s10.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !s10.exists()) {
            return null;
        }
        return new C5410k(isFile, isDirectory, (M) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, (Map) null, 128, (DefaultConstructorMarker) null);
    }

    public C5409j n(M m10) {
        C6496s.h(m10, "file");
        return new C5418t(false, new RandomAccessFile(m10.s(), "r"));
    }

    public U p(M m10, boolean z10) {
        C6496s.h(m10, "file");
        if (z10) {
            s(m10);
        }
        return I.h(m10.s(), false, 1, (Object) null);
    }

    public W q(M m10) {
        C6496s.h(m10, "file");
        return H.k(m10.s());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
