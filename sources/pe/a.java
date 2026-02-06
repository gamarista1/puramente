package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class a implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61329a;

    public a(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61329a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61329a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61329a;
    }

    /* renamed from: g */
    public Long get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Long.valueOf(k(i10 * 8));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public long k(int i10) {
        return this.f61329a.read8Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61329a.toDirectBuffer();
    }
}
