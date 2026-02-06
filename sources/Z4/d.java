package Z4;

import T4.i;
import Z4.n;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import n5.C3861d;
import o5.C3882a;

public class d implements n {
    /* renamed from: c */
    public n.a a(File file, int i10, int i11, i iVar) {
        return new n.a(new C3861d(file), new a(file));
    }

    /* renamed from: d */
    public boolean b(File file) {
        return true;
    }

    private static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final File f35852a;

        a(File file) {
            this.f35852a = file;
        }

        public Class a() {
            return ByteBuffer.class;
        }

        public void d(h hVar, d.a aVar) {
            try {
                aVar.e(C3882a.a(this.f35852a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void b() {
        }

        public void cancel() {
        }
    }

    public static class b implements o {
        public n c(r rVar) {
            return new d();
        }

        public void teardown() {
        }
    }
}
