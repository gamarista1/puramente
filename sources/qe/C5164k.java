package qe;

import Ff.d;
import ae.C4464a;
import android.graphics.Color;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6559l;
import mf.C6565s;

/* renamed from: qe.k  reason: case insensitive filesystem */
public final class C5164k extends C5175w {

    /* renamed from: qe.k$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61446a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f61446a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.C5164k.a.<clinit>():void");
        }
    }

    public C5164k(boolean z10) {
        super(z10);
    }

    private final Color g(double[] dArr) {
        double d10;
        Double k02 = C6559l.k0(dArr, 3);
        if (k02 != null) {
            d10 = k02.doubleValue();
        } else {
            d10 = 1.0d;
        }
        Color a10 = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) d10);
        C6496s.g(a10, "valueOf(...)");
        return a10;
    }

    private final Color h(int i10) {
        Color a10 = Color.valueOf(i10);
        C6496s.g(a10, "valueOf(...)");
        return a10;
    }

    private final Color i(String str) {
        List list = (List) C5165l.f61447a.get(str);
        if (list != null) {
            Color a10 = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            C6496s.g(a10, "valueOf(...)");
            return a10;
        }
        Color a11 = Color.valueOf(Color.parseColor(str));
        C6496s.g(a11, "valueOf(...)");
        return a11;
    }

    public ExpectedType b() {
        return new ExpectedType(new SingleType(C5052a.INT, (ExpectedType[]) null, 2, (DefaultConstructorMarker) null), new SingleType(C5052a.STRING, (ExpectedType[]) null, 2, (DefaultConstructorMarker) null), new SingleType(C5052a.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(C5052a.DOUBLE)}));
    }

    public boolean c() {
        return false;
    }

    /* renamed from: j */
    public Color e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (obj instanceof Integer) {
            return h(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return i((String) obj);
        }
        if (obj instanceof double[]) {
            return g((double[]) obj);
        }
        d b10 = O.b(obj.getClass());
        throw new UnexpectedException("Unknown argument type: " + b10);
    }

    /* renamed from: k */
    public Color f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        int i10 = a.f61446a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return h((int) dynamic.asDouble());
        }
        if (i10 == 2) {
            return i(dynamic.asString());
        }
        if (i10 == 3) {
            ArrayList<Object> arrayList = dynamic.asArray().toArrayList();
            ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            for (T next : arrayList) {
                C6496s.f(next, "null cannot be cast to non-null type kotlin.Double");
                Double d10 = (Double) next;
                d10.doubleValue();
                arrayList2.add(d10);
            }
            return g(C6565s.a1(arrayList2));
        }
        ReadableType type = dynamic.getType();
        throw new UnexpectedException("Unknown argument type: " + type);
    }
}
