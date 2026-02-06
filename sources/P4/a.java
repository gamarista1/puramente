package P4;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public interface a {

    /* renamed from: P4.a$a  reason: collision with other inner class name */
    public interface C0546a {
        void a(Bitmap bitmap);

        byte[] b(int i10);

        Bitmap c(int i10, int i11, Bitmap.Config config);

        int[] d(int i10);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    int a();

    Bitmap b();

    void c();

    void clear();

    void d(Bitmap.Config config);

    int e();

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
