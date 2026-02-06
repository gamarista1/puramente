package io.intercom.android.sdk.m5.push;

import Sg.p;
import android.content.Context;
import android.os.Bundle;
import com.amazon.a.a.o.b;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.annotation.Annotation;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData;", "", "notificationId", "", "getNotificationId", "()I", "ConversationPushData", "DeepLinkPushData", "Companion", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IntercomPushData {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$Companion;", "", "<init>", "()V", "createFrom", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "isIntercomPush", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final IntercomPushData createFrom(Context context, Bundle bundle) {
            Context context2 = context;
            C6496s.h(context2, "context");
            C6496s.h(bundle, "bundle");
            SimplePushData access$getSimplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            if (!access$getSimplePushDataFromBundle.isIntercomPush()) {
                return null;
            }
            if (C6496s.c(access$getSimplePushDataFromBundle.getIntercomPushType(), "push_only")) {
                return new DeepLinkPushData(access$getSimplePushDataFromBundle.getContentTitle(context2), access$getSimplePushDataFromBundle.getContentText(), access$getSimplePushDataFromBundle.getUri(), access$getSimplePushDataFromBundle.getContentImageUrl(), access$getSimplePushDataFromBundle.getInstanceId());
            }
            String authorName = access$getSimplePushDataFromBundle.getAuthorName();
            String imageUrl = access$getSimplePushDataFromBundle.getImageUrl();
            String conversationId = access$getSimplePushDataFromBundle.getConversationId();
            boolean c10 = C6496s.c(access$getSimplePushDataFromBundle.getConversationPartType(), MetricTracker.Object.MESSAGE);
            ConversationPushData.MessageData messageData = access$getSimplePushDataFromBundle.getMessageData();
            if (messageData == null) {
                String contentText = access$getSimplePushDataFromBundle.getContentText();
                messageData = new ConversationPushData.MessageData.Text(p.g1(p.v0(contentText, access$getSimplePushDataFromBundle.getAuthorName() + ':')).toString());
            }
            return new ConversationPushData(authorName, imageUrl, conversationId, messageData, false, c10);
        }

        public final boolean isIntercomPush(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            return IntercomPushDataKt.getSimplePushDataFromBundle(bundle).isIntercomPush();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u0015H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "authorName", "", "avatarUrl", "conversationId", "messageData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "isCurrentUser", "", "isNewConversation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;ZZ)V", "getAuthorName", "()Ljava/lang/String;", "getAvatarUrl", "getConversationId", "getMessageData", "()Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "()Z", "notificationId", "", "getNotificationId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "MessageData", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationPushData implements IntercomPushData {
        public static final int $stable = 8;
        private final String authorName;
        private final String avatarUrl;
        private final String conversationId;
        private final boolean isCurrentUser;
        private final boolean isNewConversation;
        private final MessageData messageData;

        @C5985i
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "", "Text", "Image", "Attachment", "Companion", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface MessageData {
            public static final Companion Companion = Companion.$$INSTANCE;

            @C5985i
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getUrl", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Attachment implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                private final String title;
                private final String url;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final C5978b serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Attachment(int i10, String str, String str2, t0 t0Var) {
                    if (3 != (i10 & 3)) {
                        C6456i0.a(i10, 3, IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = attachment.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = attachment.url;
                    }
                    return attachment.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Attachment attachment, d dVar, f fVar) {
                    dVar.t(fVar, 0, attachment.title);
                    dVar.t(fVar, 1, attachment.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Attachment copy(String str, String str2) {
                    C6496s.h(str, b.f37461S);
                    C6496s.h(str2, "url");
                    return new Attachment(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Attachment)) {
                        return false;
                    }
                    Attachment attachment = (Attachment) obj;
                    return C6496s.c(this.title, attachment.title) && C6496s.c(this.url, attachment.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                public String toString() {
                    return "Attachment(title=" + this.title + ", url=" + this.url + ')';
                }

                public Attachment(String str, String str2) {
                    C6496s.h(str, b.f37461S);
                    C6496s.h(str2, "url");
                    this.title = str;
                    this.url = str2;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                private Companion() {
                }

                public final C5978b serializer() {
                    return new C5983g("io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData", O.b(MessageData.class), new Ff.d[]{O.b(Attachment.class), O.b(Image.class), O.b(Text.class)}, new C5978b[]{IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE}, new Annotation[0]);
                }
            }

            @C5985i
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getUrl", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Image implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                private final String title;
                private final String url;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final C5978b serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Image(int i10, String str, String str2, t0 t0Var) {
                    if (3 != (i10 & 3)) {
                        C6456i0.a(i10, 3, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = image.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = image.url;
                    }
                    return image.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Image image, d dVar, f fVar) {
                    dVar.t(fVar, 0, image.title);
                    dVar.t(fVar, 1, image.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Image copy(String str, String str2) {
                    C6496s.h(str, b.f37461S);
                    C6496s.h(str2, "url");
                    return new Image(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj;
                    return C6496s.c(this.title, image.title) && C6496s.c(this.url, image.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                public String toString() {
                    return "Image(title=" + this.title + ", url=" + this.url + ')';
                }

                public Image(String str, String str2) {
                    C6496s.h(str, b.f37461S);
                    C6496s.h(str2, "url");
                    this.title = str;
                    this.url = str2;
                }
            }

            @C5985i
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Text implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
                private final String message;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final C5978b serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Text(int i10, String str, t0 t0Var) {
                    if (1 != (i10 & 1)) {
                        C6456i0.a(i10, 1, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE.getDescriptor());
                    }
                    this.message = str;
                }

                public static /* synthetic */ Text copy$default(Text text, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = text.message;
                    }
                    return text.copy(str);
                }

                public final String component1() {
                    return this.message;
                }

                public final Text copy(String str) {
                    C6496s.h(str, MetricTracker.Object.MESSAGE);
                    return new Text(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && C6496s.c(this.message, ((Text) obj).message);
                }

                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return "Text(message=" + this.message + ')';
                }

                public Text(String str) {
                    C6496s.h(str, MetricTracker.Object.MESSAGE);
                    this.message = str;
                }
            }
        }

        public ConversationPushData(String str, String str2, String str3, MessageData messageData2, boolean z10, boolean z11) {
            C6496s.h(str, "authorName");
            C6496s.h(str2, "avatarUrl");
            C6496s.h(str3, "conversationId");
            C6496s.h(messageData2, "messageData");
            this.authorName = str;
            this.avatarUrl = str2;
            this.conversationId = str3;
            this.messageData = messageData2;
            this.isCurrentUser = z10;
            this.isNewConversation = z11;
        }

        public static /* synthetic */ ConversationPushData copy$default(ConversationPushData conversationPushData, String str, String str2, String str3, MessageData messageData2, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationPushData.authorName;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationPushData.avatarUrl;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = conversationPushData.conversationId;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                messageData2 = conversationPushData.messageData;
            }
            MessageData messageData3 = messageData2;
            if ((i10 & 16) != 0) {
                z10 = conversationPushData.isCurrentUser;
            }
            boolean z12 = z10;
            if ((i10 & 32) != 0) {
                z11 = conversationPushData.isNewConversation;
            }
            return conversationPushData.copy(str, str4, str5, messageData3, z12, z11);
        }

        public final String component1() {
            return this.authorName;
        }

        public final String component2() {
            return this.avatarUrl;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final MessageData component4() {
            return this.messageData;
        }

        public final boolean component5() {
            return this.isCurrentUser;
        }

        public final boolean component6() {
            return this.isNewConversation;
        }

        public final ConversationPushData copy(String str, String str2, String str3, MessageData messageData2, boolean z10, boolean z11) {
            C6496s.h(str, "authorName");
            C6496s.h(str2, "avatarUrl");
            C6496s.h(str3, "conversationId");
            C6496s.h(messageData2, "messageData");
            return new ConversationPushData(str, str2, str3, messageData2, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationPushData)) {
                return false;
            }
            ConversationPushData conversationPushData = (ConversationPushData) obj;
            return C6496s.c(this.authorName, conversationPushData.authorName) && C6496s.c(this.avatarUrl, conversationPushData.avatarUrl) && C6496s.c(this.conversationId, conversationPushData.conversationId) && C6496s.c(this.messageData, conversationPushData.messageData) && this.isCurrentUser == conversationPushData.isCurrentUser && this.isNewConversation == conversationPushData.isNewConversation;
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final MessageData getMessageData() {
            return this.messageData;
        }

        public int getNotificationId() {
            return this.conversationId.hashCode();
        }

        public int hashCode() {
            return (((((((((this.authorName.hashCode() * 31) + this.avatarUrl.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.messageData.hashCode()) * 31) + Boolean.hashCode(this.isCurrentUser)) * 31) + Boolean.hashCode(this.isNewConversation);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public final boolean isNewConversation() {
            return this.isNewConversation;
        }

        public String toString() {
            return "ConversationPushData(authorName=" + this.authorName + ", avatarUrl=" + this.avatarUrl + ", conversationId=" + this.conversationId + ", messageData=" + this.messageData + ", isCurrentUser=" + this.isCurrentUser + ", isNewConversation=" + this.isNewConversation + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u0011H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "contentTitle", "", "contentText", "uri", "contentImageUrl", "instanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentTitle", "()Ljava/lang/String;", "getContentText", "getUri", "getContentImageUrl", "getInstanceId", "notificationId", "", "getNotificationId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeepLinkPushData implements IntercomPushData {
        public static final int $stable = 0;
        private final String contentImageUrl;
        private final String contentText;
        private final String contentTitle;
        private final String instanceId;
        private final String uri;

        public DeepLinkPushData(String str, String str2, String str3, String str4, String str5) {
            C6496s.h(str, "contentTitle");
            C6496s.h(str2, "contentText");
            C6496s.h(str3, "uri");
            C6496s.h(str4, "contentImageUrl");
            C6496s.h(str5, "instanceId");
            this.contentTitle = str;
            this.contentText = str2;
            this.uri = str3;
            this.contentImageUrl = str4;
            this.instanceId = str5;
        }

        public static /* synthetic */ DeepLinkPushData copy$default(DeepLinkPushData deepLinkPushData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deepLinkPushData.contentTitle;
            }
            if ((i10 & 2) != 0) {
                str2 = deepLinkPushData.contentText;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                str3 = deepLinkPushData.uri;
            }
            String str7 = str3;
            if ((i10 & 8) != 0) {
                str4 = deepLinkPushData.contentImageUrl;
            }
            String str8 = str4;
            if ((i10 & 16) != 0) {
                str5 = deepLinkPushData.instanceId;
            }
            return deepLinkPushData.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.contentTitle;
        }

        public final String component2() {
            return this.contentText;
        }

        public final String component3() {
            return this.uri;
        }

        public final String component4() {
            return this.contentImageUrl;
        }

        public final String component5() {
            return this.instanceId;
        }

        public final DeepLinkPushData copy(String str, String str2, String str3, String str4, String str5) {
            C6496s.h(str, "contentTitle");
            C6496s.h(str2, "contentText");
            C6496s.h(str3, "uri");
            C6496s.h(str4, "contentImageUrl");
            C6496s.h(str5, "instanceId");
            return new DeepLinkPushData(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkPushData)) {
                return false;
            }
            DeepLinkPushData deepLinkPushData = (DeepLinkPushData) obj;
            return C6496s.c(this.contentTitle, deepLinkPushData.contentTitle) && C6496s.c(this.contentText, deepLinkPushData.contentText) && C6496s.c(this.uri, deepLinkPushData.uri) && C6496s.c(this.contentImageUrl, deepLinkPushData.contentImageUrl) && C6496s.c(this.instanceId, deepLinkPushData.instanceId);
        }

        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        public final String getContentText() {
            return this.contentText;
        }

        public final String getContentTitle() {
            return this.contentTitle;
        }

        public final String getInstanceId() {
            return this.instanceId;
        }

        public int getNotificationId() {
            return this.instanceId.hashCode();
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (((((((this.contentTitle.hashCode() * 31) + this.contentText.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.instanceId.hashCode();
        }

        public String toString() {
            return "DeepLinkPushData(contentTitle=" + this.contentTitle + ", contentText=" + this.contentText + ", uri=" + this.uri + ", contentImageUrl=" + this.contentImageUrl + ", instanceId=" + this.instanceId + ')';
        }
    }

    int getNotificationId();
}
