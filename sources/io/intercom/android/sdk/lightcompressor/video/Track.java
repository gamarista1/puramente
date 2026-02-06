package io.intercom.android.sdk.lightcompressor.video;

import Vh.e;
import Vh.h;
import Vh.n;
import Wh.o;
import Yh.a;
import Zh.b;
import Zh.c;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000b\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u001b\u0010\u000b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\u0015J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0002¢\u0006\u0004\b0\u0010,J\r\u00101\u001a\u00020\u0002¢\u0006\u0004\b1\u0010,J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001cj\b\u0012\u0004\u0012\u00020\u0013`\u001e¢\u0006\u0004\b5\u0010 J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010J\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010;R\u0014\u00106\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010MR\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u00109R\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010M¨\u0006S"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Track;", "", "", "id", "Landroid/media/MediaFormat;", "format", "", "audio", "<init>", "(ILandroid/media/MediaFormat;Z)V", "LVh/e;", "setup", "(LVh/e;)LVh/e;", "LZh/c;", "w", "h", "(LZh/c;II)LZh/c;", "LZh/b;", "(LZh/b;Landroid/media/MediaFormat;)LZh/b;", "", "getTrackId", "()J", "offset", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Llf/M;", "addSample", "(JLandroid/media/MediaCodec$BufferInfo;)V", "Ljava/util/ArrayList;", "Lio/intercom/android/sdk/lightcompressor/video/Sample;", "Lkotlin/collections/ArrayList;", "getSamples", "()Ljava/util/ArrayList;", "getDuration", "", "getHandler", "()Ljava/lang/String;", "LWh/o;", "getSampleDescriptionBox", "()LWh/o;", "", "getSyncSamples", "()[J", "getTimeScale", "()I", "Ljava/util/Date;", "getCreationTime", "()Ljava/util/Date;", "getWidth", "getHeight", "", "getVolume", "()F", "getSampleDurations", "isAudio", "()Z", "trackId", "J", "samples", "Ljava/util/ArrayList;", "duration", "handler", "Ljava/lang/String;", "sampleDescriptionBox", "LWh/o;", "Ljava/util/LinkedList;", "syncSamples", "Ljava/util/LinkedList;", "timeScale", "I", "creationTime", "Ljava/util/Date;", "height", "width", "volume", "F", "sampleDurations", "Z", "", "samplingFrequencyIndexMap", "Ljava/util/Map;", "lastPresentationTimeUs", "first", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Track {
    private final Date creationTime = new Date();
    private long duration;
    private boolean first;
    private String handler;
    private int height;
    private final boolean isAudio;
    private long lastPresentationTimeUs;
    private o sampleDescriptionBox;
    private final ArrayList<Long> sampleDurations;
    private final ArrayList<Sample> samples = new ArrayList<>();
    private Map<Integer, Integer> samplingFrequencyIndexMap;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;

    public Track(int i10, MediaFormat mediaFormat, boolean z10) {
        int i11;
        int i12;
        boolean z11 = z10;
        C6496s.h(mediaFormat, "format");
        ArrayList<Long> arrayList = new ArrayList<>();
        this.sampleDurations = arrayList;
        this.isAudio = z11;
        this.samplingFrequencyIndexMap = new HashMap();
        this.first = true;
        this.samplingFrequencyIndexMap = O.l(C6502A.a(96000, 0), C6502A.a(88200, 1), C6502A.a(64000, 2), C6502A.a(48000, 3), C6502A.a(44100, 4), C6502A.a(32000, 5), C6502A.a(24000, 6), C6502A.a(22050, 7), C6502A.a(16000, 8), C6502A.a(12000, 9), C6502A.a(11025, 10), C6502A.a(8000, 11));
        this.trackId = (long) i10;
        if (!z11) {
            arrayList.add(3015L);
            this.duration = 3015;
            MediaFormat mediaFormat2 = mediaFormat;
            this.width = mediaFormat2.getInteger(Snapshot.WIDTH);
            this.height = mediaFormat2.getInteger(Snapshot.HEIGHT);
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            this.sampleDescriptionBox = new o();
            String string = mediaFormat2.getString("mime");
            if (C6496s.c(string, "video/avc")) {
                c upVar = setup(new c("avc1"), this.width, this.height);
                a aVar = new a();
                if (mediaFormat2.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat2.getByteBuffer("csd-0");
                    C6496s.e(byteBuffer);
                    byteBuffer.position(4);
                    arrayList2.add(byteBuffer.slice());
                    ArrayList arrayList3 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer("csd-1");
                    if (byteBuffer2 != null) {
                        byteBuffer2.position(4);
                        arrayList3.add(byteBuffer2.slice());
                        aVar.t(arrayList2);
                        aVar.r(arrayList3);
                    }
                }
                if (mediaFormat2.containsKey("level")) {
                    int integer = mediaFormat2.getInteger("level");
                    if (integer != 1) {
                        if (integer != 2) {
                            switch (integer) {
                                case 4:
                                    i12 = 3;
                                    aVar.k(11);
                                    break;
                                case 8:
                                    i12 = 3;
                                    aVar.k(12);
                                    break;
                                case 16:
                                    i12 = 3;
                                    aVar.k(13);
                                    break;
                                case com.amazon.c.a.a.c.f37660h:
                                    i12 = 3;
                                    aVar.k(2);
                                    break;
                                case 64:
                                    i12 = 3;
                                    aVar.k(21);
                                    break;
                                case 128:
                                    i12 = 3;
                                    aVar.k(22);
                                    break;
                                case 256:
                                    i12 = 3;
                                    aVar.k(3);
                                    break;
                                case 512:
                                    aVar.k(31);
                                    break;
                                case 1024:
                                    aVar.k(32);
                                    break;
                                case 2048:
                                    aVar.k(4);
                                    break;
                                case 4096:
                                    aVar.k(41);
                                    break;
                                case 8192:
                                    aVar.k(42);
                                    break;
                                case 16384:
                                    aVar.k(5);
                                    break;
                                case 32768:
                                    aVar.k(51);
                                    break;
                                case 65536:
                                    aVar.k(52);
                                    break;
                                default:
                                    aVar.k(13);
                                    break;
                            }
                            i12 = 3;
                        } else {
                            i12 = 3;
                            aVar.k(27);
                        }
                        i11 = 1;
                    } else {
                        i11 = 1;
                        i12 = 3;
                        aVar.k(1);
                    }
                } else {
                    i12 = 3;
                    i11 = 1;
                    aVar.k(13);
                }
                aVar.l(100);
                aVar.n(-1);
                aVar.m(-1);
                aVar.o(-1);
                aVar.p(i11);
                aVar.q(i12);
                aVar.s(0);
                upVar.a(aVar);
                this.sampleDescriptionBox.a(upVar);
            } else if (C6496s.c(string, "video/mp4v")) {
                this.sampleDescriptionBox.a(setup(new c("mp4v"), this.width, this.height));
            }
        } else {
            MediaFormat mediaFormat3 = mediaFormat;
            arrayList.add(1024L);
            this.duration = 1024;
            this.volume = 1.0f;
            this.timeScale = mediaFormat3.getInteger("sample-rate");
            this.handler = "soun";
            this.sampleDescriptionBox = new o();
            b upVar2 = setup(new b("mp4a"), mediaFormat3);
            Xh.b bVar = new Xh.b();
            h hVar = new h();
            hVar.i(0);
            n nVar = new n();
            nVar.h(2);
            hVar.j(nVar);
            e upVar3 = setup(new e());
            Vh.a aVar2 = new Vh.a();
            aVar2.q(2);
            Integer num = this.samplingFrequencyIndexMap.get(Integer.valueOf((int) upVar2.v()));
            C6496s.e(num);
            aVar2.s(num.intValue());
            aVar2.r(upVar2.t());
            upVar3.h(aVar2);
            hVar.h(upVar3);
            ByteBuffer g10 = hVar.g();
            bVar.u(hVar);
            bVar.r(g10);
            upVar2.a(bVar);
            this.sampleDescriptionBox.a(upVar2);
        }
    }

    private final e setup(e eVar) {
        eVar.l(64);
        eVar.m(5);
        eVar.j(1536);
        eVar.k(96000);
        eVar.i(96000);
        return eVar;
    }

    public final void addSample(long j10, MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        C6496s.h(bufferInfo, "bufferInfo");
        if (this.isAudio || (bufferInfo.flags & 1) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.samples.add(new Sample(j10, (long) bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (!(linkedList == null || !z10 || linkedList == null)) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        long j11 = bufferInfo.presentationTimeUs;
        this.lastPresentationTimeUs = j11;
        long j12 = (((j11 - this.lastPresentationTimeUs) * ((long) this.timeScale)) + 500000) / 1000000;
        if (!this.first) {
            ArrayList<Long> arrayList = this.sampleDurations;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j12));
            this.duration += j12;
        }
        this.first = false;
    }

    public final Date getCreationTime() {
        return this.creationTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getHandler() {
        return this.handler;
    }

    public final int getHeight() {
        return this.height;
    }

    public final o getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public final ArrayList<Long> getSampleDurations() {
        return this.sampleDurations;
    }

    public final ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public final long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null) {
            return null;
        }
        C6496s.e(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList<Integer> linkedList2 = this.syncSamples;
        C6496s.e(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList<Integer> linkedList3 = this.syncSamples;
        C6496s.e(linkedList3);
        int size = linkedList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinkedList<Integer> linkedList4 = this.syncSamples;
            C6496s.e(linkedList4);
            jArr[i10] = (long) linkedList4.get(i10).intValue();
        }
        return jArr;
    }

    public final int getTimeScale() {
        return this.timeScale;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAudio() {
        return this.isAudio;
    }

    private final c setup(c cVar, int i10, int i11) {
        cVar.q(1);
        cVar.M(24);
        cVar.Q(1);
        cVar.U(72.0d);
        cVar.V(72.0d);
        cVar.f0(i10);
        cVar.T(i11);
        cVar.I("AVC Coding");
        return cVar;
    }

    private final b setup(b bVar, MediaFormat mediaFormat) {
        bVar.y(mediaFormat.getInteger("channel-count") == 1 ? 2 : mediaFormat.getInteger("channel-count"));
        bVar.E((long) mediaFormat.getInteger("sample-rate"));
        bVar.q(1);
        bVar.F(16);
        return bVar;
    }
}
