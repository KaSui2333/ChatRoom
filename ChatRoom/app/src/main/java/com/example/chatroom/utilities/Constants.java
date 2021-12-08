package com.example.chatroom.utilities;

import java.util.HashMap;

public class Constants {

    public static final String KEY_COLLECTION_USERS="users";
    public static final String KEY_NAME="name";
    public static final String KEY_EMAIL="email";
    public static final String KEY_PASSWORD="password";
    public static final String KEY_PREFERENCE_NAME="chatRoomPreference";
    public static final String KEY_IS_SIGN_IN="isSignIn";
    public static final String KEY_USER_ID="userId";
    public static final String KEY_IMAGE="image";

    public static final String KEY_FCM_TOKEN="fcmToken";

    public static final String KEY_USER="user";

    public static final String KEY_COLLECTION_CHAT="chat";
    public static final String KEY_SENDER_ID="senderId";
    public static final String KEY_RECEIVER_ID="receiverId";
    public static final String KEY_MESSAGE="message";
    public static final String KEY_TIMESTAMP="timestamp";

    public static final String KEY_COLLECTION_CONVERSATION="conversations";
    public static final String KEY_SENDER_NAME="senderName";
    public static final String KEY_RECEIVER_NAME="receiverName";
    public static final String KEY_SENDER_IMAGE="sendImage";
    public static final String KEY_RECEIVER_IMAGE="receiverImage";
    public static final String KEY_LAST_MESSAGE="lastMessage";

    public static final String KEY_AVAILABILITY = "availability";

    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeaders = null;
    public static HashMap<String, String> getRemoteMsgHeaders(){
        if(remoteMsgHeaders == null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAApJO_x_0:APA91bHskk4P0AWWAbWucsm6MmX7Qai_H44rTernAjW_Endp84KwGeiNoesAd-0HFuIlTzw1BR8lr92ifxu3XvCbw7QexKS9FUtN05V9kYwTsvC0EyzzktsmMX1njQFyduPOJAbe_yOV"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }
}
