package la;

import android.opengl.GLES20;
import ja.C3657m;
import ja.C3658n;
import java.nio.FloatBuffer;
import la.e;

final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f46390j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f46391k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f46392l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f46393m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f46394n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f46395a;

    /* renamed from: b  reason: collision with root package name */
    private a f46396b;

    /* renamed from: c  reason: collision with root package name */
    private a f46397c;

    /* renamed from: d  reason: collision with root package name */
    private C3657m f46398d;

    /* renamed from: e  reason: collision with root package name */
    private int f46399e;

    /* renamed from: f  reason: collision with root package name */
    private int f46400f;

    /* renamed from: g  reason: collision with root package name */
    private int f46401g;

    /* renamed from: h  reason: collision with root package name */
    private int f46402h;

    /* renamed from: i  reason: collision with root package name */
    private int f46403i;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f46404a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f46405b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f46406c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f46407d;

        public a(e.b bVar) {
            this.f46404a = bVar.a();
            this.f46405b = C3658n.e(bVar.f46388c);
            this.f46406c = C3658n.e(bVar.f46389d);
            int i10 = bVar.f46387b;
            if (i10 == 1) {
                this.f46407d = 5;
            } else if (i10 != 2) {
                this.f46407d = 4;
            } else {
                this.f46407d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f46381a;
        e.a aVar2 = eVar.f46382b;
        if (aVar.b() == 1 && aVar.a(0).f46386a == 0 && aVar2.b() == 1 && aVar2.a(0).f46386a == 0) {
            return true;
        }
        return false;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar;
        float[] fArr2;
        if (z10) {
            aVar = this.f46397c;
        } else {
            aVar = this.f46396b;
        }
        if (aVar != null) {
            int i11 = this.f46395a;
            if (i11 == 1) {
                if (z10) {
                    fArr2 = f46392l;
                } else {
                    fArr2 = f46391k;
                }
            } else if (i11 != 2) {
                fArr2 = f46390j;
            } else if (z10) {
                fArr2 = f46394n;
            } else {
                fArr2 = f46393m;
            }
            GLES20.glUniformMatrix3fv(this.f46400f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f46399e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f46403i, 0);
            C3658n.c();
            GLES20.glVertexAttribPointer(this.f46401g, 3, 5126, false, 12, aVar.f46405b);
            C3658n.c();
            GLES20.glVertexAttribPointer(this.f46402h, 2, 5126, false, 8, aVar.f46406c);
            C3658n.c();
            GLES20.glDrawArrays(aVar.f46407d, 0, aVar.f46404a);
            C3658n.c();
        }
    }

    public void b() {
        C3657m mVar = new C3657m("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.f46398d = mVar;
        this.f46399e = mVar.j("uMvpMatrix");
        this.f46400f = this.f46398d.j("uTexMatrix");
        this.f46401g = this.f46398d.e("aPosition");
        this.f46402h = this.f46398d.e("aTexCoords");
        this.f46403i = this.f46398d.j("uTexture");
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f46395a = eVar.f46383c;
            a aVar = new a(eVar.f46381a.a(0));
            this.f46396b = aVar;
            if (!eVar.f46384d) {
                aVar = new a(eVar.f46382b.a(0));
            }
            this.f46397c = aVar;
        }
    }
}
