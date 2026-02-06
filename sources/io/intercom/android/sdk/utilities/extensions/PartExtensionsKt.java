package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u001a\u0010\r\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u001a\u0010\u0011\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¨\u0006\u0012"}, d2 = {"nextPartFromSameParticipant", "", "Lio/intercom/android/sdk/models/Part;", "nextPart", "isTypingPart", "isAttributeCollector", "isLinkCard", "isQuickReplyOnly", "isSingleBlockPartOfType", "type", "Lio/intercom/android/sdk/blocks/lib/BlockType;", "shouldConcatenate", "part", "hasPreviousConcatPartNewStyle", "", "index", "", "hasNextConcatPartNewStyle", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PartExtensionsKt {
    public static final boolean hasNextConcatPartNewStyle(List<? extends Part> list, int i10) {
        C6496s.h(list, "<this>");
        if (i10 < 0 || i10 >= C6565s.p(list) || !shouldConcatenate((Part) list.get(i10), (Part) list.get(i10 + 1))) {
            return false;
        }
        return true;
    }

    public static final boolean hasPreviousConcatPartNewStyle(List<? extends Part> list, int i10) {
        C6496s.h(list, "<this>");
        if (1 > i10 || i10 > C6565s.p(list) || !shouldConcatenate((Part) list.get(i10 - 1), (Part) list.get(i10))) {
            return false;
        }
        return true;
    }

    public static final boolean isAttributeCollector(Part part) {
        C6496s.h(part, "<this>");
        if (part.getMessageStyle() != MessageStyle.ATTRIBUTE_COLLECTOR || part.getForm().getAttributes().isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean isLinkCard(Part part) {
        C6496s.h(part, "<this>");
        if (!isSingleBlockPartOfType(part, BlockType.LINK) || MessageStyle.CHAT != part.getMessageStyle()) {
            return false;
        }
        return true;
    }

    public static final boolean isQuickReplyOnly(Part part) {
        C6496s.h(part, "<this>");
        List<ReplyOption> replyOptions = part.getReplyOptions();
        C6496s.g(replyOptions, "getReplyOptions(...)");
        if (replyOptions.isEmpty() || !part.getBlocks().isEmpty()) {
            return false;
        }
        return true;
    }

    private static final boolean isSingleBlockPartOfType(Part part, BlockType blockType) {
        if (part.getBlocks().size() == 1 && part.getBlocks().get(0).getType() == blockType) {
            return true;
        }
        return false;
    }

    public static final boolean isTypingPart(Part part) {
        C6496s.h(part, "<this>");
        if (part.getMessageStyle() == MessageStyle.ADMIN_IS_TYPING_STYLE) {
            return true;
        }
        return false;
    }

    public static final boolean nextPartFromSameParticipant(Part part, Part part2) {
        C6496s.h(part, "<this>");
        C6496s.h(part2, "nextPart");
        return C6496s.c(part.getParticipantId(), part2.getParticipantId());
    }

    private static final boolean shouldConcatenate(Part part, Part part2) {
        MessageStyle messageStyle;
        MessageStyle messageStyle2;
        if (!nextPartFromSameParticipant(part, part2) || Math.abs(part2.getCreatedAt() - part.getCreatedAt()) >= TimeUnit.MINUTES.toSeconds(3) || isTypingPart(part) || isTypingPart(part2) || isLinkCard(part) || isLinkCard(part2) || part.isEvent().booleanValue() || part2.isEvent().booleanValue() || isAttributeCollector(part) || isAttributeCollector(part2) || isQuickReplyOnly(part) || isQuickReplyOnly(part2) || part.getMessageStyle() == (messageStyle = MessageStyle.POST) || part2.getMessageStyle() == messageStyle || part.getMessageStyle() == (messageStyle2 = MessageStyle.NOTE) || part2.getMessageStyle() == messageStyle2) {
            return false;
        }
        return true;
    }
}
