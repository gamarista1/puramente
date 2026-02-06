package io.intercom.android.sdk.m5.upload.data;

import Gh.C5405f;
import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import rh.D;
import rh.y;
import wf.C6763c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRequestBody;", "Lrh/D;", "Landroid/content/Context;", "context", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "media", "<init>", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "Lrh/y;", "contentType", "()Lrh/y;", "", "contentLength", "()J", "LGh/f;", "sink", "Llf/M;", "writeTo", "(LGh/f;)V", "Landroid/content/Context;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadRequestBody extends D {
    public static final int $stable = 8;
    private static final int BUFFER_SIZE = 2048;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Context context;
    private final MediaData.Media media;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRequestBody$Companion;", "", "<init>", "()V", "BUFFER_SIZE", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UploadRequestBody(Context context2, MediaData.Media media2) {
        C6496s.h(context2, "context");
        C6496s.h(media2, "media");
        this.context = context2;
        this.media = media2;
    }

    public long contentLength() {
        return this.media.getSize();
    }

    public y contentType() {
        return y.f73499e.b(this.media.getMimeType());
    }

    public void writeTo(C5405f fVar) {
        C6496s.h(fVar, "sink");
        InputStream openInputStream = this.context.getContentResolver().openInputStream(this.media.getUri());
        if (openInputStream != null) {
            try {
                byte[] bArr = new byte[BUFFER_SIZE];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read != -1) {
                        fVar.c1(bArr, 0, read);
                    } else {
                        C6514M m10 = C6514M.f71813a;
                        C6763c.a(openInputStream, (Throwable) null);
                        return;
                    }
                }
            } catch (Throwable th2) {
                C6763c.a(openInputStream, th);
                throw th2;
            }
        }
    }
}
