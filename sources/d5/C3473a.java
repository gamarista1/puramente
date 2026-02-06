package d5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: d5.a  reason: case insensitive filesystem */
public class C3473a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f43136a;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    public static class C0664a implements e.a {
        public Class a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public e b(ByteBuffer byteBuffer) {
            return new C3473a(byteBuffer);
        }
    }

    public C3473a(ByteBuffer byteBuffer) {
        this.f43136a = byteBuffer;
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.f43136a.position(0);
        return this.f43136a;
    }

    public void b() {
    }
}
