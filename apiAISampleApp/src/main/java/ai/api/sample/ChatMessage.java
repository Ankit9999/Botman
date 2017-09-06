package ai.api.sample;

import android.widget.ListView;

/**
 * Created by Ankit1 on 06-02-2017.
 */

public class ChatMessage {
    public boolean left;
    public String message;
    public boolean imageShow;

    public ChatMessage(boolean left, String message,boolean imageShow) {
        super();
        this.left = left;
        this.message = message;
        this.imageShow=imageShow;
    }
}
