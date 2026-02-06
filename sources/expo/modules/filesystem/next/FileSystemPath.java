package expo.modules.filesystem.next;

import Ud.a;
import Ud.i;
import Xd.c;
import ae.u;
import android.os.Build;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wf.k;
import yf.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005¨\u0006\u001c"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "fileOrDirectory", "Llf/M;", "T", "j0", "()V", "destination", "f0", "(Lexpo/modules/filesystem/next/FileSystemPath;)Ljava/io/File;", "LXd/c;", "permission", "", "h0", "(LXd/c;)Z", "to", "Q", "(Lexpo/modules/filesystem/next/FileSystemPath;)V", "g0", "c", "Ljava/io/File;", "V", "()Ljava/io/File;", "setFile", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {

    /* renamed from: c  reason: collision with root package name */
    private File f60417c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemPath(File file) {
        super((u) null, 1, (DefaultConstructorMarker) null);
        C6496s.h(file, "file");
        this.f60417c = file;
    }

    public static /* synthetic */ void U(FileSystemPath fileSystemPath, File file, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                file = fileSystemPath.f60417c;
            }
            fileSystemPath.T(file);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }

    public final void Q(FileSystemPath fileSystemPath) {
        C6496s.h(fileSystemPath, "to");
        j0();
        fileSystemPath.j0();
        h0(c.READ);
        fileSystemPath.h0(c.WRITE);
        k.q(this.f60417c, f0(fileSystemPath), false, (p) null, 6, (Object) null);
    }

    public final void T(File file) {
        File[] listFiles;
        C6496s.h(file, "fileOrDirectory");
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        C6496s.e(file2);
                        T(file2);
                    } else if (!file2.delete()) {
                        throw new i("failed to delete '" + file2.getPath() + "'");
                    }
                }
            }
            if (!file.delete()) {
                throw new i("failed to delete '" + file.getPath() + "'");
            }
            return;
        }
        throw new i("path '" + file.getPath() + "' does not exist");
    }

    public final File V() {
        return this.f60417c;
    }

    public final File f0(FileSystemPath fileSystemPath) {
        C6496s.h(fileSystemPath, "destination");
        if (fileSystemPath instanceof FileSystemDirectory) {
            if (this instanceof FileSystemFile) {
                if (((FileSystemDirectory) fileSystemPath).x0()) {
                    return new File(fileSystemPath.f60417c, this.f60417c.getName());
                }
                throw new Ud.c();
            } else if (((FileSystemDirectory) fileSystemPath).x0()) {
                return new File(fileSystemPath.f60417c, this.f60417c.getName());
            } else {
                File parentFile = fileSystemPath.f60417c.getParentFile();
                if (parentFile != null && parentFile.exists()) {
                    return fileSystemPath.f60417c;
                }
                throw new Ud.c();
            }
        } else if (this instanceof FileSystemFile) {
            File parentFile2 = fileSystemPath.f60417c.getParentFile();
            if (parentFile2 != null && parentFile2.exists()) {
                return fileSystemPath.f60417c;
            }
            throw new Ud.c();
        } else {
            throw new a();
        }
    }

    public final void g0(FileSystemPath fileSystemPath) {
        C6496s.h(fileSystemPath, "to");
        j0();
        fileSystemPath.j0();
        c cVar = c.WRITE;
        h0(cVar);
        fileSystemPath.h0(cVar);
        if (Build.VERSION.SDK_INT >= 26) {
            File f02 = f0(fileSystemPath);
            Path a10 = this.f60417c.toPath();
            C6496s.g(a10, "toPath(...)");
            Path a11 = f02.toPath();
            C6496s.g(a11, "toPath(...)");
            C6496s.g(Files.move(a10, a11, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
            this.f60417c = f02;
            return;
        }
        k.s(this.f60417c, f0(fileSystemPath), false, 0, 6, (Object) null);
        this.f60417c.delete();
        this.f60417c = f0(fileSystemPath);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h0(Xd.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            ae.a r0 = r3.n()
            if (r0 == 0) goto L_0x0029
            Xd.b r0 = r0.n()
            if (r0 == 0) goto L_0x0029
            ae.a r1 = r3.n()
            if (r1 == 0) goto L_0x001c
            android.content.Context r1 = r1.u()
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.io.File r2 = r3.f60417c
            java.lang.String r2 = r2.getPath()
            java.util.EnumSet r0 = r0.a(r1, r2)
            if (r0 != 0) goto L_0x002f
        L_0x0029:
            java.lang.Class<Xd.c> r0 = Xd.c.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
        L_0x002f:
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0037
            r4 = 1
            return r4
        L_0x0037:
            Ud.f r0 = new Ud.f
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.next.FileSystemPath.h0(Xd.c):boolean");
    }

    public abstract void j0();
}
