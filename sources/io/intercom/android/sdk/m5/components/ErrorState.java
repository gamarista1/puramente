package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState;", "", "<init>", "()V", "iconId", "", "getIconId", "()I", "messageResId", "getMessageResId", "additionalMessageResId", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "WithCTA", "WithoutCTA", "Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ErrorState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "iconId", "", "messageResId", "additionalMessageResId", "<init>", "(IILjava/lang/Integer;)V", "getIconId", "()I", "getMessageResId", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithoutCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public WithoutCTA() {
            this(0, 0, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int i10, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = withoutCTA.iconId;
            }
            if ((i12 & 2) != 0) {
                i11 = withoutCTA.messageResId;
            }
            if ((i12 & 4) != 0) {
                num = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(i10, i11, num);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final WithoutCTA copy(int i10, int i11, Integer num) {
            return new WithoutCTA(i10, i11, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithoutCTA)) {
                return false;
            }
            WithoutCTA withoutCTA = (WithoutCTA) obj;
            return this.iconId == withoutCTA.iconId && this.messageResId == withoutCTA.messageResId && C6496s.c(this.additionalMessageResId, withoutCTA.additionalMessageResId);
        }

        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public int getIconId() {
            return this.iconId;
        }

        public int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "WithoutCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithoutCTA(int i10, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i12 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i12 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num);
        }

        public WithoutCTA(int i10, int i11, Integer num) {
            super((DefaultConstructorMarker) null);
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
        }
    }

    public /* synthetic */ ErrorState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    private ErrorState() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "", "iconId", "messageResId", "additionalMessageResId", "ctaResId", "Lkotlin/Function0;", "Llf/M;", "onCtaClick", "<init>", "(IILjava/lang/Integer;ILyf/a;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lyf/a;", "copy", "(IILjava/lang/Integer;ILyf/a;)Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconId", "getMessageResId", "Ljava/lang/Integer;", "getAdditionalMessageResId", "getCtaResId", "Lyf/a;", "getOnCtaClick", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;
        private final C6787a onCtaClick;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithCTA(int i10, int i11, Integer num, int i12, C6787a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i13 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i13 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num, (i13 & 8) != 0 ? R.string.intercom_reload : i12, aVar);
        }

        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int i10, int i11, Integer num, int i12, C6787a aVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = withCTA.iconId;
            }
            if ((i13 & 2) != 0) {
                i11 = withCTA.messageResId;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                num = withCTA.additionalMessageResId;
            }
            Integer num2 = num;
            if ((i13 & 8) != 0) {
                i12 = withCTA.ctaResId;
            }
            int i15 = i12;
            if ((i13 & 16) != 0) {
                aVar = withCTA.onCtaClick;
            }
            return withCTA.copy(i10, i14, num2, i15, aVar);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final int component4() {
            return this.ctaResId;
        }

        public final C6787a component5() {
            return this.onCtaClick;
        }

        public final WithCTA copy(int i10, int i11, Integer num, int i12, C6787a aVar) {
            C6496s.h(aVar, "onCtaClick");
            return new WithCTA(i10, i11, num, i12, aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithCTA)) {
                return false;
            }
            WithCTA withCTA = (WithCTA) obj;
            return this.iconId == withCTA.iconId && this.messageResId == withCTA.messageResId && C6496s.c(this.additionalMessageResId, withCTA.additionalMessageResId) && this.ctaResId == withCTA.ctaResId && C6496s.c(this.onCtaClick, withCTA.onCtaClick);
        }

        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        public int getIconId() {
            return this.iconId;
        }

        public int getMessageResId() {
            return this.messageResId;
        }

        public final C6787a getOnCtaClick() {
            return this.onCtaClick;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.ctaResId)) * 31) + this.onCtaClick.hashCode();
        }

        public String toString() {
            return "WithCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ", ctaResId=" + this.ctaResId + ", onCtaClick=" + this.onCtaClick + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithCTA(int i10, int i11, Integer num, int i12, C6787a aVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(aVar, "onCtaClick");
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
            this.ctaResId = i12;
            this.onCtaClick = aVar;
        }
    }
}
