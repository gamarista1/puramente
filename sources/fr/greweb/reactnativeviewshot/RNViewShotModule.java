package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RNViewShotModule extends NativeRNViewShotSpec {
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor = Executors.newCachedThreadPool();
    private final ReactApplicationContext reactContext;

    private static class a extends GuardedAsyncTask implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private final File f60559a;

        /* renamed from: b  reason: collision with root package name */
        private final File f60560b;

        private void a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.delete()) {
                        Log.d(NativeRNViewShotSpec.NAME, "deleted file: " + file2.getAbsolutePath());
                    }
                }
            }
        }

        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f60559a;
            if (file != null) {
                a(file);
            }
            File file2 = this.f60560b;
            if (file2 != null) {
                a(file2);
            }
        }

        private a(ReactContext reactContext) {
            super(reactContext);
            this.f60559a = reactContext.getCacheDir();
            this.f60560b = reactContext.getExternalCacheDir();
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str, String str2) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String str3 = "." + str;
        if (str2 != null) {
            return File.createTempFile(str2, str3, externalCacheDir);
        }
        return File.createTempFile(TEMP_FILE_PREFIX, str3, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(Double d10, ReadableMap readableMap, Promise promise) {
        int i10;
        Integer num;
        Integer num2;
        String str;
        boolean z10;
        File file;
        ReadableMap readableMap2 = readableMap;
        int i11 = -1;
        if (d10 == null) {
            i10 = -1;
        } else {
            i10 = d10.intValue();
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getResources().getDisplayMetrics();
        String string = readableMap2.getString("format");
        if ("jpg".equals(string)) {
            i11 = 0;
        } else if ("webm".equals(string)) {
            i11 = 2;
        } else if (!"raw".equals(string)) {
            i11 = 1;
        }
        double d11 = readableMap2.getDouble("quality");
        if (readableMap2.hasKey(Snapshot.WIDTH)) {
            num = Integer.valueOf(readableMap2.getInt(Snapshot.WIDTH));
        } else {
            num = null;
        }
        if (readableMap2.hasKey(Snapshot.HEIGHT)) {
            num2 = Integer.valueOf(readableMap2.getInt(Snapshot.HEIGHT));
        } else {
            num2 = null;
        }
        String string2 = readableMap2.getString("result");
        if (readableMap2.hasKey("fileName")) {
            str = readableMap2.getString("fileName");
        } else {
            str = null;
        }
        Boolean valueOf = Boolean.valueOf(readableMap2.getBoolean("snapshotContentContainer"));
        if (!readableMap2.hasKey("handleGLSurfaceViewOnAndroid") || !readableMap2.getBoolean("handleGLSurfaceViewOnAndroid")) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            if ("tmpfile".equals(string2)) {
                file = createTempFile(getReactApplicationContext(), string, str);
            } else {
                file = null;
            }
            Activity currentActivity = getCurrentActivity();
            ReactApplicationContext reactApplicationContext2 = this.reactContext;
            ReactApplicationContext reactApplicationContext3 = reactApplicationContext2;
            int i12 = i11;
            ((FabricUIManager) n0.g(reactApplicationContext, 2)).addUIBlock(new a(i10, string, i12, d11, num, num2, file, string2, valueOf, reactApplicationContext3, currentActivity, z10, promise, this.executor));
        } catch (Throwable th2) {
            Log.e(NativeRNViewShotSpec.NAME, "Failed to snapshot view tag " + i10, th2);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i10);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(Double.valueOf(-1.0d), readableMap, promise);
    }

    public void invalidate() {
        super.invalidate();
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                    file.delete();
                }
            }
        }
    }
}
