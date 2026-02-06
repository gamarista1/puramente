package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/StreamableVideo;", "", "<init>", "()V", "Ljava/nio/channels/FileChannel;", "infile", "outfile", "", "convert", "(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;)Z", "Ljava/io/Closeable;", "closeable", "Llf/M;", "safeClose", "(Ljava/io/Closeable;)V", "Ljava/nio/ByteBuffer;", "buffer", "readAndFill", "(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;)Z", "", "position", "(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;J)Z", "Ljava/io/File;", "in", "out", "start", "(Ljava/io/File;Ljava/io/File;)Z", "", "tag", "Ljava/lang/String;", "", "ATOM_PREAMBLE_SIZE", "I", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static final StreamableVideo INSTANCE = new StreamableVideo();
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    private final boolean convert(FileChannel fileChannel, FileChannel fileChannel2) {
        FileChannel fileChannel3 = fileChannel;
        FileChannel fileChannel4 = fileChannel2;
        int i10 = 8;
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long j10 = 0;
        ByteBuffer byteBuffer = null;
        int i11 = 0;
        long j11 = 0;
        while (true) {
            C6496s.e(order);
            if (!readAndFill(fileChannel3, order)) {
                break;
            }
            j10 = NumbersUtilsKt.uInt32ToLong(order.getInt());
            i11 = order.getInt();
            if (i11 == AtomsKt.getFTYP_ATOM()) {
                int uInt32ToInt = NumbersUtilsKt.uInt32ToInt(j10);
                ByteBuffer order2 = ByteBuffer.allocate(uInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                order.rewind();
                order2.put(order);
                if (fileChannel3.read(order2) < uInt32ToInt - 8) {
                    byteBuffer = order2;
                    break;
                }
                order2.flip();
                j11 = fileChannel.position();
                C6514M m10 = C6514M.f71813a;
                byteBuffer = order2;
            } else if (j10 == 1) {
                order.clear();
                if (!readAndFill(fileChannel3, order)) {
                    break;
                }
                j10 = NumbersUtilsKt.uInt64ToLong(order.getLong());
                fileChannel3.position((fileChannel.position() + j10) - ((long) 16));
            } else {
                fileChannel3.position((fileChannel.position() + j10) - ((long) 8));
                j10 = j10;
            }
            if (i11 == AtomsKt.getFREE_ATOM() || i11 == AtomsKt.getJUNK_ATOM() || i11 == AtomsKt.getMDAT_ATOM() || i11 == AtomsKt.getMOOV_ATOM() || i11 == AtomsKt.getPNOT_ATOM() || i11 == AtomsKt.getSKIP_ATOM() || i11 == AtomsKt.getWIDE_ATOM() || i11 == AtomsKt.getPICT_ATOM() || i11 == AtomsKt.getUUID_ATOM() || i11 == AtomsKt.getFTYP_ATOM()) {
                if (j10 < 8) {
                    break;
                }
            } else {
                Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                break;
            }
        }
        long j12 = j11;
        if (i11 != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return false;
        }
        int uInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(j10);
        long j13 = (long) uInt32ToInt2;
        long size = fileChannel.size() - j13;
        ByteBuffer order3 = ByteBuffer.allocate(uInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(fileChannel3, order3, size)) {
            throw new Exception("failed to read moov atom");
        } else if (order3.getInt(12) != AtomsKt.getCMOV_ATOM()) {
            while (order3.remaining() >= i10) {
                int position = order3.position();
                int i12 = order3.getInt(position + 4);
                if (i12 == AtomsKt.getSTCO_ATOM() || i12 == AtomsKt.getCO64_ATOM()) {
                    long j14 = size;
                    if (NumbersUtilsKt.uInt32ToLong(order3.getInt(position)) <= ((long) order3.remaining())) {
                        order3.position(position + 12);
                        if (order3.remaining() >= 4) {
                            int uInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(order3.getInt());
                            if (i12 == AtomsKt.getSTCO_ATOM()) {
                                Log.i(tag, "patching stco atom...");
                                if (order3.remaining() >= uInt32ToInt3 * 4) {
                                    int i13 = 0;
                                    while (i13 < uInt32ToInt3) {
                                        int i14 = order3.getInt(order3.position());
                                        int i15 = i14 + uInt32ToInt2;
                                        if (i14 >= 0 || i15 < 0) {
                                            order3.putInt(i15);
                                            i13++;
                                        } else {
                                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                                        }
                                    }
                                } else {
                                    throw new Exception("bad atom size/element count");
                                }
                            } else if (i12 == AtomsKt.getCO64_ATOM()) {
                                Log.wtf(tag, "patching co64 atom...");
                                if (order3.remaining() >= uInt32ToInt3 * 8) {
                                    int i16 = 0;
                                    while (i16 < uInt32ToInt3) {
                                        order3.putLong(order3.getLong(order3.position()) + j13);
                                        i16++;
                                        uInt32ToInt2 = uInt32ToInt2;
                                    }
                                    i10 = 8;
                                    size = j14;
                                } else {
                                    throw new Exception("bad atom size/element count");
                                }
                            }
                            size = j14;
                        } else {
                            throw new Exception("malformed atom");
                        }
                    } else {
                        throw new Exception("bad atom size");
                    }
                } else {
                    order3.position(order3.position() + 1);
                }
                i10 = 8;
            }
            long j15 = size;
            fileChannel3.position(j12);
            if (byteBuffer != null) {
                Log.i(tag, "writing ftyp atom...");
                byteBuffer.rewind();
                fileChannel4.write(byteBuffer);
            }
            Log.i(tag, "writing moov atom...");
            order3.rewind();
            fileChannel4.write(order3);
            Log.i(tag, "copying rest of file...");
            fileChannel.transferTo(j12, j15 - j12, fileChannel2);
            return true;
        } else {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer) {
        byteBuffer.clear();
        int read = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return read == byteBuffer.capacity();
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileChannel channel;
        C6496s.h(file2, "out");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                channel = fileInputStream2.getChannel();
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                safeClose(fileInputStream);
                safeClose(fileOutputStream);
                file2.delete();
                throw th;
            }
            try {
                FileChannel channel2 = fileOutputStream.getChannel();
                C6496s.e(channel);
                C6496s.e(channel2);
                boolean convert = convert(channel, channel2);
                safeClose(fileInputStream2);
                safeClose(fileOutputStream);
                if (!convert) {
                    file2.delete();
                }
                return convert;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                safeClose(fileInputStream);
                safeClose(fileOutputStream);
                file2.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            safeClose(fileInputStream);
            safeClose(fileOutputStream);
            file2.delete();
            throw th;
        }
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer, long j10) {
        byteBuffer.clear();
        int read = fileChannel.read(byteBuffer, j10);
        byteBuffer.flip();
        return read == byteBuffer.capacity();
    }
}
