package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001e\u0010\rJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Llf/M;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lyf/l;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "LRg/h;", "block", "readFilePerLines", "", "numberOfLinesToRemove", "removeFirstLinesFromFile", "(Ljava/lang/String;I)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileHelper {
    private final Context applicationContext;

    public FileHelper(Context context) {
        C6496s.h(context, "applicationContext");
        this.applicationContext = context;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        C6496s.g(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        wf.C6763c.a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        wf.C6763c.a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0033, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0035, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0036, code lost:
        wf.C6763c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0039, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void openBufferedReader(java.lang.String r4, yf.C6798l r5) {
        /*
            r3 = this;
            java.io.File r4 = r3.getFileInFilesDir(r4)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0023 }
            r4.<init>(r0)     // Catch:{ all -> 0x0023 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0025 }
            r1.<init>(r4)     // Catch:{ all -> 0x0025 }
            r5.invoke(r1)     // Catch:{ all -> 0x0027 }
            lf.M r5 = lf.C6514M.f71813a     // Catch:{ all -> 0x0027 }
            r5 = 0
            wf.C6763c.a(r1, r5)     // Catch:{ all -> 0x0025 }
            wf.C6763c.a(r4, r5)     // Catch:{ all -> 0x0023 }
            wf.C6763c.a(r0, r5)
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x0034
        L_0x0025:
            r5 = move-exception
            goto L_0x002e
        L_0x0027:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r2 = move-exception
            wf.C6763c.a(r1, r5)     // Catch:{ all -> 0x0025 }
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x002e:
            throw r5     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            wf.C6763c.a(r4, r5)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0034:
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r5 = move-exception
            wf.C6763c.a(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.FileHelper.openBufferedReader(java.lang.String, yf.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        wf.C6763c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void appendToFile(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "contentToAppend"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.io.File r3 = r2.getFileInFilesDir(r3)
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x0017
            r0.mkdirs()
        L_0x0017:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r3, r1)
            java.nio.charset.Charset r3 = Sg.C5541d.f65029b     // Catch:{ all -> 0x0032 }
            byte[] r3 = r4.getBytes(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C6496s.g(r3, r4)     // Catch:{ all -> 0x0032 }
            r0.write(r3)     // Catch:{ all -> 0x0032 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0032 }
            r3 = 0
            wf.C6763c.a(r0, r3)
            return
        L_0x0032:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r4 = move-exception
            wf.C6763c.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.FileHelper.appendToFile(java.lang.String, java.lang.String):void");
    }

    public final boolean deleteFile(String str) {
        C6496s.h(str, "filePath");
        return getFileInFilesDir(str).delete();
    }

    public final boolean fileIsEmpty(String str) {
        C6496s.h(str, "filePath");
        File fileInFilesDir = getFileInFilesDir(str);
        if (!fileInFilesDir.exists() || fileInFilesDir.length() == 0) {
            return true;
        }
        return false;
    }

    public final double fileSizeInKB(String str) {
        C6496s.h(str, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(str));
    }

    public final void readFilePerLines(String str, C6798l lVar) {
        C6496s.h(str, "filePath");
        C6496s.h(lVar, "block");
        openBufferedReader(str, new FileHelper$readFilePerLines$1(lVar));
    }

    public final void removeFirstLinesFromFile(String str, int i10) {
        C6496s.h(str, "filePath");
        StringBuilder sb2 = new StringBuilder();
        readFilePerLines(str, new FileHelper$removeFirstLinesFromFile$1(i10, sb2));
        deleteFile(str);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "textToAppend.toString()");
        appendToFile(str, sb3);
    }
}
