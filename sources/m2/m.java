package m2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.q0;
import java.util.ArrayList;
import o2.C2377x;
import o2.C2378y;
import o2.M;
import q2.c;
import q2.f;
import r2.C2569i;
import r2.j;
import r2.w;
import s2.C2591b;
import s2.C2592c;
import u2.C2704h;
import u2.C2705i;
import x2.C2900D;
import y2.b;

public class m implements C2189A {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23720a;

    /* renamed from: b  reason: collision with root package name */
    private final C2569i f23721b;

    /* renamed from: c  reason: collision with root package name */
    private int f23722c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f23723d = 5000;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23724e;

    /* renamed from: f  reason: collision with root package name */
    private w f23725f = w.f25745a;

    /* renamed from: g  reason: collision with root package name */
    private boolean f23726g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23727h;

    public m(Context context) {
        this.f23720a = context;
        this.f23721b = new C2569i(context);
    }

    public q0[] a(Handler handler, C2900D d10, C2377x xVar, C2704h hVar, C2591b bVar) {
        ArrayList arrayList = new ArrayList();
        i(this.f23720a, this.f23722c, this.f23725f, this.f23724e, handler, d10, this.f23723d, arrayList);
        C2378y c10 = c(this.f23720a, this.f23726g, this.f23727h);
        if (c10 != null) {
            b(this.f23720a, this.f23722c, this.f23725f, this.f23724e, c10, handler, xVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        h(this.f23720a, hVar, handler.getLooper(), this.f23722c, arrayList2);
        f(this.f23720a, bVar, handler.getLooper(), this.f23722c, arrayList2);
        d(this.f23720a, this.f23722c, arrayList);
        e(arrayList);
        Handler handler2 = handler;
        g(this.f23720a, handler, this.f23722c, arrayList);
        return (q0[]) arrayList.toArray(new q0[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        throw new java.lang.RuntimeException("Error instantiating MIDI extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r1 = r21;
        r3 = r22;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e A[ExcHandler: Exception (r0v23 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[ExcHandler: Exception (r0v17 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[ExcHandler: Exception (r0v11 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:38:0x00a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r17, int r18, r2.w r19, boolean r20, o2.C2378y r21, android.os.Handler r22, o2.C2377x r23, java.util.ArrayList r24) {
        /*
            r16 = this;
            r0 = r18
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.Class<o2.y> r13 = o2.C2378y.class
            java.lang.Class<o2.x> r14 = o2.C2377x.class
            java.lang.Class<android.os.Handler> r15 = android.os.Handler.class
            java.lang.String r8 = "DefaultRenderersFactory"
            o2.W r7 = new o2.W
            r2.j$b r3 = r16.j()
            r1 = r7
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            r9 = r7
            r7 = r23
            r10 = r8
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r9)
            if (r0 != 0) goto L_0x0030
            return
        L_0x0030:
            int r1 = r24.size()
            r2 = 2
            if (r0 != r2) goto L_0x0039
            int r1 = r1 + -1
        L_0x0039:
            java.lang.String r0 = "androidx.media3.decoder.midi.MidiRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            java.lang.Object[] r2 = new java.lang.Object[]{r17}     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            androidx.media3.exoplayer.q0 r0 = (androidx.media3.exoplayer.q0) r0     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x005e }
            int r2 = r1 + 1
            r12.add(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0060, Exception -> 0x005e }
            java.lang.String r0 = "Loaded MidiRenderer."
            i2.p.f(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0060, Exception -> 0x005e }
            goto L_0x006b
        L_0x005e:
            r0 = move-exception
            goto L_0x0062
        L_0x0060:
            r1 = r2
            goto L_0x006a
        L_0x0062:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x006a:
            r2 = r1
        L_0x006b:
            java.lang.String r0 = "androidx.media3.decoder.opus.LibopusAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0093 }
            java.lang.Class[] r1 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0093 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0093 }
            r1 = r21
            r3 = r22
            r4 = r10
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x0093 }
            java.lang.Object r0 = r0.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x0093 }
            androidx.media3.exoplayer.q0 r0 = (androidx.media3.exoplayer.q0) r0     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x0093 }
            int r5 = r2 + 1
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0095, Exception -> 0x0093 }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            i2.p.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x0095, Exception -> 0x0093 }
            goto L_0x00a6
        L_0x0093:
            r0 = move-exception
            goto L_0x009d
        L_0x0095:
            r2 = r5
            goto L_0x00a5
        L_0x0097:
            r1 = r21
            r3 = r22
            r4 = r10
            goto L_0x00a5
        L_0x009d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a5:
            r5 = r2
        L_0x00a6:
            java.lang.String r0 = "androidx.media3.decoder.flac.LibflacAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            java.lang.Class[] r2 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            androidx.media3.exoplayer.q0 r0 = (androidx.media3.exoplayer.q0) r0     // Catch:{ ClassNotFoundException -> 0x00d5, Exception -> 0x00c9 }
            int r2 = r5 + 1
            r12.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c9 }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            i2.p.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c9 }
            goto L_0x00d6
        L_0x00c9:
            r0 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r5 = r2
            goto L_0x00d5
        L_0x00cd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00d5:
            r2 = r5
        L_0x00d6:
            java.lang.String r0 = "androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            java.lang.Class[] r5 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            androidx.media3.exoplayer.q0 r0 = (androidx.media3.exoplayer.q0) r0     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            i2.p.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x0100, Exception -> 0x00f7 }
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.m.b(android.content.Context, int, r2.w, boolean, o2.y, android.os.Handler, o2.x, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public C2378y c(Context context, boolean z10, boolean z11) {
        return new M.f(context).k(z10).j(z11).i();
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new b());
    }

    /* access modifiers changed from: protected */
    public void e(ArrayList arrayList) {
        arrayList.add(new f(c.a.f25348a, (ImageOutput) null));
    }

    /* access modifiers changed from: protected */
    public void f(Context context, C2591b bVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new C2592c(bVar, looper));
    }

    /* access modifiers changed from: protected */
    public void h(Context context, C2704h hVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new C2705i(hVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r5 = r23;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        throw new java.lang.RuntimeException("Error instantiating AV1 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[ExcHandler: Exception (r0v9 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:31:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(android.content.Context r19, int r20, r2.w r21, boolean r22, android.os.Handler r23, x2.C2900D r24, long r25, java.util.ArrayList r27) {
        /*
            r18 = this;
            r0 = r20
            r11 = r23
            r12 = r24
            r13 = r27
            java.lang.String r14 = "DefaultRenderersFactory"
            java.lang.Class<x2.D> r15 = x2.C2900D.class
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            x2.k r9 = new x2.k
            r2.j$b r3 = r18.j()
            r16 = 50
            r1 = r9
            r2 = r19
            r4 = r21
            r5 = r25
            r7 = r22
            r8 = r23
            r17 = r14
            r14 = r9
            r9 = r24
            r11 = r10
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r13.add(r14)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            int r1 = r27.size()
            r2 = 2
            if (r0 != r2) goto L_0x003b
            int r1 = r1 + -1
        L_0x003b:
            r0 = 50
            java.lang.String r2 = "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r11, r15, r4}     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            r5 = r23
            r6 = r11
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5, r12, r4}     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            androidx.media3.exoplayer.q0 r2 = (androidx.media3.exoplayer.q0) r2     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            int r3 = r1 + 1
            r13.add(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x0071 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            r2 = r17
            i2.p.f(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x0071 }
            goto L_0x0088
        L_0x0071:
            r0 = move-exception
            goto L_0x007f
        L_0x0073:
            r1 = r3
            goto L_0x0087
        L_0x0075:
            r2 = r17
            goto L_0x0073
        L_0x0078:
            r2 = r17
            goto L_0x0087
        L_0x007b:
            r5 = r23
            r6 = r11
            goto L_0x0078
        L_0x007f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0087:
            r3 = r1
        L_0x0088:
            java.lang.String r1 = "androidx.media3.decoder.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r6, r15, r7}     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r12, r7}     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Object r1 = r1.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            androidx.media3.exoplayer.q0 r1 = (androidx.media3.exoplayer.q0) r1     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            int r4 = r3 + 1
            r13.add(r3, r1)     // Catch:{ ClassNotFoundException -> 0x00b9, Exception -> 0x00b7 }
            java.lang.String r1 = "Loaded Libgav1VideoRenderer."
            i2.p.f(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00b9, Exception -> 0x00b7 }
            goto L_0x00c4
        L_0x00b7:
            r0 = move-exception
            goto L_0x00bb
        L_0x00b9:
            r3 = r4
            goto L_0x00c3
        L_0x00bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00c3:
            r4 = r3
        L_0x00c4:
            java.lang.String r1 = "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r6, r15, r7}     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r5, r12, r0}     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            androidx.media3.exoplayer.q0 r0 = (androidx.media3.exoplayer.q0) r0     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r13.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.String r0 = "Loaded FfmpegVideoRenderer."
            i2.p.f(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x00fa
        L_0x00f1:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.m.i(android.content.Context, int, r2.w, boolean, android.os.Handler, x2.D, long, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public j.b j() {
        return this.f23721b;
    }

    /* access modifiers changed from: protected */
    public void g(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
