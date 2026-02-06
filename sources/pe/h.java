package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class h implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61335a;

    public h(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61335a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61335a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61335a;
    }

    /* renamed from: g */
    public Byte get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Byte.valueOf(k(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public byte k(int i10) {
        return this.f61335a.readByte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61335a.toDirectBuffer();
    }
}
