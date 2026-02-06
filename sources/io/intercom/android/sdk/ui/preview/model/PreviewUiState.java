package io.intercom.android.sdk.ui.preview.model;

import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jq\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÇ\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020\u0006H×\u0001J\t\u0010,\u001a\u00020\u000bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006-"}, d2 = {"Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "", "files", "", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "currentPage", "", "showDeleteAction", "", "showSendAction", "confirmationText", "", "showDownloadAction", "fileSavingText", "fileSavedText", "saveFailedText", "<init>", "(Ljava/util/List;IZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiles", "()Ljava/util/List;", "getCurrentPage", "()I", "getShowDeleteAction", "()Z", "getShowSendAction", "getConfirmationText", "()Ljava/lang/String;", "getShowDownloadAction", "getFileSavingText", "getFileSavedText", "getSaveFailedText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewUiState {
    public static final int $stable = 8;
    private final String confirmationText;
    private final int currentPage;
    private final String fileSavedText;
    private final String fileSavingText;
    private final List<IntercomPreviewFile> files;
    private final String saveFailedText;
    private final boolean showDeleteAction;
    private final boolean showDownloadAction;
    private final boolean showSendAction;

    public PreviewUiState() {
        this((List) null, 0, false, false, (String) null, false, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PreviewUiState copy$default(PreviewUiState previewUiState, List list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4, int i11, Object obj) {
        PreviewUiState previewUiState2 = previewUiState;
        int i12 = i11;
        return previewUiState.copy((i12 & 1) != 0 ? previewUiState2.files : list, (i12 & 2) != 0 ? previewUiState2.currentPage : i10, (i12 & 4) != 0 ? previewUiState2.showDeleteAction : z10, (i12 & 8) != 0 ? previewUiState2.showSendAction : z11, (i12 & 16) != 0 ? previewUiState2.confirmationText : str, (i12 & 32) != 0 ? previewUiState2.showDownloadAction : z12, (i12 & 64) != 0 ? previewUiState2.fileSavingText : str2, (i12 & 128) != 0 ? previewUiState2.fileSavedText : str3, (i12 & 256) != 0 ? previewUiState2.saveFailedText : str4);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.files;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final boolean component3() {
        return this.showDeleteAction;
    }

    public final boolean component4() {
        return this.showSendAction;
    }

    public final String component5() {
        return this.confirmationText;
    }

    public final boolean component6() {
        return this.showDownloadAction;
    }

    public final String component7() {
        return this.fileSavingText;
    }

    public final String component8() {
        return this.fileSavedText;
    }

    public final String component9() {
        return this.saveFailedText;
    }

    public final PreviewUiState copy(List<? extends IntercomPreviewFile> list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4) {
        C6496s.h(list, "files");
        return new PreviewUiState(list, i10, z10, z11, str, z12, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewUiState)) {
            return false;
        }
        PreviewUiState previewUiState = (PreviewUiState) obj;
        return C6496s.c(this.files, previewUiState.files) && this.currentPage == previewUiState.currentPage && this.showDeleteAction == previewUiState.showDeleteAction && this.showSendAction == previewUiState.showSendAction && C6496s.c(this.confirmationText, previewUiState.confirmationText) && this.showDownloadAction == previewUiState.showDownloadAction && C6496s.c(this.fileSavingText, previewUiState.fileSavingText) && C6496s.c(this.fileSavedText, previewUiState.fileSavedText) && C6496s.c(this.saveFailedText, previewUiState.saveFailedText);
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final List<IntercomPreviewFile> getFiles() {
        return this.files;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    public int hashCode() {
        int hashCode = ((((((this.files.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.showDeleteAction)) * 31) + Boolean.hashCode(this.showSendAction)) * 31;
        String str = this.confirmationText;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showDownloadAction)) * 31;
        String str2 = this.fileSavingText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileSavedText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFailedText;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "PreviewUiState(files=" + this.files + ", currentPage=" + this.currentPage + ", showDeleteAction=" + this.showDeleteAction + ", showSendAction=" + this.showSendAction + ", confirmationText=" + this.confirmationText + ", showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ')';
    }

    public PreviewUiState(List<? extends IntercomPreviewFile> list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4) {
        C6496s.h(list, "files");
        this.files = list;
        this.currentPage = i10;
        this.showDeleteAction = z10;
        this.showSendAction = z11;
        this.confirmationText = str;
        this.showDownloadAction = z12;
        this.fileSavingText = str2;
        this.fileSavedText = str3;
        this.saveFailedText = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PreviewUiState(java.util.List r11, int r12, boolean r13, boolean r14, java.lang.String r15, boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.List r1 = mf.C6565s.n()
            goto L_0x000c
        L_0x000b:
            r1 = r11
        L_0x000c:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0013
            r2 = r3
            goto L_0x0014
        L_0x0013:
            r2 = r12
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r3
            goto L_0x001b
        L_0x001a:
            r4 = r13
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r3
            goto L_0x0022
        L_0x0021:
            r5 = r14
        L_0x0022:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0029
            r6 = r7
            goto L_0x002a
        L_0x0029:
            r6 = r15
        L_0x002a:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = r16
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r7
            goto L_0x0039
        L_0x0037:
            r8 = r17
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r7
            goto L_0x0041
        L_0x003f:
            r9 = r18
        L_0x0041:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r7 = r19
        L_0x0048:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r3
            r18 = r8
            r19 = r9
            r20 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.model.PreviewUiState.<init>(java.util.List, int, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
