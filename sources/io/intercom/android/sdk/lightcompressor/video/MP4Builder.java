package io.intercom.android.sdk.lightcompressor.video;

import Uh.b;
import Wh.c;
import Wh.e;
import Wh.f;
import Wh.g;
import Wh.h;
import Wh.i;
import Wh.j;
import Wh.k;
import Wh.l;
import Wh.m;
import Wh.n;
import Wh.p;
import Wh.q;
import Wh.r;
import Wh.s;
import Wh.t;
import Wh.u;
import Wh.v;
import Wh.w;
import Wh.x;
import Wh.y;
import Wh.z;
import ai.d;
import android.media.MediaCodec;
import android.media.MediaFormat;
import io.intercom.android.sdk.models.AttributeType;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010!J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010!J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010!J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J-\u00101\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020)2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u0003R\u0016\u00109\u001a\u0002088\u0002@\u0002X.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020I0H8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020+8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/MP4Builder;", "", "<init>", "()V", "Llf/M;", "flushCurrentMdat", "LWh/f;", "createFileTypeBox", "()LWh/f;", "", "a", "b", "gcd", "(JJ)J", "Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "mp4Movie", "getTimescale", "(Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;)J", "movie", "LWh/l;", "createMovieBox", "(Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;)LWh/l;", "Lio/intercom/android/sdk/lightcompressor/video/Track;", "track", "LWh/x;", "createTrackBox", "(Lio/intercom/android/sdk/lightcompressor/video/Track;Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;)LWh/x;", "LUh/b;", "createStbl", "(Lio/intercom/android/sdk/lightcompressor/video/Track;)LUh/b;", "LWh/q;", "stbl", "createStsd", "(Lio/intercom/android/sdk/lightcompressor/video/Track;LWh/q;)V", "createStts", "createStss", "createStsc", "createStsz", "createStco", "createMovie", "(Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;)Lio/intercom/android/sdk/lightcompressor/video/MP4Builder;", "", "trackIndex", "Ljava/nio/ByteBuffer;", "byteBuf", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "isAudio", "writeSampleData", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Z)V", "Landroid/media/MediaFormat;", "mediaFormat", "addTrack", "(Landroid/media/MediaFormat;Z)I", "finishMovie", "Lio/intercom/android/sdk/lightcompressor/video/Mdat;", "mdat", "Lio/intercom/android/sdk/lightcompressor/video/Mdat;", "currentMp4Movie", "Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "Ljava/io/FileOutputStream;", "fos", "Ljava/io/FileOutputStream;", "Ljava/nio/channels/FileChannel;", "fc", "Ljava/nio/channels/FileChannel;", "dataOffset", "J", "wroteSinceLastMdat", "writeNewMdat", "Z", "Ljava/util/HashMap;", "", "track2SampleSizes", "Ljava/util/HashMap;", "sizeBuffer", "Ljava/nio/ByteBuffer;", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MP4Builder {
    private Mp4Movie currentMp4Movie;
    private long dataOffset;

    /* renamed from: fc  reason: collision with root package name */
    private FileChannel f68623fc;
    private FileOutputStream fos;
    private Mdat mdat;
    private ByteBuffer sizeBuffer;
    private final HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private boolean writeNewMdat = true;
    private long wroteSinceLastMdat;

    private final f createFileTypeBox() {
        return new f("mp42", 0, C6565s.q("isom", "iso2", "mp41"));
    }

    private final l createMovieBox(Mp4Movie mp4Movie) {
        l lVar = new l();
        m mVar = new m();
        mVar.x(new Date());
        mVar.A(new Date());
        mVar.z(d.f67102j);
        long timescale = getTimescale(mp4Movie);
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        C6496s.g(it, "iterator(...)");
        long j10 = 0;
        while (it.hasNext()) {
            Track next = it.next();
            C6496s.g(next, "next(...)");
            Track track = next;
            long duration = (track.getDuration() * timescale) / ((long) track.getTimeScale());
            if (duration > j10) {
                j10 = duration;
            }
        }
        mVar.y(j10);
        mVar.C(timescale);
        mVar.B((long) (mp4Movie.getTracks().size() + 1));
        lVar.a(mVar);
        Iterator<Track> it2 = mp4Movie.getTracks().iterator();
        C6496s.g(it2, "iterator(...)");
        while (it2.hasNext()) {
            Track next2 = it2.next();
            C6496s.g(next2, "next(...)");
            lVar.a(createTrackBox(next2, mp4Movie));
        }
        return lVar;
    }

    private final b createStbl(Track track) {
        q qVar = new q();
        createStsd(track, qVar);
        createStts(track, qVar);
        createStss(track, qVar);
        createStsc(track, qVar);
        createStsz(track, qVar);
        createStco(track, qVar);
        return qVar;
    }

    private final void createStco(Track track, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Sample> it = track.getSamples().iterator();
        C6496s.g(it, "iterator(...)");
        long j10 = -1;
        while (it.hasNext()) {
            Sample next = it.next();
            C6496s.g(next, "next(...)");
            Sample sample = next;
            long offset = sample.getOffset();
            if (!(j10 == -1 || j10 == offset)) {
                j10 = -1;
            }
            if (j10 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j10 = sample.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            C6496s.g(obj, "get(...)");
            jArr[i10] = ((Number) obj).longValue();
        }
        t tVar = new t();
        tVar.r(jArr);
        qVar.a(tVar);
    }

    private final void createStsc(Track track, q qVar) {
        r rVar = new r();
        rVar.r(new LinkedList());
        int size = track.getSamples().size();
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Sample sample = track.getSamples().get(i13);
            C6496s.g(sample, "get(...)");
            Sample sample2 = sample;
            long offset = sample2.getOffset() + sample2.getSize();
            i12++;
            if (i13 != size - 1) {
                Sample sample3 = track.getSamples().get(i13 + 1);
                C6496s.g(sample3, "get(...)");
                if (offset == sample3.getOffset()) {
                }
            }
            if (i10 != i12) {
                rVar.q().add(new r.a((long) i11, (long) i12, 1));
                i10 = i12;
            }
            i11++;
            i12 = 0;
        }
        qVar.a(rVar);
    }

    private final void createStsd(Track track, q qVar) {
        qVar.a(track.getSampleDescriptionBox());
    }

    private final void createStss(Track track, q qVar) {
        boolean z10;
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null) {
            if (syncSamples.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                v vVar = new v();
                vVar.q(syncSamples);
                qVar.a(vVar);
            }
        }
    }

    private final void createStsz(Track track, q qVar) {
        p pVar = new p();
        pVar.s(this.track2SampleSizes.get(track));
        qVar.a(pVar);
    }

    private final void createStts(Track track, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = track.getSampleDurations().iterator();
        C6496s.g(it, "iterator(...)");
        w.a aVar = null;
        while (it.hasNext()) {
            Long next = it.next();
            C6496s.g(next, "next(...)");
            long longValue = next.longValue();
            if (aVar == null || aVar.b() != longValue) {
                aVar = new w.a(1, longValue);
                arrayList.add(aVar);
            } else {
                aVar.c(aVar.a() + 1);
            }
        }
        w wVar = new w();
        wVar.q(arrayList);
        qVar.a(wVar);
    }

    private final x createTrackBox(Track track, Mp4Movie mp4Movie) {
        d dVar;
        String str;
        x xVar = new x();
        y yVar = new y();
        yVar.C(true);
        yVar.F(true);
        yVar.E(true);
        if (track.isAudio()) {
            dVar = d.f67102j;
        } else {
            dVar = mp4Movie.getMatrix();
        }
        yVar.H(dVar);
        yVar.z(0);
        yVar.A(track.getCreationTime());
        yVar.B((track.getDuration() * getTimescale(mp4Movie)) / ((long) track.getTimeScale()));
        yVar.D((double) track.getHeight());
        yVar.L((double) track.getWidth());
        yVar.G(0);
        yVar.I(new Date());
        yVar.J(track.getTrackId() + 1);
        yVar.K(track.getVolume());
        xVar.a(yVar);
        i iVar = new i();
        xVar.a(iVar);
        j jVar = new j();
        jVar.v(track.getCreationTime());
        jVar.w(track.getDuration());
        jVar.y((long) track.getTimeScale());
        jVar.x("eng");
        iVar.a(jVar);
        g gVar = new g();
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        gVar.t(str);
        gVar.s(track.getHandler());
        iVar.a(gVar);
        k kVar = new k();
        if (C6496s.c(track.getHandler(), "vide")) {
            kVar.a(new z());
        } else if (C6496s.c(track.getHandler(), "soun")) {
            kVar.a(new s());
        } else if (C6496s.c(track.getHandler(), AttributeType.TEXT)) {
            kVar.a(new n());
        } else if (C6496s.c(track.getHandler(), "subt")) {
            kVar.a(new u());
        } else if (C6496s.c(track.getHandler(), "hint")) {
            kVar.a(new h());
        } else if (C6496s.c(track.getHandler(), "sbtl")) {
            kVar.a(new n());
        }
        Wh.d dVar2 = new Wh.d();
        e eVar = new e();
        dVar2.a(eVar);
        c cVar = new c();
        cVar.n(1);
        eVar.a(cVar);
        kVar.a(dVar2);
        kVar.a(createStbl(track));
        iVar.a(kVar);
        return xVar;
    }

    private final void flushCurrentMdat() {
        FileChannel fileChannel = this.f68623fc;
        FileOutputStream fileOutputStream = null;
        if (fileChannel == null) {
            C6496s.v("fc");
            fileChannel = null;
        }
        long position = fileChannel.position();
        FileChannel fileChannel2 = this.f68623fc;
        if (fileChannel2 == null) {
            C6496s.v("fc");
            fileChannel2 = null;
        }
        Mdat mdat2 = this.mdat;
        if (mdat2 == null) {
            C6496s.v("mdat");
            mdat2 = null;
        }
        fileChannel2.position(mdat2.getOffset());
        Mdat mdat3 = this.mdat;
        if (mdat3 == null) {
            C6496s.v("mdat");
            mdat3 = null;
        }
        FileChannel fileChannel3 = this.f68623fc;
        if (fileChannel3 == null) {
            C6496s.v("fc");
            fileChannel3 = null;
        }
        mdat3.getBox(fileChannel3);
        FileChannel fileChannel4 = this.f68623fc;
        if (fileChannel4 == null) {
            C6496s.v("fc");
            fileChannel4 = null;
        }
        fileChannel4.position(position);
        Mdat mdat4 = this.mdat;
        if (mdat4 == null) {
            C6496s.v("mdat");
            mdat4 = null;
        }
        mdat4.setDataOffset(0);
        Mdat mdat5 = this.mdat;
        if (mdat5 == null) {
            C6496s.v("mdat");
            mdat5 = null;
        }
        mdat5.setContentSize(0);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            C6496s.v("fos");
        } else {
            fileOutputStream = fileOutputStream2;
        }
        fileOutputStream.flush();
    }

    private final long gcd(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        return gcd(j11, j10 % j11);
    }

    private final long getTimescale(Mp4Movie mp4Movie) {
        long j10;
        if (!mp4Movie.getTracks().isEmpty()) {
            j10 = (long) mp4Movie.getTracks().iterator().next().getTimeScale();
        } else {
            j10 = 0;
        }
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Track next = it.next();
            C6496s.g(next, "next(...)");
            j10 = gcd((long) next.getTimeScale(), j10);
        }
        return j10;
    }

    public final int addTrack(MediaFormat mediaFormat, boolean z10) {
        C6496s.h(mediaFormat, "mediaFormat");
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            C6496s.v("currentMp4Movie");
            mp4Movie = null;
        }
        return mp4Movie.addTrack(mediaFormat, z10);
    }

    public final MP4Builder createMovie(Mp4Movie mp4Movie) {
        C6496s.h(mp4Movie, "mp4Movie");
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f68623fc = fileOutputStream.getChannel();
        f createFileTypeBox = createFileTypeBox();
        FileChannel fileChannel = this.f68623fc;
        if (fileChannel == null) {
            C6496s.v("fc");
            fileChannel = null;
        }
        createFileTypeBox.getBox(fileChannel);
        long size = this.dataOffset + createFileTypeBox.getSize();
        this.dataOffset = size;
        this.wroteSinceLastMdat = size;
        this.mdat = new Mdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public final void finishMovie() {
        Mdat mdat2 = this.mdat;
        FileOutputStream fileOutputStream = null;
        if (mdat2 == null) {
            C6496s.v("mdat");
            mdat2 = null;
        }
        if (mdat2.getContentSize() != 0) {
            flushCurrentMdat();
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            C6496s.v("currentMp4Movie");
            mp4Movie = null;
        }
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Track next = it.next();
            C6496s.g(next, "next(...)");
            Track track = next;
            ArrayList<Sample> samples = track.getSamples();
            int size = samples.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = samples.get(i10).getSize();
            }
            this.track2SampleSizes.put(track, jArr);
        }
        Mp4Movie mp4Movie2 = this.currentMp4Movie;
        if (mp4Movie2 == null) {
            C6496s.v("currentMp4Movie");
            mp4Movie2 = null;
        }
        l createMovieBox = createMovieBox(mp4Movie2);
        FileChannel fileChannel = this.f68623fc;
        if (fileChannel == null) {
            C6496s.v("fc");
            fileChannel = null;
        }
        createMovieBox.getBox(fileChannel);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            C6496s.v("fos");
            fileOutputStream2 = null;
        }
        fileOutputStream2.flush();
        FileChannel fileChannel2 = this.f68623fc;
        if (fileChannel2 == null) {
            C6496s.v("fc");
            fileChannel2 = null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream3 = this.fos;
        if (fileOutputStream3 == null) {
            C6496s.v("fos");
        } else {
            fileOutputStream = fileOutputStream3;
        }
        fileOutputStream.close();
    }

    public final void writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
        C6496s.h(byteBuffer, "byteBuf");
        C6496s.h(bufferInfo, "bufferInfo");
        FileOutputStream fileOutputStream = null;
        if (this.writeNewMdat) {
            Mdat mdat2 = this.mdat;
            if (mdat2 == null) {
                C6496s.v("mdat");
                mdat2 = null;
            }
            mdat2.setContentSize(0);
            FileChannel fileChannel = this.f68623fc;
            if (fileChannel == null) {
                C6496s.v("fc");
                fileChannel = null;
            }
            mdat2.getBox(fileChannel);
            mdat2.setDataOffset(this.dataOffset);
            long j10 = (long) 16;
            this.dataOffset += j10;
            this.wroteSinceLastMdat += j10;
            this.writeNewMdat = false;
        }
        Mdat mdat3 = this.mdat;
        if (mdat3 == null) {
            C6496s.v("mdat");
            mdat3 = null;
        }
        Mdat mdat4 = this.mdat;
        if (mdat4 == null) {
            C6496s.v("mdat");
            mdat4 = null;
        }
        mdat3.setContentSize(mdat4.getContentSize() + ((long) bufferInfo.size));
        long j11 = this.wroteSinceLastMdat + ((long) bufferInfo.size);
        this.wroteSinceLastMdat = j11;
        if (j11 >= 32768) {
            flushCurrentMdat();
            z11 = true;
            this.writeNewMdat = true;
            this.wroteSinceLastMdat = 0;
        } else {
            z11 = false;
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            C6496s.v("currentMp4Movie");
            mp4Movie = null;
        }
        mp4Movie.addSample(i10, this.dataOffset, bufferInfo);
        if (!z10) {
            byteBuffer.position(bufferInfo.offset + 4);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer2 = this.sizeBuffer;
            if (byteBuffer2 == null) {
                C6496s.v("sizeBuffer");
                byteBuffer2 = null;
            }
            byteBuffer2.position(0);
            ByteBuffer byteBuffer3 = this.sizeBuffer;
            if (byteBuffer3 == null) {
                C6496s.v("sizeBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer4 = this.sizeBuffer;
            if (byteBuffer4 == null) {
                C6496s.v("sizeBuffer");
                byteBuffer4 = null;
            }
            byteBuffer4.position(0);
            FileChannel fileChannel2 = this.f68623fc;
            if (fileChannel2 == null) {
                C6496s.v("fc");
                fileChannel2 = null;
            }
            ByteBuffer byteBuffer5 = this.sizeBuffer;
            if (byteBuffer5 == null) {
                C6496s.v("sizeBuffer");
                byteBuffer5 = null;
            }
            fileChannel2.write(byteBuffer5);
        } else {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        }
        FileChannel fileChannel3 = this.f68623fc;
        if (fileChannel3 == null) {
            C6496s.v("fc");
            fileChannel3 = null;
        }
        fileChannel3.write(byteBuffer);
        this.dataOffset += (long) bufferInfo.size;
        if (z11) {
            FileOutputStream fileOutputStream2 = this.fos;
            if (fileOutputStream2 == null) {
                C6496s.v("fos");
            } else {
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.flush();
        }
    }
}
