package expo.modules.filesystem.next;

import Ef.m;
import Ud.k;
import Ud.l;
import ae.u;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/filesystem/next/FileSystemFile;", "file", "<init>", "(Lexpo/modules/filesystem/next/FileSystemFile;)V", "Llf/M;", "U", "()V", "M", "close", "", "length", "", "g0", "(I)[B", "data", "j0", "([B)V", "e", "Ljava/nio/channels/FileChannel;", "fileChannel", "", "value", "V", "()Ljava/lang/Long;", "h0", "(Ljava/lang/Long;)V", "offset", "f0", "size", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {

    /* renamed from: e  reason: collision with root package name */
    private final FileChannel f60416e = ((FileChannel) T());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemFileHandle(FileSystemFile fileSystemFile) {
        super(new RandomAccessFile(fileSystemFile.V(), "rw").getChannel(), (u) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(fileSystemFile, "file");
    }

    private final void U() {
        if (!this.f60416e.isOpen()) {
            throw new k("file handle is closed");
        }
    }

    public void M() {
        close();
    }

    public final Long V() {
        try {
            return Long.valueOf(this.f60416e.position());
        } catch (Exception unused) {
            return null;
        }
    }

    public void close() {
        this.f60416e.close();
    }

    public final Long f0() {
        try {
            return Long.valueOf(this.f60416e.size());
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] g0(int i10) {
        U();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(m.h(i10, (int) (this.f60416e.size() - this.f60416e.position())));
            this.f60416e.read(allocate);
            byte[] array = allocate.array();
            C6496s.g(array, "array(...)");
            return array;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new k(message);
        }
    }

    public final void h0(Long l10) {
        if (l10 != null) {
            this.f60416e.position(l10.longValue());
        }
    }

    public final void j0(byte[] bArr) {
        C6496s.h(bArr, "data");
        U();
        try {
            this.f60416e.write(ByteBuffer.wrap(bArr));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new l(message);
        }
    }
}
