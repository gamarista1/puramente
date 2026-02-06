package io.intercom.android.sdk.m5.push;

import Sg.p;
import android.content.Context;
import com.amazon.a.a.o.b;
import com.intercom.twig.Twig;
import hh.C5998a;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lh.C6538b;
import lh.e;
import lh.o;
import mf.C6565s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0014J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0014J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0014J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0014J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0014J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0014J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u0014J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0014J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010I\u001a\n H*\u0004\u0018\u00010G0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lio/intercom/android/sdk/m5/push/SimplePushData;", "", "", "intercomPushType", "conversationId", "title", "message", "body", "receiver", "authorName", "appName", "contentImageUrl", "imageUrl", "uri", "instanceId", "conversationPartType", "messageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentText", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "getContentTitle", "(Landroid/content/Context;)Ljava/lang/String;", "", "isIntercomPush", "()Z", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "getMessageData", "()Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/push/SimplePushData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIntercomPushType", "getConversationId", "getTitle", "getMessage", "getBody", "getReceiver", "getAuthorName", "getAppName", "getContentImageUrl", "getImageUrl", "getUri", "getInstanceId", "getConversationPartType", "Llh/b;", "json", "Llh/b;", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SimplePushData {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String contentImageUrl;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final C6538b json = o.b((C6538b) null, new d(), 1, (Object) null);
    private final String message;
    private final String messageData;
    private final String receiver;
    private final String title;
    private final Twig twig = LumberMill.getLogger();
    private final String uri;

    public SimplePushData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        C6496s.h(str, "intercomPushType");
        C6496s.h(str2, "conversationId");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, MetricTracker.Object.MESSAGE);
        C6496s.h(str5, "body");
        C6496s.h(str6, "receiver");
        C6496s.h(str7, "authorName");
        C6496s.h(str8, "appName");
        C6496s.h(str9, "contentImageUrl");
        C6496s.h(str10, "imageUrl");
        C6496s.h(str11, "uri");
        C6496s.h(str12, "instanceId");
        C6496s.h(str13, "conversationPartType");
        C6496s.h(str14, "messageData");
        this.intercomPushType = str;
        this.conversationId = str2;
        this.title = str3;
        this.message = str4;
        this.body = str5;
        this.receiver = str6;
        this.authorName = str7;
        this.appName = str8;
        this.contentImageUrl = str9;
        this.imageUrl = str10;
        this.uri = str11;
        this.instanceId = str12;
        this.conversationPartType = str13;
        this.messageData = str14;
    }

    public static /* synthetic */ SimplePushData copy$default(SimplePushData simplePushData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, Object obj) {
        SimplePushData simplePushData2 = simplePushData;
        int i11 = i10;
        return simplePushData.copy((i11 & 1) != 0 ? simplePushData2.intercomPushType : str, (i11 & 2) != 0 ? simplePushData2.conversationId : str2, (i11 & 4) != 0 ? simplePushData2.title : str3, (i11 & 8) != 0 ? simplePushData2.message : str4, (i11 & 16) != 0 ? simplePushData2.body : str5, (i11 & 32) != 0 ? simplePushData2.receiver : str6, (i11 & 64) != 0 ? simplePushData2.authorName : str7, (i11 & 128) != 0 ? simplePushData2.appName : str8, (i11 & 256) != 0 ? simplePushData2.contentImageUrl : str9, (i11 & 512) != 0 ? simplePushData2.imageUrl : str10, (i11 & 1024) != 0 ? simplePushData2.uri : str11, (i11 & 2048) != 0 ? simplePushData2.instanceId : str12, (i11 & 4096) != 0 ? simplePushData2.conversationPartType : str13, (i11 & 8192) != 0 ? simplePushData2.messageData : str14);
    }

    /* access modifiers changed from: private */
    public static final C6514M json$lambda$0(e eVar) {
        C6496s.h(eVar, "$this$Json");
        eVar.f(true);
        return C6514M.f71813a;
    }

    public final String component1() {
        return this.intercomPushType;
    }

    public final String component10() {
        return this.imageUrl;
    }

    public final String component11() {
        return this.uri;
    }

    public final String component12() {
        return this.instanceId;
    }

    public final String component13() {
        return this.conversationPartType;
    }

    public final String component14() {
        return this.messageData;
    }

    public final String component2() {
        return this.conversationId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.receiver;
    }

    public final String component7() {
        return this.authorName;
    }

    public final String component8() {
        return this.appName;
    }

    public final String component9() {
        return this.contentImageUrl;
    }

    public final SimplePushData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String str15 = str;
        C6496s.h(str15, "intercomPushType");
        String str16 = str2;
        C6496s.h(str16, "conversationId");
        String str17 = str3;
        C6496s.h(str17, b.f37461S);
        String str18 = str4;
        C6496s.h(str18, MetricTracker.Object.MESSAGE);
        String str19 = str5;
        C6496s.h(str19, "body");
        String str20 = str6;
        C6496s.h(str20, "receiver");
        String str21 = str7;
        C6496s.h(str21, "authorName");
        String str22 = str8;
        C6496s.h(str22, "appName");
        String str23 = str9;
        C6496s.h(str23, "contentImageUrl");
        String str24 = str10;
        C6496s.h(str24, "imageUrl");
        String str25 = str11;
        C6496s.h(str25, "uri");
        String str26 = str12;
        C6496s.h(str26, "instanceId");
        String str27 = str13;
        C6496s.h(str27, "conversationPartType");
        String str28 = str14;
        C6496s.h(str28, "messageData");
        return new SimplePushData(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) obj;
        return C6496s.c(this.intercomPushType, simplePushData.intercomPushType) && C6496s.c(this.conversationId, simplePushData.conversationId) && C6496s.c(this.title, simplePushData.title) && C6496s.c(this.message, simplePushData.message) && C6496s.c(this.body, simplePushData.body) && C6496s.c(this.receiver, simplePushData.receiver) && C6496s.c(this.authorName, simplePushData.authorName) && C6496s.c(this.appName, simplePushData.appName) && C6496s.c(this.contentImageUrl, simplePushData.contentImageUrl) && C6496s.c(this.imageUrl, simplePushData.imageUrl) && C6496s.c(this.uri, simplePushData.uri) && C6496s.c(this.instanceId, simplePushData.instanceId) && C6496s.c(this.conversationPartType, simplePushData.conversationPartType) && C6496s.c(this.messageData, simplePushData.messageData);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getContentText() {
        String str = this.message;
        if (p.d0(str)) {
            return this.body;
        }
        return str;
    }

    public final String getContentTitle(Context context) {
        C6496s.h(context, "context");
        if (!p.d0(this.title)) {
            return this.title;
        }
        if (!p.d0(this.authorName) && !p.d0(this.appName)) {
            return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, C6565s.q(C6502A.a("name", this.authorName), C6502A.a("company", this.appName)));
        }
        if (!p.d0(this.authorName)) {
            return this.authorName;
        }
        return this.appName;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    public final String getMessage() {
        return this.message;
    }

    /* renamed from: getMessageData  reason: collision with other method in class */
    public final String m406getMessageData() {
        return this.messageData;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.intercomPushType.hashCode() * 31) + this.conversationId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.body.hashCode()) * 31) + this.receiver.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.instanceId.hashCode()) * 31) + this.conversationPartType.hashCode()) * 31) + this.messageData.hashCode();
    }

    public final boolean isIntercomPush() {
        if (p.d0(this.intercomPushType) || !C6496s.c(Intercom.PUSH_RECEIVER, this.receiver)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "SimplePushData(intercomPushType=" + this.intercomPushType + ", conversationId=" + this.conversationId + ", title=" + this.title + ", message=" + this.message + ", body=" + this.body + ", receiver=" + this.receiver + ", authorName=" + this.authorName + ", appName=" + this.appName + ", contentImageUrl=" + this.contentImageUrl + ", imageUrl=" + this.imageUrl + ", uri=" + this.uri + ", instanceId=" + this.instanceId + ", conversationPartType=" + this.conversationPartType + ", messageData=" + this.messageData + ')';
    }

    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!p.d0(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (!p.d0(this.messageData)) {
            try {
                C6538b bVar = this.json;
                String str = this.messageData;
                bVar.a();
                return (IntercomPushData.ConversationPushData.MessageData) bVar.b(C5998a.u(IntercomPushData.ConversationPushData.MessageData.Companion.serializer()), str);
            } catch (IllegalArgumentException e10) {
                this.twig.e(e10);
            }
        }
        return null;
    }
}
