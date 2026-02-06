package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.v;
import lf.w;
import qf.C6658d;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"io/intercom/android/sdk/m5/utils/MediaCompressionKt$getCompressedVideoData$2$1", "Lio/intercom/android/sdk/lightcompressor/CompressionListener;", "", "index", "Llf/M;", "onStart", "(I)V", "", "size", "", "path", "onSuccess", "(IJLjava/lang/String;)V", "failureMessage", "onFailure", "(ILjava/lang/String;)V", "", "percent", "onProgress", "(IF)V", "onCancelled", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaCompressionKt$getCompressedVideoData$2$1 implements CompressionListener {
    final /* synthetic */ C6658d<Pair<? extends Uri, Long>> $continuation;
    final /* synthetic */ Twig $twig;

    MediaCompressionKt$getCompressedVideoData$2$1(Twig twig, C6658d<? super Pair<? extends Uri, Long>> dVar) {
        this.$twig = twig;
        this.$continuation = dVar;
    }

    public void onCancelled(int i10) {
        this.$twig.internal("Video compression cancelled.");
        C6658d<Pair<? extends Uri, Long>> dVar = this.$continuation;
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(w.a(new CancellationException())));
    }

    public void onFailure(int i10, String str) {
        C6496s.h(str, "failureMessage");
        Twig twig = this.$twig;
        twig.internal("Video compression failed: " + str + '.');
        C6658d<Pair<? extends Uri, Long>> dVar = this.$continuation;
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(w.a(new Throwable(str))));
    }

    public void onProgress(int i10, float f10) {
        Twig twig = this.$twig;
        twig.internal("Video compression in progress: " + f10 + '.');
    }

    public void onStart(int i10) {
        this.$twig.internal("Video compression started.");
    }

    public void onSuccess(int i10, long j10, String str) {
        File file;
        Twig twig = this.$twig;
        twig.internal("Video compression succeeded. Video saved in " + str + '.');
        if (str != null) {
            file = new File(str);
        } else {
            file = null;
        }
        Uri fromFile = Uri.fromFile(file);
        C6658d<Pair<? extends Uri, Long>> dVar = this.$continuation;
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(C6502A.a(fromFile, Long.valueOf(j10))));
    }
}
