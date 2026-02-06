package u3;

import A3.a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C6496s;
import w3.C2833b;
import w3.C2834c;
import y3.g;
import y3.h;

public final class y implements h, C2715g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26774a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26775b;

    /* renamed from: c  reason: collision with root package name */
    private final File f26776c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable f26777d;

    /* renamed from: e  reason: collision with root package name */
    private final int f26778e;

    /* renamed from: f  reason: collision with root package name */
    private final h f26779f;

    /* renamed from: g  reason: collision with root package name */
    private C2714f f26780g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26781h;

    public y(Context context, String str, File file, Callable callable, int i10, h hVar) {
        C6496s.h(context, "context");
        C6496s.h(hVar, "delegate");
        this.f26774a = context;
        this.f26775b = str;
        this.f26776c = file;
        this.f26777d = callable;
        this.f26778e = i10;
        this.f26779f = hVar;
    }

    private final void b(File file, boolean z10) {
        ReadableByteChannel readableByteChannel;
        if (this.f26775b != null) {
            readableByteChannel = Channels.newChannel(this.f26774a.getAssets().open(this.f26775b));
            C6496s.g(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f26776c != null) {
            readableByteChannel = new FileInputStream(this.f26776c).getChannel();
            C6496s.g(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f26777d;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel((InputStream) callable.call());
                    C6496s.g(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f26774a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        C6496s.g(channel, "output");
        C2834c.a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            C6496s.g(createTempFile, "intermediateFile");
            f(createTempFile, z10);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    private final void f(File file, boolean z10) {
        C2714f fVar = this.f26780g;
        if (fVar == null) {
            C6496s.v("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void o(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f26774a.getDatabasePath(databaseName);
            C2714f fVar = this.f26780g;
            C2714f fVar2 = null;
            if (fVar == null) {
                C6496s.v("databaseConfiguration");
                fVar = null;
            }
            boolean z11 = fVar.f26653s;
            File filesDir = this.f26774a.getFilesDir();
            C6496s.g(filesDir, "context.filesDir");
            a aVar = new a(databaseName, filesDir, z11);
            try {
                a.c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    C6496s.g(databasePath, "databaseFile");
                    b(databasePath, z10);
                    aVar.d();
                    return;
                }
                try {
                    C6496s.g(databasePath, "databaseFile");
                    int c10 = C2833b.c(databasePath);
                    if (c10 == this.f26778e) {
                        aVar.d();
                        return;
                    }
                    C2714f fVar3 = this.f26780g;
                    if (fVar3 == null) {
                        C6496s.v("databaseConfiguration");
                    } else {
                        fVar2 = fVar3;
                    }
                    if (fVar2.a(c10, this.f26778e)) {
                        aVar.d();
                        return;
                    }
                    if (this.f26774a.deleteDatabase(databaseName)) {
                        try {
                            b(databasePath, z10);
                        } catch (IOException e10) {
                            Log.w("ROOM", "Unable to copy database file.", e10);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar.d();
                }
            } catch (IOException e12) {
                throw new RuntimeException("Unable to copy database file.", e12);
            } catch (Throwable th2) {
                aVar.d();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public g X0() {
        if (!this.f26781h) {
            o(true);
            this.f26781h = true;
        }
        return a().X0();
    }

    public h a() {
        return this.f26779f;
    }

    public synchronized void close() {
        a().close();
        this.f26781h = false;
    }

    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    public final void n(C2714f fVar) {
        C6496s.h(fVar, "databaseConfiguration");
        this.f26780g = fVar;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
