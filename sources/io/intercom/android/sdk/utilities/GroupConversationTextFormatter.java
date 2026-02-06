package io.intercom.android.sdk.utilities;

import android.content.Context;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/utilities/GroupConversationTextFormatter;", "", "<init>", "()V", "groupConversationTitle", "", "firstName", "", "otherParticipants", "", "context", "Landroid/content/Context;", "groupConversationSubtitle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    public static final CharSequence groupConversationSubtitle(String str, int i10, Context context) {
        C6496s.h(str, "firstName");
        C6496s.h(context, "context");
        if (i10 == 1) {
            CharSequence format = Phrase.from(context, R.string.intercom_name_and_1_other).put("name", (CharSequence) str).format();
            C6496s.e(format);
            return format;
        } else if (i10 <= 1) {
            return str;
        } else {
            CharSequence format2 = Phrase.from(context, R.string.intercom_name_and_x_others).put("name", (CharSequence) str).put("count", i10).format();
            C6496s.e(format2);
            return format2;
        }
    }

    public static final CharSequence groupConversationTitle(String str, int i10, Context context) {
        C6496s.h(str, "firstName");
        C6496s.h(context, "context");
        if (i10 == 1) {
            return str + context.getString(R.string.intercom_group_conversation_1_other_participant_count_short);
        } else if (i10 <= 1) {
            return str;
        } else {
            return str + Phrase.from(context, R.string.intercom_group_conversation_multiple_other_participant_count_short).put("other_participant_count", i10).format();
        }
    }
}
