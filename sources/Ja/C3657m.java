package ja;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ja.m  reason: case insensitive filesystem */
public final class C3657m {

    /* renamed from: a  reason: collision with root package name */
    private final int f45020a;

    /* renamed from: b  reason: collision with root package name */
    private final a[] f45021b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f45022c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f45023d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f45024e;

    /* renamed from: ja.m$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f45025a;

        /* renamed from: b  reason: collision with root package name */
        private final int f45026b;

        /* renamed from: c  reason: collision with root package name */
        private final int f45027c;

        private a(String str, int i10, int i11) {
            this.f45025a = str;
            this.f45026b = i10;
            this.f45027c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C3657m.h(bArr));
            return new a(str, i11, C3657m.f(i10, str));
        }
    }

    /* renamed from: ja.m$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f45028a;

        /* renamed from: b  reason: collision with root package name */
        private final int f45029b;

        /* renamed from: c  reason: collision with root package name */
        private final int f45030c;

        /* renamed from: d  reason: collision with root package name */
        private final float[] f45031d = new float[16];

        private b(String str, int i10, int i11) {
            this.f45028a = str;
            this.f45029b = i10;
            this.f45030c = i11;
        }

        public static b a(int i10, int i11) {
            int i12 = i10;
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveUniform(i10, i11, i13, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C3657m.h(bArr));
            return new b(str, C3657m.i(i10, str), iArr2[0]);
        }
    }

    public C3657m(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f45020a = glCreateProgram;
        C3658n.c();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            C3658n.j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.f45023d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f45021b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a a10 = a.a(this.f45020a, i10);
            this.f45021b[i10] = a10;
            this.f45023d.put(a10.f45025a, a10);
        }
        this.f45024e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f45020a, 35718, iArr3, 0);
        this.f45022c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b a11 = b.a(this.f45020a, i11);
            this.f45022c[i11] = a11;
            this.f45024e.put(a11.f45028a, a11);
        }
        C3658n.c();
    }

    private static void d(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            C3658n.j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C3658n.c();
    }

    /* access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f45020a, str);
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
        C3658n.c();
        return g10;
    }

    public int j(String str) {
        return i(this.f45020a, str);
    }
}
