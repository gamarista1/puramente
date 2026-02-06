package io.intercom.android.sdk.m5.conversation.data;

import Xg.C5694f;
import Xg.C5696h;
import com.google.gson.e;
import com.google.gson.n;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Avatar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONArray;
import org.json.JSONObject;
import qf.C6658d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000e\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/nexus/NexusClient;", "nexusClient", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "nexusEventAsFlow", "(Lio/intercom/android/nexus/NexusClient;)LXg/f;", "Lio/intercom/android/nexus/NexusEvent;", "asNexusData", "(Lio/intercom/android/nexus/NexusEvent;)Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "Lio/intercom/android/nexus/EventData;", "", "key", "", "default", "safeGetOrDefault", "(Lio/intercom/android/nexus/EventData;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NexusEventAsFlowKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                io.intercom.android.nexus.NexusEventType[] r0 = io.intercom.android.nexus.NexusEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.AdminIsTyping     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.UserContentSeenByAdmin     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.NewComment     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.ConversationPartToken     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final ParsedNexusEvent asNexusData(NexusEvent nexusEvent) {
        int i10;
        List a10;
        NexusEventType eventType = nexusEvent.getEventType();
        if (eventType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        }
        if (i10 == 1) {
            String optString = nexusEvent.getEventData().optString("conversationId");
            C6496s.g(optString, "optString(...)");
            String optString2 = nexusEvent.getEventData().optString("createdByUserId");
            C6496s.g(optString2, "optString(...)");
            Avatar.Builder withImageUrl = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar"));
            AvatarShape.Companion companion = AvatarShape.Companion;
            String optString3 = nexusEvent.getEventData().optString("avatarShape");
            C6496s.g(optString3, "optString(...)");
            Avatar build = withImageUrl.withShape(companion.fromName(optString3)).build();
            C6496s.g(build, "build(...)");
            EventData eventData = nexusEvent.getEventData();
            C6496s.g(eventData, "getEventData(...)");
            Object safeGetOrDefault = safeGetOrDefault(eventData, "isBot", Boolean.FALSE);
            C6496s.f(safeGetOrDefault, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) safeGetOrDefault).booleanValue();
            EventData eventData2 = nexusEvent.getEventData();
            C6496s.g(eventData2, "getEventData(...)");
            Object safeGetOrDefault2 = safeGetOrDefault(eventData2, "showAvatar", Boolean.TRUE);
            C6496s.f(safeGetOrDefault2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) safeGetOrDefault2).booleanValue();
            String optString4 = nexusEvent.getEventData().optString("clientId");
            C6496s.g(optString4, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping(optString, optString2, build, booleanValue, booleanValue2, optString4);
        } else if (i10 == 2) {
            String optString5 = nexusEvent.getEventData().optString("conversationId");
            C6496s.g(optString5, "optString(...)");
            String optString6 = nexusEvent.getEventData().optString("createdByUserId");
            C6496s.g(optString6, "optString(...)");
            Avatar build2 = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar")).build();
            C6496s.g(build2, "build(...)");
            EventData eventData3 = nexusEvent.getEventData();
            C6496s.g(eventData3, "getEventData(...)");
            Object safeGetOrDefault3 = safeGetOrDefault(eventData3, "isBot", Boolean.FALSE);
            C6496s.f(safeGetOrDefault3, "null cannot be cast to non-null type kotlin.Boolean");
            return new ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin(optString5, optString6, build2, ((Boolean) safeGetOrDefault3).booleanValue());
        } else if (i10 == 3) {
            String optString7 = nexusEvent.getEventData().optString("conversationId");
            C6496s.g(optString7, "optString(...)");
            String optString8 = nexusEvent.getEventData().optString("createdByUserId");
            C6496s.g(optString8, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.NewComment(optString7, optString8, nexusEvent.getEventData().optString("ticketId"));
        } else if (i10 != 4) {
            return ParsedNexusEvent.UnSupportedEvent.INSTANCE;
        } else {
            Object obj = nexusEvent.getEventData().get("blocks");
            C6496s.f(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray = (JSONArray) obj;
            try {
                String jSONArray2 = jSONArray.toString();
                C6496s.g(jSONArray2, "toString(...)");
                Type type = new NexusEventAsFlowKt$asNexusData$blocks$type$1().getType();
                C6496s.g(type, "getType(...)");
                ArrayList<Block.Builder> arrayList = (ArrayList) new e().n(jSONArray2, type);
                C6496s.e(arrayList);
                a10 = new ArrayList(C6565s.y(arrayList, 10));
                for (Block.Builder build3 : arrayList) {
                    a10.add(build3.build());
                }
            } catch (n unused) {
                List c10 = C6565s.c();
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj2 = jSONArray.get(i11);
                    C6496s.f(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj2;
                    Block build4 = new Block.Builder().withType(jSONObject.optString("type")).withText(jSONObject.optString(AttributeType.TEXT)).build();
                    C6496s.g(build4, "build(...)");
                    c10.add(build4);
                }
                a10 = C6565s.a(c10);
            }
            List list = a10;
            String optString9 = nexusEvent.getEventData().optString("conversationId");
            C6496s.g(optString9, "optString(...)");
            String optString10 = nexusEvent.getEventData().optString("clientAssignedUuid");
            C6496s.g(optString10, "optString(...)");
            String optString11 = nexusEvent.getEventData().optString("partType");
            C6496s.g(optString11, "optString(...)");
            Object obj3 = nexusEvent.getEventData().get("tokenSequenceIndex");
            C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new ParsedNexusEvent.ConversationNexusEvent.FinStreaming(optString9, optString10, optString11, ((Integer) obj3).intValue(), list);
        }
    }

    public static final C5694f nexusEventAsFlow(NexusClient nexusClient) {
        C6496s.h(nexusClient, "nexusClient");
        return C5696h.e(new NexusEventAsFlowKt$nexusEventAsFlow$1(nexusClient, (C6658d<? super NexusEventAsFlowKt$nexusEventAsFlow$1>) null));
    }

    private static final Object safeGetOrDefault(EventData eventData, String str, Object obj) {
        Object orDefault = eventData.getOrDefault(str, obj);
        C6496s.e(orDefault);
        return orDefault;
    }
}
