package server_messages;

import java.io.Serializable;

/**
 * Class for send message to client from server
 */
public class ServerMessage implements Serializable {
    private final String message;
    private boolean endOfScriptExFlag;
    private boolean endOfClientFlag;
    private boolean isLoggedUSer;

    /**
     * Constructor for set String message
     * @param message to set it
     */
    public ServerMessage(String message) {
        this.message = message;
        this.endOfScriptExFlag = false;
    }

    /**
     * Method for set true End of script executing flag
     */
    public void setEndOfScriptExFlag() {
        endOfScriptExFlag = true;
    }

    /**
     * Method for get End of script executing flag
     * @return End of script executing flag
     */
    public boolean isEndOfScriptExFlag() {
        return endOfScriptExFlag;
    }

    public String getMessage() {
        return message;
    }

    public void setEndOfClientFlag() {
        this.endOfClientFlag = true;
    }

    public boolean isEndOfClientFlag() {
        return endOfClientFlag;
    }

    public void setLoggedUSer() {
        this.isLoggedUSer = true;
    }

    public boolean isLoggedUSer() {
        return isLoggedUSer;
    }
}
