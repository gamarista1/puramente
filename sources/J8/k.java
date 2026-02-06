package j8;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import sf.C6714a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final a f44899a;

    /* renamed from: b  reason: collision with root package name */
    private final l f44900b;

    private enum a {
        LINEAR_GRADIENT;

        static {
            a[] a10;
            f44903c = C6714a.a(a10);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44904a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f44904a = iArr;
        }
    }

    public k(ReadableMap readableMap, Context context) {
        Integer num;
        C6496s.h(context, "context");
        if (readableMap != null) {
            String string = readableMap.getString("type");
            if (C6496s.c(string, "linearGradient")) {
                this.f44899a = a.LINEAR_GRADIENT;
                ReadableMap map = readableMap.getMap("direction");
                if (map != null) {
                    ReadableArray array = readableMap.getArray("colorStops");
                    if (array != null) {
                        int size = array.size();
                        int[] iArr = new int[size];
                        float[] fArr = new float[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            ReadableMap map2 = array.getMap(i10);
                            if (map2 != null) {
                                if (map2.getType("color") == ReadableType.Map) {
                                    num = ColorPropConverter.getColor(map2.getMap("color"), context);
                                } else {
                                    num = Integer.valueOf(map2.getInt("color"));
                                }
                                C6496s.e(num);
                                iArr[i10] = num.intValue();
                                fArr[i10] = (float) map2.getDouble("position");
                            }
                        }
                        this.f44900b = new l(map, iArr, fArr);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid colorStops array");
                }
                throw new IllegalArgumentException("Gradient must have direction");
            }
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        throw new IllegalArgumentException("Gradient cannot be null");
    }

    public final Shader a(Rect rect) {
        C6496s.h(rect, "bounds");
        if (b.f44904a[this.f44899a.ordinal()] == 1) {
            return this.f44900b.c((float) rect.width(), (float) rect.height());
        }
        throw new C6535s();
    }
}
