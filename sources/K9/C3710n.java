package k9;

import C9.j;
import C9.l;
import C9.q;
import D9.e;
import D9.f;
import W9.n;
import W9.o;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import ka.w;
import la.b;
import m9.C3848f;
import m9.r;
import m9.s;
import m9.y;

/* renamed from: k9.n  reason: case insensitive filesystem */
public class C3710n implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f45699a;

    /* renamed from: b  reason: collision with root package name */
    private final j f45700b = new j();

    /* renamed from: c  reason: collision with root package name */
    private int f45701c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f45702d = 5000;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45703e;

    /* renamed from: f  reason: collision with root package name */
    private q f45704f = q.f30253a;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45705g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45706h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f45707i;

    public C3710n(Context context) {
        this.f45699a = context;
    }

    public a1[] a(Handler handler, w wVar, r rVar, n nVar, e eVar) {
        ArrayList arrayList = new ArrayList();
        h(this.f45699a, this.f45701c, this.f45704f, this.f45703e, handler, wVar, this.f45702d, arrayList);
        s c10 = c(this.f45699a, this.f45705g, this.f45706h, this.f45707i);
        if (c10 != null) {
            b(this.f45699a, this.f45701c, this.f45704f, this.f45703e, c10, handler, rVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        g(this.f45699a, nVar, handler.getLooper(), this.f45701c, arrayList2);
        e(this.f45699a, eVar, handler.getLooper(), this.f45701c, arrayList2);
        d(this.f45699a, this.f45701c, arrayList);
        Handler handler2 = handler;
        f(this.f45699a, handler, this.f45701c, arrayList);
        return (a1[]) arrayList.toArray(new a1[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        throw new java.lang.RuntimeException("Error instantiating MIDI extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r1 = r21;
        r3 = r22;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[ExcHandler: Exception (r0v23 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a A[ExcHandler: Exception (r0v17 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0 A[ExcHandler: Exception (r0v11 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:38:0x009f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r17, int r18, C9.q r19, boolean r20, m9.s r21, android.os.Handler r22, m9.r r23, java.util.ArrayList r24) {
        /*
            r16 = this;
            r0 = r18
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.Class<m9.s> r13 = m9.s.class
            java.lang.Class<m9.r> r14 = m9.r.class
            java.lang.Class<android.os.Handler> r15 = android.os.Handler.class
            java.lang.String r8 = "DefaultRenderersFactory"
            m9.C r7 = new m9.C
            C9.l$b r3 = r16.i()
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
            java.lang.String r0 = "com.google.android.exoplayer2.decoder.midi.MidiRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0055 }
            r2 = 0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0055 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0055 }
            k9.a1 r0 = (k9.a1) r0     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0055 }
            int r2 = r1 + 1
            r12.add(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0057, Exception -> 0x0055 }
            java.lang.String r0 = "Loaded MidiRenderer."
            ja.s.f(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0057, Exception -> 0x0055 }
            goto L_0x0062
        L_0x0055:
            r0 = move-exception
            goto L_0x0059
        L_0x0057:
            r1 = r2
            goto L_0x0061
        L_0x0059:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0061:
            r2 = r1
        L_0x0062:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x008e, Exception -> 0x008a }
            java.lang.Class[] r1 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x008e, Exception -> 0x008a }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x008e, Exception -> 0x008a }
            r1 = r21
            r3 = r22
            r4 = r10
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x009c, Exception -> 0x008a }
            java.lang.Object r0 = r0.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x009c, Exception -> 0x008a }
            k9.a1 r0 = (k9.a1) r0     // Catch:{ ClassNotFoundException -> 0x009c, Exception -> 0x008a }
            int r5 = r2 + 1
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x008c, Exception -> 0x008a }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            ja.s.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x008c, Exception -> 0x008a }
            goto L_0x009d
        L_0x008a:
            r0 = move-exception
            goto L_0x0094
        L_0x008c:
            r2 = r5
            goto L_0x009c
        L_0x008e:
            r1 = r21
            r3 = r22
            r4 = r10
            goto L_0x009c
        L_0x0094:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x009c:
            r5 = r2
        L_0x009d:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            java.lang.Class[] r2 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            k9.a1 r0 = (k9.a1) r0     // Catch:{ ClassNotFoundException -> 0x00cc, Exception -> 0x00c0 }
            int r2 = r5 + 1
            r12.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c0 }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            ja.s.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c0 }
            goto L_0x00cd
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r5 = r2
            goto L_0x00cc
        L_0x00c4:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00cc:
            r2 = r5
        L_0x00cd:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            java.lang.Class[] r5 = new java.lang.Class[]{r15, r14, r13}     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r11, r1}     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            k9.a1 r0 = (k9.a1) r0     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            ja.s.f(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00f7, Exception -> 0x00ee }
            goto L_0x00f7
        L_0x00ee:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3710n.b(android.content.Context, int, C9.q, boolean, m9.s, android.os.Handler, m9.r, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public s c(Context context, boolean z10, boolean z11, boolean z12) {
        return new y.e().g(C3848f.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new b());
    }

    /* access modifiers changed from: protected */
    public void e(Context context, e eVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new f(eVar, looper));
    }

    /* access modifiers changed from: protected */
    public void g(Context context, n nVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new o(nVar, looper));
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
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r19, int r20, C9.q r21, boolean r22, android.os.Handler r23, ka.w r24, long r25, java.util.ArrayList r27) {
        /*
            r18 = this;
            r0 = r20
            r11 = r23
            r12 = r24
            r13 = r27
            java.lang.String r14 = "DefaultRenderersFactory"
            java.lang.Class<ka.w> r15 = ka.w.class
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            ka.h r9 = new ka.h
            C9.l$b r3 = r18.i()
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
            java.lang.String r2 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
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
            k9.a1 r2 = (k9.a1) r2     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            int r3 = r1 + 1
            r13.add(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x0071 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            r2 = r17
            ja.s.f(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x0071 }
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
            java.lang.String r1 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r6, r15, r7}     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r12, r0}     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            k9.a1 r0 = (k9.a1) r0     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            r13.add(r3, r0)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            ja.s.f(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00be, Exception -> 0x00b5 }
            goto L_0x00be
        L_0x00b5:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3710n.h(android.content.Context, int, C9.q, boolean, android.os.Handler, ka.w, long, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public l.b i() {
        return this.f45700b;
    }

    /* access modifiers changed from: protected */
    public void f(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
