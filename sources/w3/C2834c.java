package w3;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.C6496s;

/* renamed from: w3.c  reason: case insensitive filesystem */
public abstract class C2834c {
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        C6496s.h(readableByteChannel, MetricTracker.Object.INPUT);
        C6496s.h(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
