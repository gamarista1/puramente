package io.intercom.android.sdk.survey.block;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText;", "", "", "text", "ttsText", "Lr0/x0;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3-0d7_KjU", "()J", "component3", "copy-mxwnekA", "(Ljava/lang/String;Ljava/lang/String;J)Lio/intercom/android/sdk/survey/block/SuffixText;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getTtsText", "J", "getColor-0d7_KjU", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuffixText {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final SuffixText NO_SUFFIX = new SuffixText("", "", C2544x0.f25560b.a(), (DefaultConstructorMarker) null);
    private final long color;
    private final String text;
    private final String ttsText;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText$Companion;", "", "<init>", "()V", "NO_SUFFIX", "Lio/intercom/android/sdk/survey/block/SuffixText;", "getNO_SUFFIX", "()Lio/intercom/android/sdk/survey/block/SuffixText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SuffixText getNO_SUFFIX() {
            return SuffixText.NO_SUFFIX;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SuffixText(String str, String str2, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10);
    }

    /* renamed from: copy-mxwnekA$default  reason: not valid java name */
    public static /* synthetic */ SuffixText m460copymxwnekA$default(SuffixText suffixText, String str, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suffixText.text;
        }
        if ((i10 & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i10 & 4) != 0) {
            j10 = suffixText.color;
        }
        return suffixText.m462copymxwnekA(str, str2, j10);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.ttsText;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m461component30d7_KjU() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA  reason: not valid java name */
    public final SuffixText m462copymxwnekA(String str, String str2, long j10) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "ttsText");
        return new SuffixText(str, str2, j10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) obj;
        return C6496s.c(this.text, suffixText.text) && C6496s.c(this.ttsText, suffixText.ttsText) && C2544x0.q(this.color, suffixText.color);
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m463getColor0d7_KjU() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTtsText() {
        return this.ttsText;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.ttsText.hashCode()) * 31) + C2544x0.w(this.color);
    }

    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + C2544x0.x(this.color) + ')';
    }

    private SuffixText(String str, String str2, long j10) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "ttsText");
        this.text = str;
        this.ttsText = str2;
        this.color = j10;
    }
}
