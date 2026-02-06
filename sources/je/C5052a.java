package je;

import Ff.d;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.O;
import pe.j;
import sf.C6714a;

/* renamed from: je.a  reason: case insensitive filesystem */
public enum C5052a {
    NONE(O.b(Void.class), 0),
    DOUBLE(O.b(Double.TYPE), 0, 2, (int) null),
    INT(O.b(r1), 0, 2, (int) null),
    LONG(O.b(Long.TYPE), 0, 2, (int) null),
    FLOAT(O.b(Float.TYPE), 0, 2, (int) null),
    BOOLEAN(O.b(Boolean.TYPE), 0, 2, (int) null),
    STRING(O.b(String.class), 0, 2, (int) null),
    JS_OBJECT(O.b(JavaScriptObject.class), 0, 2, (int) null),
    JS_VALUE(O.b(JavaScriptValue.class), 0, 2, (int) null),
    READABLE_ARRAY(O.b(ReadableArray.class), 0, 2, (int) null),
    READABLE_MAP(O.b(ReadableMap.class), 0, 2, (int) null),
    UINT8_TYPED_ARRAY(O.b(byte[].class), 0, 2, (int) null),
    TYPED_ARRAY(O.b(j.class), 0, 2, (int) null),
    PRIMITIVE_ARRAY(O.b(Object[].class), 0, 2, (int) null),
    LIST(O.b(List.class), 0, 2, (int) null),
    MAP(O.b(Map.class), 0, 2, (int) null),
    VIEW_TAG(O.b(r1), 0, 2, (int) null),
    SHARED_OBJECT_ID(O.b(r1), 0, 2, (int) null),
    JS_FUNCTION(O.b(JavaScriptFunction.class), 0, 2, (int) null),
    ANY(O.b(Object.class), 0, 2, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    private final d f60879a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60880b;

    static {
        C5052a[] a10;
        f60878x = C6714a.a(a10);
    }

    private C5052a(d dVar, int i10) {
        this.f60879a = dVar;
        this.f60880b = i10;
    }

    public final d b() {
        return this.f60879a;
    }

    public final int c() {
        return this.f60880b;
    }
}
