package io.intercom.android.sdk.m5.navigation;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "route", "", "getRoute", "()Ljava/lang/String;", "HomeScreenArgs", "MessagesScreenArgs", "TicketsScreenArgs", "TicketDetailsScreenArgs", "ConversationScreenArgs", "HelpCenterCollectionsArgs", "HelpCenterCollectionArgs", "NoContent", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$ConversationScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionsArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HomeScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$MessagesScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$NoContent;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketDetailsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketsScreenArgs;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ParcelCreator"})
public abstract class IntercomRootActivityArgs implements Parcelable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000eJ\u0010\u0010#\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$H×\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b\u0006\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001fR\u0014\u00100\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000e¨\u00061"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$ConversationScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "", "conversationId", "initialMessage", "", "isLaunchedProgrammatically", "articleId", "articleTitle", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "transitionArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)V", "component2", "()Ljava/lang/String;", "getEncodedInitialMessage", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component3", "()Z", "component4", "component5", "component6", "()Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$ConversationScreenArgs;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "Z", "getArticleId", "getArticleTitle", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "getTransitionArgs", "getRoute", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ConversationScreenArgs> CREATOR = new Creator();
        private final String articleId;
        private final String articleTitle;
        private final String conversationId;
        private final String initialMessage;
        private final boolean isLaunchedProgrammatically;
        private final TransitionArgs transitionArgs;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConversationScreenArgs> {
            public final ConversationScreenArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new ConversationScreenArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TransitionArgs.CREATOR.createFromParcel(parcel));
            }

            public final ConversationScreenArgs[] newArray(int i10) {
                return new ConversationScreenArgs[i10];
            }
        }

        public ConversationScreenArgs() {
            this((String) null, (String) null, false, (String) null, (String) null, (TransitionArgs) null, 63, (DefaultConstructorMarker) null);
        }

        private final String component2() {
            return this.initialMessage;
        }

        public static /* synthetic */ ConversationScreenArgs copy$default(ConversationScreenArgs conversationScreenArgs, String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationScreenArgs.conversationId;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationScreenArgs.initialMessage;
            }
            String str5 = str2;
            if ((i10 & 4) != 0) {
                z10 = conversationScreenArgs.isLaunchedProgrammatically;
            }
            boolean z11 = z10;
            if ((i10 & 8) != 0) {
                str3 = conversationScreenArgs.articleId;
            }
            String str6 = str3;
            if ((i10 & 16) != 0) {
                str4 = conversationScreenArgs.articleTitle;
            }
            String str7 = str4;
            if ((i10 & 32) != 0) {
                transitionArgs2 = conversationScreenArgs.transitionArgs;
            }
            return conversationScreenArgs.copy(str, str5, z11, str6, str7, transitionArgs2);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final boolean component3() {
            return this.isLaunchedProgrammatically;
        }

        public final String component4() {
            return this.articleId;
        }

        public final String component5() {
            return this.articleTitle;
        }

        public final TransitionArgs component6() {
            return this.transitionArgs;
        }

        public final ConversationScreenArgs copy(String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs2) {
            C6496s.h(str2, "initialMessage");
            C6496s.h(transitionArgs2, "transitionArgs");
            return new ConversationScreenArgs(str, str2, z10, str3, str4, transitionArgs2);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationScreenArgs)) {
                return false;
            }
            ConversationScreenArgs conversationScreenArgs = (ConversationScreenArgs) obj;
            return C6496s.c(this.conversationId, conversationScreenArgs.conversationId) && C6496s.c(this.initialMessage, conversationScreenArgs.initialMessage) && this.isLaunchedProgrammatically == conversationScreenArgs.isLaunchedProgrammatically && C6496s.c(this.articleId, conversationScreenArgs.articleId) && C6496s.c(this.articleTitle, conversationScreenArgs.articleTitle) && C6496s.c(this.transitionArgs, conversationScreenArgs.transitionArgs);
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getArticleTitle() {
            return this.articleTitle;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getEncodedInitialMessage() {
            String encode = Uri.encode(this.initialMessage);
            C6496s.g(encode, "encode(...)");
            return encode;
        }

        public String getRoute() {
            return "CONVERSATION?conversationId=" + this.conversationId + "&initialMessage=" + getEncodedInitialMessage() + "&articleId=" + this.articleId + "&articleTitle=" + this.articleTitle + "&isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + "&transitionArgs=" + this.transitionArgs;
        }

        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public int hashCode() {
            String str = this.conversationId;
            int i10 = 0;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.initialMessage.hashCode()) * 31) + Boolean.hashCode(this.isLaunchedProgrammatically)) * 31;
            String str2 = this.articleId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.articleTitle;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.transitionArgs.hashCode();
        }

        public final boolean isLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        public String toString() {
            return "ConversationScreenArgs(conversationId=" + this.conversationId + ", initialMessage=" + this.initialMessage + ", isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + ", articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ", transitionArgs=" + this.transitionArgs + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.conversationId);
            parcel.writeString(this.initialMessage);
            parcel.writeInt(this.isLaunchedProgrammatically ? 1 : 0);
            parcel.writeString(this.articleId);
            parcel.writeString(this.articleTitle);
            this.transitionArgs.writeToParcel(parcel, i10);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ConversationScreenArgs(java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, java.lang.String r17, io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
            /*
                r12 = this;
                r0 = r19 & 1
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r13
            L_0x0008:
                r2 = r19 & 2
                if (r2 == 0) goto L_0x000f
                java.lang.String r2 = ""
                goto L_0x0010
            L_0x000f:
                r2 = r14
            L_0x0010:
                r3 = r19 & 4
                if (r3 == 0) goto L_0x0016
                r3 = 0
                goto L_0x0017
            L_0x0016:
                r3 = r15
            L_0x0017:
                r4 = r19 & 8
                if (r4 == 0) goto L_0x001d
                r4 = r1
                goto L_0x001f
            L_0x001d:
                r4 = r16
            L_0x001f:
                r5 = r19 & 16
                if (r5 == 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r1 = r17
            L_0x0026:
                r5 = r19 & 32
                if (r5 == 0) goto L_0x0042
                io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs r5 = new io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs
                r6 = 15
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = r5
                r14 = r8
                r15 = r9
                r16 = r10
                r17 = r11
                r18 = r6
                r19 = r7
                r13.<init>(r14, r15, r16, r17, r18, r19)
                goto L_0x0044
            L_0x0042:
                r5 = r18
            L_0x0044:
                r13 = r12
                r14 = r0
                r15 = r2
                r16 = r3
                r17 = r4
                r18 = r1
                r19 = r5
                r13.<init>(r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs.ConversationScreenArgs.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConversationScreenArgs(String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str2, "initialMessage");
            C6496s.h(transitionArgs2, "transitionArgs");
            this.conversationId = str;
            this.initialMessage = str2;
            this.isLaunchedProgrammatically = z10;
            this.articleId = str3;
            this.articleTitle = str4;
            this.transitionArgs = transitionArgs2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "", "collectionId", "metricPlace", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionArgs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollectionId", "getMetricPlace", "getRoute", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HelpCenterCollectionArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpCenterCollectionArgs> CREATOR = new Creator();
        private final String collectionId;
        private final String metricPlace;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionArgs> {
            public final HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new HelpCenterCollectionArgs(parcel.readString(), parcel.readString());
            }

            public final HelpCenterCollectionArgs[] newArray(int i10) {
                return new HelpCenterCollectionArgs[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionArgs(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "collectionId");
            C6496s.h(str2, "metricPlace");
            this.collectionId = str;
            this.metricPlace = str2;
        }

        public static /* synthetic */ HelpCenterCollectionArgs copy$default(HelpCenterCollectionArgs helpCenterCollectionArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpCenterCollectionArgs.collectionId;
            }
            if ((i10 & 2) != 0) {
                str2 = helpCenterCollectionArgs.metricPlace;
            }
            return helpCenterCollectionArgs.copy(str, str2);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionArgs copy(String str, String str2) {
            C6496s.h(str, "collectionId");
            C6496s.h(str2, "metricPlace");
            return new HelpCenterCollectionArgs(str, str2);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionArgs)) {
                return false;
            }
            HelpCenterCollectionArgs helpCenterCollectionArgs = (HelpCenterCollectionArgs) obj;
            return C6496s.c(this.collectionId, helpCenterCollectionArgs.collectionId) && C6496s.c(this.metricPlace, helpCenterCollectionArgs.metricPlace);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return (this.collectionId.hashCode() * 31) + this.metricPlace.hashCode();
        }

        public String toString() {
            return "HelpCenterCollectionArgs(collectionId=" + this.collectionId + ", metricPlace=" + this.metricPlace + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.collectionId);
            parcel.writeString(this.metricPlace);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HomeScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getRoute", "()Ljava/lang/String;", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HomeScreenArgs> CREATOR = new Creator();
        public static final HomeScreenArgs INSTANCE = new HomeScreenArgs();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HomeScreenArgs> {
            public final HomeScreenArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return HomeScreenArgs.INSTANCE;
            }

            public final HomeScreenArgs[] newArray(int i10) {
                return new HomeScreenArgs[i10];
            }
        }

        private HomeScreenArgs() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public String getRoute() {
            return "HOME";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$MessagesScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getRoute", "()Ljava/lang/String;", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MessagesScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MessagesScreenArgs> CREATOR = new Creator();
        public static final MessagesScreenArgs INSTANCE = new MessagesScreenArgs();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MessagesScreenArgs> {
            public final MessagesScreenArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return MessagesScreenArgs.INSTANCE;
            }

            public final MessagesScreenArgs[] newArray(int i10) {
                return new MessagesScreenArgs[i10];
            }
        }

        private MessagesScreenArgs() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public String getRoute() {
            return "MESSAGES";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$NoContent;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getRoute", "()Ljava/lang/String;", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoContent extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();
        public static final NoContent INSTANCE = new NoContent();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoContent> {
            public final NoContent createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return NoContent.INSTANCE;
            }

            public final NoContent[] newArray(int i10) {
                return new NoContent[i10];
            }
        }

        private NoContent() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public String getRoute() {
            return "";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketDetailsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "", "ticketId", "from", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketDetailsScreenArgs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTicketId", "getFrom", "getRoute", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketDetailsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TicketDetailsScreenArgs> CREATOR = new Creator();
        private final String from;
        private final String ticketId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TicketDetailsScreenArgs> {
            public final TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new TicketDetailsScreenArgs(parcel.readString(), parcel.readString());
            }

            public final TicketDetailsScreenArgs[] newArray(int i10) {
                return new TicketDetailsScreenArgs[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TicketDetailsScreenArgs(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "ticketId");
            C6496s.h(str2, TicketDetailDestinationKt.LAUNCHED_FROM);
            this.ticketId = str;
            this.from = str2;
        }

        public static /* synthetic */ TicketDetailsScreenArgs copy$default(TicketDetailsScreenArgs ticketDetailsScreenArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketDetailsScreenArgs.ticketId;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketDetailsScreenArgs.from;
            }
            return ticketDetailsScreenArgs.copy(str, str2);
        }

        public final String component1() {
            return this.ticketId;
        }

        public final String component2() {
            return this.from;
        }

        public final TicketDetailsScreenArgs copy(String str, String str2) {
            C6496s.h(str, "ticketId");
            C6496s.h(str2, TicketDetailDestinationKt.LAUNCHED_FROM);
            return new TicketDetailsScreenArgs(str, str2);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailsScreenArgs)) {
                return false;
            }
            TicketDetailsScreenArgs ticketDetailsScreenArgs = (TicketDetailsScreenArgs) obj;
            return C6496s.c(this.ticketId, ticketDetailsScreenArgs.ticketId) && C6496s.c(this.from, ticketDetailsScreenArgs.from);
        }

        public final String getFrom() {
            return this.from;
        }

        public String getRoute() {
            return "TICKET_DETAIL/" + this.ticketId + "?from=" + this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return (this.ticketId.hashCode() * 31) + this.from.hashCode();
        }

        public String toString() {
            return "TicketDetailsScreenArgs(ticketId=" + this.ticketId + ", from=" + this.from + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.ticketId);
            parcel.writeString(this.from);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getRoute", "()Ljava/lang/String;", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TicketsScreenArgs> CREATOR = new Creator();
        public static final TicketsScreenArgs INSTANCE = new TicketsScreenArgs();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TicketsScreenArgs> {
            public final TicketsScreenArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                parcel.readInt();
                return TicketsScreenArgs.INSTANCE;
            }

            public final TicketsScreenArgs[] newArray(int i10) {
                return new TicketsScreenArgs[i10];
            }
        }

        private TicketsScreenArgs() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public String getRoute() {
            return "TICKETS";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ IntercomRootActivityArgs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getRoute();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R\u0014\u0010#\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionsArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "", "", "collectionIds", "metricPlace", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionsArgs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCollectionIds", "Ljava/lang/String;", "getMetricPlace", "getRoute", "route", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HelpCenterCollectionsArgs extends IntercomRootActivityArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HelpCenterCollectionsArgs> CREATOR = new Creator();
        private final List<String> collectionIds;
        private final String metricPlace;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionsArgs> {
            public final HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new HelpCenterCollectionsArgs(parcel.createStringArrayList(), parcel.readString());
            }

            public final HelpCenterCollectionsArgs[] newArray(int i10) {
                return new HelpCenterCollectionsArgs[i10];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HelpCenterCollectionsArgs(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C6565s.n() : list, str);
        }

        public static /* synthetic */ HelpCenterCollectionsArgs copy$default(HelpCenterCollectionsArgs helpCenterCollectionsArgs, List<String> list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollectionsArgs.collectionIds;
            }
            if ((i10 & 2) != 0) {
                str = helpCenterCollectionsArgs.metricPlace;
            }
            return helpCenterCollectionsArgs.copy(list, str);
        }

        public final List<String> component1() {
            return this.collectionIds;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionsArgs copy(List<String> list, String str) {
            C6496s.h(list, "collectionIds");
            C6496s.h(str, "metricPlace");
            return new HelpCenterCollectionsArgs(list, str);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionsArgs)) {
                return false;
            }
            HelpCenterCollectionsArgs helpCenterCollectionsArgs = (HelpCenterCollectionsArgs) obj;
            return C6496s.c(this.collectionIds, helpCenterCollectionsArgs.collectionIds) && C6496s.c(this.metricPlace, helpCenterCollectionsArgs.metricPlace);
        }

        public final List<String> getCollectionIds() {
            return this.collectionIds;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return (this.collectionIds.hashCode() * 31) + this.metricPlace.hashCode();
        }

        public String toString() {
            return "HelpCenterCollectionsArgs(collectionIds=" + this.collectionIds + ", metricPlace=" + this.metricPlace + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeStringList(this.collectionIds);
            parcel.writeString(this.metricPlace);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionsArgs(List<String> list, String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "collectionIds");
            C6496s.h(str, "metricPlace");
            this.collectionIds = list;
            this.metricPlace = str;
        }
    }

    private IntercomRootActivityArgs() {
    }
}
