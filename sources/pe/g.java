package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class g implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61334a;

    public g(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61334a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61334a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61334a;
    }

    /* renamed from: g */
    public Integer get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Integer.valueOf(k(i10 * 4));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public int k(int i10) {
        return this.f61334a.read4Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61334a.toDirectBuffer();
    }
}
