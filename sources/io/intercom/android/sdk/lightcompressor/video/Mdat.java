package io.intercom.android.sdk.lightcompressor.video;

import Uh.b;
import Uh.c;
import bi.e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Mdat;", "LUh/b;", "<init>", "()V", "", "contentSize", "", "isSmallBox", "(J)Z", "getSize", "()J", "getOffset", "offset", "Llf/M;", "setDataOffset", "(J)V", "setContentSize", "getContentSize", "", "getType", "()Ljava/lang/String;", "Ljava/nio/channels/WritableByteChannel;", "writableByteChannel", "getBox", "(Ljava/nio/channels/WritableByteChannel;)V", "J", "dataOffset", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Mdat implements b {
    private long contentSize = 1073741824;
    private long dataOffset;

    private final boolean isSmallBox(long j10) {
        return j10 + ((long) 8) < 4294967296L;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        C6496s.h(writableByteChannel, "writableByteChannel");
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long size = getSize();
        if (!isSmallBox(size)) {
            e.g(allocate, 1);
        } else if (size < 0 || size > 4294967296L) {
            e.g(allocate, 1);
        } else {
            e.g(allocate, size);
        }
        allocate.put(c.o("mdat"));
        if (isSmallBox(size)) {
            allocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            e.h(allocate, size);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final long getOffset() {
        return this.dataOffset;
    }

    public long getSize() {
        return ((long) 16) + this.contentSize;
    }

    public String getType() {
        return "mdat";
    }

    public final void setContentSize(long j10) {
        this.contentSize = j10;
    }

    public final void setDataOffset(long j10) {
        this.dataOffset = j10;
    }
}
