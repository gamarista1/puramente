package io.intercom.android.sdk.ui.preview.viewmodel;

import R1.a;
import Sg.p;
import Ug.C5600w0;
import Ug.M;
import Ug.Z;
import Xg.L;
import Xg.N;
import Xg.x;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import qf.C6658d;
import wf.C6763c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b!\u0010\u0015J'\u0010\"\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00102J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0007\u001a\u000209H\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\n2\u0006\u0010\u0007\u001a\u0002092\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010C\u001a\u00020\n2\u0006\u0010@\u001a\u000204H\u0000¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0000X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "previewArgs", "<init>", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;)V", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "file", "Landroid/content/Context;", "context", "Llf/M;", "saveImage", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;Landroid/content/Context;)V", "saveVideo", "saveDocument", "Landroid/graphics/Bitmap;", "bitmap", "", "url", "mimeType", "saveImageLegacy", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "directory", "saveFileLegacy", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V", "Ljava/io/File;", "fileDirectory", "getNonExistingFileNameFromUrlLegacy", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "contentUri", "getNonExistingFileNameFromUrl", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;", "saveImageOnApi29Above", "saveVideoOnApi29Above", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "saveFileOnApi29Above", "prepareBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "", "degrees", "rotate", "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "Ljava/io/OutputStream;", "outputStream", "saveImageToStream", "(Landroid/graphics/Bitmap;Ljava/io/OutputStream;)V", "saveFileToStream", "(Ljava/lang/String;Ljava/io/OutputStream;)V", "showFileSaveSuccess", "(Landroid/content/Context;)V", "showFileSaveFailed", "", "size", "", "showDeleteAction", "(I)Z", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "onDeleteClicked$intercom_sdk_ui_release", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;)V", "onDeleteClicked", "saveFile$intercom_sdk_ui_release", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;Landroid/content/Context;)V", "saveFile", "pageNo", "onPageNavigated$intercom_sdk_ui_release", "(I)V", "onPageNavigated", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "LUg/w0;", "downloadJob", "LUg/w0;", "LXg/x;", "Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "_state", "LXg/x;", "LXg/L;", "state", "LXg/L;", "getState$intercom_sdk_ui_release", "()LXg/L;", "Companion", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final x _state;
    private C5600w0 downloadJob;
    private final IntercomPreviewArgs previewArgs;
    private final L state;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "previewArgs", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "create$intercom_sdk_ui_release", "(Landroidx/lifecycle/e0;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;)Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "create", "Landroidx/lifecycle/c0$c;", "factory$intercom_sdk_ui_release", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;)Landroidx/lifecycle/c0$c;", "factory", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreviewViewModel create$intercom_sdk_ui_release(e0 e0Var, IntercomPreviewArgs intercomPreviewArgs) {
            C6496s.h(e0Var, "owner");
            C6496s.h(intercomPreviewArgs, "previewArgs");
            return (PreviewViewModel) new c0(e0Var, factory$intercom_sdk_ui_release(intercomPreviewArgs)).b(PreviewViewModel.class);
        }

        public final c0.c factory$intercom_sdk_ui_release(IntercomPreviewArgs intercomPreviewArgs) {
            C6496s.h(intercomPreviewArgs, "previewArgs");
            return new PreviewViewModel$Companion$factory$1(intercomPreviewArgs);
        }

        private Companion() {
        }
    }

    public PreviewViewModel(IntercomPreviewArgs intercomPreviewArgs) {
        C6496s.h(intercomPreviewArgs, "previewArgs");
        this.previewArgs = intercomPreviewArgs;
        x a10 = N.a(new PreviewUiState((List) null, 0, false, false, (String) null, false, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null));
        this._state = a10;
        this.state = a10;
        a10.setValue(new PreviewUiState(intercomPreviewArgs.getUris(), 0, showDeleteAction(intercomPreviewArgs.getUris().size()), intercomPreviewArgs.getShowSendCTA(), intercomPreviewArgs.getCtaText(), intercomPreviewArgs.getDownloadState().getShowDownloadAction(), intercomPreviewArgs.getDownloadState().getFileSavingText(), intercomPreviewArgs.getDownloadState().getFileSavedText(), intercomPreviewArgs.getDownloadState().getSaveFailedText(), 2, (DefaultConstructorMarker) null));
    }

    private final String getNonExistingFileNameFromUrl(String str, Uri uri, String str2, Context context) {
        Throwable th2;
        String str3 = str;
        String guessFileName = URLUtil.guessFileName(str, (String) null, str2);
        C6496s.e(guessFileName);
        List F02 = p.F0(guessFileName, new String[]{"."}, false, 2, 2, (Object) null);
        int i10 = 0;
        String str4 = (String) C6565s.r0(F02, 0);
        if (str4 == null) {
            str4 = "fileName";
        }
        Pair a10 = C6502A.a(str4, C6565s.r0(F02, 1));
        String str5 = (String) a10.a();
        String str6 = (String) a10.b();
        String[] strArr = {str5 + '%', "%." + str6};
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, "_display_name LIKE ? AND _display_name LIKE ?", strArr, (String) null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_display_name");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    C6496s.g(string, "getString(...)");
                    arrayList.add(string);
                }
                C6514M m10 = C6514M.f71813a;
                C6763c.a(query, (Throwable) null);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                C6763c.a(query, th2);
                throw th4;
            }
        }
        while (true) {
            i10++;
            if (arrayList.contains(guessFileName)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5 + " (" + i10 + ')');
                if (str6 != null) {
                    sb2.append('.' + str6);
                }
                guessFileName = sb2.toString();
                C6496s.g(guessFileName, "toString(...)");
            } else {
                C6496s.e(guessFileName);
                return guessFileName;
            }
        }
    }

    private final String getNonExistingFileNameFromUrlLegacy(String str, File file, String str2) {
        String guessFileName = URLUtil.guessFileName(str, (String) null, str2);
        C6496s.e(guessFileName);
        List F02 = p.F0(guessFileName, new String[]{"."}, false, 2, 2, (Object) null);
        int i10 = 0;
        String str3 = (String) C6565s.r0(F02, 0);
        if (str3 == null) {
            str3 = "fileName";
        }
        Pair a10 = C6502A.a(str3, C6565s.r0(F02, 1));
        String str4 = (String) a10.a();
        String str5 = (String) a10.b();
        while (true) {
            i10++;
            if (new File(file, guessFileName).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4 + " (" + i10 + ')');
                if (str5 != null) {
                    sb2.append('.' + str5);
                }
                guessFileName = sb2.toString();
                C6496s.g(guessFileName, "toString(...)");
            } else {
                C6496s.e(guessFileName);
                return guessFileName;
            }
        }
    }

    /* access modifiers changed from: private */
    public final Bitmap prepareBitmap(String str) {
        int i10;
        try {
            int i11 = new a(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream()).i("Orientation", 1);
            if (i11 == 3) {
                i10 = 180;
            } else if (i11 == 6) {
                i10 = 90;
            } else if (i11 != 8) {
                i10 = 0;
            } else {
                i10 = 270;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
            C6496s.e(decodeStream);
            return rotate(decodeStream, (float) i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final Bitmap rotate(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        C6496s.g(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final void saveDocument(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C5576k.d(b0.a(this), Z.b(), (M) null, new PreviewViewModel$saveDocument$1(this, networkFile, context, (C6658d<? super PreviewViewModel$saveDocument$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void saveFileLegacy(String str, String str2, Context context, String str3) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        externalStoragePublicDirectory.mkdir();
        C6496s.e(externalStoragePublicDirectory);
        saveFileToStream(str, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* access modifiers changed from: private */
    public final void saveFileOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            Uri a10 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            C6496s.g(a10, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, a10, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (insert != null && (openFileDescriptor = contentResolver.openFileDescriptor(insert, "w")) != null) {
                saveFileToStream(str, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                openFileDescriptor.close();
                contentValues.clear();
                contentResolver.update(insert, contentValues, (String) null, (String[]) null);
                showFileSaveSuccess(context);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveFileToStream(String str, OutputStream outputStream) {
        InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            inputStream.close();
        }
        outputStream.close();
    }

    private final void saveImage(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C5576k.d(b0.a(this), Z.b(), (M) null, new PreviewViewModel$saveImage$1(this, networkFile, context, (C6658d<? super PreviewViewModel$saveImage$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void saveImageLegacy(Bitmap bitmap, String str, String str2, Context context) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdir();
        C6496s.e(externalStoragePublicDirectory);
        saveImageToStream(bitmap, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* access modifiers changed from: private */
    public final void saveImageOnApi29Above(Bitmap bitmap, String str, String str2, Context context) {
        OutputStream openOutputStream;
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            C6496s.g(uri, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, uri, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", 1);
            Uri insert = context.getContentResolver().insert(uri, contentValues);
            if (insert != null && (openOutputStream = context.getContentResolver().openOutputStream(insert)) != null) {
                saveImageToStream(bitmap, openOutputStream);
                contentValues.clear();
                contentValues.put("is_pending", 0);
                context.getContentResolver().update(insert, contentValues, (String) null, (String[]) null);
                showFileSaveSuccess(context);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveImageToStream(Bitmap bitmap, OutputStream outputStream) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        outputStream.close();
    }

    private final void saveVideo(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C5576k.d(b0.a(this), Z.b(), (M) null, new PreviewViewModel$saveVideo$1(this, networkFile, context, (C6658d<? super PreviewViewModel$saveVideo$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void saveVideoOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            C6496s.g(uri, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, uri, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", 1);
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert != null && (openFileDescriptor = contentResolver.openFileDescriptor(insert, "w")) != null) {
                saveFileToStream(str, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                openFileDescriptor.close();
                contentValues.clear();
                contentValues.put("is_pending", 0);
                contentResolver.update(insert, contentValues, (String) null, (String[]) null);
                showFileSaveSuccess(context);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final boolean showDeleteAction(int i10) {
        DeleteType deleteType = this.previewArgs.getDeleteType();
        if (C6496s.c(deleteType, DeleteType.None.INSTANCE)) {
            return false;
        }
        if (!C6496s.c(deleteType, DeleteType.Delete.INSTANCE)) {
            if (!C6496s.c(deleteType, DeleteType.Remove.INSTANCE)) {
                throw new C6535s();
            } else if (i10 <= 1) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void showFileSaveFailed(Context context) {
        C5600w0 unused = C5576k.d(b0.a(this), Z.c(), (M) null, new PreviewViewModel$showFileSaveFailed$1(context, this, (C6658d<? super PreviewViewModel$showFileSaveFailed$1>) null), 2, (Object) null);
    }

    private final void showFileSaveSuccess(Context context) {
        C5600w0 unused = C5576k.d(b0.a(this), Z.c(), (M) null, new PreviewViewModel$showFileSaveSuccess$1(context, this, (C6658d<? super PreviewViewModel$showFileSaveSuccess$1>) null), 2, (Object) null);
    }

    public final L getState$intercom_sdk_ui_release() {
        return this.state;
    }

    public final void onDeleteClicked$intercom_sdk_ui_release(IntercomPreviewFile intercomPreviewFile) {
        Object value;
        PreviewUiState previewUiState;
        List H02;
        C6496s.h(intercomPreviewFile, "file");
        x xVar = this._state;
        do {
            value = xVar.getValue();
            previewUiState = (PreviewUiState) value;
            H02 = C6565s.H0(previewUiState.getFiles(), intercomPreviewFile);
        } while (!xVar.e(value, PreviewUiState.copy$default(previewUiState, H02, 0, showDeleteAction(H02.size()), false, (String) null, false, (String) null, (String) null, (String) null, 506, (Object) null)));
    }

    public final void onPageNavigated$intercom_sdk_ui_release(int i10) {
        Object value;
        x xVar = this._state;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, PreviewUiState.copy$default((PreviewUiState) value, (List) null, i10, false, false, (String) null, false, (String) null, (String) null, (String) null, 509, (Object) null)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0.a() == true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveFile$intercom_sdk_ui_release(io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile r4, android.content.Context r5) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            Ug.w0 r0 = r3.downloadJob
            r1 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            boolean r0 = r4 instanceof io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile
            if (r0 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x0052
            Xg.x r0 = r3._state
            java.lang.Object r0 = r0.getValue()
            io.intercom.android.sdk.ui.preview.model.PreviewUiState r0 = (io.intercom.android.sdk.ui.preview.model.PreviewUiState) r0
            java.lang.String r0 = r0.getFileSavingText()
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            java.lang.String r0 = r4.getMimeType(r5)
            boolean r1 = io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt.isImage(r0)
            if (r1 == 0) goto L_0x0041
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile$NetworkFile r4 = (io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile) r4
            r3.saveImage(r4, r5)
            goto L_0x0052
        L_0x0041:
            boolean r0 = io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt.isVideo(r0)
            if (r0 == 0) goto L_0x004d
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile$NetworkFile r4 = (io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile) r4
            r3.saveVideo(r4, r5)
            goto L_0x0052
        L_0x004d:
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile$NetworkFile r4 = (io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile) r4
            r3.saveDocument(r4, r5)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel.saveFile$intercom_sdk_ui_release(io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile, android.content.Context):void");
    }
}
