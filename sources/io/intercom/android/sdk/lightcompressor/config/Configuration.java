package io.intercom.android.sdk.lightcompressor.config;

import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b+\b\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jj\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006:"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "", "quality", "Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "isMinBitrateCheckEnabled", "", "videoBitrateInMbps", "", "disableAudio", "keepOriginalResolution", "videoHeight", "", "videoWidth", "videoNames", "", "", "<init>", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "getQuality", "()Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "setQuality", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;)V", "()Z", "setMinBitrateCheckEnabled", "(Z)V", "getVideoBitrateInMbps", "()Ljava/lang/Integer;", "setVideoBitrateInMbps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDisableAudio", "setDisableAudio", "getKeepOriginalResolution", "getVideoHeight", "()Ljava/lang/Double;", "setVideoHeight", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getVideoWidth", "setVideoWidth", "getVideoNames", "()Ljava/util/List;", "setVideoNames", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "equals", "other", "hashCode", "toString", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;
    private VideoQuality quality;
    private Integer videoBitrateInMbps;
    private Double videoHeight;
    private List<String> videoNames;
    private Double videoWidth;

    public Configuration(VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List<String> list) {
        C6496s.h(videoQuality, "quality");
        C6496s.h(list, "videoNames");
        this.quality = videoQuality;
        this.isMinBitrateCheckEnabled = z10;
        this.videoBitrateInMbps = num;
        this.disableAudio = z11;
        this.keepOriginalResolution = z12;
        this.videoHeight = d10;
        this.videoWidth = d11;
        this.videoNames = list;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, Object obj) {
        Configuration configuration2 = configuration;
        int i11 = i10;
        return configuration.copy((i11 & 1) != 0 ? configuration2.quality : videoQuality, (i11 & 2) != 0 ? configuration2.isMinBitrateCheckEnabled : z10, (i11 & 4) != 0 ? configuration2.videoBitrateInMbps : num, (i11 & 8) != 0 ? configuration2.disableAudio : z11, (i11 & 16) != 0 ? configuration2.keepOriginalResolution : z12, (i11 & 32) != 0 ? configuration2.videoHeight : d10, (i11 & 64) != 0 ? configuration2.videoWidth : d11, (i11 & 128) != 0 ? configuration2.videoNames : list);
    }

    public final VideoQuality component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isMinBitrateCheckEnabled;
    }

    public final Integer component3() {
        return this.videoBitrateInMbps;
    }

    public final boolean component4() {
        return this.disableAudio;
    }

    public final boolean component5() {
        return this.keepOriginalResolution;
    }

    public final Double component6() {
        return this.videoHeight;
    }

    public final Double component7() {
        return this.videoWidth;
    }

    public final List<String> component8() {
        return this.videoNames;
    }

    public final Configuration copy(VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List<String> list) {
        C6496s.h(videoQuality, "quality");
        List<String> list2 = list;
        C6496s.h(list2, "videoNames");
        return new Configuration(videoQuality, z10, num, z11, z12, d10, d11, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && C6496s.c(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && C6496s.c(this.videoHeight, configuration.videoHeight) && C6496s.c(this.videoWidth, configuration.videoWidth) && C6496s.c(this.videoNames, configuration.videoNames);
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    public final VideoQuality getQuality() {
        return this.quality;
    }

    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        int hashCode = ((this.quality.hashCode() * 31) + Boolean.hashCode(this.isMinBitrateCheckEnabled)) * 31;
        Integer num = this.videoBitrateInMbps;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.disableAudio)) * 31) + Boolean.hashCode(this.keepOriginalResolution)) * 31;
        Double d10 = this.videoHeight;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.videoWidth;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.videoNames.hashCode();
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setDisableAudio(boolean z10) {
        this.disableAudio = z10;
    }

    public final void setMinBitrateCheckEnabled(boolean z10) {
        this.isMinBitrateCheckEnabled = z10;
    }

    public final void setQuality(VideoQuality videoQuality) {
        C6496s.h(videoQuality, "<set-?>");
        this.quality = videoQuality;
    }

    public final void setVideoBitrateInMbps(Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final void setVideoHeight(Double d10) {
        this.videoHeight = d10;
    }

    public final void setVideoNames(List<String> list) {
        C6496s.h(list, "<set-?>");
        this.videoNames = list;
    }

    public final void setVideoWidth(Double d10) {
        this.videoWidth = d10;
    }

    public String toString() {
        return "Configuration(quality=" + this.quality + ", isMinBitrateCheckEnabled=" + this.isMinBitrateCheckEnabled + ", videoBitrateInMbps=" + this.videoBitrateInMbps + ", disableAudio=" + this.disableAudio + ", keepOriginalResolution=" + this.keepOriginalResolution + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoNames=" + this.videoNames + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? VideoQuality.MEDIUM : videoQuality, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : d11, list);
    }
}
