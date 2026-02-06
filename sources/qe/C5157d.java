package qe;

import Ff.d;
import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import pe.a;
import pe.b;
import pe.c;
import pe.f;
import pe.g;
import pe.h;
import pe.j;
import pe.l;
import pe.m;
import pe.n;
import pe.o;

/* renamed from: qe.d  reason: case insensitive filesystem */
public final class C5157d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5157d f61437a = new C5157d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f61438b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f61439c = 8;

    static {
        Map c10 = O.c();
        Map map = c10;
        for (d dVar : C6565s.q(kotlin.jvm.internal.O.b(Integer.TYPE), kotlin.jvm.internal.O.b(Float.TYPE), kotlin.jvm.internal.O.b(Double.TYPE), kotlin.jvm.internal.O.b(Long.TYPE), kotlin.jvm.internal.O.b(Boolean.TYPE), kotlin.jvm.internal.O.b(String.class), kotlin.jvm.internal.O.b(byte[].class), kotlin.jvm.internal.O.b(long[].class), kotlin.jvm.internal.O.b(int[].class), kotlin.jvm.internal.O.b(boolean[].class), kotlin.jvm.internal.O.b(float[].class), kotlin.jvm.internal.O.b(double[].class), kotlin.jvm.internal.O.b(JavaScriptValue.class), kotlin.jvm.internal.O.b(JavaScriptObject.class), kotlin.jvm.internal.O.b(j.class), kotlin.jvm.internal.O.b(h.class), kotlin.jvm.internal.O.b(f.class), kotlin.jvm.internal.O.b(g.class), kotlin.jvm.internal.O.b(n.class), kotlin.jvm.internal.O.b(o.class), kotlin.jvm.internal.O.b(l.class), kotlin.jvm.internal.O.b(m.class), kotlin.jvm.internal.O.b(c.class), kotlin.jvm.internal.O.b(pe.d.class), kotlin.jvm.internal.O.b(a.class), kotlin.jvm.internal.O.b(b.class), kotlin.jvm.internal.O.b(ReadableArray.class), kotlin.jvm.internal.O.b(ReadableMap.class), kotlin.jvm.internal.O.b(URL.class), kotlin.jvm.internal.O.b(Uri.class), kotlin.jvm.internal.O.b(URI.class), kotlin.jvm.internal.O.b(File.class), kotlin.jvm.internal.O.b(Object.class), kotlin.jvm.internal.O.b(C6514M.class), kotlin.jvm.internal.O.b(Nd.b.class))) {
            Map map2 = map;
            map2.put(C6502A.a(dVar, Boolean.FALSE), new C5155b(new C(dVar, false)));
            map2.put(C6502A.a(dVar, Boolean.TRUE), new C5155b(new C(dVar, true)));
        }
        f61438b = O.b(map);
    }

    private C5157d() {
    }

    public final Map a() {
        return f61438b;
    }
}
