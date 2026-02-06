package i2;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i2.j  reason: case insensitive filesystem */
public final class C2085j {

    /* renamed from: a  reason: collision with root package name */
    private final int f22109a;

    /* renamed from: b  reason: collision with root package name */
    private final a[] f22110b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f22111c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f22112d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f22113e;

    /* renamed from: i2.j$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f22114a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22115b;

        private a(String str, int i10) {
            this.f22114a = str;
            this.f22115b = i10;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C2085j.h(bArr));
            return new a(str, C2085j.f(i10, str));
        }
    }

    /* renamed from: i2.j$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f22116a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22117b;

        /* renamed from: c  reason: collision with root package name */
        private final int f22118c;

        /* renamed from: d  reason: collision with root package name */
        private final float[] f22119d = new float[16];

        /* renamed from: e  reason: collision with root package name */
        private final int[] f22120e = new int[4];

        private b(String str, int i10, int i11) {
            this.f22116a = str;
            this.f22117b = i10;
            this.f22118c = i11;
        }

        public static b a(int i10, int i11) {
            int i12 = i10;
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveUniform(i10, i11, i13, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C2085j.h(bArr));
            return new b(str, C2085j.i(i10, str), iArr2[0]);
        }
    }

    public C2085j(String str, String str2) {
        boolean z10;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f22109a = glCreateProgram;
        C2086k.b();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2086k.c(z10, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f22112d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f22110b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a a10 = a.a(this.f22109a, i10);
            this.f22110b[i10] = a10;
            this.f22112d.put(a10.f22114a, a10);
        }
        this.f22113e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f22109a, 35718, iArr3, 0);
        this.f22111c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b a11 = b.a(this.f22109a, i11);
            this.f22111c[i11] = a11;
            this.f22113e.put(a11.f22116a, a11);
        }
        C2086k.b();
    }

    private static void d(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z10 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        }
        C2086k.c(z10, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C2086k.b();
    }

    /* access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f22109a, str);
    }

    /* access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) {
        int g10 = g(str);
        GLES20.glEnableVertexAttribArray(g10);
        C2086k.b();
        return g10;
    }

    public int j(String str) {
        return i(this.f22109a, str);
    }
}
