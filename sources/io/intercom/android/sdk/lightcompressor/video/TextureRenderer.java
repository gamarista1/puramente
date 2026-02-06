package io.intercom.android.sdk.lightcompressor.video;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0017¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/TextureRenderer;", "", "<init>", "()V", "", "shaderType", "", "source", "loadShader", "(ILjava/lang/String;)I", "createProgram", "()I", "getTextureId", "Landroid/graphics/SurfaceTexture;", "st", "Llf/M;", "drawFrame", "(Landroid/graphics/SurfaceTexture;)V", "surfaceCreated", "op", "checkGlError", "(Ljava/lang/String;)V", "floatSizeBytes", "I", "triangleVerticesDataStrideBytes", "triangleVerticesDataPosOffset", "triangleVerticesDataUvOffset", "Ljava/nio/FloatBuffer;", "mTriangleVertices", "Ljava/nio/FloatBuffer;", "vertexShader", "Ljava/lang/String;", "fragmentShader", "", "mMVPMatrix", "[F", "mSTMatrix", "mProgram", "mTextureID", "muMVPMatrixHandle", "muSTMatrixHandle", "maPositionHandle", "maTextureHandle", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextureRenderer {
    private final int floatSizeBytes = 4;
    private final String fragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private final float[] mMVPMatrix = new float[16];
    private int mProgram;
    private final float[] mSTMatrix;
    private int mTextureID;
    private FloatBuffer mTriangleVertices;
    private int maPositionHandle;
    private int maTextureHandle;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    private final int triangleVerticesDataPosOffset;
    private final int triangleVerticesDataStrideBytes = (4 * 5);
    private final int triangleVerticesDataUvOffset = 3;
    private final String vertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    public TextureRenderer() {
        float[] fArr = new float[16];
        this.mSTMatrix = fArr;
        this.mTextureID = -12345;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(20 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTriangleVertices = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    private final int createProgram() {
        int loadShader;
        int loadShader2 = loadShader(35633, this.vertexShader);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, this.fragmentShader)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    private final int loadShader(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        checkGlError("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void checkGlError(String str) {
        C6496s.h(str, "op");
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }

    public final void drawFrame(SurfaceTexture surfaceTexture) {
        C6496s.h(surfaceTexture, "st");
        checkGlError("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.mSTMatrix);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mTextureID);
        this.mTriangleVertices.position(this.triangleVerticesDataPosOffset);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, this.triangleVerticesDataStrideBytes, this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        checkGlError("glEnableVertexAttribArray maPositionHandle");
        this.mTriangleVertices.position(this.triangleVerticesDataUvOffset);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, this.triangleVerticesDataStrideBytes, this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        checkGlError("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
        GLES20.glFinish();
    }

    public final int getTextureId() {
        return this.mTextureID;
    }

    public final void surfaceCreated() {
        int createProgram = createProgram();
        this.mProgram = createProgram;
        if (createProgram != 0) {
            this.maPositionHandle = GLES20.glGetAttribLocation(createProgram, "aPosition");
            checkGlError("glGetAttribLocation aPosition");
            if (this.maPositionHandle != -1) {
                this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
                checkGlError("glGetAttribLocation aTextureCoord");
                if (this.maTextureHandle != -1) {
                    this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
                    checkGlError("glGetUniformLocation uMVPMatrix");
                    if (this.muMVPMatrixHandle != -1) {
                        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
                        checkGlError("glGetUniformLocation uSTMatrix");
                        if (this.muSTMatrixHandle != -1) {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            int i10 = iArr[0];
                            this.mTextureID = i10;
                            GLES20.glBindTexture(36197, i10);
                            checkGlError("glBindTexture mTextureID");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            checkGlError("glTexParameter");
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        throw new RuntimeException("failed creating program");
    }
}
