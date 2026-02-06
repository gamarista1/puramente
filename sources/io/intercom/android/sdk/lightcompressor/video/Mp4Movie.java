package io.intercom.android.sdk.lightcompressor.video;

import ai.d;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u001e\u0010%\u001a\n $*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "", "<init>", "()V", "Lai/d;", "getMatrix", "()Lai/d;", "Ljava/io/File;", "file", "Llf/M;", "setCacheFile", "(Ljava/io/File;)V", "", "angle", "setRotation", "(I)V", "Ljava/util/ArrayList;", "Lio/intercom/android/sdk/lightcompressor/video/Track;", "Lkotlin/collections/ArrayList;", "getTracks", "()Ljava/util/ArrayList;", "getCacheFile", "()Ljava/io/File;", "trackIndex", "", "offset", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "addSample", "(IJLandroid/media/MediaCodec$BufferInfo;)V", "Landroid/media/MediaFormat;", "mediaFormat", "", "isAudio", "addTrack", "(Landroid/media/MediaFormat;Z)I", "kotlin.jvm.PlatformType", "matrix", "Lai/d;", "tracks", "Ljava/util/ArrayList;", "cacheFile", "Ljava/io/File;", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Mp4Movie {
    private File cacheFile;
    private d matrix = d.f67102j;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public final void addSample(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        C6496s.h(bufferInfo, "bufferInfo");
        if (i10 >= 0 && i10 < this.tracks.size()) {
            Track track = this.tracks.get(i10);
            C6496s.g(track, "get(...)");
            track.addSample(j10, bufferInfo);
        }
    }

    public final int addTrack(MediaFormat mediaFormat, boolean z10) {
        C6496s.h(mediaFormat, "mediaFormat");
        ArrayList<Track> arrayList = this.tracks;
        arrayList.add(new Track(arrayList.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public final File getCacheFile() {
        return this.cacheFile;
    }

    public final d getMatrix() {
        return this.matrix;
    }

    public final ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public final void setCacheFile(File file) {
        C6496s.h(file, "file");
        this.cacheFile = file;
    }

    public final void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = d.f67102j;
        } else if (i10 == 90) {
            this.matrix = d.f67103k;
        } else if (i10 == 180) {
            this.matrix = d.f67104l;
        } else if (i10 == 270) {
            this.matrix = d.f67105m;
        }
    }
}
