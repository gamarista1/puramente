package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class c implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61331a;

    public c(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61331a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61331a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61331a;
    }

    /* renamed from: g */
    public Float get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Float.valueOf(k(i10 * 4));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public float k(int i10) {
        return this.f61331a.readFloat(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61331a.toDirectBuffer();
    }
}
