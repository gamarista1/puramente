package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class D1 implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25403a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final short f25404b = b(5120);

    /* renamed from: c  reason: collision with root package name */
    private static final short f25405c = b(-1025);

    /* renamed from: d  reason: collision with root package name */
    private static final short f25406d = b(31743);

    /* renamed from: e  reason: collision with root package name */
    private static final short f25407e = b(1024);

    /* renamed from: f  reason: collision with root package name */
    private static final short f25408f = b(1);

    /* renamed from: g  reason: collision with root package name */
    private static final short f25409g = b(32256);

    /* renamed from: h  reason: collision with root package name */
    private static final short f25410h = b(-1024);

    /* renamed from: i  reason: collision with root package name */
    private static final short f25411i = b(Short.MIN_VALUE);

    /* renamed from: j  reason: collision with root package name */
    private static final short f25412j = b(31744);

    /* renamed from: k  reason: collision with root package name */
    private static final short f25413k = b(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static short a(float f10) {
        int i10;
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & floatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i15 = 512;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
        } else {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                } else {
                    i14 = i16;
                }
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
        }
        return b((short) i10);
    }

    public static short b(short s10) {
        return s10;
    }
}
