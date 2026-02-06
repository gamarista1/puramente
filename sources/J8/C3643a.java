package j8;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.C6496s;

/* renamed from: j8.a  reason: case insensitive filesystem */
public final class C3643a {

    /* renamed from: a  reason: collision with root package name */
    private final k f44844a;

    public C3643a(ReadableMap readableMap, Context context) {
        C6496s.h(context, "context");
        k kVar = null;
        if (readableMap != null) {
            try {
                kVar = new k(readableMap, context);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f44844a = kVar;
    }

    public final Shader a(Rect rect) {
        C6496s.h(rect, "bounds");
        k kVar = this.f44844a;
        if (kVar != null) {
            return kVar.a(rect);
        }
        return null;
    }
}
