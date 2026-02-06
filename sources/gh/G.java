package Gh;

import Gh.M;
import com.reactnativecommunity.asyncstorage.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class G extends C5419u {
    private final Long v(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public void c(M m10, M m11) {
        C6496s.h(m10, "source");
        C6496s.h(m11, "target");
        try {
            Path unused = Files.move(m10.t(), m11.t(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        } catch (UnsupportedOperationException unused2) {
            throw new IOException("atomic move not supported");
        }
    }

    public C5410k m(M m10) {
        C6496s.h(m10, "path");
        return u(m10.t());
    }

    public String toString() {
        return "NioSystemFileSystem";
    }

    /* access modifiers changed from: protected */
    public final C5410k u(Path path) {
        Path path2;
        M m10;
        Long l10;
        Long l11;
        Path path3 = path;
        C6496s.h(path3, "nioPath");
        Long l12 = null;
        try {
            BasicFileAttributes a10 = Files.readAttributes(path3, d.a(), new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if (a10.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            boolean a11 = a10.isRegularFile();
            boolean a12 = a10.isDirectory();
            if (path2 != null) {
                m10 = M.a.f(M.f63223b, path2, false, 1, (Object) null);
            } else {
                m10 = null;
            }
            Long valueOf = Long.valueOf(a10.size());
            FileTime a13 = a10.creationTime();
            if (a13 != null) {
                l10 = v(a13);
            } else {
                l10 = null;
            }
            FileTime a14 = a10.lastModifiedTime();
            if (a14 != null) {
                l11 = v(a14);
            } else {
                l11 = null;
            }
            FileTime a15 = a10.lastAccessTime();
            if (a15 != null) {
                l12 = v(a15);
            }
            return new C5410k(a11, a12, m10, valueOf, l10, l11, l12, (Map) null, 128, (DefaultConstructorMarker) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }
}
