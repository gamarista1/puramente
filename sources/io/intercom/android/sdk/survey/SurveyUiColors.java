package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH×\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyUiColors;", "", "Lr0/x0;", "background", "onBackground", "button", "onButton", "dropDownSelectedColor", "<init>", "(JJJJLr0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getButtonBorder-0d7_KjU", "()J", "getButtonBorder", "component1-0d7_KjU", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-QN2ZGVo", "()Lr0/x0;", "component5", "copy-qa9m3tE", "(JJJJLr0/x0;)Lio/intercom/android/sdk/survey/SurveyUiColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getButton-0d7_KjU", "getOnButton-0d7_KjU", "Lr0/x0;", "getDropDownSelectedColor-QN2ZGVo", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyUiColors {
    public static final int $stable = 0;
    private final long background;
    private final long button;
    private final C2544x0 dropDownSelectedColor;
    private final long onBackground;
    private final long onButton;

    public /* synthetic */ SurveyUiColors(long j10, long j11, long j12, long j13, C2544x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, x0Var);
    }

    /* renamed from: copy-qa9m3tE$default  reason: not valid java name */
    public static /* synthetic */ SurveyUiColors m415copyqa9m3tE$default(SurveyUiColors surveyUiColors, long j10, long j11, long j12, long j13, C2544x0 x0Var, int i10, Object obj) {
        long j14;
        long j15;
        long j16;
        long j17;
        C2544x0 x0Var2;
        SurveyUiColors surveyUiColors2 = surveyUiColors;
        if ((i10 & 1) != 0) {
            j14 = surveyUiColors2.background;
        } else {
            j14 = j10;
        }
        if ((i10 & 2) != 0) {
            j15 = surveyUiColors2.onBackground;
        } else {
            j15 = j11;
        }
        if ((i10 & 4) != 0) {
            j16 = surveyUiColors2.button;
        } else {
            j16 = j12;
        }
        if ((i10 & 8) != 0) {
            j17 = surveyUiColors2.onButton;
        } else {
            j17 = j13;
        }
        if ((i10 & 16) != 0) {
            x0Var2 = surveyUiColors2.dropDownSelectedColor;
        } else {
            x0Var2 = x0Var;
        }
        return surveyUiColors.m421copyqa9m3tE(j14, j15, j16, j17, x0Var2);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m416component10d7_KjU() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m417component20d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m418component30d7_KjU() {
        return this.button;
    }

    /* renamed from: component4-0d7_KjU  reason: not valid java name */
    public final long m419component40d7_KjU() {
        return this.onButton;
    }

    /* renamed from: component5-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m420component5QN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* renamed from: copy-qa9m3tE  reason: not valid java name */
    public final SurveyUiColors m421copyqa9m3tE(long j10, long j11, long j12, long j13, C2544x0 x0Var) {
        return new SurveyUiColors(j10, j11, j12, j13, x0Var, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyUiColors)) {
            return false;
        }
        SurveyUiColors surveyUiColors = (SurveyUiColors) obj;
        return C2544x0.q(this.background, surveyUiColors.background) && C2544x0.q(this.onBackground, surveyUiColors.onBackground) && C2544x0.q(this.button, surveyUiColors.button) && C2544x0.q(this.onButton, surveyUiColors.onButton) && C6496s.c(this.dropDownSelectedColor, surveyUiColors.dropDownSelectedColor);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m422getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getButton-0d7_KjU  reason: not valid java name */
    public final long m423getButton0d7_KjU() {
        return this.button;
    }

    /* renamed from: getButtonBorder-0d7_KjU  reason: not valid java name */
    public final long m424getButtonBorder0d7_KjU() {
        if (ColorExtensionsKt.m718isDarkColor8_81llA(this.button)) {
            return ColorExtensionsKt.m721lighten8_81llA(this.button);
        }
        return ColorExtensionsKt.m711darken8_81llA(this.button);
    }

    /* renamed from: getDropDownSelectedColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m425getDropDownSelectedColorQN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m426getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getOnButton-0d7_KjU  reason: not valid java name */
    public final long m427getOnButton0d7_KjU() {
        return this.onButton;
    }

    public int hashCode() {
        int w10 = ((((((C2544x0.w(this.background) * 31) + C2544x0.w(this.onBackground)) * 31) + C2544x0.w(this.button)) * 31) + C2544x0.w(this.onButton)) * 31;
        C2544x0 x0Var = this.dropDownSelectedColor;
        return w10 + (x0Var == null ? 0 : C2544x0.w(x0Var.y()));
    }

    public String toString() {
        return "SurveyUiColors(background=" + C2544x0.x(this.background) + ", onBackground=" + C2544x0.x(this.onBackground) + ", button=" + C2544x0.x(this.button) + ", onButton=" + C2544x0.x(this.onButton) + ", dropDownSelectedColor=" + this.dropDownSelectedColor + ')';
    }

    private SurveyUiColors(long j10, long j11, long j12, long j13, C2544x0 x0Var) {
        this.background = j10;
        this.onBackground = j11;
        this.button = j12;
        this.onButton = j13;
        this.dropDownSelectedColor = x0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveyUiColors(long j10, long j11, long j12, long j13, C2544x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, (i10 & 16) != 0 ? null : x0Var, (DefaultConstructorMarker) null);
    }
}
