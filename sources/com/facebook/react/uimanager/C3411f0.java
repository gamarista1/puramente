package com.facebook.react.uimanager;

import com.facebook.yoga.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.react.uimanager.f0  reason: case insensitive filesystem */
public final class C3411f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f41673e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f41674f = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* renamed from: a  reason: collision with root package name */
    private final float f41675a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f41676b;

    /* renamed from: c  reason: collision with root package name */
    private int f41677c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f41678d;

    /* renamed from: com.facebook.react.uimanager.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private a() {
        }
    }

    public C3411f0(float f10, float[] fArr) {
        C6496s.h(fArr, "spacing");
        this.f41675a = f10;
        this.f41676b = fArr;
    }

    public final float a(int i10) {
        float f10;
        char c10;
        if (!(i10 == 4 || i10 == 5)) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    f10 = this.f41675a;
                    break;
            }
        }
        f10 = Float.NaN;
        int i11 = this.f41677c;
        if (i11 == 0) {
            return f10;
        }
        int[] iArr = f41674f;
        if ((iArr[i10] & i11) != 0) {
            return this.f41676b[i10];
        }
        if (this.f41678d) {
            if (i10 == 1 || i10 == 3) {
                c10 = 7;
            } else {
                c10 = 6;
            }
            if ((iArr[c10] & i11) != 0) {
                return this.f41676b[c10];
            }
            if ((i11 & iArr[8]) != 0) {
                return this.f41676b[8];
            }
        }
        return f10;
    }

    public final float b(int i10) {
        return this.f41676b[i10];
    }

    public final boolean c(int i10, float f10) {
        int i11;
        boolean z10 = false;
        if (C3421n.a(this.f41676b[i10], f10)) {
            return false;
        }
        this.f41676b[i10] = f10;
        if (g.a(f10)) {
            i11 = (~f41674f[i10]) & this.f41677c;
        } else {
            i11 = f41674f[i10] | this.f41677c;
        }
        this.f41677c = i11;
        int[] iArr = f41674f;
        if (!((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0)) {
            z10 = true;
        }
        this.f41678d = z10;
        return true;
    }

    public C3411f0() {
        this(0.0f, f41673e.b());
    }

    public C3411f0(float f10) {
        this(f10, f41673e.b());
    }
}
