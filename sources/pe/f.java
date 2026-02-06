package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class f implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61333a;

    public f(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61333a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61333a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61333a;
    }

    /* renamed from: g */
    public Short get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Short.valueOf(k(i10 * 2));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public short k(int i10) {
        return this.f61333a.read2Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61333a.toDirectBuffer();
    }
}
