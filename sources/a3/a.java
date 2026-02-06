package A3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0002a f456e = new C0002a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map f457f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f458a;

    /* renamed from: b  reason: collision with root package name */
    private final File f459b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f460c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f461d;

    /* renamed from: A3.a$a  reason: collision with other inner class name */
    public static final class C0002a {
        public /* synthetic */ C0002a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f457f) {
                try {
                    Map a10 = a.f457f;
                    Object obj = a10.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        a10.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C0002a() {
        }
    }

    public a(String str, File file, boolean z10) {
        C6496s.h(str, "name");
        C6496s.h(file, "lockDir");
        this.f458a = z10;
        File file2 = new File(file, str + ".lck");
        this.f459b = file2;
        C0002a aVar = f456e;
        String absolutePath = file2.getAbsolutePath();
        C6496s.g(absolutePath, "lockFile.absolutePath");
        this.f460c = aVar.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f458a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f460c.lock();
        if (z10) {
            try {
                File parentFile = this.f459b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f459b).getChannel();
                channel.lock();
                this.f461d = channel;
            } catch (IOException e10) {
                this.f461d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f461d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f460c.unlock();
    }
}
