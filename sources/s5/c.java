package S5;

import T5.k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class c {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: S5.c$c  reason: collision with other inner class name */
    public static class C0550c extends FileNotFoundException {
        public C0550c(String str) {
            super(str);
        }
    }

    public static class d extends IOException {
        public d(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) {
        Throwable th2;
        k.g(file);
        k.g(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            if (file2.exists()) {
                th2 = new b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th2 = new C0550c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th2 = new FileNotFoundException(file.getAbsolutePath());
            } else {
                th2 = null;
            }
            throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th2);
        }
    }
}
