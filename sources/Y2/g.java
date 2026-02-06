package y2;

import android.opengl.GLES20;
import android.util.Log;
import i2.C2085j;
import i2.C2086k;
import java.nio.FloatBuffer;
import y2.e;

final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f28657j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f28658k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f28659l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f28660m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f28661n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f28662a;

    /* renamed from: b  reason: collision with root package name */
    private a f28663b;

    /* renamed from: c  reason: collision with root package name */
    private a f28664c;

    /* renamed from: d  reason: collision with root package name */
    private C2085j f28665d;

    /* renamed from: e  reason: collision with root package name */
    private int f28666e;

    /* renamed from: f  reason: collision with root package name */
    private int f28667f;

    /* renamed from: g  reason: collision with root package name */
    private int f28668g;

    /* renamed from: h  reason: collision with root package name */
    private int f28669h;

    /* renamed from: i  reason: collision with root package name */
    private int f28670i;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f28671a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f28672b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f28673c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f28674d;

        public a(e.b bVar) {
            this.f28671a = bVar.a();
            this.f28672b = C2086k.e(bVar.f28655c);
            this.f28673c = C2086k.e(bVar.f28656d);
            int i10 = bVar.f28654b;
            if (i10 == 1) {
                this.f28674d = 5;
            } else if (i10 != 2) {
                this.f28674d = 4;
            } else {
                this.f28674d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f28648a;
        e.a aVar2 = eVar.f28649b;
        if (aVar.b() == 1 && aVar.a(0).f28653a == 0 && aVar2.b() == 1 && aVar2.a(0).f28653a == 0) {
            return true;
        }
        return false;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar;
        float[] fArr2;
        if (z10) {
            aVar = this.f28664c;
        } else {
            aVar = this.f28663b;
        }
        if (aVar != null) {
            int i11 = this.f28662a;
            if (i11 == 1) {
                if (z10) {
                    fArr2 = f28659l;
                } else {
                    fArr2 = f28658k;
                }
            } else if (i11 != 2) {
                fArr2 = f28657j;
            } else if (z10) {
                fArr2 = f28661n;
            } else {
                fArr2 = f28660m;
            }
            GLES20.glUniformMatrix3fv(this.f28667f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f28666e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f28670i, 0);
            try {
                C2086k.b();
            } catch (C2086k.a e10) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
            }
            GLES20.glVertexAttribPointer(this.f28668g, 3, 5126, false, 12, aVar.f28672b);
            try {
                C2086k.b();
            } catch (C2086k.a e11) {
                Log.e("ProjectionRenderer", "Failed to load position data", e11);
            }
            GLES20.glVertexAttribPointer(this.f28669h, 2, 5126, false, 8, aVar.f28673c);
            try {
                C2086k.b();
            } catch (C2086k.a e12) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e12);
            }
            GLES20.glDrawArrays(aVar.f28674d, 0, aVar.f28671a);
            try {
                C2086k.b();
            } catch (C2086k.a e13) {
                Log.e("ProjectionRenderer", "Failed to render", e13);
            }
        }
    }

    public void b() {
        try {
            C2085j jVar = new C2085j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f28665d = jVar;
            this.f28666e = jVar.j("uMvpMatrix");
            this.f28667f = this.f28665d.j("uTexMatrix");
            this.f28668g = this.f28665d.e("aPosition");
            this.f28669h = this.f28665d.e("aTexCoords");
            this.f28670i = this.f28665d.j("uTexture");
        } catch (C2086k.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f28662a = eVar.f28650c;
            a aVar = new a(eVar.f28648a.a(0));
            this.f28663b = aVar;
            if (!eVar.f28651d) {
                aVar = new a(eVar.f28649b.a(0));
            }
            this.f28664c = aVar;
        }
    }
}
