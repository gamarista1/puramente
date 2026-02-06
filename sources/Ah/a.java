package Ah;

import Gh.H;
import Gh.U;
import Gh.W;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.C6496s;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0920a f62436a = C0920a.f62438a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f62437b = new C0920a.C0921a();

    /* renamed from: Ah.a$a  reason: collision with other inner class name */
    public static final class C0920a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0920a f62438a = new C0920a();

        /* renamed from: Ah.a$a$a  reason: collision with other inner class name */
        private static final class C0921a implements a {
            public void a(File file) {
                C6496s.h(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i10 = 0;
                    while (i10 < length) {
                        File file2 = listFiles[i10];
                        if (file2.isDirectory()) {
                            C6496s.g(file2, "file");
                            a(file2);
                        }
                        if (file2.delete()) {
                            i10++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            public boolean b(File file) {
                C6496s.h(file, "file");
                return file.exists();
            }

            public U c(File file) {
                C6496s.h(file, "file");
                try {
                    return H.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return H.a(file);
                }
            }

            public long d(File file) {
                C6496s.h(file, "file");
                return file.length();
            }

            public W e(File file) {
                C6496s.h(file, "file");
                return H.k(file);
            }

            public U f(File file) {
                C6496s.h(file, "file");
                try {
                    return I.h(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return I.h(file, false, 1, (Object) null);
                }
            }

            public void g(File file, File file2) {
                C6496s.h(file, TicketDetailDestinationKt.LAUNCHED_FROM);
                C6496s.h(file2, "to");
                h(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public void h(File file) {
                C6496s.h(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0920a() {
        }
    }

    void a(File file);

    boolean b(File file);

    U c(File file);

    long d(File file);

    W e(File file);

    U f(File file);

    void g(File file, File file2);

    void h(File file);
}
