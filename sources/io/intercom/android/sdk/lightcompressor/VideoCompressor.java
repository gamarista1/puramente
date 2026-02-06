package io.intercom.android.sdk.lightcompressor;

import Sg.p;
import Ug.C5572i;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Ug.Z;
import android.content.Context;
import android.net.Uri;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0003JQ\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0015JL\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b \u0010!JS\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b&\u0010'J/\u0010+\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020%H\u0003¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u000b\u00107\u001a\u0002068\u0016X\u0005¨\u00068"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/VideoCompressor;", "LUg/K;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Landroid/net/Uri;", "uris", "", "isStreamable", "Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;", "sharedStorageConfiguration", "Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;", "appSpecificStorageConfiguration", "Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "configureWith", "Lio/intercom/android/sdk/lightcompressor/CompressionListener;", "listener", "Llf/M;", "start", "(Landroid/content/Context;Ljava/util/List;ZLio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;Lio/intercom/android/sdk/lightcompressor/config/Configuration;Lio/intercom/android/sdk/lightcompressor/CompressionListener;)V", "cancel", "configuration", "doVideoCompression", "", "index", "srcUri", "", "destPath", "streamableFile", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "startCompression", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/Configuration;Lio/intercom/android/sdk/lightcompressor/CompressionListener;Lqf/d;)Ljava/lang/Object;", "filePath", "videoName", "shouldSave", "Ljava/io/File;", "saveVideoFile", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;", "videoFileName", "saveLocation", "videoFile", "saveVideoInExternal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "uri", "getMediaPath", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "name", "validatedFileName", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;", "LUg/w0;", "job", "LUg/w0;", "Lqf/g;", "coroutineContext", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoCompressor implements K {
    public static final VideoCompressor INSTANCE = new VideoCompressor();
    private static C5600w0 job;
    private final /* synthetic */ K $$delegate_0 = L.b();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.lightcompressor.config.SaveLocation[] r0 = io.intercom.android.sdk.lightcompressor.config.SaveLocation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.lightcompressor.config.SaveLocation r1 = io.intercom.android.sdk.lightcompressor.config.SaveLocation.downloads     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.lightcompressor.config.SaveLocation r1 = io.intercom.android.sdk.lightcompressor.config.SaveLocation.pictures     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.VideoCompressor.WhenMappings.<clinit>():void");
        }
    }

    private VideoCompressor() {
    }

    public static final void cancel() {
        C5600w0 w0Var = job;
        if (w0Var != null) {
            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(Context context, List<? extends Uri> list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        N n10 = new N();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            job = C5576k.d(this, Z.b(), (M) null, new VideoCompressor$doVideoCompression$1(context, sharedStorageConfiguration, appSpecificStorageConfiguration, z10, configuration, i10, n10, list, compressionListener, (C6658d<? super VideoCompressor$doVideoCompression$1>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(3:1|2|(4:4|5|6|7)(3:10|11|12))|16|17|(11:19|20|21|22|23|(2:24|(1:26)(1:54))|29|30|31|32|33)|47|(1:49)|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        wf.C6763c.a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMediaPath(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            android.content.ContentResolver r6 = r10.getContentResolver()
            java.lang.String r7 = "_data"
            java.lang.String[] r2 = new java.lang.String[]{r7}
            r4 = 0
            r5 = 0
            r8 = 0
            r3 = 0
            r0 = r6
            r1 = r11
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            if (r0 == 0) goto L_0x002c
            int r1 = r0.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x0035 }
            r0.moveToFirst()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0035 }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ Exception -> 0x0035 }
            r0.close()
            return r1
        L_0x0028:
            r10 = move-exception
            r8 = r0
            goto L_0x009a
        L_0x002c:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0035 }
            r1.<init>()     // Catch:{ Exception -> 0x0035 }
            throw r1     // Catch:{ Exception -> 0x0035 }
        L_0x0032:
            r10 = move-exception
            goto L_0x009a
        L_0x0034:
            r0 = r8
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>()     // Catch:{ all -> 0x0028 }
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r10.dataDir     // Catch:{ all -> 0x0028 }
            r1.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = java.io.File.separator     // Catch:{ all -> 0x0028 }
            r1.append(r10)     // Catch:{ all -> 0x0028 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0028 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0028 }
            r1.<init>(r10)     // Catch:{ all -> 0x0028 }
            java.io.InputStream r10 = r6.openInputStream(r11)     // Catch:{ all -> 0x0028 }
            if (r10 == 0) goto L_0x008b
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x007d }
            r11.<init>(r1)     // Catch:{ all -> 0x007d }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0072 }
        L_0x0067:
            int r3 = r10.read(r2)     // Catch:{ all -> 0x0072 }
            if (r3 <= 0) goto L_0x0074
            r4 = 0
            r11.write(r2, r4, r3)     // Catch:{ all -> 0x0072 }
            goto L_0x0067
        L_0x0072:
            r1 = move-exception
            goto L_0x007f
        L_0x0074:
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0072 }
            wf.C6763c.a(r11, r8)     // Catch:{ all -> 0x007d }
            wf.C6763c.a(r10, r8)     // Catch:{ all -> 0x0028 }
            goto L_0x008b
        L_0x007d:
            r11 = move-exception
            goto L_0x0085
        L_0x007f:
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            wf.C6763c.a(r11, r1)     // Catch:{ all -> 0x007d }
            throw r2     // Catch:{ all -> 0x007d }
        L_0x0085:
            throw r11     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            wf.C6763c.a(r10, r11)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x008b:
            java.lang.String r10 = r1.getAbsolutePath()     // Catch:{ all -> 0x0028 }
            java.lang.String r11 = "getAbsolutePath(...)"
            kotlin.jvm.internal.C6496s.g(r10, r11)     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0099
            r0.close()
        L_0x0099:
            return r10
        L_0x009a:
            if (r8 == 0) goto L_0x009f
            r8.close()
        L_0x009f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.VideoCompressor.getMediaPath(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        wf.C6763c.a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0103, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File saveVideoFile(android.content.Context r5, java.lang.String r6, io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration r7, io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration r8, java.lang.Boolean r9, java.lang.String r10, java.lang.Boolean r11) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0179
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            r6 = 47
            if (r7 == 0) goto L_0x0105
            io.intercom.android.sdk.lightcompressor.VideoCompressor r8 = INSTANCE
            java.lang.String r9 = r8.validatedFileName(r10, r9)
            io.intercom.android.sdk.lightcompressor.config.SaveLocation r10 = r7.getSaveAt()
            if (r10 != 0) goto L_0x001a
            r10 = -1
            goto L_0x0022
        L_0x001a:
            int[] r2 = io.intercom.android.sdk.lightcompressor.VideoCompressor.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r2[r10]
        L_0x0022:
            r2 = 1
            if (r10 == r2) goto L_0x002e
            r2 = 2
            if (r10 == r2) goto L_0x002b
            java.lang.String r10 = android.os.Environment.DIRECTORY_MOVIES
            goto L_0x0030
        L_0x002b:
            java.lang.String r10 = android.os.Environment.DIRECTORY_PICTURES
            goto L_0x0030
        L_0x002e:
            java.lang.String r10 = android.os.Environment.DIRECTORY_DOWNLOADS
        L_0x0030:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x008d
            java.lang.String r0 = r7.getSubFolderName()
            if (r0 == 0) goto L_0x0052
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r6)
            java.lang.String r6 = r7.getSubFolderName()
            r0.append(r6)
            java.lang.String r10 = r0.toString()
        L_0x0052:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C6496s.c(r11, r6)
            if (r6 == 0) goto L_0x0083
            kotlin.jvm.internal.C6496s.e(r10)
            r8.saveVideoInExternal(r5, r9, r10, r1)
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            r6.<init>(r5, r9)
            r6.delete()
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "/storage/emulated/0/"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r9)
            return r5
        L_0x0083:
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            r6.<init>(r5, r9)
            return r6
        L_0x008d:
            java.io.File r8 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            java.lang.String r10 = r7.getSubFolderName()
            if (r10 == 0) goto L_0x00ae
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r6)
            java.lang.String r6 = r7.getSubFolderName()
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r6 = r8.getPath()
        L_0x00b2:
            java.io.File r7 = new java.io.File
            r7.<init>(r6, r9)
            boolean r6 = r7.exists()
            if (r6 != 0) goto L_0x00cb
            java.io.File r6 = r7.getParentFile()     // Catch:{ IOException -> 0x00c7 }
            if (r6 == 0) goto L_0x00cb
            r6.mkdirs()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00cb:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C6496s.c(r11, r6)
            if (r6 == 0) goto L_0x0104
            r6 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r9, r6)
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x00f6 }
            r8.<init>(r1)     // Catch:{ all -> 0x00f6 }
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x00eb }
        L_0x00e1:
            int r10 = r8.read(r9)     // Catch:{ all -> 0x00eb }
            if (r10 <= 0) goto L_0x00ed
            r5.write(r9, r6, r10)     // Catch:{ all -> 0x00eb }
            goto L_0x00e1
        L_0x00eb:
            r6 = move-exception
            goto L_0x00f8
        L_0x00ed:
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x00eb }
            wf.C6763c.a(r8, r0)     // Catch:{ all -> 0x00f6 }
            wf.C6763c.a(r5, r0)
            goto L_0x0104
        L_0x00f6:
            r6 = move-exception
            goto L_0x00fe
        L_0x00f8:
            throw r6     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r7 = move-exception
            wf.C6763c.a(r8, r6)     // Catch:{ all -> 0x00f6 }
            throw r7     // Catch:{ all -> 0x00f6 }
        L_0x00fe:
            throw r6     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r7 = move-exception
            wf.C6763c.a(r5, r6)
            throw r7
        L_0x0104:
            return r7
        L_0x0105:
            io.intercom.android.sdk.lightcompressor.VideoCompressor r7 = INSTANCE
            java.lang.String r7 = r7.validatedFileName(r10, r9)
            kotlin.jvm.internal.C6496s.e(r8)
            java.lang.String r9 = r8.getSubFolderName()
            if (r9 == 0) goto L_0x012a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = r8.getSubFolderName()
            r9.append(r8)
            r9.append(r6)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x012a:
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = r5.getFilesDir()
            r9.append(r10)
            r9.append(r6)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            boolean r8 = r8.exists()
            if (r8 != 0) goto L_0x016f
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = r5.getFilesDir()
            r9.append(r10)
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            r8.<init>(r6)
            java.io.File r6 = r8.getParentFile()
            if (r6 == 0) goto L_0x016f
            r6.mkdirs()
        L_0x016f:
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            r6.<init>(r5, r7)
            return r6
        L_0x0179:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.VideoCompressor.saveVideoFile(android.content.Context, java.lang.String, io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration, io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration, java.lang.Boolean, java.lang.String, java.lang.Boolean):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        wf.C6763c.a(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        wf.C6763c.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void saveVideoInExternal(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.io.File r11) {
        /*
            r7 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "_display_name"
            r0.put(r1, r9)
            java.lang.String r9 = "mime_type"
            java.lang.String r1 = "video/mp4"
            r0.put(r9, r1)
            java.lang.String r9 = "relative_path"
            r0.put(r9, r10)
            r9 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = "is_pending"
            r0.put(r1, r9)
            java.lang.String r9 = "external_primary"
            android.net.Uri r9 = android.provider.MediaStore.Video.Media.getContentUri(r9)
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r2)
            if (r10 == 0) goto L_0x0032
            android.net.Uri r9 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
        L_0x0032:
            android.content.ContentResolver r10 = r8.getContentResolver()
            android.net.Uri r9 = r10.insert(r9, r0)
            if (r9 == 0) goto L_0x009b
            android.content.ContentResolver r10 = r8.getContentResolver()
            java.lang.String r2 = "rw"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r9, r2)
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L_0x0087
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0071 }
            java.io.FileDescriptor r5 = r10.getFileDescriptor()     // Catch:{ all -> 0x0071 }
            r4.<init>(r5)     // Catch:{ all -> 0x0071 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0073 }
            r5.<init>(r11)     // Catch:{ all -> 0x0073 }
            r11 = 4096(0x1000, float:5.74E-42)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0066 }
        L_0x005c:
            int r6 = r5.read(r11)     // Catch:{ all -> 0x0066 }
            if (r6 <= 0) goto L_0x0068
            r4.write(r11, r2, r6)     // Catch:{ all -> 0x0066 }
            goto L_0x005c
        L_0x0066:
            r8 = move-exception
            goto L_0x0075
        L_0x0068:
            lf.M r11 = lf.C6514M.f71813a     // Catch:{ all -> 0x0066 }
            wf.C6763c.a(r5, r3)     // Catch:{ all -> 0x0073 }
            wf.C6763c.a(r4, r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0087
        L_0x0071:
            r8 = move-exception
            goto L_0x0081
        L_0x0073:
            r8 = move-exception
            goto L_0x007b
        L_0x0075:
            throw r8     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r9 = move-exception
            wf.C6763c.a(r5, r8)     // Catch:{ all -> 0x0073 }
            throw r9     // Catch:{ all -> 0x0073 }
        L_0x007b:
            throw r8     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            wf.C6763c.a(r4, r8)     // Catch:{ all -> 0x0071 }
            throw r9     // Catch:{ all -> 0x0071 }
        L_0x0081:
            throw r8     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r9 = move-exception
            wf.C6763c.a(r10, r8)
            throw r9
        L_0x0087:
            wf.C6763c.a(r10, r3)
            r0.clear()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r10)
            android.content.ContentResolver r8 = r8.getContentResolver()
            r8.update(r9, r0, r3, r3)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.VideoCompressor.saveVideoInExternal(android.content.Context, java.lang.String, java.lang.String, java.io.File):void");
    }

    public static final void start(Context context, List<? extends Uri> list, Configuration configuration, CompressionListener compressionListener) {
        C6496s.h(context, "context");
        C6496s.h(list, "uris");
        C6496s.h(configuration, "configureWith");
        C6496s.h(compressionListener, "listener");
        start$default(context, list, false, (SharedStorageConfiguration) null, (AppSpecificStorageConfiguration) null, configuration, compressionListener, 28, (Object) null);
    }

    public static /* synthetic */ void start$default(Context context, List list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener, int i10, Object obj) {
        SharedStorageConfiguration sharedStorageConfiguration2;
        AppSpecificStorageConfiguration appSpecificStorageConfiguration2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            sharedStorageConfiguration2 = null;
        } else {
            sharedStorageConfiguration2 = sharedStorageConfiguration;
        }
        if ((i10 & 16) != 0) {
            appSpecificStorageConfiguration2 = null;
        } else {
            appSpecificStorageConfiguration2 = appSpecificStorageConfiguration;
        }
        start(context, list, z11, sharedStorageConfiguration2, appSpecificStorageConfiguration2, configuration, compressionListener);
    }

    /* access modifiers changed from: private */
    public final Object startCompression(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, C6658d<? super Result> dVar) {
        return C5572i.g(Z.a(), new VideoCompressor$startCompression$2(i10, context, uri, str, str2, configuration, compressionListener, (C6658d<? super VideoCompressor$startCompression$2>) null), dVar);
    }

    static /* synthetic */ Object startCompression$default(VideoCompressor videoCompressor, int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, C6658d dVar, int i11, Object obj) {
        String str3;
        if ((i11 & 16) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        return videoCompressor.startCompression(i10, context, uri, str, str3, configuration, compressionListener, dVar);
    }

    private final String validatedFileName(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = str + "_temp";
        }
        if (p.O(str, "mp4", false, 2, (Object) null)) {
            return str;
        }
        return str + ".mp4";
    }

    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z10, Configuration configuration, CompressionListener compressionListener) {
        C6496s.h(context, "context");
        C6496s.h(list, "uris");
        C6496s.h(configuration, "configureWith");
        C6496s.h(compressionListener, "listener");
        start$default(context, list, z10, (SharedStorageConfiguration) null, (AppSpecificStorageConfiguration) null, configuration, compressionListener, 24, (Object) null);
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        C6496s.h(context, "context");
        C6496s.h(list, "uris");
        C6496s.h(configuration, "configureWith");
        C6496s.h(compressionListener, "listener");
        start$default(context, list, z10, sharedStorageConfiguration, (AppSpecificStorageConfiguration) null, configuration, compressionListener, 16, (Object) null);
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        C6496s.h(context, "context");
        C6496s.h(list, "uris");
        C6496s.h(configuration, "configureWith");
        C6496s.h(compressionListener, "listener");
        configuration.getVideoNames().size();
        list.size();
        INSTANCE.doVideoCompression(context, list, z10, sharedStorageConfiguration, appSpecificStorageConfiguration, configuration, compressionListener);
    }
}
