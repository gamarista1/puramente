package K4;

import N4.f;
import Sg.C5541d;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class i implements f.i {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f32347a;

    public i() {
        byte[] bytes = "\"[OBJECT]\"".getBytes(C5541d.f65029b);
        C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
        this.f32347a = bytes;
    }

    public void a(Object obj, OutputStream outputStream) {
        outputStream.write(this.f32347a);
    }

    /* renamed from: c */
    public Object b(Map map, Type type, InputStream inputStream) {
        throw new UnsupportedOperationException();
    }
}
