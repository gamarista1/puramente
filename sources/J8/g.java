package j8;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final a f44881g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f44882a;

    /* renamed from: b  reason: collision with root package name */
    private final float f44883b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f44884c;

    /* renamed from: d  reason: collision with root package name */
    private final Float f44885d;

    /* renamed from: e  reason: collision with root package name */
    private final Float f44886e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f44887f;

    public static final class a {

        /* renamed from: j8.g$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0686a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f44888a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
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
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f44888a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: j8.g.a.C0686a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(ReadableMap readableMap, Context context) {
            Integer num;
            Float f10;
            Float f11;
            Integer valueOf;
            C6496s.h(context, "context");
            Boolean bool = null;
            if (readableMap == null || !readableMap.hasKey("offsetX") || !readableMap.hasKey("offsetY")) {
                return null;
            }
            float f12 = (float) readableMap.getDouble("offsetX");
            float f13 = (float) readableMap.getDouble("offsetY");
            if (readableMap.hasKey("color")) {
                ReadableType type = readableMap.getType("color");
                int i10 = C0686a.f44888a[type.ordinal()];
                if (i10 == 1) {
                    valueOf = Integer.valueOf(readableMap.getInt("color"));
                } else if (i10 == 2) {
                    valueOf = ColorPropConverter.getColor(readableMap.getMap("color"), context);
                } else {
                    throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (readableMap.hasKey("blurRadius")) {
                f10 = Float.valueOf((float) readableMap.getDouble("blurRadius"));
            } else {
                f10 = null;
            }
            if (readableMap.hasKey("spreadDistance")) {
                f11 = Float.valueOf((float) readableMap.getDouble("spreadDistance"));
            } else {
                f11 = null;
            }
            if (readableMap.hasKey("inset")) {
                bool = Boolean.valueOf(readableMap.getBoolean("inset"));
            }
            return new g(f12, f13, num, f10, f11, bool);
        }

        private a() {
        }
    }

    public g(float f10, float f11, Integer num, Float f12, Float f13, Boolean bool) {
        this.f44882a = f10;
        this.f44883b = f11;
        this.f44884c = num;
        this.f44885d = f12;
        this.f44886e = f13;
        this.f44887f = bool;
    }

    public final Float a() {
        return this.f44885d;
    }

    public final Integer b() {
        return this.f44884c;
    }

    public final Boolean c() {
        return this.f44887f;
    }

    public final float d() {
        return this.f44882a;
    }

    public final float e() {
        return this.f44883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Float.compare(this.f44882a, gVar.f44882a) == 0 && Float.compare(this.f44883b, gVar.f44883b) == 0 && C6496s.c(this.f44884c, gVar.f44884c) && C6496s.c(this.f44885d, gVar.f44885d) && C6496s.c(this.f44886e, gVar.f44886e) && C6496s.c(this.f44887f, gVar.f44887f)) {
            return true;
        }
        return false;
    }

    public final Float f() {
        return this.f44886e;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = ((Float.hashCode(this.f44882a) * 31) + Float.hashCode(this.f44883b)) * 31;
        Integer num = this.f44884c;
        int i13 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i14 = (hashCode + i10) * 31;
        Float f10 = this.f44885d;
        if (f10 == null) {
            i11 = 0;
        } else {
            i11 = f10.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Float f11 = this.f44886e;
        if (f11 == null) {
            i12 = 0;
        } else {
            i12 = f11.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Boolean bool = this.f44887f;
        if (bool != null) {
            i13 = bool.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        float f10 = this.f44882a;
        float f11 = this.f44883b;
        Integer num = this.f44884c;
        Float f12 = this.f44885d;
        Float f13 = this.f44886e;
        Boolean bool = this.f44887f;
        return "BoxShadow(offsetX=" + f10 + ", offsetY=" + f11 + ", color=" + num + ", blurRadius=" + f12 + ", spreadDistance=" + f13 + ", inset=" + bool + ")";
    }
}
