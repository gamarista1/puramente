package F6;

import G6.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30797a = new b();

    private b() {
    }

    public static final b.a a(Map map, Map map2, Map map3, Map map4, Rect rect, String str, PointF pointF, Map map5, Object obj, boolean z10, Uri uri) {
        C6496s.h(map, "componentAttribution");
        C6496s.h(map2, "shortcutAttribution");
        b.a aVar = new b.a();
        if (rect != null) {
            aVar.f31512h = rect.width();
            aVar.f31513i = rect.height();
        }
        aVar.f31514j = str;
        if (pointF != null) {
            aVar.f31515k = Float.valueOf(pointF.x);
            aVar.f31516l = Float.valueOf(pointF.y);
        }
        aVar.f31510f = obj;
        aVar.f31517m = z10;
        aVar.f31511g = uri;
        aVar.f31507c = map3;
        aVar.f31508d = map5;
        aVar.f31506b = map2;
        aVar.f31505a = map;
        aVar.f31509e = map4;
        return aVar;
    }
}
