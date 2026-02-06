package com.facebook.react.uimanager;

import Sg.p;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import j8.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.react.uimanager.x  reason: case insensitive filesystem */
public final class C3430x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f41831c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f41832a;

    /* renamed from: b  reason: collision with root package name */
    private final C3431y f41833b;

    /* renamed from: com.facebook.react.uimanager.x$a */
    public static final class a {

        /* renamed from: com.facebook.react.uimanager.x$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0645a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41834a;

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
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f41834a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3430x.a.C0645a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3430x a(Dynamic dynamic) {
            C6496s.h(dynamic, "dynamic");
            int i10 = C0645a.f41834a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double asDouble = dynamic.asDouble();
                if (asDouble >= 0.0d) {
                    return new C3430x((float) asDouble, C3431y.POINT);
                }
                return null;
            } else if (i10 != 2) {
                ReadableType type = dynamic.getType();
                U5.a.I("ReactNative", "Unsupported type for radius property: " + type);
                return null;
            } else {
                String asString = dynamic.asString();
                if (p.u(asString, "%", false, 2, (Object) null)) {
                    try {
                        String substring = asString.substring(0, asString.length() - 1);
                        C6496s.g(substring, "substring(...)");
                        float parseFloat = Float.parseFloat(substring);
                        if (parseFloat >= 0.0f) {
                            return new C3430x(parseFloat, C3431y.PERCENT);
                        }
                        return null;
                    } catch (NumberFormatException unused) {
                        U5.a.I("ReactNative", "Invalid percentage format: " + asString);
                        return null;
                    }
                } else {
                    U5.a.I("ReactNative", "Invalid string value: " + asString);
                    return null;
                }
            }
        }

        private a() {
        }
    }

    public C3430x(float f10, C3431y yVar) {
        C6496s.h(yVar, "type");
        this.f41832a = f10;
        this.f41833b = yVar;
    }

    public final C3431y a() {
        return this.f41833b;
    }

    public final j b(float f10, float f11) {
        if (this.f41833b == C3431y.PERCENT) {
            float f12 = this.f41832a;
            float f13 = (float) 100;
            return new j((f12 / f13) * f10, (f12 / f13) * f11);
        }
        float f14 = this.f41832a;
        return new j(f14, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3430x)) {
            return false;
        }
        C3430x xVar = (C3430x) obj;
        return Float.compare(this.f41832a, xVar.f41832a) == 0 && this.f41833b == xVar.f41833b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f41832a) * 31) + this.f41833b.hashCode();
    }

    public String toString() {
        float f10 = this.f41832a;
        C3431y yVar = this.f41833b;
        return "LengthPercentage(value=" + f10 + ", type=" + yVar + ")";
    }
}
